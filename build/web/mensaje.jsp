<%-- 
    Document   : mensaje
    Created on : 24/01/2019, 09:59:18 PM
    Author     : PERSONAL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script languaje="javascript" type="text/javascript">
            window.history.go(1);
        </script>
        <style type="text/css">
            body{
                background-image:
                    url("/mvcAutenticar/images/back.jpg");

            }

            table{
                border:0;
                margin:auto;
                padding:0;
                backgroung_color:white;
                text-align:left;
            }
        </style>
    </head>
    <body>
        <table>
            <tr> 
                <td>
                    <img src="/mvcAutenticar1/images/AUTOTECH.jpg" >
                </td>
            </tr>

            <tr> 
                <td>
                    <h2 style="text-align: center">
                        <%=session.getAttribute("msg")%>

                    </h2>
                </td>

            </tr>

            <tr> 
                <td align="center">
                    <a href="#">Ver mensajes</a>
                </td>

            </tr>
            <tr>
                <td align="center">
                    <a href="index.jsp">Cerrar sesion</a>
                </td>
            </tr>

        </table>
       
    </body>
</html>
