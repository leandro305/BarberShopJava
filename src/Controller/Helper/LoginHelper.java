/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Usuario;
import View.Login;

/**
 *
 * @author bigolho16
 */
public class LoginHelper implements IHelper {
    /*
     * Chamada da view aqui na classe helper! (que obrigatóriamente precisa do construtor com o parâmetro da view)
     */
    private final Login view;
    public LoginHelper (Login view) {
        this.view = view;
    }
    
    /*
     * Vai receber os dados do formulário e retornar esse usuário
     */
    public Usuario obterModelo () {
        String nome = this.view.getTextUsuario().getText();
        String senha = this.view.getTextSenha().getText();
        Usuario modelo = new Usuario(0, nome, senha);
        return modelo;
    }
    /*
     * Vai escrever no input da tela de login o usuario e senha, no retorno caso eu não tenha usuário ou senha encontrados no banco
     */
    public void setarModelo (Usuario modelo) {
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
    
        this.view.getTextUsuario().setText(nome);
        this.view.getTextSenha().setText(senha);
    }
    /*
     * Vai limpar o campo, diferente da setarModelo() que vai atribuir os mesmos valores digitados anteriormente...
     */
    public void limparCampo () {
        this.view.getTextUsuario().setText("");
        this.view.getTextSenha().setText("");
    }

    @Override
    public void limparTela() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
