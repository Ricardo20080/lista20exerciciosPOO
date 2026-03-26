
package exercicio3;


public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está gerenciando a equipe.");
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.2;
    }
}
