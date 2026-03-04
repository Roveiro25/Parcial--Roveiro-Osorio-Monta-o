import java.util.Scanner;

public class principal {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodo met = new Metodo();

        System.out.print("ingrese la dimension de la matriz: ");
        int n = sc.nextInt();

        Obj[][] productos = new Obj[n][n];

        productos = met.llenar(productos, sc);

        Obj[] vA = met.agruparVector(productos, 'A');
        Obj[] vB = met.agruparVector(productos, 'B');
        Obj[] vC = met.agruparVector(productos, 'C');

        Obj[][] estanteria = met.llenarEstanteria(vA, vB, vC);

        System.out.println("\n--------ESTANTERIA ORGANIZADA --------");
        met.mostrar(estanteria);
    }
}
