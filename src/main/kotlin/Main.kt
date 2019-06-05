fun main(args: Array<String>) {
//   val isa = Player("Isa")
//   isa.weapon = Weapon("Sword",24)
//   val tim = Player("Tim")
//   tim.weapon = Weapon("knife",2)
//    isa.show()
//    tim.show()
//
//    tim.weapon = isa.weapon
//    isa.weapon = Weapon("Spear",48)
//    isa.show()
//    tim.show()
//
//    val redPotion = Loot("Red potion",LootType.POTION,7.50)
//    tim.getLoot(redPotion)
//    val chestArmor = Loot("",LootType.ARMOR,80.00)
//    tim.getLoot(chestArmor)
//    tim.showInventory()
//    println(tim)
//    println(isa)
//    println(redPotion)
//
//    for(i in  1 until 100 step 3 ){
//        if (i%5==0){
//            println("$i is divisible by 3 and 5")
//        }
//    }

    val uglyTroll= Troll("nacha",27,2)
    println(uglyTroll)
    uglyTroll.takeDamage(8)
    println(uglyTroll)

    val vampire = Vampyre("Vlad")
    println(vampire)
    vampire.takeDamage(8)
    println(vampire)

    val dracula = VampyreKing("Dracula")
    println(dracula)

}