class Test<T> {
    void compare(T x, T y) {
        if (x.equals(y)) {
            System.out.println("Similar");
        } else {
            System.out.println("Not similar");
        }
    }

    public static void main(String[] args) {
        Test<Integer> t1 = new Test<>();
        t1.compare(10, 20);   // Output: Not similar
        t1.compare(30, 30);   // Output: Similar

        Test<String> t2 = new Test<>();
        t2.compare("hello", "hello"); // Output: Similar
        t2.compare("hi", "bye");      // Output: Not similar
    }
}
