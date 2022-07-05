/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servico;

//import org.apache.commons.mail.DefaultAuthenticator;
//import org.apache.commons.mail.EmailException;
//import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author Denner Dias
 */
public class EmailTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        
        EnvioDeEmail email = new EnvioDeEmail(
                "ASSUNTO do Aplicativo da Barbearia",
                "MENSAGEM do aplicativo da Barbearia!!!",
                "bigolho900@gmail.com");
        
        email.enviar();
        

    }
    
}
