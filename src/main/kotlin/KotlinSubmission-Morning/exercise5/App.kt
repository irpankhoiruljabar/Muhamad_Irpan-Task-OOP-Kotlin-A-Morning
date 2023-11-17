package id.infinitelearning.KotlinSubmission.exercise5

fun main() {

    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */
    val hero = Hero()

    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */

    hero.setProfile("Muhamad Irpan", 22, 168)

    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     */

    hero.profile()

    /**
    Challenge:
    Fantastic Ten -> jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x

    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
     *
     */

*/
    hero.apply {
        repeat(2) { jalan() }
        repeat(4) { lari() }
        repeat(2) { makan() }
        repeat(2) { minum() }
        repeat(7) { lompat() }
        repeat(4) { duduk() }
    }
    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     *
     */

    hero.profile()

}
