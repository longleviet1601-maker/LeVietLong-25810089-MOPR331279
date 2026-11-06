package Buoi02_KotlinBasics

// Họ tên: Lê Việt Long - MSSV: 25810089
fun main() {
    // Đoạn đếm ngược bắt buộc dùng while
    var counter = 10
    println("--- Bat dau dem nguoc ---")
    while (counter >= 1) {
        println(counter)
        counter--
    }

    // Đoạn in dòng cố định bắt buộc dùng repeat
    println("--- In lap co dinh ---")
    repeat(5) {
        println("Day la mot dong co dinh duoc in ra tu repeat.")
    }

    // Ghi chú: Nên dùng while khi số lần lặp phụ thuộc vào một điều kiện cụ thể hoặc có sự thay đổi trạng thái phức tạp, và dùng repeat khi chỉ đơn thuần muốn thực hiện một khối mã với số lần biết trước cực kỳ rõ ràng.
}