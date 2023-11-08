public class Ship implements Swimable {
// создаем класс, который имеет объект "кораблик", он умеет плавать
    @Override
    public void swim() {
        onWater();
        System.out.println("Я кораблик, и я умею плавать.");
    }

    private void onWater() {
        System.out.println("Я кораблик и для того, чтобы плыть, мне нужен источник энергии. Плеск-плеск");
    }
}
