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

<div class="row login">
    <div class="col s12" action="crearusuario.jsp" method="post">
        <div class="card">
            <div class="row center">


                <div class="card-action blue-grey white-text">
                    <h3>Crear Usuario</h3>
                </div>
            </div>
            <div class="card-content">
                <div class="form-field">
                    <label for="usuario" name="nombre">Nombre Usuario</label>
                    <input type="text" id="usuario">
                </div><br>

                <div class="form-field">
                    <label for="password" name="contrasena">Contrasena</label>
                    <input type="password" id="password">
                </div><br>

                <div class="form-field">
                    <label name="last_access">Fecha de creacion</label>
                    <input name="last_access" type="date">
                </div><br>

                <div class="form-field">
                    <label for="tipoUsuario_idtipoUsuario" name="tipousuario">Tipo de Usuario</label>
                    <input type="text" id="tipoUsuario_idtipoUsuario">
                </div><br>

                <div class="form-field center-align">
                    <input type="submit" value="Insertar" onclick='return(verif(this.form)); MM_validateForm()' class="btn col s12">
                </div><br>

            </div>
        </div>
    </div>
</div>







<jsp:include page='views/footer.jsp'></jsp:include>
