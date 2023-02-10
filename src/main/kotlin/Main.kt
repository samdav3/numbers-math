import java.text.DecimalFormat

fun main(args: Array<String>) {
    println("This program will ask you to enter the cost of your items, until you enter 0.")
    println("Enter the cost of your items: ")
    readln().toDouble()
    var total = 0.0
    val minCost = 0.0
    do {
        println("Enter the cost of your items: ")
        var cost = readln().toDouble()
        cost += cost
        total += cost
    } while (cost > minCost)
    var tax = .025
    tax *= total
    var taxFormat = DecimalFormat("$###,###,###.00")
    var taxTotal = taxFormat.format(tax)
    println("Total taxes: $taxTotal")
    total += tax
    var formatTax = DecimalFormat("$###,###,###.00")
    var totalTax = formatTax.format(total)
    println("Total + taxes: $totalTax")
    var tip = .175
    tip *= total
    total += tip
    var formatTip = DecimalFormat("$###,###,###.00")
    var tipTotal = formatTip.format(tip)
    println("We recommend leaving a 17.5% tip which will leave a tip of: $tipTotal")
    total += tip
    var totalFormat = DecimalFormat("$###,###,###.00")
    var totalTotal = totalFormat.format(total)
    println("Your total cost will be: $totalTotal")
}
