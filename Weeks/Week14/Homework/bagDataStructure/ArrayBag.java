import java.util.Arrays;
import java.nio.BufferOverflowException;
//THIS CLASS HAS SEVERAL TODOs for you to implement. AFter you are done, create a class
//WITH main method to test all the methods in this class. i.e.:
//BagInterface <String> myBag = new ArrayBag<String> (100); 
//boolean isEM = myBag.isEmpty();

public class ArrayBag<T> implements BagInterface<T> {
     
    private T[] bag;
    private int numberOfEntries;
    public static final int DEFAULT_CAPACITY = 100;
    
    //practicing fail save programming. to ensure the code is more secure  
    private boolean initialized = false;
    private static final int MAX_CAPACITY = 1000;

    /**
     * Creates an empty bag whose initial capacity is 25.
     */
    public ArrayBag() {
        this(DEFAULT_CAPACITY);
    } // end default constructor

    /**
     * Creates an empty bag having a given initial capacity.
     *
     * @param capacity the integer capacity desired
     */
     
    public ArrayBag(int desiredCapacity) {  
        if (desiredCapacity <= MAX_CAPACITY) {                         
            bag = (T[]) new Object[desiredCapacity]; //will produce error if Suppressed Warnings isuncommented due to unchecked cast                     
            numberOfEntries = 0;            
            initialized = true;
        } else {
            throw new IllegalStateException("Attempt to create a bag whose capacity exceeds allowed maximum.");
        }
    } // end constructor

    //Throws an exception if our bag array variable has not been initialized
    private void checkInitialization() {
        if (!initialized) {
            throw new SecurityException("Array bag is not initialized properly");
        }
    }
    
     /**
     * Adds a new entry to this bag.
     *
     * @param newEntry the object to be added as a new entry
     * @return true if the addition is successful, or false if not
     */
    public boolean add(T newEntry) {
        checkInitialization();       
      	if (!isFull())
		bag[numberOfEntries++] = newEntry;
	else
		return false;
	return true;
    } //maybe also double it if it is full??

    //Returns true if the bag is full, or false if not
    public boolean isFull() {
       checkInitialization();       
       return numberOfEntries == bag.length; 
    }
    
     
     public boolean isEmpty() {
       	checkInitialization();       
        return  numberOfEntries == 0;
    }

    public int getCurrentSize() {
       	checkInitialization();       
        return numberOfEntries; 
    }

      /**
     * Retrieves all entries that are in this bag.
     *
     * @return a newly allocated array of all the entries in the bag
     */
    public T[] toArray() {
        checkInitialization();
        T[] result = (T[]) new Object[numberOfEntries];//Unchecked cast
       	for ( int i = 0; i < numberOfEntries; i++)
		result[i] = bag[i];
        
        return result;
    } // end toArray  

     /** Counts the number of times a given entry appears in this bag.
    @param anEntry the entry to be counted
    @return the number of times anEntry appears in the bag */
    public int getFrequencyOf(T anEntry) {
       	checkInitialization();       
	 int counter = 0;
	for (int i = 0; i < numberOfEntries; i++)
		if (anEntry.equals(bag[i]))
			counter++;
	return counter;
    }
    
     /** Tests whether this bag contains a given entry.
    @param anEntry the entry to locate
    @return true if the bag contains anEntry, or false otherwise 
   */

     //Removes all entries from this bag
    public void clear() {
	while (numberOfEntries != 0)
		bag[-1 + numberOfEntries--] = null;
    }
    
    public T remove() {
	checkInitialization();
	T result = null;
	result = bag[-1 + numberOfEntries];
	bag[-1 + numberOfEntries--] = null;

	return result;
    }

    public boolean remove(T anEntry) {
        checkInitialization();
        int index = getIndexOf(anEntry);
        T result = removeEntry(index);
        return anEntry.equals(result);
    }

    //Locates a given entry within the array bag.
    //Return the index of the entry if located, -1 otherwise
    private int getIndexOf(T anEntry) {
        for (int i = 0; i < numberOfEntries; i++)
            if (anEntry.equals(bag[i])) 
                return i;

        return -1;
    }
    
    //remove an antry at a given index within the array bag. 
   //if no such entry exists, returns null.
    //Preconditions givenInex >= 0, !isEmpty()
    private T removeEntry(int givenIndex) {
        T result = null;
        if (givenIndex < numberOfEntries && givenIndex >= 0) {
            result = bag[givenIndex];
            bag[givenIndex] = bag[numberOfEntries - 1];
            bag[numberOfEntries-1] = null;
            numberOfEntries--;
        }

        return result;
    }
    
     public boolean contains(T anEntry) {
       return getIndexOf(anEntry) != -1;
     }
    

     public void display () {
	for (int index = 0 ; index < numberOfEntries ; index++)
		System.out.println(bag[index]);
     }  

     
     //Doubles the size of the array bag.
    private void doubleCapacity() {
       checkInitialization();       
       int newLength = 2 * bag.length;        
       checkCapacity(newLength); //this method should check if newLenght <= MAX_CAPACITY
       bag = Arrays.copyOf(bag,newLength); //in this case bag cannot be final
/**
        T[] oldBag = bag; //save reference to array of bag entries
        int oldSize = oldBag.length; //save old max size of array
        if (MAX_CAPACITY <= 2 * oldSize) {
           // T[] tempBag = (T[]) new Object[2 * oldSize]; // double size of array
           //bag = tempBag; //cannot assign a value to a final variable bag
           bag = (T[]) new Object[2 * oldSize]; // double size of array //cannot assign a value to a final variable bag
        

        
            //copy entries from old array to new, bigger array
            for (int index = 0; index < oldSize; index++) {
                bag[index] = oldBag[index];     
                
                
            }

            oldBag = null;

        }*/

    }
  
    public void checkCapacity(int capacityLength) {
         if (capacityLength > MAX_CAPACITY) {             
            throw new BufferOverflowException();
        }
    }
} // end ArrayBag2
