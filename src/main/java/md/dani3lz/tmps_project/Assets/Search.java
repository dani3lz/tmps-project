package md.dani3lz.tmps_project.Assets;

import md.dani3lz.tmps_project.Assets.Options.ALL;

import java.util.ArrayList;
import java.util.List;

public class Search {
    private static List<Component> components = new ArrayList<>();

    public static void searchComponents(String textInput){
        components.clear();
        List<Component> components_exist = ALL.getALL_List();

        for(Component component: components_exist){
            if(component.getName().toLowerCase().contains(textInput)){
                components.add(component);
            }
        }
    }

    public static List<Component> getSearchList() {
        return components;
    }
}
