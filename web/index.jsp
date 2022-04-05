<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Conoce tu signo zodiacal!</h1>
        
        <form action = "sZodi" method="GET">
            Introduce tu fecha de nacimiento: <input type="date" name="fecha"> 
            <br><br>
            <input type = "submit" value = "Descubrelo!"/> 
        </form>
    </body>
</html>
