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

/*-- TTM_12_28_MonitoringDefinitionReport --------------------------------------------*/


case class TTM_12_28_MonitoringDefinitionReport_pmon_ID (nCount: Int, arr: Vector[TPMON_ID])
{
    require(this.arr.size <= 4095 && 1 <= this.nCount && this.nCount <= this.arr.size)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854644767L))
        TTM_12_28_MonitoringDefinitionReport_pmon_ID.sizeRange(this.arr, offset, 0, this.nCount)
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 131040L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854644767L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854644767L))
        TTM_12_28_MonitoringDefinitionReport_pmon_ID.sizeLemmaAnyOffset(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854644767L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854644767L))
        require((offset % 8L) == (otherOffset % 8L))
        TTM_12_28_MonitoringDefinitionReport_pmon_ID.sizeLemmaNextByte(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854644767L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854644767L))
        require((offset % 16L) == (otherOffset % 16L))
        TTM_12_28_MonitoringDefinitionReport_pmon_ID.sizeLemmaNextWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854644767L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854644767L))
        require((offset % 32L) == (otherOffset % 32L))
        TTM_12_28_MonitoringDefinitionReport_pmon_ID.sizeLemmaNextDWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}
object TTM_12_28_MonitoringDefinitionReport_pmon_ID {
    def sizeRange(ls: Vector[TPMON_ID], offset: Long, from: Int, to: Int): Long = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4095))
        require((0L <= offset) && (offset <= 9223372036854775807L - 32L * (to - from)))
        decreases(to - from)
        if (from == to) {
            0L
        } else {
            val elemSize = 32L
            assert(elemSize == 32L)
            elemSize + TTM_12_28_MonitoringDefinitionReport_pmon_ID.sizeRange(ls, offset + elemSize, from + 1, to)
        }
    }.ensuring { (res: Long) => 
        val nbElems = (to - from)
        (0L <= res && res <= 32L * nbElems)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(ls: Vector[TPMON_ID], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4095))
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
            TTM_12_28_MonitoringDefinitionReport_pmon_ID.sizeLemmaAnyOffset(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_12_28_MonitoringDefinitionReport_pmon_ID.sizeRange(ls, offset, from, to) == TTM_12_28_MonitoringDefinitionReport_pmon_ID.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(ls: Vector[TPMON_ID], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4095))
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
            TTM_12_28_MonitoringDefinitionReport_pmon_ID.sizeLemmaNextByte(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_12_28_MonitoringDefinitionReport_pmon_ID.sizeRange(ls, offset, from, to) == TTM_12_28_MonitoringDefinitionReport_pmon_ID.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(ls: Vector[TPMON_ID], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4095))
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
            TTM_12_28_MonitoringDefinitionReport_pmon_ID.sizeLemmaNextWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_12_28_MonitoringDefinitionReport_pmon_ID.sizeRange(ls, offset, from, to) == TTM_12_28_MonitoringDefinitionReport_pmon_ID.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(ls: Vector[TPMON_ID], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4095))
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
            TTM_12_28_MonitoringDefinitionReport_pmon_ID.sizeLemmaNextDWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_12_28_MonitoringDefinitionReport_pmon_ID.sizeRange(ls, offset, from, to) == TTM_12_28_MonitoringDefinitionReport_pmon_ID.sizeRange(ls, otherOffset, from, to)
    }
}

case class TTM_12_28_MonitoringDefinitionReport (
    fmon_ID: TFMON_ID, 
    checkValidityCondition: OptionMut[TCheckValidityCondition], 
    fmonProtectionStatus: OptionMut[TFMON_ProtectionStatus], 
    fmonStatus: TFMON_Status, 
    min_PMON_FailingNumber: OptionMut[TPUSC_UINT32], 
    pmon_ID: TTM_12_28_MonitoringDefinitionReport_pmon_ID
) {
    require(this.checkValidityCondition.isDefined && this.fmonProtectionStatus.isDefined && this.min_PMON_FailingNumber.isDefined)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854644613L))
        val size_0 = 32L
        val size_1 = this.checkValidityCondition match {
            case SomeMut(v) =>
                v.size(offset + size_0)
            case NoneMut() =>
                0L
        }
        val size_2 = this.fmonProtectionStatus match {
            case SomeMut(v) =>
                1L
            case NoneMut() =>
                0L
        }
        val size_3 = 1L
        val size_4 = this.min_PMON_FailingNumber match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_5 = 32L
        val size_6 = this.pmon_ID.size(offset + size_0 + size_1 + size_2 + size_3 + size_4 + size_5)
        size_0 + size_1 + size_2 + size_3 + size_4 + size_5 + size_6
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 131194L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854644613L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854644613L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.checkValidityCondition match {
            case SomeMut(v) =>
                v.size(offset + size_0_offset)
            case NoneMut() =>
                0L
        }
        val size_1_otherOffset = this.checkValidityCondition match {
            case SomeMut(v) =>
                v.size(otherOffset + size_0_otherOffset)
            case NoneMut() =>
                0L
        }
        this.checkValidityCondition match {
            case SomeMut(v) =>
                v.sizeLemmaAnyOffset(offset + size_0_offset, otherOffset + size_0_otherOffset)
            case NoneMut() =>
                ()
        }
        val size_2_offset = this.fmonProtectionStatus match {
            case SomeMut(v) =>
                1L
            case NoneMut() =>
                0L
        }
        val size_2_otherOffset = this.fmonProtectionStatus match {
            case SomeMut(v) =>
                1L
            case NoneMut() =>
                0L
        }
        val size_3_offset = 1L
        val size_3_otherOffset = 1L
        val size_4_offset = this.min_PMON_FailingNumber match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_4_otherOffset = this.min_PMON_FailingNumber match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_5_offset = 32L
        val size_5_otherOffset = 32L
        val size_6_offset = this.pmon_ID.size(offset + size_0_offset + size_1_offset + size_2_offset + size_3_offset + size_4_offset + size_5_offset)
        val size_6_otherOffset = this.pmon_ID.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset + size_3_otherOffset + size_4_otherOffset + size_5_otherOffset)
        this.pmon_ID.sizeLemmaAnyOffset(offset + size_0_offset + size_1_offset + size_2_offset + size_3_offset + size_4_offset + size_5_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset + size_3_otherOffset + size_4_otherOffset + size_5_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854644613L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854644613L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.checkValidityCondition match {
            case SomeMut(v) =>
                v.size(offset + size_0_offset)
            case NoneMut() =>
                0L
        }
        val size_1_otherOffset = this.checkValidityCondition match {
            case SomeMut(v) =>
                v.size(otherOffset + size_0_otherOffset)
            case NoneMut() =>
                0L
        }
        this.checkValidityCondition match {
            case SomeMut(v) =>
                v.sizeLemmaNextByte(offset + size_0_offset, otherOffset + size_0_otherOffset)
            case NoneMut() =>
                ()
        }
        val size_2_offset = this.fmonProtectionStatus match {
            case SomeMut(v) =>
                1L
            case NoneMut() =>
                0L
        }
        val size_2_otherOffset = this.fmonProtectionStatus match {
            case SomeMut(v) =>
                1L
            case NoneMut() =>
                0L
        }
        val size_3_offset = 1L
        val size_3_otherOffset = 1L
        val size_4_offset = this.min_PMON_FailingNumber match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_4_otherOffset = this.min_PMON_FailingNumber match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_5_offset = 32L
        val size_5_otherOffset = 32L
        val size_6_offset = this.pmon_ID.size(offset + size_0_offset + size_1_offset + size_2_offset + size_3_offset + size_4_offset + size_5_offset)
        val size_6_otherOffset = this.pmon_ID.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset + size_3_otherOffset + size_4_otherOffset + size_5_otherOffset)
        this.pmon_ID.sizeLemmaNextByte(offset + size_0_offset + size_1_offset + size_2_offset + size_3_offset + size_4_offset + size_5_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset + size_3_otherOffset + size_4_otherOffset + size_5_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854644613L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854644613L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.checkValidityCondition match {
            case SomeMut(v) =>
                v.size(offset + size_0_offset)
            case NoneMut() =>
                0L
        }
        val size_1_otherOffset = this.checkValidityCondition match {
            case SomeMut(v) =>
                v.size(otherOffset + size_0_otherOffset)
            case NoneMut() =>
                0L
        }
        this.checkValidityCondition match {
            case SomeMut(v) =>
                v.sizeLemmaNextWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
            case NoneMut() =>
                ()
        }
        val size_2_offset = this.fmonProtectionStatus match {
            case SomeMut(v) =>
                1L
            case NoneMut() =>
                0L
        }
        val size_2_otherOffset = this.fmonProtectionStatus match {
            case SomeMut(v) =>
                1L
            case NoneMut() =>
                0L
        }
        val size_3_offset = 1L
        val size_3_otherOffset = 1L
        val size_4_offset = this.min_PMON_FailingNumber match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_4_otherOffset = this.min_PMON_FailingNumber match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_5_offset = 32L
        val size_5_otherOffset = 32L
        val size_6_offset = this.pmon_ID.size(offset + size_0_offset + size_1_offset + size_2_offset + size_3_offset + size_4_offset + size_5_offset)
        val size_6_otherOffset = this.pmon_ID.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset + size_3_otherOffset + size_4_otherOffset + size_5_otherOffset)
        this.pmon_ID.sizeLemmaNextWord(offset + size_0_offset + size_1_offset + size_2_offset + size_3_offset + size_4_offset + size_5_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset + size_3_otherOffset + size_4_otherOffset + size_5_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854644613L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854644613L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.checkValidityCondition match {
            case SomeMut(v) =>
                v.size(offset + size_0_offset)
            case NoneMut() =>
                0L
        }
        val size_1_otherOffset = this.checkValidityCondition match {
            case SomeMut(v) =>
                v.size(otherOffset + size_0_otherOffset)
            case NoneMut() =>
                0L
        }
        this.checkValidityCondition match {
            case SomeMut(v) =>
                v.sizeLemmaNextDWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
            case NoneMut() =>
                ()
        }
        val size_2_offset = this.fmonProtectionStatus match {
            case SomeMut(v) =>
                1L
            case NoneMut() =>
                0L
        }
        val size_2_otherOffset = this.fmonProtectionStatus match {
            case SomeMut(v) =>
                1L
            case NoneMut() =>
                0L
        }
        val size_3_offset = 1L
        val size_3_otherOffset = 1L
        val size_4_offset = this.min_PMON_FailingNumber match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_4_otherOffset = this.min_PMON_FailingNumber match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_5_offset = 32L
        val size_5_otherOffset = 32L
        val size_6_offset = this.pmon_ID.size(offset + size_0_offset + size_1_offset + size_2_offset + size_3_offset + size_4_offset + size_5_offset)
        val size_6_otherOffset = this.pmon_ID.size(otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset + size_3_otherOffset + size_4_otherOffset + size_5_otherOffset)
        this.pmon_ID.sizeLemmaNextDWord(offset + size_0_offset + size_1_offset + size_2_offset + size_3_offset + size_4_offset + size_5_offset, otherOffset + size_0_otherOffset + size_1_otherOffset + size_2_otherOffset + size_3_otherOffset + size_4_otherOffset + size_5_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TM_12_28_MONITORINGDEFINITIONREPORT_PMON_ID: Int = 2070 /*(SIZE(1 .. maxTM-12-26-PMON-ID-Count)) */
@inline @cCode.inline val ERR_TM_12_28_MONITORINGDEFINITIONREPORT_PMON_ID_ELM_2: Int = 2065 /* */

@inline @cCode.inline val ERR_TM_12_28_MONITORINGDEFINITIONREPORT: Int = 2075 /*(WITH COMPONENTS
{
    checkValidityCondition PRESENT,
    fmonProtectionStatus PRESENT,
    min-PMON-FailingNumber PRESENT
}) */
@inline @cCode.inline val ERR_TM_12_28_MONITORINGDEFINITIONREPORT_FMON_ID_2: Int = 1979 /* */
@inline @cCode.inline val ERR_TM_12_28_MONITORINGDEFINITIONREPORT_CHECKVALIDITYCONDITION_2: Int = 2018 /* */
@inline @cCode.inline val ERR_TM_12_28_MONITORINGDEFINITIONREPORT_FMONPROTECTIONSTATUS_2: Int = 2028 /* */
@inline @cCode.inline val ERR_TM_12_28_MONITORINGDEFINITIONREPORT_FMONSTATUS_2: Int = 2038 /* */
@inline @cCode.inline val ERR_TM_12_28_MONITORINGDEFINITIONREPORT_MIN_PMON_FAILINGNUMBER_2_2: Int = 2053 /* */

 
 

@inline @cCode.inline val ERR_ACN_ENCODE_TM_12_28_MONITORINGDEFINITIONREPORT: Int = 2078 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_12_28_MONITORINGDEFINITIONREPORT_FMON_ID_2: Int = 1982 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_12_28_MONITORINGDEFINITIONREPORT_CHECKVALIDITYCONDITION_2: Int = 2021 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_12_28_MONITORINGDEFINITIONREPORT_FMONPROTECTIONSTATUS_2: Int = 2031 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_12_28_MONITORINGDEFINITIONREPORT_FMONSTATUS_2: Int = 2041 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_12_28_MONITORINGDEFINITIONREPORT_MIN_PMON_FAILINGNUMBER_2_2: Int = 2056 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_12_28_MONITORINGDEFINITIONREPORT_N2_UNINITIALIZED: Int = 2079 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_12_28_MONITORINGDEFINITIONREPORT_N2: Int = 2058 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_12_28_MONITORINGDEFINITIONREPORT_PMON_ID: Int = 2073 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_12_28_MONITORINGDEFINITIONREPORT_PMON_ID_ELM_2: Int = 2068 /*  */
@inline @cCode.inline val TTM_12_28_MonitoringDefinitionReport_REQUIRED_BYTES_FOR_ACN_ENCODING = 16400
@inline @cCode.inline val TTM_12_28_MonitoringDefinitionReport_REQUIRED_BITS_FOR_ACN_ENCODING = 131194

@inline @cCode.inline val ERR_ACN_DECODE_TM_12_28_MONITORINGDEFINITIONREPORT: Int = 2080 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_12_28_MONITORINGDEFINITIONREPORT_FMON_ID_2: Int = 1983 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_12_28_MONITORINGDEFINITIONREPORT_CHECKVALIDITYCONDITION_2: Int = 2022 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_12_28_MONITORINGDEFINITIONREPORT_FMONPROTECTIONSTATUS_2: Int = 2032 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_12_28_MONITORINGDEFINITIONREPORT_FMONSTATUS_2: Int = 2042 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_12_28_MONITORINGDEFINITIONREPORT_MIN_PMON_FAILINGNUMBER_2_2: Int = 2057 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_12_28_MONITORINGDEFINITIONREPORT_N2: Int = 2059 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_12_28_MONITORINGDEFINITIONREPORT_PMON_ID: Int = 2074 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_12_28_MONITORINGDEFINITIONREPORT_PMON_ID_ELM_2: Int = 2069 /*  */
/*-- TTM_12_28_FunctionalMonitoringDefinitionReport --------------------------------------------*/


case class TTM_12_28_FunctionalMonitoringDefinitionReport_report (nCount: Int, arr: Vector[TTM_12_28_MonitoringDefinitionReport])
{
    require(this.arr.size <= 4095 && 1 <= this.nCount && this.nCount <= this.arr.size)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036317536377L))
        TTM_12_28_FunctionalMonitoringDefinitionReport_report.sizeRange(this.arr, offset, 0, this.nCount)
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 537239430L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036317536377L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036317536377L))
        TTM_12_28_FunctionalMonitoringDefinitionReport_report.sizeLemmaAnyOffset(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036317536377L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036317536377L))
        require((offset % 8L) == (otherOffset % 8L))
        TTM_12_28_FunctionalMonitoringDefinitionReport_report.sizeLemmaNextByte(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036317536377L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036317536377L))
        require((offset % 16L) == (otherOffset % 16L))
        TTM_12_28_FunctionalMonitoringDefinitionReport_report.sizeLemmaNextWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036317536377L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036317536377L))
        require((offset % 32L) == (otherOffset % 32L))
        TTM_12_28_FunctionalMonitoringDefinitionReport_report.sizeLemmaNextDWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}
object TTM_12_28_FunctionalMonitoringDefinitionReport_report {
    def sizeRange(ls: Vector[TTM_12_28_MonitoringDefinitionReport], offset: Long, from: Int, to: Int): Long = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4095))
        require((0L <= offset) && (offset <= 9223372036854775807L - 131194L * (to - from)))
        decreases(to - from)
        if (from == to) {
            0L
        } else {
            val elemSize = ls.apply(from).size(offset)
            assert(0L <= elemSize && elemSize <= 131194L)
            elemSize + TTM_12_28_FunctionalMonitoringDefinitionReport_report.sizeRange(ls, offset + elemSize, from + 1, to)
        }
    }.ensuring { (res: Long) => 
        val nbElems = (to - from)
        (0L <= res && res <= 131194L * nbElems)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(ls: Vector[TTM_12_28_MonitoringDefinitionReport], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4095))
        require((0L <= offset) && (offset <= 9223372036854775807L - 131194L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 131194L * (to - from)))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 131194L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 131194L)
            ls.apply(from).sizeLemmaAnyOffset(offset, otherOffset)
            TTM_12_28_FunctionalMonitoringDefinitionReport_report.sizeLemmaAnyOffset(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_12_28_FunctionalMonitoringDefinitionReport_report.sizeRange(ls, offset, from, to) == TTM_12_28_FunctionalMonitoringDefinitionReport_report.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(ls: Vector[TTM_12_28_MonitoringDefinitionReport], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4095))
        require((0L <= offset) && (offset <= 9223372036854775807L - 131194L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 131194L * (to - from)))
        require((offset % 8L) == (otherOffset % 8L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 131194L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 131194L)
            ls.apply(from).sizeLemmaNextByte(offset, otherOffset)
            TTM_12_28_FunctionalMonitoringDefinitionReport_report.sizeLemmaNextByte(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_12_28_FunctionalMonitoringDefinitionReport_report.sizeRange(ls, offset, from, to) == TTM_12_28_FunctionalMonitoringDefinitionReport_report.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(ls: Vector[TTM_12_28_MonitoringDefinitionReport], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4095))
        require((0L <= offset) && (offset <= 9223372036854775807L - 131194L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 131194L * (to - from)))
        require((offset % 16L) == (otherOffset % 16L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 131194L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 131194L)
            ls.apply(from).sizeLemmaNextWord(offset, otherOffset)
            TTM_12_28_FunctionalMonitoringDefinitionReport_report.sizeLemmaNextWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_12_28_FunctionalMonitoringDefinitionReport_report.sizeRange(ls, offset, from, to) == TTM_12_28_FunctionalMonitoringDefinitionReport_report.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(ls: Vector[TTM_12_28_MonitoringDefinitionReport], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 4095))
        require((0L <= offset) && (offset <= 9223372036854775807L - 131194L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 131194L * (to - from)))
        require((offset % 32L) == (otherOffset % 32L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(0L <= elemSizeOff && elemSizeOff <= 131194L)
            assert(0L <= elemSizeOtherOff && elemSizeOtherOff <= 131194L)
            ls.apply(from).sizeLemmaNextDWord(offset, otherOffset)
            TTM_12_28_FunctionalMonitoringDefinitionReport_report.sizeLemmaNextDWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTM_12_28_FunctionalMonitoringDefinitionReport_report.sizeRange(ls, offset, from, to) == TTM_12_28_FunctionalMonitoringDefinitionReport_report.sizeRange(ls, otherOffset, from, to)
    }
}

case class TTM_12_28_FunctionalMonitoringDefinitionReport (
    report: TTM_12_28_FunctionalMonitoringDefinitionReport_report
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036317536345L))
        val size_0 = 32L
        val size_1 = this.report.size(offset + size_0)
        size_0 + size_1
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 537239462L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036317536345L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036317536345L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.report.size(offset + size_0_offset)
        val size_1_otherOffset = this.report.size(otherOffset + size_0_otherOffset)
        this.report.sizeLemmaAnyOffset(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036317536345L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036317536345L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.report.size(offset + size_0_offset)
        val size_1_otherOffset = this.report.size(otherOffset + size_0_otherOffset)
        this.report.sizeLemmaNextByte(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036317536345L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036317536345L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.report.size(offset + size_0_offset)
        val size_1_otherOffset = this.report.size(otherOffset + size_0_otherOffset)
        this.report.sizeLemmaNextWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036317536345L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036317536345L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.report.size(offset + size_0_offset)
        val size_1_otherOffset = this.report.size(otherOffset + size_0_otherOffset)
        this.report.sizeLemmaNextDWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TM_12_28_FUNCTIONALMONITORINGDEFINITIONREPORT_REPORT: Int = 1963 /*(SIZE(1 .. 4095)) */
@inline @cCode.inline val ERR_TM_12_28_FUNCTIONALMONITORINGDEFINITIONREPORT_REPORT_ELM_2: Int = 1958 /* */

@inline @cCode.inline val ERR_TM_12_28_FUNCTIONALMONITORINGDEFINITIONREPORT: Int = 1968 /* */

 
 

@inline @cCode.inline val ERR_ACN_ENCODE_TM_12_28_FUNCTIONALMONITORINGDEFINITIONREPORT: Int = 1971 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_12_28_FUNCTIONALMONITORINGDEFINITIONREPORT_N1_UNINITIALIZED: Int = 1972 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_12_28_FUNCTIONALMONITORINGDEFINITIONREPORT_N1: Int = 1850 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_12_28_FUNCTIONALMONITORINGDEFINITIONREPORT_REPORT: Int = 1966 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_12_28_FUNCTIONALMONITORINGDEFINITIONREPORT_REPORT_ELM_2: Int = 1961 /*  */
@inline @cCode.inline val TTM_12_28_FunctionalMonitoringDefinitionReport_REQUIRED_BYTES_FOR_ACN_ENCODING = 67154933
@inline @cCode.inline val TTM_12_28_FunctionalMonitoringDefinitionReport_REQUIRED_BITS_FOR_ACN_ENCODING = 537239462

@inline @cCode.inline val ERR_ACN_DECODE_TM_12_28_FUNCTIONALMONITORINGDEFINITIONREPORT: Int = 1973 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_12_28_FUNCTIONALMONITORINGDEFINITIONREPORT_N1: Int = 1851 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_12_28_FUNCTIONALMONITORINGDEFINITIONREPORT_REPORT: Int = 1967 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_12_28_FUNCTIONALMONITORINGDEFINITIONREPORT_REPORT_ELM_2: Int = 1962 /*  */

// @inline @cCode.inline val maxTM_12_26_MonitoringDefinitionCount: Int = 4095 // defined in body
// @inline @cCode.inline val maxTM_12_26_PMON_ID_Count: Int = 4095 // defined in body

