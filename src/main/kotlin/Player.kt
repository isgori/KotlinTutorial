

class Player (val name:String, var level: Int = 1, var lives: Int = 3 ,var score: Int = 0 ) {

    var weapon: Weapon = Weapon("Fist",1)

    private val inventory = ArrayList<Loot>()

    fun show(){

        if (lives >0){
            println("$name is alive")
        }else{
            println("$name is dead")
        }

    }

    fun getLoot(item : Loot){
        inventory.add(item)
    }

    fun droopLoot(item: Loot): Boolean{
        return if(inventory.contains(item)){
            inventory.remove(item)
            true
        }else{
            false
        }
    }

    fun droopLoot(item :String ) : Boolean{
        println("$item will be dropped")
        return inventory.removeIf { it.name == item }
    }

    override fun toString(): String {
        return("""
            name: $name
            lives: $lives
            level: $level
            score: $score

            Weapon
        """ + weapon.toString())
    }

    fun showInventory(){
        println("$name Inventory")
        for (item in inventory){
         println(item)
        }
        println("==========================")
    }

}