import java.util.Scanner;

public class ex12 {
     public static void main (String []args){
     
        Scanner le = new Scanner (System.in);
        double saldo = 500;
        
        System.out.println ("Seu saldo é de: "+saldo+ "Opcão 1 para sacar dinheiro ou Opcão 2 para depositar dinheiro");
        int opcao = le.nextInt();

        if (opcao == 1 ) {
        System.out.println ("Digite o valor para saque: ");
        double valor = le.nextDouble();

        if (valor <= 500) {
        System.out.println ("Seu saldo atual: "+(saldo-valor));       
        } 
        else {
        System.out.println ("Valor insuficinete");
        }
         
        if (opcao == 2 ){
        System.out.println ("Digite o valor do depósito: ");
        double depo = le.nextDouble();

        System.out.println ("Seu saldo atual é de: "+(depo +saldo));

        }
        le.close();
     }
}
}
