fun main(){
    var car=Car("G500","Toyota","Blue",7)
    car.carry(9)
    car.identify()

    var x=car.calculateParkingFees(24)
    println(x)



    var bus=Bus("G500","Toyota","Blue",7)

}

open class Car(var make: String,var model:String,var color:String,var capacity:Int) {
    fun carry(people: Int) {
        var x = people - capacity
        if (people <= capacity) {
            println("carrying $people passengers")
        } else println("over capacity by $x people")
    }
    fun identify(){
        println("i am a $color $make $model")
    }
    fun calculateParkingFees(hours:Int):Int{
        var pFee=hours*20
        return pFee
    }
}
class Bus(make:String, model:String, color: String,capacity: Int):Car(make,model,color,capacity){
    fun maxTripFare(fare:Double):Double{
        var tFare=fare*capacity
        return tFare

    }
}