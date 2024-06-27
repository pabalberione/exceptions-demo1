package ejercicio1;

public class OutOfBound {
    public static int getElementFromArray(int[] array, int index){
        try {
            return array[index];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Indice" + index + " está fuera de los limites del array");
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        //Prueba de indice válido
        System.out.println(getElementFromArray(numbers, 4));

        //Prueba de indice no válido
        System.out.println(getElementFromArray(numbers, 10));
    }


}
