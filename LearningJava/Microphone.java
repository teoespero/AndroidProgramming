package teoespero.JavaPlayGround.LearningJava;

/**
 * Microphone Class
 * This class allows the user to create different types of microphones.
 * @author Teo Espero (BS Software Development, WGU)
 * @version 1.0
 * @since 06/06/2023
 */
public class Microphone {

    ///////////////////////////////////////////////////////////////////////////////////////////////
    //  Class properties
    private String micBrand;
    private String micModel;
    private String micColor;
    private double micPrice;
    private boolean micWireless;
    private double micAmperes;
    private int volumeLevel;
    private boolean isMicOn;

    ///////////////////////////////////////////////////////////////////////////////////////////////
    //  Constructors

    /**
     * Microphone Constructor Class without using any arguments in creating objects.
     */
    public Microphone() {}

    /**
     * Microphone Constructor Class that uses arguments in instantiating objects.
     * @param micBrand The microphone brand.
     * @param micModel The microphone model.
     * @param micColor The microphone color.
     * @param micPrice The microphone price.
     * @param micWireless Is the microphone wireless?
     * @param micAmperes The microphone power.
     * @param volumeLevel The microphone volume level.
     * @param isMicOn The microphone state.
     */
    public Microphone(
            String micBrand,
            String micModel,
            String micColor,
            double micPrice,
            boolean micWireless,
            double micAmperes,
            int volumeLevel,
            boolean isMicOn) {
        this.micBrand = micBrand;
        this.micModel = micModel;
        this.micColor = micColor;
        this.micPrice = micPrice;
        this.micWireless = micWireless;
        this.micAmperes = micAmperes;
        this.volumeLevel = volumeLevel;
        this.isMicOn = isMicOn;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    //  Setters
    public void setMicBrand(String micBrand) {this.micBrand = micBrand;}
    public void setMicColor(String micColor) {this.micColor = micColor;}
    public void setMicPrice(double micPrice) {this.micPrice = micPrice;}
    public void setMicWireless(boolean micWireless) {this.micWireless = micWireless;}
    public void setMicAmperes(double micAmperes) {this.micAmperes = micAmperes;}
    public void setMicModel(String micModel) {this.micModel = micModel;}
    public void setVolumeLevel(int volumeLevel) {this.volumeLevel = volumeLevel;}
    public void setMicOn(boolean micOn) {isMicOn = micOn;}

    ///////////////////////////////////////////////////////////////////////////////////////////////
    //  Getters
    public String getMicBrand() {return micBrand;}
    public String getMicColor() {return micColor;}
    public double getMicPrice() {return micPrice;}
    public boolean isMicWireless() {return micWireless;}
    public double getMicAmperes() {return micAmperes;}
    public String getMicModel() {return micModel;}
    public int getVolumeLevel() {return volumeLevel;}
    public boolean isMicOn() {return isMicOn;}

    ///////////////////////////////////////////////////////////////////////////////////////////////
    //  Methods
    public void turnOff(){
        this.setMicOn(false);
        System.out.println(this.getMicBrand() + " " + this.getMicModel() + " is now Off");
    }

    public void turnOn(){
        this.setMicOn(true);
        System.out.println(this.getMicBrand() + " " + this.getMicModel() + " is now On");
    }

    public void setVolume(int volumeLevel){
        if (this.getVolumeLevel() < 1){
            this.setVolumeLevel(0);
        }else if (this.getVolumeLevel() > 10){
            this.setVolumeLevel(10);
        }else {
            this.setVolumeLevel(volumeLevel);
        }
        System.out.println("Volume set to " + this.getVolumeLevel());
    }

    public void turnDownVolume(){
        int currVolume = this.getVolumeLevel();
        System.out.println("Current volume level " + currVolume);
        if (currVolume > 0){
            --currVolume;
            this.setVolume(currVolume);
        }else{
            this.setVolume(0);
        }
        System.out.println("New volume level " + getVolumeLevel());
    }

    public void turnUpVolume(){
        int currVolume = this.getVolumeLevel();
        System.out.println("Current volume level " + currVolume);
        if (currVolume < 11){
            ++currVolume;
            this.setVolume(currVolume);
        }else{
            this.setVolume(10);
        }
        System.out.println("New volume level " + this.getVolumeLevel());
    }
}