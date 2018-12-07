<%@ page import="include.Perfil" %>
<%@ page import="controller.controladorPerfilUsuario" %>
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
    .perfil{
        margin-top: 100px;
    }
    .perfil .card{
        background: rgba(0, 0, 0, .6);
    }
    .perfil label{
        front-size: 16px;
        color: #ccc;
    }
    .perfil input{
        front-size: 20px;
        color: #fff;
    }
    .perfil button:hover{
        padding: 0px 40px;
    }

</style>


<!-- Login form -->
<%
    int idperfil = 0;
    try {

        idperfil = Integer.parseInt(request.getParameter("idperfil"));
    }catch (NumberFormatException e) {

    }
    controladorPerfilUsuario cc = new controladorPerfilUsuario();
    ArrayList<Perfil> perfil = new ArrayList<Perfil>();
    perfil = cc.obtenerPerfil(idperfil);



%>

<div class="row perfil">
    <form class="col s12" action="/modificarperfil" method="post">
        <div class="card">
            <div class="row center">


                <div class="card-action blue-grey white-text">
                    <h3>Perfil Usuario</h3>
                </div>
            </div>
            <div class="card-content">

                <div class="form-field">
                    <label for="idperfil" name="idperfil">Id perfil</label>
                    <input name="idperfil" type="number" id="idperfil" value="<% out.print(perfil.get(0).getIdperfil()); %>">
                </div><br>

                <div class="form-field">
                    <label for="nombre_usuario" name="nombre_usuario">Nombre Usuario</label>
                    <input name="nombre_usuario" type="text" id="nombre_usuario" value="<% out.print(perfil.get(0).getNombre_usuario()); %>">
                </div><br>

                <div class="form-field">
                    <label for="apellido_p_usuario" name="apellido_p_usuario">Apellido Paterno</label>
                    <input name="apellido_p_usuario" type="text" id="apellido_p_usuario" value="<% out.print(perfil.get(0).getApellido_p_usuario()); %>">
                </div><br>

                <div class="form-field">
                    <label for="apellido_m_usuario" name="apellido_m_usuario">Apellido Materno</label>
                    <input name="apellido_m_usuario" type="text" id="apellido_m_usuario" value="<% out.print(perfil.get(0).getApellido_m_usuario()); %>">
                </div><br>


                <div class="form-field">
                    <label for="rfc_usuario" name="rfc_usuario">Rfc</label>
                    <input name="rfc_usuario" type="text" id="rfc_usuario" value="<% out.print(perfil.get(0).getRfc_usuario()); %>">
                </div><br>

                <div class="form-field">
                    <label for="email_usuario" name="email_usuario">Email</label>
                    <input name="email_usuario" type="text" id="email_usuario" value="<% out.print(perfil.get(0).getEmail_usuario()); %>">
                </div><br>

                <div class="form-field">
                    <label for="telefono_usuario" name="telefono_usuario">Telefono</label>
                    <input name="telefono_usuario" type="text" id="telefono_usuario" value="<% out.print(perfil.get(0).getTelefono_usuario()); %>">
                </div><br>

                <div class="form-field">
                    <label for="domicilio_usuario" name="domicilio_usuario">Domicilio</label>
                    <input name="domicilio_usuario" type="text" id="domicilio_usuario" value="<% out.print(perfil.get(0).getDomicilio_usuario()); %>">
                </div><br>

                <div class="form-field">
                    <label for="colonia_usuario" name="colonia_usuario">Colonia</label>
                    <input name="colonia_usuario" type="text" id="colonia_usuario" value="<% out.print(perfil.get(0).getColonia_usuario()); %>">
                </div><br>

                <div class="form-field">
                    <label for="codipo_postal_usuario" name="codigo_postal_usuario">Codigo Postal</label>
                    <input name="codigo_postal_usuario" type="text" id="codipo_postal_usuario" value="<% out.print(perfil.get(0).getCodigo_postal_usuario()); %>">
                </div><br>

                <div class="form-field">
                    <label for="ciudad_usuario" name="ciudad_usuario">Ciudad</label>
                    <input name="ciudad_usuario" type="text" id="ciudad_usuario" value="<% out.print(perfil.get(0).getCiudad_usuario()); %>">
                </div><br>

                <div class="form-field">
                    <label for="estado_usuario" name="estado_usuario">Estado</label>
                    <input name="estado_usuario" type="text" id="estado_usuario" value="<% out.print(perfil.get(0).getEstado_usuario()); %>">
                </div><br>


                <div class="form-field center-align">
                    <input type="submit" value="Actualizar" onclick='return(verif(this.form)); MM_validateForm()' class="btn col s12">
                </div><br>

            </div>
        </div>
    </form>
</div>







<jsp:include page='views/footer.jsp'></jsp:include>