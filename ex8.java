import java.util.Scanner;
public class ex8 {
    public static void main (String [] args ) {

         
        //double media = (valor1 + valor2 ) / 2; //tudo oq tiver em parentese se resolve primeiro
        //swtich usa qnd você tem muitas opções 

     Scanner re = new Scanner (System.in);

     System.out.println ("Digite o codigo de barras do produto: ");
     int cod  = re.nextInt ();

     System.out.println ("Digite o nome do produto: ");
     String prod  = re.next();

     System.out.println ("Digite o preço do produto: ");
     double preco  = re.nextDouble ();
      
     System.out.println ("O produto cadastrado é o "+prod+ "O codigo de barras é "+cod+"O prço do produto é "+preco);
       
    }
}