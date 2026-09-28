package com.uped.notificaciones.modelo;

public class NotificacionSMS extends Notificacion {
    private String operadorTelefonico;

    public NotificacionSMS(String destinatario, String mensaje, String operadorTelefonico) {
        super(destinatario, mensaje);
        this.operadorTelefonico = operadorTelefonico;
    }

    @Override
    public void enviarMensaje() {
        System.out.println("Enviando SMS vía " + operadorTelefonico + " al número " + destinatario);
        System.out.println("Texto: " + mensaje);
    }
}
