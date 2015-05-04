/* Try the following code on a map: 
     println map.class 
println map.getClass() 
  
What do you observe? 
*/

Map m1=['A':33,'B':44]
Map m2=['C':55,'D':77]
Map m3=m1+m2
println m3.getClass()  // In this case LinkedHashMap is returned
print m3.class // in this case null
