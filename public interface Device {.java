public interface Device {
    void turnOn();
    void turnOff();
}


public class Light implements Device {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        System.out.println(name + " light turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " light turned off.");
    }
}

public class Thermostat implements Device {
    private String name;
    private int temperature;

    public Thermostat(String name) {
        this.name = name;
        this.temperature = 20; // Default temperature
    }

    @Override
    public void turnOn() {
        System.out.println(name + " thermostat turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " thermostat turned off.");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println(name + " thermostat temperature set to " + temperature + "°C.");
    }
}


public class MusicPlayer implements Device {
    private String name;

    public MusicPlayer(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        System.out.println(name + " music player turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " music player turned off.");
    }

    public void playPlaylist(String[] playlist) {
        System.out.println(name + " music player is now playing playlist: " + String.join(", ", playlist) + ".");
    }
}
