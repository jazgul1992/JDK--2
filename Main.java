public class Main {
    public static void main(String[] args) {
        Pair<Integer, Integer> intPair = new Pair<>(6, 7);
        System.out.println("Сумма пары целых чисел: " + PairUtils.combine(intPair)); // Вывод: 13.0

        Pair<String, String> stringPair = new Pair<>("Здравствуй, ", "Учитель!");
        System.out.println("Конкатенация строки: " + PairUtils.combine(stringPair)); // Вывод: Hello, World!

        Pair<Integer, String> mixedPair = new Pair<>(55, " Ответ");
        System.out.println("Конкатенация разных типов: " + PairUtils.combine(mixedPair)); // Вывод: 55 Ответ
    }
}
