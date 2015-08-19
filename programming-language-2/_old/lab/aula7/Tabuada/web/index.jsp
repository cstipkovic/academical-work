<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tabuada</title>
    </head>
    <body>
        <form method="POST" action="/Tabuada/Resultado">
            <label>Informe o numero da tabuada:</label>
            <input type="text" name="tabuada_numero"/>
            <input type="submit" value="Calcular" />
        </form>
    </body>
</html>
