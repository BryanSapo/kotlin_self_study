fun main(){
    var i=0;
    while(i<5){
        println(i);
        i++;
    }
    // note that .. is not ...
    // no need to add the var in front of i
    for(i in 0..5){
        println(i);
    }
}