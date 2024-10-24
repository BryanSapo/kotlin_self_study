fun main(){
    var str:String= "c";
    var c:Char='c';
    println(str::class.simpleName);
    println(c::class.simpleName);
    println("-");
    println(str[0]);
    println(str[0]::class.simpleName);
}
/*

The 'c' and "c" are not the same, Kotlin has both Char and String, there are different.
'' is for Char, "" is for String, same as Java or most of other strong type languages.

String is construced by Char, so if you access a index of String, you will get a Char.

 */