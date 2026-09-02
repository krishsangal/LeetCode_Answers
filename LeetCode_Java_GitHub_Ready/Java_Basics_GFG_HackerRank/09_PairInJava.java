class Pair<K, V> {
    K first;
    V second;

    Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }
}

public class PairInJava {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1, "Java");
        System.out.println(pair.first + " " + pair.second);
    }
}
