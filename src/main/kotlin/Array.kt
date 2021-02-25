fun main() {
    val members: Array<String> = arrayOf("Fajar", "Setiawan", "Siagian")
    val values: Array<Byte> = arrayOf(100, 90, 95)
    val balances: Array<Int> = arrayOf(10_000, 20_000, 99_909)

//    akses data pada array
    val fajar: String = members[0]
    var setiawan: String = members.get(1)
    var siagian: String = members.get(2)

//    mengganti nilai pada array
    members.set(0, "Gigi Hadid")

    println(members[0])

    println(balances[0])
    println(balances[1])
    println(balances[2])

//    array nullable
//    setelah string ada tanda ? artinya boleh null
//    wajib mengisi jumlah arraynya
    val teman: Array<String?> = arrayOfNulls(5)
    teman.set(0, null)
    teman.set(1, "Danil")
    teman.set(2, "Diki")
    teman.set(3, "Fani")
    teman.set(4, null)

    println(teman[0])

}

