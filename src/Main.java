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
        String lastName2 = fullName.substring(0, fullName.indexOf(" "));
        String firstName2 = fullName.substring(fullName.indexOf(" "), fullName.lastIndexOf(" "));
        String middleName2 = fullName.substring(fullName.lastIndexOf(" "), fullName.length());
        System.out.println("Фамилия сотрудника - " + lastName2 + "\n" + "Имя сотрудника -" + firstName2 + "\n" + "Отчество сотрудника -" + middleName2);
        //какой способ лучше не пойму
        String[] word = fullName.split(" ");
        System.out.println("Фамилия сотрудника - " + word[0]);
        System.out.println("Имя сотрудника - " + word[1]);
        System.out.println("Отчество сотрудника - " + word[2]);

        System.out.println("Задача №6");
        String fullName1 = "толстой лев николаевич";
        int x = fullName1.indexOf(" ") + 1; // создавать переменную х и у или сразу значение переменных записать в индекс массива с?
        int y = fullName1.lastIndexOf(" ") + 1;
        char[] c = fullName1.toCharArray();
        c[0] = Character.toUpperCase(c[0]);
        c[x] = Character.toUpperCase(c[x]);
        c[y] = Character.toUpperCase(c[y]);
        System.out.println(c);



    }
}