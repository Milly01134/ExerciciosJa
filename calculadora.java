public class calculadora {
    public static void main (String [] args ) {

        double num1 = 15.10;
        double num2 = 10.50;
        String operacao = "/ ";

         switch (operacao) {
            case "+": 
               double resultado = num1 + num2;
               System.out.println ("Resultado " + resultado);
                break;
            case "-": 
               double resultado1 = num1 - num2;
               System.out.println ("Resultado " + resultado1);
                break;
            case "*": 
               double resultado2 = num1 * num2;
               System.out.println ("Resultado " + resultado2);
                break;
            
            case "/": 
               double resultado3 = num1 / num2;
               System.out.println ("Resultado " + resultado3);
               break;

            default:
                System.out.println ("Operação inválida");
                break;
         }
         


    }
}