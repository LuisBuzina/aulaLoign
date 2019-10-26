<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import= "model.Usuario"%>
<%@page import= "dao.UsuarioDao"%>

<%
Usuario usu = new Usuario();
UsuarioDao usd = new UsuarioDao();

String login = request.getParameter("login");
String senha = request.getParameter("senha");

usu.setLogin_usuario(login);
usu.setSenha_usuario(senha);
boolean status = usd.verificarUsuario(usu);
if(usd.result){
    out.print("Welcome: "+usd.nome);
}else{
    out.print("WASTED");
}
%>