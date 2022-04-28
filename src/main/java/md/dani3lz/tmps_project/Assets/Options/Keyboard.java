package md.dani3lz.tmps_project.Assets.Options;

import md.dani3lz.tmps_project.Assets.Component;
import md.dani3lz.tmps_project.Assets.JSON.JSON;

import java.util.ArrayList;
import java.util.List;

public class Keyboard {
    private static List<Component> Keyboard_List = new ArrayList<>();

    public static List<Component> getKeyboard_List() {
        if(Keyboard_List.size() > 0){
            return Keyboard_List;
        } else {
            Keyboard_List.addAll(JSON.readJSON(Option.KEYBOARD));
            return Keyboard_List;
        }
    }
}
