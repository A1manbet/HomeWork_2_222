public class Bmw extends Cars{

    private String color;

    public Bmw(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println(color);
    }
}
