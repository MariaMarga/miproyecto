<%-- 
    Document   : index
    Created on : 15/01/2019, 12:52:54 PM
    Author     : PERSONAL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <link href="css/index.css" rel="stylesheet" type="text/css"/>
        <title>AUTOTECH</title>
       
    </head>
    <body id="pantalla">
        </br>
        </br>
        </br>
        <table id="tabla" border="3" style=" align-content: center">
            <tr>
                <td>
                    <img src="/mvcAutenticar1/images/AUTOTECH.jpg" >
                </td>
            </tr>
            <tr>
                <td>
                    <form method="post" action="Usuario">
                        <input type="hidden" name="accion" value="ACCESO">
                        <table border="0" align="center">
                            <tr>
                                <td>Usuario</td>
                                <td>
                                    <input type="text" name="usuario" maxlength="10">
                                </td>
                            </tr>
                            <tr>
                                <td>Contraseña</td>
                                <td>
                                    <input type="text" name="contrasenia" maxlength="10"
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2" style="text-align: center">
                                    <input type="submit" value="Ingresar">
                                </td>
                            </tr>

                        </table>

                    </form>
                </td>
            </tr>
        </table>
    </body>
</html>
