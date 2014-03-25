/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package foot;

import java.awt.Component;

/**
 *
 * @author p1100859
 */
public class Foot extends javax.swing.JFrame {

    /**
     * Creates new form Foot
     */
    public Foot() {
        initComponents();
        buttonRecommencer.setEnabled(false);
        pf = new PanelFoot();
        pane.add(pf);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pane = new javax.swing.JPanel();
        buttonHaut = new javax.swing.JButton();
        buttonBas = new javax.swing.JButton();
        buttonPatate = new javax.swing.JButton();
        buttonRecommencer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("S O R T E     D E     B A B Y F O O T");
        setResizable(false);

        pane.setLayout(new java.awt.GridLayout(1, 0));

        buttonHaut.setText("Haut");
        buttonHaut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHautActionPerformed(evt);
            }
        });

        buttonBas.setText("Bas");
        buttonBas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBasActionPerformed(evt);
            }
        });

        buttonPatate.setText("Patate tout droit");
        buttonPatate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPatateActionPerformed(evt);
            }
        });

        buttonRecommencer.setText("Recommencer");
        buttonRecommencer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRecommencerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pane, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(buttonHaut)
                .addGap(18, 18, 18)
                .addComponent(buttonBas)
                .addGap(18, 18, 18)
                .addComponent(buttonPatate)
                .addGap(18, 18, 18)
                .addComponent(buttonRecommencer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pane, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonHaut)
                    .addComponent(buttonBas)
                    .addComponent(buttonPatate)
                    .addComponent(buttonRecommencer))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHautActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHautActionPerformed
        pf.haut();
        buttonRecommencer.setEnabled(true);
        buttonHaut.setEnabled(false);
        buttonBas.setEnabled(false);
        buttonPatate.setEnabled(false);
    }//GEN-LAST:event_buttonHautActionPerformed

    private void buttonBasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBasActionPerformed
        pf.bas();
        buttonRecommencer.setEnabled(true);
        buttonHaut.setEnabled(false);
        buttonBas.setEnabled(false);
        buttonPatate.setEnabled(false);
    }//GEN-LAST:event_buttonBasActionPerformed

    private void buttonPatateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPatateActionPerformed
        pf.patate();
        buttonRecommencer.setEnabled(true);
        buttonHaut.setEnabled(false);
        buttonBas.setEnabled(false);
        buttonPatate.setEnabled(false);
    }//GEN-LAST:event_buttonPatateActionPerformed

    private void buttonRecommencerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRecommencerActionPerformed
       pf.recommencer();
       buttonRecommencer.setEnabled(false);
       buttonHaut.setEnabled(true);
       buttonBas.setEnabled(true);
       buttonPatate.setEnabled(true);
    }//GEN-LAST:event_buttonRecommencerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Foot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Foot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Foot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Foot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Foot().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBas;
    private javax.swing.JButton buttonHaut;
    private javax.swing.JButton buttonPatate;
    private javax.swing.JButton buttonRecommencer;
    private javax.swing.JPanel pane;
    // End of variables declaration//GEN-END:variables
    PanelFoot pf;
}