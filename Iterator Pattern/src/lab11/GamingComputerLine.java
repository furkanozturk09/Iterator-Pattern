package lab11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GamingComputerLine implements Collection {

        public ArrayList<Computer> list;

        public GamingComputerLine() {
                list = new ArrayList<Computer>();
                Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Orders:");
        int orders = scanner.nextInt();
        
        for(int index=0;index<orders;index++) {
                list.add(new Computer("Orders"+index));
           }
        }
         public ArrayList<Computer> getComputers() {
                return list;
        }
        @Override
        public Iterator createIterator() {
                return new GamingComputerLineIterator(list);
        }
}