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

/*-- TTC_12_2_DisableParameterReportingDefinitions --------------------------------------------*/


case class TTC_12_2_DisableParameterReportingDefinitions_pmon (nCount: Int, arr: Vector[TPMON_ID])
{
    require(this.arr.size <= 4096 && 1 <= this.nCount && this.nCount <= this.arr.size)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854644735L))
        TTC_12_2_DisableParameterReportingDefinitions_pmon.sizeRange(this.arr, offset, 0, this.nCount)
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 131072L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854644735L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854644735L))
        TTC_12_2_DisableParameterReportingDefinitions_pmon.sizeLemmaAnyOffset(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854644735L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854644735L))
        require((offset % 8L) == (otherOffset % 8L))
        TTC_12_2_DisableParameterReportingDefinitions_pmon.sizeLemmaNextByte(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854644735L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854644735L))
        require((offset % 16L) == (otherOffset % 16L))
        TTC_12_2_DisableParameterReportingDefinitions_pmon.sizeLemmaNextWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854644735L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854644735L))
        require((offset % 32L) == (otherOffset % 32L))
        TTC_12_2_DisableParameterReportingDefinitions_pmon.sizeLemmaNextDWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}
object TTC_12_2_DisableParameterReportingDefinitions_pmon {
    def sizeRange(ls: Vector[TPMON_ID], offset: Long, from: Int, to: Int): Long = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4096))
        require((0L <= offset) && (offset <= 9223372036854775807L - 32L * (to - from)))
        decreases(to - from)
        if (from == to) {
            0L
        } else {
            val elemSize = 32L
            assert(elemSize == 32L)
            elemSize + TTC_12_2_DisableParameterReportingDefinitions_pmon.sizeRange(ls, offset + elemSize, from + 1, to)
        }
    }.ensuring { (res: Long) => 
        val nbElems = (to - from)
        (0L <= res && res <= 32L * nbElems)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(ls: Vector[TPMON_ID], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4096))
        require((0L <= offset) && (offset <= 9223372036854775807L - 32L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 32L * (to - from)))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = 32L
            val elemSizeOtherOff = 32L
            assert(elemSizeOff == 32L)
            assert(elemSizeOtherOff == 32L)
            TTC_12_2_DisableParameterReportingDefinitions_pmon.sizeLemmaAnyOffset(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_12_2_DisableParameterReportingDefinitions_pmon.sizeRange(ls, offset, from, to) == TTC_12_2_DisableParameterReportingDefinitions_pmon.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(ls: Vector[TPMON_ID], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4096))
        require((0L <= offset) && (offset <= 9223372036854775807L - 32L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 32L * (to - from)))
        require((offset % 8L) == (otherOffset % 8L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = 32L
            val elemSizeOtherOff = 32L
            assert(elemSizeOff == 32L)
            assert(elemSizeOtherOff == 32L)
            TTC_12_2_DisableParameterReportingDefinitions_pmon.sizeLemmaNextByte(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_12_2_DisableParameterReportingDefinitions_pmon.sizeRange(ls, offset, from, to) == TTC_12_2_DisableParameterReportingDefinitions_pmon.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(ls: Vector[TPMON_ID], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4096))
        require((0L <= offset) && (offset <= 9223372036854775807L - 32L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 32L * (to - from)))
        require((offset % 16L) == (otherOffset % 16L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = 32L
            val elemSizeOtherOff = 32L
            assert(elemSizeOff == 32L)
            assert(elemSizeOtherOff == 32L)
            TTC_12_2_DisableParameterReportingDefinitions_pmon.sizeLemmaNextWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_12_2_DisableParameterReportingDefinitions_pmon.sizeRange(ls, offset, from, to) == TTC_12_2_DisableParameterReportingDefinitions_pmon.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(ls: Vector[TPMON_ID], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4096))
        require((0L <= offset) && (offset <= 9223372036854775807L - 32L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 32L * (to - from)))
        require((offset % 32L) == (otherOffset % 32L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = 32L
            val elemSizeOtherOff = 32L
            assert(elemSizeOff == 32L)
            assert(elemSizeOtherOff == 32L)
            TTC_12_2_DisableParameterReportingDefinitions_pmon.sizeLemmaNextDWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_12_2_DisableParameterReportingDefinitions_pmon.sizeRange(ls, offset, from, to) == TTC_12_2_DisableParameterReportingDefinitions_pmon.sizeRange(ls, otherOffset, from, to)
    }
}

case class TTC_12_2_DisableParameterReportingDefinitions (
    pmon: TTC_12_2_DisableParameterReportingDefinitions_pmon
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854644703L))
        val size_0 = 32L
        val size_1 = this.pmon.size(offset + size_0)
        size_0 + size_1
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 131104L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854644703L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854644703L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.pmon.size(offset + size_0_offset)
        val size_1_otherOffset = this.pmon.size(otherOffset + size_0_otherOffset)
        this.pmon.sizeLemmaAnyOffset(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854644703L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854644703L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.pmon.size(offset + size_0_offset)
        val size_1_otherOffset = this.pmon.size(otherOffset + size_0_otherOffset)
        this.pmon.sizeLemmaNextByte(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854644703L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854644703L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.pmon.size(offset + size_0_offset)
        val size_1_otherOffset = this.pmon.size(otherOffset + size_0_otherOffset)
        this.pmon.sizeLemmaNextWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854644703L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854644703L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.pmon.size(offset + size_0_offset)
        val size_1_otherOffset = this.pmon.size(otherOffset + size_0_otherOffset)
        this.pmon.sizeLemmaNextDWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TC_12_2_DISABLEPARAMETERREPORTINGDEFINITIONS_PMON: Int = 2205 /*(SIZE(1 .. maxTC-12-2-PMON-ID-Count)) */
@inline @cCode.inline val ERR_TC_12_2_DISABLEPARAMETERREPORTINGDEFINITIONS_PMON_ELM_2: Int = 2200 /* */

@inline @cCode.inline val ERR_TC_12_2_DISABLEPARAMETERREPORTINGDEFINITIONS: Int = 2210 /* */

 
 

@inline @cCode.inline val ERR_ACN_ENCODE_TC_12_2_DISABLEPARAMETERREPORTINGDEFINITIONS: Int = 2213 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_12_2_DISABLEPARAMETERREPORTINGDEFINITIONS_N_UNINITIALIZED: Int = 2214 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_12_2_DISABLEPARAMETERREPORTINGDEFINITIONS_N: Int = 2193 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_12_2_DISABLEPARAMETERREPORTINGDEFINITIONS_PMON: Int = 2208 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_12_2_DISABLEPARAMETERREPORTINGDEFINITIONS_PMON_ELM_2: Int = 2203 /*  */
@inline @cCode.inline val TTC_12_2_DisableParameterReportingDefinitions_REQUIRED_BYTES_FOR_ACN_ENCODING = 16388
@inline @cCode.inline val TTC_12_2_DisableParameterReportingDefinitions_REQUIRED_BITS_FOR_ACN_ENCODING = 131104

@inline @cCode.inline val ERR_ACN_DECODE_TC_12_2_DISABLEPARAMETERREPORTINGDEFINITIONS: Int = 2215 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_12_2_DISABLEPARAMETERREPORTINGDEFINITIONS_N: Int = 2194 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_12_2_DISABLEPARAMETERREPORTINGDEFINITIONS_PMON: Int = 2209 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_12_2_DISABLEPARAMETERREPORTINGDEFINITIONS_PMON_ELM_2: Int = 2204 /*  */

// @inline @cCode.inline val maxTC_12_2_PMON_ID_Count: Int = 4096 // defined in body

