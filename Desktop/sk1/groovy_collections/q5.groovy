def l=12..40
def l1=[];
l.eachWithIndex{value,index->
if (index%2==0)
l1 +=value;
}
l=l1
println l
