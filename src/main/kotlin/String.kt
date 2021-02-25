fun main() {
    var firstName: String = "Fajar"
    var lastName: String = "Siagian"
    var fullName: String = "Fajar Setiawan Siagian"
    var fullAddress: String = """
        ,Jalan Makmur
        ,Desa Sambirejo
        ,Kab Deli Serdang
    """.trimMargin(",")

    var namaLengkap: String = firstName + " " + lastName

//    operasi beberapa string yang di anjurkan oleh kotlin
    var desc: String = "Total $firstName char = ${firstName.length}"

    println(firstName)
    println(lastName)
    println(fullName)
    println(fullAddress)
    println(namaLengkap)
    println(desc)
}