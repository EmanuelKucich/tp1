package modelo;

public class MailtrapNotificador implements Notificador {

    public void enviar(String mensaje){
        System.out.println("Mail enviado: "+mensaje);
    }
}