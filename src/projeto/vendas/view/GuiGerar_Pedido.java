/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.vendas.view;

import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projeto.vendas.control.Conexao;
import projeto.vendas.control.DaoGerarPedido;
import projeto.vendas.control.DaoPFisica;
import projeto.vendas.control.DaoPJuridica;
import projeto.vendas.control.DaoPedidoProduto;
import projeto.vendas.control.DaoProduto;
import projeto.vendas.control.DaoVendedor;
import projeto.vendas.model.Cliente;
import projeto.vendas.model.Login;
import projeto.vendas.model.Pedido;
import projeto.vendas.model.PedidoProduto;
import projeto.vendas.model.PessoaFisica;
import projeto.vendas.model.PessoaJuridica;
import projeto.vendas.model.Produto;
import projeto.vendas.model.validacoes.ValidaCNPJ;
import projeto.vendas.model.validacoes.ValidaCPF;

/**
 *
 * @author Cleiton
 */
public class GuiGerar_Pedido extends javax.swing.JFrame {

    /**
     * Creates new form Gerar_Pedido
     */
    public GuiGerar_Pedido(Login login) {
        initComponents();
        this.login = login;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Painel_Cliente = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lbl_CPF_CNPJ = new javax.swing.JLabel();
        txtCPF_CNPJ = new javax.swing.JTextField();
        txt_nomeCliente = new javax.swing.JTextField();
        btn_consultar = new javax.swing.JButton();
        lbl_codigoCliente = new javax.swing.JLabel();
        lbl_AvisoCPF_CNPJ = new javax.swing.JLabel();
        Painel_Produto = new javax.swing.JPanel();
        lblProduto = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        cbxQuantidade = new javax.swing.JSpinner();
        cbxProduto = new javax.swing.JComboBox<>();
        btnAvançar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_QtdEstoque = new javax.swing.JLabel();
        Painel_Pedido = new javax.swing.JPanel();
        lblData = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        Produto = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        txt_Data = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnEnviar_Pedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerar Pedido");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Painel_Cliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        lblNome.setText("Nome");

        lbl_CPF_CNPJ.setText("CPF ou CNPJ");

        txtCPF_CNPJ.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCPF_CNPJ.setText("39291371866");
        txtCPF_CNPJ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCPF_CNPJFocusLost(evt);
            }
        });

        txt_nomeCliente.setEnabled(false);

        btn_consultar.setText("Consultar");
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        lbl_codigoCliente.setText("jLabel1");
        lbl_codigoCliente.setEnabled(false);
        lbl_codigoCliente.setOpaque(true);

        lbl_AvisoCPF_CNPJ.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_AvisoCPF_CNPJ.setText("kkk");

        javax.swing.GroupLayout Painel_ClienteLayout = new javax.swing.GroupLayout(Painel_Cliente);
        Painel_Cliente.setLayout(Painel_ClienteLayout);
        Painel_ClienteLayout.setHorizontalGroup(
            Painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_ClienteLayout.createSequentialGroup()
                .addGroup(Painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(txt_nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_ClienteLayout.createSequentialGroup()
                        .addComponent(lbl_AvisoCPF_CNPJ)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_ClienteLayout.createSequentialGroup()
                        .addGroup(Painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Painel_ClienteLayout.createSequentialGroup()
                                .addComponent(lbl_CPF_CNPJ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addComponent(lbl_codigoCliente))
                            .addComponent(txtCPF_CNPJ))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_consultar)
                        .addGap(48, 48, 48))))
        );
        Painel_ClienteLayout.setVerticalGroup(
            Painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_ClienteLayout.createSequentialGroup()
                .addGroup(Painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lbl_CPF_CNPJ)
                    .addComponent(lbl_codigoCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCPF_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_consultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_AvisoCPF_CNPJ))
        );

        Painel_Produto.setBorder(javax.swing.BorderFactory.createTitledBorder("Produto"));

        lblProduto.setText("Produto");

        lblQuantidade.setText("Qtde.");

        cbxQuantidade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbxQuantidade.setEnabled(false);

        cbxProduto.setEnabled(false);
        cbxProduto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxProdutoItemStateChanged(evt);
            }
        });

        btnAvançar.setText("Adicionar");
        btnAvançar.setEnabled(false);
        btnAvançar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvançarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Quantidade em Estoque: ");

        lbl_QtdEstoque.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout Painel_ProdutoLayout = new javax.swing.GroupLayout(Painel_Produto);
        Painel_Produto.setLayout(Painel_ProdutoLayout);
        Painel_ProdutoLayout.setHorizontalGroup(
            Painel_ProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_ProdutoLayout.createSequentialGroup()
                .addGroup(Painel_ProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProduto)
                    .addComponent(jLabel1))
                .addGroup(Painel_ProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_ProdutoLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(lblQuantidade))
                    .addGroup(Painel_ProdutoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(Painel_ProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_QtdEstoque)
                            .addGroup(Painel_ProdutoLayout.createSequentialGroup()
                                .addComponent(cbxQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAvançar)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Painel_ProdutoLayout.setVerticalGroup(
            Painel_ProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_ProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel_ProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProduto)
                    .addComponent(lblQuantidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_ProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_ProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAvançar))
                    .addComponent(cbxQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_ProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lbl_QtdEstoque))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        Painel_Pedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedido"));

        lblData.setText("Data:");

        lblTotal.setText("Total:");

        Produto.setToolTipText("");

        tblProduto.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Preço Unit.", "Quantidade", "Total Produto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class
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
        tblProduto.setName(""); // NOI18N
        tblProduto.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblProdutoKeyPressed(evt);
            }
        });
        Produto.setViewportView(tblProduto);

        txt_Data.setEditable(false);

        txt_total.setEditable(false);

        javax.swing.GroupLayout Painel_PedidoLayout = new javax.swing.GroupLayout(Painel_Pedido);
        Painel_Pedido.setLayout(Painel_PedidoLayout);
        Painel_PedidoLayout.setHorizontalGroup(
            Painel_PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_PedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel_PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_PedidoLayout.createSequentialGroup()
                        .addComponent(Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Painel_PedidoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Data, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Painel_PedidoLayout.setVerticalGroup(
            Painel_PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_PedidoLayout.createSequentialGroup()
                .addComponent(Produto, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Painel_PedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblData)))
        );

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.setEnabled(false);

        btnEnviar_Pedido.setText("Enviar Pedido");
        btnEnviar_Pedido.setEnabled(false);
        btnEnviar_Pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviar_PedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addGap(109, 109, 109)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEnviar_Pedido))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Painel_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Painel_Produto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(Painel_Pedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Painel_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Painel_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Painel_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpar)
                    .addComponent(btnVoltar)
                    .addComponent(btnEnviar_Pedido))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // nova maneira de conectar
        conexao = new Conexao();
        conexao.setDriver();
        conexao.setConnectionString();

        daoProduto = new DaoProduto(conexao.conectar());
        daoPFisica = new DaoPFisica(conexao.conectar());
        daoPJrudica = new DaoPJuridica(conexao.conectar());
        daoPedidoProduto = new DaoPedidoProduto(conexao.conectar());
        daoGerarPedido = new DaoGerarPedido(conexao.conectar());
        listaProdutos = daoProduto.ListarProdutos();
        ListaPessoaFisica = daoPFisica.ListarPessoasFisicas();
        ListaPessoaJuridica = daoPJrudica.ListarPessoasJuridicas();

        lbl_codigoCliente.setVisible(false);
        Date data = new Date(System.currentTimeMillis());
        SimpleDateFormat formatarDate = new SimpleDateFormat("dd/MM/yyyy");
        txt_Data.setText(formatarDate.format(data));

        for (int i = 0; i < listaProdutos.size(); i++) {

            cbxProduto.addItem(listaProdutos.get(i).getDescricao());
        }

    }//GEN-LAST:event_formWindowOpened

    private void btnEnviar_PedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviar_PedidoActionPerformed

        Calendar calendar = new GregorianCalendar();
        String HoraSistema = calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND);

        if (JOptionPane.showConfirmDialog(null, "Deseja efetuar o Pedido ?") == 0) {//Sim

            Pedido pedido = new Pedido(daoGerarPedido.getProximoCodigo(),
                    lbl_codigoCliente.getText(), login.getCodigo(),
                    txt_Data.getText() + "-" + HoraSistema,
                    Float.parseFloat(txt_total.getText()), 3);
            daoGerarPedido.inserir(pedido);
            for (int i = 0; i < pedidoProduto.size(); i++) {
                pedidoProduto.get(i).setPedidoCod(pedido.getCodigo());
                daoPedidoProduto.inserir(pedidoProduto.get(i));
            }
            JOptionPane.showMessageDialog(null, "Pedido registrado com Sucesso!");
            btnAvançar.setEnabled(false);
            cbxProduto.setEnabled(false);
            cbxQuantidade.setEnabled(false);
            btnEnviar_Pedido.setEnabled(false);
            btn_consultar.setEnabled(true);
            txtCPF_CNPJ.setEnabled(true);
            txt_total.setText("0.00");
            tblProduto.removeAll();
            txtCPF_CNPJ.requestFocus();
            int limite = tblProduto.getModel().getRowCount();
            DefaultTableModel model = (DefaultTableModel) tblProduto.getModel();
            for (int i = 0; i < limite; i++) {
                model.removeRow(0);
            }

        }

    }//GEN-LAST:event_btnEnviar_PedidoActionPerformed

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        if (txtCPF_CNPJ.getText().length() == 11) {
            pessoaFisica = daoPFisica.consultaCPF(txtCPF_CNPJ.getText());
            if (pessoaFisica == null && ValidaCPF.validaCpf(txtCPF_CNPJ.getText()) == true) {
                JOptionPane.showMessageDialog(null, "Cliente Não Cadastrado");
//                lbl_AvisoCPF_CNPJ.setText("Cliente não Cadastrado");
            } else {
                lbl_AvisoCPF_CNPJ.setText("CPF Inválido");
            }
            if (pessoaFisica != null) {
                cbxQuantidade.requestFocus();
                txt_nomeCliente.setText(pessoaFisica.getNome());
                lbl_codigoCliente.setText(pessoaFisica.getCodigo());
                btnAvançar.setEnabled(true);
                cbxProduto.setEnabled(true);
                cbxQuantidade.setEnabled(true);
                btnEnviar_Pedido.setEnabled(true);
                btn_consultar.setEnabled(false);
                txtCPF_CNPJ.setEnabled(false);
                lbl_AvisoCPF_CNPJ.setText("Cliente Localizado");
            }

        } else if (txtCPF_CNPJ.getText().length() == 14) {
            pessoaJuridica = daoPJrudica.consultaCNPJ(txtCPF_CNPJ.getText());
            if (pessoaJuridica == null && ValidaCNPJ.validaCnpj(txtCPF_CNPJ.getText()) == true) {
                JOptionPane.showMessageDialog(null, "Cliente Não Cadastrado");
            } else {
                lbl_AvisoCPF_CNPJ.setText("CNPJ Inválido");
            }
            txt_nomeCliente.setText(pessoaJuridica.getNome());
            lbl_codigoCliente.setText(pessoaJuridica.getCodigo());
            btnAvançar.setEnabled(true);
            cbxProduto.setEnabled(true);
            cbxQuantidade.setEnabled(true);
            btnEnviar_Pedido.setEnabled(true);
            btn_consultar.setEnabled(false);
            txtCPF_CNPJ.setEnabled(false);
            lbl_AvisoCPF_CNPJ.setText("Cliente Localizado");

        }
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void tblProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblProdutoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_BACKSPACE || evt.getKeyCode() == KeyEvent.VK_DELETE) {
            DefaultTableModel model = (DefaultTableModel) tblProduto.getModel();

            if (tblProduto.getSelectedRow() >= 0) {
                Total = (Total - (float) model.getValueAt(tblProduto.getSelectedRow(), 4));
                txt_total.setText("" + Total);
                pedidoProduto.remove(tblProduto.getSelectedRow());
                model.removeRow(tblProduto.getSelectedRow());
            }
        }
    }//GEN-LAST:event_tblProdutoKeyPressed

    private void txtCPF_CNPJFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCPF_CNPJFocusLost
        if (txtCPF_CNPJ.getText().length() < 11) {
            lbl_AvisoCPF_CNPJ.setText("CPF Inválido.");
        }
        if (txtCPF_CNPJ.getText().length() > 14
                || (txtCPF_CNPJ.getText().length() > 11 && txtCPF_CNPJ.getText().length() < 14)) {
            lbl_AvisoCPF_CNPJ.setText("CNPJ Inválido.");
        }
        if (txtCPF_CNPJ.getText().length() == 11) {

            if (ValidaCPF.validaCpf(txtCPF_CNPJ.getText()) == false) {
                lbl_AvisoCPF_CNPJ.setText("CPF Inválido.");
            }
        }
        if (txtCPF_CNPJ.getText().length() == 14) {
            lbl_AvisoCPF_CNPJ.setText("CNPJ Inválido.");
        }
    }//GEN-LAST:event_txtCPF_CNPJFocusLost

    private void cbxProdutoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxProdutoItemStateChanged
        lbl_QtdEstoque.setText("" + listaProdutos.get(cbxProduto.getSelectedIndex()).getQtdEstoque());
    }//GEN-LAST:event_cbxProdutoItemStateChanged

    private void btnAvançarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvançarActionPerformed
        if (((int) cbxQuantidade.getValue()) <= 0) {
            JOptionPane.showMessageDialog(null, "Por Favor, insira uma quantidade válida, maior que 0.", "Erro Crítico", JOptionPane.ERROR_MESSAGE);
        }
        if (((int) cbxQuantidade.getValue()) > listaProdutos.get(cbxProduto.getSelectedIndex()).getQtdEstoque()) {
            JOptionPane.showMessageDialog(null, "Quantidade informada maior que a quantidade do produto em estoque.", "Erro Crítico", JOptionPane.ERROR_MESSAGE);
        } else if ((((int) cbxQuantidade.getValue()) > 0 && ((int) cbxQuantidade.getValue()) <= listaProdutos.get(cbxProduto.getSelectedIndex()).getQtdEstoque())) {
            Object[] row = {listaProdutos.get(cbxProduto.getSelectedIndex()).getCodigo(), cbxProduto.getSelectedItem().toString(), listaProdutos.get(cbxProduto.getSelectedIndex()).getValorUnitario(), cbxQuantidade.getValue(), ((Integer) cbxQuantidade.getValue()) * (listaProdutos.get(cbxProduto.getSelectedIndex()).getValorUnitario())};

            DefaultTableModel model = (DefaultTableModel) tblProduto.getModel();
            model.addRow(row);

            Total = 0;
            for (int i = 0; i < tblProduto.getRowCount(); i++) {
                Total = Total + (float) model.getValueAt(i, 4);

            }
            txt_total.setText("" + Total);

            PedidoProduto itemPedido = new PedidoProduto(1, listaProdutos.get(cbxProduto.getSelectedIndex()).getCodigo(), (int) cbxQuantidade.getValue());
            pedidoProduto.add(itemPedido);
            //Atualizando a o DISPLAY de quantidade.
            listaProdutos.get(cbxProduto.getSelectedIndex()).setQtdEstoque(listaProdutos.get(cbxProduto.getSelectedIndex()).getQtdEstoque() - (int) cbxQuantidade.getValue());
            lbl_QtdEstoque.setText("" + listaProdutos.get(cbxProduto.getSelectedIndex()).getQtdEstoque());
        }

    }//GEN-LAST:event_btnAvançarActionPerformed

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
            java.util.logging.Logger.getLogger(GuiGerar_Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiGerar_Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiGerar_Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiGerar_Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiGerar_Pedido(login).setVisible(true);
            }
        });
    }
    private float Total = 0;
    private ArrayList<Produto> listaProdutos = null;
    private ArrayList<PedidoProduto> pedidoProduto = new ArrayList();
    private ArrayList<PessoaFisica> ListaPessoaFisica = null;
    private ArrayList<PessoaJuridica> ListaPessoaJuridica = null;
    private ArrayList<Pedido> ListaPedido = new ArrayList();
    private Conexao conexao;
    private DaoProduto daoProduto = null;
    private DaoPFisica daoPFisica = null;
    private DaoGerarPedido daoGerarPedido = null;
    private DaoPJuridica daoPJrudica = null;
    private DaoPedidoProduto daoPedidoProduto = null;
    private PessoaFisica pessoaFisica = null;
    private PessoaJuridica pessoaJuridica = null;
    private static Login login = null;

    private Produto produto;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Painel_Cliente;
    private javax.swing.JPanel Painel_Pedido;
    private javax.swing.JPanel Painel_Produto;
    private javax.swing.JScrollPane Produto;
    private javax.swing.JButton btnAvançar;
    private javax.swing.JButton btnEnviar_Pedido;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton btn_consultar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxProduto;
    private javax.swing.JSpinner cbxQuantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lbl_AvisoCPF_CNPJ;
    private javax.swing.JLabel lbl_CPF_CNPJ;
    private javax.swing.JLabel lbl_QtdEstoque;
    private javax.swing.JLabel lbl_codigoCliente;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField txtCPF_CNPJ;
    private javax.swing.JTextField txt_Data;
    private javax.swing.JTextField txt_nomeCliente;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables

}
