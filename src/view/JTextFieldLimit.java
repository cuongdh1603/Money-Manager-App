/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Cuong
 */
public class JTextFieldLimit extends PlainDocument{
    private int limit;
    public JTextFieldLimit(int limit) {
        super();
        this.limit = limit;
    }
    public JTextFieldLimit(int limit, boolean upper) {
        super();
        this.limit = limit;
    }
    public void insertString(int offset,String str,AttributeSet attr){
        if(str == null) return;
        if(getLength() + str.length() <= limit){
            try {
                super.insertString(offset, str, attr);
            } catch (BadLocationException ex) {
                ex.printStackTrace();
            }
        }
    }
    
}
