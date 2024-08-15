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

/*-- TDiagnosticParameterReportStructureIntervals --------------------------------------------*/

case class TDiagnosticParameterReportStructureIntervals (
    diagnosticParameterReportStructure_ID: TDiagnosticParameterReportStructure_ID, 
    collectionInterval: TPUSC_UINT32
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


@inline @cCode.inline val ERR_DIAGNOSTICPARAMETERREPORTSTRUCTUREINTERVALS: Int = 1120 /* */
@inline @cCode.inline val ERR_DIAGNOSTICPARAMETERREPORTSTRUCTUREINTERVALS_DIAGNOSTICPARAMETERREPORTSTRUCTURE_ID_2: Int = 1100 /* */
@inline @cCode.inline val ERR_DIAGNOSTICPARAMETERREPORTSTRUCTUREINTERVALS_COLLECTIONINTERVAL_2_2: Int = 1115 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_DIAGNOSTICPARAMETERREPORTSTRUCTUREINTERVALS: Int = 1123 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_DIAGNOSTICPARAMETERREPORTSTRUCTUREINTERVALS_DIAGNOSTICPARAMETERREPORTSTRUCTURE_ID_2: Int = 1103 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_DIAGNOSTICPARAMETERREPORTSTRUCTUREINTERVALS_COLLECTIONINTERVAL_2_2: Int = 1118 /*  */
@inline @cCode.inline val TDiagnosticParameterReportStructureIntervals_REQUIRED_BYTES_FOR_ACN_ENCODING = 8
@inline @cCode.inline val TDiagnosticParameterReportStructureIntervals_REQUIRED_BITS_FOR_ACN_ENCODING = 64

@inline @cCode.inline val ERR_ACN_DECODE_DIAGNOSTICPARAMETERREPORTSTRUCTUREINTERVALS: Int = 1124 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_DIAGNOSTICPARAMETERREPORTSTRUCTUREINTERVALS_DIAGNOSTICPARAMETERREPORTSTRUCTURE_ID_2: Int = 1104 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_DIAGNOSTICPARAMETERREPORTSTRUCTUREINTERVALS_COLLECTIONINTERVAL_2_2: Int = 1119 /*  */
/*-- TTC_3_32_ModifyTheCollectionIntervalOfDiagnosticParameterReportStructures --------------------------------------------*/


case class TTC_3_32_ModifyTheCollectionIntervalOfDiagnosticParameterReportStructures_diagnosticParamererReportStructureIntervals (nCount: Int, arr: Vector[TDiagnosticParameterReportStructureIntervals])
{
    require(this.arr.size <= 63 && 1 <= this.nCount && this.nCount <= this.arr.size)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854771775L))
        TTC_3_32_ModifyTheCollectionIntervalOfDiagnosticParameterReportStructures_diagnosticParamererReportStructureIntervals.sizeRange(this.arr, offset, 0, this.nCount)
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 4032L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771775L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771775L))
        TTC_3_32_ModifyTheCollectionIntervalOfDiagnosticParameterReportStructures_diagnosticParamererReportStructureIntervals.sizeLemmaAnyOffset(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771775L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771775L))
        require((offset % 8L) == (otherOffset % 8L))
        TTC_3_32_ModifyTheCollectionIntervalOfDiagnosticParameterReportStructures_diagnosticParamererReportStructureIntervals.sizeLemmaNextByte(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771775L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771775L))
        require((offset % 16L) == (otherOffset % 16L))
        TTC_3_32_ModifyTheCollectionIntervalOfDiagnosticParameterReportStructures_diagnosticParamererReportStructureIntervals.sizeLemmaNextWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771775L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771775L))
        require((offset % 32L) == (otherOffset % 32L))
        TTC_3_32_ModifyTheCollectionIntervalOfDiagnosticParameterReportStructures_diagnosticParamererReportStructureIntervals.sizeLemmaNextDWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}
object TTC_3_32_ModifyTheCollectionIntervalOfDiagnosticParameterReportStructures_diagnosticParamererReportStructureIntervals {
    def sizeRange(ls: Vector[TDiagnosticParameterReportStructureIntervals], offset: Long, from: Int, to: Int): Long = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 64L * (to - from)))
        decreases(to - from)
        if (from == to) {
            0L
        } else {
            val elemSize = ls.apply(from).size(offset)
            assert(elemSize == 64L)
            elemSize + TTC_3_32_ModifyTheCollectionIntervalOfDiagnosticParameterReportStructures_diagnosticParamererReportStructureIntervals.sizeRange(ls, offset + elemSize, from + 1, to)
        }
    }.ensuring { (res: Long) => 
        val nbElems = (to - from)
        (0L <= res && res <= 64L * nbElems)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(ls: Vector[TDiagnosticParameterReportStructureIntervals], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
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
            TTC_3_32_ModifyTheCollectionIntervalOfDiagnosticParameterReportStructures_diagnosticParamererReportStructureIntervals.sizeLemmaAnyOffset(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_3_32_ModifyTheCollectionIntervalOfDiagnosticParameterReportStructures_diagnosticParamererReportStructureIntervals.sizeRange(ls, offset, from, to) == TTC_3_32_ModifyTheCollectionIntervalOfDiagnosticParameterReportStructures_diagnosticParamererReportStructureIntervals.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(ls: Vector[TDiagnosticParameterReportStructureIntervals], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
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
            TTC_3_32_ModifyTheCollectionIntervalOfDiagnosticParameterReportStructures_diagnosticParamererReportStructureIntervals.sizeLemmaNextByte(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_3_32_ModifyTheCollectionIntervalOfDiagnosticParameterReportStructures_diagnosticParamererReportStructureIntervals.sizeRange(ls, offset, from, to) == TTC_3_32_ModifyTheCollectionIntervalOfDiagnosticParameterReportStructures_diagnosticParamererReportStructureIntervals.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(ls: Vector[TDiagnosticParameterReportStructureIntervals], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
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
            TTC_3_32_ModifyTheCollectionIntervalOfDiagnosticParameterReportStructures_diagnosticParamererReportStructureIntervals.sizeLemmaNextWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_3_32_ModifyTheCollectionIntervalOfDiagnosticParameterReportStructures_diagnosticParamererReportStructureIntervals.sizeRange(ls, offset, from, to) == TTC_3_32_ModifyTheCollectionIntervalOfDiagnosticParameterReportStructures_diagnosticParamererReportStructureIntervals.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(ls: Vector[TDiagnosticParameterReportStructureIntervals], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
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
            TTC_3_32_ModifyTheCollectionIntervalOfDiagnosticParameterReportStructures_diagnosticParamererReportStructureIntervals.sizeLemmaNextDWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_3_32_ModifyTheCollectionIntervalOfDiagnosticParameterReportStructures_diagnosticParamererReportStructureIntervals.sizeRange(ls, offset, from, to) == TTC_3_32_ModifyTheCollectionIntervalOfDiagnosticParameterReportStructures_diagnosticParamererReportStructureIntervals.sizeRange(ls, otherOffset, from, to)
    }
}

case class TTC_3_32_ModifyTheCollectionIntervalOfDiagnosticParameterReportStructures (
    diagnosticParamererReportStructureIntervals: TTC_3_32_ModifyTheCollectionIntervalOfDiagnosticParameterReportStructures_diagnosticParamererReportStructureIntervals
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854771743L))
        val size_0 = 32L
        val size_1 = this.diagnosticParamererReportStructureIntervals.size(offset + size_0)
        size_0 + size_1
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 4064L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771743L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771743L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.diagnosticParamererReportStructureIntervals.size(offset + size_0_offset)
        val size_1_otherOffset = this.diagnosticParamererReportStructureIntervals.size(otherOffset + size_0_otherOffset)
        this.diagnosticParamererReportStructureIntervals.sizeLemmaAnyOffset(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771743L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771743L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.diagnosticParamererReportStructureIntervals.size(offset + size_0_offset)
        val size_1_otherOffset = this.diagnosticParamererReportStructureIntervals.size(otherOffset + size_0_otherOffset)
        this.diagnosticParamererReportStructureIntervals.sizeLemmaNextByte(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771743L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771743L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.diagnosticParamererReportStructureIntervals.size(offset + size_0_offset)
        val size_1_otherOffset = this.diagnosticParamererReportStructureIntervals.size(otherOffset + size_0_otherOffset)
        this.diagnosticParamererReportStructureIntervals.sizeLemmaNextWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771743L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771743L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.diagnosticParamererReportStructureIntervals.size(offset + size_0_offset)
        val size_1_otherOffset = this.diagnosticParamererReportStructureIntervals.size(otherOffset + size_0_otherOffset)
        this.diagnosticParamererReportStructureIntervals.sizeLemmaNextDWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TC_3_32_MODIFYTHECOLLECTIONINTERVALOFDIAGNOSTICPARAMETERREPORTSTRUCTURES_DIAGNOSTICPARAMERERREPORTSTRUCTUREINTERVALS: Int = 1084 /*(SIZE(1 .. maxTC-3-32-DiagnosticParameterReportStructureIntervalCount)) */
@inline @cCode.inline val ERR_TC_3_32_MODIFYTHECOLLECTIONINTERVALOFDIAGNOSTICPARAMETERREPORTSTRUCTURES_DIAGNOSTICPARAMERERREPORTSTRUCTUREINTERVALS_ELM_2: Int = 1079 /* */

@inline @cCode.inline val ERR_TC_3_32_MODIFYTHECOLLECTIONINTERVALOFDIAGNOSTICPARAMETERREPORTSTRUCTURES: Int = 1089 /* */

 
 

@inline @cCode.inline val ERR_ACN_ENCODE_TC_3_32_MODIFYTHECOLLECTIONINTERVALOFDIAGNOSTICPARAMETERREPORTSTRUCTURES: Int = 1092 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_3_32_MODIFYTHECOLLECTIONINTERVALOFDIAGNOSTICPARAMETERREPORTSTRUCTURES_N_UNINITIALIZED: Int = 1093 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_3_32_MODIFYTHECOLLECTIONINTERVALOFDIAGNOSTICPARAMETERREPORTSTRUCTURES_N: Int = 1047 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_3_32_MODIFYTHECOLLECTIONINTERVALOFDIAGNOSTICPARAMETERREPORTSTRUCTURES_DIAGNOSTICPARAMERERREPORTSTRUCTUREINTERVALS: Int = 1087 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_3_32_MODIFYTHECOLLECTIONINTERVALOFDIAGNOSTICPARAMETERREPORTSTRUCTURES_DIAGNOSTICPARAMERERREPORTSTRUCTUREINTERVALS_ELM_2: Int = 1082 /*  */
@inline @cCode.inline val TTC_3_32_ModifyTheCollectionIntervalOfDiagnosticParameterReportStructures_REQUIRED_BYTES_FOR_ACN_ENCODING = 508
@inline @cCode.inline val TTC_3_32_ModifyTheCollectionIntervalOfDiagnosticParameterReportStructures_REQUIRED_BITS_FOR_ACN_ENCODING = 4064

@inline @cCode.inline val ERR_ACN_DECODE_TC_3_32_MODIFYTHECOLLECTIONINTERVALOFDIAGNOSTICPARAMETERREPORTSTRUCTURES: Int = 1094 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_3_32_MODIFYTHECOLLECTIONINTERVALOFDIAGNOSTICPARAMETERREPORTSTRUCTURES_N: Int = 1048 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_3_32_MODIFYTHECOLLECTIONINTERVALOFDIAGNOSTICPARAMETERREPORTSTRUCTURES_DIAGNOSTICPARAMERERREPORTSTRUCTUREINTERVALS: Int = 1088 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_3_32_MODIFYTHECOLLECTIONINTERVALOFDIAGNOSTICPARAMETERREPORTSTRUCTURES_DIAGNOSTICPARAMERERREPORTSTRUCTUREINTERVALS_ELM_2: Int = 1083 /*  */

// @inline @cCode.inline val maxTC_3_32_DiagnosticParameterReportStructureIntervalCount: Int = 63 // defined in body

