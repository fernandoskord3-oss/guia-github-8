package com.uped.notificaciones.modelo;

public abstract class Notificacion {
    protected String destinatario;
    protected String mensaje;

    public Notificacion(String destinatario, String mensaje) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }

    public abstract void enviarMensaje();

    public final void registrarHistorial() {
        System.out.println("[HISTORIAL] Notificación enviada a: " + destinatario + " | Contenido: \"" + mensaje + "\"");
    }
}

