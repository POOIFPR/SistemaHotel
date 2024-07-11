import java.util.ArrayList;

public class Funcionario extends Usuario{
    NivelAcesso nivelAcesso = NivelAcesso.FUNCIONARIO;

    public Funcionario(String nome, String cpf, String telefone, String email, String senha) {
        super(nome, cpf, telefone, email, senha);
    }

    public Status checarOcupacao(Reserva reserva){
        return reserva.status;
    }

    public Hospede cadastrarHospede(String nome, String cpf, String telefone, String email, String senha) {
        return new Hospede(nome, cpf, telefone, email, senha);
    }

    public ArrayList<Hospede> consultarHospedes() {
        return new ArrayList<>();
    }
}
