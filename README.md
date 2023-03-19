## Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм

Крестьянин, разбойник, снайпер, колдун, копейщик, арбалетчик, монах. Для каждого сформировать список свойств и возможных действий. Напрнимер свойство скорость, действие нанести удар. Проанализировать получившиеся свойства и действия персонажей и создать Обобщённый класс описывающий свойства и действия имеющиеся у всех персонажей. Создать этот класс. Создать классы для каждого типа персонажей наследующие и расширяющие абстрактный(обобщённый) класс. В основной программе создать по одному экземпляру каждого типа персонажей.

## Урок 2. Принципы ООП Абстракция и интерфейсы. Пример проектирования

Добавить файл с описанием интерфейса. В котором описать два метода, void step(); и String getInfo(); Реализовать интерфейсs в абстрактном классе и в наследниках так, чтобы getInfo возвращал тип персонажа. Создать два списка в классе main. В кждый из списков добавить по десять экземнляров наследников BaseHero. Удалить ненужные методы из абстрактного класса, если такие есть. В main пройти по спискам и вызвать у всех персонажей getInfo.

## Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования

В материалы добавил xml с полями и параметрами по умолчанию. Убедиться что у вас все поля описанны. Создать в основной программе два списка. Положить в них по 10 случайных персонажей. В первом только крестьянин, разбойник, снайпер или колдун. Во втором крестьянин, копейщик, арбалетчик, монах. Вывести в консоль информацию обо всех персонажах не зависимо от списка, очередь должна определяться скоростью каждого персонажа.
*Начать реализацию метода step у лучников.
1. Если жизнь равна нулю или стрел нет, завершить оьработку.
2. Поиск среди противников наиболее приближённого.
3. Нанести среднее повреждение найденному противнику.
4. Найти среди своих крестьянина.
5. Если найден завершить метод иначе уменьшить запас стрел на одну.
Степ лучника будет доделовать на следующем саминаре!)

## Урок 4. ООП: Обобщения. ч1

1. Создать класс с описанием координат, x и y.
2. Добавить в абстрактный класс порле с координатами и пробросить его инициализацию до конструкторов персонажей. Farmer farmer = new Farmer(getName(), x, y);
3. Реализовать метод step() лучников. 
    3.1 Если жизнь равна нулю или стрел нет, завершить оьработку. 
    3.2 Поиск среди противников наиболее приближённого. 
    3.3 Нанести среднее повреждение найденному противнику. 
    3.4 Найти среди своих крестьянина. 
    3.5 Если найден завершить метод иначе уменьшить запас стрел на одну.

## Урок 5. От простого к практике
1. Реализовать псевдо графику используя приложенные в документах занятия файлы.
2. Распределить функционал основной программы по методам в соответствии с SOLID. 
3. Используя класс сканер реализовать повторение хода в основной программе.