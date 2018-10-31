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

        buttonGroupVendedor = new javax.swing.ButtonGroup();
        Controle_Estratégico_Vendedor = new javax.swing.JPanel();
        jPanelPesquisa_Vendedor = new javax.swing.JPanel();
        rbtnNome_Vendedor = new javax.swing.JRadioButton();
        rbtnCodigo_Vendedor = new javax.swing.JRadioButton();
        cbxNome_Vendedor = new javax.swing.JComboBox<>();
        jPanelFiltros_Gerais = new javax.swing.JPanel();
        cbxFiltros_Gerais = new javax.swing.JComboBox<>();
        lblMaior_que = new javax.swing.JLabel();
        txtMaior_que = new javax.swing.JTextField();
        lblMenor_que = new javax.swing.JLabel();
        txtMenor_que = new javax.swing.JTextField();
        jPanelPeríodo_da_Pesquisa = new javax.swing.JPanel();
        lblData_Inicial = new javax.swing.JLabel();
        ftxtData_Inicial = new javax.swing.JFormattedTextField();
        lblData_Final = new javax.swing.JLabel();
        ftxtData_Final = new javax.swing.JFormattedTextField();
        btnBuscar = new javax.swing.JButton();
        jPanelVendedor = new javax.swing.JPanel();
        jScrollPaneVendedor = new javax.swing.JScrollPane();
        tblVendedor = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle Estratégico Vendedor");
        setResizable(false);

        jPanelPesquisa_Vendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa Vendedor"));

        buttonGroupVendedor.add(rbtnNome_Vendedor);
        rbtnNome_Vendedor.setText("Nome");

        buttonGroupVendedor.add(rbtnCodigo_Vendedor);
        rbtnCodigo_Vendedor.setText("Código");

        javax.swing.GroupLayout jPanelPesquisa_VendedorLayout = new javax.swing.GroupLayout(jPanelPesquisa_Vendedor);
        jPanelPesquisa_Vendedor.setLayout(jPanelPesquisa_VendedorLayout);
        jPanelPesquisa_VendedorLayout.setHorizontalGroup(
            jPanelPesquisa_VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisa_VendedorLayout.createSequentialGroup()
                .addGroup(jPanelPesquisa_VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPesquisa_VendedorLayout.createSequentialGroup()
                        .addComponent(rbtnNome_Vendedor)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnCodigo_Vendedor))
                    .addComponent(cbxNome_Vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 21, Short.MAX_VALUE))
        );
        jPanelPesquisa_VendedorLayout.setVerticalGroup(
            jPanelPesquisa_VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisa_VendedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisa_VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnNome_Vendedor)
                    .addComponent(rbtnCodigo_Vendedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxNome_Vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelFiltros_Gerais.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcões Filtros Gerais"));

        lblMaior_que.setText("Maior Que");

        lblMenor_que.setText("Menor Que");

        javax.swing.GroupLayout jPanelFiltros_GeraisLayout = new javax.swing.GroupLayout(jPanelFiltros_Gerais);
        jPanelFiltros_Gerais.setLayout(jPanelFiltros_GeraisLayout);
        jPanelFiltros_GeraisLayout.setHorizontalGroup(
            jPanelFiltros_GeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltros_GeraisLayout.createSequentialGroup()
                .addGroup(jPanelFiltros_GeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxFiltros_Gerais, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelFiltros_GeraisLayout.createSequentialGroup()
                        .addGroup(jPanelFiltros_GeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaior_que)
                            .addComponent(txtMaior_que, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanelFiltros_GeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMenor_que)
                            .addComponent(txtMenor_que))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelFiltros_GeraisLayout.setVerticalGroup(
            jPanelFiltros_GeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltros_GeraisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxFiltros_Gerais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFiltros_GeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaior_que)
                    .addComponent(lblMenor_que))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFiltros_GeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaior_que, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMenor_que, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelPeríodo_da_Pesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Período da Pesquisa"));

        lblData_Inicial.setText("Data Inicial");

        try {
            ftxtData_Inicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblData_Final.setText("Data Final");

        try {
            ftxtData_Final.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanelPeríodo_da_PesquisaLayout = new javax.swing.GroupLayout(jPanelPeríodo_da_Pesquisa);
        jPanelPeríodo_da_Pesquisa.setLayout(jPanelPeríodo_da_PesquisaLayout);
        jPanelPeríodo_da_PesquisaLayout.setHorizontalGroup(
            jPanelPeríodo_da_PesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPeríodo_da_PesquisaLayout.createSequentialGroup()
                .addGroup(jPanelPeríodo_da_PesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblData_Inicial)
                    .addComponent(ftxtData_Inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanelPeríodo_da_PesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblData_Final)
                    .addComponent(ftxtData_Final, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelPeríodo_da_PesquisaLayout.setVerticalGroup(
            jPanelPeríodo_da_PesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPeríodo_da_PesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPeríodo_da_PesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData_Inicial)
                    .addComponent(lblData_Final))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPeríodo_da_PesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftxtData_Inicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftxtData_Final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btnBuscar.setText("Buscar");

        tblVendedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Vendedor", "Cód. Venda", "Total", "Data", "Média das Vendas"
            }
        ));
        jScrollPaneVendedor.setViewportView(tblVendedor);

        javax.swing.GroupLayout jPanelVendedorLayout = new javax.swing.GroupLayout(jPanelVendedor);
        jPanelVendedor.setLayout(jPanelVendedorLayout);
        jPanelVendedorLayout.setHorizontalGroup(
            jPanelVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVendedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE))
        );
        jPanelVendedorLayout.setVerticalGroup(
            jPanelVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVendedorLayout.createSequentialGroup()
                .addComponent(jScrollPaneVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnVoltar.setText("Voltar");

        javax.swing.GroupLayout Controle_Estratégico_VendedorLayout = new javax.swing.GroupLayout(Controle_Estratégico_Vendedor);
        Controle_Estratégico_Vendedor.setLayout(Controle_Estratégico_VendedorLayout);
        Controle_Estratégico_VendedorLayout.setHorizontalGroup(
            Controle_Estratégico_VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Controle_Estratégico_VendedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Controle_Estratégico_VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Controle_Estratégico_VendedorLayout.createSequentialGroup()
                        .addGroup(Controle_Estratégico_VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanelFiltros_Gerais, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelPeríodo_da_Pesquisa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelPesquisa_Vendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addComponent(jPanelVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Controle_Estratégico_VendedorLayout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addGap(68, 68, 68)
                        .addComponent(btnBuscar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Controle_Estratégico_VendedorLayout.setVerticalGroup(
            Controle_Estratégico_VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Controle_Estratégico_VendedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Controle_Estratégico_VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Controle_Estratégico_VendedorLayout.createSequentialGroup()
                        .addComponent(jPanelPesquisa_Vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jPanelFiltros_Gerais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelPeríodo_da_Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Controle_Estratégico_VendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar)
                    .addComponent(btnVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Controle_Estratégico_Vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Controle_Estratégico_Vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JPanel Controle_Estratégico_Vendedor;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup buttonGroupVendedor;
    private javax.swing.JComboBox<String> cbxFiltros_Gerais;
    private javax.swing.JComboBox<String> cbxNome_Vendedor;
    private javax.swing.JFormattedTextField ftxtData_Final;
    private javax.swing.JFormattedTextField ftxtData_Inicial;
    private javax.swing.JPanel jPanelFiltros_Gerais;
    private javax.swing.JPanel jPanelPeríodo_da_Pesquisa;
    private javax.swing.JPanel jPanelPesquisa_Vendedor;
    private javax.swing.JPanel jPanelVendedor;
    private javax.swing.JScrollPane jScrollPaneVendedor;
    private javax.swing.JLabel lblData_Final;
    private javax.swing.JLabel lblData_Inicial;
    private javax.swing.JLabel lblMaior_que;
    private javax.swing.JLabel lblMenor_que;
    private javax.swing.JRadioButton rbtnCodigo_Vendedor;
    private javax.swing.JRadioButton rbtnNome_Vendedor;
    private javax.swing.JTable tblVendedor;
    private javax.swing.JTextField txtMaior_que;
    private javax.swing.JTextField txtMenor_que;
    // End of variables declaration//GEN-END:variables
}
