public class ex2 {
    //instanciar a classe já definida em cima 
    public static void main (String [] args ) {

     //coloca o nome da variavel no () do switch 
      String conta ="salario," ;

      switch (conta) {
          case "corrente":
             System.out.println ("Limite de R$1000.00");
            break;
          case "poupanca":
             System.out.println ("Rendimento de 0.5% ao mês");
            break;
          case "salario": 
             System.out.println ("Sem limite de saque");
            break;
          default:
             System.out.println("Tipo de conta inválida");
             break;

      }

 }
}