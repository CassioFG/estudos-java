import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("Vamos começar!!!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.print("Digite se o usuário está ativo (true/false): ");
        boolean ativo = scanner.nextBoolean();

        System.out.print("Informe o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        double saldoRestante;


        if (ativo == true && saldo >= valorCompra) {
            System.out.println("Compra aprovada!");
            saldoRestante = saldo - valorCompra;
        } else if (ativo == true && saldo < valorCompra) {
            System.out.println("Compra recusada! Saldo insuficiente.");
            saldoRestante = saldo;
        } else {
            System.out.println("Compra recusada! Usuário não está ativo.");
            saldoRestante = saldo;
        }



        System.out.println("Informações do usuário:");

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Saldo: " + saldo);
        System.out.println("Ativo: " + ativo);
        System.out.println("Valor da compra: " + valorCompra);
        System.out.println("Saldo atual: " + saldoRestante);
    }
}