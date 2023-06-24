/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import Utils.ManageData;
import classes.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author maxwell
 */
public class Principal extends javax.swing.JFrame {
    
    /**
     * Creates new form Principal
     */
    
    public static ArrayList<Cliente> clientes = new ArrayList();
    public static ArrayList<Filme> filmes = new ArrayList();
    public static Cliente currentUser = null;
  
    public Principal() {
        initComponents();
        
        initializeData();
        saveData();
    }
    
    private void initializeData() {
        clientes = ManageData.GetClientes();
        filmes = ManageData.GetFilmes();
    }
    
    private void saveData() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Saving data......");
                ManageData.SaveClientes(clientes);
                ManageData.SaveFilmes(filmes);
            }
        });
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelBemVindo = new javax.swing.JLabel();
        labelFazer = new javax.swing.JLabel();
        buttonCartaz = new javax.swing.JButton();
        buttonCadastroCliente = new javax.swing.JButton();
        imagemPrincipal = new javax.swing.JLabel();
        buttonEntrar = new javax.swing.JButton();
        buttonAdmin = new javax.swing.JButton();
        menuBarPrincipal = new javax.swing.JMenuBar();
        menuOpcoes = new javax.swing.JMenu();
        menuItemListar = new javax.swing.JMenuItem();
        menuItemCadastro = new javax.swing.JMenuItem();
        menuItemEntrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CInelink");
        setResizable(false);

        labelBemVindo.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        labelBemVindo.setText("Seja bem vindo ao CineLink!");

        labelFazer.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        labelFazer.setText("O que deseja fazer?");

        buttonCartaz.setText("Ver filmes em cartaz");
        buttonCartaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCartazActionPerformed(evt);
            }
        });

        buttonCadastroCliente.setText("Se tornar cliente");
        buttonCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastroClienteActionPerformed(evt);
            }
        });

        imagemPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cinema-inicial.png"))); // NOI18N

        buttonEntrar.setText("Entrar");
        buttonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEntrarActionPerformed(evt);
            }
        });

        buttonAdmin.setText("Admin");
        buttonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdminActionPerformed(evt);
            }
        });

        menuOpcoes.setText("Opções");

        menuItemListar.setText("Listar filmes");
        menuItemListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarActionPerformed(evt);
            }
        });
        menuOpcoes.add(menuItemListar);

        menuItemCadastro.setText("Cadastro");
        menuItemCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastroActionPerformed(evt);
            }
        });
        menuOpcoes.add(menuItemCadastro);

        menuItemEntrar.setText("Entrar");
        menuItemEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEntrarActionPerformed(evt);
            }
        });
        menuOpcoes.add(menuItemEntrar);

        menuBarPrincipal.add(menuOpcoes);

        setJMenuBar(menuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelBemVindo)
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelFazer)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonCartaz)
                                .addGap(32, 32, 32)
                                .addComponent(buttonCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(buttonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(imagemPrincipal)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(labelBemVindo)
                .addGap(18, 18, 18)
                .addComponent(imagemPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(labelFazer)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCartaz, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarActionPerformed
        // TODO add your handling code here:
        new ListagemFilmes().setVisible(true);
    }//GEN-LAST:event_menuItemListarActionPerformed

    private void menuItemCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastroActionPerformed
        // TODO add your handling code here:
        new CadastroCliente().setVisible(true);
    }//GEN-LAST:event_menuItemCadastroActionPerformed

    private void buttonCartazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCartazActionPerformed
        // TODO add your handling code here:
        if(Principal.filmes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ainda não há filmes cadastrados. "
                    + "Por favor, volte mais tarde");
        } else {
            new ListagemDeFilmesDinamica().setVisible(true);
        }
    }//GEN-LAST:event_buttonCartazActionPerformed

    private void buttonCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastroClienteActionPerformed
        // TODO add your handling code here:
        new CadastroCliente().setVisible(true);
    }//GEN-LAST:event_buttonCadastroClienteActionPerformed
    
    private void buttonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEntrarActionPerformed
        // TODO add your handling code here:
        new AreaDeLogin().setVisible(true);
    }//GEN-LAST:event_buttonEntrarActionPerformed

    private void menuItemEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEntrarActionPerformed
        // TODO add your handling code here:
        new AreaDeLogin().setVisible(true);
    }//GEN-LAST:event_menuItemEntrarActionPerformed

    private void buttonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdminActionPerformed
        // TODO add your handling code here:
        new AdminLogin().setVisible(true);
    }//GEN-LAST:event_buttonAdminActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdmin;
    private javax.swing.JButton buttonCadastroCliente;
    private javax.swing.JButton buttonCartaz;
    private javax.swing.JButton buttonEntrar;
    private javax.swing.JLabel imagemPrincipal;
    private javax.swing.JLabel labelBemVindo;
    private javax.swing.JLabel labelFazer;
    private javax.swing.JMenuBar menuBarPrincipal;
    private javax.swing.JMenuItem menuItemCadastro;
    private javax.swing.JMenuItem menuItemEntrar;
    private javax.swing.JMenuItem menuItemListar;
    private javax.swing.JMenu menuOpcoes;
    // End of variables declaration//GEN-END:variables
}
