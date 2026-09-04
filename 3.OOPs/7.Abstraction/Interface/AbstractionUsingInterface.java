interface Remote {
    void pressButton(); // WHAT must be done, no details on HOW
}

class TVRemote implements Remote {
    @Override
    public void pressButton() {
        System.out.println("TV turns ON/OFF");
    }
}

class ACRemote implements Remote {
    @Override
    public void pressButton() {
        System.out.println("AC temperature changes");
    }
}

public class AbstractionUsingInterface {
    public static void main(String[] args) {
        Remote r1 = new TVRemote();
        Remote r2 = new ACRemote();

        r1.pressButton(); // TV turns ON/OFF
        r2.pressButton(); // AC temperature changes
    }
}
