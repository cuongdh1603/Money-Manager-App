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
public class RegisterForm extends javax.swing.JFrame {
    UserServices services = new UserServices();
    String filepath;
    public RegisterForm() {
        initComponents();
        this.setIconImage(new ImageIcon("C:\\Users\\Cuong\\Documents\\NetBeansProjects\\FAMILY_FINANCE_APP\\src\\images\\money.PNG").getImage());
        filepath = "";
        FirstNameTF.setDocument(new JTextFieldLimit(20));
        LastNameTF.setDocument(new JTextFieldLimit(20));
        UsernameTF.setDocument(new JTextFieldLimit(20));
        PasswordTF.setDocument(new JTextFieldLimit(20));
        RePasswordTF.setDocument(new JTextFieldLimit(20));
        AddressTextArea.setDocument(new JTextFieldLimit(50));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        FirstNameTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        LastNameTF = new javax.swing.JTextField();
        UsernameTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PasswordTF = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        RePasswordTF = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        DateOfBithChooser = new com.toedter.calendar.JDateChooser();
        CreateButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AddressTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        MaleRadioButton = new javax.swing.JRadioButton();
        FemaleRadioButton = new javax.swing.JRadioButton();
        Discardmage = new javax.swing.JButton();
        DisplayFileImage = new javax.swing.JLabel();
        ReturnButton = new javax.swing.JButton();
        UploadImage = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(184, 134, 11));
        jPanel1.setPreferredSize(new java.awt.Dimension(1170, 840));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 290, 67));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("First name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 126, -1, -1));

        FirstNameTF.setBackground(new java.awt.Color(238, 232, 170));
        FirstNameTF.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jPanel1.add(FirstNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 118, 398, 40));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Last name:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 184, -1, -1));

        LastNameTF.setBackground(new java.awt.Color(238, 232, 170));
        LastNameTF.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jPanel1.add(LastNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 176, 398, 40));

        UsernameTF.setBackground(new java.awt.Color(238, 232, 170));
        UsernameTF.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jPanel1.add(UsernameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 240, 398, 40));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Username:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 248, -1, -1));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Password:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        PasswordTF.setBackground(new java.awt.Color(238, 232, 170));
        PasswordTF.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jPanel1.add(PasswordTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 401, -1));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Retype password:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        RePasswordTF.setBackground(new java.awt.Color(238, 232, 170));
        RePasswordTF.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jPanel1.add(RePasswordTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 401, -1));

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Date of birth:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 130, 30));

        DateOfBithChooser.setDateFormatString("dd/MM/yyyy\n");
        DateOfBithChooser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(DateOfBithChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 401, 41));

        CreateButton.setBackground(new java.awt.Color(189, 183, 107));
        CreateButton.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        CreateButton.setText("Create");
        CreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CreateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 600, 122, 63));

        CancelButton.setBackground(new java.awt.Color(255, 69, 0));
        CancelButton.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 600, 122, 63));

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Address:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 97, 30));

        AddressTextArea.setBackground(new java.awt.Color(238, 232, 170));
        AddressTextArea.setColumns(20);
        AddressTextArea.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        AddressTextArea.setForeground(new java.awt.Color(0, 0, 0));
        AddressTextArea.setRows(5);
        jScrollPane1.setViewportView(AddressTextArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 468, -1, 100));

        jLabel2.setFont(new java.awt.Font("sansserif", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("(*) Click Create button to register");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 670, 305, -1));

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Gender:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 97, 30));

        buttonGroup1.add(MaleRadioButton);
        MaleRadioButton.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        MaleRadioButton.setSelected(true);
        MaleRadioButton.setText("Male");
        jPanel1.add(MaleRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, -1, -1));

        buttonGroup1.add(FemaleRadioButton);
        FemaleRadioButton.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        FemaleRadioButton.setText("Female");
        jPanel1.add(FemaleRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 530, -1, -1));

        Discardmage.setBackground(new java.awt.Color(255, 102, 102));
        Discardmage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Discardmage.setText("Discard");
        Discardmage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiscardmageActionPerformed(evt);
            }
        });
        jPanel1.add(Discardmage, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 410, 140, -1));

        DisplayFileImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel1.add(DisplayFileImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, 300, 260));

        ReturnButton.setBackground(new java.awt.Color(255, 69, 0));
        ReturnButton.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        ReturnButton.setText("Return");
        ReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ReturnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 600, 122, 63));

        UploadImage.setBackground(new java.awt.Color(255, 102, 102));
        UploadImage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UploadImage.setText("Upload");
        UploadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadImageActionPerformed(evt);
            }
        });
        jPanel1.add(UploadImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, 140, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 2, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jLabel11.setText("Select your image with size (300,260) to get perfect");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
    public static void refreshAllItems(){
        FirstNameTF.setText("");
        LastNameTF.setText("");
        UsernameTF.setText("");
        PasswordTF.setText("");
        RePasswordTF.setText("");
        DateOfBithChooser.setDate(null);
        AddressTextArea.setText("");
    }
    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonActionPerformed
        if(FirstNameTF.getText().equals("")||LastNameTF.getText().equals("")||UsernameTF.getText().equals("")
                ||PasswordTF.getText().equals("")||RePasswordTF.getText().equals("")
                ||((JTextField)DateOfBithChooser.getDateEditor().getUiComponent()).getText().equals("")
                ||AddressTextArea.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Fill all field!!!", "", JOptionPane.ERROR_MESSAGE);
        else if(!PasswordTF.getText().trim().equals(RePasswordTF.getText().trim()))
            JOptionPane.showMessageDialog(null, "You retype wrong password!");
        else if(!services.checkUsername(UsernameTF.getText().trim())){
            JOptionPane.showMessageDialog(null, "This username was used by another account. Please give another name");
        }
        else{
            User user = new User();
            user.setFirstName(FirstNameTF.getText().trim());
            user.setLastName(LastNameTF.getText().trim());
            user.setUsername(UsernameTF.getText().trim());
            user.setDateOfBirth(convertFormatDate(((JTextField)DateOfBithChooser.getDateEditor().getUiComponent()).getText()));
            user.setPassword(PasswordTF.getText().trim());
            if(MaleRadioButton.isSelected()) user.setGender(true);
            else user.setGender(false);
            user.setAddress(AddressTextArea.getText().trim());
            if(!filepath.equals("")) user.setFilePath(filepath);
            try {
                services.addNewUser(user);
                JOptionPane.showMessageDialog(null,"Add new successfully");
                refreshAllItems();
            } catch (SQLIntegrityConstraintViolationException ex) {
                JOptionPane.showMessageDialog(null,"This username has already in system","Error",JOptionPane.ERROR_MESSAGE);
            } catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_CreateButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        FirstNameTF.setText("");
        LastNameTF.setText("");
        UsernameTF.setText("");
        PasswordTF.setText("");
        RePasswordTF.setText("");
        DateOfBithChooser.setCalendar(null);
        MaleRadioButton.setSelected(true);
        AddressTextArea.setText("");
        if(!filepath.equals("")){
            DisplayFileImage.setIcon(null);
            DisplayFileImage.validate();
            filepath = "";
        }
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void DiscardmageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiscardmageActionPerformed
        if(!filepath.equals("")){
            DisplayFileImage.setIcon(null);
            DisplayFileImage.validate();
            filepath = "";
        }
    }//GEN-LAST:event_DiscardmageActionPerformed

    private void ReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnButtonActionPerformed
        new SignUp().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReturnButtonActionPerformed

    private void UploadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadImageActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("picture","jpg","JPG","png","PNG");
        chooser.setFileFilter(imageFilter);
        chooser.setMultiSelectionEnabled(false);
        int x = chooser.showDialog(this, "Select an image");
        if(x == JFileChooser.APPROVE_OPTION){
            File f = chooser.getSelectedFile();
            filepath = f.getAbsolutePath();
            DisplayFileImage.setIcon(new ImageIcon(new ImageIcon(filepath).getImage().
                    getScaledInstance(DisplayFileImage.getWidth(), DisplayFileImage.getHeight(), Image.SCALE_DEFAULT)));
        }
    }//GEN-LAST:event_UploadImageActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextArea AddressTextArea;
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton CreateButton;
    private static com.toedter.calendar.JDateChooser DateOfBithChooser;
    private javax.swing.JButton Discardmage;
    private javax.swing.JLabel DisplayFileImage;
    private static javax.swing.JRadioButton FemaleRadioButton;
    private static javax.swing.JTextField FirstNameTF;
    private static javax.swing.JTextField LastNameTF;
    private static javax.swing.JRadioButton MaleRadioButton;
    private static javax.swing.JPasswordField PasswordTF;
    private static javax.swing.JPasswordField RePasswordTF;
    private javax.swing.JButton ReturnButton;
    private javax.swing.JButton UploadImage;
    private static javax.swing.JTextField UsernameTF;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
