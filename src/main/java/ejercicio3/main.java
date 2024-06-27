package ejercicio3;

public class main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        //Prueba con division válida
        try{
            System.out.println(calculator.divide(4, 2));
        }catch (DivisionByZeroException e){
            System.out.println(e.getMessage());
        }

        //Prueba con division inválida
        try{
            System.out.println(calculator.divide(4, 0));
        }catch (DivisionByZeroException e){
            System.out.println(e.getMessage());
        }
    }
}
