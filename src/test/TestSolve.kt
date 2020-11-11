package test

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.TestMethodOrder
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestSolve {

    private fun testCases() = Stream.of(
            TestCase("inputOne", "inputOne"),
            TestCase("inputTwo", "inputTwo"),
            TestCase("inputThree", "inputThree")
    )

    @ParameterizedTest
    @MethodSource("testCases")
    fun `TestParam`(test: TestCase) {
        printAssert(test.input, test.expect)
        assertThat(test.input).isEqualTo(test.expect)
    }

}