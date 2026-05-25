import java.util.Scanner; //sempr tem que fazer isso para funcionar

public class Usando {
    public static void main (String []args) {
      
        Scanner le = new Scanner (System.in);

        System.out.println ("Digite um número de 1 a 10:  ");
        int num1 = le.nextInt();

        System.out.println ("Digite outro número de 1 a 10:  ");
        int num2 = le.nextInt();

        System.out.println ("Digite uma das quatro operações = /, *, +, - :  ");
        String operacao = le.next();


          switch (operacao) {
            case "+":
                int resultado = num1 + num2;
                System.out.println (" O resultado é:  "+ resultado);
                break;
            case "-": 
                int resultado2 = num1 - num2;
                System.out.println (" O resultado é:  "+ resultado2);
                break;
            case "*": 
                int resultado3 = num1 * num2;
                System.out.println (" O resultado é:  "+ resultado3);
                break;
            case "/": 
                int resultado4 = num1 / num2;
                System.out.println (" O resultado é:  "+ resultado4);
                break;
            default: 
                System.out.println ("Operação invalida");
                break;
        }
    }
}