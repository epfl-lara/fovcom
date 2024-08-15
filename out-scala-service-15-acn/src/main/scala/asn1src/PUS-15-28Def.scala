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

/*-- TTC_15_28_ChangeTheVirtualChannelUsedByAPacketStore --------------------------------------------*/

case class TTC_15_28_ChangeTheVirtualChannelUsedByAPacketStore (
    packetStore_ID: TPacketStore_ID, 
    packetStoreVirtualChannel: TPacketStoreVirtualChannel
) {
    require(33 == this.packetStore_ID.length && this.packetStore_ID.indexOfOrLength(UByte.fromRaw(0.toByte)) <= 32)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775582L))
        val size_0 = (224L)
        val size_1 = 1L
        size_0 + size_1
    }.ensuring { (res: Long) => 
        res == 225L
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775582L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775582L))
        val size_0_offset = (224L)
        val size_0_otherOffset = 224L
        val size_1_offset = 1L
        val size_1_otherOffset = 1L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775582L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775582L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = (224L)
        val size_0_otherOffset = 224L
        val size_1_offset = 1L
        val size_1_otherOffset = 1L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775582L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775582L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = (224L)
        val size_0_otherOffset = 224L
        val size_1_offset = 1L
        val size_1_otherOffset = 1L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775582L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775582L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = (224L)
        val size_0_otherOffset = 224L
        val size_1_offset = 1L
        val size_1_otherOffset = 1L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TC_15_28_CHANGETHEVIRTUALCHANNELUSEDBYAPACKETSTORE: Int = 1329 /* */
@inline @cCode.inline val ERR_TC_15_28_CHANGETHEVIRTUALCHANNELUSEDBYAPACKETSTORE_PACKETSTORE_ID_2: Int = 1314 /* */
@inline @cCode.inline val ERR_TC_15_28_CHANGETHEVIRTUALCHANNELUSEDBYAPACKETSTORE_PACKETSTOREVIRTUALCHANNEL_2: Int = 1324 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_TC_15_28_CHANGETHEVIRTUALCHANNELUSEDBYAPACKETSTORE: Int = 1332 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_15_28_CHANGETHEVIRTUALCHANNELUSEDBYAPACKETSTORE_PACKETSTORE_ID_2: Int = 1317 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_15_28_CHANGETHEVIRTUALCHANNELUSEDBYAPACKETSTORE_PACKETSTOREVIRTUALCHANNEL_2: Int = 1327 /*  */
@inline @cCode.inline val TTC_15_28_ChangeTheVirtualChannelUsedByAPacketStore_REQUIRED_BYTES_FOR_ACN_ENCODING = 29
@inline @cCode.inline val TTC_15_28_ChangeTheVirtualChannelUsedByAPacketStore_REQUIRED_BITS_FOR_ACN_ENCODING = 225

@inline @cCode.inline val ERR_ACN_DECODE_TC_15_28_CHANGETHEVIRTUALCHANNELUSEDBYAPACKETSTORE: Int = 1333 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_15_28_CHANGETHEVIRTUALCHANNELUSEDBYAPACKETSTORE_PACKETSTORE_ID_2: Int = 1318 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_15_28_CHANGETHEVIRTUALCHANNELUSEDBYAPACKETSTORE_PACKETSTOREVIRTUALCHANNEL_2: Int = 1328 /*  */

