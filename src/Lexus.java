public class Lexus extends Cars{
    private int year;

    public Lexus(String name, int year) {
        super(name);
        this.year = year;
    }

    @Override
    public void print() {
        System.out.println(year);
    }
}
