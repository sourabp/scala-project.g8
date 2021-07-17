package $package$

class MainTest extends FunSuite {
    test("MainTest - Base test case") {
        val actualOutput = Main.getOutput()
        val expectedOutput = "Hello World"
        assert(actualOutput == expectedOutput)
    }
}