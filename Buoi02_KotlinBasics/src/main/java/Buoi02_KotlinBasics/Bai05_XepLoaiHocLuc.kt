package Buoi02_KotlinBasics

// Họ tên: Lê Việt Long - MSSV: 25810089
fun main() {
    val diemTrungBinh = 8.2

    // Dùng when kết hợp range để phân loại
    val xepLoai = when (diemTrungBinh) {
        in 9.0..10.0 -> "Xuat sac"
        in 8.0..8.99 -> "Gioi"
        in 6.5..7.99 -> "Kha"
        in 5.0..6.49 -> "Trung binh"
        in 0.0..4.99 -> "Yeu"
        else -> "Diem khong hop le"
    }

    println("Diem: $diemTrungBinh - Xep loai: $xepLoai")
}