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

/*-- TTC_12_3_ChangeTheMaximumTransitionReportingDelay --------------------------------------------*/

case class TTC_12_3_ChangeTheMaximumTransitionReportingDelay (
    maxReportingDelay: TPUSC_UINT32
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775775L))
        val size_0 = 32L
        (size_0)
    }.ensuring { (res: Long) => 
        res == 32L
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775775L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775775L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775775L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775775L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775775L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775775L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775775L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775775L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TC_12_3_CHANGETHEMAXIMUMTRANSITIONREPORTINGDELAY: Int = 2226 /* */
@inline @cCode.inline val ERR_TC_12_3_CHANGETHEMAXIMUMTRANSITIONREPORTINGDELAY_MAXREPORTINGDELAY_2: Int = 2221 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_TC_12_3_CHANGETHEMAXIMUMTRANSITIONREPORTINGDELAY: Int = 2229 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_12_3_CHANGETHEMAXIMUMTRANSITIONREPORTINGDELAY_MAXREPORTINGDELAY_2: Int = 2224 /*  */
@inline @cCode.inline val TTC_12_3_ChangeTheMaximumTransitionReportingDelay_REQUIRED_BYTES_FOR_ACN_ENCODING = 4
@inline @cCode.inline val TTC_12_3_ChangeTheMaximumTransitionReportingDelay_REQUIRED_BITS_FOR_ACN_ENCODING = 32

@inline @cCode.inline val ERR_ACN_DECODE_TC_12_3_CHANGETHEMAXIMUMTRANSITIONREPORTINGDELAY: Int = 2230 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_12_3_CHANGETHEMAXIMUMTRANSITIONREPORTINGDELAY_MAXREPORTINGDELAY_2: Int = 2225 /*  */

