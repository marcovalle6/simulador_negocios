<%@ page import="controller.controladorUsuario" %>
<%@ page import="include.Usuario" %>
<%@ page import="include.tipodeusuario" %>
<%@ page import="java.util.ArrayList" %>

<jsp:include page='views/header.jsp'></jsp:include>




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
<%
    controladorUsuario cc = new controladorUsuario();
    ArrayList<tipodeusuario> tipodeusuario = new ArrayList<tipodeusuario>();
    tipodeusuario = cc.obtenerIdtipodeusuarioFK();


    String htmlselect = "";
    htmlselect += "<select name=\"tipoUsuario_idtipoUsuario\">\n" +
            "                <option value=\"\" selected disabled>Elige el tipo de usuario" +
            "</option>\n";
    for(int a=0; a<tipodeusuario.size();a++){
        htmlselect += "<option value=\""+tipodeusuario.get(a).getIdtipoUsuario()+"\">"+tipodeusuario.get(a).getNombre()+"</option>\n";
    }
    htmlselect += "            </select>";

%>

<div class="row login">
    <form class="col s12" action="crearusuario.jsp" method="post">
        <div class="card">
            <div class="row center">


                <div class="card-action blue-grey white-text">
                    <h3>Crear Usuario</h3>
                </div>
            </div>
            <div class="card-content">

                <div class="form-field">
                    <label for="idusuario">Id Usuario</label>
                    <input name="idusuario" type="number" id="idusuario">
                </div><br>

                <div class="form-field">
                    <label for="usuario">Nombre Usuario</label>
                    <input name="usuario" type="text" id="usuario">
                </div><br>

                <div class="form-field">
                    <label for="password" name="contrasena">Contrasena</label>
                    <input name="password" type="password" id="password">
                </div><br>

                <div class="form-field">
                    <label for="last_access">Fecha de creacion</label>
                    <input name="last_access" id="last_access" type="date">
                </div><br>

                <%
                    out.print(htmlselect);
                %>
                <div class="form-field center-align">
                    <input type="submit" value="Insertar" onclick='return(verif(this.form)); MM_validateForm()' class="btn col s12">
                </div><br>

            </div>
        </div>
    </form>
</div>







<jsp:include page='views/footer.jsp'></jsp:include>
