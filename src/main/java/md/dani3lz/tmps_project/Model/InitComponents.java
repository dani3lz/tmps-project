package md.dani3lz.tmps_project.Model;

import java.util.ArrayList;
import java.util.List;

public class InitComponents {
    private static InitComponents instance;

    public static synchronized InitComponents getInstance() {
        if (instance == null) {
            instance = new InitComponents();
        }
        return instance;
    }

    public List<Component> getData(Option option){
        List<Component> components = new ArrayList<>();
        switch (option){
            case ALL -> components = getALL();
            case CPU -> components = getCPU();
            case GPU -> components = getGPU();
            case RAM -> components = getRAM();
            case MOUSE -> components = getMouse();
            case SPEAKER -> components = getSpeaker();
            case KEYBOARD -> components = getKeyboard();
            case HEADPHONE -> components = getHeadphone();
        }
        return components;
    }

    public List<Component> getALL(){
        List<Component> components = new ArrayList<>();
        components.addAll(getGPU());
        components.addAll(getCPU());
        components.addAll(getRAM());
        components.addAll(getHeadphone());
        components.addAll(getMouse());
        components.addAll(getKeyboard());
        components.addAll(getSpeaker());
        return components;
    }

    public List<Component> getGPU(){
        List<Component> components = new ArrayList<>();
        Component component;
        component = new Component.Builder()
                .setName("NVIDIA GTX 1050TI")
                .setPrice(4500)
                .setColor("2a2a2b")
                .setImgSrc("img/nvidia/msi-geforce-gtx-1050-ti-gaming-4g.png")
                .build();
        components.add(component);

        component = new Component.Builder()
                .setName("AMD Radeon RX5700XT")
                .setPrice(25500)
                .setColor("2a2a2b")
                .setImgSrc("img/amd/gpu/237107-rx5700xt-gpu-gallery2-1260x709.png")
                .build();
        components.add(component);
        return components;
    }

    public List<Component> getCPU(){
        List<Component> components = new ArrayList<>();
        Component component;
        component = new Component.Builder()
                .setName("AMD Ryzen 5600x")
                .setPrice(6000)
                .setColor("2a2a2b")
                .setImgSrc("img/amd/cpu/cpu.png")
                .build();
        components.add(component);

        component = new Component.Builder()
                .setName("AMD Ryzen 5600g")
                .setPrice(5500)
                .setColor("2a2a2b")
                .setImgSrc("img/amd/cpu/cpu.png")
                .build();
        components.add(component);

        component = new Component.Builder()
                .setName("AMD Ryzen 5700")
                .setPrice(8000)
                .setColor("2a2a2b")
                .setImgSrc("img/amd/cpu/cpu.png")
                .build();
        components.add(component);

        return components;
    }

    public List<Component> getRAM(){
        List<Component> components = new ArrayList<>();
        Component component;
        component = new Component.Builder()
                .setName("HyperX 4gb DDR4")
                .setPrice(1000)
                .setColor("2a2a2b")
                .setImgSrc("img/hyperx/ram/929-9292987_kingston-8gb-kit-hyperx-fury-ddr4-2666mhz-cl15.png")
                .build();
        components.add(component);

        component = new Component.Builder()
                .setName("HyperX 8gb DDR4")
                .setPrice(1800)
                .setColor("2a2a2b")
                .setImgSrc("img/hyperx/ram/929-9292987_kingston-8gb-kit-hyperx-fury-ddr4-2666mhz-cl15.png")
                .build();
        components.add(component);

        component = new Component.Builder()
                .setName("HyperX 16gb DDR4")
                .setPrice(2500)
                .setColor("2a2a2b")
                .setImgSrc("img/hyperx/ram/929-9292987_kingston-8gb-kit-hyperx-fury-ddr4-2666mhz-cl15.png")
                .build();
        components.add(component);

        component = new Component.Builder()
                .setName("Kingston 4gb DDR5")
                .setPrice(1000)
                .setColor("2a2a2b")
                .setImgSrc("img/kingston/ram_kingston.png")
                .build();
        components.add(component);

        component = new Component.Builder()
                .setName("Kingston 8gb DDR5")
                .setPrice(1800)
                .setColor("2a2a2b")
                .setImgSrc("img/kingston/ram_kingston.png")
                .build();
        components.add(component);

        component = new Component.Builder()
                .setName("Kingston 16gb DDR5")
                .setPrice(2500)
                .setColor("2a2a2b")
                .setImgSrc("img/kingston/ram_kingston.png")
                .build();
        components.add(component);

        return components;
    }

    public List<Component> getMouse(){
        List<Component> components = new ArrayList<>();
        Component component;
        component = new Component.Builder()
                .setName("Mouse Razer")
                .setPrice(2000)
                .setColor("2a2a2b")
                .setImgSrc("img/razer/razer.png")
                .build();
        components.add(component);

        return components;
    }

    public List<Component> getKeyboard(){
        List<Component> components = new ArrayList<>();
        Component component;
        component = new Component.Builder()
                .setName("HyperX Alloy FPS PRO")
                .setPrice(2100)
                .setColor("2a2a2b")
                .setImgSrc("img/hyperx/keyboard/hyperx-alloy-fps-pro_5e53fd.png")
                .build();
        components.add(component);

        return components;
    }

    public List<Component> getHeadphone(){
        List<Component> components = new ArrayList<>();
        Component component;
        component = new Component.Builder()
                .setName("SVEN Headphone")
                .setPrice(300)
                .setColor("2a2a2b")
                .setImgSrc("img/sven/headphone/0c9ee1a38ce9df699325d5207fdab718.png")
                .build();
        components.add(component);

        return components;
    }

    public List<Component> getSpeaker(){
        List<Component> components = new ArrayList<>();
        Component component;
        component = new Component.Builder()
                .setName("SVEN Speaker")
                .setPrice(300)
                .setColor("2a2a2b")
                .setImgSrc("img/sven/speaker/110-photo-big.png")
                .build();
        components.add(component);

        return components;
    }
}
