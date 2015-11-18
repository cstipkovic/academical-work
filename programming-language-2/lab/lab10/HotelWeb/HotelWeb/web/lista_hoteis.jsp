<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page import="hotelaria.modelo.Hotel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de hoteis</title>
    </head>
    <body>
        <h1>Lista de hoteis</h1>
        <table>
            <tr>
                <th>id</th>
                <th>Nome</th>
                <th>Logradouro</th>
                <th>Numero</th>
            </tr>
            <c:forEach var="h" items="${hoteis}">
            <tr>
                <td>${h.getId()}</td>
                <td>${h.getNome()}</td>
                <td>${h.getLogradouro()}</td>
                <td>${h.getNumero()}</td>
            </tr>
            </c:forEach>
        </table>
        
        <p><a href="/HotelWeb/">Voltar a pagina inicial</a></p>
    </body>
</html>
