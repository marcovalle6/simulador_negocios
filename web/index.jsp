
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
  <div class="col s12">
       <div class="card">
<div class="row center">


            <div class="card-action blue-grey white-text">
                 <h3>Crear Usuario</h3>
</div>
</div>
         <div class="card-content">
           <div class="form-field">
             <label for="username">Nombre Usuario</label>
             <input type="text" id="username">
              </div><br>

           <div class="form-field">
             <label for="Contrasena">Contrasena</label>
             <input type="password" id="Contrasena">
           </div><br>

           <div class="form-field">
             <label name="fecha">Fecha de creacion</label>
             <input name="fecha" type="date">
           </div><br>

           <div class="form-field">
             <label for="tipoUsuario">Tipo de Usuario</label>
             <input type="text" id="tipoUsuario">
           </div><br>

           <div class="form-field center-align">
             <button class="btn-large blue-grey">Crear</button>
             </div><br>

         </div>
       </div>
  </div>
</div>







  <jsp:include page='views/footer.jsp'></jsp:include>
