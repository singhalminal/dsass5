

    
class node
{
  int data;
  node next;
  public node(int data)
  {
    this.data=data;
    this.next=null;
  }
}

class Stack
{
   node head;
   Stack()
   {
     this.head=null;
   }
   public void push (int data)
   {
     node temp=new node(data);
     temp.next=this.head;
     this.head=temp;
   }
   public int pop()
   {
     if (this.head==null)
     {
       return -1;
     }
     else
     {
       int temp=this.head.data;
       this.head=this.head.next;
       return temp;
     }
   }
   public int peek()
   {
     if (this.head==null)
     {
       return -1;
     }
    return this.head.data;
   }
   public void print()
   {
     node temp=this.head;
     while (temp!=null)
     {
       if (temp!=null)
       {
         System.out.print(temp.data+" ");
         temp=temp.next;
       }
     }
     System.out.println();
   }
}

class Queue
{
  Stack st1;
  Stack st2;
  Queue()
  {
    this.st1=new Stack();
    this.st2=new Stack();
  }
  public void push(int data)
  {
    this.st1.push(data);
  }
  public int pop()
  {
    int temp=0;
    while ((temp=this.st1.pop())!=-1)
    {
      this.st2.push(temp);
    }
    temp=st2.pop();
    int temp2=0;
    while ((temp2=this.st2.pop())!=-1)
    {
      this.st1.push(temp2);
    }
    return temp;
  }
public int peek()
{
  int temp=0;
  while ((temp=this.st1.pop())!=-1)
  {
    this.st2.push(temp);
  }
  temp=st2.peek();
  int temp2=0;
  while ((temp2=this.st2.pop())!=-1)
  {
    this.st1.push(temp2);
  }
  return temp;
}
}

class que2
{
  public static void main(String[] args)
  {
    Queue st=new Queue();
    st.push(1);
    st.push(2);
    System.out.println(st.pop());
     System.out.println(st.peek());
      System.out.println(st.pop());
       System.out.println(st.pop());
  }
}


    