<%@ page import="controller.controladorPerfilUsuario" %>

<%
    int idperfil = 0;
    try {

        idperfil = Integer.parseInt(request.getParameter("idperfil"));
    }catch (NumberFormatException e) {

    }    controladorPerfilUsuario cc = new controladorPerfilUsuario();
    if(cc.eliminarPerfil(idperfil)){
        response.sendRedirect("perfiles.jsp");
    } else {
        response.sendRedirect("index.jsp");
    }
%>