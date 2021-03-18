fun main(args: Array<String>) {
/*
    Challenge 1: Take a monthly salary of 3404 euro. Convert this to a weekly salary.

    Challenge hint: Use two variables and the print line function to show this in the console.
 */
//    println("------Challenge 1-------------------------------")
    val MaandSalaris: Int = 3404
    val WeekSalaris: Int = MaandSalaris/ 4
    println("Mijn maandsalaris is: $WeekSalaris")

/*
    Challenge 2: Try to figure out why the code under this comment is will not work
*/
    var name: String = "Mohamed"
    println("Eerste naam is: $name")

    name = "Karim"
    println("Tweede naam is: $name")

/*
    Challenge 3: Create the following:
    - Two variables and name them z and k. Give them the values 8 and 5.
    - Multiply the two variables with each other.
    - Divide the two by 3.5.
    - Refactor the 'z' variable to 'car' and 'k' to horsepower.
    - Print the values to the console.
*/
    var car: Int = 8
    var horsepower: Int = 5
    var multiply = (car*horsepower)
    var divide = (multiply/3.5)
    println("Hier wordt het result aangegven van het variable: " +divide)

/*
    Challenge 4: Use string interpolation

    Taif like to cook in the weekends. In the morning he usually uses 2 eggs.
    After whisking the eggs he then uses 1 teaspoon sumac and 1.5 teaspoons salt.
    Those are mixed with the eggs and then 3 teaspoons of black pepper are thrown
    in the mix. Cooking that in an ordinary frying pan for 5 minutes results in a
    great omelette.

    - The text below has some information in them that can be extracted
    and printed using string interpolation.
    - Print three sentences using string interpolation and information in the
    above anecdote.

    Challenge hint: Search the internet for Kotlin string interpolation and
    you'll find many examples. Also start making variables to store the information.
 */


    val eggs: Int= 2
    val teaspoon_sumak: Int = 1
    val teaspoon_salt: Double = 1.5
    val teaspoon_black: Int = 3
    println("Number of eggs: $eggs" +
            " Number of teaspoon_sumak: $teaspoon_sumak" +
            " Number of teaspoon_salt: $teaspoon_salt" +
            " Number of teaspoon_black: $teaspoon_black")

    /*

    Challenge 5:

    Copy and paste the variables in challenge 4 and paste them here.
    Kotlin knows has something called type inference. Change the code
    so that Kotlin uses this functionality.
     */

    eggs
    teaspoon_sumak
    teaspoon_salt
    teaspoon_black

    println("Number of eggs: $eggs" +
            " Number of teaspoon_sumak: $teaspoon_sumak" +
            " Number of teaspoon_salt: $teaspoon_salt" +
            " Number of teaspoon_black: $teaspoon_black")

    /*
    Challenge 6:

    Create a Kotlin switch case. Read the following anecdote.

    When driving in an urban area, the maximum speed is 50 km/h.
    When driving under 50 km/h that means you're driving slow.
    When driving faster than 50 km/h you're driving too fast.

    Write a switch case with three cases.
    One case when you're driving exactly 50 prints a motivating line such as "great job!"
    One case when you're driving to slow that prints something like "you should a little faster"
    One case when you're driving to fast that prints a line that says that you should slow down.

    You can make up your own lines.
    */
    println("------Challenge 6-------------------------------")

    println("how speed do you using now?")
    val speed = readLine()!!.toInt()
    print("youre speed is: $speed")


    val faster = (speed < 50)
    val slow = (speed > 50)


    if (speed == 50) {
        println(
            " Great job!")
    }else if (faster) {
        println(" You should a little faster")
    } else if (slow) {
        println(" You should slow down")
    }
    /*
    Bonus round:

    Take a look at challenge 6. Adjust the code that when you're driving too slow or too fast,
    it prints how much faster or slower you have to go to reach 50 km/h.
     */
}