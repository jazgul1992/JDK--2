class PairUtils {
    public static <T1, T2> String combine(Pair<T1, T2> pair) {
        T1 first = pair.getFirst();
        T2 second = pair.getSecond();

        // Если оба элемента - числа, возвращаем их сумму
        if (first instanceof Number && second instanceof Number) {
            double sum = ((Number) first).doubleValue() + ((Number) second).doubleValue();
            return String.valueOf(sum);
        }
        // В остальных случаях конкатенируем элементы как строки
        else {
            return first.toString() + second.toString();
        }
    }
}
