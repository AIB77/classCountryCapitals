import kotlin.random.Random

fun main(){

    class Country (var name:String,var capital:String){
        fun print(){
            println("The Capital of $name is $capital\n")
        }
    }

    val countries= arrayListOf<Country>()
    countries.add(Country("Saudi Arabia","Riyadh"))
    countries.add(Country("Qatar","Doha"))
    countries.add(Country("United Arab Emirates","Abu Dhabi"))
    countries.add(Country("Bahrain","Manama"))
    countries.add(Country("Egypt","Cairo"))
    countries.add(Country("Kuwait","Kuwait City"))
    countries.add(Country("Jordan","Amman"))
    countries.add(Country("Oman","Muscat"))
    countries.add(Country("United Kingdom","London"))
    countries.add(Country("Turkey","Ankara"))

    var count=0
    var correctAnswers=0

    var countAllCountries=0
    val norepeat=arrayListOf<Int>()

    while(true) {
        while(count<3&&countAllCountries<10){
            var random:Int
            while(true) {
                random = Random.nextInt(10)
                if(!norepeat.contains(random))
                    break
            }
            norepeat.add(random)
            println("Let Play Country and Capital Game.you have to guess which capital -_-")
            print("Guess Tha Capital of this country ${countries[random].name}: ")
            val capital= readLine()!!
            if(capital.isEmpty()){
                println("\nPlease Enter Valid Name\n")
                continue
            }
            else if(countries[random].capital==capital){
                println("That Correct")
                countries[random].print()
                correctAnswers++
            }
            else {
                println( "ohh Wrong:(")
                countries[random].print()
            }
            count++
            countAllCountries++
            if(count>=3||countAllCountries>=10)
                println("You Answered $correctAnswers Correct Answers out of $count\n")
        }


        print("Would You Like to Play Again (y/n): ")
        val answer= readLine()!!
        if(answer=="n"){
            println("Good Bye")
            break
        }
        else if(answer=="y")
            count=0

    }
}