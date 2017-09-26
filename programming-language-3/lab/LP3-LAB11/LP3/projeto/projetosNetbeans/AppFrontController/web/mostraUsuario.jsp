<%@page import="ejb.entities.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type"
              content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Usuario!</h1>
        <%
            Usuario u = (Usuario) request.getAttribute("usuario");
        %>
        <%if (u != null) {%>
        <table>
            <tr>
                <td><%=u.getId()%></td>
                <td><%=u.getNome()%></td>
                <td><%=u.getSobrenome()%></td>
                <td><%=u.getLogin()%></td>
                <td><%=u.getHash()%></td>
            </tr>
        </table>
        <%}%>
    </body>
</html>