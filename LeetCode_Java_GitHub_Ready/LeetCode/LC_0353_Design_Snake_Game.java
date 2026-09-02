// LeetCode 353: Design Snake Game
import java.util.*;

class SnakeGame {
    private final int width;
    private final int height;
    private final int[][] food;
    private int foodIndex = 0;
    private final Deque<Integer> snake = new ArrayDeque<>();
    private final Set<Integer> occupied = new HashSet<>();

    public SnakeGame(int width, int height, int[][] food) {
        this.width = width;
        this.height = height;
        this.food = food;
        snake.offerFirst(0);
        occupied.add(0);
    }

    public int move(String direction) {
        int head = snake.peekFirst();
        int row = head / width;
        int col = head % width;

        if (direction.equals("U")) row--;
        else if (direction.equals("D")) row++;
        else if (direction.equals("L")) col--;
        else col++;

        if (row < 0 || row >= height || col < 0 || col >= width) return -1;

        int newHead = row * width + col;
        int tail = snake.peekLast();

        boolean eating = foodIndex < food.length &&
                food[foodIndex][0] == row &&
                food[foodIndex][1] == col;

        if (!eating) {
            snake.pollLast();
            occupied.remove(tail);
        }

        if (occupied.contains(newHead)) return -1;

        snake.offerFirst(newHead);
        occupied.add(newHead);

        if (eating) foodIndex++;

        return snake.size() - 1;
    }
}
