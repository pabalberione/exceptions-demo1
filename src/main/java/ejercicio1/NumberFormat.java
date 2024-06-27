package ejercicio1;

/**
 * Escribir un método que convierta una cadena en un número entero y maneje la excepción NumberFormatException
 * si la cadena no se puede convertir.
 */
public class NumberFormat {
    //Metodo para convertir una cadena a un entero
    // Método para convertir una cadena a un entero
    public static int convertStringToInt(String input) {
        int result = 0;
        try {
            result = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + input + "' no es un número entero válido.");
        }
        return result;
    }

    public static void main(String[] args) {
        // Prueba con una cadena válida
        System.out.println(convertStringToInt("123")); // Debería imprimir 123

        // Prueba con una cadena no válida
        System.out.println(convertStringToInt("abc")); // Debería manejar la excepción y no lanzar error
    }

}
