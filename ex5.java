 public class ex5 {
    public static void main (String[] args) {

        double distan = 35; 
        double consumo = 5;
        double precombus = 40;
        double listrosnec= distan / consumo;
        double tot = listrosnec * precombus ;

        System.out.println ("A distância é de: " + distan + "Os litros necessarios são de: "+ listrosnec + "O custo total é de: " + tot );

    
}
 }