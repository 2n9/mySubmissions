import kotlin.jvm.JvmStatic
import Main.Calc
import java.util.*

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        Calc().done()
    }

    internal class Calc {
        var s = Scanner(System.`in`)
        var st = System.currentTimeMillis()
        fun nl(): Long {
            return s.nextLong()
        }

        fun ni(): Int {
            return s.nextInt()
        }

        fun nd(): Double {
            return s.nextDouble()
        }

        fun ns(): String {
            return s.next()
        }

        fun nli(): String {
            return s.nextLine()
        }

        fun a(o: Any?) {
            print(o)
        }

        fun `as`(o: Any) {
            print("$o ")
        }

        fun ab(o: Any?) {
            println(o)
        }

        fun ab() {
            println()
        }

        fun aba(vararg o: Any) {
            var s = ""
            for (j in o) s = "$s$j "
            println(s.replaceFirst(".$".toRegex(), ""))
        }

        fun t(): Long {
            return System.currentTimeMillis() - st
        }

        fun sum(vararg i: Int): Int {
            return Arrays.stream(i).sum()
        }

        fun sum(vararg d: Double): Double {
            return Arrays.stream(d).sum()
        }

        fun sum(vararg l: Long): Long {
            return Arrays.stream(l).sum()
        }

        fun ascending(vararg i: Int): IntArray {
            Arrays.sort(i)
            return i
        }

        fun ascending(i: List<Int>): Array<Int> {
            val k = i.toTypedArray()
            Arrays.sort(k)
            return k
        }

        fun descending(vararg i: Int): IntArray {
            var i = i
            i = ascending(*i)
            var f = 0
            var l = i.size - 1
            while (f < l) {
                val t = i[f]
                i[f] = i[l]
                i[l] = t
                f++
                l--
            }
            return i
        }

        fun descending(i: List<Int>): Array<Int> {
            val k = ascending(i)
            var f = 0
            var l = k.size - 1
            while (f < l) {
                val t = k[f]
                k[f] = k[l]
                k[l] = t
                f++
                l--
            }
            return k
        }

        fun match(vararg i: Int): Boolean {
            for (k in i) if (i[0] != k) return false
            return true
        }

        fun cc(s: String, a: Char): Long {
            var i: Long = 0
            var t: Char
            for (j in 0 until s.length) {
                if (s[j] == a) i++
            }
            return i
        }

        fun tt() {
            a("Time " + t() + "ms")
        }

        fun done() {
            val sc = Scanner(System.`in`)
            println("================================")
            for (i in 0..2) {
                val s1 = sc.next()
                val x = sc.nextInt()
                println(String.format("%03d", x))
                //Complete this line
            }
            println("================================")
        }
    }
}