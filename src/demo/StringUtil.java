package demo;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringUtil {

    // Retorna una cadena compuesta por n caracteres c
    // Ejemplo: replicate('x',5) ==> 'xxxxx'
    public static String replicate(char c, int n) {
        String str="";
        for(int i=0; i< n; i++){
            str +=String.valueOf(c);
        }
        return str;
    }

    // Retorna una cadena de longitud n, compuesta por s
    // y precedida de tantos caracteres c como sea necesario
    // para completar la longitud mencionada
    // Ejemplo lpad("5",3,'0') ==> "005"
    public static String lpad(String s, int n, char c) {
        String str=s;
        for(int i=0; i<n; i++){
            if(n>=str.length()) {
                str =String.valueOf(c)+str;
            }
        }
        return str;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static String[] toStringArray(int arr[]) {
        String [] array = new String[arr.length];
        for(int i=0; i<= arr.length -1; i++){
            array[i] = String.valueOf(arr[i]);
        }
        return array;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static int[] toIntArray(String arr[]) {
        int [] array = new int[arr.length];
        for(int i=0; i< arr.length; i++){
            array[i]=Integer.parseInt(arr[i]);
        }
        return array;
    }

    // Retorna la longitud del elemento con mayor cantidad
    // de caracteres del array arr
    public static int maxLength(String arr[]) {
        int cont=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].length()>cont){
                cont=arr[i].length()-1;
            }
        }
        return cont;
    }
    //Tamaño real del array
    public static <T> int getLength(T[] arr){
        int count = 0;
        for(T el : arr)
            if (el != null)
                ++count;
        return count;
    }
    public static String[] mergeToArray(String[] ...arrays) {
        Stream<String> stream = Stream.of();
        for (String[] s: arrays)
            stream = Stream.concat(stream, Arrays.stream(s));

        return stream.toArray(String[]::new);
    }

    // Completa los elemento del arr agregando caracteres c
    // a la izquierda, dejando a todos con la longitud del mayor
    public static void lNormalize(String arr[], char c) {
        //int [] array = toIntArray(arr);
        int maxLength = maxLength(arr);
        for(int i=0; i<= arr.length -1; i++){
            arr[i]=lpad(arr[i],maxLength,c);
            System.out.println(arr[i]);
        }
    }

}
