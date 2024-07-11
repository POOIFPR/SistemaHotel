import java.util.Date;

public class Reserva {
    Date dataCheckIn;
    Date dataCheckOut;
    String tipoQuarto;
    String numeroQuarto;
    String andar;
    String preferenciasCliente;
    Status status;
    public Reserva() {
    }
    public Reserva(Date dataCheckIn, Date dataCheckOut, String tipoQuarto, String numeroQuarto, String andar,
            String preferenciasCliente, Status status) {
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
        this.tipoQuarto = tipoQuarto;
        this.numeroQuarto = numeroQuarto;
        this.andar = andar;
        this.preferenciasCliente = preferenciasCliente;
        this.status = status;
    }
}
