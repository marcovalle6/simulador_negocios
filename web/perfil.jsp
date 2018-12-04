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

<div class="row perfil">
    <div class="col s12" action="/PerfilUsuario" method="post">
        <div class="card">
            <div class="row center">


                <div class="card-action blue-grey white-text">
                    <h3>Perfil Usuario</h3>
                </div>
            </div>
            <div class="card-content">
                <div class="form-field">
                    <label for="nombre_usuario" name="nombreUsuario">Nombre Usuario</label>
                    <input type="text" id="nombre_usuario">
                </div><br>

                <div class="form-field">
                    <label for="apellido_p_usuario" name="apellidoPaterno">Apellido Paterno</label>
                    <input type="text" id="apellido_p_usuario">
                </div><br>

                <div class="form-field">
                    <label for="apellido_m_usuario" name="apellidoMaterno">Apellido Materno</label>
                    <input type="text" id="apellido_m_usuario">
                </div><br>


                <div class="form-field">
                    <label for="rfc_usuario" name="rfc">Rfc</label>
                    <input type="text" id="rfc_usuario">
                </div><br>

                <div class="form-field">
                    <label for="email_usuario" name="emailUsuario">Email</label>
                    <input type="text" id="email_usuario">
                </div><br>

                <div class="form-field">
                    <label for="telefono_usuario" name="telefonoUsuario">Telefono</label>
                    <input type="text" id="telefono_usuario">
                </div><br>

                <div class="form-field">
                    <label for="domicilio_usuario" name="domicilioUsuario">Domicilio</label>
                    <input type="text" id="domicilio_usuario">
                </div><br>

                <div class="form-field">
                    <label for="colonia_usuario" name="coloniaUsuario">Colonia</label>
                    <input type="text" id="colonia_usuario">
                </div><br>

                <div class="form-field">
                    <label for="codipo_postal_usuario" name="codigoPostal">Codigo Postal</label>
                    <input type="text" id="codipo_postal_usuario">
                </div><br>

                <div class="form-field">
                    <label for="ciudad_usuario" name="ciudadUsuario">Ciudad</label>
                    <input type="text" id="ciudad_usuario">
                </div><br>

                <div class="form-field">
                    <label for="estado_usuario" name="estadoUsuario">Estado</label>
                    <input type="text" id="estado_usuario">
                </div><br>


                <div class="form-field center-align">
                    <input type="submit" value="Insertar" onclick='return(verif(this.form)); MM_validateForm()' class="btn col s12">
                </div><br>

            </div>
        </div>
    </div>
</div>







<jsp:include page='views/footer.jsp'></jsp:include>
