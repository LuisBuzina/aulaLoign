package dao;

import java.sql.DriverManager;
import java.sql.Connection;

public class Conexao {

    public Connection getConexao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/unopar", "root", "");
        } catch (Exception erro) {
            throw new RuntimeException("Erro 1 - Conexão" + erro);
        }

    }
}
