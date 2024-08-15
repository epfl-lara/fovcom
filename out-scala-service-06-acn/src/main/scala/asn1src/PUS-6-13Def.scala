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

/*-- TTC_6_13_EnableTheScrubbingOfAMemory --------------------------------------------*/

case class TTC_6_13_EnableTheScrubbingOfAMemory (
    memory_ID: OptionMut[TMemory_ID]
) {
    require(this.memory_ID.isDefined)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775775L))
        val size_0 = (this.memory_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        })
        (size_0)
    }.ensuring { (res: Long) => 
        res == 32L
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775775L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775775L))
        val size_0_offset = (this.memory_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        })
        val size_0_otherOffset = this.memory_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775775L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775775L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = (this.memory_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        })
        val size_0_otherOffset = this.memory_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775775L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775775L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = (this.memory_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        })
        val size_0_otherOffset = this.memory_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775775L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775775L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = (this.memory_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        })
        val size_0_otherOffset = this.memory_ID match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TC_6_13_ENABLETHESCRUBBINGOFAMEMORY: Int = 254 /*(WITH COMPONENTS {memory-ID PRESENT}) */
@inline @cCode.inline val ERR_TC_6_13_ENABLETHESCRUBBINGOFAMEMORY_MEMORY_ID_2: Int = 249 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_13_ENABLETHESCRUBBINGOFAMEMORY: Int = 257 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_6_13_ENABLETHESCRUBBINGOFAMEMORY_MEMORY_ID_2: Int = 252 /*  */
@inline @cCode.inline val TTC_6_13_EnableTheScrubbingOfAMemory_REQUIRED_BYTES_FOR_ACN_ENCODING = 4
@inline @cCode.inline val TTC_6_13_EnableTheScrubbingOfAMemory_REQUIRED_BITS_FOR_ACN_ENCODING = 32

@inline @cCode.inline val ERR_ACN_DECODE_TC_6_13_ENABLETHESCRUBBINGOFAMEMORY: Int = 258 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_6_13_ENABLETHESCRUBBINGOFAMEMORY_MEMORY_ID_2: Int = 253 /*  */


