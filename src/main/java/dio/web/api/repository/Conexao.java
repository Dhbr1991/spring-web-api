package dio.web.api.repository;

/**
 *
 * @author Gelvazio Camargo
 * @since 23/08/2022 22:15
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexao {

    public static Connection getConexao() {

        String driver  = "org.postgresql.Driver";
        String url     = "jdbc:postgresql://motty.db.elephantsql.com/dfgxpned";
        String usuario = "dfgxpned";
        String senha   = "Qn0rrW9uSnJ4ZioM7CmZUKaZGXsH1hnj";

        String lista_dados = "";
        String lista_dados_json = "";

        Connection conn = null;
        Statement statement = null;
        ResultSet resultset = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, usuario, senha);
        } catch (ClassNotFoundException erro) {
            JOptionPane.showMessageDialog(null, "Erro de driver! \n" + erro.getMessage());
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de Conexao! \n" + erro.getMessage());
        }

        return conn;
    }

    public static void closeAll(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexao! \n " + erro.getMessage());
        }
    }
}
