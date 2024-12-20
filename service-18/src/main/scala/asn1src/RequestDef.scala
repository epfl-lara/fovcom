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

/*-- TRequest_ID --------------------------------------------*/

case class TRequest_ID (
    source_ID: TApplicationProcessUser_ID, 
    applicationProcess_ID: TApplicationProcess_ID, 
    sequenceCount: TPUSC_UINT32
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775748L))
        val size_0 = 16L
        val size_1 = 11L
        val size_2 = 32L
        size_0 + size_1 + size_2
    }.ensuring { (res: Long) => 
        res == 59L
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775748L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775748L))
        val size_0_offset = 16L
        val size_0_otherOffset = 16L
        val size_1_offset = 11L
        val size_1_otherOffset = 11L
        val size_2_offset = 32L
        val size_2_otherOffset = 32L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775748L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775748L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 16L
        val size_0_otherOffset = 16L
        val size_1_offset = 11L
        val size_1_otherOffset = 11L
        val size_2_offset = 32L
        val size_2_otherOffset = 32L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775748L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775748L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 16L
        val size_0_otherOffset = 16L
        val size_1_offset = 11L
        val size_1_otherOffset = 11L
        val size_2_offset = 32L
        val size_2_otherOffset = 32L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775748L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775748L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 16L
        val size_0_otherOffset = 16L
        val size_1_offset = 11L
        val size_1_otherOffset = 11L
        val size_2_offset = 32L
        val size_2_otherOffset = 32L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_REQUEST_ID: Int = 1301 /* */
@inline @cCode.inline val ERR_REQUEST_ID_SOURCE_ID_2: Int = 1276 /* */
@inline @cCode.inline val ERR_REQUEST_ID_APPLICATIONPROCESS_ID_2: Int = 1286 /* */
@inline @cCode.inline val ERR_REQUEST_ID_SEQUENCECOUNT_2: Int = 1296 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_REQUEST_ID: Int = 1304 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_REQUEST_ID_SOURCE_ID_2: Int = 1279 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_REQUEST_ID_APPLICATIONPROCESS_ID_2: Int = 1289 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_REQUEST_ID_SEQUENCECOUNT_2: Int = 1299 /*  */
@inline @cCode.inline val TRequest_ID_REQUIRED_BYTES_FOR_ACN_ENCODING = 8
@inline @cCode.inline val TRequest_ID_REQUIRED_BITS_FOR_ACN_ENCODING = 59

@inline @cCode.inline val ERR_ACN_DECODE_REQUEST_ID: Int = 1305 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_REQUEST_ID_SOURCE_ID_2: Int = 1280 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_REQUEST_ID_APPLICATIONPROCESS_ID_2: Int = 1290 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_REQUEST_ID_SEQUENCECOUNT_2: Int = 1300 /*  */


