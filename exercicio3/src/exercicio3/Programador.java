
package exercicio3;


public class Programador extends Funcionario {

    public Programador(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está programando.");
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.12;
    }
}
