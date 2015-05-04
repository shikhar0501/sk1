def l1=1..10
def l2=11..20
println "l1 disjoint with l2:${l1.disjoint(l2)}";

l2=5..20
println "l1 disjoint with l2 after update:${l1.disjoint(l2)}";
