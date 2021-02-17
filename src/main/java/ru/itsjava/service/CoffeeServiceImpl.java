package ru.itsjava.service;

import lombok.*;

import ru.itsjava.domain.Coffee;

public class CoffeeServiceImpl implements CoffeeService {

    private Coffee coffee;
    private BufferedReaderService bufferedReaderService;
    private ScannerService scannerService;

    @SneakyThrows
    @Override
    public Coffee getCoffeeByPrice(double price) {

        bufferedReaderService=new BufferedReaderServiceImpl();
        bufferedReaderService.menuReader("src/main/resources/menu.txt");

        if (scannerService != null) {
            scannerService.read(price);
        }

        while (true) {
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
            } else if (price != 60 && price != 80 && price != 100 && price != 110) {
                System.out.println("Другого кофе нет. Попробуйте еще!");
            }
        }
    }
}