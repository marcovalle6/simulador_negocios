<%@page import="controller.controladorUsuario" %>
<%
    int idusuario = 0;
    try {

        idusuario = Integer.parseInt(request.getParameter("idusuario"));
    }catch (NumberFormatException e) {

    }
    controladorUsuario cc = new controladorUsuario();
    if (cc.eliminarUsuario(idusuario)){
        response.sendRedirect("usuarios.jsp");
    }else {
        response.sendRedirect("index.jsp");
    }
%>