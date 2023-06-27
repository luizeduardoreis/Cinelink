/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import Utils.Constants;
import classes.Sessao;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author maxwell
 */
public class ListagemDeFilmesDinamica extends javax.swing.JFrame {

    public static int filmeIndex;
    
    /**
     * Creates new form ListagemDeFilmesDinamica
     */
    public ListagemDeFilmesDinamica() {
        initComponents();
        this.filmeIndex = 0;
        this.changeMovie();
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnFilmeAnterior = new javax.swing.JButton();
        btnProximoFilme = new javax.swing.JButton();
        tb1 = new javax.swing.JPanel();
        lblCartazFilme = new javax.swing.JLabel();
        lblTituloFilme = new javax.swing.JLabel();
        btnSessaoQuatorzeHorasDub = new javax.swing.JButton();
        lblSessoesDub = new javax.swing.JLabel();
        btnSessaoQuinzeETrintaDub = new javax.swing.JButton();
        btnSessaoDezesseteHorasDub = new javax.swing.JButton();
        btnSessaoDezenoveETrintaDub = new javax.swing.JButton();
        btnSessaoVinteEUmaDub = new javax.swing.JButton();
        btnSessaoVinteEDuasETrintaDub = new javax.swing.JButton();
        btnSessaoQuatorzeHorasLeg = new javax.swing.JButton();
        lblSessoesLeg = new javax.swing.JLabel();
        btnSessaoQuinzeETrintaLeg = new javax.swing.JButton();
        btnSessaoDezesseteHorasLeg = new javax.swing.JButton();
        btnSessaoDezenoveETrintaLeg = new javax.swing.JButton();
        btnSessaoVinteEUmaLeg = new javax.swing.JButton();
        btnSessaoVinteEDuasETrintaLeg = new javax.swing.JButton();
        lblClassificacaoIndicativa = new javax.swing.JLabel();
        lblClassificacaoIndicativaIdade = new javax.swing.JLabel();
        lblEstreia = new javax.swing.JLabel();
        lblEstreiaData = new javax.swing.JLabel();
        lblDiretor = new javax.swing.JLabel();
        lblDiretorNome = new javax.swing.JLabel();
        lblAvaliacaoDoPublico = new javax.swing.JLabel();
        lblAvaliacaoDoPublicoNum = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSinopse = new javax.swing.JTextPane();
        jPanel4 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        btnFilmeAnterior.setText("Filme Anterior");
        btnFilmeAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilmeAnteriorActionPerformed(evt);
            }
        });

        btnProximoFilme.setText("Próximo Filme");
        btnProximoFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoFilmeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFilmeAnterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 480, Short.MAX_VALUE)
                .addComponent(btnProximoFilme)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFilmeAnterior)
                    .addComponent(btnProximoFilme))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 750, 80));

        lblCartazFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/filme1.png"))); // NOI18N

        lblTituloFilme.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        lblTituloFilme.setText("Uma Incrível Jornada Espacial");

        btnSessaoQuatorzeHorasDub.setText("14:00");
        btnSessaoQuatorzeHorasDub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSessaoQuatorzeHorasDubActionPerformed(evt);
            }
        });

        lblSessoesDub.setText("Sessões dubladas disponíveis:");

        btnSessaoQuinzeETrintaDub.setText("15:30");
        btnSessaoQuinzeETrintaDub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSessaoQuinzeETrintaDubActionPerformed(evt);
            }
        });

        btnSessaoDezesseteHorasDub.setText("17:00");
        btnSessaoDezesseteHorasDub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSessaoDezesseteHorasDubActionPerformed(evt);
            }
        });

        btnSessaoDezenoveETrintaDub.setText("19:30");
        btnSessaoDezenoveETrintaDub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSessaoDezenoveETrintaDubActionPerformed(evt);
            }
        });

        btnSessaoVinteEUmaDub.setText("21:00");
        btnSessaoVinteEUmaDub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSessaoVinteEUmaDubActionPerformed(evt);
            }
        });

        btnSessaoVinteEDuasETrintaDub.setText("22:30");
        btnSessaoVinteEDuasETrintaDub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSessaoVinteEDuasETrintaDubActionPerformed(evt);
            }
        });

        btnSessaoQuatorzeHorasLeg.setText("14:00");
        btnSessaoQuatorzeHorasLeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSessaoQuatorzeHorasLegActionPerformed(evt);
            }
        });

        lblSessoesLeg.setText("Sessões legendadas disponíveis:");

        btnSessaoQuinzeETrintaLeg.setText("15:30");
        btnSessaoQuinzeETrintaLeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSessaoQuinzeETrintaLegActionPerformed(evt);
            }
        });

        btnSessaoDezesseteHorasLeg.setText("17:00");
        btnSessaoDezesseteHorasLeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSessaoDezesseteHorasLegActionPerformed(evt);
            }
        });

        btnSessaoDezenoveETrintaLeg.setText("19:30");
        btnSessaoDezenoveETrintaLeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSessaoDezenoveETrintaLegActionPerformed(evt);
            }
        });

        btnSessaoVinteEUmaLeg.setText("21:00");
        btnSessaoVinteEUmaLeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSessaoVinteEUmaLegActionPerformed(evt);
            }
        });

        btnSessaoVinteEDuasETrintaLeg.setText("22:30");
        btnSessaoVinteEDuasETrintaLeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSessaoVinteEDuasETrintaLegActionPerformed(evt);
            }
        });

        lblClassificacaoIndicativa.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblClassificacaoIndicativa.setText("Classificação Indicativa:");

        lblClassificacaoIndicativaIdade.setText("14 Anos");

        lblEstreia.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblEstreia.setText("Estreia:");

        lblEstreiaData.setText("Data/De/Estreia");

        lblDiretor.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblDiretor.setText("Diretor:");

        lblDiretorNome.setText("James Cameron");

        lblAvaliacaoDoPublico.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblAvaliacaoDoPublico.setText("Avaliação do Público:");

        lblAvaliacaoDoPublicoNum.setText("5.0");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtSinopse.setEditable(false);
        txtSinopse.setText("Synopsis: In a not-too-distant future, a team of brilliant scientists and adventurous astronauts embark on a groundbreaking space mission. Their objective is to reach a distant galaxy and explore a planet rumored to hold the key to eternal life. However, as they traverse the uncharted regions of the universe, they encounter cosmic anomalies and face perilous challenges that test their physical and mental limits. Amidst the vast expanse of space, they must rely on their resourcefulness and teamwork to survive and uncover the extraordinary secrets that await them.");
        txtSinopse.setToolTipText("");
        jScrollPane1.setViewportView(txtSinopse);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout tb1Layout = new javax.swing.GroupLayout(tb1);
        tb1.setLayout(tb1Layout);
        tb1Layout.setHorizontalGroup(
            tb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tb1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tb1Layout.createSequentialGroup()
                        .addGroup(tb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSessoesDub)
                            .addComponent(lblSessoesLeg)
                            .addGroup(tb1Layout.createSequentialGroup()
                                .addComponent(btnSessaoQuatorzeHorasDub)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSessaoQuinzeETrintaDub)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSessaoDezesseteHorasDub)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSessaoDezenoveETrintaDub))
                            .addComponent(lblCartazFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTituloFilme)
                            .addGroup(tb1Layout.createSequentialGroup()
                                .addComponent(lblClassificacaoIndicativa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblClassificacaoIndicativaIdade))
                            .addGroup(tb1Layout.createSequentialGroup()
                                .addComponent(lblEstreia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEstreiaData))
                            .addGroup(tb1Layout.createSequentialGroup()
                                .addComponent(lblDiretor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDiretorNome))
                            .addGroup(tb1Layout.createSequentialGroup()
                                .addComponent(lblAvaliacaoDoPublico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAvaliacaoDoPublicoNum))
                            .addGroup(tb1Layout.createSequentialGroup()
                                .addGroup(tb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(tb1Layout.createSequentialGroup()
                                        .addComponent(btnSessaoVinteEUmaDub)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSessaoVinteEDuasETrintaDub))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(tb1Layout.createSequentialGroup()
                        .addComponent(btnSessaoQuatorzeHorasLeg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSessaoQuinzeETrintaLeg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSessaoDezesseteHorasLeg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSessaoDezenoveETrintaLeg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSessaoVinteEUmaLeg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSessaoVinteEDuasETrintaLeg)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tb1Layout.setVerticalGroup(
            tb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tb1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tb1Layout.createSequentialGroup()
                        .addComponent(lblCartazFilme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSessoesDub)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(tb1Layout.createSequentialGroup()
                        .addComponent(lblTituloFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblClassificacaoIndicativaIdade)
                            .addComponent(lblClassificacaoIndicativa, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEstreiaData)
                            .addComponent(lblEstreia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDiretor)
                            .addComponent(lblDiretorNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAvaliacaoDoPublico)
                            .addComponent(lblAvaliacaoDoPublicoNum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(tb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSessaoQuatorzeHorasDub)
                    .addComponent(btnSessaoQuinzeETrintaDub)
                    .addComponent(btnSessaoDezesseteHorasDub)
                    .addComponent(btnSessaoDezenoveETrintaDub)
                    .addComponent(btnSessaoVinteEUmaDub)
                    .addComponent(btnSessaoVinteEDuasETrintaDub))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSessoesLeg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSessaoQuatorzeHorasLeg)
                    .addComponent(btnSessaoQuinzeETrintaLeg)
                    .addComponent(btnSessaoDezesseteHorasLeg)
                    .addComponent(btnSessaoDezenoveETrintaLeg)
                    .addComponent(btnSessaoVinteEUmaLeg)
                    .addComponent(btnSessaoVinteEDuasETrintaLeg))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tb1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jPanel2.add(tb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(747, 489));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFilmeAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilmeAnteriorActionPerformed
        // TODO add your handling code here:
        this.filmeIndex -= 1;
        this.changeMovie();
    }//GEN-LAST:event_btnFilmeAnteriorActionPerformed
    
    private void btnProximoFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoFilmeActionPerformed
        this.filmeIndex += 1;
        this.changeMovie();
    }//GEN-LAST:event_btnProximoFilmeActionPerformed

    private void btnSessaoQuatorzeHorasDubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSessaoQuatorzeHorasDubActionPerformed
        // TODO add your handling code here:

        if(Principal.currentUser == null) {
            JOptionPane.showMessageDialog(null, "Você precisa estar logado para "
                    + "escolher um assento");
            return;
        }
        
        new SelecaoDeAssento(
                new Sessao("14h00m", 
                        false, 
                        true, 
                        Principal.filmes.get(this.filmeIndex))
        ).setVisible(true);
    }//GEN-LAST:event_btnSessaoQuatorzeHorasDubActionPerformed

    private void btnSessaoQuinzeETrintaDubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSessaoQuinzeETrintaDubActionPerformed
        // TODO add your handling code here:

        if(Principal.currentUser == null) {
            JOptionPane.showMessageDialog(null, "Você precisa estar logado para "
                    + "escolher um assento");
            return;
        }
        
        new SelecaoDeAssento(
                new Sessao("15h30m", 
                        false, 
                        true, 
                        Principal.filmes.get(this.filmeIndex))
        ).setVisible(true);
    }//GEN-LAST:event_btnSessaoQuinzeETrintaDubActionPerformed

    private void btnSessaoDezesseteHorasDubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSessaoDezesseteHorasDubActionPerformed
        // TODO add your handling code here:

        if(Principal.currentUser == null) {
            JOptionPane.showMessageDialog(null, "Você precisa estar logado para "
                    + "escolher um assento");
            return;
        }
        
        new SelecaoDeAssento(
                new Sessao("17h00m", 
                        false, 
                        true, 
                        Principal.filmes.get(this.filmeIndex))
        ).setVisible(true);
        
    }//GEN-LAST:event_btnSessaoDezesseteHorasDubActionPerformed

    private void btnSessaoDezenoveETrintaDubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSessaoDezenoveETrintaDubActionPerformed
        // TODO add your handling code here:

        if(Principal.currentUser == null) {
            JOptionPane.showMessageDialog(null, "Você precisa estar logado para "
                    + "escolher um assento");
            return;
        }
        
        new SelecaoDeAssento(
                new Sessao("19h30m", 
                        false, 
                        true, 
                        Principal.filmes.get(this.filmeIndex))
        ).setVisible(true);
        
    }//GEN-LAST:event_btnSessaoDezenoveETrintaDubActionPerformed

    private void btnSessaoVinteEUmaDubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSessaoVinteEUmaDubActionPerformed
        // TODO add your handling code here:

        if(Principal.currentUser == null) {
            JOptionPane.showMessageDialog(null, "Você precisa estar logado para "
                    + "escolher um assento");
            return;
        }
        
        new SelecaoDeAssento(
                new Sessao("21h00m", 
                        false, 
                        true, 
                        Principal.filmes.get(this.filmeIndex))
        ).setVisible(true);
        
    }//GEN-LAST:event_btnSessaoVinteEUmaDubActionPerformed

    private void btnSessaoVinteEDuasETrintaDubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSessaoVinteEDuasETrintaDubActionPerformed
        // TODO add your handling code here:

        if(Principal.currentUser == null) {
            JOptionPane.showMessageDialog(null, "Você precisa estar logado para "
                    + "escolher um assento");
            return;
        }
        
        new SelecaoDeAssento(
                new Sessao("22h30m", 
                        false, 
                        true, 
                        Principal.filmes.get(this.filmeIndex))
        ).setVisible(true);
        
    }//GEN-LAST:event_btnSessaoVinteEDuasETrintaDubActionPerformed

    private void btnSessaoQuatorzeHorasLegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSessaoQuatorzeHorasLegActionPerformed
        // TODO add your handling code here:
        
        if(Principal.currentUser == null) {
            JOptionPane.showMessageDialog(null, "Você precisa estar logado para "
                    + "escolher um assento");
            return;
        }
        
        new SelecaoDeAssento(
                new Sessao("14h00m", 
                        true, 
                        false, 
                        Principal.filmes.get(this.filmeIndex))
        ).setVisible(true);
        
    }//GEN-LAST:event_btnSessaoQuatorzeHorasLegActionPerformed

    private void btnSessaoQuinzeETrintaLegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSessaoQuinzeETrintaLegActionPerformed
        // TODO add your handling code here:

        if(Principal.currentUser == null) {
            JOptionPane.showMessageDialog(null, "Você precisa estar logado para "
                    + "escolher um assento");
            return;
        }
        
        new SelecaoDeAssento(
                new Sessao("15h30m", 
                        true, 
                        false, 
                        Principal.filmes.get(this.filmeIndex))
        ).setVisible(true);
        
    }//GEN-LAST:event_btnSessaoQuinzeETrintaLegActionPerformed

    private void btnSessaoDezesseteHorasLegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSessaoDezesseteHorasLegActionPerformed
        // TODO add your handling code here:

        if(Principal.currentUser == null) {
            JOptionPane.showMessageDialog(null, "Você precisa estar logado para "
                    + "escolher um assento");
            return;
        }
        
        new SelecaoDeAssento(
                new Sessao("17h00m", 
                        true, 
                        false, 
                        Principal.filmes.get(this.filmeIndex))
        ).setVisible(true);
        
    }//GEN-LAST:event_btnSessaoDezesseteHorasLegActionPerformed

    private void btnSessaoDezenoveETrintaLegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSessaoDezenoveETrintaLegActionPerformed
        // TODO add your handling code here:

        if(Principal.currentUser == null) {
            JOptionPane.showMessageDialog(null, "Você precisa estar logado para "
                    + "escolher um assento");
            return;
        }
        
        new SelecaoDeAssento(
                new Sessao("19h30m", 
                        true, 
                        false, 
                        Principal.filmes.get(this.filmeIndex))
        ).setVisible(true);
        
    }//GEN-LAST:event_btnSessaoDezenoveETrintaLegActionPerformed

    private void btnSessaoVinteEUmaLegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSessaoVinteEUmaLegActionPerformed
        // TODO add your handling code here:

        if(Principal.currentUser == null) {
            JOptionPane.showMessageDialog(null, "Você precisa estar logado para "
                    + "escolher um assento");
            return;
        }
        
        new SelecaoDeAssento(
                new Sessao("21h00m", 
                        true, 
                        false, 
                        Principal.filmes.get(this.filmeIndex))
        ).setVisible(true);
        
    }//GEN-LAST:event_btnSessaoVinteEUmaLegActionPerformed

    private void btnSessaoVinteEDuasETrintaLegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSessaoVinteEDuasETrintaLegActionPerformed
        // TODO add your handling code here:
        
        if(Principal.currentUser == null) {
            JOptionPane.showMessageDialog(null, "Você precisa estar logado para "
                    + "escolher um assento");
            return;
        }
        
        new SelecaoDeAssento(
                new Sessao("22h00m", 
                        true, 
                        false, 
                        Principal.filmes.get(this.filmeIndex))
        ).setVisible(true);
        
    }//GEN-LAST:event_btnSessaoVinteEDuasETrintaLegActionPerformed

    private void changeMovie() {
        this.setFilme();
        
        if(filmeIndex >= Principal.filmes.size() - 1) {
            btnProximoFilme.setEnabled(false);
        } else {
            btnProximoFilme.setEnabled(true);
        }
        
        if(filmeIndex > 0) {
            btnFilmeAnterior.setEnabled(true);
        } else {
            btnFilmeAnterior.setEnabled(false);
        }
    }
    
    private void setFilme(){
        assert(filmeIndex >= 0);
        assert(filmeIndex < Principal.filmes.size());
        
        var filme = Principal.filmes.get(filmeIndex);
        
        lblTituloFilme.setText(filme.getTitulo());
        txtSinopse.setText(filme.getSinopse());
        lblClassificacaoIndicativaIdade.setText(String.valueOf(filme.getClassificacaoIndicativa()) + " Anos");
        lblEstreiaData.setText(filme.getDataEstreia());
        lblDiretorNome.setText(filme.getDiretor());
        lblAvaliacaoDoPublicoNum.setText(String.valueOf(filme.getAvaliacaoDoPublico()));
        
        URL iconURL = ClassLoader.getSystemResource("img/" + filme.getId() + ".png");
        lblCartazFilme.setIcon(new ImageIcon(iconURL));
        
    }
    
    
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
            java.util.logging.Logger.getLogger(ListagemDeFilmesDinamica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListagemDeFilmesDinamica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListagemDeFilmesDinamica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListagemDeFilmesDinamica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListagemDeFilmesDinamica().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFilmeAnterior;
    private javax.swing.JButton btnProximoFilme;
    private javax.swing.JButton btnSessaoDezenoveETrintaDub;
    private javax.swing.JButton btnSessaoDezenoveETrintaLeg;
    private javax.swing.JButton btnSessaoDezesseteHorasDub;
    private javax.swing.JButton btnSessaoDezesseteHorasLeg;
    private javax.swing.JButton btnSessaoQuatorzeHorasDub;
    private javax.swing.JButton btnSessaoQuatorzeHorasLeg;
    private javax.swing.JButton btnSessaoQuinzeETrintaDub;
    private javax.swing.JButton btnSessaoQuinzeETrintaLeg;
    private javax.swing.JButton btnSessaoVinteEDuasETrintaDub;
    private javax.swing.JButton btnSessaoVinteEDuasETrintaLeg;
    private javax.swing.JButton btnSessaoVinteEUmaDub;
    private javax.swing.JButton btnSessaoVinteEUmaLeg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvaliacaoDoPublico;
    private javax.swing.JLabel lblAvaliacaoDoPublicoNum;
    private javax.swing.JLabel lblCartazFilme;
    private javax.swing.JLabel lblClassificacaoIndicativa;
    private javax.swing.JLabel lblClassificacaoIndicativaIdade;
    private javax.swing.JLabel lblDiretor;
    private javax.swing.JLabel lblDiretorNome;
    private javax.swing.JLabel lblEstreia;
    private javax.swing.JLabel lblEstreiaData;
    private javax.swing.JLabel lblSessoesDub;
    private javax.swing.JLabel lblSessoesLeg;
    private javax.swing.JLabel lblTituloFilme;
    private javax.swing.JPanel tb1;
    private javax.swing.JTextPane txtSinopse;
    // End of variables declaration//GEN-END:variables
}
