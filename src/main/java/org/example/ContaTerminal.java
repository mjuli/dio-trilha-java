package org.example;

import java.util.Locale;
import java.util.Scanner;

/**
 * Hello world!
 */
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta: ");
        int conta = sc.nextInt();

        System.out.println("Agora digite o número da agência:");
        String agencia = sc.next();

        System.out.println("Digite o seu nome:");
        String nome = sc.next();
        nome += sc.nextLine();

        System.out.println("E por fim digite o saldo da sua conta:");
        double saldo = sc.nextDouble();

        System.out.println(String.format("Olá %s, " +
                "obrigado por criar uma conta em nosso banco, sua agência é %s, " +
                "conta %d e seu saldo %.2f já está disponível para saque", nome, agencia, conta, saldo));
    }
}
