/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author maxwell
 */
public class ListagemFilmes extends javax.swing.JFrame {

    /**
     * Creates new form ListagemFilmes
     */
    public ListagemFilmes() {
        initComponents();
        btnFilmeAnterior.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnFilmeAnterior = new javax.swing.JButton();
        btnProximoFilme = new javax.swing.JButton();
        pnlHideBar = new javax.swing.JPanel();
        tbbPainelDeFilmes = new javax.swing.JTabbedPane();
        tb1 = new javax.swing.JPanel();
        lblCartazFilme = new javax.swing.JLabel();
        lblTituloFilme = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
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
        tb2 = new javax.swing.JPanel();
        lblCartazFilme1 = new javax.swing.JLabel();
        lblTituloFilme1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        btnSessaoVinteEDuasETrintaDub1 = new javax.swing.JButton();
        btnSessaoQuatorzeHorasLeg1 = new javax.swing.JButton();
        lblSessoesDub1 = new javax.swing.JLabel();
        btnSessaoQuinzeETrintaLeg1 = new javax.swing.JButton();
        btnSessaoDezesseteHorasLeg1 = new javax.swing.JButton();
        btnSessaoQuatorzeHorasDub1 = new javax.swing.JButton();
        btnSessaoDezenoveETrintaLeg1 = new javax.swing.JButton();
        lblSessoesLeg1 = new javax.swing.JLabel();
        btnSessaoVinteEUmaLeg1 = new javax.swing.JButton();
        btnSessaoQuinzeETrintaDub1 = new javax.swing.JButton();
        btnSessaoVinteEDuasETrintaLeg1 = new javax.swing.JButton();
        btnSessaoDezesseteHorasDub1 = new javax.swing.JButton();
        btnSessaoDezenoveETrintaDub1 = new javax.swing.JButton();
        btnSessaoVinteEUmaDub1 = new javax.swing.JButton();
        tb3 = new javax.swing.JPanel();
        tb4 = new javax.swing.JPanel();
        tb5 = new javax.swing.JPanel();
        tb6 = new javax.swing.JPanel();
        tb7 = new javax.swing.JPanel();
        tb8 = new javax.swing.JPanel();
        tb9 = new javax.swing.JPanel();
        tb10 = new javax.swing.JPanel();
        tb11 = new javax.swing.JPanel();
        tb12 = new javax.swing.JPanel();
        tb13 = new javax.swing.JPanel();
        tb14 = new javax.swing.JPanel();
        tb15 = new javax.swing.JPanel();
        tb16 = new javax.swing.JPanel();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 527, Short.MAX_VALUE)
                .addComponent(btnProximoFilme)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFilmeAnterior)
                    .addComponent(btnProximoFilme))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 750, 90));

        javax.swing.GroupLayout pnlHideBarLayout = new javax.swing.GroupLayout(pnlHideBar);
        pnlHideBar.setLayout(pnlHideBarLayout);
        pnlHideBarLayout.setHorizontalGroup(
            pnlHideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        pnlHideBarLayout.setVerticalGroup(
            pnlHideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel2.add(pnlHideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 40));

        lblCartazFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/filme1.png"))); // NOI18N
        lblCartazFilme.setText("jLabel1");

        lblTituloFilme.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lblTituloFilme.setText("Uma Incrível Jornada Espacial");

        jTextPane1.setText("Synopsis: In a not-too-distant future, a team of brilliant scientists and adventurous astronauts embark on a groundbreaking space mission. Their objective is to reach a distant galaxy and explore a planet rumored to hold the key to eternal life. However, as they traverse the uncharted regions of the universe, they encounter cosmic anomalies and face perilous challenges that test their physical and mental limits. Amidst the vast expanse of space, they must rely on their resourcefulness and teamwork to survive and uncover the extraordinary secrets that await them.");
        jScrollPane1.setViewportView(jTextPane1);

        btnSessaoQuatorzeHorasDub.setText("14:00");

        lblSessoesDub.setText("Sessões dubladas disponíveis:");

        btnSessaoQuinzeETrintaDub.setText("15:30");

        btnSessaoDezesseteHorasDub.setText("17:00");

        btnSessaoDezenoveETrintaDub.setText("19:30");

        btnSessaoVinteEUmaDub.setText("21:00");

        btnSessaoVinteEDuasETrintaDub.setText("22:30");

        btnSessaoQuatorzeHorasLeg.setText("14:00");

        lblSessoesLeg.setText("Sessões legendadas disponíveis:");

        btnSessaoQuinzeETrintaLeg.setText("15:30");

        btnSessaoDezesseteHorasLeg.setText("17:00");

        btnSessaoDezenoveETrintaLeg.setText("19:30");

        btnSessaoVinteEUmaLeg.setText("21:00");

        btnSessaoVinteEDuasETrintaLeg.setText("22:30");

        javax.swing.GroupLayout tb1Layout = new javax.swing.GroupLayout(tb1);
        tb1.setLayout(tb1Layout);
        tb1Layout.setHorizontalGroup(
            tb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tb1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tb1Layout.createSequentialGroup()
                        .addComponent(lblCartazFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tb1Layout.createSequentialGroup()
                                .addComponent(lblTituloFilme)
                                .addGap(0, 129, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(tb1Layout.createSequentialGroup()
                        .addGroup(tb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tb1Layout.createSequentialGroup()
                                .addGroup(tb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSessoesDub)
                                    .addGroup(tb1Layout.createSequentialGroup()
                                        .addComponent(btnSessaoQuatorzeHorasDub)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSessaoQuinzeETrintaDub)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSessaoDezesseteHorasDub)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSessaoDezenoveETrintaDub)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSessaoVinteEUmaDub)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSessaoVinteEDuasETrintaDub))
                            .addComponent(lblSessoesLeg)
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
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tb1Layout.setVerticalGroup(
            tb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tb1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(tb1Layout.createSequentialGroup()
                        .addComponent(lblTituloFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addComponent(lblCartazFilme))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tb1Layout.createSequentialGroup()
                        .addComponent(lblSessoesDub)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSessaoQuatorzeHorasDub)
                            .addComponent(btnSessaoQuinzeETrintaDub)
                            .addComponent(btnSessaoDezesseteHorasDub)
                            .addComponent(btnSessaoDezenoveETrintaDub)
                            .addComponent(btnSessaoVinteEUmaDub))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSessoesLeg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSessaoQuatorzeHorasLeg)
                            .addComponent(btnSessaoQuinzeETrintaLeg)
                            .addComponent(btnSessaoDezesseteHorasLeg)
                            .addComponent(btnSessaoDezenoveETrintaLeg)
                            .addComponent(btnSessaoVinteEUmaLeg)
                            .addComponent(btnSessaoVinteEDuasETrintaLeg)))
                    .addGroup(tb1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnSessaoVinteEDuasETrintaDub)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        tbbPainelDeFilmes.addTab("tab1", tb1);

        lblCartazFilme1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/filme1.png"))); // NOI18N
        lblCartazFilme1.setText("jLabel1");

        lblTituloFilme1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lblTituloFilme1.setText("Uma Incrível Jornada Espacial");

        jTextPane2.setText("Synopsis: In a not-too-distant future, a team of brilliant scientists and adventurous astronauts embark on a groundbreaking space mission. Their objective is to reach a distant galaxy and explore a planet rumored to hold the key to eternal life. However, as they traverse the uncharted regions of the universe, they encounter cosmic anomalies and face perilous challenges that test their physical and mental limits. Amidst the vast expanse of space, they must rely on their resourcefulness and teamwork to survive and uncover the extraordinary secrets that await them.");
        jScrollPane2.setViewportView(jTextPane2);

        btnSessaoVinteEDuasETrintaDub1.setText("22:30");
        btnSessaoVinteEDuasETrintaDub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSessaoVinteEDuasETrintaDub1ActionPerformed(evt);
            }
        });

        btnSessaoQuatorzeHorasLeg1.setText("14:00");

        lblSessoesDub1.setText("Sessões legendadas disponíveis:");

        btnSessaoQuinzeETrintaLeg1.setText("15:30");

        btnSessaoDezesseteHorasLeg1.setText("17:00");

        btnSessaoQuatorzeHorasDub1.setText("14:00");

        btnSessaoDezenoveETrintaLeg1.setText("19:30");

        lblSessoesLeg1.setText("Sessões dubladas disponíveis:");

        btnSessaoVinteEUmaLeg1.setText("21:00");

        btnSessaoQuinzeETrintaDub1.setText("15:30");

        btnSessaoVinteEDuasETrintaLeg1.setText("22:30");

        btnSessaoDezesseteHorasDub1.setText("17:00");

        btnSessaoDezenoveETrintaDub1.setText("19:30");

        btnSessaoVinteEUmaDub1.setText("21:00");

        javax.swing.GroupLayout tb2Layout = new javax.swing.GroupLayout(tb2);
        tb2.setLayout(tb2Layout);
        tb2Layout.setHorizontalGroup(
            tb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tb2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tb2Layout.createSequentialGroup()
                        .addComponent(lblCartazFilme1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tb2Layout.createSequentialGroup()
                                .addComponent(lblTituloFilme1)
                                .addGap(0, 129, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(tb2Layout.createSequentialGroup()
                        .addGroup(tb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tb2Layout.createSequentialGroup()
                                .addGroup(tb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSessoesLeg1)
                                    .addGroup(tb2Layout.createSequentialGroup()
                                        .addComponent(btnSessaoQuatorzeHorasDub1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSessaoQuinzeETrintaDub1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSessaoDezesseteHorasDub1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSessaoDezenoveETrintaDub1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSessaoVinteEUmaDub1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSessaoVinteEDuasETrintaDub1))
                            .addComponent(lblSessoesDub1)
                            .addGroup(tb2Layout.createSequentialGroup()
                                .addComponent(btnSessaoQuatorzeHorasLeg1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSessaoQuinzeETrintaLeg1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSessaoDezesseteHorasLeg1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSessaoDezenoveETrintaLeg1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSessaoVinteEUmaLeg1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSessaoVinteEDuasETrintaLeg1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tb2Layout.setVerticalGroup(
            tb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tb2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tb2Layout.createSequentialGroup()
                        .addComponent(lblTituloFilme1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addComponent(lblCartazFilme1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tb2Layout.createSequentialGroup()
                        .addComponent(lblSessoesLeg1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSessaoQuatorzeHorasDub1)
                            .addComponent(btnSessaoQuinzeETrintaDub1)
                            .addComponent(btnSessaoDezesseteHorasDub1)
                            .addComponent(btnSessaoDezenoveETrintaDub1)
                            .addComponent(btnSessaoVinteEUmaDub1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSessoesDub1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSessaoQuatorzeHorasLeg1)
                            .addComponent(btnSessaoQuinzeETrintaLeg1)
                            .addComponent(btnSessaoDezesseteHorasLeg1)
                            .addComponent(btnSessaoDezenoveETrintaLeg1)
                            .addComponent(btnSessaoVinteEUmaLeg1)
                            .addComponent(btnSessaoVinteEDuasETrintaLeg1)))
                    .addGroup(tb2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnSessaoVinteEDuasETrintaDub1)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        tbbPainelDeFilmes.addTab("tab2", tb2);

        javax.swing.GroupLayout tb3Layout = new javax.swing.GroupLayout(tb3);
        tb3.setLayout(tb3Layout);
        tb3Layout.setHorizontalGroup(
            tb3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        tb3Layout.setVerticalGroup(
            tb3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        tbbPainelDeFilmes.addTab("tab3", tb3);

        javax.swing.GroupLayout tb4Layout = new javax.swing.GroupLayout(tb4);
        tb4.setLayout(tb4Layout);
        tb4Layout.setHorizontalGroup(
            tb4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        tb4Layout.setVerticalGroup(
            tb4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        tbbPainelDeFilmes.addTab("tab4", tb4);

        javax.swing.GroupLayout tb5Layout = new javax.swing.GroupLayout(tb5);
        tb5.setLayout(tb5Layout);
        tb5Layout.setHorizontalGroup(
            tb5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        tb5Layout.setVerticalGroup(
            tb5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        tbbPainelDeFilmes.addTab("tab5", tb5);

        javax.swing.GroupLayout tb6Layout = new javax.swing.GroupLayout(tb6);
        tb6.setLayout(tb6Layout);
        tb6Layout.setHorizontalGroup(
            tb6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        tb6Layout.setVerticalGroup(
            tb6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        tbbPainelDeFilmes.addTab("tab6", tb6);

        javax.swing.GroupLayout tb7Layout = new javax.swing.GroupLayout(tb7);
        tb7.setLayout(tb7Layout);
        tb7Layout.setHorizontalGroup(
            tb7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        tb7Layout.setVerticalGroup(
            tb7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        tbbPainelDeFilmes.addTab("tab7", tb7);

        javax.swing.GroupLayout tb8Layout = new javax.swing.GroupLayout(tb8);
        tb8.setLayout(tb8Layout);
        tb8Layout.setHorizontalGroup(
            tb8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        tb8Layout.setVerticalGroup(
            tb8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        tbbPainelDeFilmes.addTab("tab8", tb8);

        javax.swing.GroupLayout tb9Layout = new javax.swing.GroupLayout(tb9);
        tb9.setLayout(tb9Layout);
        tb9Layout.setHorizontalGroup(
            tb9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        tb9Layout.setVerticalGroup(
            tb9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        tbbPainelDeFilmes.addTab("tab9", tb9);

        javax.swing.GroupLayout tb10Layout = new javax.swing.GroupLayout(tb10);
        tb10.setLayout(tb10Layout);
        tb10Layout.setHorizontalGroup(
            tb10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        tb10Layout.setVerticalGroup(
            tb10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        tbbPainelDeFilmes.addTab("tab10", tb10);

        javax.swing.GroupLayout tb11Layout = new javax.swing.GroupLayout(tb11);
        tb11.setLayout(tb11Layout);
        tb11Layout.setHorizontalGroup(
            tb11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        tb11Layout.setVerticalGroup(
            tb11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        tbbPainelDeFilmes.addTab("tab11", tb11);

        javax.swing.GroupLayout tb12Layout = new javax.swing.GroupLayout(tb12);
        tb12.setLayout(tb12Layout);
        tb12Layout.setHorizontalGroup(
            tb12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        tb12Layout.setVerticalGroup(
            tb12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        tbbPainelDeFilmes.addTab("tab12", tb12);

        javax.swing.GroupLayout tb13Layout = new javax.swing.GroupLayout(tb13);
        tb13.setLayout(tb13Layout);
        tb13Layout.setHorizontalGroup(
            tb13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        tb13Layout.setVerticalGroup(
            tb13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        tbbPainelDeFilmes.addTab("tab13", tb13);

        javax.swing.GroupLayout tb14Layout = new javax.swing.GroupLayout(tb14);
        tb14.setLayout(tb14Layout);
        tb14Layout.setHorizontalGroup(
            tb14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        tb14Layout.setVerticalGroup(
            tb14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        tbbPainelDeFilmes.addTab("tab14", tb14);

        javax.swing.GroupLayout tb15Layout = new javax.swing.GroupLayout(tb15);
        tb15.setLayout(tb15Layout);
        tb15Layout.setHorizontalGroup(
            tb15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        tb15Layout.setVerticalGroup(
            tb15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        tbbPainelDeFilmes.addTab("tab15", tb15);

        javax.swing.GroupLayout tb16Layout = new javax.swing.GroupLayout(tb16);
        tb16.setLayout(tb16Layout);
        tb16Layout.setHorizontalGroup(
            tb16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        tb16Layout.setVerticalGroup(
            tb16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        tbbPainelDeFilmes.addTab("tab16", tb16);

        jPanel2.add(tbbPainelDeFilmes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(766, 565));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFilmeAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilmeAnteriorActionPerformed
        // TODO add your handling code here:
        if (tbbPainelDeFilmes.getSelectedIndex() == 1) {
            btnFilmeAnterior.setEnabled(false);
            tbbPainelDeFilmes.setSelectedIndex(tbbPainelDeFilmes.getSelectedIndex() - 1);
        }else if (tbbPainelDeFilmes.getSelectedIndex() != 0 && tbbPainelDeFilmes.getSelectedIndex() != tbbPainelDeFilmes.getTabCount() - 1) {
            tbbPainelDeFilmes.setSelectedIndex(tbbPainelDeFilmes.getSelectedIndex() - 1);
        }else if (tbbPainelDeFilmes.getSelectedIndex() == tbbPainelDeFilmes.getTabCount() - 1) {
            btnProximoFilme.setEnabled(true);
            tbbPainelDeFilmes.setSelectedIndex(tbbPainelDeFilmes.getSelectedIndex() - 1);
        }
    }//GEN-LAST:event_btnFilmeAnteriorActionPerformed
    
    private void btnProximoFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoFilmeActionPerformed
        // TODO add your handling code here:
        if (tbbPainelDeFilmes.getSelectedIndex() == tbbPainelDeFilmes.getTabCount() - 2) {
            btnProximoFilme.setEnabled(false);
            tbbPainelDeFilmes.setSelectedIndex(tbbPainelDeFilmes.getSelectedIndex() + 1);
            JPanel pnl = (JPanel) tbbPainelDeFilmes.getSelectedComponent();
            JLabel lblTituloDoFilme = new JLabel();
            lblTituloDoFilme.setText("teste");
            
        }else if (tbbPainelDeFilmes.getSelectedIndex() != tbbPainelDeFilmes.getTabCount() - 1 && tbbPainelDeFilmes.getSelectedIndex() != 0) {
            tbbPainelDeFilmes.setSelectedIndex(tbbPainelDeFilmes.getSelectedIndex() + 1);
        }else if (tbbPainelDeFilmes.getSelectedIndex() == 0) {
            btnFilmeAnterior.setEnabled(true);
            tbbPainelDeFilmes.setSelectedIndex(tbbPainelDeFilmes.getSelectedIndex() + 1);           
        }
        
    }//GEN-LAST:event_btnProximoFilmeActionPerformed

    private void btnSessaoVinteEDuasETrintaDub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSessaoVinteEDuasETrintaDub1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSessaoVinteEDuasETrintaDub1ActionPerformed

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
            java.util.logging.Logger.getLogger(ListagemFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListagemFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListagemFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListagemFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListagemFilmes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFilmeAnterior;
    private javax.swing.JButton btnProximoFilme;
    private javax.swing.JButton btnSessaoDezenoveETrintaDub;
    private javax.swing.JButton btnSessaoDezenoveETrintaDub1;
    private javax.swing.JButton btnSessaoDezenoveETrintaLeg;
    private javax.swing.JButton btnSessaoDezenoveETrintaLeg1;
    private javax.swing.JButton btnSessaoDezesseteHorasDub;
    private javax.swing.JButton btnSessaoDezesseteHorasDub1;
    private javax.swing.JButton btnSessaoDezesseteHorasLeg;
    private javax.swing.JButton btnSessaoDezesseteHorasLeg1;
    private javax.swing.JButton btnSessaoQuatorzeHorasDub;
    private javax.swing.JButton btnSessaoQuatorzeHorasDub1;
    private javax.swing.JButton btnSessaoQuatorzeHorasLeg;
    private javax.swing.JButton btnSessaoQuatorzeHorasLeg1;
    private javax.swing.JButton btnSessaoQuinzeETrintaDub;
    private javax.swing.JButton btnSessaoQuinzeETrintaDub1;
    private javax.swing.JButton btnSessaoQuinzeETrintaLeg;
    private javax.swing.JButton btnSessaoQuinzeETrintaLeg1;
    private javax.swing.JButton btnSessaoVinteEDuasETrintaDub;
    private javax.swing.JButton btnSessaoVinteEDuasETrintaDub1;
    private javax.swing.JButton btnSessaoVinteEDuasETrintaLeg;
    private javax.swing.JButton btnSessaoVinteEDuasETrintaLeg1;
    private javax.swing.JButton btnSessaoVinteEUmaDub;
    private javax.swing.JButton btnSessaoVinteEUmaDub1;
    private javax.swing.JButton btnSessaoVinteEUmaLeg;
    private javax.swing.JButton btnSessaoVinteEUmaLeg1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JLabel lblCartazFilme;
    private javax.swing.JLabel lblCartazFilme1;
    private javax.swing.JLabel lblSessoesDub;
    private javax.swing.JLabel lblSessoesDub1;
    private javax.swing.JLabel lblSessoesLeg;
    private javax.swing.JLabel lblSessoesLeg1;
    private javax.swing.JLabel lblTituloFilme;
    private javax.swing.JLabel lblTituloFilme1;
    private javax.swing.JPanel pnlHideBar;
    private javax.swing.JPanel tb1;
    private javax.swing.JPanel tb10;
    private javax.swing.JPanel tb11;
    private javax.swing.JPanel tb12;
    private javax.swing.JPanel tb13;
    private javax.swing.JPanel tb14;
    private javax.swing.JPanel tb15;
    private javax.swing.JPanel tb16;
    private javax.swing.JPanel tb2;
    private javax.swing.JPanel tb3;
    private javax.swing.JPanel tb4;
    private javax.swing.JPanel tb5;
    private javax.swing.JPanel tb6;
    private javax.swing.JPanel tb7;
    private javax.swing.JPanel tb8;
    private javax.swing.JPanel tb9;
    private javax.swing.JTabbedPane tbbPainelDeFilmes;
    // End of variables declaration//GEN-END:variables
}
