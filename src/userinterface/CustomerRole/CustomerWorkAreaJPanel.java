/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.CustomerOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */



public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private CustomerOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem ecoSystem;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public CustomerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, CustomerOrganization organization, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.ecoSystem = ecoSystem;
        valueLabel.setText(enterprise.getName());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        manageClassBtn = new javax.swing.JButton();
        manageFoodBtn = new javax.swing.JButton();
        manageOrderBtn = new javax.swing.JButton();
        manageTherapistBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(111, 158, 159));
        setPreferredSize(new java.awt.Dimension(963, 600));
        setSize(new java.awt.Dimension(963, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 127, 30));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 158, 26));

        manageClassBtn.setBackground(new java.awt.Color(255, 255, 255));
        manageClassBtn.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        manageClassBtn.setText("My Fitness Classes");
        manageClassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageClassBtnActionPerformed(evt);
            }
        });
        add(manageClassBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 200, 70));

        manageFoodBtn.setBackground(new java.awt.Color(255, 255, 255));
        manageFoodBtn.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        manageFoodBtn.setText("Buy foods");
        manageFoodBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageFoodBtnActionPerformed(evt);
            }
        });
        add(manageFoodBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 176, 70));

        manageOrderBtn.setBackground(new java.awt.Color(255, 255, 255));
        manageOrderBtn.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        manageOrderBtn.setText("My Orders");
        manageOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrderBtnActionPerformed(evt);
            }
        });
        add(manageOrderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 180, 50));

        manageTherapistBtn.setBackground(new java.awt.Color(255, 255, 255));
        manageTherapistBtn.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        manageTherapistBtn.setText("Schedule Therapist");
        manageTherapistBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageTherapistBtnActionPerformed(evt);
            }
        });
        add(manageTherapistBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, 190, 70));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 362, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/食物-35.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 190, 180));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/推拿2.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 220, 200));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/健身房.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 210, 180));
    }// </editor-fold>//GEN-END:initComponents

    private void manageFoodBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageFoodBtnActionPerformed
        ManageFoodJPanel manageFoodJPanel = new ManageFoodJPanel(userProcessContainer, userAccount, enterprise, ecoSystem);
        userProcessContainer.add("ManageFoodJPanel", manageFoodJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageFoodBtnActionPerformed

    private void manageOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrderBtnActionPerformed
        ManageOrderJPanel manageOrderJPanel = new ManageOrderJPanel(userProcessContainer, userAccount);
        userProcessContainer.add("manageOrderJPanel", manageOrderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrderBtnActionPerformed

    private void manageTherapistBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageTherapistBtnActionPerformed
        ManagePhysicalTherapistJPanel managePhysicalTherapistJPanel = new ManagePhysicalTherapistJPanel(userProcessContainer, userAccount, enterprise, ecoSystem);
        userProcessContainer.add("managePhysicalTherapistJPanel", managePhysicalTherapistJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageTherapistBtnActionPerformed

    private void manageClassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageClassBtnActionPerformed
        ManageCoachClassJPanel manageCoachClassJPanel = new ManageCoachClassJPanel(userProcessContainer, userAccount, enterprise, ecoSystem);
        userProcessContainer.add("manageCoachClassJPanel", manageCoachClassJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageClassBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton manageClassBtn;
    private javax.swing.JButton manageFoodBtn;
    private javax.swing.JButton manageOrderBtn;
    private javax.swing.JButton manageTherapistBtn;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
