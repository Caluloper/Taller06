package ec.edu.espol.Adapter;

public class NotificacionWhatsAppAdapter implements Notificacion {
    private Whatsapp whatsapp = new Whatsapp();

    @Override
    public void enviar(String mensaje) {
        whatsapp.enviarWhatsApp(mensaje);
    }
}