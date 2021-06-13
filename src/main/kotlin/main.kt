const val DISCOUNT = 100 // ������ ��� ���, � ���� ���������� ����� ������� ����� 1000 ������
const val DISCOUNT_MAX_PERCENT = 5 // ������ 5% ��� ���, � ���� ���������� ����� ������� ����� 10000 ������
const val DISCOUNT_MIN_PERCENT = 1 // �������������� ������ 1% ��� ���������� �����������
const val DISCOUNT_START = 1000
const val DISCOUNT_MAX = 10000
const val ITEM_PRICE = 100 // ���������� ��������� ������ �������


fun main() {
    println("������� �������� ��� ���� �������?")
    val itemCount = readLine()!!.toInt()
    println("��� ���������� ����������? (true/false)")
    val regularCustomer = readLine()!!.toBoolean()

    val totalPrice = ITEM_PRICE * itemCount
    val finallyDiscount = if ((DISCOUNT_MAX > totalPrice) && (totalPrice > DISCOUNT_START) && regularCustomer) {
        DISCOUNT.toString() + " ������, � ����� -$DISCOUNT_MIN_PERCENT% �� ����� �������"
    } else if ((DISCOUNT_MAX < totalPrice) && regularCustomer) {
        (DISCOUNT_MAX_PERCENT + DISCOUNT_MIN_PERCENT).toString() + "%"
    } else if ((DISCOUNT_MAX > totalPrice) && (totalPrice > DISCOUNT_START)) {
        DISCOUNT.toString() + " ������"
    } else if (DISCOUNT_MAX < totalPrice) {
        (DISCOUNT_MAX_PERCENT.toString() + "%")
    } else {
        0.toString() + "%"
    }
    0
    println("C����� �������� $finallyDiscount")


}

