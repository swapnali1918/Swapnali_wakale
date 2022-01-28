package core.programs.assissted.project;

class CPU {
    double price;
   
    class Processor{
        // members of nested class
        double cores;
        String manufacturer;

        double getCache(){
            return 4.3;
        }
    }

    }


public class InnerClass {
    public static void main(String[] args) {

        // create object of Outer class CPU
        CPU cpu = new CPU();

       // create an object of inner class Processor using outer class
        CPU.Processor processor = cpu.new Processor();

        System.out.println("Processor Cache = " + processor.getCache());
     
    }
}