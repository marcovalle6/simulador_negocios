<%@ page import="include.Usuario" %>
<%@ page import="controller.controladorUsuario" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String usuario = request.getParameter("nombre");
    String password = request.getParameter("contrasena");
    String last_access = request.getParameter("fecha");

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
        response.sendRedirect("index.jsp");
    } else {
        response.sendRedirect("usuario.jsp");
    }
%>