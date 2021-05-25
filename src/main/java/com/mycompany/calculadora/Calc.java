
package com.mycompany.calculadora;

/**
 *
 * @author guimenoci
 */
public class Calc extends javax.swing.JFrame {

    /**
     * Creates new form Calc
     */
    public Calc() {
        super("Calculadora");
        initComponents();
        this.setLocationRelativeTo(null);
    }

   Double valor1, valor2;
   String sinal;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        visorTextField = new javax.swing.JTextField();
        seteButton = new javax.swing.JButton();
        oitoButton = new javax.swing.JButton();
        noveButton = new javax.swing.JButton();
        ceButton = new javax.swing.JButton();
        quatroButton = new javax.swing.JButton();
        cincoButton = new javax.swing.JButton();
        seisButton = new javax.swing.JButton();
        vezesButton = new javax.swing.JButton();
        umButton = new javax.swing.JButton();
        doisButton = new javax.swing.JButton();
        tresButton = new javax.swing.JButton();
        menosButton = new javax.swing.JButton();
        igualButton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        pontoButton = new javax.swing.JButton();
        maisButton = new javax.swing.JButton();
        cButton = new javax.swing.JButton();
        divisaoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        visorTextField.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        seteButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        seteButton.setText("7");
        seteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seteButtonActionPerformed(evt);
            }
        });

        oitoButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        oitoButton.setText("8");
        oitoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oitoButtonActionPerformed(evt);
            }
        });

        noveButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        noveButton.setText("9");
        noveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noveButtonActionPerformed(evt);
            }
        });

        ceButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ceButton.setText("CE");
        ceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceButtonActionPerformed(evt);
            }
        });

        quatroButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        quatroButton.setText("4");
        quatroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quatroButtonActionPerformed(evt);
            }
        });

        cincoButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cincoButton.setText("5");
        cincoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoButtonActionPerformed(evt);
            }
        });

        seisButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        seisButton.setText("6");
        seisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisButtonActionPerformed(evt);
            }
        });

        vezesButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        vezesButton.setText("*");
        vezesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vezesButtonActionPerformed(evt);
            }
        });

        umButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        umButton.setText("1");
        umButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umButtonActionPerformed(evt);
            }
        });

        doisButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        doisButton.setText("2");
        doisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doisButtonActionPerformed(evt);
            }
        });

        tresButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tresButton.setText("3");
        tresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresButtonActionPerformed(evt);
            }
        });

        menosButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        menosButton.setText("-");
        menosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosButtonActionPerformed(evt);
            }
        });

        igualButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        igualButton.setText("=");
        igualButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualButtonActionPerformed(evt);
            }
        });

        zeroButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        zeroButton.setText("0");
        zeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroButtonActionPerformed(evt);
            }
        });

        pontoButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pontoButton.setText(".");
        pontoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pontoButtonActionPerformed(evt);
            }
        });

        maisButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        maisButton.setText("+");
        maisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maisButtonActionPerformed(evt);
            }
        });

        cButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cButton.setText("C");
        cButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cButtonActionPerformed(evt);
            }
        });

        divisaoButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        divisaoButton.setText("/");
        divisaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisaoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(umButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(zeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pontoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(igualButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(maisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(visorTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(seteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(doisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(tresButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(85, 85, 85)
                                    .addComponent(menosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(oitoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(noveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(ceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(divisaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(quatroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cincoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(seisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(vezesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(visorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oitoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divisaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quatroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cincoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(umButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tresButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pontoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vezesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(igualButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(menosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(maisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroButtonActionPerformed
       
        //botão zero
        visorTextField.setText(visorTextField.getText() + "0");
        
    }//GEN-LAST:event_zeroButtonActionPerformed

    private void cButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cButtonActionPerformed
        valor1 = 0.0;
        valor2 = 0.0;
        visorTextField.setText("");
    }//GEN-LAST:event_cButtonActionPerformed

    private void umButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umButtonActionPerformed
        // botão 1
         visorTextField.setText(visorTextField.getText() + "1");
    }//GEN-LAST:event_umButtonActionPerformed

    private void doisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doisButtonActionPerformed
        //botão 2
         visorTextField.setText(visorTextField.getText() + "2");
    }//GEN-LAST:event_doisButtonActionPerformed

    private void tresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresButtonActionPerformed
        //botão 3
         visorTextField.setText(visorTextField.getText() + "3");
    }//GEN-LAST:event_tresButtonActionPerformed

    private void quatroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quatroButtonActionPerformed
        //botão 4
         visorTextField.setText(visorTextField.getText() + "4");
    }//GEN-LAST:event_quatroButtonActionPerformed

    private void cincoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoButtonActionPerformed
        //botão 5
         visorTextField.setText(visorTextField.getText() + "5");
    }//GEN-LAST:event_cincoButtonActionPerformed

    private void seisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisButtonActionPerformed
        //botão 6
         visorTextField.setText(visorTextField.getText() + "6");
    }//GEN-LAST:event_seisButtonActionPerformed

    private void seteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seteButtonActionPerformed
        //botão 7
         visorTextField.setText(visorTextField.getText() + "7");
    }//GEN-LAST:event_seteButtonActionPerformed

    private void oitoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oitoButtonActionPerformed
        //botão 8
         visorTextField.setText(visorTextField.getText() + "8");
    }//GEN-LAST:event_oitoButtonActionPerformed

    private void noveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noveButtonActionPerformed
        //botão 9
         visorTextField.setText(visorTextField.getText() + "9");
    }//GEN-LAST:event_noveButtonActionPerformed

    private void pontoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pontoButtonActionPerformed
        //ponto
         visorTextField.setText(visorTextField.getText() + ".");
    }//GEN-LAST:event_pontoButtonActionPerformed

    private void ceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceButtonActionPerformed
        visorTextField.setText("");
    }//GEN-LAST:event_ceButtonActionPerformed

    private void maisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maisButtonActionPerformed
        valor1 = Double.parseDouble(visorTextField.getText());
        visorTextField.setText("");
        sinal = "soma";
    }//GEN-LAST:event_maisButtonActionPerformed

    private void igualButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualButtonActionPerformed
        valor2 = Double.parseDouble(visorTextField.getText());
        if(sinal == "soma"){
            visorTextField.setText(String.valueOf(valor1 + valor2));
        }
        else if(sinal == "menos"){
            visorTextField.setText(String.valueOf(valor1 - valor2));
        }
        else if(sinal == "vezes"){
            visorTextField.setText(String.valueOf(valor1 * valor2));
        }
        else if(sinal == "divisao"){
            visorTextField.setText(String.valueOf(valor1 / valor2));
        }
    }//GEN-LAST:event_igualButtonActionPerformed

    private void menosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosButtonActionPerformed
        valor1 = Double.parseDouble(visorTextField.getText());
        visorTextField.setText("");
        sinal = "menos";
    }//GEN-LAST:event_menosButtonActionPerformed

    private void vezesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vezesButtonActionPerformed
        valor1 = Double.parseDouble(visorTextField.getText());
        visorTextField.setText("");
        sinal = "vezes";
    }//GEN-LAST:event_vezesButtonActionPerformed

    private void divisaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisaoButtonActionPerformed
       valor1 = Double.parseDouble(visorTextField.getText());
        visorTextField.setText("");
        sinal = "divisao";
    }//GEN-LAST:event_divisaoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cButton;
    private javax.swing.JButton ceButton;
    private javax.swing.JButton cincoButton;
    private javax.swing.JButton divisaoButton;
    private javax.swing.JButton doisButton;
    private javax.swing.JButton igualButton;
    private javax.swing.JButton maisButton;
    private javax.swing.JButton menosButton;
    private javax.swing.JButton noveButton;
    private javax.swing.JButton oitoButton;
    private javax.swing.JButton pontoButton;
    private javax.swing.JButton quatroButton;
    private javax.swing.JButton seisButton;
    private javax.swing.JButton seteButton;
    private javax.swing.JButton tresButton;
    private javax.swing.JButton umButton;
    private javax.swing.JButton vezesButton;
    private javax.swing.JTextField visorTextField;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables
}
