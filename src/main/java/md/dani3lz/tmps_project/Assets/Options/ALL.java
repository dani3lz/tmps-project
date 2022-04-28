package md.dani3lz.tmps_project.Assets.Options;

import md.dani3lz.tmps_project.Assets.Component;
import md.dani3lz.tmps_project.Assets.JSON.JSON;

import java.util.ArrayList;
import java.util.List;

public class ALL {
    private static List<Component> ALL_List = new ArrayList<>();

    public static List<Component> getALL_List() {
        if(ALL_List.size() > 0){
            return ALL_List;
        } else {
            ALL_List.addAll(JSON.readJSON(Option.ALL));
            return ALL_List;
        }
    }
}
