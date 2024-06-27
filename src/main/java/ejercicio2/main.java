package ejercicio2;

public class main {
    public static void main(String[] args) {
        Person person = new Person();

        //Prueba con una edad válida
        try {
            person.setAge(25);
            System.out.println("Age set to: " + person.getAge());
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
