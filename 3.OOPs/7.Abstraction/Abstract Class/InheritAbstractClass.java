abstract class Document {
    abstract void print(); // abstract method
}

// Report inherits print() but does NOT override it
// So Report must also be declared abstract
abstract class Report extends Document {
    // no implementation of print() here — allowed since Report is abstract
    void summary() {
        System.out.println("Generating report summary...");
    }
}

// SalesReport finally provides the implementation
class SalesReport extends Report {
    @Override
    void print() {
        System.out.println("Printing Sales Report");
    }
}

public class InheritAbstractClass {
    public static void main(String[] args) {
        // Document d = new Document(); ❌ can't instantiate abstract class
        // Report r = new Report();      ❌ can't instantiate abstract class either

        SalesReport sr = new SalesReport(); // ✅ concrete class
        sr.print();    // Printing Sales Report
        sr.summary();  // Generating report summary...
    }
}