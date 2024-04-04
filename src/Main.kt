fun main(){
    val person = person("Ajema",22,"Kenya")
    person.details()

    val rectangle = rectangle(23.3,15.6)
    rectangle.area()
}


class person(var name:String,var age:Int,var country:String){
    fun details() {
        println("my name is $name i am $age years old from $country")
    }
}

class rectangle(var width:Double,var height:Double){
    fun area(){
        println(width*height)
    }
}