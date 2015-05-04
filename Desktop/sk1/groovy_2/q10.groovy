/*
Consider the following map: 
Map m = [
      ‘Computing’ : [‘Computing’ : 600, ‘Information Systems’ : 300], 
         ‘Engineering’ : [‘Civil’ : 200, ‘Mechanical’ : 100], 
         ‘Management’ : [‘Management’ : 800] 
       ] 

a) How many university departments are there? 
b) How many programs are delivered by the Computing department? 
c) How many students are enrolled in the Civil Engineering program? 

*/
Map<String,Map> m=['Computing':['Computing':600,'InformationSystems':300],
'Engineering':['Civil':200,'Mechanical':100],
'Management':['Management':800]
]
List l=m.keySet() as List
println "No. of Departments= "+ l.size()
Map x=m."Computing"
println "No. of Computing Department Programs :"+x.size()
println "Students in Civil Engineering Program= "+ m.'Engineering'.'Civil'