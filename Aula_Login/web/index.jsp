<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN USUARIO</title>
    </head>
    <body>
        <form action="verificar.jsp" method="post">
            <label>LOGIN</label><br>
            <input type="text" name="login"/><br>
            <label>SENHA</label><br>
            <input type="password" name="senha"/><br>
            <input type="submit" name="LOGAR"/>
        </form>
    </body>
</html>
