/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SankalpaSolutions.chamil.racebyrace.view;

import SankalpaSolutions.chamil.racebyrace.controller.AccountController;
import SankalpaSolutions.chamil.racebyrace.controller.CenterController;
import SankalpaSolutions.chamil.racebyrace.controller.PacketController;
import SankalpaSolutions.chamil.racebyrace.model.Center;
import SankalpaSolutions.chamil.racebyrace.model.Packet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Chamil123
 */
public class RegisterPacket extends javax.swing.JPanel {

    String center_id;

    /**
     * Creates new form addCenter
     */
    public RegisterPacket() {
        initComponents();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        jDateChooser1.setDate(date);
        jTable10.setVisible(false);
        jScrollPane6.setVisible(false);

        loadPacket();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(236, 239, 244));
        setMaximumSize(new java.awt.Dimension(1130, 590));
        setMinimumSize(new java.awt.Dimension(1130, 590));
        setPreferredSize(new java.awt.Dimension(1130, 590));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Center registration");

        jPanel1.setLayout(null);

        jTable10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable10.setRowHeight(18);
        jTable10.getTableHeader().setReorderingAllowed(false);
        jTable10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable10MousePressed(evt);
            }
        });
        jTable10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable10KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable10KeyReleased(evt);
            }
        });
        jScrollPane6.setViewportView(jTable10);
        if (jTable10.getColumnModel().getColumnCount() > 0) {
            jTable10.getColumnModel().getColumn(0).setMinWidth(150);
            jTable10.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable10.getColumnModel().getColumn(1).setMinWidth(50);
            jTable10.getColumnModel().getColumn(1).setMaxWidth(50);
            jTable10.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane6);
        jScrollPane6.setBounds(260, 60, 350, 100);

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Packet ID", "Date", "Center Name", "Full collection", "Account name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(22);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(100);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(80);
            jTable1.getColumnModel().getColumn(1).setMinWidth(100);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(90);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 110, 1076, 410);

        jPanel2.setBackground(new java.awt.Color(186, 186, 186));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setMinimumSize(new java.awt.Dimension(1050, 66));
        jPanel2.setPreferredSize(new java.awt.Dimension(878, 174));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Account :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 16, 78, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText(" Account Type :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 16, 88, -1));

        jTextField2.setBackground(new java.awt.Color(255, 204, 102));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 36, 290, 24));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText(" Account Type :");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 16, 88, -1));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 36, 213, 26));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText(" Account Type :");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 12, 88, 15));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 35, 160, 24));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(972, 33, 80, 28));
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 36, 220, 27));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1070, 90);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable10KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable10KeyReleased

    private void jTable10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable10KeyPressed
        if (evt.getKeyCode() == 10) {
            try {

                int Row = jTable10.getSelectedRow();
                jTextField2.setText(jTable10.getValueAt(Row, 0).toString());
                center_id = jTable10.getValueAt(Row, 1).toString();
                jLabel2.setText(jTable10.getValueAt(Row, 2).toString());
                jScrollPane6.setVisible(false);
                jTable10.setVisible(false);

                jTextField4.grabFocus();

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }


    }//GEN-LAST:event_jTable10KeyPressed

    private void jTable10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable10MousePressed

    }//GEN-LAST:event_jTable10MousePressed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        DefaultTableModel dtm = (DefaultTableModel) jTable10.getModel();

        try {
            if (jTextField2.getText().trim().length() != 0) {
                List<Center> centerList = CenterController.sercLikeCenterNameAndCenterID(jTextField2.getText().trim());
                String account;

                dtm.setRowCount(0);
                if (centerList != null) {
                    for (int i = 0; i < centerList.size(); i++) {
                        account = AccountController.searchAccountById("" + centerList.get(i).getAccount_ID());
                        //System.out.println("dasd : " + centerList.get(i).getCenter_ID());
                        Vector v = new Vector();
                        v.add(centerList.get(i).getCenter_Name());
                        v.add(centerList.get(i).getCenter_ID());
                        v.add(account);

                        dtm.addRow(v);
                        jScrollPane6.setVisible(true);
                        jTable10.setVisible(true);

                    }

                    if (dtm.getRowCount() == 0) {
                        jScrollPane6.setVisible(false);
                        jTable10.setVisible(false);
                    } else {
                        jScrollPane6.setVisible(true);
                        jTable10.setVisible(true);
                    }
                }
                centerList = null;
            } else {
                dtm.setRowCount(0);
                jScrollPane6.setVisible(false);
                jTable10.setVisible(false);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegisterPacket.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RegisterPacket.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        if (evt.getKeyCode() == 40) {
            if (jTextField2.getText().length() != 0) {
                jTable10.grabFocus();
                ListSelectionModel selectionModel = jTable10.getSelectionModel();
                selectionModel.setSelectionInterval(0, 0);
            } else {
                jScrollPane6.setVisible(false);
                jTable10.setVisible(false);
            }

        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost

    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        jTextField2.selectAll();
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        jButton1.grabFocus();
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date dt1 = jDateChooser1.getDate();

            String date = sdf.format(dt1);

            Date dates = sdf.parse(date);
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            if (date.length() != 0 && jTextField2.getText().length() != 0 && jTextField4.getText().length() != 0) {

                int searchExcisting = PacketController.searchpacketByDateAndId(dates, Integer.parseInt(center_id));
                if (searchExcisting > 0) {
                    JOptionPane.showMessageDialog(null, jTextField2.getText() + " Packet is currently added");
                } else {
                    Packet packet = new Packet(null, Integer.parseInt(center_id), dates, Double.parseDouble(jTextField4.getText()));
                    try {
                        PacketController.addPacket(packet);
                        loadPacket();
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(RegisterPacket.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(RegisterPacket.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
        } catch (ParseException ex) {
            Logger.getLogger(RegisterPacket.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RegisterPacket.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegisterPacket.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1KeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        int row = jTable1.getSelectedRow();
        String packetId = dtm.getValueAt(row, 1).toString();

        UpdatePacket dialog = new UpdatePacket(new javax.swing.JFrame(), true, packetId);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
        });
        dialog.setVisible(true);
    }//GEN-LAST:event_jTable1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

    private void loadPacket() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dt1 = jDateChooser1.getDate();
        String date = sdf.format(dt1);
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            List<Packet> list = PacketController.serchAllItem(date);

            dtm.setRowCount(0);
            int item = 1;
            for (Packet e : list) {
                String center_name = CenterController.getCenterNameByID(e.getCenter_ID());
                String account_name = CenterController.getAccountNameByCenterID(e.getCenter_ID());
                // catName = CategoryController.get(e.getCategory_id().getId());
                Object[] row = {item,e.getPacket_ID(), e.getPacket_Date(), center_name, e.getPacket_FC(), account_name};
                dtm.addRow(row);
                item++;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegisterPacket.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RegisterPacket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
