
package exercicio3;


public class Vendedor extends Funcionario {

    public Vendedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está vendendo produtos.");
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.15;
    }
}
