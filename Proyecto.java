import java.util.Scanner;

/**
 *
 * @author fgavi
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double base;
        double altura;
        double radio;
        int figura;
        
        Scanner entrada = new Scanner (System.in);
        do{
            System.out.println("Escoge el numero de la Figura Gometrica: Cuadrado (1) - Rectandgulo (2) - circulo (3) - Triangulo(4)");
            figura = entrada.nextInt (); //Invocamos un método sobre un objeto Scanner
        }while(figura <= 0);
        
        switch(figura)
        {
            case 1:
                System.out.println("Ingresa la base o altura");
                base = entrada.nextDouble ();
                System.out.println("El area del cuadrado es: "+ cuadrado(base));
                break;
            case 2:
                System.out.println("Ingresa la base");
                base = entrada.nextDouble ();
                System.out.println("Ingresa la altura");
                altura = entrada.nextDouble ();
                System.out.println("El area del rectangulo es: "+ rectangulo(base, altura));
                break;
            case 3:
                System.out.println("Ingresa el radio");
                radio = entrada.nextDouble ();
                System.out.println("El area del circulo es: "+ circulo(radio));
                break;
            case 4:
                System.out.println("Ingresa la base");
                base = entrada.nextDouble ();
                System.out.println("Ingresa la altura");
                altura = entrada.nextDouble ();
                System.out.println("El area del triangulo es: "+ triangulo(base, altura));
                break;
            default:
                System.out.println("Debe digitar una opción correcta");
                break;
        }
        
    }
    
    public static double cuadrado(double base)
    {
        return base * base;
    }
    
    public static double rectangulo(double base, double altura)
    {
        return base * altura;
    }
    
    public static double circulo(double radio)
    {
        return 3.1416 * Math.pow(radio,2);
    }
    
    public static double triangulo(double base, double altura)
    {
        return (base * altura)/2;
    }
    
    
}