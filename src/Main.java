public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудика - " + fullName);

        System.out.println("Задача №2");
//        fullName = fullName.toUpperCase();
//        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);

        System.out.println("Задача №3");
        fullName = fullName.replace("ё", "е");
        System.out.println(fullName);

        System.out.println("Задача №5");//Четвертую задачу не неашел
        int lastN = fullName.indexOf(" ");
        int middleN = fullName.lastIndexOf(" ");
        String lastName2 = fullName.substring(0, lastN);
        String firstName2 = fullName.substring(lastN, middleN);
        String middleName2 = fullName.substring(middleN, fullName.length());
        System.out.println("Фамилия сотрудника - " + lastName2 + "\n" + "Имя сотрудника -" + firstName2 + "\n" + "Отчество сотрудника -" + middleName2);
        //какой способ лучше не пойму
        String[] word = fullName.split(" ");
        System.out.println("Фамилия сотрудника - " + word[0]);
        System.out.println("Имя сотрудника - " + word[2]);
        System.out.println("Отчество сотрудника - " + word[1]);

        System.out.println("Задача №6");
        String fullName1 = "иванов иван иванович";
        int x = fullName1.indexOf(" " +1);
        int y = fullName1.lastIndexOf(" " + 1);
        char[] c = fullName1.toCharArray();
//        fullName1 = Character.toUpperCase(0);???




    }
}