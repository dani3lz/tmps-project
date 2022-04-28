package md.dani3lz.tmps_project.Assets.Options;

import md.dani3lz.tmps_project.Assets.*;
import md.dani3lz.tmps_project.Assets.JSON.JSON;

import java.util.ArrayList;
import java.util.List;

public class CPU {
    private static List<Component> CPU_List = new ArrayList<>();

    public static List<Component> getCPU_List() {
        if(CPU_List.size() > 0){
            return CPU_List;
        } else {
            CPU_List.addAll(JSON.readJSON(Option.CPU));
            return CPU_List;
        }
    }

}
