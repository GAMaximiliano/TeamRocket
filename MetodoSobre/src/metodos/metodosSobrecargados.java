
package metodos;

public class metodosSobrecargados {
   public static int sumar(int a, int b){
       System.out.println("sumar(int a, int b)");
       return a+b;
   } 
   public static double sumar(double a, double b){
       System.out.println("sumar(double a, double b)");
       return a+b;
   }
   
   public static int triangulo(int altura, int base){
       return (base*altura)/2;
   } 
   public static double triangulo(double altura, double base){
       return (base*altura)/2;
   }
   
   public static int cuadrado(int lado1, int lado2){
       return lado1*lado2;
   } 
   public static double cuadrado(double lado1, double lado2){
       return lado1*lado2;
   }
   
   public static int circulo(int radio){
       return (int) (Math.PI*(Math.pow(radio, 2)));
   } 
   public static double circulo(double radio){
       return Math.PI*(Math.pow(radio, 2));
   }
}
