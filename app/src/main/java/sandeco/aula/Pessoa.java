package sandeco.aula;

/**
 * Created by sandeco on 09/05/16.
 */
public class Pessoa {

    // propriedades
    private String nome;
    private int idade;
    private int peso;
    private double altura;


    //associações
    private Celular celular;



    //CONSTRUTOR
    public Pessoa() {
        celular = new Celular();
    }


    /****
     * GETTERS AND SETTERS
     * @return
     */


    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
