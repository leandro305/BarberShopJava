/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servico;

import Model.Agendamento;

/**
 *
 * @author bigolho16
 */
public class Correio {
    private EnvioDeEmail email;
    
    public String SeEnviou () {
        return this.email.getSeEnviou();
    }
    
    public void NotificarPorEmail (Agendamento agendamento) {
        String mensagem = formarEmail(agendamento);
        String destinatario = agendamento.getCliente().getEmail();
        
        this.email = new EnvioDeEmail("Agendamento da LojaDeBarbeariaFX", mensagem, destinatario);
        email.enviar();
        this.SeEnviou();
    }

    public String formarEmail(Agendamento agendamento) {
        String nomeCliente = agendamento.getCliente().getNome();
        String servico = agendamento.getServico().getDescricao();
        String dataAgendamento = agendamento.getDataFormatada();
        String horaAgendamento = agendamento.getHoraFormatada();
        float valor = agendamento.getValor();
        
        return "Olá " + nomeCliente + " vai dar um tapa no visu... seu agendamento para "+
                servico + " está marcado para o dia " + dataAgendamento+
                " às " + horaAgendamento + " o preço pra você sai baratinho, no valor de R$" + valor +" Forte Abraço!!";
    }
    
    
}
