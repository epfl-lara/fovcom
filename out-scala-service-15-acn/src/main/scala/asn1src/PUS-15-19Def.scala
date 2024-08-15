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

/*-- TTM_15_19_PacketStoreStatusReportItem --------------------------------------------*/

case class TTM_15_19_PacketStoreStatusReportItem (
    packetStore: TPacketStore_ID, 
    packetStoreStatus: TPacketStoreStatus, 
    packetStoreOpenRetrievalStatus: TPacketStoreOpenRetrievalStatus, 
    packetStoreBy_Time_Range_Retrieval_Status: OptionMut[TPacketStoreTimeRangeRetrievalStatus]
) {
    require(33 == this.packetStore.length && this.packetStore.indexOfOrLength(UByte.fromRaw(0.toByte)) <= 32)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775579L))
        val size_0 = 1L
        val size_1 = 224L
        val size_2 = 1L
        val size_3 = 1L
        val size_4 = this.packetStoreBy_Time_Range_Retrieval_Status match {
            case SomeMut(v) =>
                1L
            case NoneMut() =>
                0L
        }
        size_0 + size_1 + size_2 + size_3 + size_4
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 228L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775579L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775579L))
        val size_0_offset = 1L
        val size_0_otherOffset = 1L
        val size_1_offset = 224L
        val size_1_otherOffset = 224L
        val size_2_offset = 1L
        val size_2_otherOffset = 1L
        val size_3_offset = 1L
        val size_3_otherOffset = 1L
        val size_4_offset = this.packetStoreBy_Time_Range_Retrieval_Status match {
            case SomeMut(v) =>
                1L
            case NoneMut() =>
                0L
        }
        val size_4_otherOffset = this.packetStoreBy_Time_Range_Retrieval_Status match {
            case SomeMut(v) =>
                1L
            case NoneMut() =>
                0L
        }
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775579L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775579L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 1L
        val size_0_otherOffset = 1L
        val size_1_offset = 224L
        val size_1_otherOffset = 224L
        val size_2_offset = 1L
        val size_2_otherOffset = 1L
        val size_3_offset = 1L
        val size_3_otherOffset = 1L
        val size_4_offset = this.packetStoreBy_Time_Range_Retrieval_Status match {
            case SomeMut(v) =>
                1L
            case NoneMut() =>
                0L
        }
        val size_4_otherOffset = this.packetStoreBy_Time_Range_Retrieval_Status match {
            case SomeMut(v) =>
                1L
            case NoneMut() =>
                0L
        }
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775579L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775579L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 1L
        val size_0_otherOffset = 1L
        val size_1_offset = 224L
        val size_1_otherOffset = 224L
        val size_2_offset = 1L
        val size_2_otherOffset = 1L
        val size_3_offset = 1L
        val size_3_otherOffset = 1L
        val size_4_offset = this.packetStoreBy_Time_Range_Retrieval_Status match {
            case SomeMut(v) =>
                1L
            case NoneMut() =>
                0L
        }
        val size_4_otherOffset = this.packetStoreBy_Time_Range_Retrieval_Status match {
            case SomeMut(v) =>
                1L
            case NoneMut() =>
                0L
        }
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775579L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775579L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 1L
        val size_0_otherOffset = 1L
        val size_1_offset = 224L
        val size_1_otherOffset = 224L
        val size_2_offset = 1L
        val size_2_otherOffset = 1L
        val size_3_offset = 1L
        val size_3_otherOffset = 1L
        val size_4_offset = this.packetStoreBy_Time_Range_Retrieval_Status match {
            case SomeMut(v) =>
                1L
            case NoneMut() =>
                0L
        }
        val size_4_otherOffset = this.packetStoreBy_Time_Range_Retrieval_Status match {
            case SomeMut(v) =>
                1L
            case NoneMut() =>
                0L
        }
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TM_15_19_PACKETSTORESTATUSREPORTITEM: Int = 820 /* */
@inline @cCode.inline val ERR_TM_15_19_PACKETSTORESTATUSREPORTITEM_PACKETSTORE_2: Int = 785 /* */
@inline @cCode.inline val ERR_TM_15_19_PACKETSTORESTATUSREPORTITEM_PACKETSTORESTATUS_2: Int = 795 /* */
@inline @cCode.inline val ERR_TM_15_19_PACKETSTORESTATUSREPORTITEM_PACKETSTOREOPENRETRIEVALSTATUS_2: Int = 805 /* */
@inline @cCode.inline val ERR_TM_15_19_PACKETSTORESTATUSREPORTITEM_PACKETSTOREBY_TIME_RANGE_RETRIEVAL_STATUS_2: Int = 815 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_TM_15_19_PACKETSTORESTATUSREPORTITEM: Int = 823 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_15_19_PACKETSTORESTATUSREPORTITEM_PACKETSTORE_2: Int = 788 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_15_19_PACKETSTORESTATUSREPORTITEM_PACKETSTORESTATUS_2: Int = 798 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_15_19_PACKETSTORESTATUSREPORTITEM_PACKETSTOREOPENRETRIEVALSTATUS_2: Int = 808 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_15_19_PACKETSTORESTATUSREPORTITEM_PACKETSTOREBY_TIME_RANGE_RETRIEVAL_STATUS_2: Int = 818 /*  */
@inline @cCode.inline val TTM_15_19_PacketStoreStatusReportItem_REQUIRED_BYTES_FOR_ACN_ENCODING = 29
@inline @cCode.inline val TTM_15_19_PacketStoreStatusReportItem_REQUIRED_BITS_FOR_ACN_ENCODING = 228

@inline @cCode.inline val ERR_ACN_DECODE_TM_15_19_PACKETSTORESTATUSREPORTITEM: Int = 824 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_15_19_PACKETSTORESTATUSREPORTITEM_PACKETSTORE_2: Int = 789 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_15_19_PACKETSTORESTATUSREPORTITEM_PACKETSTORESTATUS_2: Int = 799 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_15_19_PACKETSTORESTATUSREPORTITEM_PACKETSTOREOPENRETRIEVALSTATUS_2: Int = 809 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_15_19_PACKETSTORESTATUSREPORTITEM_PACKETSTOREBY_TIME_RANGE_RETRIEVAL_STATUS_2: Int = 819 /*  */
/*-- TTM_15_19_PacketStoreStatusReport --------------------------------------------*/


case class TTM_15_19_PacketStoreStatusReport_packetStoreStatusReports (nCount: Int, arr: Vector[TTM_15_19_PacketStoreStatusReportItem])
{
    require(this.arr.size <= 32 && 1 <= this.nCount && this.nCount <= this.arr.size)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854768511L))
        TTM_15_19_PacketStoreStatusReport_packetStoreStatusReports.sizeRange(this.arr, offset, 0, this.nCount)
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 7296L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854768511L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854768511L))
        TTM_15_19_PacketStoreStatusReport_packetStoreStatusReports.sizeLemmaAnyOffset(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854768511L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854768511L))
        require((offset % 8L) == (otherOffset % 8L))
        TTM_15_19_PacketStoreStatusReport_packetStoreStatusReports.sizeLemmaNextByte(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854768511L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854768511L))
        require((offset % 16L) == (otherOffset % 16L))
        TTM_15_19_PacketStoreStatusReport_packetStoreStatusReports.sizeLemmaNextWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854768511L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854768511L))
        require((offset % 32L) == (otherOffset % 32L))
        TTM_15_19_PacketStoreStatusReport_packetStoreStatusReports.sizeLemmaNextDWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}
object TTM_15_19_PacketStoreStatusReport_packetStoreStatusReports {
    def sizeRange(ls: Vector[TTM_15_19_PacketStoreStatusReportItem], offset: Long, from: Int, to: Int): Long = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 32))
        require((0L <= offset) && (offset <= 9223372036854775807L - 228L * (to - from)))
        decreases(to - from)
        if (from == to) {
            0L
        } else {
            val elemSize = ls.apply(from).size(offset)
            assert(0L <= elemSize && elemSize <= 228L)
            elemSize + TTM_15_19_PacketStoreStatusReport_packetStoreStatusReports.sizeRange(ls, offset + elemSize, from + 1, to)
        }
    }.ensuring { (res: Long) => 
        val nbElems = (to - from)
        (0L <= res && res <= 228L * nbElems)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(ls: Vector[TTM_15_19_PacketStoreStatusReportItem], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 32))
        require((0L <= offset) && (offset <= 9223372036854775807L - 228L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 228L * (to - from)))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 228L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 228L)
            ls.apply(from).sizeLemmaAnyOffset(offset, otherOffset)
            TTM_15_19_PacketStoreStatusReport_packetStoreStatusReports.sizeLemmaAnyOffset(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_15_19_PacketStoreStatusReport_packetStoreStatusReports.sizeRange(ls, offset, from, to) == TTM_15_19_PacketStoreStatusReport_packetStoreStatusReports.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(ls: Vector[TTM_15_19_PacketStoreStatusReportItem], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 32))
        require((0L <= offset) && (offset <= 9223372036854775807L - 228L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 228L * (to - from)))
        require((offset % 8L) == (otherOffset % 8L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 228L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 228L)
            ls.apply(from).sizeLemmaNextByte(offset, otherOffset)
            TTM_15_19_PacketStoreStatusReport_packetStoreStatusReports.sizeLemmaNextByte(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_15_19_PacketStoreStatusReport_packetStoreStatusReports.sizeRange(ls, offset, from, to) == TTM_15_19_PacketStoreStatusReport_packetStoreStatusReports.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(ls: Vector[TTM_15_19_PacketStoreStatusReportItem], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 32))
        require((0L <= offset) && (offset <= 9223372036854775807L - 228L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 228L * (to - from)))
        require((offset % 16L) == (otherOffset % 16L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 228L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 228L)
            ls.apply(from).sizeLemmaNextWord(offset, otherOffset)
            TTM_15_19_PacketStoreStatusReport_packetStoreStatusReports.sizeLemmaNextWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_15_19_PacketStoreStatusReport_packetStoreStatusReports.sizeRange(ls, offset, from, to) == TTM_15_19_PacketStoreStatusReport_packetStoreStatusReports.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(ls: Vector[TTM_15_19_PacketStoreStatusReportItem], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 32))
        require((0L <= offset) && (offset <= 9223372036854775807L - 228L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 228L * (to - from)))
        require((offset % 32L) == (otherOffset % 32L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 228L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 228L)
            ls.apply(from).sizeLemmaNextDWord(offset, otherOffset)
            TTM_15_19_PacketStoreStatusReport_packetStoreStatusReports.sizeLemmaNextDWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_15_19_PacketStoreStatusReport_packetStoreStatusReports.sizeRange(ls, offset, from, to) == TTM_15_19_PacketStoreStatusReport_packetStoreStatusReports.sizeRange(ls, otherOffset, from, to)
    }
}

case class TTM_15_19_PacketStoreStatusReport (
    packetStoreStatusReports: TTM_15_19_PacketStoreStatusReport_packetStoreStatusReports
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854768479L))
        val size_0 = 32L
        val size_1 = this.packetStoreStatusReports.size(offset + size_0)
        size_0 + size_1
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 7328L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854768479L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854768479L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.packetStoreStatusReports.size(offset + size_0_offset)
        val size_1_otherOffset = this.packetStoreStatusReports.size(otherOffset + size_0_otherOffset)
        this.packetStoreStatusReports.sizeLemmaAnyOffset(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854768479L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854768479L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.packetStoreStatusReports.size(offset + size_0_offset)
        val size_1_otherOffset = this.packetStoreStatusReports.size(otherOffset + size_0_otherOffset)
        this.packetStoreStatusReports.sizeLemmaNextByte(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854768479L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854768479L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.packetStoreStatusReports.size(offset + size_0_offset)
        val size_1_otherOffset = this.packetStoreStatusReports.size(otherOffset + size_0_otherOffset)
        this.packetStoreStatusReports.sizeLemmaNextWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854768479L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854768479L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.packetStoreStatusReports.size(offset + size_0_offset)
        val size_1_otherOffset = this.packetStoreStatusReports.size(otherOffset + size_0_otherOffset)
        this.packetStoreStatusReports.sizeLemmaNextDWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TM_15_19_PACKETSTORESTATUSREPORT_PACKETSTORESTATUSREPORTS: Int = 769 /*(SIZE(1 .. maxPacketStoreStatusReportsSize)) */
@inline @cCode.inline val ERR_TM_15_19_PACKETSTORESTATUSREPORT_PACKETSTORESTATUSREPORTS_ELM_2: Int = 764 /* */

@inline @cCode.inline val ERR_TM_15_19_PACKETSTORESTATUSREPORT: Int = 774 /* */

 
 

@inline @cCode.inline val ERR_ACN_ENCODE_TM_15_19_PACKETSTORESTATUSREPORT: Int = 777 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_15_19_PACKETSTORESTATUSREPORT_N_UNINITIALIZED: Int = 778 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_15_19_PACKETSTORESTATUSREPORT_N: Int = 717 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_15_19_PACKETSTORESTATUSREPORT_PACKETSTORESTATUSREPORTS: Int = 772 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_15_19_PACKETSTORESTATUSREPORT_PACKETSTORESTATUSREPORTS_ELM_2: Int = 767 /*  */
@inline @cCode.inline val TTM_15_19_PacketStoreStatusReport_REQUIRED_BYTES_FOR_ACN_ENCODING = 916
@inline @cCode.inline val TTM_15_19_PacketStoreStatusReport_REQUIRED_BITS_FOR_ACN_ENCODING = 7328

@inline @cCode.inline val ERR_ACN_DECODE_TM_15_19_PACKETSTORESTATUSREPORT: Int = 779 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_15_19_PACKETSTORESTATUSREPORT_N: Int = 718 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_15_19_PACKETSTORESTATUSREPORT_PACKETSTORESTATUSREPORTS: Int = 773 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_15_19_PACKETSTORESTATUSREPORT_PACKETSTORESTATUSREPORTS_ELM_2: Int = 768 /*  */

// @inline @cCode.inline val maxPacketStoreStatusReportsSize: Int = 32 // defined in body
