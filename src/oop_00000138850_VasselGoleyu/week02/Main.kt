package oop_00000138850_VasselGoleyu.week02

package oop_001_johnthor.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("-- APLIKASI PMB UNN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()
    scanner.nextLine() // Membersihkan buffer

    print("Masukkan Jurusan: ")
    val major = scanner.nextLine()

    // Membuat objek Student
    val student = Student(name, nim, major)

    println("\nData Mahasiswa:")
    println("Nama: ${student.name}")
    println("NIM: ${student.nim}")
    println("Jurusan: ${student.major}")
}