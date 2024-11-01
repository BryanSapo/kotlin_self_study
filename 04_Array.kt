fun main(){
    // var arr='a'..'z'; this will return chars 'a' to 'z'
    var arr=arrayOf('a'..'z');// if print this out will just print "a..z".
    println(arr);
    for(i in arr){
        for(j in i){
            println(j);
        }
    }

    var arr2='a'..'z';
    println(arr2);
    for(i in arr2){
        println(i);
    }

    // basiclly, 'a'..'z' is the set of 'a' to 'z', if you want to print all alphabets, you need to run through it.
}