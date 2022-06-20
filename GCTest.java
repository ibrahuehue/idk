package pack;
import java.util.*;  
public class GCTest {

	// Enum: list of constant values (fixed). 
	// you may define it in any class 
	enum MaritalStatus{Single, Engaged, Married, Divorced, Widowed}  
	
	public static void main(String[] args) {
		
		MaritalStatus mstatus= MaritalStatus.Engaged;
		  
		switch(mstatus){  
		case Single:   
		 System.out.println("VERY HAPPY");  
		 break;  // go out of case 
		case  Engaged:
		 break;  
		case Married: 
			 System.out.println("Depressed");  
		default:  
		System.out.println("Not so bad!");  }
		
		// Loop through Enum values 
		for (MaritalStatus allstatuses : MaritalStatus.values()) {
		      System.out.println("STATUS IS: "  + allstatuses); } 
		
		
		
		// Array List (Generic) <T> = Type (any type)
 		
		 ArrayList<String> list=new ArrayList<String>(); //Creating arraylist    
	      list.add("Ahmed");//Adding object in arraylist    
	      list.add("Salem");    
	      list.add("Doaa");    
	      list.add("Diaa");    
	      //Printing the arraylist object   
	      System.out.println("*** One Line: ***" +  list);  
	      
	      
	      // Array list with Iterator 
	      ArrayList<String> alist=new ArrayList<String>();//Creating arraylist  
	      alist.add("Sally");//Adding object in arraylist    
	      alist.add("Maha");    
	      alist.add("Mona");    
	      alist.add("Ghada");    
	      //Traversing list through Iterator  
	      Iterator aitr=alist.iterator();//getting the Iterator  
	      while(aitr.hasNext()){//check if iterator has the elements  
	       System.out.println("### LIST:" + aitr.next());//printing the element and move to next  
	      }  
	      
	      // Array list ... FOR EACH loop
	      ArrayList<String> flist=new ArrayList<String>();//Creating arraylist  
	      flist.add("Maha");//Adding object in arraylist    
	      flist.add("Ali");    
	      flist.add("Bahaa");    
	      flist.add("Ramy");    
	      //Traversing list through for-each loop  (for each element in a collection)
	      for(String names:flist)    // for (datatype variablename: collection object)
	        System.out.println("*** FOR EACH:" + names);    
	      
	      // Array List get / set methods  .. 
		     
		     ArrayList<String> al=new ArrayList<String>();  
		     al.add("Java");  
		     al.add("Oracle");  
		     al.add("Microsoft");  
		     al.add("SAP");  
		     //accessing the element    
		     System.out.println("Returning element: " +al.get(1));//it will return the 2nd element, because index starts from 0  
		     //changing the element  
		     al.set(0,"NEW Java");  // replace JAVA with NEW Java 
		     //Traversing list  
		     for(String prog:al)    // LOOP: for each element in a collection 
		       System.out.println(prog);    
		     System.out.println(al.size() + " is Total number of elements");
		     
		     // Sort Array List:
		     
		     List<String> list1=new ArrayList<String>();  
		     list1.add("Zibra");  
		     list1.add("Monkey");  
		     list1.add("Fox");  
		     list1.add("Lion");  
		     //Sorting the list  
		     Collections.sort(list1);  
		      //Traversing list through the for-each loop  
		     for(String animal:list1)  
		       System.out.println("ASC: " + animal);  
		         
		    System.out.println("Sorting numbers...");  
		     //Creating a list of numbers  
		     List<Integer> list2=new ArrayList<Integer>();  
		     list2.add(21);  
		     list2.add(11);  
		     list2.add(51);  
		     list2.add(1);  
		     //Sorting the list  
		     Collections.sort(list2);  
		      //Traversing list through the for-each loop  
		     for(Integer number:list2)  
		       System.out.println(number);  
	      
	// Iteration ways (all of loop through in comparison)
		     
		     ArrayList<String> Itlist=new ArrayList<String>();//Creating arraylist  
	           Itlist.add("ABK");//Adding object in arraylist  
	           Itlist.add("NBK");  
	           Itlist.add("Boubyan");  
	           Itlist.add("Gulf");  
	            
	           System.out.println("Traversing list through List Iterator:");  
	           //Here, element iterates in reverse order  
	              ListIterator<String> list6=Itlist.listIterator(list.size());  
	              while(list6.hasPrevious())  
	              {  
	                  String str=list6.previous();  
	                  System.out.println("$$$$$$ Reverse:" + str);  
	              }  
	        System.out.println("Traversing list through for loop:");  
	           for(int i=0;i<Itlist.size();i++)  
	           {  
	            System.out.println(  ">>>>>FOR LOOP:" +  Itlist.get(i));     
	           }  
	              
	        System.out.println("Traversing list through forEach() method:");  
	        //The forEach() method is a new feature, introduced in Java 8.  
	        Itlist.forEach(lam ->  { //Here, we are using lambda expression  
	                System.out.println("$$$$ LAMBDA: " + lam);  
	              });  
	                
	            System.out.println("Traversing list through forEachRemaining() method:");  
	              Iterator<String> itrx=Itlist.iterator();  
	              itrx.forEachRemaining(lamd-> //Here, we are using lambda expression  
	              {  
	            System.out.println(lamd);  
	              });  
		          
	              
	              // Class Book ....... 
	              
	              //Creating list of Books  
	            
	              List<Book> blist=new ArrayList<Book>();  // Polymorphism 
	              //Creating Books  
	              Book b1=new Book(101,"C++","Ali Salem","BPB",8);  
	              Book b2=new Book(102,"Networking","Fawaz","XYZ",4);  
	              Book b3=new Book(103,"Windows","Nawar","ABC",6);  
	              //Adding Books to list  
	              blist.add(b1);  
	              blist.add(b2);  
	              blist.add(b3);  
	              //Traversing list  
	              for(Book b:blist){  
	                  System.out.println
	                  (b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	              }  
	              // MAP: Pair of values 
	              
		// NON-Genetic MAP (Not recommended)
		
		 /*   Map map=new HashMap();  
		    //Adding elements to map  
		    map.put(30,"Ibrahim");  
		    map.put(57,"Osama");  
		    map.put(2,"Shaheen");  
		    map.put(6,"Mohammed");  
		    //Traversing Map  
		    Set set=map.entrySet();//Converting to Set so that we can traverse  
		    Iterator itr=set.iterator();  
		    while(itr.hasNext()){  
		        //Converting to Map.Entry so that we can get key and value separately  
		        Map.Entry entry=(Map.Entry)itr.next();  
		        System.out.println(entry.getKey()+" "+entry.getValue());  
		    }  */ 
		    
		   
		// Generic MAP -- Recommended .. 
		    
		    Map<Integer,String> gmap=new HashMap<Integer,String>();  
		    gmap.put(100,"Ali");  
		    gmap.put(108,"Salem");  
		    gmap.put(104,"Riad");  
		    //Elements can traverse in any order  
		    for(Map.Entry m :gmap.entrySet()){  
		     System.out.println("^^^^^ KEY + VALUE " + m.getKey()+" "+m.getValue());  
		    }  
		    
		    // Comparing by KEY
		    
		    Map<Integer,String> cmap=new HashMap<Integer,String>();          
		      cmap.put(100,"---- Amira");    
		      cmap.put(125,"---- Kumar");    
		      cmap.put(102,"---- Kandary");   
		      //Returns a Set view of the mappings contained in this map        
		      cmap.entrySet()  
		      //Returns a sequential Stream with this collection as its source  
		      .stream()  
		      //Sorted according to the provided Comparator  
		      .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))   // 
		      //Performs an action for each element of this stream  
		      .forEach(System.out::println);  
		  
		      
		      // Comparing by VALUE
		      
		      Map<Integer,String> vmap=new HashMap<Integer,String>();          
		      vmap.put(100,"**** Louloa");    
		      vmap.put(101,"**** Ziad");    
		      vmap.put(502,"**** Abdulla");    
		     //Returns a Set view of the mappings contained in this map    
		     vmap.entrySet()  
		     //Returns a sequential Stream with this collection as its source  
		     .stream()  
		     //Sorted according to the provided Comparator  
		     .sorted(Map.Entry.comparingByValue())  
		     //Performs an action for each element of this stream  
		     .forEach(System.out::println);  
		     	       
		
	}

}
