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

/*-- TTM_18_9_OBCPExecutionStatus --------------------------------------------*/

case class TTM_18_9_OBCPExecutionStatus_obcpChecksum(arr: Vector[UByte])
{
    require(this.arr.length == 2)
}

case class TTM_18_9_OBCPExecutionStatus (
    obcp_ID: TOBCP_ID, 
    obcpChecksum: OptionMut[TTM_18_9_OBCPExecutionStatus_obcpChecksum], 
    obcpExecutionStatus: TOBCPExecutionStatus
) {
    require((6 == this.obcp_ID.length && this.obcp_ID.indexOfOrLength(UByte.fromRaw(0.toByte)) <= 5) && this.obcpChecksum.isDefined)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775754L))
        val size_0 = (35L)
        val size_1 = this.obcpChecksum match {
            case SomeMut(v) =>
                16L
            case NoneMut() =>
                0L
        }
        val size_2 = 2L
        size_0 + size_1 + size_2
    }.ensuring { (res: Long) => 
        res == 53L
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775754L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775754L))
        val size_0_offset = (35L)
        val size_0_otherOffset = 35L
        val size_1_offset = this.obcpChecksum match {
            case SomeMut(v) =>
                16L
            case NoneMut() =>
                0L
        }
        val size_1_otherOffset = this.obcpChecksum match {
            case SomeMut(v) =>
                16L
            case NoneMut() =>
                0L
        }
        val size_2_offset = 2L
        val size_2_otherOffset = 2L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775754L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775754L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = (35L)
        val size_0_otherOffset = 35L
        val size_1_offset = this.obcpChecksum match {
            case SomeMut(v) =>
                16L
            case NoneMut() =>
                0L
        }
        val size_1_otherOffset = this.obcpChecksum match {
            case SomeMut(v) =>
                16L
            case NoneMut() =>
                0L
        }
        val size_2_offset = 2L
        val size_2_otherOffset = 2L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775754L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775754L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = (35L)
        val size_0_otherOffset = 35L
        val size_1_offset = this.obcpChecksum match {
            case SomeMut(v) =>
                16L
            case NoneMut() =>
                0L
        }
        val size_1_otherOffset = this.obcpChecksum match {
            case SomeMut(v) =>
                16L
            case NoneMut() =>
                0L
        }
        val size_2_offset = 2L
        val size_2_otherOffset = 2L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775754L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775754L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = (35L)
        val size_0_otherOffset = 35L
        val size_1_offset = this.obcpChecksum match {
            case SomeMut(v) =>
                16L
            case NoneMut() =>
                0L
        }
        val size_1_otherOffset = this.obcpChecksum match {
            case SomeMut(v) =>
                16L
            case NoneMut() =>
                0L
        }
        val size_2_offset = 2L
        val size_2_otherOffset = 2L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TM_18_9_OBCPEXECUTIONSTATUS_OBCPCHECKSUM: Int = 664 /*(SIZE(16)) */

@inline @cCode.inline val ERR_TM_18_9_OBCPEXECUTIONSTATUS: Int = 679 /*(WITH COMPONENTS {obcpChecksum PRESENT}) */
@inline @cCode.inline val ERR_TM_18_9_OBCPEXECUTIONSTATUS_OBCP_ID_2: Int = 659 /* */
@inline @cCode.inline val ERR_TM_18_9_OBCPEXECUTIONSTATUS_OBCPEXECUTIONSTATUS_2: Int = 674 /* */

 
 

@inline @cCode.inline val ERR_ACN_ENCODE_TM_18_9_OBCPEXECUTIONSTATUS: Int = 682 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_18_9_OBCPEXECUTIONSTATUS_OBCP_ID_2: Int = 662 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_18_9_OBCPEXECUTIONSTATUS_OBCPCHECKSUM: Int = 667 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_18_9_OBCPEXECUTIONSTATUS_OBCPEXECUTIONSTATUS_2: Int = 677 /*  */
@inline @cCode.inline val TTM_18_9_OBCPExecutionStatus_REQUIRED_BYTES_FOR_ACN_ENCODING = 7
@inline @cCode.inline val TTM_18_9_OBCPExecutionStatus_REQUIRED_BITS_FOR_ACN_ENCODING = 53

@inline @cCode.inline val ERR_ACN_DECODE_TM_18_9_OBCPEXECUTIONSTATUS: Int = 683 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_18_9_OBCPEXECUTIONSTATUS_OBCP_ID_2: Int = 663 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_18_9_OBCPEXECUTIONSTATUS_OBCPCHECKSUM: Int = 668 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_18_9_OBCPEXECUTIONSTATUS_OBCPEXECUTIONSTATUS_2: Int = 678 /*  */
/*-- TTM_18_9_OBCPExecutionStatusReport --------------------------------------------*/


case class TTM_18_9_OBCPExecutionStatusReport_executionStatueses (nCount: Int, arr: Vector[TTM_18_9_OBCPExecutionStatus])
{
    require(this.arr.size <= 15 && 1 <= this.nCount && this.nCount <= this.arr.size)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775012L))
        TTM_18_9_OBCPExecutionStatusReport_executionStatueses.sizeRange(this.arr, offset, 0, this.nCount)
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 795L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775012L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775012L))
        TTM_18_9_OBCPExecutionStatusReport_executionStatueses.sizeLemmaAnyOffset(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775012L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775012L))
        require((offset % 8L) == (otherOffset % 8L))
        TTM_18_9_OBCPExecutionStatusReport_executionStatueses.sizeLemmaNextByte(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775012L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775012L))
        require((offset % 16L) == (otherOffset % 16L))
        TTM_18_9_OBCPExecutionStatusReport_executionStatueses.sizeLemmaNextWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775012L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775012L))
        require((offset % 32L) == (otherOffset % 32L))
        TTM_18_9_OBCPExecutionStatusReport_executionStatueses.sizeLemmaNextDWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}
object TTM_18_9_OBCPExecutionStatusReport_executionStatueses {
    def sizeRange(ls: Vector[TTM_18_9_OBCPExecutionStatus], offset: Long, from: Int, to: Int): Long = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 15))
        require((0L <= offset) && (offset <= 9223372036854775807L - 53L * (to - from)))
        decreases(to - from)
        if (from == to) {
            0L
        } else {
            val elemSize = ls.apply(from).size(offset)
            assert(elemSize == 53L)
            elemSize + TTM_18_9_OBCPExecutionStatusReport_executionStatueses.sizeRange(ls, offset + elemSize, from + 1, to)
        }
    }.ensuring { (res: Long) => 
        val nbElems = (to - from)
        (0L <= res && res <= 53L * nbElems)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(ls: Vector[TTM_18_9_OBCPExecutionStatus], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 15))
        require((0L <= offset) && (offset <= 9223372036854775807L - 53L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 53L * (to - from)))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 53L)
            assert(elemSizeOtherOff == 53L)
            ls.apply(from).sizeLemmaAnyOffset(offset, otherOffset)
            TTM_18_9_OBCPExecutionStatusReport_executionStatueses.sizeLemmaAnyOffset(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_18_9_OBCPExecutionStatusReport_executionStatueses.sizeRange(ls, offset, from, to) == TTM_18_9_OBCPExecutionStatusReport_executionStatueses.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(ls: Vector[TTM_18_9_OBCPExecutionStatus], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 15))
        require((0L <= offset) && (offset <= 9223372036854775807L - 53L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 53L * (to - from)))
        require((offset % 8L) == (otherOffset % 8L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 53L)
            assert(elemSizeOtherOff == 53L)
            ls.apply(from).sizeLemmaNextByte(offset, otherOffset)
            TTM_18_9_OBCPExecutionStatusReport_executionStatueses.sizeLemmaNextByte(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_18_9_OBCPExecutionStatusReport_executionStatueses.sizeRange(ls, offset, from, to) == TTM_18_9_OBCPExecutionStatusReport_executionStatueses.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(ls: Vector[TTM_18_9_OBCPExecutionStatus], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 15))
        require((0L <= offset) && (offset <= 9223372036854775807L - 53L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 53L * (to - from)))
        require((offset % 16L) == (otherOffset % 16L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 53L)
            assert(elemSizeOtherOff == 53L)
            ls.apply(from).sizeLemmaNextWord(offset, otherOffset)
            TTM_18_9_OBCPExecutionStatusReport_executionStatueses.sizeLemmaNextWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_18_9_OBCPExecutionStatusReport_executionStatueses.sizeRange(ls, offset, from, to) == TTM_18_9_OBCPExecutionStatusReport_executionStatueses.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(ls: Vector[TTM_18_9_OBCPExecutionStatus], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 15))
        require((0L <= offset) && (offset <= 9223372036854775807L - 53L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 53L * (to - from)))
        require((offset % 32L) == (otherOffset % 32L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 53L)
            assert(elemSizeOtherOff == 53L)
            ls.apply(from).sizeLemmaNextDWord(offset, otherOffset)
            TTM_18_9_OBCPExecutionStatusReport_executionStatueses.sizeLemmaNextDWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_18_9_OBCPExecutionStatusReport_executionStatueses.sizeRange(ls, offset, from, to) == TTM_18_9_OBCPExecutionStatusReport_executionStatueses.sizeRange(ls, otherOffset, from, to)
    }
}

case class TTM_18_9_OBCPExecutionStatusReport (
    executionStatueses: TTM_18_9_OBCPExecutionStatusReport_executionStatueses
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854774980L))
        val size_0 = 32L
        val size_1 = this.executionStatueses.size(offset + size_0)
        size_0 + size_1
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 827L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854774980L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854774980L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.executionStatueses.size(offset + size_0_offset)
        val size_1_otherOffset = this.executionStatueses.size(otherOffset + size_0_otherOffset)
        this.executionStatueses.sizeLemmaAnyOffset(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854774980L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854774980L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.executionStatueses.size(offset + size_0_offset)
        val size_1_otherOffset = this.executionStatueses.size(otherOffset + size_0_otherOffset)
        this.executionStatueses.sizeLemmaNextByte(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854774980L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854774980L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.executionStatueses.size(offset + size_0_offset)
        val size_1_otherOffset = this.executionStatueses.size(otherOffset + size_0_otherOffset)
        this.executionStatueses.sizeLemmaNextWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854774980L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854774980L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.executionStatueses.size(offset + size_0_offset)
        val size_1_otherOffset = this.executionStatueses.size(otherOffset + size_0_otherOffset)
        this.executionStatueses.sizeLemmaNextDWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TM_18_9_OBCPEXECUTIONSTATUSREPORT_EXECUTIONSTATUESES: Int = 643 /*(SIZE(1 .. maxTM-18-9-OBCPExecutionStatusCount)) */
@inline @cCode.inline val ERR_TM_18_9_OBCPEXECUTIONSTATUSREPORT_EXECUTIONSTATUESES_ELM_2: Int = 638 /* */

@inline @cCode.inline val ERR_TM_18_9_OBCPEXECUTIONSTATUSREPORT: Int = 648 /* */

 
 

@inline @cCode.inline val ERR_ACN_ENCODE_TM_18_9_OBCPEXECUTIONSTATUSREPORT: Int = 651 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_18_9_OBCPEXECUTIONSTATUSREPORT_N_UNINITIALIZED: Int = 652 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_18_9_OBCPEXECUTIONSTATUSREPORT_N: Int = 606 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_18_9_OBCPEXECUTIONSTATUSREPORT_EXECUTIONSTATUESES: Int = 646 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_18_9_OBCPEXECUTIONSTATUSREPORT_EXECUTIONSTATUESES_ELM_2: Int = 641 /*  */
@inline @cCode.inline val TTM_18_9_OBCPExecutionStatusReport_REQUIRED_BYTES_FOR_ACN_ENCODING = 104
@inline @cCode.inline val TTM_18_9_OBCPExecutionStatusReport_REQUIRED_BITS_FOR_ACN_ENCODING = 827

@inline @cCode.inline val ERR_ACN_DECODE_TM_18_9_OBCPEXECUTIONSTATUSREPORT: Int = 653 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_18_9_OBCPEXECUTIONSTATUSREPORT_N: Int = 607 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_18_9_OBCPEXECUTIONSTATUSREPORT_EXECUTIONSTATUESES: Int = 647 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_18_9_OBCPEXECUTIONSTATUSREPORT_EXECUTIONSTATUESES_ELM_2: Int = 642 /*  */

// @inline @cCode.inline val maxTM_18_9_OBCPExecutionStatusCount: Int = 15 // defined in body

