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

sealed trait TParameter_ID:
    def i: Int
object TParameter_ID:
    case object Tparam1 extends TParameter_ID:
        override def i: Int = 0

// please use the following macros to avoid breaking code.
// type Tparam1 = TParameter_ID.param1

@inline @cCode.inline val ERR_PARAMETER_ID: Int = 1568 /*param1 */

 

@inline @cCode.inline val ERR_ACN_ENCODE_PARAMETER_ID: Int = 1571 /*  */
@inline @cCode.inline val TParameter_ID_REQUIRED_BYTES_FOR_ACN_ENCODING = 4
@inline @cCode.inline val TParameter_ID_REQUIRED_BITS_FOR_ACN_ENCODING = 32

@inline @cCode.inline val ERR_ACN_DECODE_PARAMETER_ID: Int = 1572 /*  */
/*-- TParameterValue --------------------------------------------*/
type TParameterValue_param1 = ULong


enum TParameterValue:
    case ParameterValue_param1_PRESENT(param1: TParameterValue_param1)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775799L))
        this match {
            case TParameterValue.ParameterValue_param1_PRESENT(param1) =>
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
            case TParameterValue.ParameterValue_param1_PRESENT(param1) =>
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
            case TParameterValue.ParameterValue_param1_PRESENT(param1) =>
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
            case TParameterValue.ParameterValue_param1_PRESENT(param1) =>
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
            case TParameterValue.ParameterValue_param1_PRESENT(param1) =>
                ()
        }
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

@inline @cCode.inline val ERR_PARAMETERVALUE_PARAM1: Int = 1573 /*(0 ..255) */

@inline @cCode.inline val ERR_PARAMETERVALUE: Int = 1578 /* */

 
 
/*-- TParameterMask --------------------------------------------*/

case class TParameterMask_param1(arr: Vector[UByte])
{
    require(this.arr.length == 2)
}

enum TParameterMask:
    case ParameterMask_param1_PRESENT(param1: TParameterMask_param1)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775791L))
        this match {
            case TParameterMask.ParameterMask_param1_PRESENT(param1) =>
                16L
        }
    }.ensuring { (res: Long) => 
        res == 16L
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775791L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775791L))
        this match {
            case TParameterMask.ParameterMask_param1_PRESENT(param1) =>
                ()
        }
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775791L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775791L))
        require((offset % 8L) == (otherOffset % 8L))
        this match {
            case TParameterMask.ParameterMask_param1_PRESENT(param1) =>
                ()
        }
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775791L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775791L))
        require((offset % 16L) == (otherOffset % 16L))
        this match {
            case TParameterMask.ParameterMask_param1_PRESENT(param1) =>
                ()
        }
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775791L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775791L))
        require((offset % 32L) == (otherOffset % 32L))
        this match {
            case TParameterMask.ParameterMask_param1_PRESENT(param1) =>
                ()
        }
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

@inline @cCode.inline val ERR_PARAMETERMASK_PARAM1: Int = 1583 /*(SIZE (16)) */

@inline @cCode.inline val ERR_PARAMETERMASK: Int = 1588 /* */

 
 


