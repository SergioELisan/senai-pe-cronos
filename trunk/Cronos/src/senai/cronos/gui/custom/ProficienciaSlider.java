/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package senai.cronos.gui.custom;

import javax.swing.JSlider;
import senai.cronos.CronosAPI;
import senai.cronos.entidades.Docente;
import senai.cronos.entidades.Proficiencia;
import senai.cronos.entidades.UnidadeCurricular;

/**
 *
 * @author Carlos Melo
 */
public class ProficienciaSlider extends javax.swing.JPanel {

    /**
     * Creates new form Linha
     */
    public ProficienciaSlider(Proficiencia prof) {
        initComponents();
        this.proficiencia = prof;
        lbDisciplina.setText(prof.getDisciplina().getNome());
        slider.setValue(prof.getLecionado());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbDisciplina = new javax.swing.JLabel();
        slider = new javax.swing.JSlider();

        setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        setMaximumSize(new java.awt.Dimension(400, 45));
        setMinimumSize(new java.awt.Dimension(400, 45));

        lbDisciplina.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lbDisciplina.setText("Unidade curricular");

        slider.setMaximum(10);
        slider.setMinimum(1);
        slider.setMinorTickSpacing(1);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setSnapToTicks(true);
        slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(slider, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStateChanged
        JSlider sld = (JSlider) evt.getSource();
        proficiencia.setLecionado(sld.getValue());
    }//GEN-LAST:event_sliderStateChanged

    public Proficiencia getProficiencia() {
        return proficiencia;
    }
    private Proficiencia proficiencia;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbDisciplina;
    private javax.swing.JSlider slider;
    // End of variables declaration//GEN-END:variables
}
