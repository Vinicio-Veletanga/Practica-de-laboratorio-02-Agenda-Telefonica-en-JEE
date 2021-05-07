<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel="stylesheet" href="css/bootstrap.min.css">   		
        <script src="js/bootstrap.min.js"></script> 
<title>Login</title>
</head>
<body>
<form  action="Calculadora.jsp" method="post" role="form" data-toggle="validator">
  <label  for="fname"><h2  class="col-md-1 col-md-offset-2 text-center"class="text-center header" style="background-color:lavender;">Usuario:</h2></label>
  <input type="text" id="fname" class="btn btn-primary btn-lg" placeholder="Escriba su correo" name="email"><br><br>
  <label for="lname"><h2 style="background-color:lavender;">Contraseña:</h2></label>
  <input type="password" id="lname" class="btn btn-primary btn-lg" placeholder="Escriba su contraseña" name="pass"><br><br>
  
  <input type="submit" class="btn btn-primary" value="login"><br></br>
  <a href="/Practica-02-Agenda-Telefonica/crearcuenta.jsp">Crear Cuenta</a>
</form>
</body>
</html>