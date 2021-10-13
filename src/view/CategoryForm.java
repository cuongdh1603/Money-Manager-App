/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import javafx.util.Pair;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author Cuong
 */
public class CategoryForm extends javax.swing.JFrame {
    static String type;
    static String category;
    static boolean selectedExpenses,selectedIncomes;
    User u;
    public CategoryForm() {
        initComponents();
    }
    public CategoryForm(User user) {
        initComponents();
        this.setIconImage(new ImageIcon("C:\\Users\\Cuong\\Documents\\NetBeansProjects\\FAMILY_FINANCE_APP\\src\\images\\money.PNG").getImage());
        this.setLocationRelativeTo(null);
        u = user;
        selectedExpenses = true;
        selectedIncomes = false;
        ExpensesButton.setBackground(new Color(128,128,0));
        IncomesButton.setBackground(new Color(240,230,140));
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        IncomesButton = new javax.swing.JButton();
        ExpensesButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        categoryLabel = new javax.swing.JLabel();
        ReturnBtn = new javax.swing.JButton();
        ChooseBtn = new javax.swing.JButton();
        parentPanel = new javax.swing.JPanel();
        ExpensesPanel = new javax.swing.JPanel();
        FoodBtn = new javax.swing.JButton();
        ClothesBtn = new javax.swing.JButton();
        HouseBtn = new javax.swing.JButton();
        EntertainBtn = new javax.swing.JButton();
        GasBtn = new javax.swing.JButton();
        BookBtn = new javax.swing.JButton();
        BabyBtn = new javax.swing.JButton();
        EducationBtn = new javax.swing.JButton();
        OilBtn = new javax.swing.JButton();
        MedicalBtn = new javax.swing.JButton();
        GymBtn = new javax.swing.JButton();
        InternetBtn = new javax.swing.JButton();
        PhoneBtn = new javax.swing.JButton();
        InsurranceBtn = new javax.swing.JButton();
        TravelBtn = new javax.swing.JButton();
        GiftBtn = new javax.swing.JButton();
        TrashBtn = new javax.swing.JButton();
        OtherBtn1 = new javax.swing.JButton();
        IncomesPanel = new javax.swing.JPanel();
        SalaryBtn = new javax.swing.JButton();
        DividentBtn = new javax.swing.JButton();
        AwardBtn = new javax.swing.JButton();
        OtherBtn2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IncomesButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        IncomesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/income.png"))); // NOI18N
        IncomesButton.setText("Incomes");
        IncomesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncomesButtonActionPerformed(evt);
            }
        });
        jPanel1.add(IncomesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 220, 61));

        ExpensesButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ExpensesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/expenses.png"))); // NOI18N
        ExpensesButton.setText("Expenses");
        ExpensesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpensesButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ExpensesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, 61));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Screenshot 2021-10-01 175705.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 140, 130));

        categoryLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        categoryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(categoryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 220, 40));

        ReturnBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ReturnBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return1.png"))); // NOI18N
        ReturnBtn.setText("Return");
        ReturnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ReturnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 160, 50));

        ChooseBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ChooseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/choose.png"))); // NOI18N
        ChooseBtn.setText("Choose");
        ChooseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ChooseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 160, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 480));

        parentPanel.setLayout(new java.awt.CardLayout());

        ExpensesPanel.setBackground(new java.awt.Color(255, 102, 102));
        ExpensesPanel.setLayout(new java.awt.GridLayout(6, 3, 4, 4));

        FoodBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        FoodBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/food_icon.png"))); // NOI18N
        FoodBtn.setText("Food");
        FoodBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodBtnActionPerformed(evt);
            }
        });
        ExpensesPanel.add(FoodBtn);

        ClothesBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ClothesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clothes.png"))); // NOI18N
        ClothesBtn.setText("Clothes");
        ClothesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClothesBtnActionPerformed(evt);
            }
        });
        ExpensesPanel.add(ClothesBtn);

        HouseBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        HouseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rent_house.png"))); // NOI18N
        HouseBtn.setText("Rent house");
        HouseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HouseBtnActionPerformed(evt);
            }
        });
        ExpensesPanel.add(HouseBtn);

        EntertainBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EntertainBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/entertainment.png"))); // NOI18N
        EntertainBtn.setText("Entertainment");
        EntertainBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntertainBtnActionPerformed(evt);
            }
        });
        ExpensesPanel.add(EntertainBtn);

        GasBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GasBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gas.png"))); // NOI18N
        GasBtn.setText("Gas");
        GasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GasBtnActionPerformed(evt);
            }
        });
        ExpensesPanel.add(GasBtn);

        BookBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BookBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book.png"))); // NOI18N
        BookBtn.setText("Book");
        BookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookBtnActionPerformed(evt);
            }
        });
        ExpensesPanel.add(BookBtn);

        BabyBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BabyBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baby.png"))); // NOI18N
        BabyBtn.setText("Baby");
        BabyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BabyBtnActionPerformed(evt);
            }
        });
        ExpensesPanel.add(BabyBtn);

        EducationBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EducationBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edu.png"))); // NOI18N
        EducationBtn.setText("Education");
        EducationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EducationBtnActionPerformed(evt);
            }
        });
        ExpensesPanel.add(EducationBtn);

        OilBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        OilBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/oil.png"))); // NOI18N
        OilBtn.setText("Oil");
        OilBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OilBtnActionPerformed(evt);
            }
        });
        ExpensesPanel.add(OilBtn);

        MedicalBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MedicalBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/medical.png"))); // NOI18N
        MedicalBtn.setText("Medical");
        MedicalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicalBtnActionPerformed(evt);
            }
        });
        ExpensesPanel.add(MedicalBtn);

        GymBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GymBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym.png"))); // NOI18N
        GymBtn.setText("Gym");
        GymBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GymBtnActionPerformed(evt);
            }
        });
        ExpensesPanel.add(GymBtn);

        InternetBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        InternetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/internet.png"))); // NOI18N
        InternetBtn.setText("Internet");
        InternetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InternetBtnActionPerformed(evt);
            }
        });
        ExpensesPanel.add(InternetBtn);

        PhoneBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PhoneBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/phone.png"))); // NOI18N
        PhoneBtn.setText("Phone");
        PhoneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneBtnActionPerformed(evt);
            }
        });
        ExpensesPanel.add(PhoneBtn);

        InsurranceBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        InsurranceBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/insurrance.png"))); // NOI18N
        InsurranceBtn.setText("Insurrance");
        InsurranceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsurranceBtnActionPerformed(evt);
            }
        });
        ExpensesPanel.add(InsurranceBtn);

        TravelBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TravelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/travel.png"))); // NOI18N
        TravelBtn.setText("Travel");
        TravelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TravelBtnActionPerformed(evt);
            }
        });
        ExpensesPanel.add(TravelBtn);

        GiftBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GiftBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gift.png"))); // NOI18N
        GiftBtn.setText("Gift");
        GiftBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GiftBtnActionPerformed(evt);
            }
        });
        ExpensesPanel.add(GiftBtn);

        TrashBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TrashBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trash.png"))); // NOI18N
        TrashBtn.setText("Trash");
        TrashBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrashBtnActionPerformed(evt);
            }
        });
        ExpensesPanel.add(TrashBtn);

        OtherBtn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        OtherBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/other.png"))); // NOI18N
        OtherBtn1.setText("Other");
        OtherBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtherBtn1ActionPerformed(evt);
            }
        });
        ExpensesPanel.add(OtherBtn1);

        parentPanel.add(ExpensesPanel, "card2");

        IncomesPanel.setBackground(new java.awt.Color(0, 153, 153));
        IncomesPanel.setLayout(new java.awt.GridLayout(4, 1, 5, 5));

        SalaryBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SalaryBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salary.png"))); // NOI18N
        SalaryBtn.setText("Salary");
        SalaryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalaryBtnActionPerformed(evt);
            }
        });
        IncomesPanel.add(SalaryBtn);

        DividentBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        DividentBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/divident.png"))); // NOI18N
        DividentBtn.setText("Divident");
        DividentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DividentBtnActionPerformed(evt);
            }
        });
        IncomesPanel.add(DividentBtn);

        AwardBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        AwardBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/award.png"))); // NOI18N
        AwardBtn.setText("Award");
        AwardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AwardBtnActionPerformed(evt);
            }
        });
        IncomesPanel.add(AwardBtn);

        OtherBtn2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        OtherBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/other.png"))); // NOI18N
        OtherBtn2.setText("Other");
        OtherBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtherBtn2ActionPerformed(evt);
            }
        });
        IncomesPanel.add(OtherBtn2);

        parentPanel.add(IncomesPanel, "card3");

        getContentPane().add(parentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 690, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExpensesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpensesButtonActionPerformed
        ExpensesButton.setBackground(new Color(128,128,0));
        IncomesButton.setBackground(new Color(240,230,140));
        selectedExpenses = true;
        selectedIncomes = false;
        parentPanel.removeAll();
        parentPanel.add(ExpensesPanel);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_ExpensesButtonActionPerformed

    private void IncomesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncomesButtonActionPerformed
        ExpensesButton.setBackground(new Color(240,230,140));
        IncomesButton.setBackground(new Color(128,128,0));
        selectedExpenses = false;
        selectedIncomes = true;
        parentPanel.removeAll();
        parentPanel.add(IncomesPanel);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_IncomesButtonActionPerformed

    private void InsurranceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsurranceBtnActionPerformed
        categoryLabel.setText(InsurranceBtn.getText());
    }//GEN-LAST:event_InsurranceBtnActionPerformed

    private void SalaryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalaryBtnActionPerformed
        categoryLabel.setText(SalaryBtn.getText());
    }//GEN-LAST:event_SalaryBtnActionPerformed

    private void DividentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DividentBtnActionPerformed
        categoryLabel.setText(DividentBtn.getText());
    }//GEN-LAST:event_DividentBtnActionPerformed

    private void AwardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AwardBtnActionPerformed
        categoryLabel.setText(AwardBtn.getText());
    }//GEN-LAST:event_AwardBtnActionPerformed

    private void OtherBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtherBtn2ActionPerformed
        categoryLabel.setText(OtherBtn2.getText());
    }//GEN-LAST:event_OtherBtn2ActionPerformed

    private void FoodBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodBtnActionPerformed
        categoryLabel.setText(FoodBtn.getText());
    }//GEN-LAST:event_FoodBtnActionPerformed

    private void ClothesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClothesBtnActionPerformed
        categoryLabel.setText(ClothesBtn.getText());
    }//GEN-LAST:event_ClothesBtnActionPerformed

    private void HouseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HouseBtnActionPerformed
        categoryLabel.setText(HouseBtn.getText());
    }//GEN-LAST:event_HouseBtnActionPerformed

    private void EntertainBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntertainBtnActionPerformed
        categoryLabel.setText(EntertainBtn.getText());
    }//GEN-LAST:event_EntertainBtnActionPerformed

    private void GasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GasBtnActionPerformed
        categoryLabel.setText(GasBtn.getText());
    }//GEN-LAST:event_GasBtnActionPerformed

    private void BookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookBtnActionPerformed
        categoryLabel.setText(BookBtn.getText());
    }//GEN-LAST:event_BookBtnActionPerformed

    private void BabyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BabyBtnActionPerformed
        categoryLabel.setText(BabyBtn.getText());
    }//GEN-LAST:event_BabyBtnActionPerformed

    private void EducationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EducationBtnActionPerformed
        categoryLabel.setText(EducationBtn.getText());
    }//GEN-LAST:event_EducationBtnActionPerformed

    private void OilBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OilBtnActionPerformed
        categoryLabel.setText(OilBtn.getText());
    }//GEN-LAST:event_OilBtnActionPerformed

    private void MedicalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicalBtnActionPerformed
        categoryLabel.setText(MedicalBtn.getText());
    }//GEN-LAST:event_MedicalBtnActionPerformed

    private void GymBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GymBtnActionPerformed
        categoryLabel.setText(GymBtn.getText());
    }//GEN-LAST:event_GymBtnActionPerformed

    private void InternetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InternetBtnActionPerformed
        categoryLabel.setText(InternetBtn.getText());// TODO add your handling code here:
    }//GEN-LAST:event_InternetBtnActionPerformed

    private void PhoneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneBtnActionPerformed
        categoryLabel.setText(PhoneBtn.getText());
    }//GEN-LAST:event_PhoneBtnActionPerformed

    private void TravelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TravelBtnActionPerformed
        categoryLabel.setText(TravelBtn.getText());
    }//GEN-LAST:event_TravelBtnActionPerformed

    private void GiftBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GiftBtnActionPerformed
        categoryLabel.setText(GiftBtn.getText());
    }//GEN-LAST:event_GiftBtnActionPerformed

    private void TrashBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrashBtnActionPerformed
        categoryLabel.setText(TrashBtn.getText());
    }//GEN-LAST:event_TrashBtnActionPerformed

    private void OtherBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtherBtn1ActionPerformed
        categoryLabel.setText(OtherBtn1.getText());
    }//GEN-LAST:event_OtherBtn1ActionPerformed

    private void ReturnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnBtnActionPerformed

        this.dispose();
    }//GEN-LAST:event_ReturnBtnActionPerformed

    private void ChooseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseBtnActionPerformed
        if(selectedExpenses) type = "expenses";
        else type = "incomes";
        category = categoryLabel.getText();
        if(category.equals("")){
            JOptionPane.showMessageDialog(null,"You have not selected any item yet!!!");
        }
        else {
            new AddNewForm(u,type,category).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_ChooseBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AwardBtn;
    private javax.swing.JButton BabyBtn;
    private javax.swing.JButton BookBtn;
    private javax.swing.JButton ChooseBtn;
    private javax.swing.JButton ClothesBtn;
    private javax.swing.JButton DividentBtn;
    private javax.swing.JButton EducationBtn;
    private javax.swing.JButton EntertainBtn;
    private javax.swing.JButton ExpensesButton;
    private javax.swing.JPanel ExpensesPanel;
    private javax.swing.JButton FoodBtn;
    private javax.swing.JButton GasBtn;
    private javax.swing.JButton GiftBtn;
    private javax.swing.JButton GymBtn;
    private javax.swing.JButton HouseBtn;
    private javax.swing.JButton IncomesButton;
    private javax.swing.JPanel IncomesPanel;
    private javax.swing.JButton InsurranceBtn;
    private javax.swing.JButton InternetBtn;
    private javax.swing.JButton MedicalBtn;
    private javax.swing.JButton OilBtn;
    private javax.swing.JButton OtherBtn1;
    private javax.swing.JButton OtherBtn2;
    private javax.swing.JButton PhoneBtn;
    private javax.swing.JButton ReturnBtn;
    private javax.swing.JButton SalaryBtn;
    private javax.swing.JButton TrashBtn;
    private javax.swing.JButton TravelBtn;
    private static javax.swing.JLabel categoryLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel parentPanel;
    // End of variables declaration//GEN-END:variables
}
