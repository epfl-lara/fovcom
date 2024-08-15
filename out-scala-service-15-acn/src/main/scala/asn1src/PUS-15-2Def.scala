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

/*-- TTC_15_2_DisableTheStorageFunctionOfPacketStores --------------------------------------------*/

case class TTC_15_2_DisableTheStorageFunctionOfPacketStores (
    packetStoreSequence: TPacketStoreSequence
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854768607L))
        val size_0 = this.packetStoreSequence.size(offset)
        (size_0)
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 7200L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854768607L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854768607L))
        val size_0_offset = this.packetStoreSequence.size(offset)
        val size_0_otherOffset = this.packetStoreSequence.size(otherOffset)
        this.packetStoreSequence.sizeLemmaAnyOffset(offset, otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854768607L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854768607L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = this.packetStoreSequence.size(offset)
        val size_0_otherOffset = this.packetStoreSequence.size(otherOffset)
        this.packetStoreSequence.sizeLemmaNextByte(offset, otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854768607L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854768607L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = this.packetStoreSequence.size(offset)
        val size_0_otherOffset = this.packetStoreSequence.size(otherOffset)
        this.packetStoreSequence.sizeLemmaNextWord(offset, otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854768607L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854768607L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = this.packetStoreSequence.size(offset)
        val size_0_otherOffset = this.packetStoreSequence.size(otherOffset)
        this.packetStoreSequence.sizeLemmaNextDWord(offset, otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TC_15_2_DISABLETHESTORAGEFUNCTIONOFPACKETSTORES: Int = 1450 /* */
@inline @cCode.inline val ERR_TC_15_2_DISABLETHESTORAGEFUNCTIONOFPACKETSTORES_PACKETSTORESEQUENCE_2: Int = 1445 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_TC_15_2_DISABLETHESTORAGEFUNCTIONOFPACKETSTORES: Int = 1453 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_15_2_DISABLETHESTORAGEFUNCTIONOFPACKETSTORES_PACKETSTORESEQUENCE_2: Int = 1448 /*  */
@inline @cCode.inline val TTC_15_2_DisableTheStorageFunctionOfPacketStores_REQUIRED_BYTES_FOR_ACN_ENCODING = 900
@inline @cCode.inline val TTC_15_2_DisableTheStorageFunctionOfPacketStores_REQUIRED_BITS_FOR_ACN_ENCODING = 7200

@inline @cCode.inline val ERR_ACN_DECODE_TC_15_2_DISABLETHESTORAGEFUNCTIONOFPACKETSTORES: Int = 1454 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_15_2_DISABLETHESTORAGEFUNCTIONOFPACKETSTORES_PACKETSTORESEQUENCE_2: Int = 1449 /*  */


