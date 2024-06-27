package ejercicio2;

public class Person {
    private int age;

    public void setAge(int age) throws InvalidAgeException{
        if(age < 0 || age > 120){
            throw new InvalidAgeException("Invalid age: " + age);
        }
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}
