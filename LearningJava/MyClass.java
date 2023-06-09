package teoespero.JavaPlayGround.LearningJava;


/**
 * This class is used to test the Microphone Class.
 * @author Teo Espero (BS Software Development, WGU)
 * @version 1.0
 * @since 06/06/2023
 */
public class MyClass {
    public static void main(String[] args){

        ///////////////////////////////////////////////////////////////////////////////////////////
        //  create a new Sony microphone
        Microphone Sony = new Microphone(
                "Sony",
                "Sny-98752",
                "Grey",
                210.25,
                true,
                110.00,
                0,
                false
        );

        System.out.println(Sony.getMicBrand());
        System.out.println(Sony.getMicModel());
        System.out.println(Sony.getMicColor());
        System.out.println(Sony.getMicAmperes());
        System.out.println(Sony.isMicWireless());
        System.out.println(Sony.getMicPrice());
        System.out.println(Sony.getVolumeLevel());
        System.out.println(Sony.isMicOn());

        ///////////////////////////////////////////////////////////////////////////////////////////
        //  manipulate the sony microphone
        Sony.turnOn();
        Sony.setVolumeLevel(5);
        Sony.turnUpVolume();
        Sony.turnDownVolume();
        Sony.turnOff();

        ///////////////////////////////////////////////////////////////////////////////////////////
        //  create a new Sennheiser microphone
        Microphone Sennheiser = new Microphone();

        Sennheiser.setMicBrand("Sennheiser");
        Sennheiser.setMicBrand("Zhr-081376");
        Sennheiser.setMicColor("Silver");
        Sennheiser.setMicPrice(465.30);
        Sennheiser.setMicAmperes(110.0);

        System.out.println(Sennheiser.getMicBrand());
        System.out.println(Sennheiser.getMicModel());
        System.out.println(Sennheiser.getMicColor());
        System.out.println(Sennheiser.getMicAmperes());
        System.out.println(Sennheiser.isMicWireless());
        System.out.println(Sennheiser.getMicPrice());
        System.out.println(Sennheiser.getVolumeLevel());
        System.out.println(Sennheiser.isMicOn());


        ///////////////////////////////////////////////////////////////////////////////////////////
        //  create a new Sennheiser microphone with adapter
        Adapter newSennheiser = new Adapter(
                "Sennheiser",
                "Sny-98752",
                "Grey",
                230.00,
                false,
                110.00,
                false,
                0,
                21245,
                "Sny-987654",
                "head set",
                30.25
        );

        System.out.println(newSennheiser.getMicBrand());
        System.out.println(newSennheiser.getMicModel());
        System.out.println(newSennheiser.getMicColor());
        System.out.println(newSennheiser.getMicAmperes());
        System.out.println(newSennheiser.isMicWireless());
        System.out.println(newSennheiser.getMicPrice());
        System.out.println(newSennheiser.getVolumeLevel());
        System.out.println(newSennheiser.isMicOn());
        System.out.println(newSennheiser.getAdapterKit());
        System.out.println(newSennheiser.getAdapterModel());
        System.out.println(newSennheiser.getMicPrice());

    }
}