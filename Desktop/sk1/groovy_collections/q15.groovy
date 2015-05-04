class Stack
{
def list =[]
def c
void push(def a)
{ list[c++]=a }

def pop()
{ def a=list[c-1]
  list.removeAt(--c);
  return a
  }
  
 def top()
 {return list[c-1] } 
}
Stack ob=new Stack()
ob.c=0
 
println ob.push(1)
println ob.push(2)
println ob.pop()
println ob.top()