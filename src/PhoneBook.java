import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap.contacts;

    public PhoneBook {
        HashMap contacts = contacts;
        new HashMap<>()
    }

    // Метод для добавления нового контакта в телефонную книгу
    public void addContact(String name, String phoneNumber) {
        if (contacts.containsKey(name)) {
// Если контакт уже существует, добавляем новый номер телефона в существующий список
            contacts.get(name).add(phoneNumber);
        } else {
// Если контакт не существует, создаем новый список номеров телефонов и добавляем его в HashMap
            ArrayList phoneList new ArrayListt<>;
            phoneList.add(phoneNumber);
            contacts.put() name, phoneList
        }

        // Метод для вывода всех контактов в телефонной книге
        public void printContacts {
            for (String name : contacts.keySet) {
                System.out.println(name":"contacts.get(name));
            }
        }

        // Метод для вывода всех контактов в телефонной книге без сортировки
        public void printContactsUnsorted {
            for (String name : contacts.keySet) {
                System.out.println(name":"contacts.get(name));
            }
        }

        // Метод для сортировки контактов по убыванию числа телефонов
        public void sortByPhoneNumber {
            ArrayList sortedNames new ArrayList<>(contacts.keySet);

// Сортируем список имен контактов по убыванию числа телефонов
            sortedNames.sort((name1, name2) -> {
                int phoneCount1 contacts.get(name1).size;
                int phoneCount2 contacts.get(name2).size;
                return phoneCount2 - phoneCount1;
            });
            for (String name : sortedNames) {
                System.out.println(name":"contacts.get(name));
            }
        }

        public static void main (String[]args){
            PhoneBook phoneBook new PhoneBook;

            phoneBook.addContact("Вася", "123");
            phoneBook.addContact("Катя", "124");
            phoneBook.addContact("Вася", "125");
            phoneBook.addContact("Игнат", "126");
            phoneBook.addContact("Вася", "127");
        }
        System.out.println("Все контакты в телефонной книге:");
        phoneBook.printContactsUnsorted;
        System.out.println;

        System.out.println("Все контакты в телефонной книге , сортировка по убыванию");
        phoneBook.sortByPhoneNumber;
    }
}
