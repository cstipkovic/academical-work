<%@page import="java.util.List"%>
<%@page import="mack.entities.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Lista de Usuarios</title>
    </head>
    <body>
        <h1>Usuarios!</h1>
        
        <%
            List<Usuario> usuarios = (List<Usuario>) request.getAttribute("usuarios");
        %>
        
        <% if (usuarios.size() > 0) { %>
        <table>
            <% for (Usuario u:usuarios) { %>
            <tr>
                <td><%=u.getNome()%></td>
                <td><%=u.getSobrenome()%></td>
            </tr>
            <% } %>
        </table>
        <% } %>
    </body>
</html>
