package oop_00000138850_VasselGoleyu.W11

fun panggil_nama(nama: String): String {
    return "Hai $nama"
}

fun String.panggil_mahasiswa(): String {
    var hasil = this.split().joinToString (){

    }
    return "Hello $this"
}

fun main(){
    println(panggil_nama("Toni"))

    println("Tonyyy".panggil_mahasiswa())
}