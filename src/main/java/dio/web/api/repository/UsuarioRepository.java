package dio.web.api.repository;

import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    public void save(Usuario usuario) {
        if (usuario.getUsucodigo() == null) {
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        } else {
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        }

        System.out.println(usuario);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }

    public List<Usuario> findAll() {
        System.out.println("LIST - Listando os usários do sistema");

        List<Usuario> usuarios = new ArrayList<>();

//        usuarios.add(new Usuario("gleyson", "password"));
//        usuarios.add(new Usuario("frank", "masterpass"));
//        usuarios.add(new Usuario("frank23", "masterpass"));

        String dados = ConexaoTeste.conectaBanco();

        //List <Usuario> dadosRepositorio = repository.findAll();

        //System.out.println(dadosRepositorio);

        // retorna os usuarios para nao retornar em branco...
        // return "[" + dados + "]";

        return getTodos();
    }

    public List<Usuario> getTodos() {
        List<Usuario> listaDados = new ArrayList<>();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from usuario limit 10");
            while (rs.next()) {
                int usucodigo   = rs.getInt("usucodigo");
                String usunome  = rs.getString("usunome");
                String usuemail = rs.getString("usuemail");
                String ususenha = rs.getString("ususenha");
                String usutoken = rs.getString("usutoken");
                int usuativo    = rs.getInt("usuativo");

                listaDados.add(new Usuario(usucodigo, usunome, usuemail, ususenha, usutoken, usuativo));
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de sql. getTodos(): \n" + erro.getMessage());
        } finally {
            Conexao.closeAll(conn);
        }
        return listaDados;
    }


    public Usuario findById(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario(1, "gleyson", "password", "gleyson", "password", 1);
    }

    public Usuario findByUsername(String username) {
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar um usuario", username));

        return new Usuario(1, "gleyson", "password", "gleyson", "password", 1);
    }
}
