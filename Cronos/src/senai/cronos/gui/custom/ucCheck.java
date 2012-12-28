/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package senai.cronos.gui.custom;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import senai.cronos.entidades.UnidadeCurricular;

import senai.cronos.util.Acumulador;

/**
 *
 * @author Carlos Melo
 */
public class ucCheck extends javax.swing.JPanel {

    UnidadeCurricular u = new UnidadeCurricular();
    Acumulador acc = new Acumulador();

    public JCheckBox getCheckUc() {
        return checkUc;
    }

    /**
     * Creates new form ucCheck
     */
    public ucCheck(UnidadeCurricular uc, Acumulador acc) {
        initComponents();
        this.u = uc;
        nomeUc.setText(uc.getNome());
        ucCH.setText("C.H.:" + String.valueOf(uc.getCargaHoraria()));
        this.acc = acc;
    }

    public UnidadeCurricular getU() {
        return u;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeUc = new javax.swing.JLabel();
        ucCH = new javax.swing.JLabel();
        checkUc = new javax.swing.JCheckBox();

        setMaximumSize(new java.awt.Dimension(630, 43));
        setMinimumSize(new java.awt.Dimension(630, 43));
        setPreferredSize(new java.awt.Dimension(630, 43));

        nomeUc.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        ucCH.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        checkUc.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        checkUc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                checkUcMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeUc, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ucCH, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkUc)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ucCH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkUc)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(nomeUc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkUcMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkUcMousePressed
        acc.add(u.getCargaHoraria());
        // ch.setAcumulador(u.getCargaHoraria());
    }

    public String getNomeUc() {
        return nomeUc.getText();
    }//GEN-LAST:event_checkUcMousePressed

    public void setCheckUc(boolean estado) {
        this.checkUc.setSelected(estado);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkUc;
    private javax.swing.JLabel nomeUc;
    private javax.swing.JLabel ucCH;
    // End of variables declaration//GEN-END:variables
}
