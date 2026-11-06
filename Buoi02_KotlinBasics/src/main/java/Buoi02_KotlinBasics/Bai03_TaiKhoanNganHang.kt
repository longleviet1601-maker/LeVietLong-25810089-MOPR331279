package Buoi02_KotlinBasics

// Họ tên: Lê Việt Long - MSSV: 25810089
fun main() {
    // Dùng val cho số dư ban đầu vì giá trị này dùng để đối chiếu, không được phép thay đổi.
    val soDuBanDau = 5000000

    // Dùng var cho số dư hiện tại vì giá trị này sẽ bị biến đổi qua các giao dịch gửi/rút.
    var soDuHienTai = soDuBanDau

    println("So du ban dau: $soDuHienTai")

    // Giao dịch gửi thêm 2 triệu
    soDuHienTai += 2000000
    println("Sau khi gui 2.000.000, so du hien tai: $soDuHienTai")

    // Giao dịch rút 1.5 triệu
    soDuHienTai -= 1500000
    println("Sau khi rut 1.500.000, so du hien tai: $soDuHienTai")
    println("Doi chieu so du goc ban dau van la: $soDuBanDau")
}