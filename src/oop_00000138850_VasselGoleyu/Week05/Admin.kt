package oop_00000138850_vasselgoleyu.week05

class Admin(nama: String) : Pegawai(nama) {

    override fun bekerja() {
        println("$nama sedang mengurus administrasi.")
    }

    fun mengelolaData() {
        println("$nama sedang mengelola data kampus.")
    }
}