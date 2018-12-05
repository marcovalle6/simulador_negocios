<%@ page import="include.Usuario" %>
<%@ page import="controller.controladorUsuario" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    int idusuario = 0;
    String usuario = request.getParameter("usuario");
    String password = request.getParameter("password");
    String last_access = request.getParameter("last_access");


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
        response.sendRedirect("usuario.jsp");
    }
%>