String s = "this string needs to be split"
println s.tokenize(" ")
println s.tokenize()

 s = "this string needs to be split"
println s.split(" ")
println s.split(/\s/)

 s = "are.you.trying.to.split.me.sir?"
println s.tokenize(".")
println s.split(".")