/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MarketCashierRole;

import userinterface.FitnessCoachRole.*;
import Business.Coachclass.CoachClass;
import Business.Coachclass.CoachClassdirectory;
import userinterface.ManagerRole.*;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.MarketCoEnterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Business.foods.Food;
import java.awt.CardLayout;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class CreatefoodJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     */
    private JPanel container;
    private MarketCoEnterprise enterprise;

    CreatefoodJPanel(JPanel userProcessContainer, MarketCoEnterprise enterprise) {
        initComponents();
        this.container = userProcessContainer;
        this.enterprise = enterprise;

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
        nameJTextField1 = new javax.swing.JTextField();
        nameJTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nameJTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(111, 158, 159));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createUserJButton.setBackground(new java.awt.Color(255, 255, 255));
        createUserJButton.setText("Put on shelf");
        createUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserJButtonActionPerformed(evt);
            }
        });
        add(createUserJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, 159, 68));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Stock: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 314, -1, -1));

        backjButton1.setBackground(new java.awt.Color(255, 255, 255));
        backjButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });
        add(backjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 480, 112, 55));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("Food Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 177, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 207, -1, -1));

        nameJTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameJTextField1ActionPerformed(evt);
            }
        });
        add(nameJTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 308, 146, 39));

        nameJTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameJTextField2ActionPerformed(evt);
            }
        });
        add(nameJTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 177, 146, 37));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        jLabel6.setText("Add New Food :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 96, -1, -1));

        nameJTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameJTextField3ActionPerformed(evt);
            }
        });
        add(nameJTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 240, 146, 39));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setText("Price: ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 246, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void createUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserJButtonActionPerformed

        if (!(nameJTextField2.getText().equals("") || nameJTextField1.getText().equals("")|| nameJTextField3.getText().equals(""))) {
            if (Integer.parseInt(nameJTextField1.getText()) < 200 && Integer.parseInt(nameJTextField1.getText()) > 0
                    && Double.parseDouble(nameJTextField3.getText()) < 10000 && Double.parseDouble(nameJTextField3.getText()) >0) {
                Food f =new Food();
                f.setName(nameJTextField2.getText());
                f.setPrice(Double.parseDouble(nameJTextField3.getText()));
                f.setStock(Integer.parseInt(nameJTextField1.getText()));
                f.setStatus(true);
                enterprise.getFoodlist().add(f);
                
                JOptionPane.showMessageDialog(null, "Class  created successfully !");

                container.remove(this);
                CardLayout layout = (CardLayout) container.getLayout();
                layout.previous(container);

            } else {
                JOptionPane.showMessageDialog(null, "Stock  must between 1-200 !\n Price must be number ! ");

            }
        } else {
            JOptionPane.showMessageDialog(null, "please fill all fields !");

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

    private void nameJTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameJTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameJTextField2ActionPerformed

    private void nameJTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameJTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameJTextField3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton createUserJButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nameJTextField1;
    private javax.swing.JTextField nameJTextField2;
    private javax.swing.JTextField nameJTextField3;
    // End of variables declaration//GEN-END:variables
}
