
package exercicio2;

public class Moto extends Veiculo {
    private boolean temCarenagem;

    public Moto(String marca, String modelo, int ano, boolean temCarenagem) {
        super(marca, modelo, ano);
        this.temCarenagem = temCarenagem;
    }

    public boolean isTemCarenagem() {
        return temCarenagem;
    }
    public void setTemCarenagem(boolean temCarenagem) {
        this.temCarenagem = temCarenagem;
    }

    @Override
    public void mover() {
        System.out.println(getMarca() + " " + getModelo() + " está acelerando na rua.");
    }
}
