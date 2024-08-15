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

/*-- TTM_Payload --------------------------------------------*/
type TTM_Payload_tm_255_255 = ULong


enum TTM_Payload:
    case tm_255_255_PRESENT(tm_255_255: TTM_Payload_tm_255_255)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775792L))
        this match {
            case TTM_Payload.tm_255_255_PRESENT(tm_255_255) =>
                alignedSizeToByte(8L, offset)
        }
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 15L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775792L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775792L))
        require((offset % 8L) == (otherOffset % 8L))
        this match {
            case TTM_Payload.tm_255_255_PRESENT(tm_255_255) =>
                ()
        }
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775792L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775792L))
        require((offset % 16L) == (otherOffset % 16L))
        this match {
            case TTM_Payload.tm_255_255_PRESENT(tm_255_255) =>
                ()
        }
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775792L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775792L))
        require((offset % 32L) == (otherOffset % 32L))
        this match {
            case TTM_Payload.tm_255_255_PRESENT(tm_255_255) =>
                ()
        }
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

@inline @cCode.inline val ERR_TM_PAYLOAD_TM_255_255: Int = 3031 /*(0 .. 255) */

@inline @cCode.inline val ERR_TM_PAYLOAD: Int = 3036 /* */

 
 
type TTM_NoHeaderPayload = NullType


 

@inline @cCode.inline val TTM_NoHeaderPayload_REQUIRED_BYTES_FOR_ACN_ENCODING = 0
@inline @cCode.inline val TTM_NoHeaderPayload_REQUIRED_BITS_FOR_ACN_ENCODING = 0




