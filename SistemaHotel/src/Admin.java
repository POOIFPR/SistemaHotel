import java.util.ArrayList;

public class Admin extends Usuario{
    NivelAcesso nivelAcesso = NivelAcesso.ADMIN;

    public Admin(String nome, String cpf, String telefone, String email, String senha) {
        super(nome, cpf, telefone, email, senha);
    }

    public String[][] consultarFinancas() {
        return new String[0][0];
    }

    public Funcionario cadastrarFuncionario(String nome, String cpf, String telefone, String email, String senha) {
        return new Funcionario(nome, cpf, telefone, email, senha);
    }

    public ArrayList<Funcionario> consultarFuncionarios() {
        return new ArrayList<>();
    }

    public String[][] gerarRelatorio() {
        return new String[0][0];
    }

    public Hospede cadastrarHospede(String nome, String cpf, String telefone, String email, String senha) {
        return new Hospede(nome, cpf, telefone, email, senha);
    }

    public ArrayList<Hospede> consultarHospedes() {
        return new ArrayList<>();
    }
}
