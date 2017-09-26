%--
Document : index
Created on : 17/02/2017, 21:40:00
--%>
<%@page import="mack.entities.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type"
              content="text/html; charset=UTF-8">
        <title>Usuário por ID</title>
    </head>
    <body>
        <h1>Usuário</h1>
        <%
            Usuario u = (Usuario) request.getAttribute("usuario");
        %>
        <table>
            <tr>
                <td><%=u.getId()%></td>
                <td><%=u.getNome()%></td>
                <td><%=u.getSobrenome()%></td>
            </tr>
        </table>
    </body>
</html>