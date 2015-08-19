<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>System.out.println(new java.util.Date());</h1>
        <h1><% out.println(new java.util.Date()); %></h1>
        <h1><% out.println(2.0 - 1.1); %></h1>
        <h1><% out.println(2.0 - 1.2); %></h1>
        <h1><% out.println((2.0 - 1.3 + "</h1>"));
               out.println("<h1>" + (2.0 - 1.4));
        %></h1>
        
        <%
               java.math.BigDecimal saldo;
               saldo = new java.math.BigDecimal("2.0");
        %>
        
        <h1><% out.println(saldo.subtract(new java.math.BigDecimal("1.1"))); %></h1>
    </body>
</html>
