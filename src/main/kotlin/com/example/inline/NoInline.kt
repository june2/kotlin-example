package com.example.inline

class NoInline {
    fun calculator(x: Int, y: Int) = x + y

    /**
        public final class NoInline {
            public final int calculator(int x, int y) {
                return x + y;
            }
            public final void example() {
                int total = this.calculator(10, 20);
            }
        }
     **/
    fun example() {
        val total = calculator(10, 20)
    }
}
