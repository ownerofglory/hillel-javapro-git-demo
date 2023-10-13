package ua.ithillel.git;

import ua.ithillel.git.service.StringService;
import ua.ithillel.git.service.StringServiceDefault;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application started...");

        StringService service = new StringServiceDefault();

        String helloUpperCase = service.upperCase("Hello");
        System.out.printf("Converted string %s%n", helloUpperCase);

        System.out.println("Application finished");
    }
}
