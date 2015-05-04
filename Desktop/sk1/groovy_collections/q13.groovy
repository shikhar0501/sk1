def s="the only difference between a good day and bad day is our attitude." as List;
def myclosure= {str,elem-> 
    def count=0;
    str.each{
    if(it==elem)
    count++
    }
    count;
}
 
  def mymap=[:]
   s.each{
    mymap[it]=myclosure(s,it) 
  }
  mymap.each{
  println "The Character is ${it.key} frequency is: ${it.value}";
  }

println "end"
 

 
 
 
  
  