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

/*-- TTC_6_19_DataArea --------------------------------------------*/

case class TTC_6_19_DataArea_checksum(arr: Vector[UByte])
{
    require(this.arr.length == 2)
}

case class TTC_6_19_DataArea (
    startAddress: TPUSC_UINT32, 
    offsetInFile: TPUSC_UINT32, 
    length: TPUSC_UINT32, 
    checksum: OptionMut[TTC_6_19_DataArea_checksum]
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775694L))
        val size_0 = 1L
        val size_1 = 32L
        val size_2 = 32L
        val size_3 = 32L
        val size_4 = this.checksum match {
            case SomeMut(v) =>
                16L
            case NoneMut() =>
                0L
        }
        size_0 + size_1 + size_2 + size_3 + size_4
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 113L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775694L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775694L))
        val size_0_offset = 1L
        val size_0_otherOffset = 1L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = 32L
        val size_2_otherOffset = 32L
        val size_3_offset = 32L
        val size_3_otherOffset = 32L
        val size_4_offset = this.checksum match {
            case SomeMut(v) =>
                16L
            case NoneMut() =>
                0L
        }
        val size_4_otherOffset = this.checksum match {
            case SomeMut(v) =>
                16L
            case NoneMut() =>
                0L
        }
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775694L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775694L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 1L
        val size_0_otherOffset = 1L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = 32L
        val size_2_otherOffset = 32L
        val size_3_offset = 32L
        val size_3_otherOffset = 32L
        val size_4_offset = this.checksum match {
            case SomeMut(v) =>
                16L
            case NoneMut() =>
                0L
        }
        val size_4_otherOffset = this.checksum match {
            case SomeMut(v) =>
                16L
            case NoneMut() =>
                0L
        }
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775694L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775694L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 1L
        val size_0_otherOffset = 1L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = 32L
        val size_2_otherOffset = 32L
        val size_3_offset = 32L
        val size_3_otherOffset = 32L
        val size_4_offset = this.checksum match {
            case SomeMut(v) =>
                16L
            case NoneMut() =>
                0L
        }
        val size_4_otherOffset = this.checksum match {
            case SomeMut(v) =>
                16L
            case NoneMut() =>
                0L
        }
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775694L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775694L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 1L
        val size_0_otherOffset = 1L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = 32L
        val size_2_otherOffset = 32L
        val size_3_offset = 32L
        val size_3_otherOffset = 32L
        val size_4_offset = this.checksum match {
            case SomeMut(v) =>
                16L
            case NoneMut() =>
                0L
        }
        val size_4_otherOffset = this.checksum match {
            case SomeMut(v) =>
                16L
            case NoneMut() =>
                0L
        }
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TC_6_19_DATAAREA_CHECKSUM: Int = 544 /*(SIZE(16)) */

@inline @cCode.inline val ERR_TC_6_19_DATAAREA: Int = 549 /* */
@inline @cCode.inline val ERR_TC_6_19_DATAAREA_STARTADDRESS_2_2: Int = 519 /* */
@inline @cCode.inline val ERR_TC_6_19_DATAAREA_OFFSETINFILE_2: Int = 529 /* */
@inline @cCode.inline val ERR_TC_6_19_DATAAREA_LENGTH_2: Int = 539 /* */

 
 

@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_19_DATAAREA: Int = 552 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_19_DATAAREA_STARTADDRESS_2_2: Int = 522 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_19_DATAAREA_OFFSETINFILE_2: Int = 532 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_19_DATAAREA_LENGTH_2: Int = 542 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_19_DATAAREA_CHECKSUM: Int = 547 /*  */
@inline @cCode.inline val TTC_6_19_DataArea_REQUIRED_BYTES_FOR_ACN_ENCODING = 15
@inline @cCode.inline val TTC_6_19_DataArea_REQUIRED_BITS_FOR_ACN_ENCODING = 113

@inline @cCode.inline val ERR_ACN_DECODE_TC_6_19_DATAAREA: Int = 553 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_6_19_DATAAREA_STARTADDRESS_2_2: Int = 523 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_6_19_DATAAREA_OFFSETINFILE_2: Int = 533 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_6_19_DATAAREA_LENGTH_2: Int = 543 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_6_19_DATAAREA_CHECKSUM: Int = 548 /*  */
/*-- TTC_6_19_LoadRawMemoryDataAreasByReference --------------------------------------------*/


case class TTC_6_19_LoadRawMemoryDataAreasByReference_dataAreas (nCount: Int, arr: Vector[TTC_6_19_DataArea])
{
    require(this.arr.size <= 63 && 1 <= this.nCount && this.nCount <= this.arr.size)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854768688L))
        TTC_6_19_LoadRawMemoryDataAreasByReference_dataAreas.sizeRange(this.arr, offset, 0, this.nCount)
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 7119L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854768688L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854768688L))
        TTC_6_19_LoadRawMemoryDataAreasByReference_dataAreas.sizeLemmaAnyOffset(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854768688L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854768688L))
        require((offset % 8L) == (otherOffset % 8L))
        TTC_6_19_LoadRawMemoryDataAreasByReference_dataAreas.sizeLemmaNextByte(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854768688L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854768688L))
        require((offset % 16L) == (otherOffset % 16L))
        TTC_6_19_LoadRawMemoryDataAreasByReference_dataAreas.sizeLemmaNextWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854768688L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854768688L))
        require((offset % 32L) == (otherOffset % 32L))
        TTC_6_19_LoadRawMemoryDataAreasByReference_dataAreas.sizeLemmaNextDWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}
object TTC_6_19_LoadRawMemoryDataAreasByReference_dataAreas {
    def sizeRange(ls: Vector[TTC_6_19_DataArea], offset: Long, from: Int, to: Int): Long = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 113L * (to - from)))
        decreases(to - from)
        if (from == to) {
            0L
        } else {
            val elemSize = ls.apply(from).size(offset)
            assert(0L <= elemSize && elemSize <= 113L)
            elemSize + TTC_6_19_LoadRawMemoryDataAreasByReference_dataAreas.sizeRange(ls, offset + elemSize, from + 1, to)
        }
    }.ensuring { (res: Long) => 
        val nbElems = (to - from)
        (0L <= res && res <= 113L * nbElems)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(ls: Vector[TTC_6_19_DataArea], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 113L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 113L * (to - from)))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 113L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 113L)
            ls.apply(from).sizeLemmaAnyOffset(offset, otherOffset)
            TTC_6_19_LoadRawMemoryDataAreasByReference_dataAreas.sizeLemmaAnyOffset(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_6_19_LoadRawMemoryDataAreasByReference_dataAreas.sizeRange(ls, offset, from, to) == TTC_6_19_LoadRawMemoryDataAreasByReference_dataAreas.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(ls: Vector[TTC_6_19_DataArea], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 113L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 113L * (to - from)))
        require((offset % 8L) == (otherOffset % 8L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 113L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 113L)
            ls.apply(from).sizeLemmaNextByte(offset, otherOffset)
            TTC_6_19_LoadRawMemoryDataAreasByReference_dataAreas.sizeLemmaNextByte(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_6_19_LoadRawMemoryDataAreasByReference_dataAreas.sizeRange(ls, offset, from, to) == TTC_6_19_LoadRawMemoryDataAreasByReference_dataAreas.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(ls: Vector[TTC_6_19_DataArea], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 113L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 113L * (to - from)))
        require((offset % 16L) == (otherOffset % 16L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 113L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 113L)
            ls.apply(from).sizeLemmaNextWord(offset, otherOffset)
            TTC_6_19_LoadRawMemoryDataAreasByReference_dataAreas.sizeLemmaNextWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_6_19_LoadRawMemoryDataAreasByReference_dataAreas.sizeRange(ls, offset, from, to) == TTC_6_19_LoadRawMemoryDataAreasByReference_dataAreas.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(ls: Vector[TTC_6_19_DataArea], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 113L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 113L * (to - from)))
        require((offset % 32L) == (otherOffset % 32L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 113L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 113L)
            ls.apply(from).sizeLemmaNextDWord(offset, otherOffset)
            TTC_6_19_LoadRawMemoryDataAreasByReference_dataAreas.sizeLemmaNextDWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_6_19_LoadRawMemoryDataAreasByReference_dataAreas.sizeRange(ls, offset, from, to) == TTC_6_19_LoadRawMemoryDataAreasByReference_dataAreas.sizeRange(ls, otherOffset, from, to)
    }
}

case class TTC_6_19_LoadRawMemoryDataAreasByReference (
    memory_ID: OptionMut[TMemory_ID], 
    filePath: TFilePath, 
    dataAreas: TTC_6_19_LoadRawMemoryDataAreasByReference_dataAreas
) {
    require(this.memory_ID.isDefined)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854711270L))
        val size_0 = (this.memory_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        })
        val size_1 = this.filePath.size(offset + size_0)
        val size_2 = 32L
        val size_3 = this.dataAreas.size(offset + size_0 + size_1 + size_2)
        size_0 + size_1 + size_2 + size_3
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 64537L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854711270L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854711270L))
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
        val size_1_offset = this.filePath.size(offset + size_0_offset)
        val size_1_otherOffset = this.filePath.size(otherOffset + size_0_otherOffset)
        this.filePath.sizeLemmaAnyOffset(offset + size_0_offset, otherOffset + size_0_otherOffset)
        val size_2_offset = 32L
        val size_2_otherOffset = 32L
        val size_3_offset = this.dataAreas.size(offset + size_0_offset + size_1_offset + size_2_offset)
        val size_3_otherOffset = this.dataAreas.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        this.dataAreas.sizeLemmaAnyOffset(offset + size_0_offset + size_1_offset + size_2_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854711270L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854711270L))
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
        val size_1_offset = this.filePath.size(offset + size_0_offset)
        val size_1_otherOffset = this.filePath.size(otherOffset + size_0_otherOffset)
        this.filePath.sizeLemmaNextByte(offset + size_0_offset, otherOffset + size_0_otherOffset)
        val size_2_offset = 32L
        val size_2_otherOffset = 32L
        val size_3_offset = this.dataAreas.size(offset + size_0_offset + size_1_offset + size_2_offset)
        val size_3_otherOffset = this.dataAreas.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        this.dataAreas.sizeLemmaNextByte(offset + size_0_offset + size_1_offset + size_2_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854711270L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854711270L))
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
        val size_1_offset = this.filePath.size(offset + size_0_offset)
        val size_1_otherOffset = this.filePath.size(otherOffset + size_0_otherOffset)
        this.filePath.sizeLemmaNextWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        val size_2_offset = 32L
        val size_2_otherOffset = 32L
        val size_3_offset = this.dataAreas.size(offset + size_0_offset + size_1_offset + size_2_offset)
        val size_3_otherOffset = this.dataAreas.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        this.dataAreas.sizeLemmaNextWord(offset + size_0_offset + size_1_offset + size_2_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854711270L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854711270L))
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
        val size_1_offset = this.filePath.size(offset + size_0_offset)
        val size_1_otherOffset = this.filePath.size(otherOffset + size_0_otherOffset)
        this.filePath.sizeLemmaNextDWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        val size_2_offset = 32L
        val size_2_otherOffset = 32L
        val size_3_offset = this.dataAreas.size(offset + size_0_offset + size_1_offset + size_2_offset)
        val size_3_otherOffset = this.dataAreas.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        this.dataAreas.sizeLemmaNextDWord(offset + size_0_offset + size_1_offset + size_2_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TC_6_19_LOADRAWMEMORYDATAAREASBYREFERENCE_DATAAREAS: Int = 498 /*(SIZE(1 .. maxTC-6-19-DataAreaCount)) */
@inline @cCode.inline val ERR_TC_6_19_LOADRAWMEMORYDATAAREASBYREFERENCE_DATAAREAS_ELM_2: Int = 493 /* */

@inline @cCode.inline val ERR_TC_6_19_LOADRAWMEMORYDATAAREASBYREFERENCE: Int = 503 /*(WITH COMPONENTS {memory-ID PRESENT}) */
@inline @cCode.inline val ERR_TC_6_19_LOADRAWMEMORYDATAAREASBYREFERENCE_MEMORY_ID_2: Int = 411 /* */
@inline @cCode.inline val ERR_TC_6_19_LOADRAWMEMORYDATAAREASBYREFERENCE_FILEPATH_2: Int = 441 /* */

 
 

@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_19_LOADRAWMEMORYDATAAREASBYREFERENCE: Int = 506 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_19_LOADRAWMEMORYDATAAREASBYREFERENCE_MEMORY_ID_2: Int = 414 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_19_LOADRAWMEMORYDATAAREASBYREFERENCE_FILEPATH_2: Int = 444 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_19_LOADRAWMEMORYDATAAREASBYREFERENCE_N_UNINITIALIZED: Int = 507 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_19_LOADRAWMEMORYDATAAREASBYREFERENCE_N: Int = 446 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_19_LOADRAWMEMORYDATAAREASBYREFERENCE_DATAAREAS: Int = 501 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_19_LOADRAWMEMORYDATAAREASBYREFERENCE_DATAAREAS_ELM_2: Int = 496 /*  */
@inline @cCode.inline val TTC_6_19_LoadRawMemoryDataAreasByReference_REQUIRED_BYTES_FOR_ACN_ENCODING = 8068
@inline @cCode.inline val TTC_6_19_LoadRawMemoryDataAreasByReference_REQUIRED_BITS_FOR_ACN_ENCODING = 64537

@inline @cCode.inline val ERR_ACN_DECODE_TC_6_19_LOADRAWMEMORYDATAAREASBYREFERENCE: Int = 508 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_6_19_LOADRAWMEMORYDATAAREASBYREFERENCE_MEMORY_ID_2: Int = 415 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_6_19_LOADRAWMEMORYDATAAREASBYREFERENCE_FILEPATH_2: Int = 445 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_6_19_LOADRAWMEMORYDATAAREASBYREFERENCE_N: Int = 447 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_6_19_LOADRAWMEMORYDATAAREASBYREFERENCE_DATAAREAS: Int = 502 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_6_19_LOADRAWMEMORYDATAAREASBYREFERENCE_DATAAREAS_ELM_2: Int = 497 /*  */

// @inline @cCode.inline val maxTC_6_19_DataAreaCount: Int = 63 // defined in body
