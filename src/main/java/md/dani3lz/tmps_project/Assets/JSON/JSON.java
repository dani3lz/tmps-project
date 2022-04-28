package md.dani3lz.tmps_project.Assets.JSON;

import md.dani3lz.tmps_project.Assets.Component;
import md.dani3lz.tmps_project.Assets.Options.*;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JSON {
    public static List<Component> readJSON(Option option){
        List<Component> components = new ArrayList<>();
        String fileName = null;
        boolean all = false;
        switch (option){
            case GPU -> fileName = "gpu.json";
            case CPU -> fileName = "cpu.json";
            case HEADPHONE -> fileName = "headphone.json";
            case SPEAKER -> fileName = "speaker.json";
            case RAM -> fileName = "ram.json";
            case KEYBOARD -> fileName = "keyboard.json";
            case MOUSE -> fileName = "mouse.json";
            case ALL -> all = true;
        }
        if (!all) {
            boolean pass = false;
            JsonArray array = null;
            try {
                array = Json.createReader(new FileReader("src/main/resources/md/dani3lz/tmps_project/json/" + fileName)).readArray();
                pass = true;
            } catch (FileNotFoundException e) {
                System.out.println("File-ul nu a fost gasit!");
            }

            if (pass) {
                Component component;
                for (int i = 0; i < array.size(); i++) {
                    JsonObject object = array.getJsonObject(i);
                    component = new Component.Builder()
                            .setName(object.getString("name"))
                            .setPrice(object.getInt("price"))
                            .setColor(object.getString("color"))
                            .setImgSrc(object.getString("imgSrc"))
                            .build();
                    components.add(component);
                }
            }
        } else {
            components.addAll(GPU.getGPU_List());
            components.addAll(CPU.getCPU_List());
            components.addAll(RAM.getRAM_List());
            components.addAll(Keyboard.getKeyboard_List());
            components.addAll(Mouse.getMouse_List());
            components.addAll(Headphone.getHeadphone_List());
            components.addAll(Speaker.getSpeaker_List());
        }
        return components;
    }

}
