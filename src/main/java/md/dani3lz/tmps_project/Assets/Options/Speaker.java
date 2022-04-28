package md.dani3lz.tmps_project.Assets.Options;

import md.dani3lz.tmps_project.Assets.Component;
import md.dani3lz.tmps_project.Assets.JSON.JSON;

import java.util.ArrayList;
import java.util.List;

public class Speaker {
    private static List<Component> Speaker_List = new ArrayList<>();

    public static List<Component> getSpeaker_List() {
        if(Speaker_List.size() > 0){
            return Speaker_List;
        } else {
            Speaker_List.addAll(JSON.readJSON(Option.SPEAKER));
            return Speaker_List;
        }
    }
}
