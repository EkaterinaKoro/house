//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                // Начальная сумма на счету клиента
                double initialBalance = 200.0;
                // Сумма пополнения
                double topUpAmount = 1200.0;

                // Вычисление бонусов
                double bonus = (topUpAmount > 1000) ? (int)(topUpAmount / 100) : 0;

                // Итоговая сумма на счету клиента
                double finalBalance = initialBalance + topUpAmount + bonus;

                // Вывод результатов
                System.out.println("Начальная сумма на счету: " + initialBalance + " рублей");
                System.out.println("Сумма пополнения: " + topUpAmount + " рублей");
                System.out.println("Количество бонусных рублей: " + bonus);
                System.out.println("Итоговая сумма на счету: " + finalBalance + " рублей");
            }
        }








