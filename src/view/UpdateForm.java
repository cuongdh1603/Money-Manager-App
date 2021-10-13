/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Item;
import model.ItemServices;
import model.User;
import model.UserServices;
import static view.AddNewForm.convertFormatDate;
/**
 *
 * @author Cuong
 */
public class UpdateForm extends javax.swing.JFrame {
    UserServices services;
    ItemServices itservices;
    User u;
    DefaultTableModel defaultTableModel;
    static String category;
    static int id;
    public UpdateForm() {
        initComponents();
    }
    public UpdateForm(User user){
        initComponents();
        this.setIconImage(new ImageIcon("C:\\Users\\Cuong\\Documents\\NetBeansProjects\\FAMILY_FINANCE_APP\\src\\images\\money.PNG").getImage());
        services = new UserServices();
        itservices = new ItemServices();
        u = services.getInforUser(user.getUsername());
        defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; 
            }
        };
        UpdateComboBox();
        TableUpdate.setModel(defaultTableModel);
        defaultTableModel.addColumn("STT");
        defaultTableModel.addColumn("Amount");
        defaultTableModel.addColumn("Type");
        defaultTableModel.addColumn("Category");
        defaultTableModel.addColumn("Date");
        defaultTableModel.addColumn("Note");
        setData(itservices.getAllItems(u.getUsername()));
        NoteTF.setDocument(new JTextFieldLimit(100));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public void setData(List<Item> list){
        List<Item> items = list;
        for (Item i : items) {
            defaultTableModel.addRow(new Object[]{i.getId(),i.getAmount(),i.getType(),i.getCategory(),
                i.getTimeRecord(),i.getDescription()});
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AmountTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        NoteTF = new javax.swing.JTextArea();
        UpdateButton = new javax.swing.JButton();
        ReturnButton = new javax.swing.JButton();
        DateChooser = new com.toedter.calendar.JDateChooser();
        TypeComboBox = new javax.swing.JComboBox<>();
        CateComboBox = new javax.swing.JComboBox<>();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableUpdate = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Items");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Amount:");

        AmountTF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AmountTF.setText("0.0");
        AmountTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AmountTFKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Type:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Category:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Note:");

        NoteTF.setColumns(20);
        NoteTF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NoteTF.setRows(5);
        jScrollPane2.setViewportView(NoteTF);

        UpdateButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        ReturnButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ReturnButton.setText("Return");
        ReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnButtonActionPerformed(evt);
            }
        });

        DateChooser.setDateFormatString("dd/MM/yyyy");
        DateChooser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        TypeComboBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Expenses", "Incomes" }));
        TypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeComboBoxActionPerformed(evt);
            }
        });

        CateComboBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ReturnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AmountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                    .addComponent(TypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CateComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AmountTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReturnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 557));

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 51, 51));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 102));

        TableUpdate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TableUpdate.setModel(new javax.swing.table.DefaultTableModel(
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
        TableUpdate.setRowHeight(30);
        TableUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableUpdateMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableUpdate);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 0, 690, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_ReturnButtonActionPerformed
    public static Date convertToDate(String s){
        String pattern = "dd/MM/yyyy";
        Date d = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        try {
            d = dateFormat.parse(s);
            return d;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return d;
    }
    private void TableUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableUpdateMouseClicked
        id = Integer.valueOf(defaultTableModel.getValueAt(TableUpdate.getSelectedRow(), 0).toString());
        String amount = defaultTableModel.getValueAt(TableUpdate.getSelectedRow(), 1).toString();
        String type = defaultTableModel.getValueAt(TableUpdate.getSelectedRow(), 2).toString();
        category = defaultTableModel.getValueAt(TableUpdate.getSelectedRow(), 3).toString();
        String date = defaultTableModel.getValueAt(TableUpdate.getSelectedRow(), 4).toString();
        String note = defaultTableModel.getValueAt(TableUpdate.getSelectedRow(), 5).toString();
        AmountTF.setText(amount);
        DateChooser.setDate(convertToDate(date));
        NoteTF.setText(note);
        UpdateComboBox(type, category);
    }//GEN-LAST:event_TableUpdateMouseClicked

    private void TypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeComboBoxActionPerformed
        UpdateComboBox();
    }//GEN-LAST:event_TypeComboBoxActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        if(AmountTF.getText().trim().equals("")
            ||((JTextField)DateChooser.getDateEditor().getUiComponent()).getText().equals(""))
                JOptionPane.showMessageDialog(null, "Fill all amount and date !");
        else if(!AmountTF.getText().trim().equals("")
                &&Long.valueOf(AmountTF.getText().trim())<1000)
                JOptionPane.showMessageDialog(null, "Your amount mush be at least 1000");
        else{
            int certain = JOptionPane.showConfirmDialog(null, "Do you want to update this item?", "Update Item", JOptionPane.YES_NO_CANCEL_OPTION);
            if(certain==0){
                Item item = new Item(id,Long.valueOf(AmountTF.getText().trim()),
                TypeComboBox.getItemAt(TypeComboBox.getSelectedIndex()),
                CateComboBox.getItemAt(CateComboBox.getSelectedIndex()),
                convertFormatDate(((JTextField)DateChooser.getDateEditor().getUiComponent()).getText()),
                NoteTF.getText().trim());
                itservices.updateItem(u, item);
                JOptionPane.showMessageDialog(null, "Update successfully");
            }
            else return;
        }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void AmountTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AmountTFKeyTyped
        char iNumber = evt.getKeyChar();
        if(!Character.isDigit(iNumber)
        ||(iNumber == KeyEvent.VK_BACK_SPACE)
        ||(iNumber == KeyEvent.VK_DELETE))
            evt.consume();
    }//GEN-LAST:event_AmountTFKeyTyped
    public static void UpdateComboBox(){
        CateComboBox.removeAllItems();
        if(TypeComboBox.getSelectedIndex()==0) {
            CateComboBox.addItem("Food");
            CateComboBox.addItem("Clothes");
            CateComboBox.addItem("Rent house");
            CateComboBox.addItem("Entertainment");
            CateComboBox.addItem("Gas");
            CateComboBox.addItem("Book");
            CateComboBox.addItem("Baby");
            CateComboBox.addItem("Education");
            CateComboBox.addItem("Oil");
            CateComboBox.addItem("Medical");
            CateComboBox.addItem("Gym");
            CateComboBox.addItem("Internet");
            CateComboBox.addItem("Phone");
            CateComboBox.addItem("Insurrance");
            CateComboBox.addItem("Travel");
            CateComboBox.addItem("Gift");
            CateComboBox.addItem("Trash");
            CateComboBox.addItem("Other");
            CateComboBox.setSelectedItem(category);
        }
        else {
            TypeComboBox.setSelectedIndex(1);
            CateComboBox.addItem("Salary");
            CateComboBox.addItem("Divident");
            CateComboBox.addItem("Award");
            CateComboBox.addItem("Other");
            CateComboBox.setSelectedItem(category);
        }
    }
    public static void UpdateComboBox(String type,String cate){
        CateComboBox.removeAllItems();
        if(type.equalsIgnoreCase("expenses")) {
            TypeComboBox.setSelectedIndex(0);
        }
        else {
            TypeComboBox.setSelectedIndex(1);
        }
        if(TypeComboBox.getSelectedIndex()==0) {
            CateComboBox.addItem("Food");
            CateComboBox.addItem("Clothes");
            CateComboBox.addItem("Rent house");
            CateComboBox.addItem("Entertainment");
            CateComboBox.addItem("Gas");
            CateComboBox.addItem("Book");
            CateComboBox.addItem("Baby");
            CateComboBox.addItem("Education");
            CateComboBox.addItem("Oil");
            CateComboBox.addItem("Medical");
            CateComboBox.addItem("Gym");
            CateComboBox.addItem("Internet");
            CateComboBox.addItem("Phone");
            CateComboBox.addItem("Insurrance");
            CateComboBox.addItem("Travel");
            CateComboBox.addItem("Gift");
            CateComboBox.addItem("Trash");
            CateComboBox.addItem("Other");
            CateComboBox.setSelectedItem(cate);
        }
        else {
            TypeComboBox.setSelectedIndex(1);
            CateComboBox.addItem("Salary");
            CateComboBox.addItem("Divident");
            CateComboBox.addItem("Award");
            CateComboBox.addItem("Other");
            CateComboBox.setSelectedItem(cate);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AmountTF;
    private static javax.swing.JComboBox<String> CateComboBox;
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JTextArea NoteTF;
    private javax.swing.JButton ReturnButton;
    private javax.swing.JTable TableUpdate;
    private static javax.swing.JComboBox<String> TypeComboBox;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
