package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author Cuong
 */
public class UserServices {
    public static String convertToDate(String s){
        String pattern1 = "dd/MM/yyyy";
        String pattern2 = "yyyyMMdd";
        String rs = null;
        SimpleDateFormat dateFormat1 = new SimpleDateFormat(pattern1);
        SimpleDateFormat dateFormat2 = new SimpleDateFormat(pattern2);
        try {
            Date d = dateFormat1.parse(s);
            rs = dateFormat2.format(d);
            return rs;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return rs;
    }
    public static void addNewUser(User user) throws SQLException{
            Connection conn = JDBCConnection.getJDBCConnection();
            String sql1 = "insert into infor_user(lastname,firstname,username,password,"
                    + "dateOfBirth,gender,address,filepath)  values(?, ?, ?, ?, ?, ?, ?, ?)";
            String sql2 = "select * from infor_user where username = ?";
            PreparedStatement state1 = conn.prepareStatement(sql1);
            state1.setString(1, user.getFirstName());
            state1.setString(2, user.getLastName());
            state1.setString(3, user.getUsername());
            state1.setString(4, user.getPassword());
            state1.setString(5, user.getDateOfBirth());
            state1.setBoolean(6, user.isGender());
            state1.setString(7, user.getAddress());
            if(user.getFilePath()!="") state1.setString(8, user.getFilePath());
            state1.executeUpdate();
            PreparedStatement state2 = conn.prepareStatement(sql2);
            state2.setString(1, user.getUsername());
            ResultSet rs = state2.executeQuery();
            int id = 0;
            if(rs.next())
                id = rs.getInt(1);
            String sql3 = "create table record"+String.valueOf(id)+" (\n" +
                "	id int primary key auto_increment,\n" +
                "	amount long,\n" +
                "       type enum('expenses','incomes'),\n" +
                "       category varchar(20),\n" +
                "       timerecord date,\n" +
                "       descript varchar(100)\n" +
                ")";
            Statement state3 = conn.createStatement();
            state3.execute(sql3);
            state1.close();
            state2.close();
            state3.close();
            conn.close();
    }
    public static boolean checkUsername(String username){
        boolean check = true;
        String sql = "select * from infor_user where username = ?";
        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement state = conn.prepareStatement(sql);
            state.setString(1, username);
            ResultSet rs = state.executeQuery();
            if(rs.next()){
                return false;
            }
//            else{
//                JOptionPane.showMessageDialog(null, "Username or password is incorrect!");
//            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return check;
    }
    public static boolean checkUserAccount(String username,String password){
        boolean check = false;
        String sql = "select * from infor_user where username = ? and password = ?";
        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement state = conn.prepareStatement(sql);
            state.setString(1, username);
            state.setString(2, password);
            ResultSet rs = state.executeQuery();
            if(rs.next()){
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Username or password is incorrect!");
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return check;
    }

    public static User getInforUser(String username){
        User u = new User();
        String sql = "select * from infor_user where username = ?";
        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement state = conn.prepareStatement(sql);
            state.setString(1, username);
            ResultSet rs = state.executeQuery();
            if(rs.next()){
                u = new User(rs.getInt(1),rs.getString(4),rs.getString(5),rs.getString(3),rs.getString(2)
                ,rs.getString(6),rs.getBoolean(7),rs.getString(8),rs.getString(9));
                return u;
            }
            else{
                JOptionPane.showMessageDialog(null, "Username or password is incorrect!");
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return u;
    }
    public static void changeInforUser(User user,User user1) throws SQLException{
        User u = getInforUser(user.getUsername());
        String sql = "update infor_user " +
        " set lastname = ?,firstname = ?,username = ?,dateOfBirth = ?,gender = ?,"
                + "address = ?,filepath = ?" +
        " where id  = "+String.valueOf(u.getId());
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement state = conn.prepareStatement(sql);
            state.setString(1, user1.getLastName());
            state.setString(2, user1.getFirstName());
            state.setString(3, user1.getUsername());
            state.setString(4, user1.getDateOfBirth());
            if(u.isGender()) state.setBoolean(5, true);
            else state.setBoolean(5, false);
            state.setString(6, user1.getAddress());
            state.setString(7, user1.getFilePath());
            int rs = state.executeUpdate();
            System.out.println(rs);
            state.close();
            conn.close();
    }
    public static void changePasswordUser(User user,String newPassword){
        User u = getInforUser(user.getUsername());
        String sql = "update infor_user " +
        " set password = ? "+
        " where id  = "+String.valueOf(u.getId());
        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement state = conn.prepareStatement(sql);
            state.setString(1, newPassword);
            int rs = state.executeUpdate();
            System.out.println(rs);
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
