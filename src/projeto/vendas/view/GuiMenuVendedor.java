/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.vendas.view;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import projeto.vendas.model.Login;

/**
 *
 * @author 0030481521038
 */
public class GuiMenuVendedor extends javax.swing.JFrame {

    /**
     * Creates new form GuiMenu_Vendedor
     */
    public GuiMenuVendedor(Login login) {
        initComponents();
        this.login = login;
        System.out.println("Numero do Vendedor LOGADO = " + login.getCodigo() + "Nome = " + login.getNome());
        
        URL caminhoIcone = getClass().getResource("/projeto/vendas/model/icones/logotipo.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_Cadastro = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem_Pessoa_Fisica = new javax.swing.JMenuItem();
        jMenuItem_Pessoa_Juridica = new javax.swing.JMenuItem();
        jMenu_Gerar_Pedido = new javax.swing.JMenu();
        jMenu_Emitir_Nota_Fiscal = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/vendas/model/icones/logo.png"))); // NOI18N

        jMenu_Cadastro.setText("Cadastro");
        jMenu_Cadastro.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N

        jMenu4.setText("Cliente");
        jMenu4.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N

        jMenuItem_Pessoa_Fisica.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jMenuItem_Pessoa_Fisica.setText("Pessoa Física");
        jMenuItem_Pessoa_Fisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Pessoa_FisicaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem_Pessoa_Fisica);

        jMenuItem_Pessoa_Juridica.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jMenuItem_Pessoa_Juridica.setText("Pessoa Jurídica");
        jMenu4.add(jMenuItem_Pessoa_Juridica);

        jMenu_Cadastro.add(jMenu4);

        jMenuBar1.add(jMenu_Cadastro);

        jMenu_Gerar_Pedido.setText("Gerar Pedido");
        jMenu_Gerar_Pedido.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jMenuBar1.add(jMenu_Gerar_Pedido);

        jMenu_Emitir_Nota_Fiscal.setText("Emitir Nota Fiscal");
        jMenu_Emitir_Nota_Fiscal.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jMenuBar1.add(jMenu_Emitir_Nota_Fiscal);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(lblLogo)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_Pessoa_FisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Pessoa_FisicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_Pessoa_FisicaActionPerformed

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
            java.util.logging.Logger.getLogger(GuiMenuVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiMenuVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiMenuVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiMenuVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMenuVendedor(login).setVisible(true);
            }
        });
    }

    private static Login login;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_Pessoa_Fisica;
    private javax.swing.JMenuItem jMenuItem_Pessoa_Juridica;
    private javax.swing.JMenu jMenu_Cadastro;
    private javax.swing.JMenu jMenu_Emitir_Nota_Fiscal;
    private javax.swing.JMenu jMenu_Gerar_Pedido;
    private javax.swing.JLabel lblLogo;
    // End of variables declaration//GEN-END:variables
}
