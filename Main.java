public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.setDetails("Toyota", "Black");
        car.startEngine();
        car.accelerate();
        car.moveLeft();
        car.moveRight();
        car.playMusic();
        car.brake();
        car.displayState();
        car.stopEngine();
    }
}
