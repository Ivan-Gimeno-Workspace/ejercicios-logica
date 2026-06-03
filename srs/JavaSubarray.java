import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaSubarray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n ; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();

        int contadorNegativos = 0;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int sumaActual = 0;

                for (int i = start; i <= end; i++) {
                    sumaActual += a[i];
                }

                if (sumaActual < 0) {
                    contadorNegativos++;
                }
            }
        }

        System.out.println(contadorNegativos);
    }
}