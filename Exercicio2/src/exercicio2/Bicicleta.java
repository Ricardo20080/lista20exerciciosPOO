
package exercicio2;


public class Bicicleta extends Veiculo {
    private int numeroDeMarchas;

    public Bicicleta(String marca, String modelo, int ano, int numeroDeMarchas) {
        super(marca, modelo, ano);
        this.numeroDeMarchas = numeroDeMarchas;
    }

    public int getNumeroDeMarchas() {
        return numeroDeMarchas;
    }
    public void setNumeroDeMarchas(int numeroDeMarchas) {
        this.numeroDeMarchas = numeroDeMarchas;
    }

    @Override
    public void mover() {
        System.out.println(getMarca() + " " + getModelo() + " está pedalando pelo parque.");
    }
}
