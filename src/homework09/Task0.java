package homework09;
/*
Написать метод, принимающий на вход строку. Метод должен вывести на экран число,
соответсвующее количеству символов в строке.

Например: Если в метод пришла строка "hello" - метод должен вывести число 5
(так как в строке hello 5 символов)
 */

public class Task0 {
    public static void main(String[] args) {
        String imput = "hello";
        printString(imput);

    }

    public static void printString(String str){
        if (str!= null) {
            System.out.println(" Количество символов в строке: " + str.length() );
        }


    }

}
