

//you need to put OPEN for inert
open class Enemy(val name:String,var hitPoints: Int, var lives: Int){

     open fun takeDamage(damage:  Int){
        val remainingHitPoints = hitPoints - damage
        if(remainingHitPoints > 0){
            hitPoints= remainingHitPoints
            println("$name took $damage points of damage and has $hitPoints left")
        }else{
            lives -= 1
            println("$name lost a life")
        }
    }

    override fun toString(): String {
        return "Name: $name, Hit points: $hitPoints, Lives: $lives"
    }
}