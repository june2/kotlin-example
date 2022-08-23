package com.example.annotation

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD)
annotation class NiceVar

data class SampleClass(
    var a: Int,
    var b: String,
    @NiceVar var c: Int,
    @NiceVar var d: String
)

fun main() {

    val obj1 = SampleClass(10, "foo", 20, "bar")

    printAllVars(obj1)
    printNiceVars(obj1)

}

fun printAllVars(obj: Any) {
    println(obj.toString())
}

fun printNiceVars(obj: Any) {
    obj.javaClass.declaredFields.forEach { f ->
        if (f.isAnnotationPresent(NiceVar::class.java)) {
            f.isAccessible = true
            if (f.isAccessible)
                println("${f.name} ${f.get(obj)}")
        }
    }
}