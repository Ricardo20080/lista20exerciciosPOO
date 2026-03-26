
package exercicio3;


public class exercicio3 {
    public static void main(String[] args) {

        // Criando objetos
        Gerente gerente = new Gerente("Carlos", 8000);
        Vendedor vendedor = new Vendedor("Ana", 3000);
        Programador programador = new Programador("Lucas", 5000);
        Designer designer = new Designer("Marina", 4000);

        // Chamando métodos
        System.out.println("=== Gerente ===");
        gerente.trabalhar();
        System.out.println("Bônus: " + gerente.calcularBonus());

        System.out.println("\n=== Vendedor ===");
        vendedor.trabalhar();
        System.out.println("Bônus: " + vendedor.calcularBonus());

        System.out.println("\n=== Programador ===");
        programador.trabalhar();
        System.out.println("Bônus: " + programador.calcularBonus());

        System.out.println("\n=== Designer ===");
        designer.trabalhar();
        System.out.println("Bônus: " + designer.calcularBonus());
    }
}
