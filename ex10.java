import java.util.Scanner;

public class ex10 {
    public static void main (String []args) {
  
     Scanner le = new Scanner (System.in);
  
     System.out.println ("Digite o nome do aluno: ");
     String name = le.nextLine ();
     
     System.out.println ("Digite a 1 nota: ");
     double nota= le.nextDouble ();

     System.out.println ("Digite a 2 nota: ");
     double nota1= le.nextDouble ();

     System.out.println ("Digite a 3 nota: ");
     double nota2= le.nextDouble ();
     
     if ( nota+nota1+nota2 / 3 > 7) {
        System.out.println ("Você está aprovado");
     } 
     else {
        System.out.println ("O aluno " +name+ " ficou com a media:  "+ ((nota+nota1+nota2)/ 3));
     }

    }
}