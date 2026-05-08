public class IMC  {

    public static void main (String [] agrs)  {

        //var
      
      double altura = 1.60;
      double peso = 70;
      double total = peso / (altura * altura );

      if (total < 18.5) {

         System.out.println ("abaixo do peso");
      }

      else if (total >= 18.5 && total <= 24.9 ) {
            
        System.out.println ("Peso normal");
      }
      else if (total >=25 && total <= 29.9) {
          System.out.println ("Sobrepeso");
      }
      else if (total >= 30) {
          System.out.println ("Obesidade");
      }


    }
}