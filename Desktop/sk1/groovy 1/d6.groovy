List l=(1..10)
print l;
print "\n"
println l.groupBy{
   if(it%2==0)
   {
     return 'Even'
   }
   else
   return 'Odd'
}