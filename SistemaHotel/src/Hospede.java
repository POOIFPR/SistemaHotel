public class Hospede extends Usuario{
    NivelAcesso nivelAcesso = NivelAcesso.HOSPEDE;

    public Hospede(String nome, String cpf, String telefone, String email, String senha) {
        super(nome, cpf, telefone, email, senha);
    }

    public Reserva efetuarReserva(){
        return new Reserva();
    }

    public void acessarInformacoesHotel(){
        InformacoesHotel informacoes = new InformacoesHotel();
        System.out.println(informacoes);
    }

    public Passeio reservarPasseio(){
        return new Passeio();
    }
}
