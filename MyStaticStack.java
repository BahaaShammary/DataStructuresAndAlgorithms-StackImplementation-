
/**
* ADT MyStack: Private Part<br>. 
* The class implements all the operations available in MyStack<br>
*/
public class MyStaticStack implements MyStack {

	//--------------------------------------------------
	// Attributes
	private int items[];
	private int numItems;
	private int maxItems;
	//--------------------------------------------------
	//TO-COMPLETE

	//-------------------------------------------------------------------
	// Basic Operation --> Check if myStack is empty: myCreateEmpty
	//-------------------------------------------------------------------	

	public MyStaticStack(int m){
	this.maxItems = m;  // Initialize the size of the stack
	this.items = new int[this.maxItems];
	this.numItems = 0;
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyStack is empty: isEmpty
	//-------------------------------------------------------------------	

	public boolean isEmpty(){
		//TO-COMPLETE
		if (numItems == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from the top of MyStack and removes it: pop
	//-------------------------------------------------------------------
	
	public int pop(){
		//-----------------------------
				//SET OF OPS
				//-----------------------------
				int index = 0;
				//-----------------------------
				// I. SCENARIO IDENTIFICATION
				//-----------------------------
				int scenario = 0; 
				
				//Rule 1. Valid index: 0 <= index < numItems
				if ((index >= 0) && (index < numItems))
					scenario = 1;
				else{
					//Rule 2. Invalid index due to the current length of MyList: numItems <= index < maxItems  
					if ((numItems <= index) && (index < maxItems))
						scenario = 2;
					//Rule 3. Invalid index: index < 0 || index >= maxItems
					else
						scenario = 3;		
				}
				
				//-----------------------------
				// II. SCENARIO IMPLEMENTATION 
				//-----------------------------
				switch(scenario){	
				//Rule 1. Valid index: 0 <= index < numItems
				case 1: 
					//1.1. We traverse all existing items from index to 0, shifting them one position to the left
					for (int i = index; i < (this.numItems - 1); i++)
						this.items[i] = this.items[i+1];
					
					//1.2. We decrease the number of items
					this.numItems = this.numItems - 1;
					
					break;
				
				//Rule 2. Invalid index due to the current length of MyList: numItems <= index < maxItems 
				case 2: 
					System.out.println("ERROR: MyList contains " + maxItems + " elements, it is not possible to remove an item from index " + index);
					break;
					
					
				//Rule 3. Invalid index: index < 0 || index >= maxItems
				case 3: 
					System.out.println("ERROR: No valid index for MyList");
					break;
				}
				return items[0];
			}

	public void push(int element){
			//TO-COMPLETE
		//-----------------------------
				//SET OF OPS
				//-----------------------------

				//-----------------------------
				// I. SCENARIO IDENTIFICATION
				//-----------------------------
				int scenario = 0; 
				int index = 0;
				if ((index >= 0) && (index <= numItems)){
					//Rule 1. Valid index and free room: (0 <= index <= numItems) and (numItems < maxItems)  
					if (numItems < maxItems)
						scenario = 1;
					//Rule 2. Valid index and full MyList: (0 <= index <= numItems) and (numItems < maxItems) 
					else
						scenario = 2;
				}
				else{
					//Rule 3. Invalid index due to the current length of MyList: numItems < index < maxItems 
					if ((numItems < index) && (index < maxItems))
						scenario = 3;
					//Rule 4. Invalid index: index < 0 || index >= maxItems
					else	
						scenario = 4;		
				}
				
				//-----------------------------
				// II. SCENARIO IMPLEMENTATION 
				//-----------------------------
				switch(scenario){	
				//Rule 1. Valid index and free room: (0 <= index <= numItems) and (numItems < maxItems) 
				case 1: 
					//1.1. We traverse all existing items from numItems-1 to index, shifting them one position to the right
					for (int i = (this.numItems - 1); i >= index; i--)
						this.items[i+1] = this.items[i];
					
					//1.2. We add the item at the desired index
					this.items[index] = element;	
					
					//1.3. We increase the number of items
					this.numItems = this.numItems + 1;
					
					break;
				
				//Rule 2. Valid index and full MyList: (0 <= index <= numItems) and (numItems < maxItems) 
				case 2: 
					System.out.println("ERROR: MyList is already full");
					break;
				
				
				//Rule 3. Valid index but MyList does not contain enough elements so as to add to it: numItems < index < maxItems 
				case 3: 
					System.out.println("ERROR: MyList contains " + maxItems + " elements, it is not possible to add an item at index " + index);
					break;
				
				//Rule 4. Invalid index: index < 0 || index >= maxItems
				case 4: 
					System.out.println("ERROR: No valid index for MyList");
					break;
				
				}
			}
			

	
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> prints all the elements from MyStack: print
	//-------------------------------------------------------------------
		
	public void print(){
		//TO-COMPLETE
		for (int i=0; i<maxItems;i++) {
			System.out.print(" "+ items[i] + " ");
		}
		
	}
	
}
