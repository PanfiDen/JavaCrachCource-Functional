/**Даний клас Person з полями firstName, lastName, age.
 Вивести повне ім'я найстаршої людини, у якої довжина цього імені не перевищує 15 символів.
 */

public class Task5 {
    public static void main(String[] args) {

        Person alex = new Person("Alex","Corn", 34);
        Person ihor = new Person("Ihor","Hrishko", 12);
        Person helen = new Person("Helen","Mercury", 65);
        Person denys = new Person("Denys","Panfilovskyi", 48);
        Person kateryna = new Person("Kateryna","Huntdogina", 97);
        Person volodymyr = new Person("Volodymyr","Stus", 20);

        Person [] humans = new Person[]{alex,ihor, helen, denys, kateryna, volodymyr};

        System.out.println(oldestPerson(humans));
    }

    private static String oldestPerson (Person [] humans){
        Person oldest = humans[0];
        for (int i = 0; i < humans.length-1; i++){
            int lengthName1 = (oldest.getFirstName().concat(oldest.getLastName())).length();
            int lengthName2 = (humans[i+1].getFirstName().concat(humans[i+1].getLastName())).length();
            if (oldest.getAge() < humans[i+1].getAge() && lengthName1 <= 15 && lengthName2 <= 15){
                oldest = humans[i+1];
            }
        }

        return oldest.getFirstName() + " " + oldest.getLastName();
    }
}
