
import java.util.*;

public class Lab2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int availableHours = input.nextInt();
        int devicesToBeTested = input.nextInt();
     
        if (availableHours < 4) {
            System.out.println("Invalid Input");
        } else {
            int testedDevices = doSomething(availableHours, devicesToBeTested);
            int remainingDevices = devicesToBeTested - testedDevices;
            System.out.println(testedDevices);
            System.out.println(remainingDevices);
        }
     
        input.close();
    }

    public static int doSomething(int availableHours, int devicesToBeTested) {
      
        int devicesTested = availableHours / 4;
        
        if (devicesTested > devicesToBeTested) {
            devicesTested = devicesToBeTested;
        }
        
        return devicesTested;
    }
}
