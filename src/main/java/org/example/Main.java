package org.example;
import org.jetbrains.annotations.NotNull;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.List;

//public class Main {
//    public static void main(String[] args) {
//        Strategy commaSeparatedStrategy = new CommaSeparatedStrategy();
//        Strategy semicolonSeparatedStrategy = new SemicolonSeparatedStrategy();
//
//        StrategyService strategyService = new StrategyServiceImpl(commaSeparatedStrategy);
//
//        List<String> strings = Arrays.asList("QQ", "WW", "EE");
//
//        String result = strategyService.exec(strings);
//        System.out.println("Result with comma strategy: " + result);
//
//        strategyService.setStrategy(semicolonSeparatedStrategy);
//
//        result = strategyService.exec(strings);
//        System.out.println("Result with semicolon strategy: " + result);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        ChainService chainService = new ChainService();
//
//        // Пример входных данных
//        String inputStream = "method: GET\npath: /example\nsession: abc123\nheader1: value1\nheader2: value2";
//
//        // Выполняем цепочку обработчиков
//        Request request = chainService.exec(inputStream);
//
//        // Получаем результаты
//        System.out.println("Method: " + request.getMethod());
//        System.out.println("Path: " + request.getPath());
//        System.out.println("Session: " + request.getSession());
//        System.out.println("Headers: " + request.getHeaders());
//    }
//}

public class Main {

    public static void main(String[] args) {
        TreasureChest treasureChest = new TreasureChest();

        // Iterate over POTION items
        Iterator<Item> potionIterator = treasureChest.iterator(ItemType.POTION);
        System.out.println("POTION items:");
        while (potionIterator.hasNext()) {
            Item item = potionIterator.next();
            System.out.println(item);
        }

        System.out.println("\n******************\n");

        // Iterate over WEAPON items
        Iterator<Item> weaponIterator = treasureChest.iterator(ItemType.WEAPON);
        System.out.println("WEAPON items:");
        while (weaponIterator.hasNext()) {
            Item item = weaponIterator.next();
            System.out.println(item);
        }
    }
}