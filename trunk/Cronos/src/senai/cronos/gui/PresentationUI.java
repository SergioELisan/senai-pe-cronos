/*
 * PresentationUI.java
 *
 * Created on 22/12/2011, 09:15:28
 */
package senai.cronos.gui;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import senai.cronos.gui.custom.ImageLoader;

/**
 *
 * @author Serginho
 */
public class PresentationUI extends javax.swing.JPanel {

    public CronosFrame main;
    
    public PresentationUI(CronosFrame main) {
        this.main = main;
        initComponents();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        
        Image wallpaper = ImageLoader.loadBackground();
        if (wallpaper != null) {
            g.drawImage(wallpaper, 0, 0, null);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        homeButton = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1366, 728));
        setMinimumSize(new java.awt.Dimension(1024, 728));
        setPreferredSize(new java.awt.Dimension(1366, 728));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senai/cronos/gui/images/logo.jpg"))); // NOI18N
        jLabel2.setText("Cronos - gerenciamento de horários");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setIconTextGap(16);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jPanel1.setOpaque(false);

        homeButton.setBackground(ColorManager.getColor("button"));
        homeButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        homeButton.setForeground(new java.awt.Color(255, 255, 255));
        homeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/senai/cronos/gui/images/home.png"))); // NOI18N
        homeButton.setText("INICIAR");
        homeButton.setMaximumSize(new java.awt.Dimension(120, 40));
        homeButton.setMinimumSize(new java.awt.Dimension(120, 40));
        homeButton.setOpaque(true);
        homeButton.setPreferredSize(new java.awt.Dimension(120, 40));
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonMouseClicked(evt);
            }
        });
        jPanel1.add(homeButton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1342, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1342, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(327, 327, 327))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseClicked
        main.Switch(CronosFrame.HOME);
    }//GEN-LAST:event_homeButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel homeButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
