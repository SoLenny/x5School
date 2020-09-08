package phone;

import java.util.ArrayList;
import java.util.List;

public class Info {
  public static void main(String[] args) {
        Phone xPhone = new Phone("+7(499)00-00-01", "XIAOMI INK.", 200);
        Phone iPhone = new Phone("+7(499)00-00-02", "Apple INK", 250);
        Phone hPhone = new Phone("+7(499)00-00-03", "Huawei INK", 150);
        List<Phone> phones = new ArrayList<>();
        phones.add(xPhone);
        phones.add(iPhone);
        phones.add(hPhone);
        for (Phone phone : phones) {
            System.out.println(phone);
            phone.receiveCall("Mary");
            System.out.println(phone.getNumber());
        }
        iPhone.receiveCall("Alice", "+7(499)00-00-02 ");
        xPhone.sendMessage("Сообщения для +7(499)00-00-03,", "+7(499)00-00-02,", "+7(499)00-00-01");
    }
}
