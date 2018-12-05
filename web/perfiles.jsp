<jsp:include page='views/header.jsp'></jsp:include>
<%@ page import="include.Perfil" %>
<%@ page import="controller.controladorPerfilUsuario" %>
<%@ page import="java.util.ArrayList" %>

<div class="container">
    <div class="row">
        <div class="input-field col s12 center">
            <h3>Perfiles</h3>
        </div>
    </div>
    <div class="row">
        <div class="input-field col s12">
            <a class="btn" href="/perfil.jsp">Nuevo</a>
        </div>
    </div>
    <div class="row margin">
        <div class="col s12 center">
            <table class="striped">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>NOMBRE</th>
                    <th>APELLIDO PATERNO</th>
                    <th>APELLIDO MATERNO</th>
                    <th>RFC</th>
                    <th>EMAIL</th>
                    <th>TELEFONO</th>
                    <th>DOMICILIO</th>
                    <th>COLONIA</th>
                    <th>CODIGO POSTAL</th>
                    <th>CIUDAD</th>
                    <th>ESTADO</th>
                    <th></th>
                </tr>
                </thead>
                <%
                    String htmlcode = "<tbody>";
                    controladorPerfilUsuario cc = new controladorPerfilUsuario();
                    int contador = 0;
                    ArrayList<Perfil> perfiles = new ArrayList<Perfil>();
                    perfiles = cc.obtenerPerfiles();
                    if(perfiles.size() > 0){
                        for(int a=0; a<perfiles.size();a++){
                            htmlcode += "<tr><td>" + perfiles.get(a).getIdperfil()
                                    + "</td><td>" + perfiles.get(a).getNombre_usuario()
                                    + "</td><td>" + perfiles.get(a).getApellido_p_usuario()
                                    + "</td><td>" + perfiles.get(a).getApellido_m_usuario()
                                    + "</td><td>" + perfiles.get(a).getRfc_usuario()
                                    + "</td><td>" + perfiles.get(a).getEmail_usuario()
                                    + "</td><td>" + perfiles.get(a).getTelefono_usuario()
                                    + "</td><td>" + perfiles.get(a).getDomicilio_usuario()
                                    + "</td><td>" + perfiles.get(a).getColonia_usuario()
                                    + "</td><td>" + perfiles.get(a).getCodigo_postal_usuario()
                                    + "</td><td>" + perfiles.get(a).getCiudad_usuario()
                                    + "</td><td>" + perfiles.get(a).getEstado_usuario()

                                    + "<td><a class=\"btn\" href=\"#\"><i class=\"material-icons\">zoom_in</i></a>"
                                    + "<a class=\"btn blue\" href=\"#\"><i class=\"material-icons\">create</i></a>"
                                    + "<a class=\"btn red\" href=\"#\"><i class=\"material-icons\">delete</i></a>"
                                    + "</td></tr>";
                        }
                    } else{
                        htmlcode += "<tr><td colspan=\"10\">No existen perfiles</td></tr>";
                    }
                    htmlcode += "</tbody>";
                    out.print(htmlcode);
                %>
            </table>
        </div>
    </div>
</div>


<jsp:include page='views/footer.jsp'></jsp:include>
