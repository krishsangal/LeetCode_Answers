// LeetCode 631: Design Excel Sum Formula
import java.util.*;

class Excel {
    private final int[][] values;
    private final Map<Integer, Map<Integer, Integer>> formulas = new HashMap<>();
    private final int width;

    public Excel(int height, char width) {
        this.width = width - 'A' + 1;
        values = new int[height][this.width];
    }

    public void set(int row, char column, int val) {
        int key = key(row, column);
        formulas.remove(key);
        values[row - 1][column - 'A'] = val;
    }

    public int get(int row, char column) {
        int key = key(row, column);

        if (!formulas.containsKey(key)) {
            return values[row - 1][column - 'A'];
        }

        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : formulas.get(key).entrySet()) {
            int cell = entry.getKey();
            int r = cell / width;
            int c = cell % width;
            sum += entry.getValue() * get(r + 1, (char) ('A' + c));
        }
        return sum;
    }

    public int sum(int row, char column, String[] numbers) {
        Map<Integer, Integer> formula = new HashMap<>();

        for (String token : numbers) {
            if (token.contains(":")) {
                String[] parts = token.split(":");
                int r1 = row(parts[0]), c1 = col(parts[0]);
                int r2 = row(parts[1]), c2 = col(parts[1]);

                for (int r = r1; r <= r2; r++) {
                    for (int c = c1; c <= c2; c++) {
                        int cell = r * width + c;
                        formula.put(cell, formula.getOrDefault(cell, 0) + 1);
                    }
                }
            } else {
                int cell = row(token) * width + col(token);
                formula.put(cell, formula.getOrDefault(cell, 0) + 1);
            }
        }

        formulas.put(key(row, column), formula);
        return get(row, column);
    }

    private int row(String s) {
        return Integer.parseInt(s.substring(1)) - 1;
    }

    private int col(String s) {
        return s.charAt(0) - 'A';
    }

    private int key(int row, char column) {
        return (row - 1) * width + (column - 'A');
    }
}
