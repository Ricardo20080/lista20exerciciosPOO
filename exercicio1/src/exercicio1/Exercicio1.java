
package exercicio1;

public class Exercicio1 {

    public static void main(String[] args) {
        
        
 Animal a1 = new Cachorro("Rex", 3, 12.5, "Pastor Alemão");
        Animal a2 = new Gato("Mimi", 2, 4.0, "Branco");
        Animal a3 = new Vaca("Bela", 5, 350.0, "Fazenda Verde");
        Animal a4 = new Cavalo("Relâmpago", 4, 400.0, "Castanha");

    
        System.out.println("Nome: " + a1.getNome() + ", Idade: " + a1.getIdade() + ", Peso: " + a1.getPeso());
        a1.emitirSom();

        System.out.println("Nome: " + a2.getNome() + ", Idade: " + a2.getIdade() + ", Peso: " + a2.getPeso());
        a2.emitirSom();

        System.out.println("Nome: " + a3.getNome() + ", Idade: " + a3.getIdade() + ", Peso: " + a3.getPeso());
        a3.emitirSom();

        System.out.println("Nome: " + a4.getNome() + ", Idade: " + a4.getIdade() + ", Peso: " + a4.getPeso());
        a4.emitirSom();
        }
    }
    
