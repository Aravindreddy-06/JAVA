/*
1. S –> Single Responsibility Principle (SRP)
👉 One class = One job

✅ Explanation:

Report → only creates report
ReportPrinter → only prints
Responsibility is separated
*/

class Report{
    void generateReport(){
        System.out.println("Generating Report...");
    }
}
class Reportprinter{
    void printReport(){
        System.out.println("Printing the Report.");
    }
}

public class Srp{
    public static void main(String args[]){
        Report r = new Report();
        Reportprinter p = new Reportprinter();

        r.generateReport();
        p.printReport();
    }
}