package org.diegovelu.apiservlet.webapp.listener.tarea7;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class Listener implements ServletRequestListener {

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        sre.getServletRequest().setAttribute("nombreCompleto", "Diego Luna");
    }
}
