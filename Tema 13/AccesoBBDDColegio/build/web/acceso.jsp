<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/css\
/materialize.min.css">
  <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>

<body>

  <div class="container">

    <div class="row"></div>

    <div class="row">

      <div class="row col m3"></div>

      <div class="col m6 card-panel grey lighten-5">

        <h5 class="center">Control de acceso</h5>

        <form method="POST" action="index.jsp">

          <div class="input-field">

            <i class="material-icons prefix">account_circle</i>

            <input type="text" name="usuario" id="usuario" required>
            <label for="usuario">Usuario</label>

          </div>

          <div class="input-field">

            <i class="material-icons prefix">lock</i>

            <input type="password" name="clave" id="clave" required>
            <label for="clave">Contraseña</label>

          </div>

          <p class="center">
            
            <button class="btn waves-effect waves-light center" type="submit" name="aceptar">
              Aceptar
              <i class="material-icons">check_circle</i>
            </button>
            
          </p>

          <br>

        </form>

      </div>

    </div>

  </div>

  <script type="text/javascript" src="Jquery/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/js/materialize.mi\
n.js"></script>

</body>

</html>