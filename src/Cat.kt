class Cat (private val name: String, private var age: Int, var weightIn: Int) {

    var weight = weightIn
        private set

    fun walk(distance: Int) : Boolean {
        if (weight - distance >= 5) {
            weight -= distance
            return true
        }
        return false
    }

    fun eat() : Boolean {
        if (weight <= 20) {
            weight++
            return true
        }
        return false
    }

    override fun toString() : String {
        return "Name: $name Age: $age Weight: $weight"
    }
}
