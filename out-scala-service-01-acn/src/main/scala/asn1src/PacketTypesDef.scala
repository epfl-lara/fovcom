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

type TPacketVersionNumberValue = NullType


 

@inline @cCode.inline val ERR_ACN_ENCODE_PACKETVERSIONNUMBERVALUE: Int = 1932 /*  */
@inline @cCode.inline val TPacketVersionNumberValue_REQUIRED_BYTES_FOR_ACN_ENCODING = 1
@inline @cCode.inline val TPacketVersionNumberValue_REQUIRED_BITS_FOR_ACN_ENCODING = 3

@inline @cCode.inline val ERR_ACN_DECODE_PACKETVERSIONNUMBERVALUE: Int = 1933 /*  */
type TSecondaryHeaderFlag = ULong


@inline @cCode.inline val ERR_SECONDARYHEADERFLAG: Int = 1934 /*(0 .. 1) */

 

@inline @cCode.inline val ERR_ACN_ENCODE_SECONDARYHEADERFLAG: Int = 1937 /*  */
@inline @cCode.inline val TSecondaryHeaderFlag_REQUIRED_BYTES_FOR_ACN_ENCODING = 1
@inline @cCode.inline val TSecondaryHeaderFlag_REQUIRED_BITS_FOR_ACN_ENCODING = 1

@inline @cCode.inline val ERR_ACN_DECODE_SECONDARYHEADERFLAG: Int = 1938 /*  */
/*-- TPacketSequenceControl --------------------------------------------*/
type TPacketSequenceControl_packetSequenceCountOrName = ULong


case class TPacketSequenceControl (
    sequenceFlags: NullType, 
    packetSequenceCountOrName: TPacketSequenceControl_packetSequenceCountOrName
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775791L))
        val size_0 = 2L
        val size_1 = 14L
        size_0 + size_1
    }.ensuring { (res: Long) => 
        res == 16L
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775791L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775791L))
        val size_0_offset = 2L
        val size_0_otherOffset = 2L
        val size_1_offset = 14L
        val size_1_otherOffset = 14L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775791L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775791L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 2L
        val size_0_otherOffset = 2L
        val size_1_offset = 14L
        val size_1_otherOffset = 14L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775791L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775791L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 2L
        val size_0_otherOffset = 2L
        val size_1_offset = 14L
        val size_1_otherOffset = 14L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775791L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775791L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 2L
        val size_0_otherOffset = 2L
        val size_1_offset = 14L
        val size_1_otherOffset = 14L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_PACKETSEQUENCECONTROL_PACKETSEQUENCECOUNTORNAME: Int = 1943 /*(0 .. 16383) */

@inline @cCode.inline val ERR_PACKETSEQUENCECONTROL: Int = 1948 /* */

 
 

@inline @cCode.inline val ERR_ACN_ENCODE_PACKETSEQUENCECONTROL: Int = 1951 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_PACKETSEQUENCECONTROL_SEQUENCEFLAGS: Int = 1941 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_PACKETSEQUENCECONTROL_PACKETSEQUENCECOUNTORNAME: Int = 1946 /*  */
@inline @cCode.inline val TPacketSequenceControl_REQUIRED_BYTES_FOR_ACN_ENCODING = 2
@inline @cCode.inline val TPacketSequenceControl_REQUIRED_BITS_FOR_ACN_ENCODING = 16

@inline @cCode.inline val ERR_ACN_DECODE_PACKETSEQUENCECONTROL: Int = 1952 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_PACKETSEQUENCECONTROL_SEQUENCEFLAGS: Int = 1942 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_PACKETSEQUENCECONTROL_PACKETSEQUENCECOUNTORNAME: Int = 1947 /*  */
type TPacketDataLength = ULong


@inline @cCode.inline val ERR_PACKETDATALENGTH: Int = 1953 /*(0 .. 65535) */

 

@inline @cCode.inline val ERR_ACN_ENCODE_PACKETDATALENGTH: Int = 1956 /*  */
@inline @cCode.inline val TPacketDataLength_REQUIRED_BYTES_FOR_ACN_ENCODING = 2
@inline @cCode.inline val TPacketDataLength_REQUIRED_BITS_FOR_ACN_ENCODING = 16

@inline @cCode.inline val ERR_ACN_DECODE_PACKETDATALENGTH: Int = 1957 /*  */

case class TPacketErrorControl(arr: Vector[UByte])
{
    require(this.arr.length == 2)
}

@inline @cCode.inline val ERR_PACKETERRORCONTROL: Int = 1958 /*(SIZE(16)) */

 

@inline @cCode.inline val ERR_ACN_ENCODE_PACKETERRORCONTROL: Int = 1961 /*  */
@inline @cCode.inline val TPacketErrorControl_REQUIRED_BYTES_FOR_ACN_ENCODING = 2
@inline @cCode.inline val TPacketErrorControl_REQUIRED_BITS_FOR_ACN_ENCODING = 16

@inline @cCode.inline val ERR_ACN_DECODE_PACKETERRORCONTROL: Int = 1962 /*  */


