fun main(args: Array<String>)  //Main Function
{
    val octal = 18
    val decimal = OctalToDecimal(octal)  
    println("$octal in octal = $decimal in decimal")   //This is the method to print variable inside Quotes
}

fun OctalToDecimal(octal: Int): Int  // Conversion Function  With Return type Int
{
    var octal = octal 
    var decimalNumber = 0
    var i = 0

    while (octal != 0) {
        decimalNumber += (octal % 10 * Math.pow(8,i).toInt())    //Easy Peasy right ?  We need to Convert The Math.pow to Integer.
        ++i
        octal /= 10
    }

    return decimalNumber                   //No Semicolon Weeeeee!!
}
