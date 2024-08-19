package model;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void print() {
        System.out.println("Seu nome é " + this.nome);
        System.out.println("Sua idade é " + this.idade);
        System.out.println("Salários recebidos: ");
        for (double salario: salarios){
            System.out.println(""+ salario);
        }
        media();
    }

    public void media(){
        double mediaSalario = 0;
        for (int i = 0; i < salarios.length; i++) {
            mediaSalario += salarios[i];
        }
        System.out.println("A media do seu salário é "+ mediaSalario/salarios.length);
    }
}
