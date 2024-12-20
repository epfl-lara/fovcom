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

/*-- TTM_12_12_CheckTransitionReport --------------------------------------------*/


case class TTM_12_12_CheckTransitionReport_transitionCheckReports (nCount: Int, arr: Vector[TTransitionNotification])
{
    require(this.arr.size <= 4095 && 1 <= this.nCount && this.nCount <= this.arr.size)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036853240182L))
        TTM_12_12_CheckTransitionReport_transitionCheckReports.sizeRange(this.arr, offset, 0, this.nCount)
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 1535625L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036853240182L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036853240182L))
        TTM_12_12_CheckTransitionReport_transitionCheckReports.sizeLemmaAnyOffset(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036853240182L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036853240182L))
        require((offset % 8L) == (otherOffset % 8L))
        TTM_12_12_CheckTransitionReport_transitionCheckReports.sizeLemmaNextByte(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036853240182L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036853240182L))
        require((offset % 16L) == (otherOffset % 16L))
        TTM_12_12_CheckTransitionReport_transitionCheckReports.sizeLemmaNextWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036853240182L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036853240182L))
        require((offset % 32L) == (otherOffset % 32L))
        TTM_12_12_CheckTransitionReport_transitionCheckReports.sizeLemmaNextDWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}
object TTM_12_12_CheckTransitionReport_transitionCheckReports {
    def sizeRange(ls: Vector[TTransitionNotification], offset: Long, from: Int, to: Int): Long = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4095))
        require((0L <= offset) && (offset <= 9223372036854775807L - 375L * (to - from)))
        decreases(to - from)
        if (from == to) {
            0L
        } else {
            val elemSize = ls.apply(from).size(offset)
            assert(0L <= elemSize && elemSize <= 375L)
            elemSize + TTM_12_12_CheckTransitionReport_transitionCheckReports.sizeRange(ls, offset + elemSize, from + 1, to)
        }
    }.ensuring { (res: Long) => 
        val nbElems = (to - from)
        (0L <= res && res <= 375L * nbElems)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(ls: Vector[TTransitionNotification], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4095))
        require((0L <= offset) && (offset <= 9223372036854775807L - 375L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 375L * (to - from)))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 375L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 375L)
            ls.apply(from).sizeLemmaAnyOffset(offset, otherOffset)
            TTM_12_12_CheckTransitionReport_transitionCheckReports.sizeLemmaAnyOffset(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_12_12_CheckTransitionReport_transitionCheckReports.sizeRange(ls, offset, from, to) == TTM_12_12_CheckTransitionReport_transitionCheckReports.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(ls: Vector[TTransitionNotification], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4095))
        require((0L <= offset) && (offset <= 9223372036854775807L - 375L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 375L * (to - from)))
        require((offset % 8L) == (otherOffset % 8L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 375L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 375L)
            ls.apply(from).sizeLemmaNextByte(offset, otherOffset)
            TTM_12_12_CheckTransitionReport_transitionCheckReports.sizeLemmaNextByte(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_12_12_CheckTransitionReport_transitionCheckReports.sizeRange(ls, offset, from, to) == TTM_12_12_CheckTransitionReport_transitionCheckReports.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(ls: Vector[TTransitionNotification], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4095))
        require((0L <= offset) && (offset <= 9223372036854775807L - 375L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 375L * (to - from)))
        require((offset % 16L) == (otherOffset % 16L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 375L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 375L)
            ls.apply(from).sizeLemmaNextWord(offset, otherOffset)
            TTM_12_12_CheckTransitionReport_transitionCheckReports.sizeLemmaNextWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_12_12_CheckTransitionReport_transitionCheckReports.sizeRange(ls, offset, from, to) == TTM_12_12_CheckTransitionReport_transitionCheckReports.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(ls: Vector[TTransitionNotification], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4095))
        require((0L <= offset) && (offset <= 9223372036854775807L - 375L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 375L * (to - from)))
        require((offset % 32L) == (otherOffset % 32L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 375L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 375L)
            ls.apply(from).sizeLemmaNextDWord(offset, otherOffset)
            TTM_12_12_CheckTransitionReport_transitionCheckReports.sizeLemmaNextDWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_12_12_CheckTransitionReport_transitionCheckReports.sizeRange(ls, offset, from, to) == TTM_12_12_CheckTransitionReport_transitionCheckReports.sizeRange(ls, otherOffset, from, to)
    }
}

case class TTM_12_12_CheckTransitionReport (
    transitionCheckReports: TTM_12_12_CheckTransitionReport_transitionCheckReports
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036853240150L))
        val size_0 = 32L
        val size_1 = this.transitionCheckReports.size(offset + size_0)
        size_0 + size_1
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 1535657L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036853240150L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036853240150L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.transitionCheckReports.size(offset + size_0_offset)
        val size_1_otherOffset = this.transitionCheckReports.size(otherOffset + size_0_otherOffset)
        this.transitionCheckReports.sizeLemmaAnyOffset(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036853240150L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036853240150L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.transitionCheckReports.size(offset + size_0_offset)
        val size_1_otherOffset = this.transitionCheckReports.size(otherOffset + size_0_otherOffset)
        this.transitionCheckReports.sizeLemmaNextByte(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036853240150L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036853240150L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.transitionCheckReports.size(offset + size_0_offset)
        val size_1_otherOffset = this.transitionCheckReports.size(otherOffset + size_0_otherOffset)
        this.transitionCheckReports.sizeLemmaNextWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036853240150L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036853240150L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.transitionCheckReports.size(offset + size_0_offset)
        val size_1_otherOffset = this.transitionCheckReports.size(otherOffset + size_0_otherOffset)
        this.transitionCheckReports.sizeLemmaNextDWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TM_12_12_CHECKTRANSITIONREPORT_TRANSITIONCHECKREPORTS: Int = 1385 /*(SIZE(1 .. maxTM-12-12-transitionCheckReports)) */
@inline @cCode.inline val ERR_TM_12_12_CHECKTRANSITIONREPORT_TRANSITIONCHECKREPORTS_ELM_2: Int = 1380 /* */

@inline @cCode.inline val ERR_TM_12_12_CHECKTRANSITIONREPORT: Int = 1390 /* */

 
 

@inline @cCode.inline val ERR_ACN_ENCODE_TM_12_12_CHECKTRANSITIONREPORT: Int = 1393 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_12_12_CHECKTRANSITIONREPORT_N_UNINITIALIZED: Int = 1394 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_12_12_CHECKTRANSITIONREPORT_N: Int = 1206 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_12_12_CHECKTRANSITIONREPORT_TRANSITIONCHECKREPORTS: Int = 1388 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_12_12_CHECKTRANSITIONREPORT_TRANSITIONCHECKREPORTS_ELM_2: Int = 1383 /*  */
@inline @cCode.inline val TTM_12_12_CheckTransitionReport_REQUIRED_BYTES_FOR_ACN_ENCODING = 191958
@inline @cCode.inline val TTM_12_12_CheckTransitionReport_REQUIRED_BITS_FOR_ACN_ENCODING = 1535657

@inline @cCode.inline val ERR_ACN_DECODE_TM_12_12_CHECKTRANSITIONREPORT: Int = 1395 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_12_12_CHECKTRANSITIONREPORT_N: Int = 1207 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_12_12_CHECKTRANSITIONREPORT_TRANSITIONCHECKREPORTS: Int = 1389 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_12_12_CHECKTRANSITIONREPORT_TRANSITIONCHECKREPORTS_ELM_2: Int = 1384 /*  */

// @inline @cCode.inline val maxTM_12_12_transitionCheckReports: Int = 4095 // defined in body

