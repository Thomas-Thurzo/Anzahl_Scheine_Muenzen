fun main() {

    var betrag: Int
    val ausgabe: Int

    // Einlesen des Geldbetrages über die Konsole
    println("Bitte einen ganzzahligen Geldbetrag eingeben: ")
    val eingabe = readln()

    // Überprüfung der Eingabe und Funktion Aufruf
    if (eingabe.toIntOrNull() != null){
        println("Eingabe war erfolgreich")
        betrag = eingabe.toInt()
        ausgabe = berechnungScheine(betrag)
        println("Es werden insgesamt $ausgabe Scheine und Münzen benötigt")
    }
    else{
        println("Bitte einen ganzzahligen Wert eingeben!")
    }
}

fun berechnungScheine(betrag: Int): Int{
    val scheine = arrayOf(200, 100, 50, 20, 10, 5, 2, 1)
    var betrag = betrag
    var counter = 0
    var rest = 0

    for (element in scheine) {
        if (betrag >= element) {
            counter += betrag / element
            rest = betrag % element
            betrag = rest
        }
    }
    return counter
}