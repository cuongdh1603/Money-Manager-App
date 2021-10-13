package view;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
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
public class DeleteForm extends javax.swing.JFrame {
    UserServices services;
    ItemServices itservices;
    User u;
    int id;
    DefaultTableModel defaultTableModel;
    /**
     * Creates new form DeleteForm
     */
    public DeleteForm() {
        initComponents();
    }
    public DeleteForm(User user) {
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
        DeleteTable.setModel(defaultTableModel);
        defaultTableModel.addColumn("STT");
        defaultTableModel.addColumn("Amount");
        defaultTableModel.addColumn("Type");
        defaultTableModel.addColumn("Category");
        defaultTableModel.addColumn("Date");
        defaultTableModel.addColumn("Note");
        setData(itservices.getAllItems(u.getUsername()));;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ReturnButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        AmountLabel = new javax.swing.JLabel();
        TypeLabel = new javax.swing.JLabel();
        DateLabel = new javax.swing.JLabel();
        CategoryLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        NoteTF = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DeleteTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 51, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Delete Items");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 6, 211, 77));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Amount:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 89, 95, 38));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Category:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 177, 95, 38));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 221, 95, 38));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Note:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 265, 63, 38));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Type:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 133, 95, 38));

        ReturnButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ReturnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return1.png"))); // NOI18N
        ReturnButton.setText("Return");
        ReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ReturnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 476, 160, 62));

        DeleteButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete1.png"))); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 477, 160, 62));

        AmountLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AmountLabel.setText("0.0");
        AmountLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(AmountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 225, 38));

        TypeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TypeLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(TypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 134, 225, 30));

        DateLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DateLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(DateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 225, 30));

        CategoryLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CategoryLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(CategoryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 225, 30));

        NoteTF.setColumns(20);
        NoteTF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NoteTF.setRows(5);
        jScrollPane2.setViewportView(NoteTF);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 270, 170));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 563));

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));

        DeleteTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DeleteTable.setModel(new javax.swing.table.DefaultTableModel(
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
        DeleteTable.setRowHeight(30);
        DeleteTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DeleteTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 0, 690, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_ReturnButtonActionPerformed

    private void DeleteTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteTableMouseClicked
        id = Integer.valueOf(defaultTableModel.getValueAt(DeleteTable.getSelectedRow(), 0).toString());
        String amount = defaultTableModel.getValueAt(DeleteTable.getSelectedRow(), 1).toString();
        String type = defaultTableModel.getValueAt(DeleteTable.getSelectedRow(), 2).toString();
        String category = defaultTableModel.getValueAt(DeleteTable.getSelectedRow(), 3).toString();
        String date = defaultTableModel.getValueAt(DeleteTable.getSelectedRow(), 4).toString();
        String note = defaultTableModel.getValueAt(DeleteTable.getSelectedRow(), 5).toString();
        AmountLabel.setText(amount);
        TypeLabel.setText(type);
        CategoryLabel.setText(category);
        DateLabel.setText(date);
        NoteTF.setText(note);
    }//GEN-LAST:event_DeleteTableMouseClicked

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        if(AmountLabel.getText().trim().equals("0.0")){
            JOptionPane.showMessageDialog(null, "You have not selected an item !");
        }
        else{
            int certain = JOptionPane.showConfirmDialog(null, "Are you sure to delete this item?",
                    "Delete item",JOptionPane.YES_NO_CANCEL_OPTION);
            if(certain==0){
                Item item = new Item(id,Long.valueOf(AmountLabel.getText().trim()),
                TypeLabel.getText(),
                CategoryLabel.getText(),
                convertFormatDate(DateLabel.getText()),
                NoteTF.getText().trim());
                itservices.deleteItem(u, id);
                JOptionPane.showMessageDialog(null, "Delete successfully !");
                defaultTableModel.removeRow(DeleteTable.getSelectedRow());
            }
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AmountLabel;
    private javax.swing.JLabel CategoryLabel;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTable DeleteTable;
    private javax.swing.JTextArea NoteTF;
    private javax.swing.JButton ReturnButton;
    private javax.swing.JLabel TypeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
