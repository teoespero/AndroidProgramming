package teoespero.JavaPlayGround.LearningJava;

/**
 * Adapter Class
 * This class extends and inherits the data and methods from the Microphone Class.
 * @author Teo Espero (BS Software Development, WGU)
 * @version 1.0
 * @since 06/08/2023
 */
public class Adapter extends Microphone{
    int adapterKit;
    String adapterModel;
    String adapterName;
    double adapterPrice;

    ///////////////////////////////////////////////////////////////////////////////////////////
    //  Adapter Constructor
    public Adapter(
            String micBrand,
            String micModel,
            String micColor,
            double micPrice,
            boolean micWireless,
            double micAmperes,
            boolean isMicOn,
            int volumeLevel,
            int adapterKit,
            String adapterModel,
            String adapterName,
            double adapterPrice
    ){
        super(
                micBrand,
                micModel,
                micColor,
                micPrice,
                micWireless,
                micAmperes,
                volumeLevel,
                isMicOn
        );
        this.adapterKit = adapterKit;
        this.adapterModel = adapterModel;
        this.adapterName = adapterName;
        this.adapterPrice = adapterPrice;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    //  Setter
    public void setAdapterKit(int adapterKit) {this.adapterKit = adapterKit;}
    public void setAdapterModel(String adapterModel) {this.adapterModel = adapterModel;}
    public void setAdapterName(String adapterName) {this.adapterName = adapterName;}
    public void setAdapterPrice(double adapterPrice) {this.adapterPrice = adapterPrice;}

    ///////////////////////////////////////////////////////////////////////////////////////////
    //  Getter
    public int getAdapterKit() {return adapterKit;}
    public String getAdapterModel() {return adapterModel;}
    public String getAdapterName() {return adapterName;}
    public double getAdapterPrice() {return adapterPrice;}
}