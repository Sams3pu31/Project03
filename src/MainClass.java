public class MainClass {
//    Создаем класс, который будет собирать и выводить данные из других классов
    public static void main(String[] args) {
        Ship ship = new Ship();
        Fish fish = new Fish();

        SwimExecutor swimExecutor = new SwimExecutor();

        swimExecutor.makeSwim(ship);
        swimExecutor.makeSwim(fish);
    }
}