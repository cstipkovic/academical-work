<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            for (int i = 1; i <=10; i++) {
                out.print("<h1>Tabuada do " + i + "</h1>");
                out.print("<ul>");
                for (int j = 1; j <= 10; j++) {
                    out.print("<li>" + i + " x " + j + " = " + (i * j) + "</li>");
                }
                out.print("</ul>");
            }
        %>
    </body>
</html>
