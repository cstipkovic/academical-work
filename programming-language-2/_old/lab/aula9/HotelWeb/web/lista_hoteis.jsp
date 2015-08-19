<%@page import="java.util.List"%>
<%@page import="hotelaria.modelo.Hotel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Hoteis</title>
    </head>
    <body>
        <h1>Lista hoteis</h1>
        
        <table>
            <tr>
                <th>Id</th>
                <th>Nome</th>
                <th>Logradouro</th>
                <th>Numero</th>
            </tr>
            
            <%
                List<Hotel> hoteis = (List<Hotel>) request.getAttribute("hoteis");
                if (hoteis != null) {
                    for (Hotel h : hoteis) {
            %>
            <tr>
                <td><%=h.getId()%></td>
                <td><%=h.getNome()%></td>
                <td><%=h.getLogradouro()%></td>
                <td><%=h.getNumero()%></td>
            </tr>
            <%
                    }
                }
            %>
        </table>
        <p><a href="/HotelWeb">Voltar a página inicial</a></p>
    </body>
</html>
