import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> products = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберете номер операции:");
            System.out.println("\t1. Добавить");
            System.out.println("\t2. Показать");
            System.out.println("\t3. Удалить");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    System.out.println("Какую покупку хотите добавить?");
                    try {
                        products.add(scanner.nextLine());
                    } catch (Exception e) {
                        System.out.println("Ошибка");
                    }
                    System.out.println("Итого в списке покупок: " + products.size());
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Список покупок:");
                    for (int i = 0; i < products.size(); i++) {
                        System.out.println(i + 1 + ". " + products.get(i));
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Список покупок:");
                    for (int i = 0; i < products.size(); i++) {
                        System.out.println(i + 1 + ". " + products.get(i));
                    }
                    System.out.println("Какую хотите удалить? Введите номер или название");
                    String removeProduct = scanner.nextLine();
                    try {
                        products.remove(Integer.parseInt(removeProduct) - 1);
                    } catch (Exception e) {
                        products.remove(removeProduct);
                    }
                    System.out.println("Список покупок:");
                    for (String list : products) {
                        System.out.println(list);
                    }
                    System.out.println();
                    break;
                case 4:
                    String itemLower;
                    String queryLower = scanner.nextLine();
                    for (int i = 0; i < products.size(); i++) {
                        itemLower = products.get(i).toLowerCase();
                        queryLower = queryLower.toLowerCase();
                        if (itemLower.contains(queryLower)) {
                            System.out.println(i + 1 + ". " + products.get(i));
                        }
                    }
                    System.out.println();
                    break;
            }
        }
    }
}
