<%@ page import="include.Usuario" %>
<%@ page import="controller.controladorUsuario" %>
<%@ page import="java.util.ArrayList" %>
<jsp:include page='views/header.jsp'></jsp:include>


<%
    int idusuario = 0;
    try {

        idusuario = Integer.parseInt(request.getParameter("idusuario"));
    }catch (NumberFormatException e) {

    }
    controladorUsuario cc = new controladorUsuario();
    ArrayList<Usuario> usuario = new ArrayList<Usuario>();
    usuario = cc.obtenerUsuario(idusuario);



%>

<!-- materialize css cdn link -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">

<!-- agregar css estilos -->

<style>
    body{
        background-image: url(images/prueba.jpg);
        background-size: cover;
        color: #fff;
    }
    .login{
        margin-top: 100px;
    }
    .login .card{
        background: rgba(0, 0, 0, .6);
    }
    .login label{
        front-size: 16px;
        color: #ccc;
    }
    .login input{
        front-size: 20px;
        color: #fff;
    }
    .login button:hover{
        padding: 0px 40px;
    }

</style>


<!-- Login form -->

<div class="row login">
    <form class="col s12" action="/modificarusuario" method="post">
        <div class="card">
            <div class="row center">


                <div class="card-action blue-grey white-text">
                    <h3>Modificar Usuario</h3>
                </div>
            </div>
            <div class="card-content">

                <div class="form-field">
                    <label for="idusuario">Id Usuario</label>
                    <input name="idusuario" type="number" id="idusuario" value="<% out.print(usuario.get(0).getIdusuario()); %>">
                </div><br>

                <div class="form-field">
                    <label for="usuario">Nombre Usuario</label>
                    <input name="usuario" type="text" id="usuario" value="<% out.print(usuario.get(0).getUsuario()); %>">
                </div><br>

                <div class="form-field">
                    <label for="password" name="contrasena">Contrasena</label>
                    <input name="password" type="password" id="password" value="<% out.print(usuario.get(0).getPassword()); %>">
                </div><br>

                <div class="form-field">
                    <label for="last_access">Fecha de creacion</label>
                    <input name="last_access" id="last_access" type="date" value="<% out.print(usuario.get(0).getLast_access()); %>">
                </div><br>

                <div class="form-field">
                    <label for="tipoUsuario_idtipoUsuario" name="tipousuario">Tipo de Usuario</label>
                    <input name="tipoUsuario_idtipoUsuario" type="text" id="tipoUsuario_idtipoUsuario" value="<% out.print(usuario.get(0).getTipoUsuario_idtipoUsuario()); %>">
                </div><br>


                <div class="form-field center-align">
                    <input type="submit" value="Actualizar" onclick='return(verif(this.form)); MM_validateForm()' class="btn col s12">
                </div><br>

            </div>
        </div>
    </form>
</div>







<jsp:include page='views/footer.jsp'></jsp:include>
