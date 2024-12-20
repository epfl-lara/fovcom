/*
Code automatically generated by asn1scc tool
*/
package asn1src

import asn1scala._
import stainless.lang._
import stainless.annotation._
import stainless.collection._
import stainless.proof._
import StaticChecks._

/*-- TTM_12_28_StatusReport --------------------------------------------*/

case class TTM_12_28_StatusReport (
    fmon_ID: TFMON_ID, 
    fmonProtectionStatus: TFMON_ProtectionStatus, 
    fmonStatus: TFMON_Status, 
    fmonCheckingStatus: TFMON_CheckingStatus
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775771L))
        val size_0 = 32L
        val size_1 = 1L
        val size_2 = 1L
        val size_3 = 2L
        size_0 + size_1 + size_2 + size_3
    }.ensuring { (res: Long) => 
        res == 36L
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775771L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775771L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = 1L
        val size_1_otherOffset = 1L
        val size_2_offset = 1L
        val size_2_otherOffset = 1L
        val size_3_offset = 2L
        val size_3_otherOffset = 2L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775771L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775771L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = 1L
        val size_1_otherOffset = 1L
        val size_2_offset = 1L
        val size_2_otherOffset = 1L
        val size_3_offset = 2L
        val size_3_otherOffset = 2L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775771L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775771L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = 1L
        val size_1_otherOffset = 1L
        val size_2_offset = 1L
        val size_2_otherOffset = 1L
        val size_3_offset = 2L
        val size_3_otherOffset = 2L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775771L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775771L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = 1L
        val size_1_otherOffset = 1L
        val size_2_offset = 1L
        val size_2_otherOffset = 1L
        val size_3_offset = 2L
        val size_3_otherOffset = 2L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TM_12_28_STATUSREPORT: Int = 2188 /* */
@inline @cCode.inline val ERR_TM_12_28_STATUSREPORT_FMON_ID_2: Int = 2153 /* */
@inline @cCode.inline val ERR_TM_12_28_STATUSREPORT_FMONPROTECTIONSTATUS_2: Int = 2163 /* */
@inline @cCode.inline val ERR_TM_12_28_STATUSREPORT_FMONSTATUS_2: Int = 2173 /* */
@inline @cCode.inline val ERR_TM_12_28_STATUSREPORT_FMONCHECKINGSTATUS_2: Int = 2183 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_TM_12_28_STATUSREPORT: Int = 2191 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_12_28_STATUSREPORT_FMON_ID_2: Int = 2156 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_12_28_STATUSREPORT_FMONPROTECTIONSTATUS_2: Int = 2166 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_12_28_STATUSREPORT_FMONSTATUS_2: Int = 2176 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_12_28_STATUSREPORT_FMONCHECKINGSTATUS_2: Int = 2186 /*  */
@inline @cCode.inline val TTM_12_28_StatusReport_REQUIRED_BYTES_FOR_ACN_ENCODING = 5
@inline @cCode.inline val TTM_12_28_StatusReport_REQUIRED_BITS_FOR_ACN_ENCODING = 36

@inline @cCode.inline val ERR_ACN_DECODE_TM_12_28_STATUSREPORT: Int = 2192 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_12_28_STATUSREPORT_FMON_ID_2: Int = 2157 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_12_28_STATUSREPORT_FMONPROTECTIONSTATUS_2: Int = 2167 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_12_28_STATUSREPORT_FMONSTATUS_2: Int = 2177 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_12_28_STATUSREPORT_FMONCHECKINGSTATUS_2: Int = 2187 /*  */
/*-- TTM_12_28_FunctionalMonitoringDefinitionStatusReport --------------------------------------------*/


case class TTM_12_28_FunctionalMonitoringDefinitionStatusReport_statusReport (nCount: Int, arr: Vector[TTM_12_28_StatusReport])
{
    require(this.arr.size <= 4095 && 1 <= this.nCount && this.nCount <= this.arr.size)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854628387L))
        TTM_12_28_FunctionalMonitoringDefinitionStatusReport_statusReport.sizeRange(this.arr, offset, 0, this.nCount)
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 147420L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854628387L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854628387L))
        TTM_12_28_FunctionalMonitoringDefinitionStatusReport_statusReport.sizeLemmaAnyOffset(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854628387L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854628387L))
        require((offset % 8L) == (otherOffset % 8L))
        TTM_12_28_FunctionalMonitoringDefinitionStatusReport_statusReport.sizeLemmaNextByte(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854628387L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854628387L))
        require((offset % 16L) == (otherOffset % 16L))
        TTM_12_28_FunctionalMonitoringDefinitionStatusReport_statusReport.sizeLemmaNextWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854628387L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854628387L))
        require((offset % 32L) == (otherOffset % 32L))
        TTM_12_28_FunctionalMonitoringDefinitionStatusReport_statusReport.sizeLemmaNextDWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}
object TTM_12_28_FunctionalMonitoringDefinitionStatusReport_statusReport {
    def sizeRange(ls: Vector[TTM_12_28_StatusReport], offset: Long, from: Int, to: Int): Long = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4095))
        require((0L <= offset) && (offset <= 9223372036854775807L - 36L * (to - from)))
        decreases(to - from)
        if (from == to) {
            0L
        } else {
            val elemSize = ls.apply(from).size(offset)
            assert(elemSize == 36L)
            elemSize + TTM_12_28_FunctionalMonitoringDefinitionStatusReport_statusReport.sizeRange(ls, offset + elemSize, from + 1, to)
        }
    }.ensuring { (res: Long) => 
        val nbElems = (to - from)
        (0L <= res && res <= 36L * nbElems)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(ls: Vector[TTM_12_28_StatusReport], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4095))
        require((0L <= offset) && (offset <= 9223372036854775807L - 36L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 36L * (to - from)))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 36L)
            assert(elemSizeOtherOff == 36L)
            ls.apply(from).sizeLemmaAnyOffset(offset, otherOffset)
            TTM_12_28_FunctionalMonitoringDefinitionStatusReport_statusReport.sizeLemmaAnyOffset(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_12_28_FunctionalMonitoringDefinitionStatusReport_statusReport.sizeRange(ls, offset, from, to) == TTM_12_28_FunctionalMonitoringDefinitionStatusReport_statusReport.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(ls: Vector[TTM_12_28_StatusReport], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4095))
        require((0L <= offset) && (offset <= 9223372036854775807L - 36L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 36L * (to - from)))
        require((offset % 8L) == (otherOffset % 8L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 36L)
            assert(elemSizeOtherOff == 36L)
            ls.apply(from).sizeLemmaNextByte(offset, otherOffset)
            TTM_12_28_FunctionalMonitoringDefinitionStatusReport_statusReport.sizeLemmaNextByte(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_12_28_FunctionalMonitoringDefinitionStatusReport_statusReport.sizeRange(ls, offset, from, to) == TTM_12_28_FunctionalMonitoringDefinitionStatusReport_statusReport.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(ls: Vector[TTM_12_28_StatusReport], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4095))
        require((0L <= offset) && (offset <= 9223372036854775807L - 36L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 36L * (to - from)))
        require((offset % 16L) == (otherOffset % 16L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 36L)
            assert(elemSizeOtherOff == 36L)
            ls.apply(from).sizeLemmaNextWord(offset, otherOffset)
            TTM_12_28_FunctionalMonitoringDefinitionStatusReport_statusReport.sizeLemmaNextWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_12_28_FunctionalMonitoringDefinitionStatusReport_statusReport.sizeRange(ls, offset, from, to) == TTM_12_28_FunctionalMonitoringDefinitionStatusReport_statusReport.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(ls: Vector[TTM_12_28_StatusReport], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4095))
        require((0L <= offset) && (offset <= 9223372036854775807L - 36L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 36L * (to - from)))
        require((offset % 32L) == (otherOffset % 32L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 36L)
            assert(elemSizeOtherOff == 36L)
            ls.apply(from).sizeLemmaNextDWord(offset, otherOffset)
            TTM_12_28_FunctionalMonitoringDefinitionStatusReport_statusReport.sizeLemmaNextDWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_12_28_FunctionalMonitoringDefinitionStatusReport_statusReport.sizeRange(ls, offset, from, to) == TTM_12_28_FunctionalMonitoringDefinitionStatusReport_statusReport.sizeRange(ls, otherOffset, from, to)
    }
}

case class TTM_12_28_FunctionalMonitoringDefinitionStatusReport (
    statusReport: TTM_12_28_FunctionalMonitoringDefinitionStatusReport_statusReport
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854628355L))
        val size_0 = 32L
        val size_1 = this.statusReport.size(offset + size_0)
        size_0 + size_1
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 147452L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854628355L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854628355L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.statusReport.size(offset + size_0_offset)
        val size_1_otherOffset = this.statusReport.size(otherOffset + size_0_otherOffset)
        this.statusReport.sizeLemmaAnyOffset(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854628355L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854628355L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.statusReport.size(offset + size_0_offset)
        val size_1_otherOffset = this.statusReport.size(otherOffset + size_0_otherOffset)
        this.statusReport.sizeLemmaNextByte(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854628355L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854628355L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.statusReport.size(offset + size_0_offset)
        val size_1_otherOffset = this.statusReport.size(otherOffset + size_0_otherOffset)
        this.statusReport.sizeLemmaNextWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854628355L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854628355L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.statusReport.size(offset + size_0_offset)
        val size_1_otherOffset = this.statusReport.size(otherOffset + size_0_otherOffset)
        this.statusReport.sizeLemmaNextDWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TM_12_28_FUNCTIONALMONITORINGDEFINITIONSTATUSREPORT_STATUSREPORT: Int = 2137 /*(SIZE(1 .. maxTM-12-28-StatusReportCount)) */
@inline @cCode.inline val ERR_TM_12_28_FUNCTIONALMONITORINGDEFINITIONSTATUSREPORT_STATUSREPORT_ELM_2: Int = 2132 /* */

@inline @cCode.inline val ERR_TM_12_28_FUNCTIONALMONITORINGDEFINITIONSTATUSREPORT: Int = 2142 /* */

 
 

@inline @cCode.inline val ERR_ACN_ENCODE_TM_12_28_FUNCTIONALMONITORINGDEFINITIONSTATUSREPORT: Int = 2145 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_12_28_FUNCTIONALMONITORINGDEFINITIONSTATUSREPORT_N_UNINITIALIZED: Int = 2146 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_12_28_FUNCTIONALMONITORINGDEFINITIONSTATUSREPORT_N: Int = 2085 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_12_28_FUNCTIONALMONITORINGDEFINITIONSTATUSREPORT_STATUSREPORT: Int = 2140 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_12_28_FUNCTIONALMONITORINGDEFINITIONSTATUSREPORT_STATUSREPORT_ELM_2: Int = 2135 /*  */
@inline @cCode.inline val TTM_12_28_FunctionalMonitoringDefinitionStatusReport_REQUIRED_BYTES_FOR_ACN_ENCODING = 18432
@inline @cCode.inline val TTM_12_28_FunctionalMonitoringDefinitionStatusReport_REQUIRED_BITS_FOR_ACN_ENCODING = 147452

@inline @cCode.inline val ERR_ACN_DECODE_TM_12_28_FUNCTIONALMONITORINGDEFINITIONSTATUSREPORT: Int = 2147 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_12_28_FUNCTIONALMONITORINGDEFINITIONSTATUSREPORT_N: Int = 2086 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_12_28_FUNCTIONALMONITORINGDEFINITIONSTATUSREPORT_STATUSREPORT: Int = 2141 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_12_28_FUNCTIONALMONITORINGDEFINITIONSTATUSREPORT_STATUSREPORT_ELM_2: Int = 2136 /*  */

// @inline @cCode.inline val maxTM_12_28_StatusReportCount: Int = 4095 // defined in body

