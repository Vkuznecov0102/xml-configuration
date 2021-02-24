package ru.itsjava.service;

import lombok.*;

import ru.itsjava.domain.Coffee;

@RequiredArgsConstructor
public class CoffeeServiceImpl implements CoffeeService {

    private final MenuService menuService;
    private final ScannerService scannerService;

    @SneakyThrows
    @Override
    public Coffee getCoffee() {

        menuService.menuReader("src/main/resources/menu.txt");

        Coffee coffee;

        while (true) {
            int price = scannerService.readPrice();
            if (price == 60) {
                coffee = new Coffee("Эспрессо");
                System.out.println("Ваш выбор " + coffee + "!" + "Получите пожалуйста:-)");
                return coffee;
            } else if (price == 80) {
                coffee = new Coffee("Американо");
                System.out.println("Ваш выбор " + coffee + "!" + "Получите пожалуйста:-)");
                return coffee;
            } else if (price == 100) {
                coffee = new Coffee("Капучино");
                System.out.println("Ваш выбор " + coffee + "!" + "Получите пожалуйста:-)");
                return coffee;
            } else if (price == 110) {
                coffee = new Coffee("Латте");
                System.out.println("Ваш выбор " + coffee + "!" + "Получите пожалуйста:-)");
                return coffee;
            } else {
                System.out.println("Другого кофе нет. Попробуйте еще!");
            }
        }
    }
}