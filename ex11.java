import java.util.Scanner;

public class ex11 {
 public static void main (String []args) {

    Scanner le = new Scanner (System.in);
    
    System.out.println ("Digite o código de barras:  ");
    int bar = le.nextInt();

    le.nextLine(); //limpeza do buffer para nao dar erro

    System.out.println ("Digite o nome do produto: ");
    String name = le.nextLine();

    System.out.println ("Digite o preço do produto: ");
    double preco = le.nextDouble ();
    
    System.out.println ("O produto é:  "+name+ " o preço é: "+preco+" o código de barras é: "+ bar);

    le.close();
 }
}
