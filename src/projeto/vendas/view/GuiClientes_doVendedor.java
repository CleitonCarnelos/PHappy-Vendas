/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.vendas.view;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import projeto.vendas.control.Conexao;
import projeto.vendas.control.DaoGerarPedido;
import projeto.vendas.control.DaoPFisica;
import projeto.vendas.control.DaoPJuridica;
import projeto.vendas.model.Login;
import projeto.vendas.model.Pedido;
import projeto.vendas.model.PessoaFisica;
import projeto.vendas.model.PessoaJuridica;

/**
 *
 * @author Fernando
 */
public class GuiClientes_doVendedor extends javax.swing.JFrame {

    /**
     * Creates new form GuiClientes_doVendedor
     */
    public GuiClientes_doVendedor(Login login) {
        initComponents();

        GuiClientes_doVendedor.this.setTitle("Clientes      " + "Usuário:  " + login.getNome()
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

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_clientes = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tbl_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Cliente", "Data de Cadastro", "Data Última Compra", "Status"
            }
        ));
        jScrollPane1.setViewportView(tbl_clientes);
        if (tbl_clientes.getColumnModel().getColumnCount() > 0) {
            tbl_clientes.getColumnModel().getColumn(0).setMinWidth(1);
            tbl_clientes.getColumnModel().getColumn(0).setPreferredWidth(1);
            tbl_clientes.getColumnModel().getColumn(0).setMaxWidth(1);
            tbl_clientes.getColumnModel().getColumn(2).setMinWidth(105);
            tbl_clientes.getColumnModel().getColumn(2).setPreferredWidth(105);
            tbl_clientes.getColumnModel().getColumn(2).setMaxWidth(105);
            tbl_clientes.getColumnModel().getColumn(3).setMinWidth(125);
            tbl_clientes.getColumnModel().getColumn(3).setPreferredWidth(125);
            tbl_clientes.getColumnModel().getColumn(3).setMaxWidth(125);
            tbl_clientes.getColumnModel().getColumn(4).setMinWidth(60);
            tbl_clientes.getColumnModel().getColumn(4).setPreferredWidth(60);
            tbl_clientes.getColumnModel().getColumn(4).setMaxWidth(60);
        }

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/vendas/model/icones/Imprimir.png"))); // NOI18N
        jButton5.setText("Gerar Ficha Cliente");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/vendas/model/icones/Voltar.png"))); // NOI18N
        jButton6.setText("Voltar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao();
        conexao.setDriver();
        conexao.setConnectionString();
        daoPFisica = new DaoPFisica(conexao.conectar());
        daoPFisica = new DaoPFisica(conexao.conectar());
        daoPJuridica = new DaoPJuridica(conexao.conectar());
        daoGerarPedido = new DaoGerarPedido(conexao.conectar());

        listaPF = daoPFisica.ListarPFPorCodVend(login.getCodigo());
        listaPJ = daoPJuridica.ListarPJPorCodVend(login.getCodigo());
        DefaultTableModel model = (DefaultTableModel) tbl_clientes.getModel();

     /*   for (int i = 0; i < listaPF.size(); i++) {
            cbx_clientes.addItem(listaPF.get(i).getNome());

        }
        for (int i = 0; i < listaPJ.size(); i++) {
            cbx_clientes.addItem(listaPJ.get(i).getNome());

        }*/
     for (int i = 0; i < listaPF.size(); i++) {
                Object[] row = {
                    listaPF.get(i).getCodigo(),
                    "(" + listaPF.get(i).getCodigo() + ")   " + listaPF.get(i).getNome(),
                    listaPF.get(i).getDtInicio().substring(0, 2) + "/" + listaPF.get(i).getDtInicio().substring(2, 4) + "/"
                    + listaPF.get(i).getDtInicio().substring(4, listaPF.get(i).getDtInicio().length()),
                    daoGerarPedido.UltimoPedido(listaPF.get(i).getCodigo()),
                    listaPF.get(i).getAtivo()
                };
                model.addRow(row);
                System.out.println(listaPF.get(i).getDtInicio());

            }
            for (int i = 0; i < listaPJ.size(); i++) {
                Object[] row = {
                    listaPJ.get(i).getCodigo(),
                    "(" + listaPJ.get(i).getCodigo() + ")   " + listaPJ.get(i).getNome(),
                    listaPJ.get(i).getDtInicio().substring(0, 2) + "/" + listaPJ.get(i).getDtInicio().substring(2, 4) + "/"
                    + listaPJ.get(i).getDtInicio().substring(4, listaPJ.get(i).getDtInicio().length()),
                    daoGerarPedido.UltimoPedido(listaPJ.get(i).getCodigo()),
                    listaPJ.get(i).getAtivo()
                };
                model.addRow(row);
                System.out.println(listaPJ.get(i).getDtInicio());

            }
    }//GEN-LAST:event_formWindowOpened

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
             String codCli = "";
        Map parameters = new HashMap();
        if (tbl_clientes.getSelectedRow() >= 0) {
            codCli = (String) tbl_clientes.getValueAt(tbl_clientes.getSelectedRow(), 0);
            if (codCli.substring(0, 2).equals("PF")) {
                try {
                    parameters.put("codigo", (String) tbl_clientes.getValueAt(tbl_clientes.getSelectedRow(), 0));
                    JasperPrint jpPrint;
                    jpPrint = JasperFillManager.fillReport("relatorios/EspelhoClientePF.jasper",
                            parameters, conexao.conectar());

                    JasperViewer jv = new JasperViewer(jpPrint, false);
                    jv.setVisible(true);

                } catch (JRException ex) {
                    Logger.getLogger(GuiControle_Estratégico_por_Vendedor_Especifico.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    parameters.put("codigo", (String) tbl_clientes.getValueAt(tbl_clientes.getSelectedRow(), 0));
                    JasperPrint jpPrint;
                    jpPrint = JasperFillManager.fillReport("relatorios/EspelhoClientePJ.jasper",
                            parameters, conexao.conectar());

                    JasperViewer jv = new JasperViewer(jpPrint, false);
                    jv.setVisible(true);

                } catch (JRException ex) {
                    Logger.getLogger(GuiControle_Estratégico_por_Vendedor_Especifico.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Escolha um cliente!");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(GuiClientes_doVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiClientes_doVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiClientes_doVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiClientes_doVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiClientes_doVendedor(login).setVisible(true);
            }
        });
    }

    private Conexao conexao;
    private DaoGerarPedido daoGerarPedido;
    private DaoPFisica daoPFisica;
    private DaoPJuridica daoPJuridica;
    private ArrayList<PessoaFisica> listaPF = new ArrayList<PessoaFisica>();
    private ArrayList<PessoaJuridica> listaPJ = new ArrayList<PessoaJuridica>();
    private ArrayList<Pedido> listaPedidos = new ArrayList<Pedido>();
    private static Login login;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_clientes;
    // End of variables declaration//GEN-END:variables
}
