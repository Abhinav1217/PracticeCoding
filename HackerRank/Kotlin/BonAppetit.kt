object BonAppetit {


    fun bonAppetit(bill: Array<Int>, k: Int, b: Int): String {

        var amount:Int = 0
        for (i in bill.indices){
            if (i != k) {
                amount += bill[i]
            }
        }

        amount = amount / 2

        if (amount == b){
            return ("Bon Appetit")
        } else {
            return (b - amount).toString()
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {

        // var n:Int // number of item ordered
        var k:Int // 0 based index that anna didn't eat
        var bill:Array<Int> // Array of cost of each item
        var b:Int // Amount of money by Contributed

        println("Scenerio 0")
        bill = arrayOf(2,4,6)
        k = 2
        b = 6
        println(bonAppetit(bill, k, b)) // 3

        println("Scenerio 1")
        bill = arrayOf(3,10,2,9)
        k = 1
        b = 12
        println(bonAppetit(bill, k, b)) // 5

        println("Scenerio 2")
        bill = arrayOf(3, 10, 2, 9)
        k = 1
        b = 7
        println(bonAppetit(bill, k, b)) // Bon Appetit


    }
}
