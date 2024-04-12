package third

class World(
    private val pavement: Pavement,
    private val sky: Sky,
    private val peoples: List<Human>
) {
    fun start() {
        Wind().noise()
        Pipe().scream()
        Pipe().scream()
        pavement.run()
        sky.run()
        peoples.forEach {
            it.understand()
            it.run()
        }
    }
}