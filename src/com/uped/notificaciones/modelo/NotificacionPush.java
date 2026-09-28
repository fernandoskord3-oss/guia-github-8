package com.uped.notificaciones.modelo;

public class NotificacionPush extends Notificacion {
    private String idDispositivo;

    public NotificacionPush(String destinatario, String mensaje, String idDispositivo) {
        super(destinatario, mensaje);
        this.idDispositivo = idDispositivo;
    }

    @Override
    public void enviarMensaje() {
        System.out.println("Enviando notificación PUSH al dispositivo ID: " + idDispositivo);
        System.out.println("Usuario: " + destinatario + " | Alerta: " + mensaje);
    }
}
