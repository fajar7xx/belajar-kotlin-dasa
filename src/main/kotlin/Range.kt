fun main(){

//    slide
//    https://docs.google.com/presentation/d/14E169Dpd1q8R7EKxevYitZM8nBoAh5u4HfVJ8YKR1UU/edit
    val range = 0..1000

    println(range)
    println(range.count())
    println(range.contains(500))
    println(range.contains(9999))
    println(range.last)
    println(range.first)
    println(range.step)

    //range terbali
    val rangeTerbalik = 999 downTo 0
    println(rangeTerbalik)
    println(rangeTerbalik.count())
    println(rangeTerbalik.contains(500))
    println(rangeTerbalik.contains(9999))
    println(rangeTerbalik.last)
    println(rangeTerbalik.first)
    println(rangeTerbalik.step)

    val rangeStep3 = 1..99 step 3
    println(rangeStep3)
    println(rangeStep3.count())
    println(rangeStep3.contains(500))
    println(rangeStep3.contains(9999))
    println(rangeStep3.last)
    println(rangeStep3.first)
    println(rangeStep3.step)
}