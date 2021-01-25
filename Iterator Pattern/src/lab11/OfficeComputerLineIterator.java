package lab11;

import java.util.Iterator;

public class OfficeComputerLineIterator implements Iterator<Computer>{

        Computer[] computers;
        int tot = 0;

        public OfficeComputerLineIterator(Computer[] computers) {
                super();
                this.computers = computers;
        }

        @Override
        public boolean hasNext() {
                if (tot >= computers.length || 
                                computers[tot] == null) 
                        return false; 
                else
                        return true; 
        }

        @Override
        public Computer next() {
                Computer computer =  computers[tot]; 
                tot += 1; 
                return computer;
        }
}