package id.ac.rohim.tiptime

import junit.framework.Assert.assertEquals
import org.junit.Test

class TipCalculatorTest {
    @Test
    fun calculate_20_percent_tip_no_roundup() {
        val amount = 10.00
        val tipPercent = 20.00
        //di contoh menggunkan dollar($) karena disini disetting ke rupiah jadi harus IDR = "IDR2.00"
        val expectedTip = "$2.00"
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }
}