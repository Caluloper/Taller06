package ec.edu.espol.Adapter;

public class NotificacionEmailAdapter implements Notificacion {
    private Email email = new Email();

    @Override
    public void enviar(String mensaje) {
        email.enviarCorreo(mensaje);
    }
}