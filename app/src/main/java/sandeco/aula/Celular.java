package sandeco.aula;

/**
 * Created by sandeco on 16/05/16.
 */
public class Celular {

    private String numero;
    private String marca;
    private String modelo;
    private String operadora;
    private String versao_android;


    private Processador processador;


    public Celular(){
        processador = new Processador();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getVersao_android() {
        return versao_android;
    }

    public void setVersao_android(String versao_android) {
        this.versao_android = versao_android;
    }
}
