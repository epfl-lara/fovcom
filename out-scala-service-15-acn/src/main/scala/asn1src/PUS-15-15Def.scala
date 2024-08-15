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

/*-- TTC_15_15_PacketStoresToResume --------------------------------------------*/

case class TTC_15_15_PacketStoresToResume (
    packetStore_ID: TPacketStore_ID, 
    retrievalPriority: OptionMut[TPacketStoreRetrievalPriority]
) {
    require(33 == this.packetStore_ID.length && this.packetStore_ID.indexOfOrLength(UByte.fromRaw(0.toByte)) <= 32)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775581L))
        val size_0 = 1L
        val size_1 = 224L
        val size_2 = this.retrievalPriority match {
            case SomeMut(v) =>
                1L
            case NoneMut() =>
                0L
        }
        size_0 + size_1 + size_2
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 226L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775581L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775581L))
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
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775581L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775581L))
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
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775581L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775581L))
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
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775581L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775581L))
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
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TC_15_15_PACKETSTORESTORESUME: Int = 644 /* */
@inline @cCode.inline val ERR_TC_15_15_PACKETSTORESTORESUME_PACKETSTORE_ID_2: Int = 629 /* */
@inline @cCode.inline val ERR_TC_15_15_PACKETSTORESTORESUME_RETRIEVALPRIORITY_2: Int = 639 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_TC_15_15_PACKETSTORESTORESUME: Int = 647 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_15_15_PACKETSTORESTORESUME_PACKETSTORE_ID_2: Int = 632 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_15_15_PACKETSTORESTORESUME_RETRIEVALPRIORITY_2: Int = 642 /*  */
@inline @cCode.inline val TTC_15_15_PacketStoresToResume_REQUIRED_BYTES_FOR_ACN_ENCODING = 29
@inline @cCode.inline val TTC_15_15_PacketStoresToResume_REQUIRED_BITS_FOR_ACN_ENCODING = 226

@inline @cCode.inline val ERR_ACN_DECODE_TC_15_15_PACKETSTORESTORESUME: Int = 648 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_15_15_PACKETSTORESTORESUME_PACKETSTORE_ID_2: Int = 633 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_15_15_PACKETSTORESTORESUME_RETRIEVALPRIORITY_2: Int = 643 /*  */
/*-- TTC_15_15_ResumeTheOpenRetrievalOfPacketStores --------------------------------------------*/


case class TTC_15_15_ResumeTheOpenRetrievalOfPacketStores_packetStoresToResume (nCount: Int, arr: Vector[TTC_15_15_PacketStoresToResume])
{
    require(this.arr.size <= 32 && 1 <= this.nCount && this.nCount <= this.arr.size)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854768575L))
        TTC_15_15_ResumeTheOpenRetrievalOfPacketStores_packetStoresToResume.sizeRange(this.arr, offset, 0, this.nCount)
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 7232L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854768575L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854768575L))
        TTC_15_15_ResumeTheOpenRetrievalOfPacketStores_packetStoresToResume.sizeLemmaAnyOffset(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854768575L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854768575L))
        require((offset % 8L) == (otherOffset % 8L))
        TTC_15_15_ResumeTheOpenRetrievalOfPacketStores_packetStoresToResume.sizeLemmaNextByte(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854768575L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854768575L))
        require((offset % 16L) == (otherOffset % 16L))
        TTC_15_15_ResumeTheOpenRetrievalOfPacketStores_packetStoresToResume.sizeLemmaNextWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854768575L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854768575L))
        require((offset % 32L) == (otherOffset % 32L))
        TTC_15_15_ResumeTheOpenRetrievalOfPacketStores_packetStoresToResume.sizeLemmaNextDWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}
object TTC_15_15_ResumeTheOpenRetrievalOfPacketStores_packetStoresToResume {
    def sizeRange(ls: Vector[TTC_15_15_PacketStoresToResume], offset: Long, from: Int, to: Int): Long = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 32))
        require((0L <= offset) && (offset <= 9223372036854775807L - 226L * (to - from)))
        decreases(to - from)
        if (from == to) {
            0L
        } else {
            val elemSize = ls.apply(from).size(offset)
            assert(0L <= elemSize && elemSize <= 226L)
            elemSize + TTC_15_15_ResumeTheOpenRetrievalOfPacketStores_packetStoresToResume.sizeRange(ls, offset + elemSize, from + 1, to)
        }
    }.ensuring { (res: Long) => 
        val nbElems = (to - from)
        (0L <= res && res <= 226L * nbElems)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(ls: Vector[TTC_15_15_PacketStoresToResume], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 32))
        require((0L <= offset) && (offset <= 9223372036854775807L - 226L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 226L * (to - from)))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 226L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 226L)
            ls.apply(from).sizeLemmaAnyOffset(offset, otherOffset)
            TTC_15_15_ResumeTheOpenRetrievalOfPacketStores_packetStoresToResume.sizeLemmaAnyOffset(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_15_15_ResumeTheOpenRetrievalOfPacketStores_packetStoresToResume.sizeRange(ls, offset, from, to) == TTC_15_15_ResumeTheOpenRetrievalOfPacketStores_packetStoresToResume.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(ls: Vector[TTC_15_15_PacketStoresToResume], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 32))
        require((0L <= offset) && (offset <= 9223372036854775807L - 226L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 226L * (to - from)))
        require((offset % 8L) == (otherOffset % 8L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 226L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 226L)
            ls.apply(from).sizeLemmaNextByte(offset, otherOffset)
            TTC_15_15_ResumeTheOpenRetrievalOfPacketStores_packetStoresToResume.sizeLemmaNextByte(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_15_15_ResumeTheOpenRetrievalOfPacketStores_packetStoresToResume.sizeRange(ls, offset, from, to) == TTC_15_15_ResumeTheOpenRetrievalOfPacketStores_packetStoresToResume.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(ls: Vector[TTC_15_15_PacketStoresToResume], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 32))
        require((0L <= offset) && (offset <= 9223372036854775807L - 226L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 226L * (to - from)))
        require((offset % 16L) == (otherOffset % 16L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 226L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 226L)
            ls.apply(from).sizeLemmaNextWord(offset, otherOffset)
            TTC_15_15_ResumeTheOpenRetrievalOfPacketStores_packetStoresToResume.sizeLemmaNextWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_15_15_ResumeTheOpenRetrievalOfPacketStores_packetStoresToResume.sizeRange(ls, offset, from, to) == TTC_15_15_ResumeTheOpenRetrievalOfPacketStores_packetStoresToResume.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(ls: Vector[TTC_15_15_PacketStoresToResume], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 32))
        require((0L <= offset) && (offset <= 9223372036854775807L - 226L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 226L * (to - from)))
        require((offset % 32L) == (otherOffset % 32L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 226L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 226L)
            ls.apply(from).sizeLemmaNextDWord(offset, otherOffset)
            TTC_15_15_ResumeTheOpenRetrievalOfPacketStores_packetStoresToResume.sizeLemmaNextDWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_15_15_ResumeTheOpenRetrievalOfPacketStores_packetStoresToResume.sizeRange(ls, offset, from, to) == TTC_15_15_ResumeTheOpenRetrievalOfPacketStores_packetStoresToResume.sizeRange(ls, otherOffset, from, to)
    }
}

case class TTC_15_15_ResumeTheOpenRetrievalOfPacketStores (
    packetStoresToResume: TTC_15_15_ResumeTheOpenRetrievalOfPacketStores_packetStoresToResume
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854768543L))
        val size_0 = 32L
        val size_1 = this.packetStoresToResume.size(offset + size_0)
        size_0 + size_1
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 7264L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854768543L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854768543L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.packetStoresToResume.size(offset + size_0_offset)
        val size_1_otherOffset = this.packetStoresToResume.size(otherOffset + size_0_otherOffset)
        this.packetStoresToResume.sizeLemmaAnyOffset(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854768543L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854768543L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.packetStoresToResume.size(offset + size_0_offset)
        val size_1_otherOffset = this.packetStoresToResume.size(otherOffset + size_0_otherOffset)
        this.packetStoresToResume.sizeLemmaNextByte(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854768543L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854768543L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.packetStoresToResume.size(offset + size_0_offset)
        val size_1_otherOffset = this.packetStoresToResume.size(otherOffset + size_0_otherOffset)
        this.packetStoresToResume.sizeLemmaNextWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854768543L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854768543L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.packetStoresToResume.size(offset + size_0_offset)
        val size_1_otherOffset = this.packetStoresToResume.size(otherOffset + size_0_otherOffset)
        this.packetStoresToResume.sizeLemmaNextDWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TC_15_15_RESUMETHEOPENRETRIEVALOFPACKETSTORES_PACKETSTORESTORESUME: Int = 613 /*(SIZE(1 .. maxPacketStoresToResumeSize)) */
@inline @cCode.inline val ERR_TC_15_15_RESUMETHEOPENRETRIEVALOFPACKETSTORES_PACKETSTORESTORESUME_ELM_2: Int = 608 /* */

@inline @cCode.inline val ERR_TC_15_15_RESUMETHEOPENRETRIEVALOFPACKETSTORES: Int = 618 /* */

 
 

@inline @cCode.inline val ERR_ACN_ENCODE_TC_15_15_RESUMETHEOPENRETRIEVALOFPACKETSTORES: Int = 621 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_15_15_RESUMETHEOPENRETRIEVALOFPACKETSTORES_N_UNINITIALIZED: Int = 622 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_15_15_RESUMETHEOPENRETRIEVALOFPACKETSTORES_N: Int = 581 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_15_15_RESUMETHEOPENRETRIEVALOFPACKETSTORES_PACKETSTORESTORESUME: Int = 616 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_15_15_RESUMETHEOPENRETRIEVALOFPACKETSTORES_PACKETSTORESTORESUME_ELM_2: Int = 611 /*  */
@inline @cCode.inline val TTC_15_15_ResumeTheOpenRetrievalOfPacketStores_REQUIRED_BYTES_FOR_ACN_ENCODING = 908
@inline @cCode.inline val TTC_15_15_ResumeTheOpenRetrievalOfPacketStores_REQUIRED_BITS_FOR_ACN_ENCODING = 7264

@inline @cCode.inline val ERR_ACN_DECODE_TC_15_15_RESUMETHEOPENRETRIEVALOFPACKETSTORES: Int = 623 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_15_15_RESUMETHEOPENRETRIEVALOFPACKETSTORES_N: Int = 582 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_15_15_RESUMETHEOPENRETRIEVALOFPACKETSTORES_PACKETSTORESTORESUME: Int = 617 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_15_15_RESUMETHEOPENRETRIEVALOFPACKETSTORES_PACKETSTORESTORESUME_ELM_2: Int = 612 /*  */

// @inline @cCode.inline val maxPacketStoresToResumeSize: Int = 32 // defined in body

