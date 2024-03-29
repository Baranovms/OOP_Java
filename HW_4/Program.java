package OOP_JAVA.HW_4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Program {
    public static void main(String[] args) {

        List<BaseHero> heroesList1 = new ArrayList<>();
        List<BaseHero> heroesList2 = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int heroType1 = random.nextInt(4); // Случайный тип персонажа от 0 до 3
            int heroType2 = random.nextInt(4) + 4; // Случайный тип персонажа от 4 до 7
            switch (heroType1) {
                case 0:
                    heroesList1.add(new Peasant("Крестьянин #" + i));
                    break;
                case 1:
                    heroesList1.add(new Rogue("Разбойник #" + i));
                    break;
                case 2:
                    heroesList1.add(new Sniper("Снайпер #" + i));
                    break;
                case 3:
                    heroesList1.add(new Warlock("Колдун #" + i));
                    break;
            }
            switch (heroType2) {
                case 4:
                    heroesList2.add(new Peasant("Крестьянин #" + i));
                    break;
                case 5:
                    heroesList2.add(new Spearman("Копейщик #" + i));
                    break;
                case 6:
                    heroesList2.add(new Bowman("Арбалетчик #" + i, heroType2, heroType2));
                    break;
                case 7:
                    heroesList2.add(new Monk("Монах #" + i));
                    break;
            }
        }

        List<BaseHero> allHeroes = new ArrayList<>();
        allHeroes.addAll(heroesList1);
        allHeroes.addAll(heroesList2);

        Collections.sort(allHeroes, (h1, h2) -> h2.getSpeed() - h1.getSpeed());

        for (BaseHero hero : allHeroes) {
            System.out.println(hero.getInfo());
        }
        Peasant farmer = new Peasant("John", 10, 20);
    }
}