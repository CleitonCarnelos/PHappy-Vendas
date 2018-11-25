/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.vendas.view;

import java.awt.Color;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import projeto.vendas.control.Conexao;
import projeto.vendas.control.DaoGerarPedido;
import projeto.vendas.control.DaoPFisica;
import projeto.vendas.control.DaoPJuridica;
import projeto.vendas.control.DaoProduto;
import projeto.vendas.model.Login;
import projeto.vendas.model.Pedido;
import projeto.vendas.model.PedidoProduto;
import projeto.vendas.model.PessoaFisica;
import projeto.vendas.model.PessoaJuridica;
import projeto.vendas.tabelas.GuiControleEstrategico_ClienteGeral;

/**
 *
 * @author 0030481521038
 */
public class GuiControle_Estratégico_por_Cliente extends javax.swing.JFrame {

    /**
     * Creates new form GuiControle_Estratégico_por_Cliente
     */
    public GuiControle_Estratégico_por_Cliente(Login login) {
        this.login = login;
        initComponents();
        DefaultTableModel model = (DefaultTableModel) tblCliente.getModel();
        tblCliente.setRowSorter(new TableRowSorter(model));
        GuiControle_Estratégico_por_Cliente.this.setTitle("Controle Estratégico Cliente             " + "Usuário:  " + login.getNome()
                + "         " + "Codigo:  " + login.getCodigo());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo_Cliente = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Painel_Pesquisa_Cliente6 = new javax.swing.JPanel();
        rbtnNome_Cliente = new javax.swing.JRadioButton();
        rbtnCodigo_Cliente = new javax.swing.JRadioButton();
        txt_Cliente = new javax.swing.JTextField();
        btn_pesquisar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Painel_Cliente = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        btn_imprimir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle Estratégico por Cliente");
        setBackground(new java.awt.Color(102, 153, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        Painel_Pesquisa_Cliente6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa Individual de Cliente", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        Grupo_Cliente.add(rbtnNome_Cliente);
        rbtnNome_Cliente.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnNome_Cliente.setText("Nome");

        Grupo_Cliente.add(rbtnCodigo_Cliente);
        rbtnCodigo_Cliente.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnCodigo_Cliente.setSelected(true);
        rbtnCodigo_Cliente.setText("Código");

        txt_Cliente.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt_Cliente.setText("PF1");

        btn_pesquisar.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        btn_pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/vendas/model/icones/Consultar.png"))); // NOI18N
        btn_pesquisar.setText("Pesquisar");
        btn_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/vendas/model/icones/Voltar.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Painel_Pesquisa_Cliente6Layout = new javax.swing.GroupLayout(Painel_Pesquisa_Cliente6);
        Painel_Pesquisa_Cliente6.setLayout(Painel_Pesquisa_Cliente6Layout);
        Painel_Pesquisa_Cliente6Layout.setHorizontalGroup(
            Painel_Pesquisa_Cliente6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_Pesquisa_Cliente6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel_Pesquisa_Cliente6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnNome_Cliente)
                    .addComponent(rbtnCodigo_Cliente))
                .addGap(18, 18, 18)
                .addGroup(Painel_Pesquisa_Cliente6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_Cliente)
                    .addComponent(btn_pesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                .addContainerGap(284, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_Pesquisa_Cliente6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Painel_Pesquisa_Cliente6Layout.setVerticalGroup(
            Painel_Pesquisa_Cliente6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_Pesquisa_Cliente6Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(Painel_Pesquisa_Cliente6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnNome_Cliente)
                    .addComponent(txt_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_Pesquisa_Cliente6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbtnCodigo_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa Coletiva de Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        tblCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Frequência de Compras", "Maior Compra", "Valor Médio Gasto em Compras ", "Produto Favorito"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCliente.setFillsViewportHeight(true);
        tblCliente.setRowHeight(20);
        tblCliente.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Painel_Cliente.setViewportView(tblCliente);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(Painel_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btn_imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/vendas/model/icones/Imprimir.png"))); // NOI18N
        btn_imprimir.setText("Imprimir");
        btn_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("** Apenas os clientes que realizaram alguma compra serão impressos .");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Painel_Pesquisa_Cliente6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_imprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Painel_Pesquisa_Cliente6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        conexao = new Conexao();
        conexao.setDriver();
        conexao.setConnectionString();
        daoPF = new DaoPFisica(conexao.conectar());
        daoPJ = new DaoPJuridica(conexao.conectar());
        daoPedido = new DaoGerarPedido(conexao.conectar());
        daoProduto = new DaoProduto(conexao.conectar());
        model = (DefaultTableModel) tblCliente.getModel();

        ArrayList<Pedido> ListaPedidos = new ArrayList<Pedido>();
        ArrayList<PessoaFisica> ListaPF = new ArrayList<PessoaFisica>();
        ArrayList<PessoaJuridica> ListaPJ = new ArrayList<PessoaJuridica>();
        ArrayList<PedidoProduto> ListaPedidoProduto = new ArrayList<PedidoProduto>();
        ListaPF = daoPF.ListarPessoasFisicas();
        ListaPJ = daoPJ.ListarPessoasJuridicas();
        NumberFormat formatarFloat = new DecimalFormat("0.00");

        for (int i = 0; i < ListaPF.size(); i++) {
            ListaPedidoProduto = daoPedido.ProdutosMaisComprados(ListaPF.get(i).getCodigo());
            if (ListaPedidoProduto.size() > 0) {
                Object[] row = {
                    ListaPF.get(i).getNome(),
                    formatarFloat.format(daoPedido.FrequenciaDeCompras(ListaPF.get(i).getCodigo(), formatarDate.format(data), ListaPF.get(i).getDtInicio())),
                    formatarFloat.format(daoPedido.MaiorCompra(ListaPF.get(i).getCodigo())),
                    formatarFloat.format(daoPedido.MediaCompras(ListaPF.get(i).getCodigo())),
                    daoProduto.consultar(ListaPedidoProduto.get(0).getProdutoCod()).getNome()
                };
                model.addRow(row);
                lista.add(new GuiControleEstrategico_ClienteGeral(
                        ListaPF.get(i).getNome(),
                        Float.parseFloat((formatarFloat.format(daoPedido.FrequenciaDeCompras(ListaPF.get(i).getCodigo(), formatarDate.format(data), ListaPF.get(i).getDtInicio())).replace(",", "."))),
                        Float.parseFloat((formatarFloat.format(daoPedido.MaiorCompra(ListaPF.get(i).getCodigo())).replace(",", "."))),
                        Float.parseFloat((formatarFloat.format(daoPedido.MediaCompras(ListaPF.get(i).getCodigo())).replace(",", "."))),
                        daoProduto.consultar(ListaPedidoProduto.get(0).getProdutoCod()).getNome()));
            } else {
                Object[] row = {
                    ListaPF.get(i).getNome(),
                    "0.00",
                    "0.00",
                    "0.00",
                    "Nenhum"
                };
                model.addRow(row);
            }
        }
        for (int i = 0; i < ListaPJ.size(); i++) {
            ListaPedidoProduto = daoPedido.ProdutosMaisComprados(ListaPJ.get(i).getCodigo());
            if (ListaPedidoProduto.size() > 0) {
                Object[] row = {
                    ListaPJ.get(i).getNome(),
                    formatarFloat.format(daoPedido.FrequenciaDeCompras(ListaPJ.get(i).getCodigo(), formatarDate.format(data), ListaPJ.get(i).getDtInicio())),
                    formatarFloat.format(daoPedido.MaiorCompra(ListaPJ.get(i).getCodigo())),
                    formatarFloat.format(daoPedido.MediaCompras(ListaPJ.get(i).getCodigo())),
                    daoProduto.consultar(ListaPedidoProduto.get(0).getProdutoCod()).getNome()
                };
                System.out.println("Data de Cadastro" + ListaPJ.get(i).getDtInicio() + " // Data de Hoje " + formatarDate.format(data));
                lista.add(new GuiControleEstrategico_ClienteGeral(
                        ListaPJ.get(i).getNome(),
                        Float.parseFloat((formatarFloat.format(daoPedido.FrequenciaDeCompras(ListaPJ.get(i).getCodigo(), formatarDate.format(data), ListaPJ.get(i).getDtInicio())).replace(",", "."))),
                        Float.parseFloat((formatarFloat.format(daoPedido.MaiorCompra(ListaPJ.get(i).getCodigo())).replace(",", "."))),
                        Float.parseFloat((formatarFloat.format(daoPedido.MediaCompras(ListaPJ.get(i).getCodigo())).replace(",", "."))),
                        daoProduto.consultar(ListaPedidoProduto.get(0).getProdutoCod()).getNome()));
                model.addRow(row);
            } else {
                Object[] row = {
                    ListaPJ.get(i).getNome(),
                    "0.00",
                    "0.00",
                    "0.00",
                    "Nenhum"
                };
                model.addRow(row);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
//        txtArea_clienteDetalhes.setText("Frequência de Compras : 2\n Média de Compras = 5.000,78");


    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed
        ArrayList<PedidoProduto> ListaPedidoProduto = new ArrayList<PedidoProduto>();
        ArrayList<Pedido> ListaPedidos = new ArrayList<Pedido>();

        if (rbtnCodigo_Cliente.isSelected()) {
            if (txt_Cliente.getText().substring(0, 2).contains("PJ")) {
                PJ = daoPJ.consultar(txt_Cliente.getText());
                if (PJ == null) {
                    JOptionPane.showMessageDialog(null, "Verifique o código do cliente.", "Cliente não Localizado", JOptionPane.ERROR_MESSAGE);
                } else {
                    new GuiControle_EstrategicoCliente_Individual(login, PJ.getCodigo()).setVisible(true);
                }
            } else {

                if (txt_Cliente.getText().substring(0, 2).contains("PF")) {
                    PF = daoPF.consultar(txt_Cliente.getText());
                    if (PF == null) {
                        JOptionPane.showMessageDialog(null, "Verifique o código do cliente.", "Cliente não Localizado", JOptionPane.ERROR_MESSAGE);

                    } else {
                        new GuiControle_EstrategicoCliente_Individual(login, PF.getCodigo()).setVisible(true);
                    }
                } else {
                    // Código que não é NEM PF NEM PJ
                    JOptionPane.showMessageDialog(null, "Código Inválido, por favor verifique-o.", "Código Fora dos Padrões", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            PJ = daoPJ.consultaNome(txt_Cliente.getText());
            if (PJ != null) {
                //faz os comandos para preencher a tela
                new GuiControle_EstrategicoCliente_Individual(login, PJ.getCodigo()).setVisible(true);

            } else {
                PF = daoPF.consultaNome(txt_Cliente.getText());
                if (PF != null) {
                    //Executar as aççoes
                    new GuiControle_EstrategicoCliente_Individual(login, PF.getCodigo()).setVisible(true);
                }
            }
            if (PF == null && PJ == null) {
                JOptionPane.showMessageDialog(null, "Verifique se o NOME do cliente está correto.", "Cliente não Localizado", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_btn_pesquisarActionPerformed

    private void btn_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimirActionPerformed
        Collections.sort(lista);
        JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(lista);
        try {

            JasperPrint jpPrint;
            jpPrint = JasperFillManager.fillReport("relatorios/RelatorioClientesGerais.jasper",
                    null, ds);

            JasperViewer jv = new JasperViewer(jpPrint, false);
            jv.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(GuiControle_Estratégico_por_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_imprimirActionPerformed

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
            java.util.logging.Logger.getLogger(GuiControle_Estratégico_por_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiControle_Estratégico_por_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiControle_Estratégico_por_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiControle_Estratégico_por_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiControle_Estratégico_por_Cliente(login).setVisible(true);
            }
        });
    }
    private List<GuiControleEstrategico_ClienteGeral> lista = new ArrayList<GuiControleEstrategico_ClienteGeral>();
    private static Login login = null;
    private Conexao conexao;
    private DaoPFisica daoPF;
    private DaoPJuridica daoPJ;
    private PessoaFisica PF;
    private PessoaJuridica PJ;
    private DaoGerarPedido daoPedido;
    private DaoProduto daoProduto;
    private DefaultTableModel model;
    Date data = new Date(System.currentTimeMillis());
    SimpleDateFormat formatarDate = new SimpleDateFormat("dd/MM/yyyy");

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Grupo_Cliente;
    private javax.swing.JScrollPane Painel_Cliente;
    private javax.swing.JPanel Painel_Pesquisa_Cliente6;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton btn_imprimir;
    private javax.swing.JButton btn_pesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rbtnCodigo_Cliente;
    private javax.swing.JRadioButton rbtnNome_Cliente;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txt_Cliente;
    // End of variables declaration//GEN-END:variables
}
