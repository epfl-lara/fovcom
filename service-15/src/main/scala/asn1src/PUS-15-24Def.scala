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

/*-- TTC_15_24_CopyThePacketsContainedInAPacketStoreSelectedByTimeWindow --------------------------------------------*/

case class TTC_15_24_CopyThePacketsContainedInAPacketStoreSelectedByTimeWindow (
    timeWindow: TTimeWindow, 
    fromPacketStore_ID: TPacketStore_ID, 
    toPacketStore_ID: TPacketStore_ID
) {
    require((33 == this.fromPacketStore_ID.length && this.fromPacketStore_ID.indexOfOrLength(UByte.fromRaw(0.toByte)) <= 32) && (33 == this.toPacketStore_ID.length && this.toPacketStore_ID.indexOfOrLength(UByte.fromRaw(0.toByte)) <= 32))

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775229L))
        val size_0 = this.timeWindow.size(offset)
        val size_1 = 224L
        val size_2 = 224L
        size_0 + size_1 + size_2
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 578L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775229L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775229L))
        val size_0_offset = this.timeWindow.size(offset)
        val size_0_otherOffset = this.timeWindow.size(otherOffset)
        this.timeWindow.sizeLemmaAnyOffset(offset, otherOffset)
        val size_1_offset = 224L
        val size_1_otherOffset = 224L
        val size_2_offset = 224L
        val size_2_otherOffset = 224L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775229L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775229L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = this.timeWindow.size(offset)
        val size_0_otherOffset = this.timeWindow.size(otherOffset)
        this.timeWindow.sizeLemmaNextByte(offset, otherOffset)
        val size_1_offset = 224L
        val size_1_otherOffset = 224L
        val size_2_offset = 224L
        val size_2_otherOffset = 224L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775229L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775229L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = this.timeWindow.size(offset)
        val size_0_otherOffset = this.timeWindow.size(otherOffset)
        this.timeWindow.sizeLemmaNextWord(offset, otherOffset)
        val size_1_offset = 224L
        val size_1_otherOffset = 224L
        val size_2_offset = 224L
        val size_2_otherOffset = 224L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775229L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775229L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = this.timeWindow.size(offset)
        val size_0_otherOffset = this.timeWindow.size(otherOffset)
        this.timeWindow.sizeLemmaNextDWord(offset, otherOffset)
        val size_1_offset = 224L
        val size_1_otherOffset = 224L
        val size_2_offset = 224L
        val size_2_otherOffset = 224L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TC_15_24_COPYTHEPACKETSCONTAINEDINAPACKETSTORESELECTEDBYTIMEWINDOW: Int = 1206 /* */
@inline @cCode.inline val ERR_TC_15_24_COPYTHEPACKETSCONTAINEDINAPACKETSTORESELECTEDBYTIMEWINDOW_TIMEWINDOW_2: Int = 1181 /* */
@inline @cCode.inline val ERR_TC_15_24_COPYTHEPACKETSCONTAINEDINAPACKETSTORESELECTEDBYTIMEWINDOW_FROMPACKETSTORE_ID_2: Int = 1191 /* */
@inline @cCode.inline val ERR_TC_15_24_COPYTHEPACKETSCONTAINEDINAPACKETSTORESELECTEDBYTIMEWINDOW_TOPACKETSTORE_ID_2: Int = 1201 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_TC_15_24_COPYTHEPACKETSCONTAINEDINAPACKETSTORESELECTEDBYTIMEWINDOW: Int = 1209 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_15_24_COPYTHEPACKETSCONTAINEDINAPACKETSTORESELECTEDBYTIMEWINDOW_TIMEWINDOW_2: Int = 1184 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_15_24_COPYTHEPACKETSCONTAINEDINAPACKETSTORESELECTEDBYTIMEWINDOW_FROMPACKETSTORE_ID_2: Int = 1194 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_15_24_COPYTHEPACKETSCONTAINEDINAPACKETSTORESELECTEDBYTIMEWINDOW_TOPACKETSTORE_ID_2: Int = 1204 /*  */
@inline @cCode.inline val TTC_15_24_CopyThePacketsContainedInAPacketStoreSelectedByTimeWindow_REQUIRED_BYTES_FOR_ACN_ENCODING = 73
@inline @cCode.inline val TTC_15_24_CopyThePacketsContainedInAPacketStoreSelectedByTimeWindow_REQUIRED_BITS_FOR_ACN_ENCODING = 578

@inline @cCode.inline val ERR_ACN_DECODE_TC_15_24_COPYTHEPACKETSCONTAINEDINAPACKETSTORESELECTEDBYTIMEWINDOW: Int = 1210 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_15_24_COPYTHEPACKETSCONTAINEDINAPACKETSTORESELECTEDBYTIMEWINDOW_TIMEWINDOW_2: Int = 1185 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_15_24_COPYTHEPACKETSCONTAINEDINAPACKETSTORESELECTEDBYTIMEWINDOW_FROMPACKETSTORE_ID_2: Int = 1195 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_15_24_COPYTHEPACKETSCONTAINEDINAPACKETSTORESELECTEDBYTIMEWINDOW_TOPACKETSTORE_ID_2: Int = 1205 /*  */


