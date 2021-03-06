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
 * @author Cleiton
 */
public class GuiMenuGerente extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public GuiMenuGerente(Login login) {
        initComponents();

        GuiMenuGerente.this.setTitle("Menu             " + "Usuário:  " + login.getNome()
                + "         " + "Codigo:  " + login.getCodigo());
        this.login = login;

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

        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        lblLogotipo = new javax.swing.JLabel();
        jMenu = new javax.swing.JMenuBar();
        jMenu_Cadastro = new javax.swing.JMenu();
        jMenu_Cliente = new javax.swing.JMenu();
        jMenuItem_Pessoa_Física = new javax.swing.JMenuItem();
        jMenuItem_Pessoa_Jurídica = new javax.swing.JMenuItem();
        jMenuItem_Vendedor = new javax.swing.JMenuItem();
        JMenuAlterar = new javax.swing.JMenu();
        jMenuItem_Alterar_Cliente = new javax.swing.JMenuItem();
        jMenuItem_Alterar_Vendedor = new javax.swing.JMenuItem();
        jmenu_AlterarSenha = new javax.swing.JMenuItem();
        jMenu_Gerar_Pedido = new javax.swing.JMenu();
        jMenuItem_Gerar_Pedido = new javax.swing.JMenuItem();
        jMenu_Pedidos_Aprovados = new javax.swing.JMenu();
        jMenuItem_PedidosAprovados = new javax.swing.JMenuItem();
        jMenu_GerenciarPendencias = new javax.swing.JMenu();
        jMenuItem_Analise_de_Credito = new javax.swing.JMenuItem();
        jMenu_ControleEstrategico = new javax.swing.JMenu();
        jMenuItem_PorCliente = new javax.swing.JMenuItem();
        jMenuItem_PorVendedor = new javax.swing.JMenuItem();
        jMenuItem_PorRegiao = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenu6.setText("jMenu6");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);

        lblLogotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/vendas/model/icones/logo.png"))); // NOI18N

        jMenu_Cadastro.setText("Cadastro");
        jMenu_Cadastro.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N

        jMenu_Cliente.setText("Cliente");
        jMenu_Cliente.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N

        jMenuItem_Pessoa_Física.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jMenuItem_Pessoa_Física.setText("Pessoa Física");
        jMenuItem_Pessoa_Física.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Pessoa_FísicaActionPerformed(evt);
            }
        });
        jMenu_Cliente.add(jMenuItem_Pessoa_Física);

        jMenuItem_Pessoa_Jurídica.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jMenuItem_Pessoa_Jurídica.setText("Pessoa Jurídica");
        jMenuItem_Pessoa_Jurídica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Pessoa_JurídicaActionPerformed(evt);
            }
        });
        jMenu_Cliente.add(jMenuItem_Pessoa_Jurídica);

        jMenu_Cadastro.add(jMenu_Cliente);

        jMenuItem_Vendedor.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jMenuItem_Vendedor.setText("Vendedor");
        jMenuItem_Vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_VendedorActionPerformed(evt);
            }
        });
        jMenu_Cadastro.add(jMenuItem_Vendedor);

        jMenu.add(jMenu_Cadastro);

        JMenuAlterar.setText("Alterar");
        JMenuAlterar.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N

        jMenuItem_Alterar_Cliente.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jMenuItem_Alterar_Cliente.setText("Cliente");
        jMenuItem_Alterar_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Alterar_ClienteActionPerformed(evt);
            }
        });
        JMenuAlterar.add(jMenuItem_Alterar_Cliente);

        jMenuItem_Alterar_Vendedor.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jMenuItem_Alterar_Vendedor.setText("Vendedor");
        jMenuItem_Alterar_Vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Alterar_VendedorActionPerformed(evt);
            }
        });
        JMenuAlterar.add(jMenuItem_Alterar_Vendedor);

        jmenu_AlterarSenha.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jmenu_AlterarSenha.setText("Senha");
        jmenu_AlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenu_AlterarSenhaActionPerformed(evt);
            }
        });
        JMenuAlterar.add(jmenu_AlterarSenha);

        jMenu.add(JMenuAlterar);

        jMenu_Gerar_Pedido.setText("Gerar Pedido");
        jMenu_Gerar_Pedido.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N

        jMenuItem_Gerar_Pedido.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jMenuItem_Gerar_Pedido.setText("Gerar Pedido");
        jMenuItem_Gerar_Pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Gerar_PedidoActionPerformed(evt);
            }
        });
        jMenu_Gerar_Pedido.add(jMenuItem_Gerar_Pedido);

        jMenu.add(jMenu_Gerar_Pedido);

        jMenu_Pedidos_Aprovados.setText("Pedidos Aprovados");
        jMenu_Pedidos_Aprovados.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N

        jMenuItem_PedidosAprovados.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jMenuItem_PedidosAprovados.setText("Pedidos Aprovados");
        jMenuItem_PedidosAprovados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_PedidosAprovadosActionPerformed(evt);
            }
        });
        jMenu_Pedidos_Aprovados.add(jMenuItem_PedidosAprovados);

        jMenu.add(jMenu_Pedidos_Aprovados);

        jMenu_GerenciarPendencias.setText("Gerenciar Pendencias");
        jMenu_GerenciarPendencias.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N

        jMenuItem_Analise_de_Credito.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jMenuItem_Analise_de_Credito.setText("Análise de Crédito");
        jMenuItem_Analise_de_Credito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Analise_de_CreditoActionPerformed(evt);
            }
        });
        jMenu_GerenciarPendencias.add(jMenuItem_Analise_de_Credito);

        jMenu.add(jMenu_GerenciarPendencias);

        jMenu_ControleEstrategico.setText("Controle Estratégico");
        jMenu_ControleEstrategico.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N

        jMenuItem_PorCliente.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jMenuItem_PorCliente.setText("Por Cliente");
        jMenuItem_PorCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_PorClienteActionPerformed(evt);
            }
        });
        jMenu_ControleEstrategico.add(jMenuItem_PorCliente);

        jMenuItem_PorVendedor.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jMenuItem_PorVendedor.setText("Por Vendedor");
        jMenuItem_PorVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_PorVendedorActionPerformed(evt);
            }
        });
        jMenu_ControleEstrategico.add(jMenuItem_PorVendedor);

        jMenuItem_PorRegiao.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jMenuItem_PorRegiao.setText("Por Região");
        jMenuItem_PorRegiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_PorRegiaoActionPerformed(evt);
            }
        });
        jMenu_ControleEstrategico.add(jMenuItem_PorRegiao);

        jMenu.add(jMenu_ControleEstrategico);
        jMenu.add(jMenu5);

        jMenu7.setText("Informações Gerente");
        jMenu7.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jMenuItem4.setText("Clientes Atribuídos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem4);

        jMenu.add(jMenu7);

        setJMenuBar(jMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addComponent(lblLogotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(lblLogotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_Pessoa_FísicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Pessoa_FísicaActionPerformed
        new GuiCadastroPessoa_Física(login).setVisible(true);
    }//GEN-LAST:event_jMenuItem_Pessoa_FísicaActionPerformed

    private void jMenuItem_Pessoa_JurídicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Pessoa_JurídicaActionPerformed
        new GuiCadastroPessoa_Jurídica(login).setVisible(true);
    }//GEN-LAST:event_jMenuItem_Pessoa_JurídicaActionPerformed

    private void jMenuItem_Analise_de_CreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Analise_de_CreditoActionPerformed
        new GuiAnalise_de_Credito(login).setVisible(true);
    }//GEN-LAST:event_jMenuItem_Analise_de_CreditoActionPerformed

    private void jMenuItem_Gerar_PedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Gerar_PedidoActionPerformed
        new GuiGerar_Pedido(login).setVisible(true);
    }//GEN-LAST:event_jMenuItem_Gerar_PedidoActionPerformed

    private void jMenuItem_VendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_VendedorActionPerformed
        new GuiCadastro_Vendedor(login).setVisible(true);
    }//GEN-LAST:event_jMenuItem_VendedorActionPerformed

    private void jMenuItem_Alterar_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Alterar_ClienteActionPerformed
        new GuiAlterar_Cliente(login).setVisible(true);
    }//GEN-LAST:event_jMenuItem_Alterar_ClienteActionPerformed

    private void jMenuItem_Alterar_VendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Alterar_VendedorActionPerformed
        new GuiAlterar_Vendedor(login).setVisible(true);
    }//GEN-LAST:event_jMenuItem_Alterar_VendedorActionPerformed

    private void jMenuItem_PedidosAprovadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_PedidosAprovadosActionPerformed
        new GuiPedidos_Aprovados(login).setVisible(true);
    }//GEN-LAST:event_jMenuItem_PedidosAprovadosActionPerformed

    private void jMenuItem_PorRegiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_PorRegiaoActionPerformed
        new GuiControle_Estratégico_por_Região(login).setVisible(true);
    }//GEN-LAST:event_jMenuItem_PorRegiaoActionPerformed

    private void jMenuItem_PorClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_PorClienteActionPerformed
        new GuiControle_Estratégico_por_Cliente(login).setVisible(true);
    }//GEN-LAST:event_jMenuItem_PorClienteActionPerformed

    private void jMenuItem_PorVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_PorVendedorActionPerformed
        new GuiControle_Estratégico_por_Vendedor(login).setVisible(true);
    }//GEN-LAST:event_jMenuItem_PorVendedorActionPerformed

    private void jmenu_AlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenu_AlterarSenhaActionPerformed
        new GuiAlterar_Senha(login).setVisible(true);
    }//GEN-LAST:event_jmenu_AlterarSenhaActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       new GuiClientes_doVendedor(login).setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(GuiMenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiMenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiMenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiMenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMenuGerente(login).setVisible(true);
            }
        });
    }
    private static Login login;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMenuAlterar;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem_Alterar_Cliente;
    private javax.swing.JMenuItem jMenuItem_Alterar_Vendedor;
    private javax.swing.JMenuItem jMenuItem_Analise_de_Credito;
    private javax.swing.JMenuItem jMenuItem_Gerar_Pedido;
    private javax.swing.JMenuItem jMenuItem_PedidosAprovados;
    private javax.swing.JMenuItem jMenuItem_Pessoa_Física;
    private javax.swing.JMenuItem jMenuItem_Pessoa_Jurídica;
    private javax.swing.JMenuItem jMenuItem_PorCliente;
    private javax.swing.JMenuItem jMenuItem_PorRegiao;
    private javax.swing.JMenuItem jMenuItem_PorVendedor;
    private javax.swing.JMenuItem jMenuItem_Vendedor;
    private javax.swing.JMenu jMenu_Cadastro;
    private javax.swing.JMenu jMenu_Cliente;
    private javax.swing.JMenu jMenu_ControleEstrategico;
    private javax.swing.JMenu jMenu_Gerar_Pedido;
    private javax.swing.JMenu jMenu_GerenciarPendencias;
    private javax.swing.JMenu jMenu_Pedidos_Aprovados;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem jmenu_AlterarSenha;
    private javax.swing.JLabel lblLogotipo;
    // End of variables declaration//GEN-END:variables
}
