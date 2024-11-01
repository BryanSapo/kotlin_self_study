fun main(){
    sayHello("Bryan");
    var y=f(2);
    println(y);
}
// if the function dont need to return anythings, dont need to declare it.
fun sayHello(name:String){
    println("Hello, "+name);
}
//if function is gonna return sth, must declare first.
fun f(x:Int):Int{
    return x * x;
}