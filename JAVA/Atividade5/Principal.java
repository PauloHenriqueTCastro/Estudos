import Models.Carro;

public class Principal {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.Nome = "Chevrolet";
        carro1.Modelo = "ONIX";
        carro1.Ano = "2024";

        System.out.println("Nome: " + carro1.Nome + " Modelo: " + carro1.Modelo + " Ano: " + carro1.Ano);
    }
}
