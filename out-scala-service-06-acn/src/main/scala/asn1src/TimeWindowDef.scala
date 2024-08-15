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

sealed trait TTimeWindowType:
    def i: Int
object TTimeWindowType:
    case object TselectAll extends TTimeWindowType:
        override def i: Int = 0
    case object TfromTimeTagToTimeTag extends TTimeWindowType:
        override def i: Int = 1
    case object TfromTimeTag extends TTimeWindowType:
        override def i: Int = 2
    case object TtoTimeTag extends TTimeWindowType:
        override def i: Int = 3

// please use the following macros to avoid breaking code.
// type TselectAll = TTimeWindowType.selectAll
// type TfromTimeTagToTimeTag = TTimeWindowType.fromTimeTagToTimeTag
// type TfromTimeTag = TTimeWindowType.fromTimeTag
// type TtoTimeTag = TTimeWindowType.toTimeTag

@inline @cCode.inline val ERR_TIMEWINDOWTYPE: Int = 3244 /*selectAll | fromTimeTagToTimeTag | fromTimeTag | toTimeTag */

 

@inline @cCode.inline val ERR_ACN_ENCODE_TIMEWINDOWTYPE: Int = 3247 /*  */
@inline @cCode.inline val TTimeWindowType_REQUIRED_BYTES_FOR_ACN_ENCODING = 1
@inline @cCode.inline val TTimeWindowType_REQUIRED_BITS_FOR_ACN_ENCODING = 2

@inline @cCode.inline val ERR_ACN_DECODE_TIMEWINDOWTYPE: Int = 3248 /*  */
/*-- TTimeTags --------------------------------------------*/
/*-- TTimeTags_fromTimeTagToTimeTag --------------------------------------------*/

case class TTimeTags_fromTimeTagToTimeTag (
    fromTimeTag: TCDS_AbsoluteTime_PFC_2, 
    toTimeTag: TCDS_AbsoluteTime_PFC_2
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775679L))
        val size_0 = this.fromTimeTag.size(offset)
        val size_1 = this.toTimeTag.size(offset + size_0)
        size_0 + size_1
    }.ensuring { (res: Long) => 
        res == 128L
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775679L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775679L))
        val size_0_offset = this.fromTimeTag.size(offset)
        val size_0_otherOffset = this.fromTimeTag.size(otherOffset)
        this.fromTimeTag.sizeLemmaAnyOffset(offset, otherOffset)
        val size_1_offset = this.toTimeTag.size(offset + size_0_offset)
        val size_1_otherOffset = this.toTimeTag.size(otherOffset + size_0_otherOffset)
        this.toTimeTag.sizeLemmaAnyOffset(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775679L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775679L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = this.fromTimeTag.size(offset)
        val size_0_otherOffset = this.fromTimeTag.size(otherOffset)
        this.fromTimeTag.sizeLemmaNextByte(offset, otherOffset)
        val size_1_offset = this.toTimeTag.size(offset + size_0_offset)
        val size_1_otherOffset = this.toTimeTag.size(otherOffset + size_0_otherOffset)
        this.toTimeTag.sizeLemmaNextByte(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775679L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775679L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = this.fromTimeTag.size(offset)
        val size_0_otherOffset = this.fromTimeTag.size(otherOffset)
        this.fromTimeTag.sizeLemmaNextWord(offset, otherOffset)
        val size_1_offset = this.toTimeTag.size(offset + size_0_offset)
        val size_1_otherOffset = this.toTimeTag.size(otherOffset + size_0_otherOffset)
        this.toTimeTag.sizeLemmaNextWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775679L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775679L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = this.fromTimeTag.size(offset)
        val size_0_otherOffset = this.fromTimeTag.size(otherOffset)
        this.fromTimeTag.sizeLemmaNextDWord(offset, otherOffset)
        val size_1_offset = this.toTimeTag.size(offset + size_0_offset)
        val size_1_otherOffset = this.toTimeTag.size(otherOffset + size_0_otherOffset)
        this.toTimeTag.sizeLemmaNextDWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


enum TTimeTags:
    case selectAll_PRESENT(selectAll: NullType)
    case fromTimeTagToTimeTag_PRESENT(fromTimeTagToTimeTag: TTimeTags_fromTimeTagToTimeTag)
    case fromTimeTag_PRESENT(fromTimeTag: TCDS_AbsoluteTime_PFC_2)
    case toTimeTag_PRESENT(toTimeTag: TCDS_AbsoluteTime_PFC_2)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775679L))
        this match {
            case TTimeTags.selectAll_PRESENT(selectAll) =>
                0L
            case TTimeTags.fromTimeTagToTimeTag_PRESENT(fromTimeTagToTimeTag) =>
                val size_1_0 = fromTimeTagToTimeTag.fromTimeTag.size(offset)
                val size_1_1 = fromTimeTagToTimeTag.toTimeTag.size(offset + size_1_0)
                size_1_0 + size_1_1
            case TTimeTags.fromTimeTag_PRESENT(fromTimeTag) =>
                fromTimeTag.size(offset)
            case TTimeTags.toTimeTag_PRESENT(toTimeTag) =>
                toTimeTag.size(offset)
        }
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 128L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775679L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775679L))
        this match {
            case TTimeTags.selectAll_PRESENT(selectAll) =>
                ()
            case TTimeTags.fromTimeTagToTimeTag_PRESENT(fromTimeTagToTimeTag) =>
                fromTimeTagToTimeTag.sizeLemmaAnyOffset(offset, otherOffset)
            case TTimeTags.fromTimeTag_PRESENT(fromTimeTag) =>
                fromTimeTag.sizeLemmaAnyOffset(offset, otherOffset)
            case TTimeTags.toTimeTag_PRESENT(toTimeTag) =>
                toTimeTag.sizeLemmaAnyOffset(offset, otherOffset)
        }
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775679L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775679L))
        require((offset % 8L) == (otherOffset % 8L))
        this match {
            case TTimeTags.selectAll_PRESENT(selectAll) =>
                ()
            case TTimeTags.fromTimeTagToTimeTag_PRESENT(fromTimeTagToTimeTag) =>
                fromTimeTagToTimeTag.sizeLemmaNextByte(offset, otherOffset)
            case TTimeTags.fromTimeTag_PRESENT(fromTimeTag) =>
                fromTimeTag.sizeLemmaNextByte(offset, otherOffset)
            case TTimeTags.toTimeTag_PRESENT(toTimeTag) =>
                toTimeTag.sizeLemmaNextByte(offset, otherOffset)
        }
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775679L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775679L))
        require((offset % 16L) == (otherOffset % 16L))
        this match {
            case TTimeTags.selectAll_PRESENT(selectAll) =>
                ()
            case TTimeTags.fromTimeTagToTimeTag_PRESENT(fromTimeTagToTimeTag) =>
                fromTimeTagToTimeTag.sizeLemmaNextWord(offset, otherOffset)
            case TTimeTags.fromTimeTag_PRESENT(fromTimeTag) =>
                fromTimeTag.sizeLemmaNextWord(offset, otherOffset)
            case TTimeTags.toTimeTag_PRESENT(toTimeTag) =>
                toTimeTag.sizeLemmaNextWord(offset, otherOffset)
        }
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775679L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775679L))
        require((offset % 32L) == (otherOffset % 32L))
        this match {
            case TTimeTags.selectAll_PRESENT(selectAll) =>
                ()
            case TTimeTags.fromTimeTagToTimeTag_PRESENT(fromTimeTagToTimeTag) =>
                fromTimeTagToTimeTag.sizeLemmaNextDWord(offset, otherOffset)
            case TTimeTags.fromTimeTag_PRESENT(fromTimeTag) =>
                fromTimeTag.sizeLemmaNextDWord(offset, otherOffset)
            case TTimeTags.toTimeTag_PRESENT(toTimeTag) =>
                toTimeTag.sizeLemmaNextDWord(offset, otherOffset)
        }
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

@inline @cCode.inline val ERR_TIMETAGS_FROMTIMETAGTOTIMETAG: Int = 3174 /* */
@inline @cCode.inline val ERR_TIMETAGS_FROMTIMETAGTOTIMETAG_FROMTIMETAG_2_2: Int = 3139 /* */
@inline @cCode.inline val ERR_TIMETAGS_FROMTIMETAGTOTIMETAG_TOTIMETAG_2_2: Int = 3169 /* */

@inline @cCode.inline val ERR_TIMETAGS: Int = 3239 /* */
@inline @cCode.inline val ERR_TIMETAGS_FROMTIMETAG_2_2: Int = 3204 /* */
@inline @cCode.inline val ERR_TIMETAGS_TOTIMETAG_2_2: Int = 3234 /* */

 
 
/*-- TTimeWindow --------------------------------------------*/

case class TTimeWindow (
    timeTags: TTimeTags
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775677L))
        val size_0 = 2L
        val size_1 = this.timeTags match {
            case TTimeTags.selectAll_PRESENT(selectAll) =>
                0L
            case TTimeTags.fromTimeTagToTimeTag_PRESENT(fromTimeTagToTimeTag) =>
                val size_2_1 = fromTimeTagToTimeTag.fromTimeTag.size(offset + size_0)
                val size_2_2 = fromTimeTagToTimeTag.toTimeTag.size(offset + size_0 + size_2_1)
                size_2_1 + size_2_2
            case TTimeTags.fromTimeTag_PRESENT(fromTimeTag) =>
                fromTimeTag.size(offset + size_0)
            case TTimeTags.toTimeTag_PRESENT(toTimeTag) =>
                toTimeTag.size(offset + size_0)
        }
        size_0 + size_1
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 130L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775677L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775677L))
        val size_0_offset = 2L
        val size_0_otherOffset = 2L
        val size_1_offset = this.timeTags match {
            case TTimeTags.selectAll_PRESENT(selectAll) =>
                0L
            case TTimeTags.fromTimeTagToTimeTag_PRESENT(fromTimeTagToTimeTag) =>
                val size_2_1 = fromTimeTagToTimeTag.fromTimeTag.size(offset + size_0_offset)
                val size_2_2 = fromTimeTagToTimeTag.toTimeTag.size(offset + size_0_offset + size_2_1)
                size_2_1 + size_2_2
            case TTimeTags.fromTimeTag_PRESENT(fromTimeTag) =>
                fromTimeTag.size(offset + size_0_offset)
            case TTimeTags.toTimeTag_PRESENT(toTimeTag) =>
                toTimeTag.size(offset + size_0_offset)
        }
        val size_1_otherOffset = this.timeTags match {
            case TTimeTags.selectAll_PRESENT(selectAll) =>
                0L
            case TTimeTags.fromTimeTagToTimeTag_PRESENT(fromTimeTagToTimeTag) =>
                val size_2_1 = fromTimeTagToTimeTag.fromTimeTag.size(otherOffset + size_0_otherOffset)
                val size_2_2 = fromTimeTagToTimeTag.toTimeTag.size(otherOffset + size_0_otherOffset + size_2_1)
                size_2_1 + size_2_2
            case TTimeTags.fromTimeTag_PRESENT(fromTimeTag) =>
                fromTimeTag.size(otherOffset + size_0_otherOffset)
            case TTimeTags.toTimeTag_PRESENT(toTimeTag) =>
                toTimeTag.size(otherOffset + size_0_otherOffset)
        }
        this.timeTags.sizeLemmaAnyOffset(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775677L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775677L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 2L
        val size_0_otherOffset = 2L
        val size_1_offset = this.timeTags match {
            case TTimeTags.selectAll_PRESENT(selectAll) =>
                0L
            case TTimeTags.fromTimeTagToTimeTag_PRESENT(fromTimeTagToTimeTag) =>
                val size_2_1 = fromTimeTagToTimeTag.fromTimeTag.size(offset + size_0_offset)
                val size_2_2 = fromTimeTagToTimeTag.toTimeTag.size(offset + size_0_offset + size_2_1)
                size_2_1 + size_2_2
            case TTimeTags.fromTimeTag_PRESENT(fromTimeTag) =>
                fromTimeTag.size(offset + size_0_offset)
            case TTimeTags.toTimeTag_PRESENT(toTimeTag) =>
                toTimeTag.size(offset + size_0_offset)
        }
        val size_1_otherOffset = this.timeTags match {
            case TTimeTags.selectAll_PRESENT(selectAll) =>
                0L
            case TTimeTags.fromTimeTagToTimeTag_PRESENT(fromTimeTagToTimeTag) =>
                val size_2_1 = fromTimeTagToTimeTag.fromTimeTag.size(otherOffset + size_0_otherOffset)
                val size_2_2 = fromTimeTagToTimeTag.toTimeTag.size(otherOffset + size_0_otherOffset + size_2_1)
                size_2_1 + size_2_2
            case TTimeTags.fromTimeTag_PRESENT(fromTimeTag) =>
                fromTimeTag.size(otherOffset + size_0_otherOffset)
            case TTimeTags.toTimeTag_PRESENT(toTimeTag) =>
                toTimeTag.size(otherOffset + size_0_otherOffset)
        }
        this.timeTags.sizeLemmaNextByte(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775677L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775677L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 2L
        val size_0_otherOffset = 2L
        val size_1_offset = this.timeTags match {
            case TTimeTags.selectAll_PRESENT(selectAll) =>
                0L
            case TTimeTags.fromTimeTagToTimeTag_PRESENT(fromTimeTagToTimeTag) =>
                val size_2_1 = fromTimeTagToTimeTag.fromTimeTag.size(offset + size_0_offset)
                val size_2_2 = fromTimeTagToTimeTag.toTimeTag.size(offset + size_0_offset + size_2_1)
                size_2_1 + size_2_2
            case TTimeTags.fromTimeTag_PRESENT(fromTimeTag) =>
                fromTimeTag.size(offset + size_0_offset)
            case TTimeTags.toTimeTag_PRESENT(toTimeTag) =>
                toTimeTag.size(offset + size_0_offset)
        }
        val size_1_otherOffset = this.timeTags match {
            case TTimeTags.selectAll_PRESENT(selectAll) =>
                0L
            case TTimeTags.fromTimeTagToTimeTag_PRESENT(fromTimeTagToTimeTag) =>
                val size_2_1 = fromTimeTagToTimeTag.fromTimeTag.size(otherOffset + size_0_otherOffset)
                val size_2_2 = fromTimeTagToTimeTag.toTimeTag.size(otherOffset + size_0_otherOffset + size_2_1)
                size_2_1 + size_2_2
            case TTimeTags.fromTimeTag_PRESENT(fromTimeTag) =>
                fromTimeTag.size(otherOffset + size_0_otherOffset)
            case TTimeTags.toTimeTag_PRESENT(toTimeTag) =>
                toTimeTag.size(otherOffset + size_0_otherOffset)
        }
        this.timeTags.sizeLemmaNextWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775677L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775677L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 2L
        val size_0_otherOffset = 2L
        val size_1_offset = this.timeTags match {
            case TTimeTags.selectAll_PRESENT(selectAll) =>
                0L
            case TTimeTags.fromTimeTagToTimeTag_PRESENT(fromTimeTagToTimeTag) =>
                val size_2_1 = fromTimeTagToTimeTag.fromTimeTag.size(offset + size_0_offset)
                val size_2_2 = fromTimeTagToTimeTag.toTimeTag.size(offset + size_0_offset + size_2_1)
                size_2_1 + size_2_2
            case TTimeTags.fromTimeTag_PRESENT(fromTimeTag) =>
                fromTimeTag.size(offset + size_0_offset)
            case TTimeTags.toTimeTag_PRESENT(toTimeTag) =>
                toTimeTag.size(offset + size_0_offset)
        }
        val size_1_otherOffset = this.timeTags match {
            case TTimeTags.selectAll_PRESENT(selectAll) =>
                0L
            case TTimeTags.fromTimeTagToTimeTag_PRESENT(fromTimeTagToTimeTag) =>
                val size_2_1 = fromTimeTagToTimeTag.fromTimeTag.size(otherOffset + size_0_otherOffset)
                val size_2_2 = fromTimeTagToTimeTag.toTimeTag.size(otherOffset + size_0_otherOffset + size_2_1)
                size_2_1 + size_2_2
            case TTimeTags.fromTimeTag_PRESENT(fromTimeTag) =>
                fromTimeTag.size(otherOffset + size_0_otherOffset)
            case TTimeTags.toTimeTag_PRESENT(toTimeTag) =>
                toTimeTag.size(otherOffset + size_0_otherOffset)
        }
        this.timeTags.sizeLemmaNextDWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TIMEWINDOW: Int = 3104 /* */
@inline @cCode.inline val ERR_TIMEWINDOW_TIMETAGS_2: Int = 3101 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_TIMEWINDOW: Int = 3107 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TIMEWINDOW_TYPE_UNINITIALIZED: Int = 3108 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TIMEWINDOW_TYPE: Int = 2965 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TIMEWINDOW_TIMETAGS: Int = 3099 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TIMEWINDOW_TIMETAGS_FROMTIMETAGTOTIMETAG: Int = 3034 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TIMEWINDOW_TIMETAGS_FROMTIMETAGTOTIMETAG_FROMTIMETAG_2_2: Int = 2999 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TIMEWINDOW_TIMETAGS_FROMTIMETAGTOTIMETAG_TOTIMETAG_2_2: Int = 3029 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TIMEWINDOW_TIMETAGS_FROMTIMETAG_2_2: Int = 3064 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TIMEWINDOW_TIMETAGS_TOTIMETAG_2_2: Int = 3094 /*  */
@inline @cCode.inline val TTimeWindow_REQUIRED_BYTES_FOR_ACN_ENCODING = 17
@inline @cCode.inline val TTimeWindow_REQUIRED_BITS_FOR_ACN_ENCODING = 130

@inline @cCode.inline val ERR_ACN_DECODE_TIMEWINDOW: Int = 3109 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TIMEWINDOW_TYPE: Int = 2966 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TIMEWINDOW_TIMETAGS: Int = 3100 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TIMEWINDOW_TIMETAGS_FROMTIMETAGTOTIMETAG: Int = 3035 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TIMEWINDOW_TIMETAGS_FROMTIMETAGTOTIMETAG_FROMTIMETAG_2_2: Int = 3000 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TIMEWINDOW_TIMETAGS_FROMTIMETAGTOTIMETAG_TOTIMETAG_2_2: Int = 3030 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TIMEWINDOW_TIMETAGS_FROMTIMETAG_2_2: Int = 3065 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TIMEWINDOW_TIMETAGS_TOTIMETAG_2_2: Int = 3095 /*  */


