package MyDictionaryApp;

/**
 *
 * @author Dũng Sobin
 */
import dictionary_organization.EntityWord;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import sqlserver.dung.ConnectToNoteSQL;


public class ShowNoteWord extends javax.swing.JFrame {

    private ConnectToNoteSQL conNote = new ConnectToNoteSQL();

    public ShowNoteWord() {
        initComponents();
        setDefaultCloseOperation(this.HIDE_ON_CLOSE);
        Toolkit toolkit = this.getToolkit();
        Dimension size = toolkit.getScreenSize();
        this.setLocation(size.width / 2 - this.getWidth() / 2,
                size.height / 2 - this.getHeight() / 2);
    }

    private String parseMeaning(String means) {
        String parse = "";
        for (int i = 0; i < means.length(); i++) {
            char c = means.charAt(i);
            if (isDelimiter(c)) {
                parse += "\n" + c;
            } else {
                parse += c;
            }
        }
        return parse;
    }

    private boolean isDelimiter(char c) {
        return c == '*' || c == '-' || c == '='  || c == '+';
    }

    public void setText(EntityWord e) {
        jTextWord.setText(e.getWord());
        jTextPhonetic.setText(e.getPhonetic());
        jTextMeaning.setText(parseMeaning(e.getMeans()));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTextWord = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextPhonetic = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextMeaning = new javax.swing.JTextArea();
        btnEditNote = new javax.swing.JButton();
        btnCancelNote = new javax.swing.JButton();
        btnSaveNoe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(36, 42, 46));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextWord.setEditable(false);
        jTextWord.setBackground(new java.awt.Color(253, 200, 47));
        jTextWord.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jPanel2.add(jTextWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 41, 414, 38));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(253, 200, 47));
        jLabel4.setText("Phonetic");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 91, 65, 38));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(253, 200, 47));
        jLabel5.setText("Meaning");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 143, 65, 38));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(253, 200, 47));
        jLabel6.setText("Word");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 39, 65, 38));

        jTextPhonetic.setEditable(false);
        jTextPhonetic.setBackground(new java.awt.Color(253, 200, 47));
        jTextPhonetic.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jPanel2.add(jTextPhonetic, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 90, 414, 42));

        jTextMeaning.setEditable(false);
        jTextMeaning.setBackground(new java.awt.Color(253, 200, 47));
        jTextMeaning.setColumns(20);
        jTextMeaning.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jTextMeaning.setRows(5);
        jScrollPane2.setViewportView(jTextMeaning);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 143, 414, 319));

        btnEditNote.setBackground(new java.awt.Color(253, 200, 47));
        btnEditNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_edit_30px_4.png"))); // NOI18N
        btnEditNote.setToolTipText("Sửa từ");
        btnEditNote.setBorder(null);
        btnEditNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditNoteActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 85, 45));

        btnCancelNote.setBackground(new java.awt.Color(253, 200, 47));
        btnCancelNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_cancel_30px_2.png"))); // NOI18N
        btnCancelNote.setToolTipText("Thoát");
        btnCancelNote.setBorder(null);
        btnCancelNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelNoteActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, 85, 45));

        btnSaveNoe.setBackground(new java.awt.Color(253, 200, 47));
        btnSaveNoe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_save_30px.png"))); // NOI18N
        btnSaveNoe.setToolTipText("Lưu");
        btnSaveNoe.setBorder(null);
        btnSaveNoe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveNoeActionPerformed(evt);
            }
        });
        jPanel2.add(btnSaveNoe, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, 85, 45));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelNoteActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelNoteActionPerformed

    private void btnEditNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditNoteActionPerformed
        jTextPhonetic.setEditable(true);
        jTextMeaning.setEditable(true);
    }//GEN-LAST:event_btnEditNoteActionPerformed

    private void btnSaveNoeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveNoeActionPerformed
        EntityWord e = new EntityWord(jTextWord.getText(), jTextPhonetic.getText().trim(), jTextMeaning.getText().trim());
        if (jTextWord.getText().trim().length() != 0) {
            conNote.insertWord(e);
            conNote.updateWord(e);
            JOptionPane.showMessageDialog(this, "Lưu từ thành công", "Thông báo", JOptionPane.DEFAULT_OPTION);

        } else {
            JOptionPane.showMessageDialog(this, "Không bỏ trống từ", "Thông báo", JOptionPane.DEFAULT_OPTION);
        }
    }//GEN-LAST:event_btnSaveNoeActionPerformed

    public void settingAddWordToNote() {
        jTextWord.setEditable(true);
        jTextPhonetic.setEditable(true);
        jTextMeaning.setEditable(true);
    }

    public EntityWord getEntityWord() {
        return new EntityWord(jTextWord.getText(), jTextPhonetic.getText().trim(), jTextMeaning.getText().trim());
    }
    /**
     * @param args the command line arguments
     */

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ShowNoteWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ShowNoteWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ShowNoteWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ShowNoteWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ShowNoteWord().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelNote;
    private javax.swing.JButton btnEditNote;
    private javax.swing.JButton btnSaveNoe;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextMeaning;
    private javax.swing.JTextField jTextPhonetic;
    private javax.swing.JTextField jTextWord;
    // End of variables declaration//GEN-END:variables
}
