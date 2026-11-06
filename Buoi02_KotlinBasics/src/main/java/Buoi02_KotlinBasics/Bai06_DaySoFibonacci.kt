package Buoi02_KotlinBasics

// Họ tên: Lê Việt Long - MSSV: 25810089
fun main() {
    var a = 0
    var b = 1

    // Dùng vòng lặp for để sinh dãy số, không dùng đệ quy
    for (i in 0..20) {
        if (a >= 100) break // Dừng lại khi số Fibonacci >= 100

        println("Vi tri $i: $a")

        val next = a + b
        a = b
        b = next
    }
}