package oop_00000138850_vasselgoleyu.week05

class Dosen(nama: String) : Pegawai(nama) {

    override fun bekerja() {
        println("$nama sedang mengajar mahasiswa.")
    }

    fun mengajar() {
        println("$nama memberikan materi kuliah.")
    }
}