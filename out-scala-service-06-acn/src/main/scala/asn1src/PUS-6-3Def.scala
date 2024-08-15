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

/*-- TDumpObjectInstruction --------------------------------------------*/

case class TDumpObjectInstruction (
    offset: TPUSC_UINT32, 
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


@inline @cCode.inline val ERR_DUMPOBJECTINSTRUCTION: Int = 1543 /* */
@inline @cCode.inline val ERR_DUMPOBJECTINSTRUCTION_OFFSET_2: Int = 1528 /* */
@inline @cCode.inline val ERR_DUMPOBJECTINSTRUCTION_LENGTH_2: Int = 1538 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_DUMPOBJECTINSTRUCTION: Int = 1546 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_DUMPOBJECTINSTRUCTION_OFFSET_2: Int = 1531 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_DUMPOBJECTINSTRUCTION_LENGTH_2: Int = 1541 /*  */
@inline @cCode.inline val TDumpObjectInstruction_REQUIRED_BYTES_FOR_ACN_ENCODING = 8
@inline @cCode.inline val TDumpObjectInstruction_REQUIRED_BITS_FOR_ACN_ENCODING = 64

@inline @cCode.inline val ERR_ACN_DECODE_DUMPOBJECTINSTRUCTION: Int = 1547 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_DUMPOBJECTINSTRUCTION_OFFSET_2: Int = 1532 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_DUMPOBJECTINSTRUCTION_LENGTH_2: Int = 1542 /*  */
/*-- TTC_6_3_DumpObjectMemoryData --------------------------------------------*/


case class TTC_6_3_DumpObjectMemoryData_dumpObjectInstructions (nCount: Int, arr: Vector[TDumpObjectInstruction])
{
    require(this.arr.size <= 63 && 1 <= this.nCount && this.nCount <= this.arr.size)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854771775L))
        TTC_6_3_DumpObjectMemoryData_dumpObjectInstructions.sizeRange(this.arr, offset, 0, this.nCount)
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 4032L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771775L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771775L))
        TTC_6_3_DumpObjectMemoryData_dumpObjectInstructions.sizeLemmaAnyOffset(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771775L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771775L))
        require((offset % 8L) == (otherOffset % 8L))
        TTC_6_3_DumpObjectMemoryData_dumpObjectInstructions.sizeLemmaNextByte(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771775L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771775L))
        require((offset % 16L) == (otherOffset % 16L))
        TTC_6_3_DumpObjectMemoryData_dumpObjectInstructions.sizeLemmaNextWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771775L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771775L))
        require((offset % 32L) == (otherOffset % 32L))
        TTC_6_3_DumpObjectMemoryData_dumpObjectInstructions.sizeLemmaNextDWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}
object TTC_6_3_DumpObjectMemoryData_dumpObjectInstructions {
    def sizeRange(ls: Vector[TDumpObjectInstruction], offset: Long, from: Int, to: Int): Long = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 64L * (to - from)))
        decreases(to - from)
        if (from == to) {
            0L
        } else {
            val elemSize = ls.apply(from).size(offset)
            assert(elemSize == 64L)
            elemSize + TTC_6_3_DumpObjectMemoryData_dumpObjectInstructions.sizeRange(ls, offset + elemSize, from + 1, to)
        }
    }.ensuring { (res: Long) => 
        val nbElems = (to - from)
        (0L <= res && res <= 64L * nbElems)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(ls: Vector[TDumpObjectInstruction], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
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
            TTC_6_3_DumpObjectMemoryData_dumpObjectInstructions.sizeLemmaAnyOffset(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_6_3_DumpObjectMemoryData_dumpObjectInstructions.sizeRange(ls, offset, from, to) == TTC_6_3_DumpObjectMemoryData_dumpObjectInstructions.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(ls: Vector[TDumpObjectInstruction], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
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
            TTC_6_3_DumpObjectMemoryData_dumpObjectInstructions.sizeLemmaNextByte(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_6_3_DumpObjectMemoryData_dumpObjectInstructions.sizeRange(ls, offset, from, to) == TTC_6_3_DumpObjectMemoryData_dumpObjectInstructions.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(ls: Vector[TDumpObjectInstruction], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
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
            TTC_6_3_DumpObjectMemoryData_dumpObjectInstructions.sizeLemmaNextWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_6_3_DumpObjectMemoryData_dumpObjectInstructions.sizeRange(ls, offset, from, to) == TTC_6_3_DumpObjectMemoryData_dumpObjectInstructions.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(ls: Vector[TDumpObjectInstruction], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
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
            TTC_6_3_DumpObjectMemoryData_dumpObjectInstructions.sizeLemmaNextDWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_6_3_DumpObjectMemoryData_dumpObjectInstructions.sizeRange(ls, offset, from, to) == TTC_6_3_DumpObjectMemoryData_dumpObjectInstructions.sizeRange(ls, otherOffset, from, to)
    }
}

case class TTC_6_3_DumpObjectMemoryData (
    base_ID: TBase, 
    dumpObjectInstructions: TTC_6_3_DumpObjectMemoryData_dumpObjectInstructions
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854771735L))
        val size_0 = 8L
        val size_1 = 32L
        val size_2 = this.dumpObjectInstructions.size(offset + size_0 + size_1)
        size_0 + size_1 + size_2
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 4072L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771735L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771735L))
        val size_0_offset = 8L
        val size_0_otherOffset = 8L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = this.dumpObjectInstructions.size(offset + size_0_offset + size_1_offset)
        val size_2_otherOffset = this.dumpObjectInstructions.size(otherOffset + size_0_otherOffset + size_1_otherOffset)
        this.dumpObjectInstructions.sizeLemmaAnyOffset(offset + size_0_offset + size_1_offset, otherOffset + size_0_otherOffset + size_1_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771735L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771735L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 8L
        val size_0_otherOffset = 8L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = this.dumpObjectInstructions.size(offset + size_0_offset + size_1_offset)
        val size_2_otherOffset = this.dumpObjectInstructions.size(otherOffset + size_0_otherOffset + size_1_otherOffset)
        this.dumpObjectInstructions.sizeLemmaNextByte(offset + size_0_offset + size_1_offset, otherOffset + size_0_otherOffset + size_1_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771735L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771735L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 8L
        val size_0_otherOffset = 8L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = this.dumpObjectInstructions.size(offset + size_0_offset + size_1_offset)
        val size_2_otherOffset = this.dumpObjectInstructions.size(otherOffset + size_0_otherOffset + size_1_otherOffset)
        this.dumpObjectInstructions.sizeLemmaNextWord(offset + size_0_offset + size_1_offset, otherOffset + size_0_otherOffset + size_1_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771735L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771735L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 8L
        val size_0_otherOffset = 8L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = this.dumpObjectInstructions.size(offset + size_0_offset + size_1_offset)
        val size_2_otherOffset = this.dumpObjectInstructions.size(otherOffset + size_0_otherOffset + size_1_otherOffset)
        this.dumpObjectInstructions.sizeLemmaNextDWord(offset + size_0_offset + size_1_offset, otherOffset + size_0_otherOffset + size_1_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TC_6_3_DUMPOBJECTMEMORYDATA_DUMPOBJECTINSTRUCTIONS: Int = 1453 /*(SIZE(1 .. maxTC-6-3-DumpObjectInstructionCount)) */
@inline @cCode.inline val ERR_TC_6_3_DUMPOBJECTMEMORYDATA_DUMPOBJECTINSTRUCTIONS_ELM_2: Int = 1448 /* */

@inline @cCode.inline val ERR_TC_6_3_DUMPOBJECTMEMORYDATA: Int = 1458 /* */
@inline @cCode.inline val ERR_TC_6_3_DUMPOBJECTMEMORYDATA_BASE_ID_2: Int = 1416 /* */

 
 

@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_3_DUMPOBJECTMEMORYDATA: Int = 1461 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_3_DUMPOBJECTMEMORYDATA_BASE_ID_2: Int = 1419 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_3_DUMPOBJECTMEMORYDATA_N_UNINITIALIZED: Int = 1462 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_3_DUMPOBJECTMEMORYDATA_N: Int = 1421 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_3_DUMPOBJECTMEMORYDATA_DUMPOBJECTINSTRUCTIONS: Int = 1456 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_3_DUMPOBJECTMEMORYDATA_DUMPOBJECTINSTRUCTIONS_ELM_2: Int = 1451 /*  */
@inline @cCode.inline val TTC_6_3_DumpObjectMemoryData_REQUIRED_BYTES_FOR_ACN_ENCODING = 509
@inline @cCode.inline val TTC_6_3_DumpObjectMemoryData_REQUIRED_BITS_FOR_ACN_ENCODING = 4072

@inline @cCode.inline val ERR_ACN_DECODE_TC_6_3_DUMPOBJECTMEMORYDATA: Int = 1463 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_6_3_DUMPOBJECTMEMORYDATA_BASE_ID_2: Int = 1420 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_6_3_DUMPOBJECTMEMORYDATA_N: Int = 1422 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_6_3_DUMPOBJECTMEMORYDATA_DUMPOBJECTINSTRUCTIONS: Int = 1457 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_6_3_DUMPOBJECTMEMORYDATA_DUMPOBJECTINSTRUCTIONS_ELM_2: Int = 1452 /*  */
/*-- TTC_6_3_DumpObjectMemoryDataMultipleMemid --------------------------------------------*/


case class TTC_6_3_DumpObjectMemoryDataMultipleMemid_dumpObjectInstructions (nCount: Int, arr: Vector[TDumpObjectInstruction])
{
    require(this.arr.size <= 63 && 1 <= this.nCount && this.nCount <= this.arr.size)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854771775L))
        TTC_6_3_DumpObjectMemoryDataMultipleMemid_dumpObjectInstructions.sizeRange(this.arr, offset, 0, this.nCount)
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 4032L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771775L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771775L))
        TTC_6_3_DumpObjectMemoryDataMultipleMemid_dumpObjectInstructions.sizeLemmaAnyOffset(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771775L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771775L))
        require((offset % 8L) == (otherOffset % 8L))
        TTC_6_3_DumpObjectMemoryDataMultipleMemid_dumpObjectInstructions.sizeLemmaNextByte(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771775L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771775L))
        require((offset % 16L) == (otherOffset % 16L))
        TTC_6_3_DumpObjectMemoryDataMultipleMemid_dumpObjectInstructions.sizeLemmaNextWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771775L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771775L))
        require((offset % 32L) == (otherOffset % 32L))
        TTC_6_3_DumpObjectMemoryDataMultipleMemid_dumpObjectInstructions.sizeLemmaNextDWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}
object TTC_6_3_DumpObjectMemoryDataMultipleMemid_dumpObjectInstructions {
    def sizeRange(ls: Vector[TDumpObjectInstruction], offset: Long, from: Int, to: Int): Long = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 64L * (to - from)))
        decreases(to - from)
        if (from == to) {
            0L
        } else {
            val elemSize = ls.apply(from).size(offset)
            assert(elemSize == 64L)
            elemSize + TTC_6_3_DumpObjectMemoryDataMultipleMemid_dumpObjectInstructions.sizeRange(ls, offset + elemSize, from + 1, to)
        }
    }.ensuring { (res: Long) => 
        val nbElems = (to - from)
        (0L <= res && res <= 64L * nbElems)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(ls: Vector[TDumpObjectInstruction], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
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
            TTC_6_3_DumpObjectMemoryDataMultipleMemid_dumpObjectInstructions.sizeLemmaAnyOffset(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_6_3_DumpObjectMemoryDataMultipleMemid_dumpObjectInstructions.sizeRange(ls, offset, from, to) == TTC_6_3_DumpObjectMemoryDataMultipleMemid_dumpObjectInstructions.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(ls: Vector[TDumpObjectInstruction], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
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
            TTC_6_3_DumpObjectMemoryDataMultipleMemid_dumpObjectInstructions.sizeLemmaNextByte(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_6_3_DumpObjectMemoryDataMultipleMemid_dumpObjectInstructions.sizeRange(ls, offset, from, to) == TTC_6_3_DumpObjectMemoryDataMultipleMemid_dumpObjectInstructions.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(ls: Vector[TDumpObjectInstruction], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
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
            TTC_6_3_DumpObjectMemoryDataMultipleMemid_dumpObjectInstructions.sizeLemmaNextWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_6_3_DumpObjectMemoryDataMultipleMemid_dumpObjectInstructions.sizeRange(ls, offset, from, to) == TTC_6_3_DumpObjectMemoryDataMultipleMemid_dumpObjectInstructions.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(ls: Vector[TDumpObjectInstruction], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
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
            TTC_6_3_DumpObjectMemoryDataMultipleMemid_dumpObjectInstructions.sizeLemmaNextDWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_6_3_DumpObjectMemoryDataMultipleMemid_dumpObjectInstructions.sizeRange(ls, offset, from, to) == TTC_6_3_DumpObjectMemoryDataMultipleMemid_dumpObjectInstructions.sizeRange(ls, otherOffset, from, to)
    }
}

case class TTC_6_3_DumpObjectMemoryDataMultipleMemid (
    base_ID: TBaseMultipleMemid, 
    dumpObjectInstructions: TTC_6_3_DumpObjectMemoryDataMultipleMemid_dumpObjectInstructions
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854771703L))
        val size_0 = 32L
        val size_1 = this.base_ID match {
            case TBaseMultipleMemid.BaseMultipleMemid_memId1_PRESENT(memId1) =>
                8L
        }
        val size_2 = 32L
        val size_3 = this.dumpObjectInstructions.size(offset + size_0 + size_1 + size_2)
        size_0 + size_1 + size_2 + size_3
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 4104L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771703L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771703L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.base_ID match {
            case TBaseMultipleMemid.BaseMultipleMemid_memId1_PRESENT(memId1) =>
                8L
        }
        val size_1_otherOffset = this.base_ID match {
            case TBaseMultipleMemid.BaseMultipleMemid_memId1_PRESENT(memId1) =>
                8L
        }
        this.base_ID.sizeLemmaAnyOffset(offset + size_0_offset, otherOffset + size_0_otherOffset)
        val size_2_offset = 32L
        val size_2_otherOffset = 32L
        val size_3_offset = this.dumpObjectInstructions.size(offset + size_0_offset + size_1_offset + size_2_offset)
        val size_3_otherOffset = this.dumpObjectInstructions.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        this.dumpObjectInstructions.sizeLemmaAnyOffset(offset + size_0_offset + size_1_offset + size_2_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771703L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771703L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.base_ID match {
            case TBaseMultipleMemid.BaseMultipleMemid_memId1_PRESENT(memId1) =>
                8L
        }
        val size_1_otherOffset = this.base_ID match {
            case TBaseMultipleMemid.BaseMultipleMemid_memId1_PRESENT(memId1) =>
                8L
        }
        this.base_ID.sizeLemmaNextByte(offset + size_0_offset, otherOffset + size_0_otherOffset)
        val size_2_offset = 32L
        val size_2_otherOffset = 32L
        val size_3_offset = this.dumpObjectInstructions.size(offset + size_0_offset + size_1_offset + size_2_offset)
        val size_3_otherOffset = this.dumpObjectInstructions.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        this.dumpObjectInstructions.sizeLemmaNextByte(offset + size_0_offset + size_1_offset + size_2_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771703L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771703L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.base_ID match {
            case TBaseMultipleMemid.BaseMultipleMemid_memId1_PRESENT(memId1) =>
                8L
        }
        val size_1_otherOffset = this.base_ID match {
            case TBaseMultipleMemid.BaseMultipleMemid_memId1_PRESENT(memId1) =>
                8L
        }
        this.base_ID.sizeLemmaNextWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        val size_2_offset = 32L
        val size_2_otherOffset = 32L
        val size_3_offset = this.dumpObjectInstructions.size(offset + size_0_offset + size_1_offset + size_2_offset)
        val size_3_otherOffset = this.dumpObjectInstructions.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        this.dumpObjectInstructions.sizeLemmaNextWord(offset + size_0_offset + size_1_offset + size_2_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771703L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771703L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.base_ID match {
            case TBaseMultipleMemid.BaseMultipleMemid_memId1_PRESENT(memId1) =>
                8L
        }
        val size_1_otherOffset = this.base_ID match {
            case TBaseMultipleMemid.BaseMultipleMemid_memId1_PRESENT(memId1) =>
                8L
        }
        this.base_ID.sizeLemmaNextDWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        val size_2_offset = 32L
        val size_2_otherOffset = 32L
        val size_3_offset = this.dumpObjectInstructions.size(offset + size_0_offset + size_1_offset + size_2_offset)
        val size_3_otherOffset = this.dumpObjectInstructions.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        this.dumpObjectInstructions.sizeLemmaNextDWord(offset + size_0_offset + size_1_offset + size_2_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TC_6_3_DUMPOBJECTMEMORYDATAMULTIPLEMEMID_DUMPOBJECTINSTRUCTIONS: Int = 1511 /*(SIZE(1 .. maxTC-6-3-DumpObjectInstructionCount)) */
@inline @cCode.inline val ERR_TC_6_3_DUMPOBJECTMEMORYDATAMULTIPLEMEMID_DUMPOBJECTINSTRUCTIONS_ELM_2: Int = 1506 /* */

@inline @cCode.inline val ERR_TC_6_3_DUMPOBJECTMEMORYDATAMULTIPLEMEMID: Int = 1516 /* */
@inline @cCode.inline val ERR_TC_6_3_DUMPOBJECTMEMORYDATAMULTIPLEMEMID_BASE_ID_2: Int = 1476 /* */

 
 

@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_3_DUMPOBJECTMEMORYDATAMULTIPLEMEMID: Int = 1519 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_3_DUMPOBJECTMEMORYDATAMULTIPLEMEMID_MEMORY_ID_UNINITIALIZED: Int = 1520 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_3_DUMPOBJECTMEMORYDATAMULTIPLEMEMID_MEMORY_ID: Int = 1464 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_3_DUMPOBJECTMEMORYDATAMULTIPLEMEMID_BASE_ID: Int = 1474 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_3_DUMPOBJECTMEMORYDATAMULTIPLEMEMID_BASE_ID_MEMID1: Int = 1469 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_3_DUMPOBJECTMEMORYDATAMULTIPLEMEMID_N_UNINITIALIZED: Int = 1521 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_3_DUMPOBJECTMEMORYDATAMULTIPLEMEMID_N: Int = 1479 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_3_DUMPOBJECTMEMORYDATAMULTIPLEMEMID_DUMPOBJECTINSTRUCTIONS: Int = 1514 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_3_DUMPOBJECTMEMORYDATAMULTIPLEMEMID_DUMPOBJECTINSTRUCTIONS_ELM_2: Int = 1509 /*  */
@inline @cCode.inline val TTC_6_3_DumpObjectMemoryDataMultipleMemid_REQUIRED_BYTES_FOR_ACN_ENCODING = 513
@inline @cCode.inline val TTC_6_3_DumpObjectMemoryDataMultipleMemid_REQUIRED_BITS_FOR_ACN_ENCODING = 4104

@inline @cCode.inline val ERR_ACN_DECODE_TC_6_3_DUMPOBJECTMEMORYDATAMULTIPLEMEMID: Int = 1522 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_6_3_DUMPOBJECTMEMORYDATAMULTIPLEMEMID_MEMORY_ID: Int = 1465 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_6_3_DUMPOBJECTMEMORYDATAMULTIPLEMEMID_BASE_ID: Int = 1475 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_6_3_DUMPOBJECTMEMORYDATAMULTIPLEMEMID_BASE_ID_MEMID1: Int = 1470 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_6_3_DUMPOBJECTMEMORYDATAMULTIPLEMEMID_N: Int = 1480 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_6_3_DUMPOBJECTMEMORYDATAMULTIPLEMEMID_DUMPOBJECTINSTRUCTIONS: Int = 1515 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_6_3_DUMPOBJECTMEMORYDATAMULTIPLEMEMID_DUMPOBJECTINSTRUCTIONS_ELM_2: Int = 1510 /*  */

// @inline @cCode.inline val maxTC_6_3_DumpObjectInstructionCount: Int = 63 // defined in body

