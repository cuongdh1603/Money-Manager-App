/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Cuong
 */
public class ItemServices {
        public static List<Item> getAllItems(String username){
        List<Item> it = new ArrayList<>();
        String sql1 = "SELECT * FROM infor_user where username = ?";
        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement state1 = conn.prepareCall(sql1);
            state1.setString(1, username);
            ResultSet rs = state1.executeQuery();
            int id = 0;
            if(rs.next()){
                id = rs.getInt(1);
                String sql2 = "SELECT * FROM record"+String.valueOf(id)+" ";
                PreparedStatement state2 = conn.prepareStatement(sql2);
                rs = state2.executeQuery();
                while(rs.next()){
                    Item item = new Item();
                    item.getInputFromSQL(rs);
                    it.add(item);
                }
                state1.close();
                state2.close();
                conn.close();
                return it;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return it;
    }
        public static void addNewItem(User user,Item item){
        String sql = "insert into record"+String.valueOf(user.getId())+"(amount,type,category,timerecord,descript)\n" +
            "values\n" +
            "	(?, ?, ?, ?, ?)\n" +
            ";";
        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement state = conn.prepareStatement(sql);
            state.setLong(1, item.getAmount());
            state.setString(2, item.getType());
            state.setString(3, item.getCategory());
            state.setString(4, item.getTimeRecord());
            state.setString(5, item.getDescription());
            int rs = state.executeUpdate();
            System.out.println(rs);
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void updateItem(User user,Item item){
        String sql = "update record"+String.valueOf(user.getId())+"\n" +
            "set amount = ?,type = ?,category = ?,timerecord = ?,descript = ?\n" +
            "where id = ?";
        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement state = conn.prepareStatement(sql);
            state.setLong(1, item.getAmount());
            state.setString(2, item.getType());
            state.setString(3, item.getCategory());
            state.setString(4, item.getTimeRecord());
            state.setString(5, item.getDescription());
            state.setInt(6, item.getId());
            int rs = state.executeUpdate();
            System.out.println(rs);
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static Item getInforItem(User user,int id){
        Item item = new Item();
        String sql = "select * from record"+String.valueOf(user.getId())+" where id = "+String.valueOf(id);
        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement state = conn.prepareStatement(sql);
            
            ResultSet rs = state.executeQuery();
            if(rs.next()){
               item.getInputFromSQL(rs);
               return item;
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return item;
    }
    public static void deleteItem(User user,int id){
        String sql = "delete from record"+String.valueOf(user.getId())+" where id = "+String.valueOf(id);
        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement state = conn.prepareStatement(sql);
            int rs = state.executeUpdate();
            System.out.println(rs);
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
