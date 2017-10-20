fun main(args: Array<String>)   //Main function 
{
    val decimal = 18  //Let's  Take a  number for Example
    val octal = DecimalToOctal(decimal)
    println("$decimal in decimal = $octal in octal")   //calling decimal and octal inside "" 
}

fun DecimalToOctal(decimal: Int): Int  // Our main function which converts  decimal to octal 
{ 
    var decimal = decimal
    var octalNumber = 0
    var i = 1

    while (decimal != 0) {
        octalNumber += decimal % 8 * i
        decimal /= 8
        i *= 10
}

    return octalNumber
}
