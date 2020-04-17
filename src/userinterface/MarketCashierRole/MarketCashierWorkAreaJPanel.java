/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MarketCashierRole;

import Business.Coachclass.CoachClass;
import Business.DB4OUtil.DB4OUtil;
import userinterface.FitnessCoachRole.*;
import userinterface.MarketCashierRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.MarketCoEnterprise;
import Business.Network.Network;
import Business.Organization.FitnessCoachOrganization;
import Business.Organization.MarketCashierOrganization;
import Business.Organization.Organization;
import Business.Role.MarketCashierRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Business.foods.Food;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class MarketCashierWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private MarketCashierOrganization labOrganization;
    private MarketCoEnterprise enterprise;
    private Network network;

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public MarketCashierWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.labOrganization = (MarketCashierOrganization) organization;
        this.enterprise = (MarketCoEnterprise) enterprise;
        this.network = network;

        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        DefaultTableModel dtmRes = (DefaultTableModel) jTable2.getModel();
        dtmRes.setRowCount(0);

        System.out.println(enterprise.getFoodlist());
        System.out.println(enterprise.getFoodlist().size());
        for (Food f : enterprise.getFoodlist()) {
            //check stock
            if (f.getStock() <= 0) {
                f.setStatus(false);
            }

            if (f.isStatus()) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = f;
                row[1] = f.getPrice();
                row[2] = f.getStock();

                model.addRow(row);
            } else if (!f.isStatus() && f.getStock() >= 0) {
                Object[] row = new Object[dtmRes.getColumnCount()];
                row[0] = f;
                row[1] = f.getStock();

                dtmRes.addRow(row);
            }

        }

//        if (ecosystem.getRestaurantDirectory().getRestaurantList().size() > 0) {
//            for (Restaurant r : ecosystem.getRestaurantDirectory().getRestaurantList()) {
//                Object[] row = new Object[dtmRes.getColumnCount()];
//                row[0] = r;
////                row[1]=r.getPhone();
//                dtmRes.addRow(row);
//            }
//        }
        //orders table
        DefaultTableModel dtmOrders = (DefaultTableModel) jTable1.getModel();
        dtmOrders.setRowCount(0);
        if (userAccount.getWorkQueue().getWorkRequestList().size() > 0) {
            for (WorkRequest w : userAccount.getWorkQueue().getWorkRequestList()) {
                Object[] row = new Object[dtmOrders.getColumnCount()];
                row[0] = w;
                row[1] = w.getSender().getUsername();
//                row[2] = w.getRequestDate();
//切分出订单总价
                row[3] = w.getStatus();
                dtmOrders.addRow(row);
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "name", "price", "stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 330, 100));

        assignJButton.setText("add new food");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        processJButton.setText("checkout");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, 40));

        jButton1.setText("add stock");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 90, -1));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 40, -1));

        jLabel1.setText("Foodstock:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "order no.", "customer", "total", "status"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 490, 120));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "name", "stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 220, 100));

        jButton2.setText("delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 70, -1));

        jButton3.setText("put off shelf");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel2.setText("off shelf items:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        jLabel3.setText("Checkout Counter:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jButton4.setText("refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        CreatefoodJPanel cJPanel = new CreatefoodJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("CreateclassJPanel1", cJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select an line from table", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);

            request.setStatus("Processing");

            ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, request);
            userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }


    }//GEN-LAST:event_processJButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select an line from table", "Warning", JOptionPane.WARNING_MESSAGE);

        } else {
            Food offfood = (Food) workRequestJTable.getValueAt(selectedRow, 0);
            offfood.setStatus(false);
            populateTable();
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable2.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select an food from table", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Food offfood = (Food) jTable2.getValueAt(selectedRow, 0);
            enterprise.getFoodlist().remove(offfood);

            JOptionPane.showMessageDialog(null, "off-shelf food  deleted!");
            populateTable();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable2.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select an food from table", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            Food offfood = (Food) jTable2.getValueAt(selectedRow, 0);
            enterprise.getFoodlist().remove(offfood);
            offfood.setStatus(true);

            if (!jTextField1.getText().equals("") && Integer.parseInt(jTextField1.getText()) > -200) {
                offfood.setStock(offfood.getStock() + Integer.parseInt(jTextField1.getText()));
                if (offfood.getStock() < 0) {
                    JOptionPane.showMessageDialog(null, "Food stock too low !\n food will be deleted !", "Warning", JOptionPane.WARNING_MESSAGE);

                    jButton2.doClick();

                }
                enterprise.getFoodlist().add(offfood);

                populateTable();
            } else {
                offfood.setStock(offfood.getStock() + 1);
                JOptionPane.showMessageDialog(null, "wrong stock format! automaticly stock +1 !");
                enterprise.getFoodlist().add(offfood);
                populateTable();

            }
        }
        jTextField1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        populateTable();

    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton processJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
