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

/*-- TDataAcquireRequest --------------------------------------------*/

case class TDataAcquireRequest (
    transaction_ID: TPUSC_UINT32, 
    logicalDevice_ID: TLogicalDevice_ID, 
    parameter_ID: TParameter_ID
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775711L))
        val size_0 = 32L
        val size_1 = 32L
        val size_2 = 32L
        size_0 + size_1 + size_2
    }.ensuring { (res: Long) => 
        res == 96L
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775711L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775711L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = 32L
        val size_2_otherOffset = 32L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775711L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775711L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = 32L
        val size_2_otherOffset = 32L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775711L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775711L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = 32L
        val size_2_otherOffset = 32L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775711L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775711L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = 32L
        val size_1_otherOffset = 32L
        val size_2_offset = 32L
        val size_2_otherOffset = 32L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_DATAACQUIREREQUEST: Int = 279 /* */
@inline @cCode.inline val ERR_DATAACQUIREREQUEST_TRANSACTION_ID_2_2: Int = 254 /* */
@inline @cCode.inline val ERR_DATAACQUIREREQUEST_LOGICALDEVICE_ID_2: Int = 264 /* */
@inline @cCode.inline val ERR_DATAACQUIREREQUEST_PARAMETER_ID_2: Int = 274 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_DATAACQUIREREQUEST: Int = 282 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_DATAACQUIREREQUEST_TRANSACTION_ID_2_2: Int = 257 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_DATAACQUIREREQUEST_LOGICALDEVICE_ID_2: Int = 267 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_DATAACQUIREREQUEST_PARAMETER_ID_2: Int = 277 /*  */
@inline @cCode.inline val TDataAcquireRequest_REQUIRED_BYTES_FOR_ACN_ENCODING = 12
@inline @cCode.inline val TDataAcquireRequest_REQUIRED_BITS_FOR_ACN_ENCODING = 96

@inline @cCode.inline val ERR_ACN_DECODE_DATAACQUIREREQUEST: Int = 283 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_DATAACQUIREREQUEST_TRANSACTION_ID_2_2: Int = 258 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_DATAACQUIREREQUEST_LOGICALDEVICE_ID_2: Int = 268 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_DATAACQUIREREQUEST_PARAMETER_ID_2: Int = 278 /*  */
/*-- TTC_2_11_AcquireDataFromLogicalDevices --------------------------------------------*/


case class TTC_2_11_AcquireDataFromLogicalDevices_dataAcquireRequests (nCount: Int, arr: Vector[TDataAcquireRequest])
{
    require(this.arr.size <= 63 && 1 <= this.nCount && this.nCount <= this.arr.size)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854769759L))
        TTC_2_11_AcquireDataFromLogicalDevices_dataAcquireRequests.sizeRange(this.arr, offset, 0, this.nCount)
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 6048L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854769759L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854769759L))
        TTC_2_11_AcquireDataFromLogicalDevices_dataAcquireRequests.sizeLemmaAnyOffset(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854769759L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854769759L))
        require((offset % 8L) == (otherOffset % 8L))
        TTC_2_11_AcquireDataFromLogicalDevices_dataAcquireRequests.sizeLemmaNextByte(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854769759L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854769759L))
        require((offset % 16L) == (otherOffset % 16L))
        TTC_2_11_AcquireDataFromLogicalDevices_dataAcquireRequests.sizeLemmaNextWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854769759L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854769759L))
        require((offset % 32L) == (otherOffset % 32L))
        TTC_2_11_AcquireDataFromLogicalDevices_dataAcquireRequests.sizeLemmaNextDWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}
object TTC_2_11_AcquireDataFromLogicalDevices_dataAcquireRequests {
    def sizeRange(ls: Vector[TDataAcquireRequest], offset: Long, from: Int, to: Int): Long = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 96L * (to - from)))
        decreases(to - from)
        if (from == to) {
            0L
        } else {
            val elemSize = ls.apply(from).size(offset)
            assert(elemSize == 96L)
            elemSize + TTC_2_11_AcquireDataFromLogicalDevices_dataAcquireRequests.sizeRange(ls, offset + elemSize, from + 1, to)
        }
    }.ensuring { (res: Long) => 
        val nbElems = (to - from)
        (0L <= res && res <= 96L * nbElems)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(ls: Vector[TDataAcquireRequest], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 96L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 96L * (to - from)))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 96L)
            assert(elemSizeOtherOff == 96L)
            ls.apply(from).sizeLemmaAnyOffset(offset, otherOffset)
            TTC_2_11_AcquireDataFromLogicalDevices_dataAcquireRequests.sizeLemmaAnyOffset(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_2_11_AcquireDataFromLogicalDevices_dataAcquireRequests.sizeRange(ls, offset, from, to) == TTC_2_11_AcquireDataFromLogicalDevices_dataAcquireRequests.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(ls: Vector[TDataAcquireRequest], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 96L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 96L * (to - from)))
        require((offset % 8L) == (otherOffset % 8L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 96L)
            assert(elemSizeOtherOff == 96L)
            ls.apply(from).sizeLemmaNextByte(offset, otherOffset)
            TTC_2_11_AcquireDataFromLogicalDevices_dataAcquireRequests.sizeLemmaNextByte(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_2_11_AcquireDataFromLogicalDevices_dataAcquireRequests.sizeRange(ls, offset, from, to) == TTC_2_11_AcquireDataFromLogicalDevices_dataAcquireRequests.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(ls: Vector[TDataAcquireRequest], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 96L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 96L * (to - from)))
        require((offset % 16L) == (otherOffset % 16L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 96L)
            assert(elemSizeOtherOff == 96L)
            ls.apply(from).sizeLemmaNextWord(offset, otherOffset)
            TTC_2_11_AcquireDataFromLogicalDevices_dataAcquireRequests.sizeLemmaNextWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_2_11_AcquireDataFromLogicalDevices_dataAcquireRequests.sizeRange(ls, offset, from, to) == TTC_2_11_AcquireDataFromLogicalDevices_dataAcquireRequests.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(ls: Vector[TDataAcquireRequest], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 96L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 96L * (to - from)))
        require((offset % 32L) == (otherOffset % 32L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 96L)
            assert(elemSizeOtherOff == 96L)
            ls.apply(from).sizeLemmaNextDWord(offset, otherOffset)
            TTC_2_11_AcquireDataFromLogicalDevices_dataAcquireRequests.sizeLemmaNextDWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_2_11_AcquireDataFromLogicalDevices_dataAcquireRequests.sizeRange(ls, offset, from, to) == TTC_2_11_AcquireDataFromLogicalDevices_dataAcquireRequests.sizeRange(ls, otherOffset, from, to)
    }
}

case class TTC_2_11_AcquireDataFromLogicalDevices (
    dataAcquireRequests: TTC_2_11_AcquireDataFromLogicalDevices_dataAcquireRequests
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854769727L))
        val size_0 = 32L
        val size_1 = this.dataAcquireRequests.size(offset + size_0)
        size_0 + size_1
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 6080L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854769727L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854769727L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.dataAcquireRequests.size(offset + size_0_offset)
        val size_1_otherOffset = this.dataAcquireRequests.size(otherOffset + size_0_otherOffset)
        this.dataAcquireRequests.sizeLemmaAnyOffset(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854769727L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854769727L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.dataAcquireRequests.size(offset + size_0_offset)
        val size_1_otherOffset = this.dataAcquireRequests.size(otherOffset + size_0_otherOffset)
        this.dataAcquireRequests.sizeLemmaNextByte(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854769727L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854769727L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.dataAcquireRequests.size(offset + size_0_offset)
        val size_1_otherOffset = this.dataAcquireRequests.size(otherOffset + size_0_otherOffset)
        this.dataAcquireRequests.sizeLemmaNextWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854769727L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854769727L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.dataAcquireRequests.size(offset + size_0_offset)
        val size_1_otherOffset = this.dataAcquireRequests.size(otherOffset + size_0_otherOffset)
        this.dataAcquireRequests.sizeLemmaNextDWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TC_2_11_ACQUIREDATAFROMLOGICALDEVICES_DATAACQUIREREQUESTS: Int = 233 /*(SIZE(1 .. maxTC-2-11-DataAcquireRequestCount)) */
@inline @cCode.inline val ERR_TC_2_11_ACQUIREDATAFROMLOGICALDEVICES_DATAACQUIREREQUESTS_ELM_2: Int = 228 /* */

@inline @cCode.inline val ERR_TC_2_11_ACQUIREDATAFROMLOGICALDEVICES: Int = 238 /* */

 
 

@inline @cCode.inline val ERR_ACN_ENCODE_TC_2_11_ACQUIREDATAFROMLOGICALDEVICES: Int = 241 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_2_11_ACQUIREDATAFROMLOGICALDEVICES_N_UNINITIALIZED: Int = 242 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_2_11_ACQUIREDATAFROMLOGICALDEVICES_N: Int = 186 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_2_11_ACQUIREDATAFROMLOGICALDEVICES_DATAACQUIREREQUESTS: Int = 236 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_2_11_ACQUIREDATAFROMLOGICALDEVICES_DATAACQUIREREQUESTS_ELM_2: Int = 231 /*  */
@inline @cCode.inline val TTC_2_11_AcquireDataFromLogicalDevices_REQUIRED_BYTES_FOR_ACN_ENCODING = 760
@inline @cCode.inline val TTC_2_11_AcquireDataFromLogicalDevices_REQUIRED_BITS_FOR_ACN_ENCODING = 6080

@inline @cCode.inline val ERR_ACN_DECODE_TC_2_11_ACQUIREDATAFROMLOGICALDEVICES: Int = 243 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_2_11_ACQUIREDATAFROMLOGICALDEVICES_N: Int = 187 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_2_11_ACQUIREDATAFROMLOGICALDEVICES_DATAACQUIREREQUESTS: Int = 237 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_2_11_ACQUIREDATAFROMLOGICALDEVICES_DATAACQUIREREQUESTS_ELM_2: Int = 232 /*  */

// @inline @cCode.inline val maxTC_2_11_DataAcquireRequestCount: Int = 63 // defined in body

