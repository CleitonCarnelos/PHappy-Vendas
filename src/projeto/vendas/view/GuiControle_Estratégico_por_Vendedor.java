/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.vendas.view;

/**
 *
 * @author 0030481521038
 */
public class GuiControle_Estratégico_por_Vendedor extends javax.swing.JFrame {

    /**
     * Creates new form GuiControle_Estratégico_por_Vendedor
     */
    public GuiControle_Estratégico_por_Vendedor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnClienteEspecifico = new javax.swing.JButton();
        lblData_Inicial = new javax.swing.JLabel();
        lblData_Final = new javax.swing.JLabel();
        Painel_Geral = new javax.swing.JTabbedPane();
        Painel_Vendedores = new javax.swing.JPanel();
        jScrollPaneVendedor = new javax.swing.JScrollPane();
        tblVendedor = new javax.swing.JTable();
        Painel_ResumoGeral = new javax.swing.JPanel();
        jPanelPeriodo = new javax.swing.JPanel();
        lblDe = new javax.swing.JLabel();
        lblA = new javax.swing.JLabel();
        txtDtInicio = new javax.swing.JTextField();
        txtDtFinal = new javax.swing.JTextField();
        jPanelVendedores = new javax.swing.JPanel();
        lblQtdeColaboradores = new javax.swing.JLabel();
        lblAtivos = new javax.swing.JLabel();
        txtVendAtivos = new javax.swing.JTextField();
        txtVendInativos = new javax.swing.JTextField();
        lblInativos = new javax.swing.JLabel();
        lblQtdeVendedores = new javax.swing.JLabel();
        lblQtdeSupervisor = new javax.swing.JLabel();
        lblQtdeGerentes = new javax.swing.JLabel();
        txtVendedores = new javax.swing.JTextField();
        txtSupervisores = new javax.swing.JTextField();
        txtGerentes = new javax.swing.JTextField();
        jPanelVendas = new javax.swing.JPanel();
        lblTotalValorVendas = new javax.swing.JLabel();
        lblQtdeTotalVendas = new javax.swing.JLabel();
        txtQtdeTotalVendas = new javax.swing.JTextField();
        txtValorTotalVendas = new javax.swing.JTextField();
        btnImprimir = new javax.swing.JButton();
        ftxtData_Inicial = new javax.swing.JFormattedTextField();
        ftxtData_Final = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle Estratégico Vendedor");
        setResizable(false);

        btnBuscar.setText("Buscar");

        btnVoltar.setText("Voltar");

        btnClienteEspecifico.setText("Selecionar Cliente Específico");

        lblData_Inicial.setText("Data Inicial");

        lblData_Final.setText("Data Final");

        tblVendedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Cargo", "Vendas no periodo", "Qtde Clientes", "Ativo/Inativo", "Data da Inatividade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPaneVendedor.setViewportView(tblVendedor);

        javax.swing.GroupLayout Painel_VendedoresLayout = new javax.swing.GroupLayout(Painel_Vendedores);
        Painel_Vendedores.setLayout(Painel_VendedoresLayout);
        Painel_VendedoresLayout.setHorizontalGroup(
            Painel_VendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneVendedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
        );
        Painel_VendedoresLayout.setVerticalGroup(
            Painel_VendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_VendedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Painel_Geral.addTab("Vendedores", Painel_Vendedores);

        jPanelPeriodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Periodo"));

        lblDe.setText("De:");

        lblA.setText("á");

        txtDtInicio.setEnabled(false);

        txtDtFinal.setEnabled(false);

        javax.swing.GroupLayout jPanelPeriodoLayout = new javax.swing.GroupLayout(jPanelPeriodo);
        jPanelPeriodo.setLayout(jPanelPeriodoLayout);
        jPanelPeriodoLayout.setHorizontalGroup(
            jPanelPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPeriodoLayout.createSequentialGroup()
                .addComponent(lblDe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelPeriodoLayout.setVerticalGroup(
            jPanelPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPeriodoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDe)
                    .addComponent(lblA)
                    .addComponent(txtDtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelVendedores.setBorder(javax.swing.BorderFactory.createTitledBorder("Vendedores"));

        lblQtdeColaboradores.setText("Quantidade de colaboradores por função ativos");

        lblAtivos.setText("Vendedores Ativos");

        txtVendAtivos.setEnabled(false);

        txtVendInativos.setEnabled(false);
        txtVendInativos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVendInativosActionPerformed(evt);
            }
        });

        lblInativos.setText("Vendedores Inatiivos");

        lblQtdeVendedores.setText("Vendedores");

        lblQtdeSupervisor.setText("Supervisores");

        lblQtdeGerentes.setText("Gerentes");

        txtVendedores.setEnabled(false);

        txtSupervisores.setEnabled(false);

        txtGerentes.setEnabled(false);
        txtGerentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGerentesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVendedoresLayout = new javax.swing.GroupLayout(jPanelVendedores);
        jPanelVendedores.setLayout(jPanelVendedoresLayout);
        jPanelVendedoresLayout.setHorizontalGroup(
            jPanelVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVendedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVendedoresLayout.createSequentialGroup()
                        .addGroup(jPanelVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQtdeColaboradores)
                            .addComponent(lblQtdeVendedores))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                        .addGroup(jPanelVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVendAtivos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAtivos))
                        .addGap(11, 11, Short.MAX_VALUE)
                        .addGroup(jPanelVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblInativos)
                            .addComponent(txtVendInativos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanelVendedoresLayout.createSequentialGroup()
                        .addGroup(jPanelVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelVendedoresLayout.createSequentialGroup()
                                .addGroup(jPanelVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblQtdeSupervisor)
                                    .addComponent(lblQtdeGerentes))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSupervisores, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGerentes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelVendedoresLayout.setVerticalGroup(
            jPanelVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVendedoresLayout.createSequentialGroup()
                .addGroup(jPanelVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQtdeColaboradores)
                    .addComponent(lblAtivos)
                    .addComponent(lblInativos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVendAtivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVendInativos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQtdeVendedores)
                    .addComponent(txtVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQtdeSupervisor)
                    .addComponent(txtSupervisores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQtdeGerentes)
                    .addComponent(txtGerentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelVendas.setBorder(javax.swing.BorderFactory.createTitledBorder("Vendas"));

        lblTotalValorVendas.setText("Valor total das vendas");

        lblQtdeTotalVendas.setText("Quantidade total de vendas");

        txtQtdeTotalVendas.setEnabled(false);

        txtValorTotalVendas.setEnabled(false);

        javax.swing.GroupLayout jPanelVendasLayout = new javax.swing.GroupLayout(jPanelVendas);
        jPanelVendas.setLayout(jPanelVendasLayout);
        jPanelVendasLayout.setHorizontalGroup(
            jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVendasLayout.createSequentialGroup()
                .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQtdeTotalVendas)
                    .addComponent(txtQtdeTotalVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotalValorVendas)
                    .addComponent(txtValorTotalVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelVendasLayout.setVerticalGroup(
            jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalValorVendas)
                    .addComponent(lblQtdeTotalVendas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQtdeTotalVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorTotalVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Painel_ResumoGeralLayout = new javax.swing.GroupLayout(Painel_ResumoGeral);
        Painel_ResumoGeral.setLayout(Painel_ResumoGeralLayout);
        Painel_ResumoGeralLayout.setHorizontalGroup(
            Painel_ResumoGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_ResumoGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel_ResumoGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanelPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jPanelVendedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Painel_ResumoGeralLayout.setVerticalGroup(
            Painel_ResumoGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_ResumoGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel_ResumoGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelVendedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPeriodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        Painel_Geral.addTab("Resumo Geral", Painel_ResumoGeral);

        btnImprimir.setText("Imprimir");

        try {
            ftxtData_Inicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtData_Inicial.setText("01/01/2000");

        try {
            ftxtData_Final.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnVoltar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblData_Inicial)
                    .addComponent(ftxtData_Inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblData_Final)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ftxtData_Final, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addComponent(btnBuscar)
                        .addGap(34, 34, 34)
                        .addComponent(btnClienteEspecifico)
                        .addGap(71, 71, 71)))
                .addComponent(btnImprimir)
                .addGap(0, 186, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(Painel_Geral)
                    .addGap(21, 21, 21)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(339, 339, 339)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData_Final)
                    .addComponent(lblData_Inicial))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnClienteEspecifico)
                    .addComponent(btnBuscar)
                    .addComponent(btnImprimir)
                    .addComponent(ftxtData_Inicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftxtData_Final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Painel_Geral, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(85, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtVendInativosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVendInativosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVendInativosActionPerformed

    private void txtGerentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGerentesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGerentesActionPerformed

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
            java.util.logging.Logger.getLogger(GuiControle_Estratégico_por_Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiControle_Estratégico_por_Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiControle_Estratégico_por_Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiControle_Estratégico_por_Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiControle_Estratégico_por_Vendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Painel_Geral;
    private javax.swing.JPanel Painel_ResumoGeral;
    private javax.swing.JPanel Painel_Vendedores;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnClienteEspecifico;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JFormattedTextField ftxtData_Final;
    private javax.swing.JFormattedTextField ftxtData_Inicial;
    private javax.swing.JPanel jPanelPeriodo;
    private javax.swing.JPanel jPanelResumo1;
    private javax.swing.JPanel jPanelResumo2;
    private javax.swing.JPanel jPanelVendas;
    private javax.swing.JPanel jPanelVendedores;
    private javax.swing.JScrollPane jScrollPaneVendedor;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblAtivoInativo1;
    private javax.swing.JLabel lblAtivoInativo2;
    private javax.swing.JLabel lblAtivos;
    private javax.swing.JLabel lblData_Final;
    private javax.swing.JLabel lblData_Inicial;
    private javax.swing.JLabel lblDe;
    private javax.swing.JLabel lblInativos;
    private javax.swing.JLabel lblQtdeColaboradores;
    private javax.swing.JLabel lblQtdeColaboradores1;
    private javax.swing.JLabel lblQtdeColaboradores2;
    private javax.swing.JLabel lblQtdeGerentes;
    private javax.swing.JLabel lblQtdeSupervisor;
    private javax.swing.JLabel lblQtdeTotalVendas;
    private javax.swing.JLabel lblQtdeVendedores;
    private javax.swing.JLabel lblTotalValorPorPeriodo1;
    private javax.swing.JLabel lblTotalValorPorPeriodo2;
    private javax.swing.JLabel lblTotalValorVendas;
    private javax.swing.JLabel lblTotalVendasPeriodo1;
    private javax.swing.JLabel lblTotalVendasPeriodo2;
    private javax.swing.JTable tblVendedor;
    private javax.swing.JTextField txtDtFinal;
    private javax.swing.JTextField txtDtInicio;
    private javax.swing.JTextField txtGerentes;
    private javax.swing.JTextField txtQtdeTotalVendas;
    private javax.swing.JTextField txtSupervisores;
    private javax.swing.JTextField txtValorTotalVendas;
    private javax.swing.JTextField txtVendAtivos;
    private javax.swing.JTextField txtVendInativos;
    private javax.swing.JTextField txtVendedores;
    // End of variables declaration//GEN-END:variables
}
