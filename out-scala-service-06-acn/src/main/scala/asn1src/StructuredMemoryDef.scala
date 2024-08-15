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

/*-- TBaseMultipleMemid --------------------------------------------*/
type TBaseMultipleMemid_memId1 = ULong


enum TBaseMultipleMemid:
    case BaseMultipleMemid_memId1_PRESENT(memId1: TBaseMultipleMemid_memId1)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775799L))
        this match {
            case TBaseMultipleMemid.BaseMultipleMemid_memId1_PRESENT(memId1) =>
                8L
        }
    }.ensuring { (res: Long) => 
        res == 8L
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775799L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775799L))
        this match {
            case TBaseMultipleMemid.BaseMultipleMemid_memId1_PRESENT(memId1) =>
                ()
        }
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775799L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775799L))
        require((offset % 8L) == (otherOffset % 8L))
        this match {
            case TBaseMultipleMemid.BaseMultipleMemid_memId1_PRESENT(memId1) =>
                ()
        }
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775799L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775799L))
        require((offset % 16L) == (otherOffset % 16L))
        this match {
            case TBaseMultipleMemid.BaseMultipleMemid_memId1_PRESENT(memId1) =>
                ()
        }
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775799L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775799L))
        require((offset % 32L) == (otherOffset % 32L))
        this match {
            case TBaseMultipleMemid.BaseMultipleMemid_memId1_PRESENT(memId1) =>
                ()
        }
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

@inline @cCode.inline val ERR_BASEMULTIPLEMEMID_MEMID1: Int = 2323 /*(0 .. 255) */

@inline @cCode.inline val ERR_BASEMULTIPLEMEMID: Int = 2328 /* */

 
 
type TBase = ULong


@inline @cCode.inline val ERR_BASE: Int = 2333 /*(0 .. 255) */

 

@inline @cCode.inline val ERR_ACN_ENCODE_BASE: Int = 2336 /*  */
@inline @cCode.inline val TBase_REQUIRED_BYTES_FOR_ACN_ENCODING = 1
@inline @cCode.inline val TBase_REQUIRED_BITS_FOR_ACN_ENCODING = 8

@inline @cCode.inline val ERR_ACN_DECODE_BASE: Int = 2337 /*  */


