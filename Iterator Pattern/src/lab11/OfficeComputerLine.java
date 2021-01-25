package lab11;

import java.util.Iterator;

public class OfficeComputerLine implements Collection {
   
 /*    static final int MAX_ITEMS = 5;
        int numberOfItems = 0;
        Computer[] computers;

        public OfficeComputerLine() {
                computers = new Computer[MAX_ITEMS];
               for (int i = 0; i < MAX_ITEMS; i++) {
                   computers[i] = new Computer();
               }
               numberOfItems = MAX_ITEMS;
        }
       */
    
        
   static final int MAX_ITEMS = 5;
    int numberOfItems = 0;
    DesktopComputer[] desktopComputerOrders;
    private Computer[] computers;

        public OfficeComputerLine() {
                

                   desktopComputerOrders = new DesktopComputer[MAX_ITEMS];
        for (int i = 0; i < MAX_ITEMS; i++) {
            desktopComputerOrders[i] = new OfficeComputer();
        }
        numberOfItems = MAX_ITEMS;
    }

        public void addItem(String str) { 
                Computer computer = new Computer(str); 
                if (numberOfItems >= MAX_ITEMS) 
                        System.err.println("Full"); 
                else { 
                    computers[numberOfItems] = computer; 
                    numberOfItems = numberOfItems + 1; 
                } 
        } 
        public Computer[] getComputers() {
                return computers;
        }
        @Override
        public Iterator createIterator() {
                return new OfficeComputerLineIterator(computers);
        }
}