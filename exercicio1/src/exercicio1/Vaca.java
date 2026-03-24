
package exercicio1;

public class Vaca extends Animal {
    private String fazenda;

    public Vaca(String nome, int idade, double peso, String fazenda) {
        super(nome, idade, peso);
        this.fazenda = fazenda;
    }

    public String getFazenda() {
        return fazenda;
    }
    public void setFazenda(String fazenda) {
        this.fazenda = fazenda;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está mugindo: Muuuu!");
    }
}
