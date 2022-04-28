package md.dani3lz.tmps_project.Assets;

public class Component {
    private String name;
    private double price;
    private String imgSrc;
    private String color;

    private int nrInCart = 1;

    public int getNrInCart() { return nrInCart;}
    public void setNrInCart() {++nrInCart;}

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getImgSrc() {
        return imgSrc;
    }
    public String getColor() {
        return color;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static class Builder {
        private Component component;
        public Builder(){
            component = new Component();
        }

        public Builder setImgSrc(String imgSrc) {
            component.setImgSrc(imgSrc);
            return this;
        }

        public Builder setName(String name) {
            component.setName(name);
            return this;
        }

        public Builder setPrice(double price) {
            component.setPrice(price);
            return this;
        }

        public Builder setColor(String color) {
            component.setColor(color);
            return this;
        }

        public Component build(){
            return component;
        }
    }
}
