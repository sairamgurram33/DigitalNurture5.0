//Singleton means creating one instance of a class
public class SingletonPrinterManager {
    private static volatile SingletonPrinterManager instance;
    private String printerName;

    private SingletonPrinterManager(String name) { //Constructor
        this.printerName = name;
    }

    public static SingletonPrinterManager getInstance(String name) {
        if (instance == null) { //if instance is null then it will create one instance
            synchronized (SingletonPrinterManager.class) {
                if (instance == null) {
                    instance = new SingletonPrinterManager(name);
                }
            }
        }
        return instance;
    }

    public void showPrinter() {
        System.out.println("Printer Name: " + this.printerName);
    }

    public static void main(String[] args) {
        SingletonPrinterManager p1 = SingletonPrinterManager.getInstance("HP LaserJet");
        SingletonPrinterManager p2 = SingletonPrinterManager.getInstance("Canon Inkjet");

        System.out.println(p1 == p2); // true
        p1.showPrinter(); // Printer Name: HP LaserJet
    }
}

