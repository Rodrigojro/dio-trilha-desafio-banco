import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);
    int numero;
    String agencia;
    String nome;
    double saldo;

    //Solicitar dados ao cliente
    
    System.out.println("Por favor, digite o numero de sua conta bancaria!");
    numero = sc.nextInt();

    System.out.println("Por favor, digite o numero de sua agencia bancaria!");
    agencia = sc.next();

    System.out.println("Por favor, digite o seu nome!");
    nome = sc.next();
    sc.nextLine();

    System.out.println("Por favor, digite o seu saldo bancario!");
    saldo = sc.nextDouble();

    //Resultado
    System.out.println();
    System.out.println("Olá: " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque");

    sc.close();
    
    }
}
