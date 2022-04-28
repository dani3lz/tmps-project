package md.dani3lz.tmps_project.Assets;

import md.dani3lz.tmps_project.Assets.Options.*;

import java.util.ArrayList;
import java.util.List;

public class InitComponents {
    private static InitComponents instance;

    public static synchronized InitComponents getInstance() {
        if (instance == null) {
            instance = new InitComponents();
        }
        return instance;
    }

    public List<Component> getData(Option option){
        List<Component> components = new ArrayList<>();
        switch (option){
            case ALL -> components = ALL.getALL_List();
            case CPU -> components = CPU.getCPU_List();
            case GPU -> components = GPU.getGPU_List();
            case RAM -> components = RAM.getRAM_List();
            case MOUSE -> components = Mouse.getMouse_List();
            case SPEAKER -> components = Speaker.getSpeaker_List();
            case KEYBOARD -> components = Keyboard.getKeyboard_List();
            case HEADPHONE -> components = Headphone.getHeadphone_List();
        }
        return components;
    }
}
