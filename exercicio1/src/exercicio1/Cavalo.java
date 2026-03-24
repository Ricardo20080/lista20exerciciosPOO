
package exercicio1;

public class Cavalo extends Animal {
    private String corCrina;

    public Cavalo(String nome, int idade, double peso, String corCrina) {
        super(nome, idade, peso);
        this.corCrina = corCrina;
    }

    public String getCorCrina() {
        return corCrina;
    }
    public void setCorCrina(String corCrina) {
        this.corCrina = corCrina;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está relinchando: Hiiiii!");
    }
}