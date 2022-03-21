import java.util.Scanner;
class ProcessData2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Purchase pemrosesan = new Purchase();

        double amount;
        boolean taxable;
        double total;

        System.out.print("Amount: ");
        amount = myScanner.nextDouble();
        System.out.print("Taxable ? (true/false) ");
        taxable = myScanner.nextBoolean();

        if (taxable){
            total = amount * 1.05;
        } else {
            total = amount;
        }
        System.out.print("Total: ");
        System.out.println(total);
    }
}

class Purchase{
    Scanner myScanner = new Scanner(System.in);
    double amount;
    boolean taxable;
    double total;

    public void inputAmount(){
        System.out.print("Amount: ");
        this.amount = myScanner.nextDouble(); 
    }
    public void inputTaxable(){
        System.out.print("Taxable ? (true/false) ");
        this.taxable = myScanner.nextBoolean();
    }
    public void outputTotal(){
        System.out.print("Total: ");
        System.out.println(total);
    }
}