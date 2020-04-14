object PdfViewer {
    fun designerPdfViewer(h: Array<Int>, word: String): Int {
        var height = 0 // Height should be positive non-zero integer
        var ascii:Int
        for (char in word){
            ascii = h[char.toInt() - 97]
            // 'a' is 97 therefore
            if (ascii > height){ height = ascii }
        }

        return height*word.length

    }

    @JvmStatic
    fun main(args: Array<String>) {
        var h:Array<Int> // Height of each letter

        var word:String // Letter


        h = arrayOf(1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5)
        word = "abc"
        println("Scenerio 1: " + designerPdfViewer(h, word))    // 9


        h = arrayOf(1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,7)
        word = "zaba"
        println("Scenerio 2: " + designerPdfViewer(h, word))    // 28
    }
}
