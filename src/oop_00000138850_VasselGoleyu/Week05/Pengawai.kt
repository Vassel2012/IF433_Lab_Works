package oop_00000138850_vasselgoleyu.week05

abstract class Pegawai(val nama: String) {

    abstract fun bekerja()

    fun info() {
        println("Nama Pegawai: $nama")
    }
}