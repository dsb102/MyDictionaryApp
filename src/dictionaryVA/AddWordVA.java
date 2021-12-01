package dictionaryVA;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class AddWordVA extends javax.swing.JFrame {
    
    public AddWordVA() {
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

        addEV = new javax.swing.JPanel();
        text = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        mean = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        OK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addEV.setBackground(new java.awt.Color(36, 42, 46));

        text.setBackground(new java.awt.Color(253, 200, 47));

        mean.setBackground(new java.awt.Color(253, 200, 47));
        mean.setColumns(20);
        mean.setRows(5);
        jScrollPane1.setViewportView(mean);

        jLabel2.setBackground(new java.awt.Color(253, 200, 47));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(253, 200, 47));
        jLabel2.setText("   Nghĩa");

        jLabel3.setBackground(new java.awt.Color(253, 200, 47));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(253, 200, 47));
        jLabel3.setText("      Từ");

        OK.setBackground(new java.awt.Color(253, 200, 47));
        OK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        OK.setText("Xong");
        OK.setBorder(null);
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addEVLayout = new javax.swing.GroupLayout(addEV);
        addEV.setLayout(addEVLayout);
        addEVLayout.setHorizontalGroup(
            addEVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addEVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addEVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(text))
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addEVLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        addEVLayout.setVerticalGroup(
            addEVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEVLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(addEVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addEVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(addEV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addEV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
        String word = text.getText().trim();
        String means = mean.getText();
        Dictionary dic = new Dictionary();
        try {
            dic.loadWordFromFile();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AddWordVA.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (word.length() != 0 && !dic.containWord(word)) {
            dic.addWord(word, means);
            try {
                dic.importWordFromDicToFile();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AddWordVA.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Thêm từ thành công", "Thông báo", JOptionPane.DEFAULT_OPTION);
            this.setVisible(false);
        }else if (dic.containWord(word)) {
            JOptionPane.showMessageDialog(this, "Từ này đã có trong từ điển", "Thông báo", JOptionPane.DEFAULT_OPTION);
        }else {
            JOptionPane.showMessageDialog(this, "Không được bỏ trống từ", "Thông báo", JOptionPane.DEFAULT_OPTION);
        }
    }//GEN-LAST:event_OKActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OK;
    private javax.swing.JPanel addEV;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea mean;
    private javax.swing.JTextField text;
    // End of variables declaration//GEN-END:variables
}
