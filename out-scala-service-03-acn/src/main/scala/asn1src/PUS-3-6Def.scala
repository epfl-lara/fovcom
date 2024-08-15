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

/*-- TTC_3_6_DisableThePeriodicGenerationOfHousekeepingParameterReport --------------------------------------------*/


case class TTC_3_6_DisableThePeriodicGenerationOfHousekeepingParameterReport_housekeepingParameterReportStructure_ID (nCount: Int, arr: Vector[THousekeepingParameterReportStructure_ID])
{
    require(this.arr.size <= 63 && 1 <= this.nCount && this.nCount <= this.arr.size)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854773791L))
        TTC_3_6_DisableThePeriodicGenerationOfHousekeepingParameterReport_housekeepingParameterReportStructure_ID.sizeRange(this.arr, offset, 0, this.nCount)
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 2016L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854773791L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854773791L))
        TTC_3_6_DisableThePeriodicGenerationOfHousekeepingParameterReport_housekeepingParameterReportStructure_ID.sizeLemmaAnyOffset(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854773791L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854773791L))
        require((offset % 8L) == (otherOffset % 8L))
        TTC_3_6_DisableThePeriodicGenerationOfHousekeepingParameterReport_housekeepingParameterReportStructure_ID.sizeLemmaNextByte(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854773791L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854773791L))
        require((offset % 16L) == (otherOffset % 16L))
        TTC_3_6_DisableThePeriodicGenerationOfHousekeepingParameterReport_housekeepingParameterReportStructure_ID.sizeLemmaNextWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854773791L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854773791L))
        require((offset % 32L) == (otherOffset % 32L))
        TTC_3_6_DisableThePeriodicGenerationOfHousekeepingParameterReport_housekeepingParameterReportStructure_ID.sizeLemmaNextDWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}
object TTC_3_6_DisableThePeriodicGenerationOfHousekeepingParameterReport_housekeepingParameterReportStructure_ID {
    def sizeRange(ls: Vector[ULong], offset: Long, from: Int, to: Int): Long = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 32L * (to - from)))
        decreases(to - from)
        if (from == to) {
            0L
        } else {
            val elemSize = 32L
            assert(elemSize == 32L)
            elemSize + TTC_3_6_DisableThePeriodicGenerationOfHousekeepingParameterReport_housekeepingParameterReportStructure_ID.sizeRange(ls, offset + elemSize, from + 1, to)
        }
    }.ensuring { (res: Long) => 
        val nbElems = (to - from)
        (0L <= res && res <= 32L * nbElems)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(ls: Vector[ULong], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
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
            TTC_3_6_DisableThePeriodicGenerationOfHousekeepingParameterReport_housekeepingParameterReportStructure_ID.sizeLemmaAnyOffset(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_3_6_DisableThePeriodicGenerationOfHousekeepingParameterReport_housekeepingParameterReportStructure_ID.sizeRange(ls, offset, from, to) == TTC_3_6_DisableThePeriodicGenerationOfHousekeepingParameterReport_housekeepingParameterReportStructure_ID.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(ls: Vector[ULong], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
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
            TTC_3_6_DisableThePeriodicGenerationOfHousekeepingParameterReport_housekeepingParameterReportStructure_ID.sizeLemmaNextByte(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_3_6_DisableThePeriodicGenerationOfHousekeepingParameterReport_housekeepingParameterReportStructure_ID.sizeRange(ls, offset, from, to) == TTC_3_6_DisableThePeriodicGenerationOfHousekeepingParameterReport_housekeepingParameterReportStructure_ID.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(ls: Vector[ULong], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
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
            TTC_3_6_DisableThePeriodicGenerationOfHousekeepingParameterReport_housekeepingParameterReportStructure_ID.sizeLemmaNextWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_3_6_DisableThePeriodicGenerationOfHousekeepingParameterReport_housekeepingParameterReportStructure_ID.sizeRange(ls, offset, from, to) == TTC_3_6_DisableThePeriodicGenerationOfHousekeepingParameterReport_housekeepingParameterReportStructure_ID.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(ls: Vector[ULong], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
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
            TTC_3_6_DisableThePeriodicGenerationOfHousekeepingParameterReport_housekeepingParameterReportStructure_ID.sizeLemmaNextDWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_3_6_DisableThePeriodicGenerationOfHousekeepingParameterReport_housekeepingParameterReportStructure_ID.sizeRange(ls, offset, from, to) == TTC_3_6_DisableThePeriodicGenerationOfHousekeepingParameterReport_housekeepingParameterReportStructure_ID.sizeRange(ls, otherOffset, from, to)
    }
}

case class TTC_3_6_DisableThePeriodicGenerationOfHousekeepingParameterReport (
    housekeepingParameterReportStructure_ID: TTC_3_6_DisableThePeriodicGenerationOfHousekeepingParameterReport_housekeepingParameterReportStructure_ID
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854773759L))
        val size_0 = 32L
        val size_1 = this.housekeepingParameterReportStructure_ID.size(offset + size_0)
        size_0 + size_1
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 2048L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854773759L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854773759L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.housekeepingParameterReportStructure_ID.size(offset + size_0_offset)
        val size_1_otherOffset = this.housekeepingParameterReportStructure_ID.size(otherOffset + size_0_otherOffset)
        this.housekeepingParameterReportStructure_ID.sizeLemmaAnyOffset(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854773759L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854773759L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.housekeepingParameterReportStructure_ID.size(offset + size_0_offset)
        val size_1_otherOffset = this.housekeepingParameterReportStructure_ID.size(otherOffset + size_0_otherOffset)
        this.housekeepingParameterReportStructure_ID.sizeLemmaNextByte(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854773759L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854773759L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.housekeepingParameterReportStructure_ID.size(offset + size_0_offset)
        val size_1_otherOffset = this.housekeepingParameterReportStructure_ID.size(otherOffset + size_0_otherOffset)
        this.housekeepingParameterReportStructure_ID.sizeLemmaNextWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854773759L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854773759L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.housekeepingParameterReportStructure_ID.size(offset + size_0_offset)
        val size_1_otherOffset = this.housekeepingParameterReportStructure_ID.size(otherOffset + size_0_otherOffset)
        this.housekeepingParameterReportStructure_ID.sizeLemmaNextDWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TC_3_6_DISABLETHEPERIODICGENERATIONOFHOUSEKEEPINGPARAMETERREPORT_HOUSEKEEPINGPARAMETERREPORTSTRUCTURE_ID: Int = 2948 /*(SIZE (1 .. maxTC-3-6-HousekeepingParameterReportStructure-ID-Count)) */
@inline @cCode.inline val ERR_TC_3_6_DISABLETHEPERIODICGENERATIONOFHOUSEKEEPINGPARAMETERREPORT_HOUSEKEEPINGPARAMETERREPORTSTRUCTURE_ID_ELM_2: Int = 2943 /* */

@inline @cCode.inline val ERR_TC_3_6_DISABLETHEPERIODICGENERATIONOFHOUSEKEEPINGPARAMETERREPORT: Int = 2953 /* */

 
 

@inline @cCode.inline val ERR_ACN_ENCODE_TC_3_6_DISABLETHEPERIODICGENERATIONOFHOUSEKEEPINGPARAMETERREPORT: Int = 2956 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_3_6_DISABLETHEPERIODICGENERATIONOFHOUSEKEEPINGPARAMETERREPORT_N_UNINITIALIZED: Int = 2957 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_3_6_DISABLETHEPERIODICGENERATIONOFHOUSEKEEPINGPARAMETERREPORT_N: Int = 2936 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_3_6_DISABLETHEPERIODICGENERATIONOFHOUSEKEEPINGPARAMETERREPORT_HOUSEKEEPINGPARAMETERREPORTSTRUCTURE_ID: Int = 2951 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_3_6_DISABLETHEPERIODICGENERATIONOFHOUSEKEEPINGPARAMETERREPORT_HOUSEKEEPINGPARAMETERREPORTSTRUCTURE_ID_ELM_2: Int = 2946 /*  */
@inline @cCode.inline val TTC_3_6_DisableThePeriodicGenerationOfHousekeepingParameterReport_REQUIRED_BYTES_FOR_ACN_ENCODING = 256
@inline @cCode.inline val TTC_3_6_DisableThePeriodicGenerationOfHousekeepingParameterReport_REQUIRED_BITS_FOR_ACN_ENCODING = 2048

@inline @cCode.inline val ERR_ACN_DECODE_TC_3_6_DISABLETHEPERIODICGENERATIONOFHOUSEKEEPINGPARAMETERREPORT: Int = 2958 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_3_6_DISABLETHEPERIODICGENERATIONOFHOUSEKEEPINGPARAMETERREPORT_N: Int = 2937 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_3_6_DISABLETHEPERIODICGENERATIONOFHOUSEKEEPINGPARAMETERREPORT_HOUSEKEEPINGPARAMETERREPORTSTRUCTURE_ID: Int = 2952 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_3_6_DISABLETHEPERIODICGENERATIONOFHOUSEKEEPINGPARAMETERREPORT_HOUSEKEEPINGPARAMETERREPORTSTRUCTURE_ID_ELM_2: Int = 2947 /*  */

// @inline @cCode.inline val maxTC_3_6_HousekeepingParameterReportStructure_ID_Count: Int = 63 // defined in body

