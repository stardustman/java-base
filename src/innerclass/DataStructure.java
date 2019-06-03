package innerclass;
/**
 * The DataStructure outer class,
 * which includes a constructor to create an instance of DataStructure 
 * containing an array filled with consecutive integer values (0, 1, 2, 3, and so on) 
 * and a method that prints elements of the array that have an even index value.
 * The EvenIterator inner class, which implements the DataStructureIterator interface, 
 * which extends the Iterator< Integer> interface. 
 * Iterators are used to step through a data structure and typically have methods to 
 * test for the last element, retrieve the current element, and move to the next element.
   A main method that instantiates a DataStructure object (ds),
    then invokes the printEven method to print elements of the array arrayOfInts 
    that have an even index value.
 * @author young
 *
 */
public class DataStructure {
    
    // Create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];
    
    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }
    
    public void printEven() {
        
        // Print out values of even indices of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    
    public void printOdd() {
    	// Print out values of odd indices of the array
    	DataStructureIterator iterator = this.new OddInterator();
    	while(iterator.hasNext()) {
    		System.out.print(iterator.next() + " ");
    	}
    	System.out.println();
    }
    
    interface DataStructureIterator extends java.util.Iterator<Integer> { } 
    

    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface
    
    private class EvenIterator implements DataStructureIterator {
        
        // Start stepping through the array from the beginning
        private int nextIndex = 0;
        
        public boolean hasNext() {
            
            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }        
        
        public Integer next() {
            
            // Record a value of an even index of the array,引用了 DataStructure 的 arrayOfInts
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
            
            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
    }
    
    private class OddInterator implements DataStructureIterator{

    	// Start stepping through the array from the beginning
        private int nextIndex = 1;
        
        public boolean hasNext() {
            
            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }        
        
        public Integer next() {
            
            // Record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
            
            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
    	
    }
    
    public static void main(String s[]) {
        
        // Fill the array with integer values and print out only
        // values of even indices
        DataStructure ds = new DataStructure();
        ds.printEven();
        ds.printOdd();
    }
}