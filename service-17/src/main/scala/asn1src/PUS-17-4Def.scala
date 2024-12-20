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

/*-- TTM_17_4_OnBoardConnectionTestReport --------------------------------------------*/

case class TTM_17_4_OnBoardConnectionTestReport (
    applicationProcessId: TApplicationProcess_ID
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775796L))
        val size_0 = 11L
        (size_0)
    }.ensuring { (res: Long) => 
        res == 11L
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775796L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775796L))
        val size_0_offset = 11L
        val size_0_otherOffset = 11L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775796L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775796L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 11L
        val size_0_otherOffset = 11L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775796L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775796L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 11L
        val size_0_otherOffset = 11L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775796L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775796L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 11L
        val size_0_otherOffset = 11L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TM_17_4_ONBOARDCONNECTIONTESTREPORT: Int = 34 /* */
@inline @cCode.inline val ERR_TM_17_4_ONBOARDCONNECTIONTESTREPORT_APPLICATIONPROCESSID_2: Int = 29 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_TM_17_4_ONBOARDCONNECTIONTESTREPORT: Int = 37 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_17_4_ONBOARDCONNECTIONTESTREPORT_APPLICATIONPROCESSID_2: Int = 32 /*  */
@inline @cCode.inline val TTM_17_4_OnBoardConnectionTestReport_REQUIRED_BYTES_FOR_ACN_ENCODING = 2
@inline @cCode.inline val TTM_17_4_OnBoardConnectionTestReport_REQUIRED_BITS_FOR_ACN_ENCODING = 11

@inline @cCode.inline val ERR_ACN_DECODE_TM_17_4_ONBOARDCONNECTIONTESTREPORT: Int = 38 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_17_4_ONBOARDCONNECTIONTESTREPORT_APPLICATIONPROCESSID_2: Int = 33 /*  */


