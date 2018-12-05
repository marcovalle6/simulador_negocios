package servlet;

import controller.controladorUsuario;
import include.Usuario;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletCrearUsuario", urlPatterns = {"/CrearUsuario"})
public class ServletCrearUsuario extends HttpServlet {
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
        if(cc.agregarUsuario(nuevoUsuario)) {
            response.sendRedirect("usuarios.jsp");
        } else {
            response.sendRedirect("crearusuario.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
