public static <T> Queue<T> copyQueue(Queue<T> q) {
    Queue<T> copy = new Queue<>();
    while (!q.isEmpty()) {
        T x = q.remove();
        copy.insert(x);
    }
    return copy;
}

public static double averageQueue(Queue<T> q) {
    if (q.isEmpty()) return 0.0;

    double sum = 0;
    int count = 0;

    while (!q.isEmpty()) {
        int x = q.remove();
        sum += x;
        count++;
    }

    return sum / count;
}

public static int countDivisible(Queue<Integer> q, int n) {
    int count = 0;

    while (!q.isEmpty()) {
        int x = q.remove();
        if (x % n == 0) count++;
    }

    return count;
}

public static boolean dividesAny(Queue<Integer> q1, Queue<Integer> q2) {
    while (!q1.isEmpty()) {
        int x = q1.remove();
        boolean divides = false;

        for (Integer y : q2) {
            if (y % x == 0) {
                divides = true;
                break;
            }
        }

        if (!divides) return false;
    }

    return true;
}

public static boolean appearsInSequence(Queue<Integer> q, int value) {
    if (q.isEmpty()) return false;

    int prev = q.remove();
    int count = 0;
    if (prev == value) count = 1;

    while (!q.isEmpty()) {
        int curr = q.remove();
        if (curr == value) {
            count++;
            if (count > 1) return true;
        } else {
            count = 0;
        }
        prev = curr;
    }

    return false;
}
