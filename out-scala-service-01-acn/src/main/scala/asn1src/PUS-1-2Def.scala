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

/*-- TTM_1_2_FailedAcceptanceVerificationReport --------------------------------------------*/
case class TTM_1_2_FailedAcceptanceVerificationReport_request_ID(arr: Vector[UByte])
{
    require(this.arr.length == 4)
}

case class TTM_1_2_FailedAcceptanceVerificationReport (
    request_ID: TTM_1_2_FailedAcceptanceVerificationReport_request_ID, 
    failureNotice: TAcceptanceFailureNotice
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775774L))
        val size_0 = (32L)
        val size_1 = this.failureNotice.size(offset + size_0)
        size_0 + size_1
    }.ensuring { (res: Long) => 
        res == 33L
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775774L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775774L))
        val size_0_offset = (32L)
        val size_0_otherOffset = 32L
        val size_1_offset = this.failureNotice.size(offset + size_0_offset)
        val size_1_otherOffset = this.failureNotice.size(otherOffset + size_0_otherOffset)
        this.failureNotice.sizeLemmaAnyOffset(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775774L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775774L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = (32L)
        val size_0_otherOffset = 32L
        val size_1_offset = this.failureNotice.size(offset + size_0_offset)
        val size_1_otherOffset = this.failureNotice.size(otherOffset + size_0_otherOffset)
        this.failureNotice.sizeLemmaNextByte(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775774L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775774L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = (32L)
        val size_0_otherOffset = 32L
        val size_1_offset = this.failureNotice.size(offset + size_0_offset)
        val size_1_otherOffset = this.failureNotice.size(otherOffset + size_0_otherOffset)
        this.failureNotice.sizeLemmaNextWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775774L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775774L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = (32L)
        val size_0_otherOffset = 32L
        val size_1_offset = this.failureNotice.size(offset + size_0_offset)
        val size_1_otherOffset = this.failureNotice.size(otherOffset + size_0_otherOffset)
        this.failureNotice.sizeLemmaNextDWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TM_1_2_FAILEDACCEPTANCEVERIFICATIONREPORT_REQUEST_ID: Int = 360 /*(SIZE(4)) */

@inline @cCode.inline val ERR_TM_1_2_FAILEDACCEPTANCEVERIFICATIONREPORT: Int = 390 /* */
@inline @cCode.inline val ERR_TM_1_2_FAILEDACCEPTANCEVERIFICATIONREPORT_FAILURENOTICE_2: Int = 385 /* */

 
 

@inline @cCode.inline val ERR_ACN_ENCODE_TM_1_2_FAILEDACCEPTANCEVERIFICATIONREPORT: Int = 393 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_1_2_FAILEDACCEPTANCEVERIFICATIONREPORT_REQUEST_ID: Int = 363 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_1_2_FAILEDACCEPTANCEVERIFICATIONREPORT_FAILURENOTICE_2: Int = 388 /*  */
@inline @cCode.inline val TTM_1_2_FailedAcceptanceVerificationReport_REQUIRED_BYTES_FOR_ACN_ENCODING = 5
@inline @cCode.inline val TTM_1_2_FailedAcceptanceVerificationReport_REQUIRED_BITS_FOR_ACN_ENCODING = 33

@inline @cCode.inline val ERR_ACN_DECODE_TM_1_2_FAILEDACCEPTANCEVERIFICATIONREPORT: Int = 394 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_1_2_FAILEDACCEPTANCEVERIFICATIONREPORT_REQUEST_ID: Int = 364 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_1_2_FAILEDACCEPTANCEVERIFICATIONREPORT_FAILURENOTICE_2: Int = 389 /*  */


