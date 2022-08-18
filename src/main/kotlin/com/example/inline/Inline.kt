package com.example.inline

class Inline {
    inline fun calculator(x: Int, y: Int) = x + y

    /**
        public final void example() {
            byte x$iv = 10;
            int y$iv = 20;
            int $i$f$calculator = false;
            int var10000 = x$iv + y$iv;
        }
     */
    fun example() {
        val total = calculator(10, 20)
    }
}
