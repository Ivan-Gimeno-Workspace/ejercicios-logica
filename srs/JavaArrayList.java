import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaArrayList {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();

        List<List<Integer>> listaPrincipal = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int cantidadNumeros = sc.nextInt();
            List<Integer> fila = new ArrayList<>();

            for (int j = 0; j < cantidadNumeros; j++) {
                fila.add(sc.nextInt());
            }
            listaPrincipal.add(fila);
        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int filaJava = x - 1;
            int colJava = y - 1;

            if (filaJava >= 0 && filaJava < listaPrincipal.size() && colJava >= 0 && colJava < listaPrincipal.get(filaJava).size()) {

                System.out.println(listaPrincipal.get(filaJava).get(colJava));

            } else {

                System.out.println("ERROR!");
            }

        }

        sc.close();
    }
}
