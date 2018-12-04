<%@ page import="include.Perfil" %>
<%@ page import="controller.controladorPerfilUsuario" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    int idperfil = 0;
    String nombre_usuario = request.getParameter("nombreUsuario");
    String apellido_p_usuario = request.getParameter("apellidoPaterno");
    String apellido_m_usuario = request.getParameter("apellidoMaterno");
    String rfc_usuario = request.getParameter("rfcUsuario");
    String email_usuario = request.getParameter("emailUsuario");
    String telefono_usuario = request.getParameter("telefonoUsuario");
    String domicilio_usuario = request.getParameter("domicilioUsuario");
    String colonia_usuario = request.getParameter("coloniaUsuario");
    String codigo_postal_usuario = request.getParameter("codigoPostal");
    String ciudad_usuario = request.getParameter("ciudadUsuario");
    String estado_usuario = request.getParameter("estadoUsuario");

    try {

        idperfil = Integer.parseInt(request.getParameter("idperfil"));

    }catch (NumberFormatException e) {

    }

    Perfil nuevoPerfil = new Perfil(idperfil, nombre_usuario, apellido_p_usuario, apellido_m_usuario, rfc_usuario, email_usuario, telefono_usuario, domicilio_usuario, colonia_usuario, codigo_postal_usuario, ciudad_usuario, estado_usuario);
    controladorPerfilUsuario cc = new controladorPerfilUsuario();
    if(cc.agregarPerfilUsuario(nuevoPerfil)) {
        response.sendRedirect("/perfil.jsp");
    } else {
        response.sendRedirect("/usuario.jsp");
    }
%>
