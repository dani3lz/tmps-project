package md.dani3lz.tmps_project.Assets.Options;

import md.dani3lz.tmps_project.Assets.Component;
import md.dani3lz.tmps_project.Assets.JSON.JSON;

import java.util.ArrayList;
import java.util.List;

public class Headphone {
    private static List<Component> Headphone_List = new ArrayList<>();

    public static List<Component> getHeadphone_List() {
        if(Headphone_List.size() > 0){
            return Headphone_List;
        } else {
            Headphone_List.addAll(JSON.readJSON(Option.HEADPHONE));
            return Headphone_List;
        }
    }
}
