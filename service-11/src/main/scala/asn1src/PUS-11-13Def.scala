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

/*-- TTM_11_13_Report --------------------------------------------*/

case class TTM_11_13_Report (
    subschedule_ID: OptionMut[TSubSchedule_ID], 
    group_ID: OptionMut[TGroup_ID], 
    releaseTime: TCDS_AbsoluteTime_PFC_2, 
    request_ID: TRequest_ID
) {
    require(this.subschedule_ID.isDefined && this.group_ID.isDefined)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775620L))
        val size_0 = (this.subschedule_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        })
        val size_1 = this.group_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_2 = this.releaseTime.size(offset + size_0 + size_1)
        val size_3 = this.request_ID.size(offset + size_0 + size_1 + size_2)
        size_0 + size_1 + size_2 + size_3
    }.ensuring { (res: Long) => 
        res == 187L
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775620L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775620L))
        val size_0_offset = (this.subschedule_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        })
        val size_0_otherOffset = this.subschedule_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_1_offset = this.group_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_1_otherOffset = this.group_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_2_offset = this.releaseTime.size(offset + size_0_offset + size_1_offset)
        val size_2_otherOffset = this.releaseTime.size(otherOffset + size_0_otherOffset + size_1_otherOffset)
        this.releaseTime.sizeLemmaAnyOffset(offset + size_0_offset + size_1_offset, otherOffset + size_0_otherOffset + size_1_otherOffset)
        val size_3_offset = this.request_ID.size(offset + size_0_offset + size_1_offset + size_2_offset)
        val size_3_otherOffset = this.request_ID.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        this.request_ID.sizeLemmaAnyOffset(offset + size_0_offset + size_1_offset + size_2_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775620L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775620L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = (this.subschedule_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        })
        val size_0_otherOffset = this.subschedule_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_1_offset = this.group_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_1_otherOffset = this.group_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_2_offset = this.releaseTime.size(offset + size_0_offset + size_1_offset)
        val size_2_otherOffset = this.releaseTime.size(otherOffset + size_0_otherOffset + size_1_otherOffset)
        this.releaseTime.sizeLemmaNextByte(offset + size_0_offset + size_1_offset, otherOffset + size_0_otherOffset + size_1_otherOffset)
        val size_3_offset = this.request_ID.size(offset + size_0_offset + size_1_offset + size_2_offset)
        val size_3_otherOffset = this.request_ID.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        this.request_ID.sizeLemmaNextByte(offset + size_0_offset + size_1_offset + size_2_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775620L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775620L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = (this.subschedule_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        })
        val size_0_otherOffset = this.subschedule_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_1_offset = this.group_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_1_otherOffset = this.group_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_2_offset = this.releaseTime.size(offset + size_0_offset + size_1_offset)
        val size_2_otherOffset = this.releaseTime.size(otherOffset + size_0_otherOffset + size_1_otherOffset)
        this.releaseTime.sizeLemmaNextWord(offset + size_0_offset + size_1_offset, otherOffset + size_0_otherOffset + size_1_otherOffset)
        val size_3_offset = this.request_ID.size(offset + size_0_offset + size_1_offset + size_2_offset)
        val size_3_otherOffset = this.request_ID.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        this.request_ID.sizeLemmaNextWord(offset + size_0_offset + size_1_offset + size_2_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775620L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775620L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = (this.subschedule_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        })
        val size_0_otherOffset = this.subschedule_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_1_offset = this.group_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_1_otherOffset = this.group_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_2_offset = this.releaseTime.size(offset + size_0_offset + size_1_offset)
        val size_2_otherOffset = this.releaseTime.size(otherOffset + size_0_otherOffset + size_1_otherOffset)
        this.releaseTime.sizeLemmaNextDWord(offset + size_0_offset + size_1_offset, otherOffset + size_0_otherOffset + size_1_otherOffset)
        val size_3_offset = this.request_ID.size(offset + size_0_offset + size_1_offset + size_2_offset)
        val size_3_otherOffset = this.request_ID.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        this.request_ID.sizeLemmaNextDWord(offset + size_0_offset + size_1_offset + size_2_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TM_11_13_REPORT: Int = 669 /*(WITH COMPONENTS
{
    subschedule-ID PRESENT,
    group-ID PRESENT
}) */
@inline @cCode.inline val ERR_TM_11_13_REPORT_SUBSCHEDULE_ID_2: Int = 584 /* */
@inline @cCode.inline val ERR_TM_11_13_REPORT_GROUP_ID_2: Int = 594 /* */
@inline @cCode.inline val ERR_TM_11_13_REPORT_RELEASETIME_2_2: Int = 624 /* */
@inline @cCode.inline val ERR_TM_11_13_REPORT_REQUEST_ID_2: Int = 664 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_TM_11_13_REPORT: Int = 672 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_11_13_REPORT_SUBSCHEDULE_ID_2: Int = 587 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_11_13_REPORT_GROUP_ID_2: Int = 597 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_11_13_REPORT_RELEASETIME_2_2: Int = 627 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_11_13_REPORT_REQUEST_ID_2: Int = 667 /*  */
@inline @cCode.inline val TTM_11_13_Report_REQUIRED_BYTES_FOR_ACN_ENCODING = 24
@inline @cCode.inline val TTM_11_13_Report_REQUIRED_BITS_FOR_ACN_ENCODING = 187

@inline @cCode.inline val ERR_ACN_DECODE_TM_11_13_REPORT: Int = 673 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_11_13_REPORT_SUBSCHEDULE_ID_2: Int = 588 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_11_13_REPORT_GROUP_ID_2: Int = 598 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_11_13_REPORT_RELEASETIME_2_2: Int = 628 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_11_13_REPORT_REQUEST_ID_2: Int = 668 /*  */
/*-- TTM_11_13_TimeBasedScheduleSummaryReport --------------------------------------------*/


case class TTM_11_13_TimeBasedScheduleSummaryReport_report (nCount: Int, arr: Vector[TTM_11_13_Report])
{
    require(this.arr.size <= 4095 && 0 <= this.nCount && this.nCount <= this.arr.size)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854010042L))
        TTM_11_13_TimeBasedScheduleSummaryReport_report.sizeRange(this.arr, offset, 0, this.nCount)
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 765765L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854010042L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854010042L))
        TTM_11_13_TimeBasedScheduleSummaryReport_report.sizeLemmaAnyOffset(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854010042L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854010042L))
        require((offset % 8L) == (otherOffset % 8L))
        TTM_11_13_TimeBasedScheduleSummaryReport_report.sizeLemmaNextByte(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854010042L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854010042L))
        require((offset % 16L) == (otherOffset % 16L))
        TTM_11_13_TimeBasedScheduleSummaryReport_report.sizeLemmaNextWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854010042L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854010042L))
        require((offset % 32L) == (otherOffset % 32L))
        TTM_11_13_TimeBasedScheduleSummaryReport_report.sizeLemmaNextDWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}
object TTM_11_13_TimeBasedScheduleSummaryReport_report {
    def sizeRange(ls: Vector[TTM_11_13_Report], offset: Long, from: Int, to: Int): Long = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4095))
        require((0L <= offset) && (offset <= 9223372036854775807L - 187L * (to - from)))
        decreases(to - from)
        if (from == to) {
            0L
        } else {
            val elemSize = ls.apply(from).size(offset)
            assert(elemSize == 187L)
            elemSize + TTM_11_13_TimeBasedScheduleSummaryReport_report.sizeRange(ls, offset + elemSize, from + 1, to)
        }
    }.ensuring { (res: Long) => 
        val nbElems = (to - from)
        (0L <= res && res <= 187L * nbElems)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(ls: Vector[TTM_11_13_Report], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4095))
        require((0L <= offset) && (offset <= 9223372036854775807L - 187L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 187L * (to - from)))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 187L)
            assert(elemSizeOtherOff == 187L)
            ls.apply(from).sizeLemmaAnyOffset(offset, otherOffset)
            TTM_11_13_TimeBasedScheduleSummaryReport_report.sizeLemmaAnyOffset(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_11_13_TimeBasedScheduleSummaryReport_report.sizeRange(ls, offset, from, to) == TTM_11_13_TimeBasedScheduleSummaryReport_report.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(ls: Vector[TTM_11_13_Report], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4095))
        require((0L <= offset) && (offset <= 9223372036854775807L - 187L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 187L * (to - from)))
        require((offset % 8L) == (otherOffset % 8L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 187L)
            assert(elemSizeOtherOff == 187L)
            ls.apply(from).sizeLemmaNextByte(offset, otherOffset)
            TTM_11_13_TimeBasedScheduleSummaryReport_report.sizeLemmaNextByte(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_11_13_TimeBasedScheduleSummaryReport_report.sizeRange(ls, offset, from, to) == TTM_11_13_TimeBasedScheduleSummaryReport_report.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(ls: Vector[TTM_11_13_Report], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4095))
        require((0L <= offset) && (offset <= 9223372036854775807L - 187L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 187L * (to - from)))
        require((offset % 16L) == (otherOffset % 16L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 187L)
            assert(elemSizeOtherOff == 187L)
            ls.apply(from).sizeLemmaNextWord(offset, otherOffset)
            TTM_11_13_TimeBasedScheduleSummaryReport_report.sizeLemmaNextWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_11_13_TimeBasedScheduleSummaryReport_report.sizeRange(ls, offset, from, to) == TTM_11_13_TimeBasedScheduleSummaryReport_report.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(ls: Vector[TTM_11_13_Report], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4095))
        require((0L <= offset) && (offset <= 9223372036854775807L - 187L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 187L * (to - from)))
        require((offset % 32L) == (otherOffset % 32L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 187L)
            assert(elemSizeOtherOff == 187L)
            ls.apply(from).sizeLemmaNextDWord(offset, otherOffset)
            TTM_11_13_TimeBasedScheduleSummaryReport_report.sizeLemmaNextDWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_11_13_TimeBasedScheduleSummaryReport_report.sizeRange(ls, offset, from, to) == TTM_11_13_TimeBasedScheduleSummaryReport_report.sizeRange(ls, otherOffset, from, to)
    }
}

case class TTM_11_13_TimeBasedScheduleSummaryReport (
    report: TTM_11_13_TimeBasedScheduleSummaryReport_report
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854010010L))
        val size_0 = 32L
        val size_1 = this.report.size(offset + size_0)
        size_0 + size_1
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 765797L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854010010L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854010010L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.report.size(offset + size_0_offset)
        val size_1_otherOffset = this.report.size(otherOffset + size_0_otherOffset)
        this.report.sizeLemmaAnyOffset(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854010010L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854010010L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.report.size(offset + size_0_offset)
        val size_1_otherOffset = this.report.size(otherOffset + size_0_otherOffset)
        this.report.sizeLemmaNextByte(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854010010L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854010010L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.report.size(offset + size_0_offset)
        val size_1_otherOffset = this.report.size(otherOffset + size_0_otherOffset)
        this.report.sizeLemmaNextWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854010010L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854010010L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.report.size(offset + size_0_offset)
        val size_1_otherOffset = this.report.size(otherOffset + size_0_otherOffset)
        this.report.sizeLemmaNextDWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TM_11_13_TIMEBASEDSCHEDULESUMMARYREPORT_REPORT: Int = 568 /*(SIZE(0 .. maxTM-11-13-ReportCount)) */
@inline @cCode.inline val ERR_TM_11_13_TIMEBASEDSCHEDULESUMMARYREPORT_REPORT_ELM_2: Int = 563 /* */

@inline @cCode.inline val ERR_TM_11_13_TIMEBASEDSCHEDULESUMMARYREPORT: Int = 573 /* */

 
 

@inline @cCode.inline val ERR_ACN_ENCODE_TM_11_13_TIMEBASEDSCHEDULESUMMARYREPORT: Int = 576 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_11_13_TIMEBASEDSCHEDULESUMMARYREPORT_N_UNINITIALIZED: Int = 577 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_11_13_TIMEBASEDSCHEDULESUMMARYREPORT_N: Int = 466 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_11_13_TIMEBASEDSCHEDULESUMMARYREPORT_REPORT: Int = 571 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_11_13_TIMEBASEDSCHEDULESUMMARYREPORT_REPORT_ELM_2: Int = 566 /*  */
@inline @cCode.inline val TTM_11_13_TimeBasedScheduleSummaryReport_REQUIRED_BYTES_FOR_ACN_ENCODING = 95725
@inline @cCode.inline val TTM_11_13_TimeBasedScheduleSummaryReport_REQUIRED_BITS_FOR_ACN_ENCODING = 765797

@inline @cCode.inline val ERR_ACN_DECODE_TM_11_13_TIMEBASEDSCHEDULESUMMARYREPORT: Int = 578 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_11_13_TIMEBASEDSCHEDULESUMMARYREPORT_N: Int = 467 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_11_13_TIMEBASEDSCHEDULESUMMARYREPORT_REPORT: Int = 572 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_11_13_TIMEBASEDSCHEDULESUMMARYREPORT_REPORT_ELM_2: Int = 567 /*  */

// @inline @cCode.inline val maxTM_11_13_ReportCount: Int = 4095 // defined in body

