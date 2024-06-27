package ejercicio1;

public class nullPointer {

    public static int getStringLength(String input){
        try {
            return input.length();
        }catch (NullPointerException e){
            System.out.println("Error: La cadena es null");
            return -1;
        }

    }

    public static void main(String[] args) {
        System.out.println(getStringLength("Manzana"));
        System.out.println(getStringLength(null));
    }
}
