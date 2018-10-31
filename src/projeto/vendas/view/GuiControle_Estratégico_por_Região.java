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
public class GuiControle_Estratégico_por_Região extends javax.swing.JFrame {

    /**
     * Creates new form GuiControle_Estratégico_por_Região
     */
    public GuiControle_Estratégico_por_Região() {
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

        Painel_Controle_Estratégico = new javax.swing.JPanel();
        Painel_Pesquisa_Região = new javax.swing.JPanel();
        cbxEstado = new javax.swing.JComboBox<>();
        lblEstado = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        cbxCidade = new javax.swing.JComboBox<>();
        Painel_Opções_de_Filtro = new javax.swing.JPanel();
        cbxFiltros_Gerais = new javax.swing.JComboBox<>();
        txtMaior_Que = new javax.swing.JTextField();
        lblMaior_Que = new javax.swing.JLabel();
        lblMenor_Que = new javax.swing.JLabel();
        txtMenor_Que = new javax.swing.JTextField();
        Painel_Período_Pesquisa = new javax.swing.JPanel();
        lblData_Inicial = new javax.swing.JLabel();
        lblData_Final = new javax.swing.JLabel();
        ftxtData_Inicial = new javax.swing.JFormattedTextField();
        ftxtData_Final = new javax.swing.JFormattedTextField();
        btnVoltar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        Painel_Mapa = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle Estratégico por Região");
        setResizable(false);

        Painel_Pesquisa_Região.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa Região"));

        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));
        cbxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEstadoActionPerformed(evt);
            }
        });

        lblEstado.setText("Estado");

        lblCidade.setText("Cidade");

        javax.swing.GroupLayout Painel_Pesquisa_RegiãoLayout = new javax.swing.GroupLayout(Painel_Pesquisa_Região);
        Painel_Pesquisa_Região.setLayout(Painel_Pesquisa_RegiãoLayout);
        Painel_Pesquisa_RegiãoLayout.setHorizontalGroup(
            Painel_Pesquisa_RegiãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_Pesquisa_RegiãoLayout.createSequentialGroup()
                .addGroup(Painel_Pesquisa_RegiãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEstado)
                    .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Painel_Pesquisa_RegiãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCidade)
                    .addComponent(cbxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        Painel_Pesquisa_RegiãoLayout.setVerticalGroup(
            Painel_Pesquisa_RegiãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_Pesquisa_RegiãoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Painel_Pesquisa_RegiãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(lblCidade))
                .addGap(7, 7, 7)
                .addGroup(Painel_Pesquisa_RegiãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Painel_Opções_de_Filtro.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções Filtros Gerais"));

        lblMaior_Que.setText("Maior Que");

        lblMenor_Que.setText("Menor Que");

        txtMenor_Que.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMenor_QueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Painel_Opções_de_FiltroLayout = new javax.swing.GroupLayout(Painel_Opções_de_Filtro);
        Painel_Opções_de_Filtro.setLayout(Painel_Opções_de_FiltroLayout);
        Painel_Opções_de_FiltroLayout.setHorizontalGroup(
            Painel_Opções_de_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_Opções_de_FiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel_Opções_de_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxFiltros_Gerais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_Opções_de_FiltroLayout.createSequentialGroup()
                        .addComponent(lblMaior_Que)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Painel_Opções_de_FiltroLayout.createSequentialGroup()
                        .addComponent(txtMaior_Que, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_Opções_de_FiltroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Painel_Opções_de_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMenor_Que)
                    .addComponent(txtMenor_Que, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        Painel_Opções_de_FiltroLayout.setVerticalGroup(
            Painel_Opções_de_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_Opções_de_FiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxFiltros_Gerais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Painel_Opções_de_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaior_Que)
                    .addComponent(lblMenor_Que, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(Painel_Opções_de_FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaior_Que, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMenor_Que, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        Painel_Período_Pesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Período da Pesquisa"));

        lblData_Inicial.setText("Data Inicial");

        lblData_Final.setText("Data Final");

        try {
            ftxtData_Inicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtData_Inicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtData_InicialActionPerformed(evt);
            }
        });

        try {
            ftxtData_Final.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtData_Final.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtData_FinalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Painel_Período_PesquisaLayout = new javax.swing.GroupLayout(Painel_Período_Pesquisa);
        Painel_Período_Pesquisa.setLayout(Painel_Período_PesquisaLayout);
        Painel_Período_PesquisaLayout.setHorizontalGroup(
            Painel_Período_PesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_Período_PesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel_Período_PesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_Período_PesquisaLayout.createSequentialGroup()
                        .addComponent(ftxtData_Inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(ftxtData_Final, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(Painel_Período_PesquisaLayout.createSequentialGroup()
                        .addComponent(lblData_Inicial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblData_Final)
                        .addGap(68, 68, 68))))
        );
        Painel_Período_PesquisaLayout.setVerticalGroup(
            Painel_Período_PesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_Período_PesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel_Período_PesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData_Inicial)
                    .addComponent(lblData_Final))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_Período_PesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftxtData_Inicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftxtData_Final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Painel_Controle_EstratégicoLayout = new javax.swing.GroupLayout(Painel_Controle_Estratégico);
        Painel_Controle_Estratégico.setLayout(Painel_Controle_EstratégicoLayout);
        Painel_Controle_EstratégicoLayout.setHorizontalGroup(
            Painel_Controle_EstratégicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_Controle_EstratégicoLayout.createSequentialGroup()
                .addGroup(Painel_Controle_EstratégicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_Controle_EstratégicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Painel_Pesquisa_Região, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Painel_Opções_de_Filtro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Painel_Período_Pesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Painel_Controle_EstratégicoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltar)
                        .addGap(47, 47, 47)
                        .addComponent(btnBuscar)))
                .addContainerGap(632, Short.MAX_VALUE))
        );
        Painel_Controle_EstratégicoLayout.setVerticalGroup(
            Painel_Controle_EstratégicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_Controle_EstratégicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Painel_Pesquisa_Região, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel_Opções_de_Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel_Período_Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Painel_Controle_EstratégicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnBuscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Painel_MapaLayout = new javax.swing.GroupLayout(Painel_Mapa);
        Painel_Mapa.setLayout(Painel_MapaLayout);
        Painel_MapaLayout.setHorizontalGroup(
            Painel_MapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Painel_MapaLayout.setVerticalGroup(
            Painel_MapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(Painel_Controle_Estratégico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel_Mapa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Painel_Controle_Estratégico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Painel_Mapa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEstadoActionPerformed

    private void txtMenor_QueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMenor_QueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMenor_QueActionPerformed

    private void ftxtData_InicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtData_InicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtData_InicialActionPerformed

    private void ftxtData_FinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtData_FinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtData_FinalActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(GuiControle_Estratégico_por_Região.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiControle_Estratégico_por_Região.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiControle_Estratégico_por_Região.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiControle_Estratégico_por_Região.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiControle_Estratégico_por_Região().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Painel_Controle_Estratégico;
    private javax.swing.JPanel Painel_Mapa;
    private javax.swing.JPanel Painel_Opções_de_Filtro;
    private javax.swing.JPanel Painel_Período_Pesquisa;
    private javax.swing.JPanel Painel_Pesquisa_Região;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbxCidade;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JComboBox<String> cbxFiltros_Gerais;
    private javax.swing.JFormattedTextField ftxtData_Final;
    private javax.swing.JFormattedTextField ftxtData_Inicial;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblData_Final;
    private javax.swing.JLabel lblData_Inicial;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblMaior_Que;
    private javax.swing.JLabel lblMenor_Que;
    private javax.swing.JTextField txtMaior_Que;
    private javax.swing.JTextField txtMenor_Que;
    // End of variables declaration//GEN-END:variables
}
