package md.dani3lz.tmps_project.Assets.Options;

import md.dani3lz.tmps_project.Assets.Component;
import md.dani3lz.tmps_project.Assets.JSON.JSON;

import java.util.ArrayList;
import java.util.List;

public class RAM {
    private static List<Component> RAM_List = new ArrayList<>();

    public static List<Component> getRAM_List() {
        if(RAM_List.size() > 0){
            return RAM_List;
        } else {
            RAM_List.addAll(JSON.readJSON(Option.RAM));
            return RAM_List;
        }
    }
}
