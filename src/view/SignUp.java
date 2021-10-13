package view;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.User;
import model.UserServices;

/**
 *
 * @author Cuong
 */
public class SignUp extends javax.swing.JFrame {
    UserServices services = new UserServices();
    public SignUp() {
        initComponents();
        this.setTitle("MONEY MANAGER");
        this.setIconImage(new ImageIcon("C:\\Users\\Cuong\\Documents\\NetBeansProjects\\FAMILY_FINANCE_APP\\src\\images\\money.PNG").getImage());
        UsernameTextField.setDocument(new JTextFieldLimit(20));
        //PasswordTextField.setDocument(new JTextFieldLimit(20));
        checkPass.setVisible(false);
        PasswordTextField.addKeyListener(new KeyAdapter(){
            
            @Override
            public void keyTyped(KeyEvent e) {
                checkPass.setVisible(false);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                checkPass.setVisible(true);
                if(PasswordTextField.getText().trim().equals("")) checkPass.setVisible(false);
            }
            
        });
        
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        UsernameTextField = new javax.swing.JTextField();
        PasswordTextField = new javax.swing.JPasswordField();
        LogInButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        checkPass = new javax.swing.JCheckBox();
        RegisterJLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login Form");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 35, 372, -1));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Password:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 223, 106, 36));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Username:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 154, 106, 36));

        UsernameTextField.setBackground(new java.awt.Color(238, 232, 170));
        UsernameTextField.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        UsernameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsernameTextFieldFocusLost(evt);
            }
        });
        jPanel2.add(UsernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 151, 395, 38));

        PasswordTextField.setBackground(new java.awt.Color(238, 232, 170));
        PasswordTextField.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        PasswordTextField.setForeground(new java.awt.Color(204, 204, 204));
        PasswordTextField.setText("password");
        PasswordTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordTextFieldFocusLost(evt);
            }
        });
        PasswordTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PasswordTextFieldKeyTyped(evt);
            }
        });
        jPanel2.add(PasswordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 219, 395, 39));

        LogInButton.setBackground(new java.awt.Color(184, 134, 11));
        LogInButton.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        LogInButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        LogInButton.setText("Log in");
        LogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButtonActionPerformed(evt);
            }
        });
        jPanel2.add(LogInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 322, 165, 63));

        CancelButton.setBackground(new java.awt.Color(255, 69, 0));
        CancelButton.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        CancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        jPanel2.add(CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 322, 179, 63));

        checkPass.setBackground(new java.awt.Color(255, 255, 153));
        checkPass.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        checkPass.setForeground(new java.awt.Color(255, 0, 0));
        checkPass.setText("Show password");
        checkPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPassActionPerformed(evt);
            }
        });
        jPanel2.add(checkPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 266, -1, -1));

        RegisterJLabel.setFont(new java.awt.Font("sansserif", 3, 18)); // NOI18N
        RegisterJLabel.setForeground(new java.awt.Color(204, 0, 0));
        RegisterJLabel.setText("(*) If you do not already have an account. Click here to register");
        RegisterJLabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                RegisterJLabelAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        RegisterJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterJLabelMouseClicked(evt);
            }
        });
        jPanel2.add(RegisterJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 433, 550, 32));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/username.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 152, -1, 51));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/password.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 219, -1, 51));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 0, 610, 490));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Capture.PNG"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 133, 220, 210));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cuong\\Documents\\NetBeansProjects\\FAMILY_FINANCE_APP\\src\\images\\money1.png")); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterJLabelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_RegisterJLabelAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterJLabelAncestorAdded

    private void RegisterJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterJLabelMouseClicked
        RegisterForm registerForm = new RegisterForm();
        registerForm.setVisible(true);
        registerForm.pack();
        registerForm.setLocationRelativeTo(null);
        registerForm.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_RegisterJLabelMouseClicked

    private void LogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButtonActionPerformed
        if(UsernameTextField.getText().equals("")||PasswordTextField.getText().equalsIgnoreCase("password")
                ||PasswordTextField.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(null, "Please fill in the full information");
        else if(services.checkUserAccount(UsernameTextField.getText().trim(), PasswordTextField.getText().trim())){
            User u = services.getInforUser(UsernameTextField.getText().trim());
            new MainForm(u).setVisible(true);
            this.dispose();
        };
    }//GEN-LAST:event_LogInButtonActionPerformed

    private void UsernameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameTextFieldFocusLost
        
        if(UsernameTextField.getText().trim().equals("")||UsernameTextField.getText().trim().equals("username")){
            UsernameTextField.setText("username");
            UsernameTextField.setForeground(new Color(153,153,153));
        }
        UsernameTextField.setBorder(null);
    }//GEN-LAST:event_UsernameTextFieldFocusLost

    private void UsernameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameTextFieldFocusGained
        if(UsernameTextField.getText().equals("username")){
            UsernameTextField.setText("");
            UsernameTextField.setForeground(Color.black);
        }
    }//GEN-LAST:event_UsernameTextFieldFocusGained

    private void PasswordTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordTextFieldFocusGained
        String pass = String.valueOf(PasswordTextField.getPassword());
        if(PasswordTextField.getText().equals("password")){
            PasswordTextField.setText("");
            PasswordTextField.setForeground(Color.black);
        }
    }//GEN-LAST:event_PasswordTextFieldFocusGained

    private void PasswordTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordTextFieldFocusLost
        String pass = String.valueOf(PasswordTextField.getPassword());
        
        if(pass.trim().equals("")||pass.trim().equals("password")){
            PasswordTextField.setText("password");
            PasswordTextField.setForeground(new Color(153,153,153));
        }
        PasswordTextField.setBorder(null);
    }//GEN-LAST:event_PasswordTextFieldFocusLost

    private void checkPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPassActionPerformed
        if(checkPass.isSelected()){
            PasswordTextField.setEchoChar((char)0);
        }
        else{
            PasswordTextField.setEchoChar((char)'*');
        }
    }//GEN-LAST:event_checkPassActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void PasswordTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordTextFieldKeyTyped
        char c = evt.getKeyChar();
        if(c == KeyEvent.VK_SPACE) evt.consume();
    }//GEN-LAST:event_PasswordTextFieldKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton LogInButton;
    private javax.swing.JPasswordField PasswordTextField;
    private javax.swing.JLabel RegisterJLabel;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JCheckBox checkPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
