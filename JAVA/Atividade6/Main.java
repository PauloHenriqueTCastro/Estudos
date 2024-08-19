import model.Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.nome = "André";
        funcionario1.idade = 21;
        funcionario1.salarios = new double[]{1200, 987.32, 2000};

        funcionario1.print();

    }
}
