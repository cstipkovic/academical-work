<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>Login bem sucedido</title>
    </head>
    <body>
        <%
            // allow access only if session exists
            String user = (String) session.getAttribute("usuario");
            String userName = null;
            String sessionID = null;
            Cookie[] cookies = request.getCookies();

            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("usuario")) {
                        userName = cookie.getValue();
                    }

                    if (cookie.getName().equals("JSESSIONID")) {
                        sessionID = cookie.getValue();
                    }
                }
            }
        %>
        <h3>Hi <%=userName%>, Login successful. Your Session ID = <%=sessionID%></h3>
        <br>
        User = <%=user%>
        <br>
        <a href="checkout.jsp">Checkout Page</a>
        <form action="LogoutServlet" method="post">
            <input type="submit" value="Logout">
        </form>
    </body>
</html>