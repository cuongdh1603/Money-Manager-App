/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Cuong
 */
public class Item {
    private int id;
    private long amount;
    private String type;
    private String category;
    private String timeRecord;
    private String description;
    public Item() {
    }

    public Item(long amount, String type, String category, String timeRecord, String description) {
        this.amount = amount;
        this.type = type;
        this.category = category;
        this.timeRecord = timeRecord;
        this.description = description;
    }
    
    public Item(int id, long amount, String type, String category, String timeRecord, String description) {
        this.id = id;
        this.amount = amount;
        this.type = type;
        this.category = category;
        this.timeRecord = timeRecord;
        this.description = description;
    }
    public static String convertFormatDate(String s){
        String pattern1 = "yyyy-MM-dd";
        String pattern2 = "dd/MM/yyyy";
        SimpleDateFormat dateFormat1 = new SimpleDateFormat(pattern1);
        SimpleDateFormat dateFormat2 = new SimpleDateFormat(pattern2);
        Date date;
        try {
            date = dateFormat1.parse(s);
            return dateFormat2.format(date);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public void getInputFromSQL(ResultSet rs){
        try {
            this.id = rs.getInt(1);
            this.amount = rs.getLong(2);
            this.type = rs.getString(3);
            this.category = rs.getString(4);
            this.timeRecord = convertFormatDate(rs.getString(5));
            this.description = rs.getString(6);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCtegory(String category) {
        this.category = category;
    }

    public String getTimeRecord() {
        return timeRecord;
    }

    public void setTimeRecord(String timeRecord) {
        this.timeRecord = timeRecord;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
