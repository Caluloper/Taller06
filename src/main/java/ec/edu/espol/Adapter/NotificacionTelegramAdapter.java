package ec.edu.espol.Adapter;

public class NotificacionTelegramAdapter implements Notificacion {
    private Telegram telegram = new Telegram();

    @Override
    public void enviar(String mensaje) {
        telegram.enviarMensajeTelegram(mensaje);
    }
}

