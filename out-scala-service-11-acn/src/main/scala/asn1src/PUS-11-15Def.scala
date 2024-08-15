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

/*-- TTC_11_15_TimeshiftAllScheduledActivities --------------------------------------------*/

case class TTC_11_15_TimeshiftAllScheduledActivities (
    timeOffset: TCDS_RelativeTime_PFC_2
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775743L))
        val size_0 = this.timeOffset.size(offset)
        (size_0)
    }.ensuring { (res: Long) => 
        res == 64L
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775743L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775743L))
        val size_0_offset = this.timeOffset.size(offset)
        val size_0_otherOffset = this.timeOffset.size(otherOffset)
        this.timeOffset.sizeLemmaAnyOffset(offset, otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775743L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775743L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = this.timeOffset.size(offset)
        val size_0_otherOffset = this.timeOffset.size(otherOffset)
        this.timeOffset.sizeLemmaNextByte(offset, otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775743L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775743L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = this.timeOffset.size(offset)
        val size_0_otherOffset = this.timeOffset.size(otherOffset)
        this.timeOffset.sizeLemmaNextWord(offset, otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775743L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775743L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = this.timeOffset.size(offset)
        val size_0_otherOffset = this.timeOffset.size(otherOffset)
        this.timeOffset.sizeLemmaNextDWord(offset, otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TC_11_15_TIMESHIFTALLSCHEDULEDACTIVITIES: Int = 958 /* */
@inline @cCode.inline val ERR_TC_11_15_TIMESHIFTALLSCHEDULEDACTIVITIES_TIMEOFFSET_2_2: Int = 953 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_TC_11_15_TIMESHIFTALLSCHEDULEDACTIVITIES: Int = 961 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_11_15_TIMESHIFTALLSCHEDULEDACTIVITIES_TIMEOFFSET_2_2: Int = 956 /*  */
@inline @cCode.inline val TTC_11_15_TimeshiftAllScheduledActivities_REQUIRED_BYTES_FOR_ACN_ENCODING = 8
@inline @cCode.inline val TTC_11_15_TimeshiftAllScheduledActivities_REQUIRED_BITS_FOR_ACN_ENCODING = 64

@inline @cCode.inline val ERR_ACN_DECODE_TC_11_15_TIMESHIFTALLSCHEDULEDACTIVITIES: Int = 962 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_11_15_TIMESHIFTALLSCHEDULEDACTIVITIES_TIMEOFFSET_2_2: Int = 957 /*  */


