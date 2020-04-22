/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Coachclass.CoachClass;
import userinterface.ManagerRole.*;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FitnessCoEnterprise;
import Business.Enterprise.MarketCoEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Business.foods.Food;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.FitnessCoachRole.CoachWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class ManageCoachClassJPanel extends javax.swing.JPanel {

    private UserAccount userAccount;
    private FitnessCoEnterprise fitnessCoEnterprise;
    private EcoSystem ecoSystem;
    private JPanel userProcessContainer;
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageCoachClassJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.fitnessCoEnterprise = (FitnessCoEnterprise) enterprise;
        this.ecoSystem = ecoSystem;
        
        populateTable();
    }

    private void populateTable(){
        DefaultTableModel classListModel = (DefaultTableModel) classJTable.getModel();
        
        classListModel.setRowCount(0);
        
        for (CoachClass cc: fitnessCoEnterprise.getAllClassList()){
            Object[] row = new Object[5];
            row[0] = cc;
            row[1] = cc.getCapacity();
            row[2] = cc.getCapacity() - cc.getPerticipants();
            row[3] = cc.getTime();
            row[4] = cc.getCoach();
            
            classListModel.addRow(row);
        }
        
        DefaultTableModel yourClassModel = (DefaultTableModel) yourClassJTable.getModel();
        
        yourClassModel.setRowCount(0);
        
        for (CoachClass cc: userAccount.getClasslist()){
            Object[] row = new Object[3];
            row[0] = cc;
            row[1] = cc.getTime();
            row[2] = cc.getCoach();
            
            yourClassModel.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        selectBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        yourClassJTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        classJTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(111, 158, 159));
        setPreferredSize(new java.awt.Dimension(963, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setBackground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 517, -1, 50));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Manage Class");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Class List");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        selectBtn.setBackground(new java.awt.Color(255, 255, 255));
        selectBtn.setText("Choose Class");
        selectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBtnActionPerformed(evt);
            }
        });
        add(selectBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, 120, 50));

        deleteBtn.setBackground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 490, 90, 50));

        yourClassJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class Name", "Time", "Coach"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(yourClassJTable);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 640, 140));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("Your Class");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));

        classJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Class Name", "Capacity", "Remain", "Time", "Coach"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(classJTable);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 740, 160));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void selectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBtnActionPerformed

        int selectedClass = classJTable.getSelectedRow();
        if (selectedClass < 0){
            JOptionPane.showMessageDialog(null, "Please select a class from table", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else {
            CoachClass cc = (CoachClass)classJTable.getValueAt(selectedClass, 0);
            cc.setPerticipants(cc.getPerticipants()+1);

            //restaurant table
            DefaultTableModel dtmYourClass = (DefaultTableModel)yourClassJTable.getModel();
            for(int i = 0; i < dtmYourClass.getRowCount(); i++){
                if (dtmYourClass.getValueAt(i, 0).equals(cc)) {
                    JOptionPane.showMessageDialog(null, "You have selected this class", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
            //add order
            Object[] row = new Object[3];
            row[0]=cc;
            row[1]=cc.getTime();
            row[2]=cc.getCoach();
            
            dtmYourClass.addRow(row);
            
            //get coach org
            UserAccount ua = null;
            for (Organization organization : fitnessCoEnterprise.getOrganizationDirectory().getOrganizationList()) {
                for (UserAccount account : organization.getUserAccountDirectory().getUserAccountList()) {
                    if (account.getUsername().equals(cc.getCoach())) {
                        ua = account;
                    }
                }
            }
            if (ua == null) {
                JOptionPane.showMessageDialog(null, "Cannot find this coach!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            WorkRequest classRequest = new WorkRequest();
            classRequest.setMessage(cc.getClassname());
            classRequest.setReceiver(ua);
            classRequest.setSender(userAccount);
            classRequest.setStatus("waiting");
            classRequest.setRequestDate(new Date());

            System.out.println(ua + " " + cc.getCoach());
            ua.getWorkQueue().getWorkRequestList().add(classRequest);
            userAccount.getWorkQueue().getWorkRequestList().add(classRequest);
            userAccount.getClasslist().add(cc);
            populateTable();
        }
    }//GEN-LAST:event_selectBtnActionPerformed
    
    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed

        int selectedClass = yourClassJTable.getSelectedRow();
        if (selectedClass < 0) {
            JOptionPane.showMessageDialog(null, "Please select a class", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        CoachClass cc = (CoachClass)yourClassJTable.getValueAt(selectedClass, 0);
        cc.setPerticipants(cc.getPerticipants()-1);
//        System.out.println(cc.getCoach());
        UserAccount ua = null;
        for (Organization organization : fitnessCoEnterprise.getOrganizationDirectory().getOrganizationList()) {
            ua = organization.getUserAccountDirectory().getUserAccountByName(cc.getCoach());
            if (ua!= null) {
                break;
            }
        }
        
        if (ua == null) {
            JOptionPane.showMessageDialog(null, "Can not find class!");
        }

        System.out.println(ua.getPassword());
        
        
        for (WorkRequest workRequest : ua.getWorkQueue().getWorkRequestList()) {
            if (workRequest.getMessage().equals(cc.getClassname())) {
                ua.getWorkQueue().getWorkRequestList().remove(workRequest);
                userAccount.getWorkQueue().getWorkRequestList().remove(workRequest);
                userAccount.getClasslist().remove(cc);
                break;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Class deleted!");
        DB4OUtil.getInstance().storeSystem(ecoSystem);
        populateTable();
    }//GEN-LAST:event_deleteBtnActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTable classJTable;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton selectBtn;
    private javax.swing.JTable yourClassJTable;
    // End of variables declaration//GEN-END:variables
}
