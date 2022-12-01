class Day1 {
    private val day = "day1"
    private val input = FileUtil.getInput("day1-input")

    private fun getCaloriesByElf(): List<Int> {
        val calories = mutableListOf<Int>()
        var total = 0

        input.forEach {
            if (it.isNotEmpty()) {
                total += it.toInt()
            } else {
                calories.add(total)
                total = 0
            }
        }

        return calories
    }

    private fun part1(): Int {
        return getCaloriesByElf().max()
    }

    private fun part2(): Int {
        return getCaloriesByElf().sorted().takeLast(3).sum()
    }

    init {
        println("============= $day output start =============")
        println(part1())
        println(part2())
        println("============= $day output end =============")
    }
}
