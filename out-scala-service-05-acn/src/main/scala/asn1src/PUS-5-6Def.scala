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

/*-- TTC_5_6_DisableTheReportGenerationOfEventDefinitions --------------------------------------------*/


case class TTC_5_6_DisableTheReportGenerationOfEventDefinitions_eventDefinition_ID (nCount: Int, arr: Vector[TEventDefinition_ID])
{
    require(this.arr.size <= 65535 && 1 <= this.nCount && this.nCount <= this.arr.size)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036852678687L))
        TTC_5_6_DisableTheReportGenerationOfEventDefinitions_eventDefinition_ID.sizeRange(this.arr, offset, 0, this.nCount)
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 2097120L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036852678687L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036852678687L))
        TTC_5_6_DisableTheReportGenerationOfEventDefinitions_eventDefinition_ID.sizeLemmaAnyOffset(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036852678687L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036852678687L))
        require((offset % 8L) == (otherOffset % 8L))
        TTC_5_6_DisableTheReportGenerationOfEventDefinitions_eventDefinition_ID.sizeLemmaNextByte(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036852678687L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036852678687L))
        require((offset % 16L) == (otherOffset % 16L))
        TTC_5_6_DisableTheReportGenerationOfEventDefinitions_eventDefinition_ID.sizeLemmaNextWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036852678687L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036852678687L))
        require((offset % 32L) == (otherOffset % 32L))
        TTC_5_6_DisableTheReportGenerationOfEventDefinitions_eventDefinition_ID.sizeLemmaNextDWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}
object TTC_5_6_DisableTheReportGenerationOfEventDefinitions_eventDefinition_ID {
    def sizeRange(ls: Vector[ULong], offset: Long, from: Int, to: Int): Long = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 65535))
        require((0L <= offset) && (offset <= 9223372036854775807L - 32L * (to - from)))
        decreases(to - from)
        if (from == to) {
            0L
        } else {
            val elemSize = 32L
            assert(elemSize == 32L)
            elemSize + TTC_5_6_DisableTheReportGenerationOfEventDefinitions_eventDefinition_ID.sizeRange(ls, offset + elemSize, from + 1, to)
        }
    }.ensuring { (res: Long) => 
        val nbElems = (to - from)
        (0L <= res && res <= 32L * nbElems)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(ls: Vector[ULong], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 65535))
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
            TTC_5_6_DisableTheReportGenerationOfEventDefinitions_eventDefinition_ID.sizeLemmaAnyOffset(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_5_6_DisableTheReportGenerationOfEventDefinitions_eventDefinition_ID.sizeRange(ls, offset, from, to) == TTC_5_6_DisableTheReportGenerationOfEventDefinitions_eventDefinition_ID.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(ls: Vector[ULong], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 65535))
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
            TTC_5_6_DisableTheReportGenerationOfEventDefinitions_eventDefinition_ID.sizeLemmaNextByte(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_5_6_DisableTheReportGenerationOfEventDefinitions_eventDefinition_ID.sizeRange(ls, offset, from, to) == TTC_5_6_DisableTheReportGenerationOfEventDefinitions_eventDefinition_ID.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(ls: Vector[ULong], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 65535))
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
            TTC_5_6_DisableTheReportGenerationOfEventDefinitions_eventDefinition_ID.sizeLemmaNextWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_5_6_DisableTheReportGenerationOfEventDefinitions_eventDefinition_ID.sizeRange(ls, offset, from, to) == TTC_5_6_DisableTheReportGenerationOfEventDefinitions_eventDefinition_ID.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(ls: Vector[ULong], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 65535))
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
            TTC_5_6_DisableTheReportGenerationOfEventDefinitions_eventDefinition_ID.sizeLemmaNextDWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_5_6_DisableTheReportGenerationOfEventDefinitions_eventDefinition_ID.sizeRange(ls, offset, from, to) == TTC_5_6_DisableTheReportGenerationOfEventDefinitions_eventDefinition_ID.sizeRange(ls, otherOffset, from, to)
    }
}

case class TTC_5_6_DisableTheReportGenerationOfEventDefinitions (
    eventDefinition_ID: TTC_5_6_DisableTheReportGenerationOfEventDefinitions_eventDefinition_ID
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036852678655L))
        val size_0 = 32L
        val size_1 = this.eventDefinition_ID.size(offset + size_0)
        size_0 + size_1
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 2097152L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036852678655L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036852678655L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.eventDefinition_ID.size(offset + size_0_offset)
        val size_1_otherOffset = this.eventDefinition_ID.size(otherOffset + size_0_otherOffset)
        this.eventDefinition_ID.sizeLemmaAnyOffset(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036852678655L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036852678655L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.eventDefinition_ID.size(offset + size_0_offset)
        val size_1_otherOffset = this.eventDefinition_ID.size(otherOffset + size_0_otherOffset)
        this.eventDefinition_ID.sizeLemmaNextByte(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036852678655L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036852678655L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.eventDefinition_ID.size(offset + size_0_offset)
        val size_1_otherOffset = this.eventDefinition_ID.size(otherOffset + size_0_otherOffset)
        this.eventDefinition_ID.sizeLemmaNextWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036852678655L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036852678655L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.eventDefinition_ID.size(offset + size_0_offset)
        val size_1_otherOffset = this.eventDefinition_ID.size(otherOffset + size_0_otherOffset)
        this.eventDefinition_ID.sizeLemmaNextDWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TC_5_6_DISABLETHEREPORTGENERATIONOFEVENTDEFINITIONS_EVENTDEFINITION_ID: Int = 156 /*(SIZE(1 .. maxTC-5-6-EventDefinition-ID-Count)) */
@inline @cCode.inline val ERR_TC_5_6_DISABLETHEREPORTGENERATIONOFEVENTDEFINITIONS_EVENTDEFINITION_ID_ELM_2: Int = 151 /* */

@inline @cCode.inline val ERR_TC_5_6_DISABLETHEREPORTGENERATIONOFEVENTDEFINITIONS: Int = 161 /* */

 
 

@inline @cCode.inline val ERR_ACN_ENCODE_TC_5_6_DISABLETHEREPORTGENERATIONOFEVENTDEFINITIONS: Int = 164 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_5_6_DISABLETHEREPORTGENERATIONOFEVENTDEFINITIONS_N_UNINITIALIZED: Int = 165 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_5_6_DISABLETHEREPORTGENERATIONOFEVENTDEFINITIONS_N: Int = 144 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_5_6_DISABLETHEREPORTGENERATIONOFEVENTDEFINITIONS_EVENTDEFINITION_ID: Int = 159 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_5_6_DISABLETHEREPORTGENERATIONOFEVENTDEFINITIONS_EVENTDEFINITION_ID_ELM_2: Int = 154 /*  */
@inline @cCode.inline val TTC_5_6_DisableTheReportGenerationOfEventDefinitions_REQUIRED_BYTES_FOR_ACN_ENCODING = 262144
@inline @cCode.inline val TTC_5_6_DisableTheReportGenerationOfEventDefinitions_REQUIRED_BITS_FOR_ACN_ENCODING = 2097152

@inline @cCode.inline val ERR_ACN_DECODE_TC_5_6_DISABLETHEREPORTGENERATIONOFEVENTDEFINITIONS: Int = 166 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_5_6_DISABLETHEREPORTGENERATIONOFEVENTDEFINITIONS_N: Int = 145 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_5_6_DISABLETHEREPORTGENERATIONOFEVENTDEFINITIONS_EVENTDEFINITION_ID: Int = 160 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_5_6_DISABLETHEREPORTGENERATIONOFEVENTDEFINITIONS_EVENTDEFINITION_ID_ELM_2: Int = 155 /*  */

// @inline @cCode.inline val maxTC_5_6_EventDefinition_ID_Count: Int = 65535 // defined in body

