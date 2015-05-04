/*Iterate the map in as many as possible
*/
Map m=["A":22,"B":23,"C":20,"D":44,"E":55,"F":66,"G":99,"H":100 ,"I":32,"J":55]
println m

m.each{print it}

m.findAll{print it}

for ( e in m ) {
    print "key = ${e.key}, value = ${e.value}"
}
