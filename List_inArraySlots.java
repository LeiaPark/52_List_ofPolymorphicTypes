/**
  Implement a list of diverse types, including
  integers, double-precision floating point numbers,
  and Strings.
 */

public class List_inArraySlots {

    private Object[] Elements;
	
    private int filledElements; // the number of elements in this list
    
    /* type identifier for each element
       That is, typeOfElements[i] == 0 means element i is an integer;
                                     1 means element i is a double;
                                     2 means element i is a String.
        Optional extra education in programming (not comp sci):
            replace these "magic numbers" with an "enumerated type".
     */

    private static final int INITIAL_CAPACITY = 10;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
    	Elements = new Object[INITIAL_CAPACITY];
    }


    /**
      @return the number of elements in this list
     */
     public int size() {
    	 return filledElements;
     }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
     public String toString() {
    	 String result = "[";
    	 for (int i = 0; i < filledElements; i++) {
    		 result += Elements[i].toString() + ",";
    		 }
    	 return result + "]";
     }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
      public boolean add( Object value) {
    	  
    	  if( filledElements == Elements.length) expand();

    	  Elements[filledElements] = value;
          filledElements++;
          return true;
      }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data.
     */
      private void expand() {
         System.out.println( "expand... (for debugging)");
            /* S.O.P. rules for debugging:
               Working methods should be silent. But during
               development, the programmer must verify that
               this method is called when that is appropriate.
               So test using the println(), then comment it out.
               */
         
         int originalLength = Elements.length;
         
         Object[] bigger = new Object[ originalLength * 2];
         for( int elemIndex = 0; elemIndex < filledElements; elemIndex++)
        	 bigger[ elemIndex] = Elements[ elemIndex];
         Elements = bigger;
      }
      
      public String get(int index){
    	  return Elements[index].toString();
      }

}