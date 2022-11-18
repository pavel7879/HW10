public class HW10 {
    public static void main(String[] args) {

        System.out.println("Строки, адание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String space = " ";
        String fullName = lastName + space + firstName + space + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        System.out.println("Строки, адание 2");
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);

        System.out.println("Строки, адание 3");
        System.out.println("Вариант 1");
        String fullNameRu = "Иванов Семён Семёнович";
                       if (fullNameRu.contains("ё")) {
                           fullNameRu = fullNameRu.replace("ё", "е");
                   }
        System.out.println("Данные ФИО сотрудника — " + fullNameRu);

        System.out.println("Вариант 2");
        String fullNameRu1 = "Иванов Семён Семёнович";
        String [] arrayFullNameRu1 = fullNameRu1.split("");
        System.out.print("Данные ФИО сотрудника — ");
        for (int i = 0; i < arrayFullNameRu1.length; i++ ) {
            if (arrayFullNameRu1 [i].contains("ё")) {
                arrayFullNameRu1 [i] = "е";
            }
            System.out.print( arrayFullNameRu1 [i]);
        }
        System.out.println("");
    }
}