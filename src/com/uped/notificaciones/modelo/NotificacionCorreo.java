package com.uped.notificaciones.modelo;

public class NotificacionCorreo extends Notificacion {
    private String asunto;

    public NotificacionCorreo(String destinatario, String mensaje, String asunto) {
        super(destinatario, mensaje);
        this.asunto = asunto;
    }

    @Override
    public void enviarMensaje() {
        System.out.println("Enviando CORREO electrónico a " + destinatario);
        System.out.println("Asunto: " + asunto);
        System.out.println("Cuerpo: " + mensaje);
    }
}

