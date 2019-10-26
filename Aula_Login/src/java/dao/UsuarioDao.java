package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Usuario;

public class UsuarioDao {

    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;

    public UsuarioDao() {
        conn = new Conexao().getConexao();
    }

    public boolean result = false;
    public String nome = "";

    public boolean verificarUsuario(Usuario usuario) {
        String sql = "SELECT nome_usuario FROM tb_usuario "
                + "WHERE login_usuario = ? AND senha_usuario = ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getLogin_usuario());
            stmt.setString(2, usuario.getSenha_usuario());
            rs = stmt.executeQuery();
            if (rs.next()) {//quando executou a querry quer diser que o rs tem valor
                result = true;
                nome = rs.getString("nome_usuario");
            }
            stmt.close();
        } catch (Exception erro) {
            throw new RuntimeException("Erro 2 - Verificar: " + erro);
        }
        return result;

    }

}
