package md.dani3lz.tmps_project.Assets.Options;

import md.dani3lz.tmps_project.Assets.Component;
import md.dani3lz.tmps_project.Assets.JSON.JSON;

import java.util.ArrayList;
import java.util.List;

public class Mouse {
    private static List<Component> Mouse_List = new ArrayList<>();

    public static List<Component> getMouse_List() {
        if(Mouse_List.size() > 0){
            return Mouse_List;
        } else {
            Mouse_List.addAll(JSON.readJSON(Option.MOUSE));
            return Mouse_List;
        }
    }
}
