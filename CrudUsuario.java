import java.util.ArrayList;
import java.util.List;

public class CrudUsuario {

    private List<Usuario> usuarios = new ArrayList<>();

    // CREATE
    public void criarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário criado com sucesso!");
    }

    // READ
    public void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário foi cadastrado");
            return;
        }

        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }

    // UPDATE
    public void atualizarUsuario(int id, String novoNome, String novoEmail) {
        for (Usuario u : usuarios) {
            if (u.getId() == id) {
                u.setNome(novoNome);
                u.setEmail(novoEmail);
                System.out.println("Usuário atualizado!");
                return;
            }
        }
        System.out.println("Usuário não encontrado.");
    }


    // DELETE
    public void deletarUsuario(int id) {
        usuarios.removeIf(u -> u.getId() == id);
        System.out.println("Usuário removido (se existia).");
    }
}

