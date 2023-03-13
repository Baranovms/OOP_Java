package OOP_JAVA.HW_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        List<BaseHero> heroList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int heroType = random.nextInt(7); // Случайный тип персонажа от 0 до 6
            switch (heroType) {
                case 0:
                    heroList.add(new Peasant("Крестьянин #" + i));
                    break;
                case 1:
                    heroList.add(new Rogue("Разбойник #" + i));
                    break;
                case 2:
                    heroList.add(new Sniper("Снайпер #" + i));
                    break;
                case 3:
                    heroList.add(new Warlock("Колдун #" + i));
                    break;
                case 4:
                    heroList.add(new Spearman("Копейщик #" + i));
                    break;
                case 5:
                    heroList.add(new Bowman("Арбалетчик #" + i));
                    break;
                case 6:
                    heroList.add(new Monk("Монах #" + i));
                    break;
            }
        }

        for (BaseHero hero : heroList) {
            System.out.println(hero.getInfo());
        }
    }
}