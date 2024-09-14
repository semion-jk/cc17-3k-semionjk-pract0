fun main() {

    val pounds = 300.0
    val miles = 21.0
    val fahrenheit = 9900.0
    val studentAges = listOf(22, 19, 28, 20, 18, 21, 23, 25, 19, 21)

    val kilograms = pounds * 0.453592
    val kilometers = miles * 1.60934
    val celsius = (fahrenheit - 32) * 5 / 9
    val averageAge = studentAges.average()

    println("Weight in Pounds (lbs): $pounds")
    println("Weight converted to Kilograms (kg): $kilograms")

    println("Length in Miles (mi): $miles")
    println("Length in Kilometers (km): $kilometers")

    println("Temperature in Fahrenheit (°F): $fahrenheit")
    println("Temperature in Celsius (°C): $celsius")

    println("Age of Student 1: ${studentAges[0]}")
    println("Age of Student 2: ${studentAges[1]}")
    println("Age of Student 3: ${studentAges[2]}")
    println("Age of Student 4: ${studentAges[3]}")
    println("Age of Student 5: ${studentAges[4]}")
    println("Age of Student 6: ${studentAges[5]}")
    println("Age of Student 7: ${studentAges[6]}")
    println("Age of Student 8: ${studentAges[7]}")
    println("Age of Student 9: ${studentAges[8]}")
    println("Age of Student 10: ${studentAges[9]}")
    println("The average age of the students is: $averageAge")

    val heroName = "Frodo Baggins"
    val villainName = "Sauron"
    val swordName = "Sting"
    val ringName = "One Ring"
    val locationName = "Mount Doom"

    val story = """
    The hobbit $heroName embarked on a perilous journey to destroy the evil $villainName and his Dark Lord army. 
    Armed with the magical sword $swordName, Frodo sought to cast the One Ring into the fiery depths of $locationName.
    Along the way, he faced countless dangers and encountered allies and enemies alike.
    With the help of his loyal companions, Frodo finally reached $locationName and fulfilled his destiny.
    """

    println(story)
}
