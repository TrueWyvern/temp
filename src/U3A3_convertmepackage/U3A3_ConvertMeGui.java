/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package U3A3_convertmepackage;

/**
 *
 * @author aipil3692
 */
public class U3A3_ConvertMeGui extends javax.swing.JFrame {

    static int convertionType = 0;
    
    /**
     * Creates new form U3A3_ConvertMeGui
     */
    public U3A3_ConvertMeGui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        metresToYards = new javax.swing.JButton();
        centimetresToFeet = new javax.swing.JButton();
        yardsToMetres = new javax.swing.JButton();
        feetToCentimetres = new javax.swing.JButton();
        mainTitle = new javax.swing.JLabel();
        milesToKilometres = new javax.swing.JButton();
        kilometresToMiles = new javax.swing.JButton();
        centimetresToInches = new javax.swing.JButton();
        inchesToCentimetres = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        metresToYards.setText("Metres To Yards");
        metresToYards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metresToYardsActionPerformed(evt);
            }
        });

        centimetresToFeet.setText("Centimetres To Feet");
        centimetresToFeet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centimetresToFeetActionPerformed(evt);
            }
        });

        yardsToMetres.setText("Yards To Metres");
        yardsToMetres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yardsToMetresActionPerformed(evt);
            }
        });

        feetToCentimetres.setText("Feet To Centimetres");
        feetToCentimetres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feetToCentimetresActionPerformed(evt);
            }
        });

        mainTitle.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        mainTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainTitle.setText("PLEASE SELECT THE CONVERSIONYOU WOULD LIKE TO USE");

        milesToKilometres.setText("Miles To Kilometres");
        milesToKilometres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                milesToKilometresActionPerformed(evt);
            }
        });

        kilometresToMiles.setText("Kilometres To Miles");
        kilometresToMiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kilometresToMilesActionPerformed(evt);
            }
        });

        centimetresToInches.setText("Centimetres To Inches");
        centimetresToInches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centimetresToInchesActionPerformed(evt);
            }
        });

        inchesToCentimetres.setText("Inches To Centimetres");
        inchesToCentimetres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inchesToCentimetresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(centimetresToFeet, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(metresToYards, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kilometresToMiles, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(centimetresToInches, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(milesToKilometres, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(feetToCentimetres, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yardsToMetres, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inchesToCentimetres, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(centimetresToInches, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inchesToCentimetres, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(feetToCentimetres, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(centimetresToFeet, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yardsToMetres, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(metresToYards, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(milesToKilometres, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(kilometresToMiles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yardsToMetresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yardsToMetresActionPerformed
        convertionType = 7;
    }//GEN-LAST:event_yardsToMetresActionPerformed

    private void milesToKilometresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_milesToKilometresActionPerformed
        convertionType = 8;
    }//GEN-LAST:event_milesToKilometresActionPerformed

    private void kilometresToMilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kilometresToMilesActionPerformed
        convertionType = 4;
    }//GEN-LAST:event_kilometresToMilesActionPerformed

    private void centimetresToInchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centimetresToInchesActionPerformed
        convertionType = 1;
    }//GEN-LAST:event_centimetresToInchesActionPerformed

    private void inchesToCentimetresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inchesToCentimetresActionPerformed
        convertionType = 5;
    }//GEN-LAST:event_inchesToCentimetresActionPerformed

    private void centimetresToFeetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centimetresToFeetActionPerformed
        convertionType = 2;
    }//GEN-LAST:event_centimetresToFeetActionPerformed

    private void feetToCentimetresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feetToCentimetresActionPerformed
        convertionType = 6;
    }//GEN-LAST:event_feetToCentimetresActionPerformed

    private void metresToYardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metresToYardsActionPerformed
        convertionType = 3;  
    }//GEN-LAST:event_metresToYardsActionPerformed

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
            java.util.logging.Logger.getLogger(U3A3_ConvertMeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(U3A3_ConvertMeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(U3A3_ConvertMeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(U3A3_ConvertMeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new U3A3_ConvertMeGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton centimetresToFeet;
    private javax.swing.JButton centimetresToInches;
    private javax.swing.JButton feetToCentimetres;
    private javax.swing.JButton inchesToCentimetres;
    private javax.swing.JButton kilometresToMiles;
    private javax.swing.JLabel mainTitle;
    private javax.swing.JButton metresToYards;
    private javax.swing.JButton milesToKilometres;
    private javax.swing.JButton yardsToMetres;
    // End of variables declaration//GEN-END:variables
}
