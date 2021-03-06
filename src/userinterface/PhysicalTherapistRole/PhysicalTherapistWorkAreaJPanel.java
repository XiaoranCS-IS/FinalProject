/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PhysicalTherapistRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Organization.Organization;
import Business.Organization.PhysicalTherapistOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class PhysicalTherapistWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private PhysicalTherapistOrganization labOrganization;

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public PhysicalTherapistWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.labOrganization = (PhysicalTherapistOrganization) organization;

        populateTable();
        jLabel1.setText("Therapist " + userAccount.getUsername() + "'s order: ");
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender();
            row[2] = request.getReceiver();
            row[3] = request.getStatus();

            model.addRow(row);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(111, 158, 159));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Customer", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 610, 250));

        assignJButton.setBackground(new java.awt.Color(255, 255, 255));
        assignJButton.setText("Go to therapy");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, -1, 60));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Therapist  xxx 's order: ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/推拿2.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select an order from table", "Warning", JOptionPane.WARNING_MESSAGE);

        }

        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        if (request.getStatus().equals("Therapy-finished")) {
                JOptionPane.showMessageDialog(null, "Therapy already compeleted !", "Warning", JOptionPane.WARNING_MESSAGE);

            } else {
                request.setStatus("Therapy-finished");
                                DB4OUtil.getInstance().storeSystem(business);

                populateTable();
            }


    }//GEN-LAST:event_assignJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
