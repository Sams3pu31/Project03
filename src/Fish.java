public class Fish implements Swimable {
//    создаем рыбку и то, что она умеет делать

    @Override
    public void swim() {
        onWater();
        System.out.println("Я рыбка, и я умею плавать");
    }

    private void onWater() {
        System.out.println("Я рыбка и для того, чтобы плавать, мне нужно хорошо кушать. Буль-буль");
    }
}
