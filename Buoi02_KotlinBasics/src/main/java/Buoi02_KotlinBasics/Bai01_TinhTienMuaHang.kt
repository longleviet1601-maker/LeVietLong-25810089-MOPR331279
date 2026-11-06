package Buoi02_KotlinBasics

// Họ tên: Lê Việt Long - MSSV: 25810089
fun main() {
    val soLuong: Int = 5
    val donGia: Double = 120000.0

    // Ép kiểu số lượng sang Double trước khi nhân với đơn giá
    val tienHang = soLuong.toDouble() * donGia
    val thue = tienHang * 0.08
    val tongTien = tienHang + thue

    // In kết quả rõ ràng, có đơn vị tiền tệ
    println("Tien hang: ${tienHang.toLong()} VND")
    println("Thue (8%): ${thue.toLong()} VND")
    println("Tong tien: ${tongTien.toLong()} VND")
}
