package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    try {
        val angka = konversiStringKeInt("satu")
        println("Angka yang diterima: $angka")
    } catch (e: NumberFormatException) {
        println("Terjadi kesalahan: ${e.message}. Pastikan input berupa angka.")
    }

}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    fun konversiStringKeInt(str: String): Int {
        return str.toInt()
    }