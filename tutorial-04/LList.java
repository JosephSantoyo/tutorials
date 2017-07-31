public class LList implements Comparable<LList>{
 protected Node head;
 protected Node tail;
 protected int  size;
 
 /* constructors */
 public LList(){
  head = tail = null;
  size = 0;
 }
 public LList(Node n){
  head = tail = n;
  size = 1;
 }

 /* simple getters */
 public int getSize(){ 
  return size; 
 }
 
 public String get(int position){
  // returns data of element at index position
  // returns null otherwise
  if( position < 0 || position > size -1 || head == null){
   return null;
  }
  int  count = 0;
  Node current = head;
  while(count < position){
   current = current.getNext();
   count += 1;
  }
  return current.getData();
 }
 
 
 /* setter */
 public boolean set(int position, String d){
  // set data of element at given position to d
  // returns true if successful and false otherwise
  if (position < 0 || position > size - 1 || head == null) {
   return false;
  } else {
    int count = 0;
    Node current = head;
    while (count < position) {
      current = current.getNext();
      count+= 1;
    }
    
    // at the correct position
    current.setData(d);
    
    return true;
  }
 }
 /* swap data at pos i, with data at pos j */
 public boolean swap(int i, int j) {
   String s = this.get(i);
   if (s != null) {
     if (this.size > 1) {
       this.set(i, this.get(j));
       this.set(j, s);
       return true;
     }
   }
   
   return false;
 }
 
 /* add elements to the list */
 public LList addBack(String d){
  // add to back of list
  Node n = new Node(d);
  if( size == 0 ){
   head = tail = n;
  }else{
   tail.setNext(n);
   tail = n;
  }
  size += 1;
  return this;
 }
 
 public LList addFront(String d){
  // add to front of list
  Node n = new Node(d, head);
  head = n;
  if(size == 0){ tail = n; }
  size += 1;
  return this;
 }
 
 public LList add(int position, String d){
  // add a new node with data d at given position
  // return null if method fails
  if( position < 0 || position > size){
   return null;
  }
  if( position == 0){
   return addFront(d);
  }else if( position == size ){
   return addBack(d);
  }
  // find node at index position-1
  Node prev = head;
  int count = 0;
  while( count < position-1 ){
   count += 1;
   prev = prev.getNext();
  } // prev will point to node before 
  Node n = new Node(d, prev.getNext() );
  prev.setNext(n);
  size += 1;
  return this;
 }
 
 /* remove elements from the list */
 public String removeFront(){
  // remove x_0 (return data of x_0)
  String front = head.getData();
  
  head = head.getNext();
  
  this.size -= 1;
  
  return front;
 }
 
 public String remove(int position){
   // remove x_position (return data of x_position)
   if( position < 0 || position > size -1 || head == null){
     return null;
  }
   // Linked List is not empty
   if (this.size > 0) {
     // if you want to remove the head
     if (position == 0) {
       return this.removeFront();
     // otherwise if you want to remove the tail
     } else {
       int count = 0;
       Node current = head;
       while (count < position - 1) {
         current = current.getNext();
         count += 1;
       }
       
       Node temp = current.getNext();
       String data = temp.getData();
       
       current.setNext(temp.getNext());
       temp.setNext(null);
       
       size -= 1;
       
       return data;       
     }
     // List has 1 or less elements...no element to remove
   } else {
     return null;
   }
 } 
 
 /* find element in list */
 public int find(String d){
  // return the first index k such that x_k == d
  // return -1 if d is not in the list
  return -2;
 }
 
 @Override
 public int compareTo(LList o){
  return size - o.size;
 }

 
 
 @Override
 public String toString(){
  if( size == 0 || head == null){
   return null;
  }
  String out = "[";
  Node current = head;
  for(int i=0; i<size-1; i=i+1){
   out += current.getData() + "]->[";
   current = current.getNext();
  }
  return out+current.getData() +"]";
 }
}