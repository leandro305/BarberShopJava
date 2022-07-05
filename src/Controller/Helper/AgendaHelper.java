/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import View.Agenda;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author bigolho16
 */
public class AgendaHelper implements IHelper {
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    /*
     * Preencher a tabela com os dados do banco
    */
    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        // O modo de se pegar a tabela pelo modelo (conteúdo) que ela me trás!
        DefaultTableModel tableModel = (DefaultTableModel) this.view.getjTableAgendamentos().getModel();        
        // Esvaziar tabela antes de preencher (útil para no inicio ao carregar a janela e depois de ter atualizado o banco e desejo buscar os novos dados e mostrar na tabela!!)
        while(tableModel.getRowCount() > 0)
            tableModel.removeRow(0);
        
        // Atribuir valores do agendamentos na tabela
        for (Agendamento agendamento : agendamentos) {
            tableModel.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),
                agendamento.getObservacao(),
                "excluir"
            });
        }
        
    }

    public void preencherComboBoxClientes(ArrayList<Cliente> clientes) {
        // pegar combobox clientes
        DefaultComboBoxModel jComboBoxCliente =  (DefaultComboBoxModel) this.view.getjComboBoxCliente().getModel();
        
        // Atribuir clientes ao combobox
        for (Cliente cliente : clientes) {
            jComboBoxCliente.addElement(cliente);
        }
    }

    public void preencherComboBoxServicos(ArrayList<Servico> servicos) {
        // pegar combobox serviços
        DefaultComboBoxModel jComboBoxServico =  (DefaultComboBoxModel) this.view.getjComboBoxServico().getModel();
        
        // Atribuir serviços ao combobox
        for (Servico servico : servicos) {
            jComboBoxServico.addElement(servico);
        }
    }

    public Cliente obterCliente() {
        return (Cliente) this.view.getjComboBoxCliente().getSelectedItem();
    }
    
    public Servico obterServico() {
        return (Servico) this.view.getjComboBoxServico().getSelectedItem();
    }

    public void setarValor(float valor) {
        this.view.getjTextFieldValor().setText(String.valueOf(valor));
    }

    @Override
    public Agendamento obterModelo () {
        int id = Integer.parseInt(this.view.getjTextFieldId().getText());
        Cliente cliente = this.obterCliente();
        Servico servico = this.obterServico();
        float valor = Float.parseFloat(this.view.getjTextFieldValor().getText());
        String data = this.view.getjTextFieldData().getText();
        String hora = this.view.getjTextFieldHora().getText();
        String dataEHora = data + " " + hora;
        String observacao = this.view.getjTextAreaObservacao().getText();
        
        Agendamento agendamento = new Agendamento(id, cliente, servico, valor, dataEHora, observacao);
        
        return agendamento;
    }

    @Override
    public void limparTela() {
        this.view.getjTextFieldId().setText("0");
        this.view.getjTextAreaObservacao().setText("");
        this.view.getjTextFieldData().setText("");
        this.view.getjTextFieldHora().setText("");
    }
    
    public void exibeMsgSobreEnvioDoEmail (String msg) {
        //Pegar campo para exibição
//        JLabel msg1 = this.view.getMsg();
        //Exibir a mensagem
//        msg1.setText(msg);
        JOptionPane.showMessageDialog(null, msg);
    }
}
