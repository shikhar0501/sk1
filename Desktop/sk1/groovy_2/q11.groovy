/*
Consider a class named "Employee" which has the following properties: 
1) Name 
2) Age 
3) DepartmentName 
4) EmployeeNumber 
5) Salary 

Let's say that there's a list of 50 employees available. Perform the following operations on the list of employees: 
a) Group the employees on the basis of the bracket in which their salary falls. The ranges are 0-5000, 5001 and 10000, and so on. 
b) Get a count of the number of employees in each department 
c) Get the list of employees whose age is between 18 and 35 
d) Group the employees according to the alphabet with which their first name starts and display the number of employees in each group whose age is greater than 20 
e) Group the employees according to their department

*/
class Employee
{ def name
def age
def DepartmentName
def EmployeeNumber
def salary
 String toString()
 { //return "Age:"+age+" DeptNme:"+DepartmentName+" EmpNo:"+EmployeeNumber +"Sal:"+salary
  return "EmpNo:"+EmployeeNumber
 }
}

List<Employee> lst =[]
50.times{
def e=new Employee(age:it, DepartmentName:"Dept"+(it/5),EmployeeNumber:it,salary:it*1000,name:"Emp"+it)
lst.add(e)
}

println "\nSolution of A"
 Map m=lst.groupBy{
switch(it.salary){
case (0..5000):return "0-5000"
case  (5001..10000):return "5001-10000"
case  (10001..15000):return "10001-15000"
case  (15001..20000):return "15001-20000"
case  (20001..25000):return "20001-25000"
case  (25001..30000):return "25001-30000"

default: return ">30001"
}
}
 m.each{
        println "Salary Range[ $it.key ] :"
        println it.value*.name
    }
  
  
  println "\nSolution of B"
  Map b=lst.countBy{it.DepartmentName}
  b.each{ println "Department:$it,Employees :$it.value" }
 
 
 
 println "\nsolution of c"
 def b1=lst.findAll({Employee-> Employee.age>18&&Employee.age<35})
  println b1   // cccccccccc
 
    
 
 
println "\nSolution of D"
Map m1=lst.groupBy{it.name[0]};
println m1
m1.each{
print "Name Start with:${it.key} and number of Employees with Age >20 are:"
println it.value.countBy({it2->it2.age>20}).get(true)
}
 
  
  
   println "\nSolution of 'E'"
   def a= lst.groupBy({Employee->Employee.DepartmentName})
   print a   
       
     