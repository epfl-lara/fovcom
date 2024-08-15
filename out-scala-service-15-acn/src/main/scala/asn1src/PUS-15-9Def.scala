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

/*-- TTC_15_9_PacketRetrievalTimeRangeSetting --------------------------------------------*/

case class TTC_15_9_PacketRetrievalTimeRangeSetting (
    packetStore_ID: TPacketStore_ID, 
    retrievalPriority: OptionMut[TPacketStoreRetrievalPriority], 
    fromTime: TCDS_AbsoluteTime_PFC_2, 
    toTime: TCDS_AbsoluteTime_PFC_2
) {
    require(33 == this.packetStore_ID.length && this.packetStore_ID.indexOfOrLength(UByte.fromRaw(0.toByte)) <= 32)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775453L))
        val size_0 = 1L
        val size_1 = 224L
        val size_2 = this.retrievalPriority match {
            case SomeMut(v) =>
                1L
            case NoneMut() =>
                0L
        }
        val size_3 = this.fromTime.size(offset + size_0 + size_1 + size_2)
        val size_4 = this.toTime.size(offset + size_0 + size_1 + size_2 + size_3)
        size_0 + size_1 + size_2 + size_3 + size_4
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 354L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775453L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775453L))
        val size_0_offset = 1L
        val size_0_otherOffset = 1L
        val size_1_offset = 224L
        val size_1_otherOffset = 224L
        val size_2_offset = this.retrievalPriority match {
            case SomeMut(v) =>
                1L
            case NoneMut() =>
                0L
        }
        val size_2_otherOffset = this.retrievalPriority match {
            case SomeMut(v) =>
                1L
            case NoneMut() =>
                0L
        }
        val size_3_offset = this.fromTime.size(offset + size_0_offset + size_1_offset + size_2_offset)
        val size_3_otherOffset = this.fromTime.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        this.fromTime.sizeLemmaAnyOffset(offset + size_0_offset + size_1_offset + size_2_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        val size_4_offset = this.toTime.size(offset + size_0_offset + size_1_offset + size_2_offset + size_3_offset)
        val size_4_otherOffset = this.toTime.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset + size_3_otherOffset)
        this.toTime.sizeLemmaAnyOffset(offset + size_0_offset + size_1_offset + size_2_offset + size_3_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset + size_3_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775453L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775453L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 1L
        val size_0_otherOffset = 1L
        val size_1_offset = 224L
        val size_1_otherOffset = 224L
        val size_2_offset = this.retrievalPriority match {
            case SomeMut(v) =>
                1L
            case NoneMut() =>
                0L
        }
        val size_2_otherOffset = this.retrievalPriority match {
            case SomeMut(v) =>
                1L
            case NoneMut() =>
                0L
        }
        val size_3_offset = this.fromTime.size(offset + size_0_offset + size_1_offset + size_2_offset)
        val size_3_otherOffset = this.fromTime.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        this.fromTime.sizeLemmaNextByte(offset + size_0_offset + size_1_offset + size_2_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        val size_4_offset = this.toTime.size(offset + size_0_offset + size_1_offset + size_2_offset + size_3_offset)
        val size_4_otherOffset = this.toTime.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset + size_3_otherOffset)
        this.toTime.sizeLemmaNextByte(offset + size_0_offset + size_1_offset + size_2_offset + size_3_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset + size_3_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775453L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775453L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 1L
        val size_0_otherOffset = 1L
        val size_1_offset = 224L
        val size_1_otherOffset = 224L
        val size_2_offset = this.retrievalPriority match {
            case SomeMut(v) =>
                1L
            case NoneMut() =>
                0L
        }
        val size_2_otherOffset = this.retrievalPriority match {
            case SomeMut(v) =>
                1L
            case NoneMut() =>
                0L
        }
        val size_3_offset = this.fromTime.size(offset + size_0_offset + size_1_offset + size_2_offset)
        val size_3_otherOffset = this.fromTime.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        this.fromTime.sizeLemmaNextWord(offset + size_0_offset + size_1_offset + size_2_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        val size_4_offset = this.toTime.size(offset + size_0_offset + size_1_offset + size_2_offset + size_3_offset)
        val size_4_otherOffset = this.toTime.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset + size_3_otherOffset)
        this.toTime.sizeLemmaNextWord(offset + size_0_offset + size_1_offset + size_2_offset + size_3_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset + size_3_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775453L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775453L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 1L
        val size_0_otherOffset = 1L
        val size_1_offset = 224L
        val size_1_otherOffset = 224L
        val size_2_offset = this.retrievalPriority match {
            case SomeMut(v) =>
                1L
            case NoneMut() =>
                0L
        }
        val size_2_otherOffset = this.retrievalPriority match {
            case SomeMut(v) =>
                1L
            case NoneMut() =>
                0L
        }
        val size_3_offset = this.fromTime.size(offset + size_0_offset + size_1_offset + size_2_offset)
        val size_3_otherOffset = this.fromTime.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        this.fromTime.sizeLemmaNextDWord(offset + size_0_offset + size_1_offset + size_2_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        val size_4_offset = this.toTime.size(offset + size_0_offset + size_1_offset + size_2_offset + size_3_offset)
        val size_4_otherOffset = this.toTime.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset + size_3_otherOffset)
        this.toTime.sizeLemmaNextDWord(offset + size_0_offset + size_1_offset + size_2_offset + size_3_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset + size_3_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TC_15_9_PACKETRETRIEVALTIMERANGESETTING: Int = 2616 /* */
@inline @cCode.inline val ERR_TC_15_9_PACKETRETRIEVALTIMERANGESETTING_PACKETSTORE_ID_2: Int = 2541 /* */
@inline @cCode.inline val ERR_TC_15_9_PACKETRETRIEVALTIMERANGESETTING_RETRIEVALPRIORITY_2: Int = 2551 /* */
@inline @cCode.inline val ERR_TC_15_9_PACKETRETRIEVALTIMERANGESETTING_FROMTIME_2_2: Int = 2581 /* */
@inline @cCode.inline val ERR_TC_15_9_PACKETRETRIEVALTIMERANGESETTING_TOTIME_2_2: Int = 2611 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_TC_15_9_PACKETRETRIEVALTIMERANGESETTING: Int = 2619 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_15_9_PACKETRETRIEVALTIMERANGESETTING_PACKETSTORE_ID_2: Int = 2544 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_15_9_PACKETRETRIEVALTIMERANGESETTING_RETRIEVALPRIORITY_2: Int = 2554 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_15_9_PACKETRETRIEVALTIMERANGESETTING_FROMTIME_2_2: Int = 2584 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_15_9_PACKETRETRIEVALTIMERANGESETTING_TOTIME_2_2: Int = 2614 /*  */
@inline @cCode.inline val TTC_15_9_PacketRetrievalTimeRangeSetting_REQUIRED_BYTES_FOR_ACN_ENCODING = 45
@inline @cCode.inline val TTC_15_9_PacketRetrievalTimeRangeSetting_REQUIRED_BITS_FOR_ACN_ENCODING = 354

@inline @cCode.inline val ERR_ACN_DECODE_TC_15_9_PACKETRETRIEVALTIMERANGESETTING: Int = 2620 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_15_9_PACKETRETRIEVALTIMERANGESETTING_PACKETSTORE_ID_2: Int = 2545 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_15_9_PACKETRETRIEVALTIMERANGESETTING_RETRIEVALPRIORITY_2: Int = 2555 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_15_9_PACKETRETRIEVALTIMERANGESETTING_FROMTIME_2_2: Int = 2585 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_15_9_PACKETRETRIEVALTIMERANGESETTING_TOTIME_2_2: Int = 2615 /*  */
/*-- TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores --------------------------------------------*/


case class TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings (nCount: Int, arr: Vector[TTC_15_9_PacketRetrievalTimeRangeSetting])
{
    require(this.arr.size <= 32 && 1 <= this.nCount && this.nCount <= this.arr.size)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854764479L))
        TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings.sizeRange(this.arr, offset, 0, this.nCount)
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 11328L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854764479L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854764479L))
        TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings.sizeLemmaAnyOffset(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854764479L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854764479L))
        require((offset % 8L) == (otherOffset % 8L))
        TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings.sizeLemmaNextByte(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854764479L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854764479L))
        require((offset % 16L) == (otherOffset % 16L))
        TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings.sizeLemmaNextWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854764479L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854764479L))
        require((offset % 32L) == (otherOffset % 32L))
        TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings.sizeLemmaNextDWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}
object TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings {
    def sizeRange(ls: Vector[TTC_15_9_PacketRetrievalTimeRangeSetting], offset: Long, from: Int, to: Int): Long = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 32))
        require((0L <= offset) && (offset <= 9223372036854775807L - 354L * (to - from)))
        decreases(to - from)
        if (from == to) {
            0L
        } else {
            val elemSize = ls.apply(from).size(offset)
            assert(0L <= elemSize && elemSize <= 354L)
            elemSize + TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings.sizeRange(ls, offset + elemSize, from + 1, to)
        }
    }.ensuring { (res: Long) => 
        val nbElems = (to - from)
        (0L <= res && res <= 354L * nbElems)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(ls: Vector[TTC_15_9_PacketRetrievalTimeRangeSetting], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 32))
        require((0L <= offset) && (offset <= 9223372036854775807L - 354L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 354L * (to - from)))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 354L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 354L)
            ls.apply(from).sizeLemmaAnyOffset(offset, otherOffset)
            TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings.sizeLemmaAnyOffset(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings.sizeRange(ls, offset, from, to) == TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(ls: Vector[TTC_15_9_PacketRetrievalTimeRangeSetting], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 32))
        require((0L <= offset) && (offset <= 9223372036854775807L - 354L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 354L * (to - from)))
        require((offset % 8L) == (otherOffset % 8L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 354L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 354L)
            ls.apply(from).sizeLemmaNextByte(offset, otherOffset)
            TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings.sizeLemmaNextByte(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings.sizeRange(ls, offset, from, to) == TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(ls: Vector[TTC_15_9_PacketRetrievalTimeRangeSetting], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 32))
        require((0L <= offset) && (offset <= 9223372036854775807L - 354L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 354L * (to - from)))
        require((offset % 16L) == (otherOffset % 16L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 354L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 354L)
            ls.apply(from).sizeLemmaNextWord(offset, otherOffset)
            TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings.sizeLemmaNextWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings.sizeRange(ls, offset, from, to) == TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(ls: Vector[TTC_15_9_PacketRetrievalTimeRangeSetting], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 32))
        require((0L <= offset) && (offset <= 9223372036854775807L - 354L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 354L * (to - from)))
        require((offset % 32L) == (otherOffset % 32L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 354L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 354L)
            ls.apply(from).sizeLemmaNextDWord(offset, otherOffset)
            TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings.sizeLemmaNextDWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings.sizeRange(ls, offset, from, to) == TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings.sizeRange(ls, otherOffset, from, to)
    }
}

case class TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores (
    packetRetrievalTimeRangeSettings: TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854764447L))
        val size_0 = 32L
        val size_1 = this.packetRetrievalTimeRangeSettings.size(offset + size_0)
        size_0 + size_1
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 11360L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854764447L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854764447L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.packetRetrievalTimeRangeSettings.size(offset + size_0_offset)
        val size_1_otherOffset = this.packetRetrievalTimeRangeSettings.size(otherOffset + size_0_otherOffset)
        this.packetRetrievalTimeRangeSettings.sizeLemmaAnyOffset(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854764447L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854764447L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.packetRetrievalTimeRangeSettings.size(offset + size_0_offset)
        val size_1_otherOffset = this.packetRetrievalTimeRangeSettings.size(otherOffset + size_0_otherOffset)
        this.packetRetrievalTimeRangeSettings.sizeLemmaNextByte(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854764447L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854764447L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.packetRetrievalTimeRangeSettings.size(offset + size_0_offset)
        val size_1_otherOffset = this.packetRetrievalTimeRangeSettings.size(otherOffset + size_0_otherOffset)
        this.packetRetrievalTimeRangeSettings.sizeLemmaNextWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854764447L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854764447L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.packetRetrievalTimeRangeSettings.size(offset + size_0_offset)
        val size_1_otherOffset = this.packetRetrievalTimeRangeSettings.size(otherOffset + size_0_otherOffset)
        this.packetRetrievalTimeRangeSettings.sizeLemmaNextDWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TC_15_9_STARTTHEBY_TIME_RANGERETRIEVALOFPACKETSTORES_PACKETRETRIEVALTIMERANGESETTINGS: Int = 2525 /*(SIZE(1 .. maxPacketRetrievalTimeRangeSettingsSize)) */
@inline @cCode.inline val ERR_TC_15_9_STARTTHEBY_TIME_RANGERETRIEVALOFPACKETSTORES_PACKETRETRIEVALTIMERANGESETTINGS_ELM_2: Int = 2520 /* */

@inline @cCode.inline val ERR_TC_15_9_STARTTHEBY_TIME_RANGERETRIEVALOFPACKETSTORES: Int = 2530 /* */

 
 

@inline @cCode.inline val ERR_ACN_ENCODE_TC_15_9_STARTTHEBY_TIME_RANGERETRIEVALOFPACKETSTORES: Int = 2533 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_15_9_STARTTHEBY_TIME_RANGERETRIEVALOFPACKETSTORES_N_UNINITIALIZED: Int = 2534 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_15_9_STARTTHEBY_TIME_RANGERETRIEVALOFPACKETSTORES_N: Int = 2433 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_15_9_STARTTHEBY_TIME_RANGERETRIEVALOFPACKETSTORES_PACKETRETRIEVALTIMERANGESETTINGS: Int = 2528 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_15_9_STARTTHEBY_TIME_RANGERETRIEVALOFPACKETSTORES_PACKETRETRIEVALTIMERANGESETTINGS_ELM_2: Int = 2523 /*  */
@inline @cCode.inline val TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_REQUIRED_BYTES_FOR_ACN_ENCODING = 1420
@inline @cCode.inline val TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_REQUIRED_BITS_FOR_ACN_ENCODING = 11360

@inline @cCode.inline val ERR_ACN_DECODE_TC_15_9_STARTTHEBY_TIME_RANGERETRIEVALOFPACKETSTORES: Int = 2535 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_15_9_STARTTHEBY_TIME_RANGERETRIEVALOFPACKETSTORES_N: Int = 2434 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_15_9_STARTTHEBY_TIME_RANGERETRIEVALOFPACKETSTORES_PACKETRETRIEVALTIMERANGESETTINGS: Int = 2529 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_15_9_STARTTHEBY_TIME_RANGERETRIEVALOFPACKETSTORES_PACKETRETRIEVALTIMERANGESETTINGS_ELM_2: Int = 2524 /*  */

// @inline @cCode.inline val maxPacketRetrievalTimeRangeSettingsSize: Int = 32 // defined in body

