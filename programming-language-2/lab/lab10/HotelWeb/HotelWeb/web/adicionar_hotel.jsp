<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Adicionar Hotel</title>
    </head>
    <body>
        <h1>Adicionar hotel</h1>
        <form action="/HotelWeb/AdicionarHotelServlet" method="POST">
            <label>Nome</label>
            <input type="text" name="nome" />
            
            <label>Logradouro</label>
            <input type="text" name="logradouro" />
            
            <label>Numero</label>
            <input type="text" name="numero"/>
            
            <button type="submit">Enviar</button>
        </form>
    </body>
</html>
