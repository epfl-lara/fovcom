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

/*-- TOBCPWithold --------------------------------------------*/

case class TOBCPWithold (
    obcp_ID: TOBCP_ID, 
    step_ID: TOBCPStep_ID
) {
    require(6 == this.obcp_ID.length && this.obcp_ID.indexOfOrLength(UByte.fromRaw(0.toByte)) <= 5)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775770L))
        val size_0 = (35L)
        val size_1 = 2L
        size_0 + size_1
    }.ensuring { (res: Long) => 
        res == 37L
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775770L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775770L))
        val size_0_offset = (35L)
        val size_0_otherOffset = 35L
        val size_1_offset = 2L
        val size_1_otherOffset = 2L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775770L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775770L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = (35L)
        val size_0_otherOffset = 35L
        val size_1_offset = 2L
        val size_1_otherOffset = 2L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775770L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775770L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = (35L)
        val size_0_otherOffset = 35L
        val size_1_offset = 2L
        val size_1_otherOffset = 2L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775770L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775770L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = (35L)
        val size_0_otherOffset = 35L
        val size_1_offset = 2L
        val size_1_otherOffset = 2L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_OBCPWITHOLD: Int = 82 /* */
@inline @cCode.inline val ERR_OBCPWITHOLD_OBCP_ID_2: Int = 67 /* */
@inline @cCode.inline val ERR_OBCPWITHOLD_STEP_ID_2: Int = 77 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_OBCPWITHOLD: Int = 85 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_OBCPWITHOLD_OBCP_ID_2: Int = 70 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_OBCPWITHOLD_STEP_ID_2: Int = 80 /*  */
@inline @cCode.inline val TOBCPWithold_REQUIRED_BYTES_FOR_ACN_ENCODING = 5
@inline @cCode.inline val TOBCPWithold_REQUIRED_BITS_FOR_ACN_ENCODING = 37

@inline @cCode.inline val ERR_ACN_DECODE_OBCPWITHOLD: Int = 86 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_OBCPWITHOLD_OBCP_ID_2: Int = 71 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_OBCPWITHOLD_STEP_ID_2: Int = 81 /*  */


