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

/*-- TTM_11_19_Status --------------------------------------------*/

case class TTM_11_19_Status (
    subschedule_ID: TSubSchedule_ID, 
    subscheduleStatus: TSubScheduleStatus
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775774L))
        val size_0 = 32L
        val size_1 = 1L
        size_0 + size_1
    }.ensuring { (res: Long) => 
        res == 33L
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775774L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775774L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = 1L
        val size_1_otherOffset = 1L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775774L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775774L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = 1L
        val size_1_otherOffset = 1L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775774L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775774L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = 1L
        val size_1_otherOffset = 1L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775774L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775774L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = 1L
        val size_1_otherOffset = 1L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TM_11_19_STATUS: Int = 1038 /* */
@inline @cCode.inline val ERR_TM_11_19_STATUS_SUBSCHEDULE_ID_2: Int = 1023 /* */
@inline @cCode.inline val ERR_TM_11_19_STATUS_SUBSCHEDULESTATUS_2: Int = 1033 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_TM_11_19_STATUS: Int = 1041 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_11_19_STATUS_SUBSCHEDULE_ID_2: Int = 1026 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_11_19_STATUS_SUBSCHEDULESTATUS_2: Int = 1036 /*  */
@inline @cCode.inline val TTM_11_19_Status_REQUIRED_BYTES_FOR_ACN_ENCODING = 5
@inline @cCode.inline val TTM_11_19_Status_REQUIRED_BITS_FOR_ACN_ENCODING = 33

@inline @cCode.inline val ERR_ACN_DECODE_TM_11_19_STATUS: Int = 1042 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_11_19_STATUS_SUBSCHEDULE_ID_2: Int = 1027 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_11_19_STATUS_SUBSCHEDULESTATUS_2: Int = 1037 /*  */
/*-- TTM_11_19_TimeBasedSubScheduleStatusReport --------------------------------------------*/


case class TTM_11_19_TimeBasedSubScheduleStatusReport_subscheduleStatuses (nCount: Int, arr: Vector[TTM_11_19_Status])
{
    require(this.arr.size <= 4095 && 0 <= this.nCount && this.nCount <= this.arr.size)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854640672L))
        TTM_11_19_TimeBasedSubScheduleStatusReport_subscheduleStatuses.sizeRange(this.arr, offset, 0, this.nCount)
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 135135L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854640672L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854640672L))
        TTM_11_19_TimeBasedSubScheduleStatusReport_subscheduleStatuses.sizeLemmaAnyOffset(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854640672L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854640672L))
        require((offset % 8L) == (otherOffset % 8L))
        TTM_11_19_TimeBasedSubScheduleStatusReport_subscheduleStatuses.sizeLemmaNextByte(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854640672L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854640672L))
        require((offset % 16L) == (otherOffset % 16L))
        TTM_11_19_TimeBasedSubScheduleStatusReport_subscheduleStatuses.sizeLemmaNextWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854640672L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854640672L))
        require((offset % 32L) == (otherOffset % 32L))
        TTM_11_19_TimeBasedSubScheduleStatusReport_subscheduleStatuses.sizeLemmaNextDWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}
object TTM_11_19_TimeBasedSubScheduleStatusReport_subscheduleStatuses {
    def sizeRange(ls: Vector[TTM_11_19_Status], offset: Long, from: Int, to: Int): Long = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4095))
        require((0L <= offset) && (offset <= 9223372036854775807L - 33L * (to - from)))
        decreases(to - from)
        if (from == to) {
            0L
        } else {
            val elemSize = ls.apply(from).size(offset)
            assert(elemSize == 33L)
            elemSize + TTM_11_19_TimeBasedSubScheduleStatusReport_subscheduleStatuses.sizeRange(ls, offset + elemSize, from + 1, to)
        }
    }.ensuring { (res: Long) => 
        val nbElems = (to - from)
        (0L <= res && res <= 33L * nbElems)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(ls: Vector[TTM_11_19_Status], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4095))
        require((0L <= offset) && (offset <= 9223372036854775807L - 33L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 33L * (to - from)))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 33L)
            assert(elemSizeOtherOff == 33L)
            ls.apply(from).sizeLemmaAnyOffset(offset, otherOffset)
            TTM_11_19_TimeBasedSubScheduleStatusReport_subscheduleStatuses.sizeLemmaAnyOffset(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_11_19_TimeBasedSubScheduleStatusReport_subscheduleStatuses.sizeRange(ls, offset, from, to) == TTM_11_19_TimeBasedSubScheduleStatusReport_subscheduleStatuses.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(ls: Vector[TTM_11_19_Status], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4095))
        require((0L <= offset) && (offset <= 9223372036854775807L - 33L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 33L * (to - from)))
        require((offset % 8L) == (otherOffset % 8L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 33L)
            assert(elemSizeOtherOff == 33L)
            ls.apply(from).sizeLemmaNextByte(offset, otherOffset)
            TTM_11_19_TimeBasedSubScheduleStatusReport_subscheduleStatuses.sizeLemmaNextByte(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_11_19_TimeBasedSubScheduleStatusReport_subscheduleStatuses.sizeRange(ls, offset, from, to) == TTM_11_19_TimeBasedSubScheduleStatusReport_subscheduleStatuses.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(ls: Vector[TTM_11_19_Status], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4095))
        require((0L <= offset) && (offset <= 9223372036854775807L - 33L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 33L * (to - from)))
        require((offset % 16L) == (otherOffset % 16L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 33L)
            assert(elemSizeOtherOff == 33L)
            ls.apply(from).sizeLemmaNextWord(offset, otherOffset)
            TTM_11_19_TimeBasedSubScheduleStatusReport_subscheduleStatuses.sizeLemmaNextWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_11_19_TimeBasedSubScheduleStatusReport_subscheduleStatuses.sizeRange(ls, offset, from, to) == TTM_11_19_TimeBasedSubScheduleStatusReport_subscheduleStatuses.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(ls: Vector[TTM_11_19_Status], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4095))
        require((0L <= offset) && (offset <= 9223372036854775807L - 33L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 33L * (to - from)))
        require((offset % 32L) == (otherOffset % 32L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 33L)
            assert(elemSizeOtherOff == 33L)
            ls.apply(from).sizeLemmaNextDWord(offset, otherOffset)
            TTM_11_19_TimeBasedSubScheduleStatusReport_subscheduleStatuses.sizeLemmaNextDWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_11_19_TimeBasedSubScheduleStatusReport_subscheduleStatuses.sizeRange(ls, offset, from, to) == TTM_11_19_TimeBasedSubScheduleStatusReport_subscheduleStatuses.sizeRange(ls, otherOffset, from, to)
    }
}

case class TTM_11_19_TimeBasedSubScheduleStatusReport (
    subscheduleStatuses: TTM_11_19_TimeBasedSubScheduleStatusReport_subscheduleStatuses
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854640640L))
        val size_0 = 32L
        val size_1 = this.subscheduleStatuses.size(offset + size_0)
        size_0 + size_1
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 135167L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854640640L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854640640L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.subscheduleStatuses.size(offset + size_0_offset)
        val size_1_otherOffset = this.subscheduleStatuses.size(otherOffset + size_0_otherOffset)
        this.subscheduleStatuses.sizeLemmaAnyOffset(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854640640L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854640640L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.subscheduleStatuses.size(offset + size_0_offset)
        val size_1_otherOffset = this.subscheduleStatuses.size(otherOffset + size_0_otherOffset)
        this.subscheduleStatuses.sizeLemmaNextByte(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854640640L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854640640L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.subscheduleStatuses.size(offset + size_0_offset)
        val size_1_otherOffset = this.subscheduleStatuses.size(otherOffset + size_0_otherOffset)
        this.subscheduleStatuses.sizeLemmaNextWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854640640L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854640640L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.subscheduleStatuses.size(offset + size_0_offset)
        val size_1_otherOffset = this.subscheduleStatuses.size(otherOffset + size_0_otherOffset)
        this.subscheduleStatuses.sizeLemmaNextDWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TM_11_19_TIMEBASEDSUBSCHEDULESTATUSREPORT_SUBSCHEDULESTATUSES: Int = 1007 /*(SIZE(0 .. maxTM-11-19-StatusCount)) */
@inline @cCode.inline val ERR_TM_11_19_TIMEBASEDSUBSCHEDULESTATUSREPORT_SUBSCHEDULESTATUSES_ELM_2: Int = 1002 /* */

@inline @cCode.inline val ERR_TM_11_19_TIMEBASEDSUBSCHEDULESTATUSREPORT: Int = 1012 /* */

 
 

@inline @cCode.inline val ERR_ACN_ENCODE_TM_11_19_TIMEBASEDSUBSCHEDULESTATUSREPORT: Int = 1015 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_11_19_TIMEBASEDSUBSCHEDULESTATUSREPORT_N_UNINITIALIZED: Int = 1016 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_11_19_TIMEBASEDSUBSCHEDULESTATUSREPORT_N: Int = 975 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_11_19_TIMEBASEDSUBSCHEDULESTATUSREPORT_SUBSCHEDULESTATUSES: Int = 1010 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_11_19_TIMEBASEDSUBSCHEDULESTATUSREPORT_SUBSCHEDULESTATUSES_ELM_2: Int = 1005 /*  */
@inline @cCode.inline val TTM_11_19_TimeBasedSubScheduleStatusReport_REQUIRED_BYTES_FOR_ACN_ENCODING = 16896
@inline @cCode.inline val TTM_11_19_TimeBasedSubScheduleStatusReport_REQUIRED_BITS_FOR_ACN_ENCODING = 135167

@inline @cCode.inline val ERR_ACN_DECODE_TM_11_19_TIMEBASEDSUBSCHEDULESTATUSREPORT: Int = 1017 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_11_19_TIMEBASEDSUBSCHEDULESTATUSREPORT_N: Int = 976 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_11_19_TIMEBASEDSUBSCHEDULESTATUSREPORT_SUBSCHEDULESTATUSES: Int = 1011 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_11_19_TIMEBASEDSUBSCHEDULESTATUSREPORT_SUBSCHEDULESTATUSES_ELM_2: Int = 1006 /*  */

// @inline @cCode.inline val maxTM_11_19_StatusCount: Int = 4095 // defined in body

