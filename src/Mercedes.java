public class Mercedes extends Cars {

    private String tipKuzova;

    public Mercedes(String name, String tipKuzova) {
        super(name);
        this.tipKuzova = tipKuzova;
    }

    @Override
    public void print() {
        System.out.println(tipKuzova);
    }
}
