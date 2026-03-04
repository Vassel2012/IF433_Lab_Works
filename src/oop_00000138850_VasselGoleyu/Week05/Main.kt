package oop_00000138850_vasselgoleyu.week05

fun main() {

    val daftarPegawai: List<Pegawai> = listOf(
        Dosen("Alexander"),
        Admin("Budi")
    )

    for (pegawai in daftarPegawai) {

        pegawai.info()
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> pegawai.mengajar()
            is Admin -> pegawai.mengelolaData()
        }

        println("--------------------")
    }
}