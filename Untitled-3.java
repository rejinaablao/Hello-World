// Main
public class Main {
    public static void main(String[] args) {
        // Create devices
        Light livingRoomLight = new Light("Living Room");
        Thermostat bedroomThermostat = new Thermostat("Bedroom");
        MusicPlayer kitchenMusicPlayer = new MusicPlayer("Kitchen");

        
        Command turnOnLivingRoomLight = new TurnOnCommand(livingRoomLight);
        Command turnOffLivingRoomLight = new TurnOffCommand(livingRoomLight);
        Command setBedroomTemperature = new SetTemperatureCommand(bedroomThermostat, 22);
        Command playKitchenPlaylist = new PlayPlaylistCommand(kitchenMusicPlayer, new String[]{"Song1", "Song2", "Song3"});

        CentralHub hub = new CentralHub();

        hub.setCommand(turnOnLivingRoomLight);
        hub.pressButton();

        hub.setCommand(turnOffLivingRoomLight);
        hub.pressButton();

        hub.setCommand(setBedroomTemperature);
        hub.pressButton();

        hub.setCommand(playKitchenPlaylist);
        hub.pressButton();
    }
}
