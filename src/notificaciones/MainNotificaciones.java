package com.uped.notificaciones;

import com.uped.notificaciones.modelo.Notificacion;
import com.uped.notificaciones.modelo.NotificacionCorreo;
import com.uped.notificaciones.modelo.NotificacionSMS;
import com.uped.notificaciones.modelo.NotificacionPush;

public class MainNotificaciones {
    public static void main(String[] args) {
        Notificacion n1 = new NotificacionCorreo("cliente@email.com", "Su factura está lista.", "Facturación Mensual");
        Notificacion n2 = new NotificacionSMS("7777-8888", "Su código de verificación es 4562.", "Tigo");
        Notificacion n3 = new NotificacionPush("Carlos Pérez", "Tiene una nueva solicitud de amistad.", "DEV-IOS-9932");

        n1.enviarMensaje();
        n1.registrarHistorial();
        System.out.println("--------------------------------------------------");

        n2.enviarMensaje();
        n2.registrarHistorial();
        System.out.println("--------------------------------------------------");

        n3.enviarMensaje();
        n3.registrarHistorial();
    }
}


