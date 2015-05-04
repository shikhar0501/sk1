/* 
  Write a method which returns the value of passed key
 from a search string of the form  
 "http://www.google.com?name=johny&age=20&hobby=cricket" 
 
 */
 
String s= "http://www.google.com?name=angel&age=23&hobby=reading"
def var=str.tokenize("?")
def key
var.each{ 
 key=it.split("&")
}
 key.each{ 
 println it
}
