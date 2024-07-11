import java.time.Instant;
import java.util.Date;

public class Main {
    Admin admin = new Admin("Túlio",
     "03548510981",
      "(42) 3258-7861",
       "tulio@email.com",
        "admin1234");
    Funcionario funcionario = new Funcionario("Adalgamir",
     "60743099907",
      "(44) 2716-4767",
       "adalguinha@gmail.com",
        "func1234");
    Hospede hospede = new Hospede("Rogério",
    "06378286906",
      "(43) 2569-6717",
       "rogerio@email.com",
        "hospede345");
    InformacoesHotel informacoes = new InformacoesHotel();
    Passeio passeio = new Passeio("14h30",
     "Bosque Moringueira",
      "Trilha",
       "Passeio com duracao em torno de duas horas, com refeicao inclusa ao final do passeio\nO passeio mostrará alguns trechos da fauna e flora local.");
    Reserva reserva = new Reserva(Date.from(Instant.parse("2025-04-18")),
    Date.from(Instant.parse("2025-04-25")),
     "Suite Presidencial",
       "351",
        "7",
         "Quarto com janela que dá visão à piscina principal",
          Status.OCUPADO);
}
