package md.dani3lz.tmps_project.Assets.Options;

import md.dani3lz.tmps_project.Assets.Component;
import md.dani3lz.tmps_project.Assets.JSON.JSON;

import java.util.ArrayList;
import java.util.List;

public class GPU {
    private static List<Component> GPU_List = new ArrayList<>();

    public static List<Component> getGPU_List() {
        if(GPU_List.size() > 0){
            return GPU_List;
        } else {
            GPU_List.addAll(JSON.readJSON(Option.GPU));
            return GPU_List;
        }
    }
}
