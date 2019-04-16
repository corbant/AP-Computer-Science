package ch6Labs;
// ****************************************************************
// IntegerList.java
//
// Define an IntegerList class with methods to create & fill
// a list of integers.
//          
// ****************************************************************

public class IntegerList
{
    int[] list; //values in the list
    int numElements;

    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size)
    {
	list = new int[size];
	numElements = 0;
    }


    //-------------------------------------------------------
    //fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize()
    {
	for (int i=0; i<list.length; i++)
	    list[i] = (int)(Math.random() * 100) + 1;
	numElements = 100;
    }
    
    public void increaseSize() {
    	int[] temp;
    	temp = new int[list.length * 2];
    	for(int i=0; i<list.length; i++) {
    		temp[i] = list[i];
    	}
    	numElements = list.length-1;
    	list = temp;
    }
    
    public void addElement(int newVal) {
    	if(numElements+1 >= list.length)
    		increaseSize();
    	list[numElements++] = newVal;
    }
    
    public void removeFirst(int val) {
    	for(int i=0; i<list.length; i++) {
    		if(list[i] == val) {
    			list[i] = 0;
    			for(int j=i; j<list.length; j++) {
    				list[j-1] = list[j];
    			}
    			break;
    		}
    	}
    }
    
    public void removeAll(int val) {
    	for(int i=0; i<list.length; i++) {
    		if(list[i] == val) {
    			list[i] = 0;
    			for(int j=i; j<list.length-1; j++) {
    				list[j] = list[j+1];
    			}
    		}
    	}
    }

    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print()
    {
	for (int i=0; i<list.length; i++)
	    System.out.println(i + ":\t" + list[i]);
    }
}