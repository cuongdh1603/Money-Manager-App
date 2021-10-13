package view;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import model.Item;
import model.ItemServices;
import model.User;
import model.UserServices;
/**
 *
 * @author Cuong
 */
public class OtherServicesForm extends javax.swing.JFrame {
    DefaultTableModel defaultTableModel;
    ItemServices itservices;
    UserServices services;
    User u;
    List<Item> listItem;
    long expenses, incomes, remain;
    String pdfFileName;
    public OtherServicesForm() {
        initComponents();
    }
    public OtherServicesForm(User user) {
        initComponents();
        this.setIconImage(new ImageIcon("C:\\Users\\Cuong\\Documents\\NetBeansProjects\\FAMILY_FINANCE_APP\\src\\images\\money.PNG").getImage());
        services = new UserServices();
        itservices = new ItemServices();
        u = user;
        listItem = new ArrayList<Item>();
        Date date = new Date();
        int currentMonth = date.getMonth();
        int currentYear = date.getYear() + 1900;
        MonthComboBox.setSelectedIndex(currentMonth);
        SpinnerModel spinnerModel = new SpinnerNumberModel(currentYear, 2000, currentYear + 5, 1);
        YearChooser.setModel(spinnerModel);
        defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        TableOtherServices.setModel(defaultTableModel);
        defaultTableModel.addColumn("STT");
        defaultTableModel.addColumn("Amount");
        defaultTableModel.addColumn("Type");
        defaultTableModel.addColumn("Category");
        defaultTableModel.addColumn("Date");
        defaultTableModel.addColumn("Note");
        setData(itservices.getAllItems(u.getUsername()), currentMonth, currentYear);
        pdfFileName = "";
        viewButton.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static int getMonthFromString(String s) {
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

    public static int getYearFromString(String s) {
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        int year = 0;
        try {
            Date date = dateFormat.parse(s);
            year = date.getYear() + 1900;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return year;
    }

    public void setData(List<Item> list, int month, int year) {
        expenses = 0;
        incomes = 0;
        remain = 0;
        listItem.clear();
        for (Item i : list) {
            if (getMonthFromString(i.getTimeRecord()) == month && getYearFromString(i.getTimeRecord()) == year) {
                defaultTableModel.addRow(new Object[]{i.getId(), i.getAmount(), i.getType(), i.getCategory(),
                    i.getTimeRecord(), i.getDescription()});
                if (i.getType().equalsIgnoreCase("expenses")) {
                    expenses += i.getAmount();
                } else if (i.getType().equalsIgnoreCase("incomes")) {
                    incomes += i.getAmount();
                }
                listItem.add(i);
            }
        }
        ExpensesLabel.setText(String.valueOf(expenses));
        IncomesLabel.setText(String.valueOf(incomes));
        RemainLabel.setText(String.valueOf(incomes - expenses));
    }

    public void setData(List<Item> list, int month, int year, String type) {
        expenses = 0;
        incomes = 0;
        remain = 0;
        listItem.clear();
        for (Item i : list) {
            if (getMonthFromString(i.getTimeRecord()) == month && getYearFromString(i.getTimeRecord()) == year) {
                if (i.getType().equalsIgnoreCase("expenses")) {
                    expenses += i.getAmount();
                } else if (i.getType().equalsIgnoreCase("incomes")) {
                    incomes += i.getAmount();
                }
                if (i.getType().equalsIgnoreCase(type)) {
                    defaultTableModel.addRow(new Object[]{i.getId(), i.getAmount(), i.getType(), i.getCategory(),
                        i.getTimeRecord(), i.getDescription()});
                    listItem.add(i);
                }
            }
        }
        ExpensesLabel.setText(String.valueOf(expenses));
        IncomesLabel.setText(String.valueOf(incomes));
        RemainLabel.setText(String.valueOf(incomes - expenses));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DescRadioButton = new javax.swing.JRadioButton();
        AscRadioButton = new javax.swing.JRadioButton();
        SortButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        MonthComboBox = new javax.swing.JComboBox<>();
        ExportPDFButton = new javax.swing.JButton();
        ReturnButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        ExpensesComboBox = new javax.swing.JRadioButton();
        IncomesComboBox = new javax.swing.JRadioButton();
        AllComboBox = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        YearChooser = new javax.swing.JSpinner();
        ShowButton = new javax.swing.JButton();
        RefreshButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableOtherServices = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        IncomesLabel = new javax.swing.JLabel();
        RemainLabel = new javax.swing.JLabel();
        ExpensesLabel = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Sort by Amount:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 80, -1, 36));

        buttonGroup2.add(DescRadioButton);
        DescRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DescRadioButton.setText("Desc");
        jPanel1.add(DescRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 83, -1, -1));

        buttonGroup2.add(AscRadioButton);
        AscRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AscRadioButton.setSelected(true);
        AscRadioButton.setText("Asc");
        jPanel1.add(AscRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 83, 70, -1));

        SortButton.setBackground(new java.awt.Color(255, 153, 51));
        SortButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SortButton.setText("Sort");
        SortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SortButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 122, 110, 47));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Month:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 37));

        MonthComboBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MonthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));
        MonthComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(MonthComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        ExportPDFButton.setBackground(new java.awt.Color(204, 153, 0));
        ExportPDFButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ExportPDFButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pdf.png"))); // NOI18N
        ExportPDFButton.setText("Export PDF");
        ExportPDFButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportPDFButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ExportPDFButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 220, 60));

        ReturnButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ReturnButton.setText("Return");
        ReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ReturnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 220, 60));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 305, 20));

        buttonGroup1.add(ExpensesComboBox);
        ExpensesComboBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ExpensesComboBox.setText("Expenses");
        jPanel1.add(ExpensesComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        buttonGroup1.add(IncomesComboBox);
        IncomesComboBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        IncomesComboBox.setText("Incomes");
        jPanel1.add(IncomesComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 112, -1));

        buttonGroup1.add(AllComboBox);
        AllComboBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AllComboBox.setSelected(true);
        AllComboBox.setText("All");
        jPanel1.add(AllComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 73, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Other Services");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 19, 231, 33));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 58, 265, 10));

        YearChooser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        YearChooser.setModel(new javax.swing.SpinnerNumberModel(1900, 1900, null, 1));
        jPanel1.add(YearChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 135, -1));

        ShowButton.setBackground(new java.awt.Color(204, 153, 0));
        ShowButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ShowButton.setText("Show");
        ShowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ShowButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 110, 40));

        RefreshButton.setBackground(new java.awt.Color(204, 153, 0));
        RefreshButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RefreshButton.setText("Refresh");
        RefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshButtonActionPerformed(evt);
            }
        });
        jPanel1.add(RefreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 300, 110, 40));

        viewButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        viewButton.setText("View PDF");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });
        jPanel1.add(viewButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 220, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 570));

        jPanel2.setBackground(new java.awt.Color(153, 153, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableOtherServices.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TableOtherServices.setModel(new javax.swing.table.DefaultTableModel(
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
        TableOtherServices.setRowHeight(30);
        jScrollPane1.setViewportView(TableOtherServices);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 222, 688, 330));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Incomes");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 111, 117, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Expenses");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 114, 117, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Remain");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 117, -1));

        IncomesLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        IncomesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IncomesLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(IncomesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 66, 194, 39));

        RemainLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        RemainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RemainLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(RemainLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 194, 39));

        ExpensesLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ExpensesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExpensesLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(ExpensesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 66, 194, 39));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, -4, 730, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MonthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthComboBoxActionPerformed

    }//GEN-LAST:event_MonthComboBoxActionPerformed

    private void ReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_ReturnButtonActionPerformed

    private void SortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortButtonActionPerformed
        if (AscRadioButton.isSelected()) {
            Collections.sort(listItem, new Comparator<Item>() {
                @Override
                public int compare(Item o1, Item o2) {
                    long amount1 = o1.getAmount(), amount2 = o2.getAmount();
                    if (amount1 > amount2) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
            });
        } else {
            Collections.sort(listItem, new Comparator<Item>() {
                @Override
                public int compare(Item o1, Item o2) {
                    long amount1 = o1.getAmount(), amount2 = o2.getAmount();
                    if (amount1 > amount2) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
            });
        }
        defaultTableModel.setRowCount(0);
        for (Item i : listItem) {
            defaultTableModel.addRow(new Object[]{i.getId(), i.getAmount(), i.getType(), i.getCategory(),
                i.getTimeRecord(), i.getDescription()});
        }
    }//GEN-LAST:event_SortButtonActionPerformed

    private void ShowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowButtonActionPerformed
        defaultTableModel.setRowCount(0);
        int month = Integer.valueOf(MonthComboBox.getItemAt(MonthComboBox.getSelectedIndex())) - 1;
        int year = Integer.valueOf(YearChooser.getValue().toString());
        if (ExpensesComboBox.isSelected()) {
            setData(itservices.getAllItems(u.getUsername()), month, year, "expenses");
        } else if (IncomesComboBox.isSelected()) {
            setData(itservices.getAllItems(u.getUsername()), month, year, "incomes");
        } else {
            setData(itservices.getAllItems(u.getUsername()), month, year);
        }

    }//GEN-LAST:event_ShowButtonActionPerformed

    private void RefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshButtonActionPerformed
        defaultTableModel.setRowCount(0);
        Date date = new Date();
        int currentMonth = date.getMonth();
        int currentYear = date.getYear() + 1900;
        setData(itservices.getAllItems(u.getUsername()), currentMonth, currentYear);
    }//GEN-LAST:event_RefreshButtonActionPerformed

    private void ExportPDFButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportPDFButtonActionPerformed
        String path = "";
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = fileChooser.showSaveDialog(this);
        if (x == JFileChooser.APPROVE_OPTION) {
            path = fileChooser.getSelectedFile().getPath();
        }
        Document doc = new Document();
        try {
            String name = generateFileName();
            pdfFileName = path+"\\moneyManager"+name+".pdf";
            PdfWriter.getInstance(doc, new FileOutputStream(pdfFileName));
            doc.open();
            //add heading
            Paragraph para = new Paragraph("Information items of user " + u.getUsername()
                + " in : " + MonthComboBox.getItemAt(MonthComboBox.getSelectedIndex())
                + "/" +YearChooser.getValue().toString()+"\n\n");
            doc.add(para);
            //add table
            PdfPTable table = new PdfPTable(6);
            table.addCell(new PdfPCell(new Phrase("STT")));
            table.addCell(new PdfPCell(new Phrase("Amount")));
            table.addCell(new PdfPCell(new Phrase("Type")));
            table.addCell(new PdfPCell(new Phrase("Category")));
            table.addCell(new PdfPCell(new Phrase("Date")));
            table.addCell(new PdfPCell(new Phrase("Note")));
            table.setHeaderRows(1);
            for (int i = 0; i < defaultTableModel.getRowCount(); i++) {
                String id = String.valueOf(i + 1);
                    String amount = defaultTableModel.getValueAt(i, 1).toString();
                    String type = defaultTableModel.getValueAt(i, 2).toString();
                    String cate = defaultTableModel.getValueAt(i, 3).toString();
                    String date = defaultTableModel.getValueAt(i, 4).toString();
                    String note = defaultTableModel.getValueAt(i, 5).toString();
                    table.addCell(id);
                    table.addCell(amount);
                    table.addCell(type);
                    table.addCell(cate);
                    table.addCell(date);
                    table.addCell(note);
                }
                doc.add(table);
                doc.close();
                viewButton.setVisible(true);
                System.out.println("Finish export");
                JOptionPane.showMessageDialog(null, "Export to PDF successfully");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (DocumentException ex) {
                ex.printStackTrace();
            }
    }//GEN-LAST:event_ExportPDFButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        File file = new File(pdfFileName);
        if(!file.exists()){
            JOptionPane.showMessageDialog(null, "No file was found", "Error", ERROR);
        }
        else{
            if(Desktop.isDesktopSupported()){
                try {
                    Desktop.getDesktop().open(file);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            else
                JOptionPane.showMessageDialog(null, "No file supported", "Error", ERROR);
        }
    }//GEN-LAST:event_viewButtonActionPerformed
    public static String generateFileName() {
        Date d = new Date();
        String date = String.valueOf(d.getDate());
        if (date.length() < 2) {
            date = '0' + date;
        }
        String month = String.valueOf(d.getMonth());
        if (month.length() < 2) {
            month = '0' + month;
        }
        String year = String.valueOf(d.getYear());
        String hour = String.valueOf(d.getHours());
        if (hour.length() < 2) {
            hour = '0' + hour;
        }
        String minute = String.valueOf(d.getMinutes());
        if (minute.length() < 2) {
            minute = '0' + minute;
        }
        String sec = String.valueOf(d.getSeconds());
        if (sec.length() < 2) {
            sec = '0' + sec;
        }
        return date + month + year + "_" + hour + minute + sec;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AllComboBox;
    private javax.swing.JRadioButton AscRadioButton;
    private javax.swing.JRadioButton DescRadioButton;
    private javax.swing.JRadioButton ExpensesComboBox;
    private javax.swing.JLabel ExpensesLabel;
    private javax.swing.JButton ExportPDFButton;
    private javax.swing.JRadioButton IncomesComboBox;
    private javax.swing.JLabel IncomesLabel;
    private javax.swing.JComboBox<String> MonthComboBox;
    private javax.swing.JButton RefreshButton;
    private javax.swing.JLabel RemainLabel;
    private javax.swing.JButton ReturnButton;
    private javax.swing.JButton ShowButton;
    private javax.swing.JButton SortButton;
    private javax.swing.JTable TableOtherServices;
    private javax.swing.JSpinner YearChooser;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
