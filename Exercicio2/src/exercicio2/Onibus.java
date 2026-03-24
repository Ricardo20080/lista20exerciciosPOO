
package exercicio2;

public class Onibus extends Veiculo {
    private int capacidadePassageiros;

    public Onibus(String marca, String modelo, int ano, int capacidadePassageiros) {
        super(marca, modelo, ano);
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }
    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    @Override
    public void mover() {
        System.out.println(getMarca() + " " + getModelo() + " está transportando passageiros pela cidade.");
    }
}
