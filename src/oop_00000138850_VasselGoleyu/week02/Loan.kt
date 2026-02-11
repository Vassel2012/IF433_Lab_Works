package oop_00000138850_VasselGoleyu.week02

package oop_001_johnthor.week02

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 7  // Default: 7 hari
) {

    // Method untuk menghitung denda
    fun calculateFine(): Int {
        return if (loanDuration > 7) {
            (loanDuration - 7) * 1000
        } else {
            0
        }
    }

    // Method untuk menampilkan info peminjaman
    fun displayLoanInfo() {
        println("\n=== Informasi Peminjaman ===")
        println("Judul Buku: $bookTitle")
        println("Peminjam: $borrower")
        println("Durasi Pinjam: $loanDuration hari")
        println("Denda: Rp ${calculateFine()}")
        println("=============================")
    }
}