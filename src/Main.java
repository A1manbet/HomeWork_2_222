public class Main {
    Cars s;
    public static void main(String[] args) {
        createObject("Lexus");
    }

    public Cars createObject(String className) {

        switch (className) {
            case "Lexus" :
                Lexus lexus = new Lexus("470", 2023);
                s = lexus;
                break;
            case "Bmw" :
                Bmw bmw = new Bmw("samurai", "black");
                s = bmw;
                break;
            case "Mercedes" :
                Mercedes mercedes = new Mercedes("x5", "sedan");
                s = mercedes;
                break;
        }
        return s;

    }
}