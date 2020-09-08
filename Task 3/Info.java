package task3phone;

import java.util.Arrays;
import java.util.List;

public class Info {
  public static void main(String[] args) {
        Phone xPhone = new Phone("+7(499)00-00-01", "XIAOMI INK.", 200);
        Phone iPhone = new Phone("+7(499)00-00-02", "Apple INK", 250);
        Phone hPhone = new Phone("+7(499)00-00-03", "Huawei INK", 150);
        List<Phone> phones = Arrays.asList(xPhone, iPhone, hPhone);
        for (Phone phone : phones) {
            System.out.println(phone);
            phone.receiveCall("Mary");
            System.out.println(phone.getNumber());
        }
        iPhone.receiveCall("Alice", "+7(499)00-00-00");
        xPhone.sendMessage("+7(499)00-00-03", "+7(499)00-00-02", "+7(499)00-00-01");
    }
}
