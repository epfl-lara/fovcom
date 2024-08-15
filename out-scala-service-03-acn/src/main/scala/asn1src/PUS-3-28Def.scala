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

/*-- TTC_3_28_GenerateAOneShotReportForDiagnosticParameterReportStructures --------------------------------------------*/


case class TTC_3_28_GenerateAOneShotReportForDiagnosticParameterReportStructures_diagnosticParameterReportStructure_ID (nCount: Int, arr: Vector[TDiagnosticParameterReportStructure_ID])
{
    require(this.arr.size <= 63 && 1 <= this.nCount && this.nCount <= this.arr.size)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854773791L))
        TTC_3_28_GenerateAOneShotReportForDiagnosticParameterReportStructures_diagnosticParameterReportStructure_ID.sizeRange(this.arr, offset, 0, this.nCount)
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 2016L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854773791L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854773791L))
        TTC_3_28_GenerateAOneShotReportForDiagnosticParameterReportStructures_diagnosticParameterReportStructure_ID.sizeLemmaAnyOffset(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854773791L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854773791L))
        require((offset % 8L) == (otherOffset % 8L))
        TTC_3_28_GenerateAOneShotReportForDiagnosticParameterReportStructures_diagnosticParameterReportStructure_ID.sizeLemmaNextByte(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854773791L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854773791L))
        require((offset % 16L) == (otherOffset % 16L))
        TTC_3_28_GenerateAOneShotReportForDiagnosticParameterReportStructures_diagnosticParameterReportStructure_ID.sizeLemmaNextWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854773791L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854773791L))
        require((offset % 32L) == (otherOffset % 32L))
        TTC_3_28_GenerateAOneShotReportForDiagnosticParameterReportStructures_diagnosticParameterReportStructure_ID.sizeLemmaNextDWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}
object TTC_3_28_GenerateAOneShotReportForDiagnosticParameterReportStructures_diagnosticParameterReportStructure_ID {
    def sizeRange(ls: Vector[ULong], offset: Long, from: Int, to: Int): Long = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 32L * (to - from)))
        decreases(to - from)
        if (from == to) {
            0L
        } else {
            val elemSize = 32L
            assert(elemSize == 32L)
            elemSize + TTC_3_28_GenerateAOneShotReportForDiagnosticParameterReportStructures_diagnosticParameterReportStructure_ID.sizeRange(ls, offset + elemSize, from + 1, to)
        }
    }.ensuring { (res: Long) => 
        val nbElems = (to - from)
        (0L <= res && res <= 32L * nbElems)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(ls: Vector[ULong], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 32L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 32L * (to - from)))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = 32L
            val elemSizeOtherOff = 32L
            assert(elemSizeOff == 32L)
            assert(elemSizeOtherOff == 32L)
            TTC_3_28_GenerateAOneShotReportForDiagnosticParameterReportStructures_diagnosticParameterReportStructure_ID.sizeLemmaAnyOffset(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_3_28_GenerateAOneShotReportForDiagnosticParameterReportStructures_diagnosticParameterReportStructure_ID.sizeRange(ls, offset, from, to) == TTC_3_28_GenerateAOneShotReportForDiagnosticParameterReportStructures_diagnosticParameterReportStructure_ID.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(ls: Vector[ULong], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 32L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 32L * (to - from)))
        require((offset % 8L) == (otherOffset % 8L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = 32L
            val elemSizeOtherOff = 32L
            assert(elemSizeOff == 32L)
            assert(elemSizeOtherOff == 32L)
            TTC_3_28_GenerateAOneShotReportForDiagnosticParameterReportStructures_diagnosticParameterReportStructure_ID.sizeLemmaNextByte(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_3_28_GenerateAOneShotReportForDiagnosticParameterReportStructures_diagnosticParameterReportStructure_ID.sizeRange(ls, offset, from, to) == TTC_3_28_GenerateAOneShotReportForDiagnosticParameterReportStructures_diagnosticParameterReportStructure_ID.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(ls: Vector[ULong], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 32L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 32L * (to - from)))
        require((offset % 16L) == (otherOffset % 16L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = 32L
            val elemSizeOtherOff = 32L
            assert(elemSizeOff == 32L)
            assert(elemSizeOtherOff == 32L)
            TTC_3_28_GenerateAOneShotReportForDiagnosticParameterReportStructures_diagnosticParameterReportStructure_ID.sizeLemmaNextWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_3_28_GenerateAOneShotReportForDiagnosticParameterReportStructures_diagnosticParameterReportStructure_ID.sizeRange(ls, offset, from, to) == TTC_3_28_GenerateAOneShotReportForDiagnosticParameterReportStructures_diagnosticParameterReportStructure_ID.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(ls: Vector[ULong], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 32L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 32L * (to - from)))
        require((offset % 32L) == (otherOffset % 32L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = 32L
            val elemSizeOtherOff = 32L
            assert(elemSizeOff == 32L)
            assert(elemSizeOtherOff == 32L)
            TTC_3_28_GenerateAOneShotReportForDiagnosticParameterReportStructures_diagnosticParameterReportStructure_ID.sizeLemmaNextDWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_3_28_GenerateAOneShotReportForDiagnosticParameterReportStructures_diagnosticParameterReportStructure_ID.sizeRange(ls, offset, from, to) == TTC_3_28_GenerateAOneShotReportForDiagnosticParameterReportStructures_diagnosticParameterReportStructure_ID.sizeRange(ls, otherOffset, from, to)
    }
}

case class TTC_3_28_GenerateAOneShotReportForDiagnosticParameterReportStructures (
    diagnosticParameterReportStructure_ID: TTC_3_28_GenerateAOneShotReportForDiagnosticParameterReportStructures_diagnosticParameterReportStructure_ID
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854773759L))
        val size_0 = 32L
        val size_1 = this.diagnosticParameterReportStructure_ID.size(offset + size_0)
        size_0 + size_1
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 2048L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854773759L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854773759L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.diagnosticParameterReportStructure_ID.size(offset + size_0_offset)
        val size_1_otherOffset = this.diagnosticParameterReportStructure_ID.size(otherOffset + size_0_otherOffset)
        this.diagnosticParameterReportStructure_ID.sizeLemmaAnyOffset(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854773759L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854773759L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.diagnosticParameterReportStructure_ID.size(offset + size_0_offset)
        val size_1_otherOffset = this.diagnosticParameterReportStructure_ID.size(otherOffset + size_0_otherOffset)
        this.diagnosticParameterReportStructure_ID.sizeLemmaNextByte(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854773759L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854773759L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.diagnosticParameterReportStructure_ID.size(offset + size_0_offset)
        val size_1_otherOffset = this.diagnosticParameterReportStructure_ID.size(otherOffset + size_0_otherOffset)
        this.diagnosticParameterReportStructure_ID.sizeLemmaNextWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854773759L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854773759L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.diagnosticParameterReportStructure_ID.size(offset + size_0_offset)
        val size_1_otherOffset = this.diagnosticParameterReportStructure_ID.size(otherOffset + size_0_otherOffset)
        this.diagnosticParameterReportStructure_ID.sizeLemmaNextDWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TC_3_28_GENERATEAONESHOTREPORTFORDIAGNOSTICPARAMETERREPORTSTRUCTURES_DIAGNOSTICPARAMETERREPORTSTRUCTURE_ID: Int = 610 /*(SIZE (1 .. maxTC-3-28-DiagnosticParameterReportStructure-ID-Count)) */
@inline @cCode.inline val ERR_TC_3_28_GENERATEAONESHOTREPORTFORDIAGNOSTICPARAMETERREPORTSTRUCTURES_DIAGNOSTICPARAMETERREPORTSTRUCTURE_ID_ELM_2: Int = 605 /* */

@inline @cCode.inline val ERR_TC_3_28_GENERATEAONESHOTREPORTFORDIAGNOSTICPARAMETERREPORTSTRUCTURES: Int = 615 /* */

 
 

@inline @cCode.inline val ERR_ACN_ENCODE_TC_3_28_GENERATEAONESHOTREPORTFORDIAGNOSTICPARAMETERREPORTSTRUCTURES: Int = 618 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_3_28_GENERATEAONESHOTREPORTFORDIAGNOSTICPARAMETERREPORTSTRUCTURES_N_UNINITIALIZED: Int = 619 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_3_28_GENERATEAONESHOTREPORTFORDIAGNOSTICPARAMETERREPORTSTRUCTURES_N: Int = 598 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_3_28_GENERATEAONESHOTREPORTFORDIAGNOSTICPARAMETERREPORTSTRUCTURES_DIAGNOSTICPARAMETERREPORTSTRUCTURE_ID: Int = 613 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_3_28_GENERATEAONESHOTREPORTFORDIAGNOSTICPARAMETERREPORTSTRUCTURES_DIAGNOSTICPARAMETERREPORTSTRUCTURE_ID_ELM_2: Int = 608 /*  */
@inline @cCode.inline val TTC_3_28_GenerateAOneShotReportForDiagnosticParameterReportStructures_REQUIRED_BYTES_FOR_ACN_ENCODING = 256
@inline @cCode.inline val TTC_3_28_GenerateAOneShotReportForDiagnosticParameterReportStructures_REQUIRED_BITS_FOR_ACN_ENCODING = 2048

@inline @cCode.inline val ERR_ACN_DECODE_TC_3_28_GENERATEAONESHOTREPORTFORDIAGNOSTICPARAMETERREPORTSTRUCTURES: Int = 620 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_3_28_GENERATEAONESHOTREPORTFORDIAGNOSTICPARAMETERREPORTSTRUCTURES_N: Int = 599 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_3_28_GENERATEAONESHOTREPORTFORDIAGNOSTICPARAMETERREPORTSTRUCTURES_DIAGNOSTICPARAMETERREPORTSTRUCTURE_ID: Int = 614 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_3_28_GENERATEAONESHOTREPORTFORDIAGNOSTICPARAMETERREPORTSTRUCTURES_DIAGNOSTICPARAMETERREPORTSTRUCTURE_ID_ELM_2: Int = 609 /*  */

// @inline @cCode.inline val maxTC_3_28_DiagnosticParameterReportStructure_ID_Count: Int = 63 // defined in body

