package Buoi02_KotlinBasics

//Họ tên: Lê Việt Long - MSSV: 25810089
fun main() {
    // Khởi tạo danh sách bằng mutableListOf
    val danhSachSach = mutableListOf("So do", "De men phieu luu ky", "Mat biec", "Dat rung phuong Nam", "Canh dong bat tan")

    println("Danh sach ban dau:")
    println(danhSachSach)

    // Thêm hai cuốn sách mới
    danhSachSach.add("Tuoi tre dang gia bao nhieu")
    danhSachSach.add("Cho toi xin mot ve di tuoi tho")

    // Xoá một cuốn theo tên
    danhSachSach.remove("Mat biec")

    // Dùng hàm sắp xếp có sẵn của Kotlin
    danhSachSach.sort()

    println("\nDanh sach sau khi them, xoa va sap xep (theo thu tu chu cai):")
    println(danhSachSach)
}