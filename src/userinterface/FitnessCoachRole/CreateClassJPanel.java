/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FitnessCoachRole;

import Business.Coachclass.CoachClass;
import Business.Coachclass.CoachClassdirectory;
import userinterface.ManagerRole.*;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FitnessCoEnterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class CreateClassJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     */
    private JPanel container;
    private FitnessCoEnterprise enterprise;
    private UserAccount userAccount;

    CreateClassJPanel(JPanel userProcessContainer,UserAccount userAccount, Enterprise enterprise) {
        initComponents();
        this.container = userProcessContainer;
        this.enterprise = (FitnessCoEnterprise) enterprise;
        this.userAccount = userAccount;

//        nameJTextField1.setEnabled(false);
        jLabel6.setText("Class By Coach:   " + userAccount.getUsername());

//        roleJComboBox.addItem(cc.getTime());
//        nameJTextField2.setText(cc.getClassname());
//        nameJTextField1.setText(String.valueOf(cc.getCapacity()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createUserJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        backjButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox();
        nameJTextField1 = new javax.swing.JTextField();
        nameJTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(111, 158, 159));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createUserJButton.setBackground(new java.awt.Color(255, 255, 255));
        createUserJButton.setText("Create");
        createUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserJButtonActionPerformed(evt);
            }
        });
        add(createUserJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 110, 60));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Capacity: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 277, -1, -1));

        backjButton1.setBackground(new java.awt.Color(255, 255, 255));
        backjButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });
        add(backjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 502, 112, 56));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("Class Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 212, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Time:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 328, -1, -1));

        roleJComboBox.setBackground(new java.awt.Color(255, 255, 255));
        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roleJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleJComboBoxActionPerformed(evt);
            }
        });
        add(roleJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 329, 146, -1));

        nameJTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameJTextField1ActionPerformed(evt);
            }
        });
        add(nameJTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 271, 146, 39));

        nameJTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameJTextField2ActionPerformed(evt);
            }
        });
        add(nameJTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 212, 146, 37));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel6.setText("Class by xxx :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void createUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserJButtonActionPerformed

        CoachClass cc = new CoachClass();
        if (!(nameJTextField2.getText().equals("") || nameJTextField1.getText().equals(""))) {
            if (Integer.parseInt(nameJTextField1.getText()) < 200 && Integer.parseInt(nameJTextField1.getText()) > 0) {
                cc.setClassname(nameJTextField2.getText());
                cc.setCapacity(Integer.parseInt(nameJTextField1.getText()));
                cc.setCoach(userAccount.getUsername());
//        cc.setTime(time);
                userAccount.getClasslist().add(cc);
                enterprise.getAllClassList().add(cc);
                JOptionPane.showMessageDialog(null, "Class  created successfully !");

                container.remove(this);
                CardLayout layout = (CardLayout) container.getLayout();
                layout.previous(container);
                
            } else {
                JOptionPane.showMessageDialog(null, "Capacity  must between 1-200 !");

            }
        } else {
            JOptionPane.showMessageDialog(null, "please fill all items !");

        }


    }//GEN-LAST:event_createUserJButtonActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void nameJTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameJTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameJTextField1ActionPerformed

    private void roleJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleJComboBoxActionPerformed

    private void nameJTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameJTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameJTextField2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton createUserJButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nameJTextField1;
    private javax.swing.JTextField nameJTextField2;
    private javax.swing.JComboBox roleJComboBox;
    // End of variables declaration//GEN-END:variables
}
