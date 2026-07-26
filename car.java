public class Car {
    private String brand;
    private String color;
    private int speed;
    private boolean engineOn;
    private int fuelLevel;
    private boolean musicPlaying;

    public Car() {
        brand = "Unknown";
        color = "White";
        speed = 0;
        engineOn = false;
        fuelLevel = 100;
        musicPlaying = false;
    }

    public void setDetails(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void startEngine() {
        engineOn = true;
        System.out.println(brand + " Engine Started");
    }

    public void stopEngine() {
        engineOn = false;
        speed = 0;
        System.out.println(brand + " Engine Stopped");
    }

    public void drive() {
        if (engineOn) {
            speed = 50;
            fuelLevel -= 10;
            System.out.println(brand + " is Driving");
        } else {
            System.out.println("Start the engine first.");
        }
    }

    public void moveLeft() {
        System.out.println(brand + " turned Left");
    }

    public void moveRight() {
        System.out.println(brand + " turned Right");
    }

    public void playMusic() {
        musicPlaying = true;
        System.out.println("Music Playing...");
    }

    public void displayState() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
        System.out.println("Fuel: " + fuelLevel);
        System.out.println("Engine: " + engineOn);
        System.out.println("Music: " + musicPlaying);
        System.out.println();
    }
}
