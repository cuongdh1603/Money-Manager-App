package view;
import com.sun.javafx.iio.ImageStorage;
import java.awt.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import model.Item;
import model.ItemServices;
import model.User;
import model.UserServices;
/**
 *
 * @author Cuong
 */
public class MainForm extends javax.swing.JFrame {
    DefaultTableModel defaultTableModel;
    UserServices services;
    ItemServices itserServices;
    String username;
    User user;
    long expenses,incomes,remain;
    int currentMonth,currentYear;
    public MainForm() {
        initComponents();
        usernameLabel.setEnabled(true);
    }
    public MainForm(User u) {
        initComponents();
        this.setTitle("MONEY MANAGER");
        this.setIconImage(new ImageIcon("C:\\Users\\Cuong\\Documents\\NetBeansProjects\\FAMILY_FINANCE_APP\\src\\images\\money.PNG").getImage());
        //Set user
        user = u;
        services = new UserServices();
        itserServices = new ItemServices();
        usernameLabel.setText(u.getUsername());
        //usernameLabel.setEnabled(true);
        if(u.getFilePath()!=null) ImageUserLabel.setIcon(new ImageIcon(new ImageIcon(u.getFilePath()).getImage().
                    getScaledInstance(ImageUserLabel.getWidth(), ImageUserLabel.getHeight(), Image.SCALE_DEFAULT)));
        Date date = new Date();
        currentMonth = date.getMonth();
        currentYear = date.getYear()+1900;
        //Download data to table
        defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; 
            }
        };
        TableMainForm.setModel(defaultTableModel);
        defaultTableModel.addColumn("STT");
        defaultTableModel.addColumn("Amount");
        defaultTableModel.addColumn("Type");
        defaultTableModel.addColumn("Category");
        defaultTableModel.addColumn("Date");
        defaultTableModel.addColumn("Note");
        TableMainForm.getColumnModel().getColumn(0).setPreferredWidth(1);
        setData(itserServices.getAllItems(user.getUsername()),currentMonth,currentYear);
        //Set time display
        //LocalDate date = LocalDate.now();
        DisplayCurrentTimeLabel.setText((currentMonth+1)+"/"+currentYear);
        this.setLocationRelativeTo(null);
    }
   public void setData(List<Item> list,int month,int year){
        expenses = 0;
        incomes = 0;
        remain = 0;
        for (Item i : list) {
            if(getMonthFromString(i.getTimeRecord())==month&&getYearFromString(i.getTimeRecord())==year){
                defaultTableModel.addRow(new Object[]{i.getId(),i.getAmount(),i.getType(),i.getCategory(),
                i.getTimeRecord(),i.getDescription()});
                if(i.getType().equalsIgnoreCase("expenses")) expenses += i.getAmount();
                else if(i.getType().equalsIgnoreCase("incomes")) incomes += i.getAmount(); 
            }
        }
        ExpensesLabel.setText(String.valueOf(expenses));
        IncomesLabel.setText(String.valueOf(incomes));
        RemainLabel.setText(String.valueOf(incomes-expenses));
    }
   public static int getMonthFromString(String s){
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        int month = 0;
        try {
            Date date = dateFormat.parse(s);
            month = date.getMonth();
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return month;
    }
    public static int getYearFromString(String s){
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        int year = 0;
        try {
            Date date = dateFormat.parse(s);
            year = date.getYear()+1900;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return year;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        UpdateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        OtherServiceButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        ChangeInforButton = new javax.swing.JButton();
        usernameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ImageUserLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableMainForm = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        IncomesLabel = new javax.swing.JLabel();
        ExpensesLabel = new javax.swing.JLabel();
        Label7 = new javax.swing.JLabel();
        RemainLabel = new javax.swing.JLabel();
        DisplayCurrentTimeLabel = new javax.swing.JLabel();
        RefreshButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 102, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UpdateButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        jPanel2.add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 280, 47));

        DeleteButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        jPanel2.add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 280, 47));

        OtherServiceButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        OtherServiceButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/other.png"))); // NOI18N
        OtherServiceButton.setText("Other services");
        OtherServiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtherServiceButtonActionPerformed(evt);
            }
        });
        jPanel2.add(OtherServiceButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 280, 47));

        LogoutButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LogoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/log_out.png"))); // NOI18N
        LogoutButton.setText("Log out");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        jPanel2.add(LogoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 280, 47));

        AddButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_new.png"))); // NOI18N
        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        jPanel2.add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 280, 47));

        ChangeInforButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ChangeInforButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change.png"))); // NOI18N
        ChangeInforButton.setText("Change information");
        ChangeInforButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeInforButtonActionPerformed(evt);
            }
        });
        jPanel2.add(ChangeInforButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 280, 47));

        usernameLabel.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameLabel.setText("username");
        jPanel2.add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, 30));

        ImageUserLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel2.add(ImageUserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 200, 180));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        jPanel3.setBackground(new java.awt.Color(255, 255, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableMainForm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TableMainForm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableMainForm.setRowHeight(30);
        jScrollPane1.setViewportView(TableMainForm);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 658, 330));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Expenses");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 142, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Incomes");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 127, -1));

        IncomesLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        IncomesLabel.setForeground(new java.awt.Color(0, 0, 0));
        IncomesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IncomesLabel.setText("0");
        jPanel3.add(IncomesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 31, 165, 49));

        ExpensesLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ExpensesLabel.setForeground(new java.awt.Color(0, 0, 0));
        ExpensesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExpensesLabel.setText("0");
        jPanel3.add(ExpensesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 31, 165, 49));

        Label7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Label7.setForeground(new java.awt.Color(0, 0, 0));
        Label7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label7.setText("Remain");
        jPanel3.add(Label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 110, -1));

        RemainLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        RemainLabel.setForeground(new java.awt.Color(0, 0, 0));
        RemainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RemainLabel.setText("0");
        jPanel3.add(RemainLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 240, 40));

        DisplayCurrentTimeLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DisplayCurrentTimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(DisplayCurrentTimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 150, 30));

        RefreshButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RefreshButton.setText("Refresh");
        RefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshButtonActionPerformed(evt);
            }
        });
        jPanel3.add(RefreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, 110, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 0, 680, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        new SignUp().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        new CategoryForm(user).setVisible(true);
    }//GEN-LAST:event_AddButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        new UpdateForm(user).setVisible(true);
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        new DeleteForm(user).setVisible(true);
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void OtherServiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtherServiceButtonActionPerformed
        new OtherServicesForm(user).setVisible(true);
    }//GEN-LAST:event_OtherServiceButtonActionPerformed

    private void ChangeInforButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeInforButtonActionPerformed
        new UpdateInforUser(user).setVisible(true);
    }//GEN-LAST:event_ChangeInforButtonActionPerformed

    private void RefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshButtonActionPerformed
        defaultTableModel.setRowCount(0);
        setData(itserServices.getAllItems(user.getUsername()),currentMonth,currentYear);
    }//GEN-LAST:event_RefreshButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton ChangeInforButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel DisplayCurrentTimeLabel;
    private javax.swing.JLabel ExpensesLabel;
    private javax.swing.JLabel ImageUserLabel;
    private javax.swing.JLabel IncomesLabel;
    private javax.swing.JLabel Label7;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton OtherServiceButton;
    private javax.swing.JButton RefreshButton;
    private javax.swing.JLabel RemainLabel;
    private javax.swing.JTable TableMainForm;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
