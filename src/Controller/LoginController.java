/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;

/**
 *
 * @author bigolho16
 */
public class LoginController {
    
    /*
     * Não vai poder ser alterado, ja que é uma view! (Objetivamente falando)
    */
    private final Login view;
    private final LoginHelper helper;
    
    /*
     * Importando uma classe normal só que "Objetivamente" falando estou importando a view para poder usar aqui no Controller
     */
    public LoginController(Login view) {
        this.view = view;
        
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema () {
        /*
         * PEGAR UM USUÁRIO NA VIEW
         * Retornou um campo JLabel e deste campo só peguei o texto
         */
        Usuario usuario = this.helper.obterModelo();
        
        /*
         * PESQUISAR O USUÁRIO NO BANCO
         */
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        if (usuarioAutenticado != null) {
            // Navegar para o menu principal
            MenuPrincipal menu = new MenuPrincipal();
            
            this.view.dispose(); // fechar tela de login
            
            menu.setVisible(true); // abrir tela de usuario
        }else {
            view.exibeMensagem("Usuário ou senha inválidos!");
        }
    }
    
    
}
