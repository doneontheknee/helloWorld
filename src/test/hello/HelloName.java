package test.hello;

import java.io.*;

/**
 * Created on 08.12.16.
 * HelloWorld с запросом имени у пользователя
 */
public class HelloName {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите ваше имя: ");
            String userName = reader.readLine();
            if (!userName.isEmpty()) {
                System.out.println("Привет, " + userName + "!");
            } else {
                System.out.println("Привет, Неизвестный Пользователь");
            }
        } catch (IOException e) {
            System.out.println("Что-то пошло не так :(");
            e.printStackTrace();
        }

    }
}
