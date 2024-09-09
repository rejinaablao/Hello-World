public class TurnOnCommand implements Command {
    private Device device;

    public TurnOnCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}

public class TurnOffCommand implements Command {
    private Device device;

    public TurnOffCommand(Device device) {
        this.device = device;
    }

    @Overrid
    public void execute() {
        device.turnOff();
    }
}

public class SetTemperatureCommand implements Command {
    private Thermostat thermostat;
    private int temperature;

    public SetTemperatureCommand(Thermostat thermostat, int temperature) {
        this.thermostat = thermostat;
        this.temperature = temperature;
    }

    @Override
    public void execute() {
        thermostat.setTemperature(temperature);
    }
}

public class PlayPlaylistCommand implements Command {
    private MusicPlayer musicPlayer;
    private String[] playlist;

    public PlayPlaylistCommand(MusicPlayer musicPlayer, String[] playlist) {
        this.musicPlayer = musicPlayer;
        this.playlist = playlist;
    }

    @Override
    public void execute() {
        musicPlayer.playPlaylist(playlist);
    }
}
