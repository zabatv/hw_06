public class Main {
    public static void main(String[] args) {
        String firstName = "Семён";
        String middleName = "Иванов";
        String lastName = "Семёнович";

        firstName = firstName.toUpperCase();
        middleName = middleName.toUpperCase();
        lastName = lastName.toUpperCase();


        firstName = firstName.replace("ё", "е");
        middleName = middleName.replace("ё", "е");
        lastName = lastName.replace("ё", "е");


        System.out.println("ФИО сотрудника — " + firstName + " " + middleName + " " + lastName);


    }
}