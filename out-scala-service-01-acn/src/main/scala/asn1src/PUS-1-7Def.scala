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

/*-- TTM_1_7_SuccessfulCompletionOfExecutionVerificationReport --------------------------------------------*/

case class TTM_1_7_SuccessfulCompletionOfExecutionVerificationReport (
    request_ID: TVerificationRequest_ID
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775775L))
        val size_0 = this.request_ID.size(offset)
        (size_0)
    }.ensuring { (res: Long) => 
        res == 32L
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775775L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775775L))
        val size_0_offset = this.request_ID.size(offset)
        val size_0_otherOffset = this.request_ID.size(otherOffset)
        this.request_ID.sizeLemmaAnyOffset(offset, otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775775L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775775L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = this.request_ID.size(offset)
        val size_0_otherOffset = this.request_ID.size(otherOffset)
        this.request_ID.sizeLemmaNextByte(offset, otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775775L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775775L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = this.request_ID.size(offset)
        val size_0_otherOffset = this.request_ID.size(otherOffset)
        this.request_ID.sizeLemmaNextWord(offset, otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775775L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775775L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = this.request_ID.size(offset)
        val size_0_otherOffset = this.request_ID.size(otherOffset)
        this.request_ID.sizeLemmaNextDWord(offset, otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TM_1_7_SUCCESSFULCOMPLETIONOFEXECUTIONVERIFICATIONREPORT: Int = 845 /* */
@inline @cCode.inline val ERR_TM_1_7_SUCCESSFULCOMPLETIONOFEXECUTIONVERIFICATIONREPORT_REQUEST_ID_2: Int = 840 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_TM_1_7_SUCCESSFULCOMPLETIONOFEXECUTIONVERIFICATIONREPORT: Int = 848 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_1_7_SUCCESSFULCOMPLETIONOFEXECUTIONVERIFICATIONREPORT_REQUEST_ID_2: Int = 843 /*  */
@inline @cCode.inline val TTM_1_7_SuccessfulCompletionOfExecutionVerificationReport_REQUIRED_BYTES_FOR_ACN_ENCODING = 4
@inline @cCode.inline val TTM_1_7_SuccessfulCompletionOfExecutionVerificationReport_REQUIRED_BITS_FOR_ACN_ENCODING = 32

@inline @cCode.inline val ERR_ACN_DECODE_TM_1_7_SUCCESSFULCOMPLETIONOFEXECUTIONVERIFICATIONREPORT: Int = 849 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_1_7_SUCCESSFULCOMPLETIONOFEXECUTIONVERIFICATIONREPORT_REQUEST_ID_2: Int = 844 /*  */


