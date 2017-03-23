/*  chapter 7 classes and object
//  assignment
//  
*/

public class Computer {
  String machineType = "-";
  String serialNumber = "-";
  int billDate;  //ddmmyyyy
  
  public static void main (String[] args) {
    Computer c1 = new Computer();
    c1.printHardwareInfo();

    Computer c2 = new Computer("Docs2021", "PGH-0922301", 03052012);
    c2.printHardwareInfo();
  }
	  
  
	  Computer () {
	  }
	
	  Computer (String mt, String sn, int billDate) {
	    this.machineType = mt;
	    this.serialNumber = sn;
	    this.billDate = billDate;
	  }
	  
    void printHardwareInfo () {
	    System.out.printf ("=====hardware basic info.=====\nMachineType: %s\nSerialNumber: %s\nbillDate: %s\n",machineType, serialNumber, billDate);
    }
	}
