package Buoi02_KotlinBasics

// Họ tên: Lê Việt Long - MSSV: 25810089
fun xuLyTenKhachHang(tenKhachHang: String?) {
    // 1. Dùng safe call để lấy độ dài chuỗi an toàn
    val doDai = tenKhachHang?.length
    println("Do dai ten khach hang (dung safe call): $doDai")

    // 2. Dùng toán tử Elvis để cấp tên mặc định khi biến rỗng
    val tenHienThi = tenKhachHang ?: "khach vang lai"
    println("Ten hien thi (dung Elvis): $tenHienThi")

    // 3. Minh hoạ toán tử hai dấu chấm than (Not-null assertion operator)
    /*
       Ghi chú: Toán tử !! sẽ ép hệ thống hiểu rằng biến này chắc chắn không null.
       Cách này có thể gây lỗi văng app (NullPointerException) khi chạy nếu biến thực sự bị rỗng.
       Chỉ nên dùng khi chắc chắn tuyệt đối rằng biến lúc đó đang mang giá trị hợp lệ.
    */
    try {
        val doDaiBatBuoc = tenKhachHang!!.length
        println("Do dai ten (dung !!): $doDaiBatBuoc")
    } catch (e: NullPointerException) {
        println("Loi: Da co dung toan tu !! tren mot bien null.")
    }
}

fun main() {
    println("--- Test voi ten hop le ---")
    xuLyTenKhachHang("Tran Trong Tri")

    println("\n--- Test voi ten null ---")
    xuLyTenKhachHang(null)
}