fun main(){
    var index:Int=1;
    var month:String=when(index){
        1 -> "Jan"
        2 -> "Feb"
        3 -> "Mar"
        4 -> "Apr"
        5 -> "May"
        6 -> "Jun"
        7 -> "Jul"
        8 -> "Aug"
        9 -> "Sep"
        10-> "Oct"
        11-> "Nov"
        12-> "Dec"
        else -> "Invalid."
    }
    println(month);
}

/*

The if-else is very simple and like most of other languages.
The when statement is a similar to the triditional switch-case structure.

 */