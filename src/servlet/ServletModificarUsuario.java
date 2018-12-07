package servlet;

import controller.controladorUsuario;
import include.Usuario;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletModificarUsuario", urlPatterns = {"/modificarusuario"})
public class ServletModificarUsuario extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String last_access = request.getParameter("last_access");

        int idusuario = 0;
        int tipoUsuario_idtipoUsuario = 0;

        try {

            idusuario = Integer.parseInt(request.getParameter("idusuario"));
            tipoUsuario_idtipoUsuario = Integer.parseInt(request.getParameter("tipoUsuario_idtipoUsuario"));
        }catch (NumberFormatException e) {

        }


        Usuario nuevoUsuario = new Usuario(idusuario, usuario, password, last_access, tipoUsuario_idtipoUsuario);
        controladorUsuario cc = new controladorUsuario();
        if(cc.actualizarUsuario(nuevoUsuario)) {
            response.sendRedirect("usuarios.jsp");
        } else {
            response.sendRedirect("modificarusuario.jsp?idusuario" + idusuario);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
