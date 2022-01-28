/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ufes.pss.gestaodefuncionarios.view;

import java.text.ParseException;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author handaniels
 */
public class ManterFuncionarioView extends javax.swing.JInternalFrame {

    /**
     * Creates new form ManterFuncionarioView
     */
    MaskFormatter mfdata;

    public ManterFuncionarioView() {
        try {
            mfdata = new MaskFormatter("##/##/####");
        } catch (ParseException ex) {
            throw new RuntimeException("Erro ao converter data");
        }
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

        lblCargo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblBonus = new javax.swing.JLabel();
        lblFaltas = new javax.swing.JLabel();
        cbxCargo = new javax.swing.JComboBox<>();
        txtNome = new javax.swing.JTextField();
        txtFaltas = new javax.swing.JTextField();
        cbxBonus = new javax.swing.JComboBox<>();
        lblIdade = new javax.swing.JLabel();
        lblSalario = new javax.swing.JLabel();
        lblAdmissao = new javax.swing.JLabel();
        ckbFuncionarioDoMes = new javax.swing.JCheckBox();
        txtIdade = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        btnFechar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtAdmissao = new javax.swing.JFormattedTextField(mfdata);
        lblFormacao = new javax.swing.JLabel();
        cbxFormacao = new javax.swing.JComboBox<>();

        setTitle("Manter Funcionário");

        lblCargo.setText("Cargo");

        lblNome.setText("Nome");

        lblBonus.setText("Bônus");

        lblFaltas.setText("Faltas");

        cbxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Programador Sênior", "Programador Junior", "Gerente de Projeto",
            "Analista de sistemas", "Engenheiro de Dados", "Gerente de Segurança" }));

cbxBonus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Generoso" }));

lblIdade.setText("Idade");

lblSalario.setText("Salário  R$");

lblAdmissao.setText("Admissão");

ckbFuncionarioDoMes.setText("Funcionário do Mês");
ckbFuncionarioDoMes.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        ckbFuncionarioDoMesActionPerformed(evt);
    }
    });

    btnFechar.setText("Fechar");

    btnSalvar.setText("Salvar");

    btnEditar.setText("Editar");

    btnExcluir.setText("Excluir");

    txtAdmissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

    lblFormacao.setText("Formação");

    cbxFormacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Graduação", "Mestrado", "Doutorado"}));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(29, 29, 29)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(lblCargo)
                    .addGap(18, 18, 18)
                    .addComponent(cbxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnFechar)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBonus)
                                .addGap(18, 18, 18)
                                .addComponent(cbxBonus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addGap(18, 18, 18)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblFaltas)
                            .addGap(18, 18, 18)
                            .addComponent(txtFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblFormacao)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbxFormacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnExcluir)
                            .addGap(18, 18, 18)
                            .addComponent(btnEditar)
                            .addGap(18, 18, 18)
                            .addComponent(btnSalvar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblIdade)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblAdmissao)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblSalario)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ckbFuncionarioDoMes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(35, 35, 35))))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(28, 28, 28)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblCargo)
                .addComponent(cbxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(24, 24, 24)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblNome)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblIdade)
                .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(27, 27, 27)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblBonus)
                .addComponent(cbxBonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblSalario)
                .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(31, 31, 31)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblFaltas)
                .addComponent(txtFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblAdmissao)
                .addComponent(txtAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(ckbFuncionarioDoMes)
                .addComponent(lblFormacao)
                .addComponent(cbxFormacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnFechar)
                .addComponent(btnSalvar)
                .addComponent(btnEditar)
                .addComponent(btnExcluir))
            .addGap(24, 24, 24))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ckbFuncionarioDoMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbFuncionarioDoMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbFuncionarioDoMesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxBonus;
    private javax.swing.JComboBox<String> cbxCargo;
    private javax.swing.JComboBox<String> cbxFormacao;
    private javax.swing.JCheckBox ckbFuncionarioDoMes;
    private javax.swing.JLabel lblAdmissao;
    private javax.swing.JLabel lblBonus;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblFaltas;
    private javax.swing.JLabel lblFormacao;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JFormattedTextField txtAdmissao;
    private javax.swing.JTextField txtFaltas;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JButton getBtnEditar() {
        return btnEditar;
    }

    public void setBtnEditar(javax.swing.JButton btnEditar) {
        this.btnEditar = btnEditar;
    }

    public javax.swing.JButton getBtnExcluir() {
        return btnExcluir;
    }

    public void setBtnExcluir(javax.swing.JButton btnExcluir) {
        this.btnExcluir = btnExcluir;
    }

    public javax.swing.JButton getBtnFechar() {
        return btnFechar;
    }

    public void setBtnFechar(javax.swing.JButton btnFechar) {
        this.btnFechar = btnFechar;
    }

    public javax.swing.JButton getBtnSalvar() {
        return btnSalvar;
    }

    public void setBtnSalvar(javax.swing.JButton btnSalvar) {
        this.btnSalvar = btnSalvar;
    }

    public javax.swing.JComboBox<String> getCbxBonus() {
        return cbxBonus;
    }

    public void setCbxBonus(javax.swing.JComboBox<String> cbxBonus) {
        this.cbxBonus = cbxBonus;
    }

    public javax.swing.JComboBox<String> getCbxCargo() {
        return cbxCargo;
    }

    public void setCbxCargo(javax.swing.JComboBox<String> cbxCargo) {
        this.cbxCargo = cbxCargo;
    }

    public javax.swing.JCheckBox getCkbFuncionarioDoMes() {
        return ckbFuncionarioDoMes;
    }

    public void setCkbFuncionarioDoMes(javax.swing.JCheckBox ckbFuncionarioDoMes) {
        this.ckbFuncionarioDoMes = ckbFuncionarioDoMes;
    }

    public javax.swing.JLabel getLblAdmissao() {
        return lblAdmissao;
    }

    public void setLblAdmissao(javax.swing.JLabel lblAdmissao) {
        this.lblAdmissao = lblAdmissao;
    }

    public javax.swing.JLabel getLblBonus() {
        return lblBonus;
    }

    public void setLblBonus(javax.swing.JLabel lblBonus) {
        this.lblBonus = lblBonus;
    }

    public javax.swing.JLabel getLblCargo() {
        return lblCargo;
    }

    public void setLblCargo(javax.swing.JLabel lblCargo) {
        this.lblCargo = lblCargo;
    }

    public javax.swing.JLabel getLblFaltas() {
        return lblFaltas;
    }

    public void setLblFaltas(javax.swing.JLabel lblFaltas) {
        this.lblFaltas = lblFaltas;
    }

    public javax.swing.JLabel getLblIdade() {
        return lblIdade;
    }

    public void setLblIdade(javax.swing.JLabel lblIdade) {
        this.lblIdade = lblIdade;
    }

    public javax.swing.JLabel getLblNome() {
        return lblNome;
    }

    public void setLblNome(javax.swing.JLabel lblNome) {
        this.lblNome = lblNome;
    }

    public javax.swing.JLabel getLblSalario() {
        return lblSalario;
    }

    public void setLblSalario(javax.swing.JLabel lblSalario) {
        this.lblSalario = lblSalario;
    }

    public JFormattedTextField getTxtAdmissao() {
        return txtAdmissao;
    }

    public void setTxtAdmissao(JFormattedTextField txtAdmissao) {
        this.txtAdmissao = txtAdmissao;
    }

    public javax.swing.JTextField getTxtFaltas() {
        return txtFaltas;
    }

    public void setTxtFaltas(javax.swing.JTextField txtFaltas) {
        this.txtFaltas = txtFaltas;
    }

    public javax.swing.JTextField getTxtIdade() {
        return txtIdade;
    }

    public void setTxtIdade(javax.swing.JTextField txtIdade) {
        this.txtIdade = txtIdade;
    }

    public javax.swing.JTextField getTxtNome() {
        return txtNome;
    }

    public void setTxtNome(javax.swing.JTextField txtNome) {
        this.txtNome = txtNome;
    }

    public javax.swing.JTextField getTxtSalario() {
        return txtSalario;
    }

    public void setTxtSalario(javax.swing.JTextField txtSalario) {
        this.txtSalario = txtSalario;
    }

    public JComboBox<String> getCbxFormacao() {
        return cbxFormacao;
    }

    public void setCbxFormacao(JComboBox<String> cbxFormacao) {
        this.cbxFormacao = cbxFormacao;
    }

}
