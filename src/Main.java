public class Main {

    public static void main(String[] args) {
       Cars s = createObject("Lexus");
       Cars b = createObject("Bmw");
       Cars v = createObject("Mercedes");

       Cars[] cars = {s, b, v};
        for (int i = 0; i < cars.length; i++) {
            cars[i].print();
        }
    }

    public static Cars createObject(String className) {

        switch (className) {
            case "Lexus" :
                Lexus lexus = new Lexus("470", 2023);
                return lexus;
            case "Bmw" :
                Bmw bmw = new Bmw("samurai", "black");
                return bmw;
            case "Mercedes" :
                Mercedes mercedes = new Mercedes("x5", "sedan");
                return mercedes;
            default: return null;

        }

    }
}