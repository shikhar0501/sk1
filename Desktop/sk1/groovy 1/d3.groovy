class Ex_gs
{
   String name;
   String gen;
   int age;
   String add;
   String comp;
   int id;
   int sal; 
   public String toString()
   {
    print(""+name+" is a "+gen+" aged "+age+\
    " who lives at "+add+". He works for "+comp+" employee id "+id+\
    " and draws "+sal+" lots of money!!!");
   }
   public static void main(String...a)
   {
      def obj=new Ex_gs();
      obj.name="Sachin";
      obj.gen="man";
      obj.age=24;
      obj.add="Delhi";
      obj.comp="Intelligrape";
      obj.id=12;
      obj.sal=25000;
      print(obj.toString());
   }
}