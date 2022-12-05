/**Даний клас Person з полями firstName, lastName, age.
 Вивести повне ім'я найстаршої людини, у якої довжина цього імені не перевищує 15 символів.
 */

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

}
