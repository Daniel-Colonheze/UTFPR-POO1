package exercicios;

public class Selec1 {
public static void main(String arg[]){
    int a = Integer.parseInt(arg[0]);
    int b = Integer.parseInt(arg[1]);
        if( a > b){
            System.out.println("O numero "+a+"e maior que "+ b);
        } else if(b > a){
            System.out.println("O numero "+b+" e maior que "+ a);
        } else {
            System.out.println("Os dois numeros sao iguais");
        }
    }
}
