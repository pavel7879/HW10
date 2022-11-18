public class HW10 {
    public static void main(String[] args) {
        System.out.println("Строки, урок 1.7");
        String phone = "9652385639";
        if (phone.length() == 10) {
            phone = "7" + phone;
        } else {
            throw new RuntimeException("телефон неправильный");
        }
        System.out.println("phone = " + phone);
    }
}