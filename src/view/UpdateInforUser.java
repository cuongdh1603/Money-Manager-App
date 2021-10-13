/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import java.awt.Image;
import java.io.File;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.User;
import model.UserServices;
/**
 *
 * @author Cuong
 */
public class UpdateInforUser extends javax.swing.JFrame {
    UserServices services;
    User u;
    static String filepath = null;
    public UpdateInforUser() {
        initComponents();
    }
    public UpdateInforUser(User user) {
        initComponents();
        this.setIconImage(new ImageIcon("C:\\Users\\Cuong\\Documents\\NetBeansProjects\\FAMILY_FINANCE_APP\\src\\images\\money.PNG").getImage());
        services = new UserServices();
        u = services.getInforUser(user.getUsername());
        //this.username = user.getUsername();
        if(u.getFilePath()!=null){
            filepath = u.getFilePath();
            DisplayImageUser.setIcon(new ImageIcon(new ImageIcon(filepath).getImage().
            getScaledInstance(DisplayImageUser.getWidth(), DisplayImageUser.getHeight(), Image.SCALE_DEFAULT)));
        } 
        FirstNameTF.setDocument(new JTextFieldLimit(20));
        LastNameTF.setDocument(new JTextFieldLimit(20));
        UsernameTF.setDocument(new JTextFieldLimit(20));
        AddressTextArea.setDocument(new JTextFieldLimit(100));
        FirstNameTF.setText(u.getFirstName());
        LastNameTF.setText(u.getLastName());
        UsernameTF.setText(u.getUsername());
        DateChooser.setDate(convertToDate(u.getDateOfBirth()));
        if(u.isGender()) MaleRadioButton.setSelected(true);
        else FemaleRadioButton.setSelected(true);
        this.setLocationRelativeTo(null);
        AddressTextArea.setText(u.getAddress());
    } 
    public static Date convertToDate(String s){
        String pattern1 = "yyyy-MM-dd";
        //String pattern2 = "dd/MM/yyyy";
        Date d = null;
        SimpleDateFormat dateFormat1 = new SimpleDateFormat(pattern1);
        //SimpleDateFormat dateFormat2 = new SimpleDateFormat(pattern2);
        try {
            d = dateFormat1.parse(s);
            
            return d;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return d;
    }
    public static String convertFormatDate(String s){
        String pattern1 = "dd/MM/yyyy";
        String pattern2 = "yyyyMMdd";
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        UpdateButton = new javax.swing.JButton();
        ReturnButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        DateChooser = new com.toedter.calendar.JDateChooser();
        LastNameTF = new javax.swing.JTextField();
        UsernameTF = new javax.swing.JTextField();
        FirstNameTF = new javax.swing.JTextField();
        MaleRadioButton = new javax.swing.JRadioButton();
        FemaleRadioButton = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AddressTextArea = new javax.swing.JTextArea();
        ResetPasswordButton = new javax.swing.JButton();
        DisplayImageUser = new javax.swing.JLabel();
        UploadButton = new javax.swing.JButton();
        RefreshButton = new javax.swing.JButton();
        DiscardButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UpdateButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 161, 53));

        ReturnButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ReturnButton.setText("Return");
        ReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ReturnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 540, 161, 53));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Information User");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 16, 516, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("First name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 94, 101, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Last name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 101, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Username:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 101, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Date of birth:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Address:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Gender:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 100, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 54, 510, 22));

        DateChooser.setDateFormatString("dd/MM/yyyy");
        DateChooser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(DateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 293, 40));

        LastNameTF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(LastNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 293, -1));

        UsernameTF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(UsernameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 293, -1));

        FirstNameTF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(FirstNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 293, -1));

        buttonGroup1.add(MaleRadioButton);
        MaleRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MaleRadioButton.setForeground(new java.awt.Color(0, 0, 0));
        MaleRadioButton.setText("Male");
        jPanel1.add(MaleRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, -1, -1));

        buttonGroup1.add(FemaleRadioButton);
        FemaleRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        FemaleRadioButton.setForeground(new java.awt.Color(0, 0, 0));
        FemaleRadioButton.setText("Female");
        jPanel1.add(FemaleRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));

        AddressTextArea.setColumns(20);
        AddressTextArea.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddressTextArea.setRows(5);
        jScrollPane1.setViewportView(AddressTextArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 290, 100));

        ResetPasswordButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ResetPasswordButton.setText("Reset password");
        ResetPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetPasswordButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ResetPasswordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, 190, 50));

        DisplayImageUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(DisplayImageUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 290, 250));

        UploadButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UploadButton.setText("Change photo");
        UploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadButtonActionPerformed(evt);
            }
        });
        jPanel1.add(UploadButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 160, 40));

        RefreshButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RefreshButton.setText("Refresh");
        RefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshButtonActionPerformed(evt);
            }
        });
        jPanel1.add(RefreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, 161, 53));

        DiscardButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DiscardButton.setText("Discard");
        DiscardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiscardButtonActionPerformed(evt);
            }
        });
        jPanel1.add(DiscardButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 370, 160, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 993, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_ReturnButtonActionPerformed

    private void ResetPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetPasswordButtonActionPerformed
        new ResetPasswordUser(this, true, u).setVisible(true);
    }//GEN-LAST:event_ResetPasswordButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        if(FirstNameTF.getText().equals("")||LastNameTF.getText().equals("")||UsernameTF.getText().equals("")
                ||((JTextField)DateChooser.getDateEditor().getUiComponent()).getText().equals("")
                ||AddressTextArea.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Fill all field!!!", "", JOptionPane.ERROR_MESSAGE);
        else{
            User u1 = new User();
            u1.setFirstName(FirstNameTF.getText());
            u1.setLastName(LastNameTF.getText());
            u1.setUsername(UsernameTF.getText());
            //Date d = DateOfBithChooser.getDate();
            u1.setDateOfBirth(convertFormatDate(((JTextField)DateChooser.getDateEditor().getUiComponent()).getText()));
            if(MaleRadioButton.isSelected()) u1.setGender(true);
            else u1.setGender(false);
            u1.setAddress(AddressTextArea.getText());
            u1.setFilePath(filepath);
            try {
                services.changeInforUser(u,u1);
                JOptionPane.showMessageDialog(null,"Update successfully");
            } catch (SQLIntegrityConstraintViolationException ex) {
                JOptionPane.showMessageDialog(null,"This username has already in system","Error",JOptionPane.ERROR_MESSAGE);
            } catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void UploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadButtonActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("picture","jpg","JPG","png","PNG");
        chooser.setFileFilter(imageFilter);
        chooser.setMultiSelectionEnabled(false);
        int x = chooser.showDialog(this, "Select an image");
        if(x == JFileChooser.APPROVE_OPTION){
            File f = chooser.getSelectedFile();
            filepath = f.getAbsolutePath();
            DisplayImageUser.setIcon(new ImageIcon(new ImageIcon(filepath).getImage().
                    getScaledInstance(DisplayImageUser.getWidth(), DisplayImageUser.getHeight(), Image.SCALE_DEFAULT)));
        }
    }//GEN-LAST:event_UploadButtonActionPerformed

    private void DiscardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiscardButtonActionPerformed
        filepath = null;
        DisplayImageUser.setIcon(null);
        DisplayImageUser.validate();
    }//GEN-LAST:event_DiscardButtonActionPerformed

    private void RefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshButtonActionPerformed
        FirstNameTF.setText(u.getFirstName());
        LastNameTF.setText(u.getLastName());
        UsernameTF.setText(u.getUsername());
        DateChooser.setDate(convertStringToDate(u.getDateOfBirth()));
        if(u.isGender()) MaleRadioButton.setSelected(true);
        else FemaleRadioButton.setSelected(true);
        AddressTextArea.setText(u.getAddress());
    }//GEN-LAST:event_RefreshButtonActionPerformed
    public static Date convertStringToDate(String d){
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        Date date = null;
        try {
            date = dateFormat.parse(d);
            return date;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return date;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextArea AddressTextArea;
    private static com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JButton DiscardButton;
    private javax.swing.JLabel DisplayImageUser;
    private javax.swing.JRadioButton FemaleRadioButton;
    private static javax.swing.JTextField FirstNameTF;
    private static javax.swing.JTextField LastNameTF;
    private static javax.swing.JRadioButton MaleRadioButton;
    private javax.swing.JButton RefreshButton;
    private javax.swing.JButton ResetPasswordButton;
    private javax.swing.JButton ReturnButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JButton UploadButton;
    private static javax.swing.JTextField UsernameTF;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
