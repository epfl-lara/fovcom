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

/*-- TTC_6_5_DataArea --------------------------------------------*/

case class TTC_6_5_DataArea (
    startAddress: TPUSC_UINT32, 
    length: TPUSC_UINT32
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775743L))
        val size_0 = 32L
        val size_1 = 32L
        size_0 + size_1
    }.ensuring { (res: Long) => 
        res == 64L
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775743L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775743L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775743L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775743L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775743L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775743L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775743L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775743L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TC_6_5_DATAAREA: Int = 1813 /* */
@inline @cCode.inline val ERR_TC_6_5_DATAAREA_STARTADDRESS_2_2: Int = 1798 /* */
@inline @cCode.inline val ERR_TC_6_5_DATAAREA_LENGTH_2: Int = 1808 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_5_DATAAREA: Int = 1816 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_5_DATAAREA_STARTADDRESS_2_2: Int = 1801 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_5_DATAAREA_LENGTH_2: Int = 1811 /*  */
@inline @cCode.inline val TTC_6_5_DataArea_REQUIRED_BYTES_FOR_ACN_ENCODING = 8
@inline @cCode.inline val TTC_6_5_DataArea_REQUIRED_BITS_FOR_ACN_ENCODING = 64

@inline @cCode.inline val ERR_ACN_DECODE_TC_6_5_DATAAREA: Int = 1817 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_6_5_DATAAREA_STARTADDRESS_2_2: Int = 1802 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_6_5_DATAAREA_LENGTH_2: Int = 1812 /*  */
/*-- TTC_6_5_DumpRawMemoryData --------------------------------------------*/


case class TTC_6_5_DumpRawMemoryData_dataAreas (nCount: Int, arr: Vector[TTC_6_5_DataArea])
{
    require(this.arr.size <= 63 && 1 <= this.nCount && this.nCount <= this.arr.size)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854771775L))
        TTC_6_5_DumpRawMemoryData_dataAreas.sizeRange(this.arr, offset, 0, this.nCount)
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 4032L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771775L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771775L))
        TTC_6_5_DumpRawMemoryData_dataAreas.sizeLemmaAnyOffset(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771775L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771775L))
        require((offset % 8L) == (otherOffset % 8L))
        TTC_6_5_DumpRawMemoryData_dataAreas.sizeLemmaNextByte(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771775L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771775L))
        require((offset % 16L) == (otherOffset % 16L))
        TTC_6_5_DumpRawMemoryData_dataAreas.sizeLemmaNextWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771775L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771775L))
        require((offset % 32L) == (otherOffset % 32L))
        TTC_6_5_DumpRawMemoryData_dataAreas.sizeLemmaNextDWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}
object TTC_6_5_DumpRawMemoryData_dataAreas {
    def sizeRange(ls: Vector[TTC_6_5_DataArea], offset: Long, from: Int, to: Int): Long = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 64L * (to - from)))
        decreases(to - from)
        if (from == to) {
            0L
        } else {
            val elemSize = ls.apply(from).size(offset)
            assert(elemSize == 64L)
            elemSize + TTC_6_5_DumpRawMemoryData_dataAreas.sizeRange(ls, offset + elemSize, from + 1, to)
        }
    }.ensuring { (res: Long) => 
        val nbElems = (to - from)
        (0L <= res && res <= 64L * nbElems)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(ls: Vector[TTC_6_5_DataArea], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 64L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 64L * (to - from)))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 64L)
            assert(elemSizeOtherOff == 64L)
            ls.apply(from).sizeLemmaAnyOffset(offset, otherOffset)
            TTC_6_5_DumpRawMemoryData_dataAreas.sizeLemmaAnyOffset(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_6_5_DumpRawMemoryData_dataAreas.sizeRange(ls, offset, from, to) == TTC_6_5_DumpRawMemoryData_dataAreas.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(ls: Vector[TTC_6_5_DataArea], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 64L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 64L * (to - from)))
        require((offset % 8L) == (otherOffset % 8L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 64L)
            assert(elemSizeOtherOff == 64L)
            ls.apply(from).sizeLemmaNextByte(offset, otherOffset)
            TTC_6_5_DumpRawMemoryData_dataAreas.sizeLemmaNextByte(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_6_5_DumpRawMemoryData_dataAreas.sizeRange(ls, offset, from, to) == TTC_6_5_DumpRawMemoryData_dataAreas.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(ls: Vector[TTC_6_5_DataArea], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 64L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 64L * (to - from)))
        require((offset % 16L) == (otherOffset % 16L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 64L)
            assert(elemSizeOtherOff == 64L)
            ls.apply(from).sizeLemmaNextWord(offset, otherOffset)
            TTC_6_5_DumpRawMemoryData_dataAreas.sizeLemmaNextWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_6_5_DumpRawMemoryData_dataAreas.sizeRange(ls, offset, from, to) == TTC_6_5_DumpRawMemoryData_dataAreas.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(ls: Vector[TTC_6_5_DataArea], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 64L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 64L * (to - from)))
        require((offset % 32L) == (otherOffset % 32L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 64L)
            assert(elemSizeOtherOff == 64L)
            ls.apply(from).sizeLemmaNextDWord(offset, otherOffset)
            TTC_6_5_DumpRawMemoryData_dataAreas.sizeLemmaNextDWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_6_5_DumpRawMemoryData_dataAreas.sizeRange(ls, offset, from, to) == TTC_6_5_DumpRawMemoryData_dataAreas.sizeRange(ls, otherOffset, from, to)
    }
}

case class TTC_6_5_DumpRawMemoryData (
    memory_ID: OptionMut[TMemory_ID], 
    dataAreas: TTC_6_5_DumpRawMemoryData_dataAreas
) {
    require(this.memory_ID.isDefined)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854771711L))
        val size_0 = (this.memory_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        })
        val size_1 = 32L
        val size_2 = this.dataAreas.size(offset + size_0 + size_1)
        size_0 + size_1 + size_2
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 4096L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771711L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771711L))
        val size_0_offset = (this.memory_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        })
        val size_0_otherOffset = this.memory_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = this.dataAreas.size(offset + size_0_offset + size_1_offset)
        val size_2_otherOffset = this.dataAreas.size(otherOffset + size_0_otherOffset + size_1_otherOffset)
        this.dataAreas.sizeLemmaAnyOffset(offset + size_0_offset + size_1_offset, otherOffset + size_0_otherOffset + size_1_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771711L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771711L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = (this.memory_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        })
        val size_0_otherOffset = this.memory_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = this.dataAreas.size(offset + size_0_offset + size_1_offset)
        val size_2_otherOffset = this.dataAreas.size(otherOffset + size_0_otherOffset + size_1_otherOffset)
        this.dataAreas.sizeLemmaNextByte(offset + size_0_offset + size_1_offset, otherOffset + size_0_otherOffset + size_1_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771711L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771711L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = (this.memory_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        })
        val size_0_otherOffset = this.memory_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = this.dataAreas.size(offset + size_0_offset + size_1_offset)
        val size_2_otherOffset = this.dataAreas.size(otherOffset + size_0_otherOffset + size_1_otherOffset)
        this.dataAreas.sizeLemmaNextWord(offset + size_0_offset + size_1_offset, otherOffset + size_0_otherOffset + size_1_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771711L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771711L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = (this.memory_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        })
        val size_0_otherOffset = this.memory_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = this.dataAreas.size(offset + size_0_offset + size_1_offset)
        val size_2_otherOffset = this.dataAreas.size(otherOffset + size_0_otherOffset + size_1_otherOffset)
        this.dataAreas.sizeLemmaNextDWord(offset + size_0_offset + size_1_offset, otherOffset + size_0_otherOffset + size_1_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TC_6_5_DUMPRAWMEMORYDATA_DATAAREAS: Int = 1777 /*(SIZE(1 .. maxTC-6-5-DataAreaCount)) */
@inline @cCode.inline val ERR_TC_6_5_DUMPRAWMEMORYDATA_DATAAREAS_ELM_2: Int = 1772 /* */

@inline @cCode.inline val ERR_TC_6_5_DUMPRAWMEMORYDATA: Int = 1782 /*(WITH COMPONENTS {memory-ID PRESENT}) */
@inline @cCode.inline val ERR_TC_6_5_DUMPRAWMEMORYDATA_MEMORY_ID_2: Int = 1735 /* */

 
 

@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_5_DUMPRAWMEMORYDATA: Int = 1785 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_5_DUMPRAWMEMORYDATA_MEMORY_ID_2: Int = 1738 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_5_DUMPRAWMEMORYDATA_N_UNINITIALIZED: Int = 1786 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_5_DUMPRAWMEMORYDATA_N: Int = 1740 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_5_DUMPRAWMEMORYDATA_DATAAREAS: Int = 1780 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_5_DUMPRAWMEMORYDATA_DATAAREAS_ELM_2: Int = 1775 /*  */
@inline @cCode.inline val TTC_6_5_DumpRawMemoryData_REQUIRED_BYTES_FOR_ACN_ENCODING = 512
@inline @cCode.inline val TTC_6_5_DumpRawMemoryData_REQUIRED_BITS_FOR_ACN_ENCODING = 4096

@inline @cCode.inline val ERR_ACN_DECODE_TC_6_5_DUMPRAWMEMORYDATA: Int = 1787 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_6_5_DUMPRAWMEMORYDATA_MEMORY_ID_2: Int = 1739 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_6_5_DUMPRAWMEMORYDATA_N: Int = 1741 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_6_5_DUMPRAWMEMORYDATA_DATAAREAS: Int = 1781 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_6_5_DUMPRAWMEMORYDATA_DATAAREAS_ELM_2: Int = 1776 /*  */

// @inline @cCode.inline val maxTC_6_5_DataAreaCount: Int = 63 // defined in body
