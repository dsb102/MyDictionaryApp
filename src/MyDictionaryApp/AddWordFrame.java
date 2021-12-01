package MyDictionaryApp;

import dictionary_organization.EntityWord;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import sqlserver.dung.ConnectToSQL;


public class AddWordFrame extends javax.swing.JFrame {

    public AddWordFrame() {
        initComponents();
        setDefaultCloseOperation(this.HIDE_ON_CLOSE);
        Toolkit toolkit = this.getToolkit();
        Dimension size = toolkit.getScreenSize();
        this.setLocation(size.width / 2 - this.getWidth() / 2,
                size.height / 2 - this.getHeight() / 2);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldAddWord = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldAddPhonetic = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAddMeaning = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 42, 46));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldAddWord.setBackground(new java.awt.Color(253, 200, 47));
        jTextFieldAddWord.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jPanel1.add(jTextFieldAddWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 41, 414, 38));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 200, 47));
        jLabel1.setText("Phonetic");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 91, 65, 38));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(253, 200, 47));
        jLabel2.setText("Meaning");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 143, 65, 38));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(253, 200, 47));
        jLabel3.setText("Word");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 39, 65, 38));

        jTextFieldAddPhonetic.setBackground(new java.awt.Color(253, 200, 47));
        jTextFieldAddPhonetic.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jPanel1.add(jTextFieldAddPhonetic, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 90, 414, 42));

        jTextAreaAddMeaning.setBackground(new java.awt.Color(253, 200, 47));
        jTextAreaAddMeaning.setColumns(20);
        jTextAreaAddMeaning.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jTextAreaAddMeaning.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAddMeaning);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 143, 414, 319));

        jButton2.setBackground(new java.awt.Color(253, 200, 47));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_save_30px_1.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 473, 85, 45));

        jButton3.setBackground(new java.awt.Color(253, 200, 47));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_cancel_30px_1.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 473, 85, 45));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            ConnectToSQL con = new ConnectToSQL();
            String jTextAddWord = jTextFieldAddWord.getText();
            String jTextAddPhonetic = jTextFieldAddPhonetic.getText();
            String jTexAddMeaning = "" + jTextAreaAddMeaning.getText();
            EntityWord e = new EntityWord(jTextAddWord, jTextAddPhonetic, jTexAddMeaning);
            if (jTextAddWord.split("\\s+").length != 1) {
                JOptionPane.showMessageDialog(this, "Chỉ thêm 1 từ", "Không cho phép", JOptionPane.ERROR_MESSAGE);
            } else if (jTextAddWord.trim().length() != 1 && jTextAddPhonetic.trim().length() != 0 && jTexAddMeaning.trim().length() != 0) {
                int x = JOptionPane.showConfirmDialog(this, "Bạn muốn thêm từ này?", "Confirm", JOptionPane.YES_NO_OPTION);
                if (x == JOptionPane.YES_OPTION) {
                    con.insertWord(e);
                    this.setVisible(false);
                    JOptionPane.showMessageDialog(this, "Thêm từ thành công", "Thông báo", JOptionPane.DEFAULT_OPTION);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Không được bỏ trống các ô", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {

            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaAddMeaning;
    private javax.swing.JTextField jTextFieldAddPhonetic;
    private javax.swing.JTextField jTextFieldAddWord;
    // End of variables declaration//GEN-END:variables
}
