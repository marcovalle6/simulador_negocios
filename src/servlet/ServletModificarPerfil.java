package servlet;

import controller.controladorPerfilUsuario;
import include.Perfil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletModificarPerfil", urlPatterns = {"/modificarperfil"})
public class ServletModificarPerfil extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int idperfil = 0;
        String nombre_usuario = request.getParameter("nombre_usuario");
        String apellido_p_usuario = request.getParameter("apellido_p_usuario");
        String apellido_m_usuario = request.getParameter("apellido_m_usuario");
        String rfc_usuario = request.getParameter("rfc_usuario");
        String email_usuario = request.getParameter("email_usuario");
        String telefono_usuario = request.getParameter("telefono_usuario");
        String domicilio_usuario = request.getParameter("domicilio_usuario");
        String colonia_usuario = request.getParameter("colonia_usuario");
        String codigo_postal_usuario = request.getParameter("codigo_postal_usuario");
        String ciudad_usuario = request.getParameter("ciudad_usuario");
        String estado_usuario = request.getParameter("estado_usuario");



        try {

            idperfil = Integer.parseInt(request.getParameter("idperfil"));

        }catch (NumberFormatException e) {

        }

        Perfil nuevoPerfil = new Perfil(idperfil, nombre_usuario, apellido_p_usuario, apellido_m_usuario, rfc_usuario, email_usuario, telefono_usuario, domicilio_usuario, colonia_usuario, codigo_postal_usuario, ciudad_usuario, estado_usuario);
        controladorPerfilUsuario cc = new controladorPerfilUsuario();
        if(cc.actualizarPerfil(nuevoPerfil)) {
            response.sendRedirect("perfiles.jsp");
        } else {
            response.sendRedirect("modificarperfil.jsp?idperfil=" + idperfil);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
