package oop_001_VasselGoleyu.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== SISTEM PERPUSTAKAN ===")

    print("Masukkan judul buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan nama peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan durasi pinjam (hari, default 7): ")
    val durationInput = scanner.nextLine()
    val loanDuration = if (durationInput.isBlank()) 7 else durationInput.toInt()

    // Membuat objek Loan
    val loan = Loan(bookTitle, borrower, loanDuration)
    loan.displayLoanInfo()

    // Cek apakah ada denda
    val fine = loan.calculateFine()
    if (fine > 0) {
        println("PERINGATAN: Terlambat mengembalikan! Denda: Rp $fine")
    } else {
        println("Tidak ada denda. Silakan kembalikan tepat waktu!")
    }
}
