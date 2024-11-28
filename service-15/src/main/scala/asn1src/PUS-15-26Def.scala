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

/*-- TTC_15_26_ChangeAPacketStoreTypeToCircural --------------------------------------------*/

case class TTC_15_26_ChangeAPacketStoreTypeToCircural (
    packetStore_ID: TPacketStore_ID
) {
    require(33 == this.packetStore_ID.length && this.packetStore_ID.indexOfOrLength(UByte.fromRaw(0.toByte)) <= 32)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775583L))
        val size_0 = (224L)
        (size_0)
    }.ensuring { (res: Long) => 
        res == 224L
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775583L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775583L))
        val size_0_offset = (224L)
        val size_0_otherOffset = 224L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775583L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775583L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = (224L)
        val size_0_otherOffset = 224L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775583L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775583L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = (224L)
        val size_0_otherOffset = 224L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775583L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775583L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = (224L)
        val size_0_otherOffset = 224L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TC_15_26_CHANGEAPACKETSTORETYPETOCIRCURAL: Int = 1289 /* */
@inline @cCode.inline val ERR_TC_15_26_CHANGEAPACKETSTORETYPETOCIRCURAL_PACKETSTORE_ID_2: Int = 1284 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_TC_15_26_CHANGEAPACKETSTORETYPETOCIRCURAL: Int = 1292 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_15_26_CHANGEAPACKETSTORETYPETOCIRCURAL_PACKETSTORE_ID_2: Int = 1287 /*  */
@inline @cCode.inline val TTC_15_26_ChangeAPacketStoreTypeToCircural_REQUIRED_BYTES_FOR_ACN_ENCODING = 28
@inline @cCode.inline val TTC_15_26_ChangeAPacketStoreTypeToCircural_REQUIRED_BITS_FOR_ACN_ENCODING = 224

@inline @cCode.inline val ERR_ACN_DECODE_TC_15_26_CHANGEAPACKETSTORETYPETOCIRCURAL: Int = 1293 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_15_26_CHANGEAPACKETSTORETYPETOCIRCURAL_PACKETSTORE_ID_2: Int = 1288 /*  */

