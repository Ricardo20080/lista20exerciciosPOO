
package exercicio1;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, double peso, String raca) {
        super(nome, idade, peso);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está latindo: Au Au!");
    }
}
