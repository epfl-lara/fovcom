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

/*-- TCheckedObject --------------------------------------------*/

case class TCheckedObject_checksum(arr: Vector[UByte])
{
    require(this.arr.length == 2)
}

case class TCheckedObject (
    offset: TPUSC_UINT32, 
    length: TPUSC_UINT32, 
    checksum: TCheckedObject_checksum
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775727L))
        val size_0 = 32L
        val size_1 = 32L
        val size_2 = 16L
        size_0 + size_1 + size_2
    }.ensuring { (res: Long) => 
        res == 80L
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775727L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775727L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = 16L
        val size_2_otherOffset = 16L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775727L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775727L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = 16L
        val size_2_otherOffset = 16L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775727L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775727L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = 16L
        val size_2_otherOffset = 16L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775727L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775727L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = 16L
        val size_2_otherOffset = 16L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_CHECKEDOBJECT_CHECKSUM: Int = 2215 /*(SIZE(16)) */

@inline @cCode.inline val ERR_CHECKEDOBJECT: Int = 2220 /* */
@inline @cCode.inline val ERR_CHECKEDOBJECT_OFFSET_2: Int = 2200 /* */
@inline @cCode.inline val ERR_CHECKEDOBJECT_LENGTH_2: Int = 2210 /* */

 
 

@inline @cCode.inline val ERR_ACN_ENCODE_CHECKEDOBJECT: Int = 2223 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_CHECKEDOBJECT_OFFSET_2: Int = 2203 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_CHECKEDOBJECT_LENGTH_2: Int = 2213 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_CHECKEDOBJECT_CHECKSUM: Int = 2218 /*  */
@inline @cCode.inline val TCheckedObject_REQUIRED_BYTES_FOR_ACN_ENCODING = 10
@inline @cCode.inline val TCheckedObject_REQUIRED_BITS_FOR_ACN_ENCODING = 80

@inline @cCode.inline val ERR_ACN_DECODE_CHECKEDOBJECT: Int = 2224 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_CHECKEDOBJECT_OFFSET_2: Int = 2204 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_CHECKEDOBJECT_LENGTH_2: Int = 2214 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_CHECKEDOBJECT_CHECKSUM: Int = 2219 /*  */
/*-- TTM_6_8_CheckedObjectMemoryDataReport --------------------------------------------*/


case class TTM_6_8_CheckedObjectMemoryDataReport_checkedObjects (nCount: Int, arr: Vector[TCheckedObject])
{
    require(this.arr.size <= 63 && 1 <= this.nCount && this.nCount <= this.arr.size)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854770767L))
        TTM_6_8_CheckedObjectMemoryDataReport_checkedObjects.sizeRange(this.arr, offset, 0, this.nCount)
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 5040L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854770767L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854770767L))
        TTM_6_8_CheckedObjectMemoryDataReport_checkedObjects.sizeLemmaAnyOffset(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854770767L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854770767L))
        require((offset % 8L) == (otherOffset % 8L))
        TTM_6_8_CheckedObjectMemoryDataReport_checkedObjects.sizeLemmaNextByte(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854770767L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854770767L))
        require((offset % 16L) == (otherOffset % 16L))
        TTM_6_8_CheckedObjectMemoryDataReport_checkedObjects.sizeLemmaNextWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854770767L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854770767L))
        require((offset % 32L) == (otherOffset % 32L))
        TTM_6_8_CheckedObjectMemoryDataReport_checkedObjects.sizeLemmaNextDWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}
object TTM_6_8_CheckedObjectMemoryDataReport_checkedObjects {
    def sizeRange(ls: Vector[TCheckedObject], offset: Long, from: Int, to: Int): Long = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 80L * (to - from)))
        decreases(to - from)
        if (from == to) {
            0L
        } else {
            val elemSize = ls.apply(from).size(offset)
            assert(elemSize == 80L)
            elemSize + TTM_6_8_CheckedObjectMemoryDataReport_checkedObjects.sizeRange(ls, offset + elemSize, from + 1, to)
        }
    }.ensuring { (res: Long) => 
        val nbElems = (to - from)
        (0L <= res && res <= 80L * nbElems)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(ls: Vector[TCheckedObject], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 80L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 80L * (to - from)))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 80L)
            assert(elemSizeOtherOff == 80L)
            ls.apply(from).sizeLemmaAnyOffset(offset, otherOffset)
            TTM_6_8_CheckedObjectMemoryDataReport_checkedObjects.sizeLemmaAnyOffset(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_6_8_CheckedObjectMemoryDataReport_checkedObjects.sizeRange(ls, offset, from, to) == TTM_6_8_CheckedObjectMemoryDataReport_checkedObjects.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(ls: Vector[TCheckedObject], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 80L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 80L * (to - from)))
        require((offset % 8L) == (otherOffset % 8L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 80L)
            assert(elemSizeOtherOff == 80L)
            ls.apply(from).sizeLemmaNextByte(offset, otherOffset)
            TTM_6_8_CheckedObjectMemoryDataReport_checkedObjects.sizeLemmaNextByte(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_6_8_CheckedObjectMemoryDataReport_checkedObjects.sizeRange(ls, offset, from, to) == TTM_6_8_CheckedObjectMemoryDataReport_checkedObjects.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(ls: Vector[TCheckedObject], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 80L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 80L * (to - from)))
        require((offset % 16L) == (otherOffset % 16L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 80L)
            assert(elemSizeOtherOff == 80L)
            ls.apply(from).sizeLemmaNextWord(offset, otherOffset)
            TTM_6_8_CheckedObjectMemoryDataReport_checkedObjects.sizeLemmaNextWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_6_8_CheckedObjectMemoryDataReport_checkedObjects.sizeRange(ls, offset, from, to) == TTM_6_8_CheckedObjectMemoryDataReport_checkedObjects.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(ls: Vector[TCheckedObject], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 80L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 80L * (to - from)))
        require((offset % 32L) == (otherOffset % 32L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 80L)
            assert(elemSizeOtherOff == 80L)
            ls.apply(from).sizeLemmaNextDWord(offset, otherOffset)
            TTM_6_8_CheckedObjectMemoryDataReport_checkedObjects.sizeLemmaNextDWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_6_8_CheckedObjectMemoryDataReport_checkedObjects.sizeRange(ls, offset, from, to) == TTM_6_8_CheckedObjectMemoryDataReport_checkedObjects.sizeRange(ls, otherOffset, from, to)
    }
}

case class TTM_6_8_CheckedObjectMemoryDataReport (
    base_ID: TBase, 
    checkedObjects: TTM_6_8_CheckedObjectMemoryDataReport_checkedObjects
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854770727L))
        val size_0 = 8L
        val size_1 = 32L
        val size_2 = this.checkedObjects.size(offset + size_0 + size_1)
        size_0 + size_1 + size_2
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 5080L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854770727L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854770727L))
        val size_0_offset = 8L
        val size_0_otherOffset = 8L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = this.checkedObjects.size(offset + size_0_offset + size_1_offset)
        val size_2_otherOffset = this.checkedObjects.size(otherOffset + size_0_otherOffset + size_1_otherOffset)
        this.checkedObjects.sizeLemmaAnyOffset(offset + size_0_offset + size_1_offset, otherOffset + size_0_otherOffset + size_1_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854770727L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854770727L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 8L
        val size_0_otherOffset = 8L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = this.checkedObjects.size(offset + size_0_offset + size_1_offset)
        val size_2_otherOffset = this.checkedObjects.size(otherOffset + size_0_otherOffset + size_1_otherOffset)
        this.checkedObjects.sizeLemmaNextByte(offset + size_0_offset + size_1_offset, otherOffset + size_0_otherOffset + size_1_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854770727L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854770727L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 8L
        val size_0_otherOffset = 8L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = this.checkedObjects.size(offset + size_0_offset + size_1_offset)
        val size_2_otherOffset = this.checkedObjects.size(otherOffset + size_0_otherOffset + size_1_otherOffset)
        this.checkedObjects.sizeLemmaNextWord(offset + size_0_offset + size_1_offset, otherOffset + size_0_otherOffset + size_1_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854770727L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854770727L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 8L
        val size_0_otherOffset = 8L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = this.checkedObjects.size(offset + size_0_offset + size_1_offset)
        val size_2_otherOffset = this.checkedObjects.size(otherOffset + size_0_otherOffset + size_1_otherOffset)
        this.checkedObjects.sizeLemmaNextDWord(offset + size_0_offset + size_1_offset, otherOffset + size_0_otherOffset + size_1_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORT_CHECKEDOBJECTS: Int = 2120 /*(SIZE(1 .. maxTM-6-8-CheckObjectCount)) */
@inline @cCode.inline val ERR_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORT_CHECKEDOBJECTS_ELM_2: Int = 2115 /* */

@inline @cCode.inline val ERR_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORT: Int = 2125 /* */
@inline @cCode.inline val ERR_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORT_BASE_ID_2: Int = 2078 /* */

 
 

@inline @cCode.inline val ERR_ACN_ENCODE_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORT: Int = 2128 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORT_BASE_ID_2: Int = 2081 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORT_N_UNINITIALIZED: Int = 2129 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORT_N: Int = 2083 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORT_CHECKEDOBJECTS: Int = 2123 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORT_CHECKEDOBJECTS_ELM_2: Int = 2118 /*  */
@inline @cCode.inline val TTM_6_8_CheckedObjectMemoryDataReport_REQUIRED_BYTES_FOR_ACN_ENCODING = 635
@inline @cCode.inline val TTM_6_8_CheckedObjectMemoryDataReport_REQUIRED_BITS_FOR_ACN_ENCODING = 5080

@inline @cCode.inline val ERR_ACN_DECODE_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORT: Int = 2130 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORT_BASE_ID_2: Int = 2082 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORT_N: Int = 2084 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORT_CHECKEDOBJECTS: Int = 2124 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORT_CHECKEDOBJECTS_ELM_2: Int = 2119 /*  */
/*-- TTM_6_8_CheckedObjectMemoryDataReportMultipleMemid --------------------------------------------*/


case class TTM_6_8_CheckedObjectMemoryDataReportMultipleMemid_checkedObjects (nCount: Int, arr: Vector[TCheckedObject])
{
    require(this.arr.size <= 63 && 1 <= this.nCount && this.nCount <= this.arr.size)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854770767L))
        TTM_6_8_CheckedObjectMemoryDataReportMultipleMemid_checkedObjects.sizeRange(this.arr, offset, 0, this.nCount)
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 5040L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854770767L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854770767L))
        TTM_6_8_CheckedObjectMemoryDataReportMultipleMemid_checkedObjects.sizeLemmaAnyOffset(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854770767L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854770767L))
        require((offset % 8L) == (otherOffset % 8L))
        TTM_6_8_CheckedObjectMemoryDataReportMultipleMemid_checkedObjects.sizeLemmaNextByte(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854770767L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854770767L))
        require((offset % 16L) == (otherOffset % 16L))
        TTM_6_8_CheckedObjectMemoryDataReportMultipleMemid_checkedObjects.sizeLemmaNextWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854770767L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854770767L))
        require((offset % 32L) == (otherOffset % 32L))
        TTM_6_8_CheckedObjectMemoryDataReportMultipleMemid_checkedObjects.sizeLemmaNextDWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}
object TTM_6_8_CheckedObjectMemoryDataReportMultipleMemid_checkedObjects {
    def sizeRange(ls: Vector[TCheckedObject], offset: Long, from: Int, to: Int): Long = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 80L * (to - from)))
        decreases(to - from)
        if (from == to) {
            0L
        } else {
            val elemSize = ls.apply(from).size(offset)
            assert(elemSize == 80L)
            elemSize + TTM_6_8_CheckedObjectMemoryDataReportMultipleMemid_checkedObjects.sizeRange(ls, offset + elemSize, from + 1, to)
        }
    }.ensuring { (res: Long) => 
        val nbElems = (to - from)
        (0L <= res && res <= 80L * nbElems)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(ls: Vector[TCheckedObject], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 80L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 80L * (to - from)))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 80L)
            assert(elemSizeOtherOff == 80L)
            ls.apply(from).sizeLemmaAnyOffset(offset, otherOffset)
            TTM_6_8_CheckedObjectMemoryDataReportMultipleMemid_checkedObjects.sizeLemmaAnyOffset(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_6_8_CheckedObjectMemoryDataReportMultipleMemid_checkedObjects.sizeRange(ls, offset, from, to) == TTM_6_8_CheckedObjectMemoryDataReportMultipleMemid_checkedObjects.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(ls: Vector[TCheckedObject], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 80L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 80L * (to - from)))
        require((offset % 8L) == (otherOffset % 8L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 80L)
            assert(elemSizeOtherOff == 80L)
            ls.apply(from).sizeLemmaNextByte(offset, otherOffset)
            TTM_6_8_CheckedObjectMemoryDataReportMultipleMemid_checkedObjects.sizeLemmaNextByte(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_6_8_CheckedObjectMemoryDataReportMultipleMemid_checkedObjects.sizeRange(ls, offset, from, to) == TTM_6_8_CheckedObjectMemoryDataReportMultipleMemid_checkedObjects.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(ls: Vector[TCheckedObject], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 80L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 80L * (to - from)))
        require((offset % 16L) == (otherOffset % 16L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 80L)
            assert(elemSizeOtherOff == 80L)
            ls.apply(from).sizeLemmaNextWord(offset, otherOffset)
            TTM_6_8_CheckedObjectMemoryDataReportMultipleMemid_checkedObjects.sizeLemmaNextWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_6_8_CheckedObjectMemoryDataReportMultipleMemid_checkedObjects.sizeRange(ls, offset, from, to) == TTM_6_8_CheckedObjectMemoryDataReportMultipleMemid_checkedObjects.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(ls: Vector[TCheckedObject], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 80L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 80L * (to - from)))
        require((offset % 32L) == (otherOffset % 32L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 80L)
            assert(elemSizeOtherOff == 80L)
            ls.apply(from).sizeLemmaNextDWord(offset, otherOffset)
            TTM_6_8_CheckedObjectMemoryDataReportMultipleMemid_checkedObjects.sizeLemmaNextDWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_6_8_CheckedObjectMemoryDataReportMultipleMemid_checkedObjects.sizeRange(ls, offset, from, to) == TTM_6_8_CheckedObjectMemoryDataReportMultipleMemid_checkedObjects.sizeRange(ls, otherOffset, from, to)
    }
}

case class TTM_6_8_CheckedObjectMemoryDataReportMultipleMemid (
    base_ID: TBaseMultipleMemid, 
    checkedObjects: TTM_6_8_CheckedObjectMemoryDataReportMultipleMemid_checkedObjects
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854770695L))
        val size_0 = 32L
        val size_1 = this.base_ID match {
            case TBaseMultipleMemid.BaseMultipleMemid_memId1_PRESENT(memId1) =>
                8L
        }
        val size_2 = 32L
        val size_3 = this.checkedObjects.size(offset + size_0 + size_1 + size_2)
        size_0 + size_1 + size_2 + size_3
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 5112L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854770695L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854770695L))
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
        val size_3_offset = this.checkedObjects.size(offset + size_0_offset + size_1_offset + size_2_offset)
        val size_3_otherOffset = this.checkedObjects.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        this.checkedObjects.sizeLemmaAnyOffset(offset + size_0_offset + size_1_offset + size_2_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854770695L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854770695L))
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
        val size_3_offset = this.checkedObjects.size(offset + size_0_offset + size_1_offset + size_2_offset)
        val size_3_otherOffset = this.checkedObjects.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        this.checkedObjects.sizeLemmaNextByte(offset + size_0_offset + size_1_offset + size_2_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854770695L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854770695L))
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
        val size_3_offset = this.checkedObjects.size(offset + size_0_offset + size_1_offset + size_2_offset)
        val size_3_otherOffset = this.checkedObjects.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        this.checkedObjects.sizeLemmaNextWord(offset + size_0_offset + size_1_offset + size_2_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854770695L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854770695L))
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
        val size_3_offset = this.checkedObjects.size(offset + size_0_offset + size_1_offset + size_2_offset)
        val size_3_otherOffset = this.checkedObjects.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        this.checkedObjects.sizeLemmaNextDWord(offset + size_0_offset + size_1_offset + size_2_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORTMULTIPLEMEMID_CHECKEDOBJECTS: Int = 2183 /*(SIZE(1 .. maxTM-6-8-CheckObjectCount)) */
@inline @cCode.inline val ERR_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORTMULTIPLEMEMID_CHECKEDOBJECTS_ELM_2: Int = 2178 /* */

@inline @cCode.inline val ERR_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORTMULTIPLEMEMID: Int = 2188 /* */
@inline @cCode.inline val ERR_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORTMULTIPLEMEMID_BASE_ID_2: Int = 2143 /* */

 
 

@inline @cCode.inline val ERR_ACN_ENCODE_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORTMULTIPLEMEMID: Int = 2191 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORTMULTIPLEMEMID_MEMORY_ID_UNINITIALIZED: Int = 2192 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORTMULTIPLEMEMID_MEMORY_ID: Int = 2131 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORTMULTIPLEMEMID_BASE_ID: Int = 2141 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORTMULTIPLEMEMID_BASE_ID_MEMID1: Int = 2136 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORTMULTIPLEMEMID_N_UNINITIALIZED: Int = 2193 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORTMULTIPLEMEMID_N: Int = 2146 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORTMULTIPLEMEMID_CHECKEDOBJECTS: Int = 2186 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORTMULTIPLEMEMID_CHECKEDOBJECTS_ELM_2: Int = 2181 /*  */
@inline @cCode.inline val TTM_6_8_CheckedObjectMemoryDataReportMultipleMemid_REQUIRED_BYTES_FOR_ACN_ENCODING = 639
@inline @cCode.inline val TTM_6_8_CheckedObjectMemoryDataReportMultipleMemid_REQUIRED_BITS_FOR_ACN_ENCODING = 5112

@inline @cCode.inline val ERR_ACN_DECODE_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORTMULTIPLEMEMID: Int = 2194 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORTMULTIPLEMEMID_MEMORY_ID: Int = 2132 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORTMULTIPLEMEMID_BASE_ID: Int = 2142 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORTMULTIPLEMEMID_BASE_ID_MEMID1: Int = 2137 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORTMULTIPLEMEMID_N: Int = 2147 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORTMULTIPLEMEMID_CHECKEDOBJECTS: Int = 2187 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_6_8_CHECKEDOBJECTMEMORYDATAREPORTMULTIPLEMEMID_CHECKEDOBJECTS_ELM_2: Int = 2182 /*  */

// @inline @cCode.inline val maxTM_6_8_CheckObjectCount: Int = 63 // defined in body
