class Computer {
    public void games() {
        System.out.println("Game Running...");
    }

    public String getMeAPen(int money) {
        if (money >= 10) {
            return "Pen";
        } else {
            return "nothing";
        }

    }
}

public class method {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.games();
        String str = obj.getMeAPen(10);
        System.out.println(str);
    }
}
