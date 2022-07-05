/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import Servico.Correio;
import java.util.ArrayList;
import View.Agenda;

/**
 *
 * @author bigolho16
 */
public class AgendaController {
    private final Agenda view;
    private final AgendaHelper helper;
    private final ClienteDAO clienteDAO;
    private final ServicoDAO servicoDAO;
    
    public AgendaController (Agenda view) {
        this.view = view;
        
        this.helper = new AgendaHelper(view);
        this.clienteDAO = new ClienteDAO();
        this.servicoDAO = new ServicoDAO();
    }
    
    public void atualizarTabela () {
        // Buscar lista com agendamentos do banco de dados
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        
        /*
         * O "<Agendamento>" é o tipo do array
         */
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        // Exibir esta lista na view, que no caso os helpers que vão se encarregar para o controller não ficar grande
        this.helper.preencherTabela(agendamentos);
    }
    
    public void atualizaCliente () {
        // Busca os clientes no banco
        ArrayList<Cliente> clientesDAO = this.clienteDAO.selectAll();
        
        // Exibir clientes no combobox
        this.helper.preencherComboBoxClientes(clientesDAO);
    }
    
    public void atualizaServiços () {
        // Busca os serviços no banco
        ArrayList<Servico> servicosDAO = this.servicoDAO.selectAll();
        
        // Exibir serviços no combobox
        this.helper.preencherComboBoxServicos(servicosDAO);
    }
    
    public void atualizaValor () {
        Servico servico = this.helper.obterServico();
        
        this.helper.setarValor(servico.getValor());
    }
    
    public void agendar () {
        // Buscar objeto agendamento da Tela
        Agendamento agendamento = this.helper.obterModelo();
        // Salvar o Objeto agendamento no banco de dados
        new AgendamentoDAO().insert(agendamento);
        // Salvar objeto no banco de dados
        this.atualizarTabela();
        // limpar a tela
        this.helper.limparTela();
        
        //Enviar Email
        Correio correio = new Correio();
        correio.NotificarPorEmail(agendamento);
        //Mostrar mensagem dizendo que enviou o EMAIL
        String msg = correio.SeEnviou();
        
        this.helper.exibeMsgSobreEnvioDoEmail(msg);
    }
}
