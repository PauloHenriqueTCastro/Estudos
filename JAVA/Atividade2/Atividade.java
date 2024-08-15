import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        System.out.println(methodVerifyWage(3000));
        System.out.println( methodVerifyWage(40000));
        System.out.println(methodVerifyWage(500000));
    }
    public static String methodVerifyWage(double wage){
        double newWage;
        double tax;
        if (wage <= 34712) {
            tax = 9.70 / 100;
            newWage = wage * tax;
            return "Voce precisa pagar " +(float) newWage + " de juros. Taxa de 9.7%";

        } else if (wage >= 34713 && wage <= 68507) {
            tax = 37.75 / 100;
            newWage = wage * tax;
           return "Voce precisa pagar " +(float) newWage + " de juros. Taxa de: 37.75%" ;
        } else {
            tax =49.50 / 100;
            newWage = wage * tax;
            return  "Voce precisa pagar " +(float) newWage + " de juros. Taxa de: 49.50%";
        }
    }
}
