
package exercicio2;

public class Exercicio2 {

    public static void main(String[] args) {
        
           Veiculo v1 = new Carro("Toyota", "Corolla", 2020, 4);
        Veiculo v2 = new Moto("Honda", "CB500", 2019, true);
        Veiculo v3 = new Bicicleta("Caloi", "Elite", 2022, 21);
        Veiculo v4 = new Onibus("Volvo", "Fronter", 2018, 50);

        System.out.println("Veículo 1: " + v1.getMarca() + " " + v1.getModelo() + " (" + v1.getAno() + ")");
        v1.mover();

        System.out.println("Veículo 2: " + v2.getMarca() + " " + v2.getModelo() + " (" + v2.getAno() + ")");
        v2.mover();

        System.out.println("Veículo 3: " + v3.getMarca() + " " + v3.getModelo() + " (" + v3.getAno() + ")");
        v3.mover();

        System.out.println("Veículo 4: " + v4.getMarca() + " " + v4.getModelo() + " (" + v4.getAno() + ")");
        v4.mover();
        
    }
    
}
