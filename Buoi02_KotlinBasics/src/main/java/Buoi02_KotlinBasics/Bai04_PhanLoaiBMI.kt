package Buoi02_KotlinBasics

// Họ tên: Lê Việt Long - MSSV: 25810089
fun main() {
    val canNang = 65.0 // kg
    val chieuCao = 1.70 // mét

    // BMI = cân nặng / (chiều cao ^ 2)
    val bmi = canNang / (chieuCao * chieuCao)

    val phanLoai: String
    // Dùng if else if nhiều nhánh
    if (bmi < 18.5) {
        phanLoai = "Gay"
    } else if (bmi < 24.9) {
        phanLoai = "Binh thuong"
    } else if (bmi < 29.9) {
        phanLoai = "Thua can"
    } else {
        phanLoai = "Beo phi"
    }

    println("Chi so BMI cua ban la: %.2f".format(bmi))
    println("Phan loai: $phanLoai")
}