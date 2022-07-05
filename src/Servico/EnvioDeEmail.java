/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servico;

import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author bigolho16
 */
public class EnvioDeEmail {
    static final String REMETENTE_NOME = "gabrielbigolho900@gmail.com";
    static final String REMETENTE_SENHA = "36236722a";
    
    private String assunto;
    private String mensagem;
    private String destinatario;
    private String seEnviou;

    public EnvioDeEmail(String assunto, String mensagem, String destinatario) {
        this.assunto = assunto;
        this.mensagem = mensagem;
        this.destinatario = destinatario;
    }
    
    public void enviar () {
        Properties props = new Properties();
        /** Parâmetros de conexão com servidor Gmail */
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
        "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
          new javax.mail.Authenticator() {
               protected PasswordAuthentication getPasswordAuthentication()
               {
                     return new PasswordAuthentication(REMETENTE_NOME,
                     REMETENTE_SENHA);
               }
          });

        /** Ativa Debug para sessão */
        session.setDebug(true);

        try {
            
          // dando erro aqui
          Message message = new MimeMessage(session);
          message.setFrom(new InternetAddress(REMETENTE_NOME));
          //Remetente

          Address[] toUser = InternetAddress //Destinatário(s) (pode-se passar a vírgula e adicionar mais DESTINATARIOS)
                     .parse(this.destinatario);

          message.setRecipients(Message.RecipientType.TO, toUser);
          message.setSubject(this.assunto); //Assunto
          message.setText(this.mensagem); //Mensagem
          /**Método para enviar a mensagem criada*/
          Transport.send(message);

          this.setSeEnviou ("1", null);

         } catch (Exception e) {
//            throw new RuntimeException(e);
            
            this.setSeEnviou("0" , e);
        }
    }
    
    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    
    public String getSeEnviou () {
        return this.seEnviou;
    }
    public void setSeEnviou (String cond, Exception e) {
        if  (cond == "1") {
            this.seEnviou = "Email Enviado Com Sucesso!";
        }else if (cond == "0") {
            this.seEnviou = "Error: " + e.getMessage();
        }
    }
}
