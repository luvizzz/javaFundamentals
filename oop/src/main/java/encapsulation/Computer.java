package encapsulation;

public class Computer {

    private int soundVolume;

    private String currentKeyboardLanguage;

    public int batteryLevel;

    public Computer() {
        soundVolume = 70;
        currentKeyboardLanguage = "en";
        batteryLevel = 100;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        this.soundVolume = soundVolume;
    }

    public String getCurrentKeyboardLanguage() {
        return currentKeyboardLanguage;
    }

    public void setCurrentKeyboardLanguage(String currentKeyboardLanguage) {
        this.currentKeyboardLanguage = currentKeyboardLanguage;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
}
