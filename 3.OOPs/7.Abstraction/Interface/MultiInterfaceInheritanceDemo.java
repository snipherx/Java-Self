interface Printable {
    void print(); // WHAT: must be able to print
}

interface Scannable {
    void scan(); // WHAT: must be able to scan
}

// AllInOne interface inherits BOTH Printable and Scannable
// Note: interfaces use "extends" (not "implements") to inherit other interfaces,
// and can extend MULTIPLE interfaces at once — unlike classes
interface AllInOne extends Printable, Scannable {
    void fax(); // its own additional method
}

// A class implementing AllInOne must implement ALL THREE methods
// (print, scan, fax) — inherited from both parent interfaces + its own
class Printer implements AllInOne {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }

    @Override
    public void fax() {
        System.out.println("Faxing document...");
    }
}

public class MultiInterfaceInheritanceDemo {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print(); // Printing document...
        p.scan();  // Scanning document...
        p.fax();   // Faxing document...
    }
}