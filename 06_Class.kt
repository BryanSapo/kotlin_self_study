open class Phone(var brand:String, var model:String, var price:Int){
    fun show(){
        println("---");
        println(brand);
        println(model);
        println(price);
        println("---");
    }
}
// the syntax of inheritance is a little bit tricky, please visit: https://kotlinlang.org/docs/inheritance.html
class BabyPhone(brand:String, model:String, price:Int):Phone(brand, model, price){
    fun cry(){
        println("QAQ");
    }
}
fun main(){
    var phone1=Phone("iPhone", "iPhone 15", 300);
    var phone2=Phone("Samsung", "S24 Ultra", 500);
    phone1.show();
    phone2.show();
    var babyPhone=BabyPhone("BabyPhone", "Baby1", 120);
    babyPhone.show()
    babyPhone.cry();
}