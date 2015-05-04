 class Employee
 {
  String Name 
  int Age 
  int Salary
  String toString()
  { return "${this.Name},${this.Age},${this.Salary}"
  }
 }
 
 def l=[];
 l<<new Employee(Name:'p1',Age:13,Salary:21000)
 l +=new Employee(Name:'p2',Age:19,Salary:7000)
 l +=new Employee(Name:'p3',Age:19,Salary:3000)
 l +=new Employee(Name:'p4',Age:53,Salary:11000)
 l +=new Employee(Name:'p5',Age:66,Salary:45000)
 l +=new Employee(Name:'p6',Age:76,Salary:4000)
 l +=new Employee(Name:'p7',Age:52,Salary:52000)
 l +=new Employee(Name:'p8',Age:35,Salary:12000)
 l +=new Employee(Name:'p9',Age:46,Salary:8000)
 l +=new Employee(Name:'p10',Age:56,Salary:12000)

def lowincome= l.findAll{ if(it.Salary<5000)return it }
println lowincome*.name
def youngEmp=l.min{it.Age }
println youngEmp.name
def olderEmp=l.max{it.Age }
println olderEmp.name
def maxSal=l.max{it.Salary }
println maxSal.name
def nameEmp=l.collect{it.Name}
println nameEmp


