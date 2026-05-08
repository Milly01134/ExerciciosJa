public class lojadesconto {
    public static void main (String[] args) {

     // var

    double valor = 550;
    
    if (valor < 100) {
      System.out.println ("Sem desconto");
    }
   else if (valor >= 100 && valor <= 299) {
     double desconto = valor * 10/100;
     double varfinal = valor - desconto;
     System.out.println ("Desconto de: " + desconto + ", Valor original: " + valor + ", Valor final: "+ varfinal);

   }
    else if (valor >= 300 && valor <= 499) {
     double desconto = valor * 20/100;
     double varfinal = valor - desconto;
     System.out.println ("Desconto de: " + desconto + ", Valor original: " + valor + ", Valor final: "+ varfinal);

   }
    else if (valor >= 500 ) {
     double desconto = valor * 30/100;
     double varfinal = valor - desconto;
    System.out.println ("Desconto de: " + desconto + ", Valor original: " + valor + ", Valor final: "+ varfinal);

   }

}

}

     
