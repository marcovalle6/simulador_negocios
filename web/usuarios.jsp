<jsp:include page='views/header.jsp'></jsp:include>
<%@ page import="include.Usuario" %>
<%@ page import="controller.controladorUsuario" %>
<%@ page import="java.util.ArrayList" %>

<div class="container">
    <div class="row">
        <div class="input-field col s12 center">
            <h3>Usuarios</h3>
        </div>
    </div>
    <div class="row">
        <div class="input-field col s12">
            <a class="btn" href="/usuario.jsp">Nuevo</a>
        </div>
    </div>
    <div class="row margin">
        <div class="col s12 center">
            <table class="striped">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>NOMBRE USUARIO</th>
                    <th>CONTRASENA</th>
                    <th>FECHA DE CREACION</th>
                    <th>TIPO DE USUARIO</th>
                    <th></th>
                </tr>
                </thead>
                <%
                    String htmlcode = "<tbody>";
                    controladorUsuario cc = new controladorUsuario();
                    int contador = 0;
                    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
                    usuarios = cc.obtenerUsuarios();
                    if(usuarios.size() > 0){
                        for(int a=0; a<usuarios.size();a++){
                            htmlcode += "<tr><td>" + usuarios.get(a).getIdusuario()
                                    + "</td><td>" + usuarios.get(a).getUsuario()
                                    + "</td><td>" + usuarios.get(a).getPassword()
                                    + "</td><td>" + usuarios.get(a).getLast_access()
                                    + "</td><td>" + usuarios.get(a).getTipoUsuario_idtipoUsuario()


                                    + "<td><a class=\"btn blue\" href=\"modificarusuario.jsp?idusuario="+usuarios.get(a).getIdusuario()+"\"><i class=\"material-icons\">create</i></a>"
                                   + "<a class=\"btn red\" onclick=\"delete_usuario("+usuarios.get(a).getIdusuario()+")\"><i class=\"material-icons\">delete</i></a>"
                                    + "</td></tr>";
                        }
                    } else{
                        htmlcode += "<tr><td colspan=\"10\">No existen usuarios</td></tr>";
                    }
                    htmlcode += "</tbody>";
                    out.print(htmlcode);
                %>
            </table>
        </div>
    </div>
</div>


<jsp:include page='views/footer.jsp'></jsp:include>
