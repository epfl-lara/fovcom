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

/*-- TStorage_ControlHousekeepingParameterReportItem --------------------------------------------*/

case class TStorage_ControlHousekeepingParameterReportItem (
    parameter: THousekeepingParameterReportStructure_ID, 
    subsamplingRate: OptionMut[TPUSC_UINT32]
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775742L))
        val size_0 = 1L
        val size_1 = 32L
        val size_2 = this.subsamplingRate match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        size_0 + size_1 + size_2
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 65L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775742L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775742L))
        val size_0_offset = 1L
        val size_0_otherOffset = 1L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = this.subsamplingRate match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_2_otherOffset = this.subsamplingRate match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775742L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775742L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 1L
        val size_0_otherOffset = 1L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = this.subsamplingRate match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_2_otherOffset = this.subsamplingRate match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775742L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775742L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 1L
        val size_0_otherOffset = 1L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = this.subsamplingRate match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_2_otherOffset = this.subsamplingRate match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775742L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775742L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 1L
        val size_0_otherOffset = 1L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = this.subsamplingRate match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_2_otherOffset = this.subsamplingRate match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORTITEM: Int = 3030 /* */
@inline @cCode.inline val ERR_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORTITEM_PARAMETER_2: Int = 3015 /* */
@inline @cCode.inline val ERR_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORTITEM_SUBSAMPLINGRATE_2: Int = 3025 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORTITEM: Int = 3033 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORTITEM_PARAMETER_2: Int = 3018 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORTITEM_SUBSAMPLINGRATE_2: Int = 3028 /*  */
@inline @cCode.inline val TStorage_ControlHousekeepingParameterReportItem_REQUIRED_BYTES_FOR_ACN_ENCODING = 9
@inline @cCode.inline val TStorage_ControlHousekeepingParameterReportItem_REQUIRED_BITS_FOR_ACN_ENCODING = 65

@inline @cCode.inline val ERR_ACN_DECODE_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORTITEM: Int = 3034 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORTITEM_PARAMETER_2: Int = 3019 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORTITEM_SUBSAMPLINGRATE_2: Int = 3029 /*  */
/*-- TStorage_ControlHousekeepingParameterReportConfiguration --------------------------------------------*/


case class TStorage_ControlHousekeepingParameterReportConfiguration_tail (nCount: Int, arr: Vector[TStorage_ControlHousekeepingParameterReportItem])
{
    require(this.arr.size <= 31 && 0 <= this.nCount && this.nCount <= this.arr.size)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854773792L))
        TStorage_ControlHousekeepingParameterReportConfiguration_tail.sizeRange(this.arr, offset, 0, this.nCount)
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 2015L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854773792L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854773792L))
        TStorage_ControlHousekeepingParameterReportConfiguration_tail.sizeLemmaAnyOffset(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854773792L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854773792L))
        require((offset % 8L) == (otherOffset % 8L))
        TStorage_ControlHousekeepingParameterReportConfiguration_tail.sizeLemmaNextByte(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854773792L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854773792L))
        require((offset % 16L) == (otherOffset % 16L))
        TStorage_ControlHousekeepingParameterReportConfiguration_tail.sizeLemmaNextWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854773792L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854773792L))
        require((offset % 32L) == (otherOffset % 32L))
        TStorage_ControlHousekeepingParameterReportConfiguration_tail.sizeLemmaNextDWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}
object TStorage_ControlHousekeepingParameterReportConfiguration_tail {
    def sizeRange(ls: Vector[TStorage_ControlHousekeepingParameterReportItem], offset: Long, from: Int, to: Int): Long = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 31))
        require((0L <= offset) && (offset <= 9223372036854775807L - 65L * (to - from)))
        decreases(to - from)
        if (from == to) {
            0L
        } else {
            val elemSize = ls.apply(from).size(offset)
            assert(0L <= elemSize && elemSize <= 65L)
            elemSize + TStorage_ControlHousekeepingParameterReportConfiguration_tail.sizeRange(ls, offset + elemSize, from + 1, to)
        }
    }.ensuring { (res: Long) => 
        val nbElems = (to - from)
        (0L <= res && res <= 65L * nbElems)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(ls: Vector[TStorage_ControlHousekeepingParameterReportItem], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 31))
        require((0L <= offset) && (offset <= 9223372036854775807L - 65L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 65L * (to - from)))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 65L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 65L)
            ls.apply(from).sizeLemmaAnyOffset(offset, otherOffset)
            TStorage_ControlHousekeepingParameterReportConfiguration_tail.sizeLemmaAnyOffset(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TStorage_ControlHousekeepingParameterReportConfiguration_tail.sizeRange(ls, offset, from, to) == TStorage_ControlHousekeepingParameterReportConfiguration_tail.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(ls: Vector[TStorage_ControlHousekeepingParameterReportItem], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 31))
        require((0L <= offset) && (offset <= 9223372036854775807L - 65L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 65L * (to - from)))
        require((offset % 8L) == (otherOffset % 8L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 65L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 65L)
            ls.apply(from).sizeLemmaNextByte(offset, otherOffset)
            TStorage_ControlHousekeepingParameterReportConfiguration_tail.sizeLemmaNextByte(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TStorage_ControlHousekeepingParameterReportConfiguration_tail.sizeRange(ls, offset, from, to) == TStorage_ControlHousekeepingParameterReportConfiguration_tail.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(ls: Vector[TStorage_ControlHousekeepingParameterReportItem], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 31))
        require((0L <= offset) && (offset <= 9223372036854775807L - 65L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 65L * (to - from)))
        require((offset % 16L) == (otherOffset % 16L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 65L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 65L)
            ls.apply(from).sizeLemmaNextWord(offset, otherOffset)
            TStorage_ControlHousekeepingParameterReportConfiguration_tail.sizeLemmaNextWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TStorage_ControlHousekeepingParameterReportConfiguration_tail.sizeRange(ls, offset, from, to) == TStorage_ControlHousekeepingParameterReportConfiguration_tail.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(ls: Vector[TStorage_ControlHousekeepingParameterReportItem], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 31))
        require((0L <= offset) && (offset <= 9223372036854775807L - 65L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 65L * (to - from)))
        require((offset % 32L) == (otherOffset % 32L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 65L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 65L)
            ls.apply(from).sizeLemmaNextDWord(offset, otherOffset)
            TStorage_ControlHousekeepingParameterReportConfiguration_tail.sizeLemmaNextDWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TStorage_ControlHousekeepingParameterReportConfiguration_tail.sizeRange(ls, offset, from, to) == TStorage_ControlHousekeepingParameterReportConfiguration_tail.sizeRange(ls, otherOffset, from, to)
    }
}

case class TStorage_ControlHousekeepingParameterReportConfiguration (
    applicationProcess_ID: OptionMut[TApplicationProcess_ID], 
    tail: TStorage_ControlHousekeepingParameterReportConfiguration_tail
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854773748L))
        val size_0 = 1L
        val size_1 = this.applicationProcess_ID match {
            case SomeMut(v) =>
                11L
            case NoneMut() =>
                0L
        }
        val size_2 = 32L
        val size_3 = this.tail.size(offset + size_0 + size_1 + size_2)
        size_0 + size_1 + size_2 + size_3
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 2059L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854773748L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854773748L))
        val size_0_offset = 1L
        val size_0_otherOffset = 1L
        val size_1_offset = this.applicationProcess_ID match {
            case SomeMut(v) =>
                11L
            case NoneMut() =>
                0L
        }
        val size_1_otherOffset = this.applicationProcess_ID match {
            case SomeMut(v) =>
                11L
            case NoneMut() =>
                0L
        }
        val size_2_offset = 32L
        val size_2_otherOffset = 32L
        val size_3_offset = this.tail.size(offset + size_0_offset + size_1_offset + size_2_offset)
        val size_3_otherOffset = this.tail.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        this.tail.sizeLemmaAnyOffset(offset + size_0_offset + size_1_offset + size_2_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854773748L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854773748L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 1L
        val size_0_otherOffset = 1L
        val size_1_offset = this.applicationProcess_ID match {
            case SomeMut(v) =>
                11L
            case NoneMut() =>
                0L
        }
        val size_1_otherOffset = this.applicationProcess_ID match {
            case SomeMut(v) =>
                11L
            case NoneMut() =>
                0L
        }
        val size_2_offset = 32L
        val size_2_otherOffset = 32L
        val size_3_offset = this.tail.size(offset + size_0_offset + size_1_offset + size_2_offset)
        val size_3_otherOffset = this.tail.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        this.tail.sizeLemmaNextByte(offset + size_0_offset + size_1_offset + size_2_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854773748L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854773748L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 1L
        val size_0_otherOffset = 1L
        val size_1_offset = this.applicationProcess_ID match {
            case SomeMut(v) =>
                11L
            case NoneMut() =>
                0L
        }
        val size_1_otherOffset = this.applicationProcess_ID match {
            case SomeMut(v) =>
                11L
            case NoneMut() =>
                0L
        }
        val size_2_offset = 32L
        val size_2_otherOffset = 32L
        val size_3_offset = this.tail.size(offset + size_0_offset + size_1_offset + size_2_offset)
        val size_3_otherOffset = this.tail.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        this.tail.sizeLemmaNextWord(offset + size_0_offset + size_1_offset + size_2_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854773748L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854773748L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 1L
        val size_0_otherOffset = 1L
        val size_1_offset = this.applicationProcess_ID match {
            case SomeMut(v) =>
                11L
            case NoneMut() =>
                0L
        }
        val size_1_otherOffset = this.applicationProcess_ID match {
            case SomeMut(v) =>
                11L
            case NoneMut() =>
                0L
        }
        val size_2_offset = 32L
        val size_2_otherOffset = 32L
        val size_3_offset = this.tail.size(offset + size_0_offset + size_1_offset + size_2_offset)
        val size_3_otherOffset = this.tail.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        this.tail.sizeLemmaNextDWord(offset + size_0_offset + size_1_offset + size_2_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORTCONFIGURATION_TAIL: Int = 2999 /*(SIZE(0 .. maxTailSize)) */
@inline @cCode.inline val ERR_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORTCONFIGURATION_TAIL_ELM_2: Int = 2994 /* */

@inline @cCode.inline val ERR_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORTCONFIGURATION: Int = 3004 /* */
@inline @cCode.inline val ERR_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORTCONFIGURATION_APPLICATIONPROCESS_ID_2: Int = 2962 /* */

 
 

@inline @cCode.inline val ERR_ACN_ENCODE_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORTCONFIGURATION: Int = 3007 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORTCONFIGURATION_APPLICATIONPROCESS_ID_2: Int = 2965 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORTCONFIGURATION_N2_UNINITIALIZED: Int = 3008 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORTCONFIGURATION_N2: Int = 2967 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORTCONFIGURATION_TAIL: Int = 3002 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORTCONFIGURATION_TAIL_ELM_2: Int = 2997 /*  */
@inline @cCode.inline val TStorage_ControlHousekeepingParameterReportConfiguration_REQUIRED_BYTES_FOR_ACN_ENCODING = 258
@inline @cCode.inline val TStorage_ControlHousekeepingParameterReportConfiguration_REQUIRED_BITS_FOR_ACN_ENCODING = 2059

@inline @cCode.inline val ERR_ACN_DECODE_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORTCONFIGURATION: Int = 3009 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORTCONFIGURATION_APPLICATIONPROCESS_ID_2: Int = 2966 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORTCONFIGURATION_N2: Int = 2968 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORTCONFIGURATION_TAIL: Int = 3003 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORTCONFIGURATION_TAIL_ELM_2: Int = 2998 /*  */
/*-- TStorage_ControlHousekeepingParameterReport --------------------------------------------*/


case class TStorage_ControlHousekeepingParameterReport_configuration (nCount: Int, arr: Vector[TStorage_ControlHousekeepingParameterReportConfiguration])
{
    require(this.arr.size <= 31 && 0 <= this.nCount && this.nCount <= this.arr.size)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854711978L))
        TStorage_ControlHousekeepingParameterReport_configuration.sizeRange(this.arr, offset, 0, this.nCount)
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 63829L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854711978L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854711978L))
        TStorage_ControlHousekeepingParameterReport_configuration.sizeLemmaAnyOffset(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854711978L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854711978L))
        require((offset % 8L) == (otherOffset % 8L))
        TStorage_ControlHousekeepingParameterReport_configuration.sizeLemmaNextByte(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854711978L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854711978L))
        require((offset % 16L) == (otherOffset % 16L))
        TStorage_ControlHousekeepingParameterReport_configuration.sizeLemmaNextWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854711978L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854711978L))
        require((offset % 32L) == (otherOffset % 32L))
        TStorage_ControlHousekeepingParameterReport_configuration.sizeLemmaNextDWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}
object TStorage_ControlHousekeepingParameterReport_configuration {
    def sizeRange(ls: Vector[TStorage_ControlHousekeepingParameterReportConfiguration], offset: Long, from: Int, to: Int): Long = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 31))
        require((0L <= offset) && (offset <= 9223372036854775807L - 2059L * (to - from)))
        decreases(to - from)
        if (from == to) {
            0L
        } else {
            val elemSize = ls.apply(from).size(offset)
            assert(0L <= elemSize && elemSize <= 2059L)
            elemSize + TStorage_ControlHousekeepingParameterReport_configuration.sizeRange(ls, offset + elemSize, from + 1, to)
        }
    }.ensuring { (res: Long) => 
        val nbElems = (to - from)
        (0L <= res && res <= 2059L * nbElems)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(ls: Vector[TStorage_ControlHousekeepingParameterReportConfiguration], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 31))
        require((0L <= offset) && (offset <= 9223372036854775807L - 2059L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 2059L * (to - from)))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 2059L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 2059L)
            ls.apply(from).sizeLemmaAnyOffset(offset, otherOffset)
            TStorage_ControlHousekeepingParameterReport_configuration.sizeLemmaAnyOffset(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TStorage_ControlHousekeepingParameterReport_configuration.sizeRange(ls, offset, from, to) == TStorage_ControlHousekeepingParameterReport_configuration.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(ls: Vector[TStorage_ControlHousekeepingParameterReportConfiguration], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 31))
        require((0L <= offset) && (offset <= 9223372036854775807L - 2059L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 2059L * (to - from)))
        require((offset % 8L) == (otherOffset % 8L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 2059L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 2059L)
            ls.apply(from).sizeLemmaNextByte(offset, otherOffset)
            TStorage_ControlHousekeepingParameterReport_configuration.sizeLemmaNextByte(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TStorage_ControlHousekeepingParameterReport_configuration.sizeRange(ls, offset, from, to) == TStorage_ControlHousekeepingParameterReport_configuration.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(ls: Vector[TStorage_ControlHousekeepingParameterReportConfiguration], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 31))
        require((0L <= offset) && (offset <= 9223372036854775807L - 2059L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 2059L * (to - from)))
        require((offset % 16L) == (otherOffset % 16L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 2059L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 2059L)
            ls.apply(from).sizeLemmaNextWord(offset, otherOffset)
            TStorage_ControlHousekeepingParameterReport_configuration.sizeLemmaNextWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TStorage_ControlHousekeepingParameterReport_configuration.sizeRange(ls, offset, from, to) == TStorage_ControlHousekeepingParameterReport_configuration.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(ls: Vector[TStorage_ControlHousekeepingParameterReportConfiguration], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 31))
        require((0L <= offset) && (offset <= 9223372036854775807L - 2059L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 2059L * (to - from)))
        require((offset % 32L) == (otherOffset % 32L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 2059L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 2059L)
            ls.apply(from).sizeLemmaNextDWord(offset, otherOffset)
            TStorage_ControlHousekeepingParameterReport_configuration.sizeLemmaNextDWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TStorage_ControlHousekeepingParameterReport_configuration.sizeRange(ls, offset, from, to) == TStorage_ControlHousekeepingParameterReport_configuration.sizeRange(ls, otherOffset, from, to)
    }
}

case class TStorage_ControlHousekeepingParameterReport (
    packetStoreID: TPacketStore_ID, 
    configuration: TStorage_ControlHousekeepingParameterReport_configuration
) {
    require(33 == this.packetStoreID.length && this.packetStoreID.indexOfOrLength(UByte.fromRaw(0.toByte)) <= 32)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854711722L))
        val size_0 = (224L)
        val size_1 = 32L
        val size_2 = this.configuration.size(offset + size_0 + size_1)
        size_0 + size_1 + size_2
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 64085L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854711722L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854711722L))
        val size_0_offset = (224L)
        val size_0_otherOffset = 224L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = this.configuration.size(offset + size_0_offset + size_1_offset)
        val size_2_otherOffset = this.configuration.size(otherOffset + size_0_otherOffset + size_1_otherOffset)
        this.configuration.sizeLemmaAnyOffset(offset + size_0_offset + size_1_offset, otherOffset + size_0_otherOffset + size_1_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854711722L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854711722L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = (224L)
        val size_0_otherOffset = 224L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = this.configuration.size(offset + size_0_offset + size_1_offset)
        val size_2_otherOffset = this.configuration.size(otherOffset + size_0_otherOffset + size_1_otherOffset)
        this.configuration.sizeLemmaNextByte(offset + size_0_offset + size_1_offset, otherOffset + size_0_otherOffset + size_1_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854711722L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854711722L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = (224L)
        val size_0_otherOffset = 224L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = this.configuration.size(offset + size_0_offset + size_1_offset)
        val size_2_otherOffset = this.configuration.size(otherOffset + size_0_otherOffset + size_1_otherOffset)
        this.configuration.sizeLemmaNextWord(offset + size_0_offset + size_1_offset, otherOffset + size_0_otherOffset + size_1_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854711722L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854711722L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = (224L)
        val size_0_otherOffset = 224L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = this.configuration.size(offset + size_0_offset + size_1_offset)
        val size_2_otherOffset = this.configuration.size(otherOffset + size_0_otherOffset + size_1_otherOffset)
        this.configuration.sizeLemmaNextDWord(offset + size_0_offset + size_1_offset, otherOffset + size_0_otherOffset + size_1_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORT_CONFIGURATION: Int = 2946 /*(SIZE(0 .. maxConfigurationSize)) */
@inline @cCode.inline val ERR_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORT_CONFIGURATION_ELM_2: Int = 2941 /* */

@inline @cCode.inline val ERR_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORT: Int = 2951 /* */
@inline @cCode.inline val ERR_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORT_PACKETSTOREID_2: Int = 2882 /* */

 
 

@inline @cCode.inline val ERR_ACN_ENCODE_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORT: Int = 2954 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORT_PACKETSTOREID_2: Int = 2885 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORT_N1_UNINITIALIZED: Int = 2955 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORT_N1: Int = 2887 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORT_CONFIGURATION: Int = 2949 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORT_CONFIGURATION_ELM_2: Int = 2944 /*  */
@inline @cCode.inline val TStorage_ControlHousekeepingParameterReport_REQUIRED_BYTES_FOR_ACN_ENCODING = 8011
@inline @cCode.inline val TStorage_ControlHousekeepingParameterReport_REQUIRED_BITS_FOR_ACN_ENCODING = 64085

@inline @cCode.inline val ERR_ACN_DECODE_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORT: Int = 2956 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORT_PACKETSTOREID_2: Int = 2886 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORT_N1: Int = 2888 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORT_CONFIGURATION: Int = 2950 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORT_CONFIGURATION_ELM_2: Int = 2945 /*  */


