package sandeco.aula;

/**
 * Created by sandeco on 16/05/16.
 */
public class Processador {


    private int registradores;

    private Nucleo nucleo;


    public Processador() {
        this.nucleo = new Nucleo();

    }

    public Nucleo getNucleo() {
        return nucleo;
    }

    public void setNucleo(Nucleo nucleo) {
        this.nucleo = nucleo;
    }

    public int getRegistradores() {
        return registradores;
    }

    public void setRegistradores(int registradores) {
        this.registradores = registradores;
    }
}
