package Buoi02_KotlinBasics

// Họ tên: Lê Việt Long - MSSV: 25810089
fun main() {
    // Dùng arrayOf để khởi tạo
    val diemSinhVien = arrayOf(7.5, 8.0, 6.5, 9.5, 5.0, 4.5, 8.5, 7.0, 10.0, 6.0)

    var tongDiem = 0.0
    var diemCaoNhat = diemSinhVien[0]
    var diemThapNhat = diemSinhVien[0]

    // Tự viết vòng lặp so sánh từng phần tử
    for (diem in diemSinhVien) {
        tongDiem += diem
        if (diem > diemCaoNhat) {
            diemCaoNhat = diem
        }
        if (diem < diemThapNhat) {
            diemThapNhat = diem
        }
    }

    val diemTrungBinh = tongDiem / diemSinhVien.size

    println("Diem trung binh cua ca lop: $diemTrungBinh")
    println("Diem cao nhat: $diemCaoNhat")
    println("Diem thap nhat: $diemThapNhat")
}