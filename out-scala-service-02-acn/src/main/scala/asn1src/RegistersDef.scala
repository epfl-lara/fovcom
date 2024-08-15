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

sealed trait TRegisterAddress:
    def i: Int
object TRegisterAddress:
    case object Treg1 extends TRegisterAddress:
        override def i: Int = 1
    case object Treg2 extends TRegisterAddress:
        override def i: Int = 2

// please use the following macros to avoid breaking code.
// type Treg1 = TRegisterAddress.reg1
// type Treg2 = TRegisterAddress.reg2

@inline @cCode.inline val ERR_REGISTERADDRESS: Int = 942 /*reg1 | reg2 */

 

@inline @cCode.inline val ERR_ACN_ENCODE_REGISTERADDRESS: Int = 945 /*  */
@inline @cCode.inline val TRegisterAddress_REQUIRED_BYTES_FOR_ACN_ENCODING = 4
@inline @cCode.inline val TRegisterAddress_REQUIRED_BITS_FOR_ACN_ENCODING = 32

@inline @cCode.inline val ERR_ACN_DECODE_REGISTERADDRESS: Int = 946 /*  */
/*-- TRegisterData --------------------------------------------*/
type TRegisterData_reg1 = ULong

type TRegisterData_reg2 = ULong


enum TRegisterData:
    case reg1_PRESENT(reg1: TRegisterData_reg1)
    case reg2_PRESENT(reg2: TRegisterData_reg2)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775799L))
        this match {
            case TRegisterData.reg1_PRESENT(reg1) =>
                8L
            case TRegisterData.reg2_PRESENT(reg2) =>
                6L
        }
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 8L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775799L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775799L))
        this match {
            case TRegisterData.reg1_PRESENT(reg1) =>
                ()
            case TRegisterData.reg2_PRESENT(reg2) =>
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
            case TRegisterData.reg1_PRESENT(reg1) =>
                ()
            case TRegisterData.reg2_PRESENT(reg2) =>
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
            case TRegisterData.reg1_PRESENT(reg1) =>
                ()
            case TRegisterData.reg2_PRESENT(reg2) =>
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
            case TRegisterData.reg1_PRESENT(reg1) =>
                ()
            case TRegisterData.reg2_PRESENT(reg2) =>
                ()
        }
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

@inline @cCode.inline val ERR_REGISTERDATA_REG1: Int = 947 /*(0 .. 255) */

@inline @cCode.inline val ERR_REGISTERDATA_REG2: Int = 952 /*(0 .. 63) */

@inline @cCode.inline val ERR_REGISTERDATA: Int = 957 /* */

 
 
 
/*-- TRegister --------------------------------------------*/

case class TRegister (
    registerData: TRegisterData
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775767L))
        val size_0 = 32L
        val size_1 = this.registerData match {
            case TRegisterData.reg1_PRESENT(reg1) =>
                8L
            case TRegisterData.reg2_PRESENT(reg2) =>
                6L
        }
        size_0 + size_1
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 40L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775767L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775767L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.registerData match {
            case TRegisterData.reg1_PRESENT(reg1) =>
                8L
            case TRegisterData.reg2_PRESENT(reg2) =>
                6L
        }
        val size_1_otherOffset = this.registerData match {
            case TRegisterData.reg1_PRESENT(reg1) =>
                8L
            case TRegisterData.reg2_PRESENT(reg2) =>
                6L
        }
        this.registerData.sizeLemmaAnyOffset(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775767L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775767L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.registerData match {
            case TRegisterData.reg1_PRESENT(reg1) =>
                8L
            case TRegisterData.reg2_PRESENT(reg2) =>
                6L
        }
        val size_1_otherOffset = this.registerData match {
            case TRegisterData.reg1_PRESENT(reg1) =>
                8L
            case TRegisterData.reg2_PRESENT(reg2) =>
                6L
        }
        this.registerData.sizeLemmaNextByte(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775767L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775767L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.registerData match {
            case TRegisterData.reg1_PRESENT(reg1) =>
                8L
            case TRegisterData.reg2_PRESENT(reg2) =>
                6L
        }
        val size_1_otherOffset = this.registerData match {
            case TRegisterData.reg1_PRESENT(reg1) =>
                8L
            case TRegisterData.reg2_PRESENT(reg2) =>
                6L
        }
        this.registerData.sizeLemmaNextWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775767L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775767L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.registerData match {
            case TRegisterData.reg1_PRESENT(reg1) =>
                8L
            case TRegisterData.reg2_PRESENT(reg2) =>
                6L
        }
        val size_1_otherOffset = this.registerData match {
            case TRegisterData.reg1_PRESENT(reg1) =>
                8L
            case TRegisterData.reg2_PRESENT(reg2) =>
                6L
        }
        this.registerData.sizeLemmaNextDWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_REGISTER: Int = 936 /* */
@inline @cCode.inline val ERR_REGISTER_REGISTERDATA_2: Int = 933 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_REGISTER: Int = 939 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_REGISTER_REGISTERADDRESS_UNINITIALIZED: Int = 940 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_REGISTER_REGISTERADDRESS: Int = 916 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_REGISTER_REGISTERDATA: Int = 931 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_REGISTER_REGISTERDATA_REG1: Int = 921 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_REGISTER_REGISTERDATA_REG2: Int = 926 /*  */
@inline @cCode.inline val TRegister_REQUIRED_BYTES_FOR_ACN_ENCODING = 5
@inline @cCode.inline val TRegister_REQUIRED_BITS_FOR_ACN_ENCODING = 40

@inline @cCode.inline val ERR_ACN_DECODE_REGISTER: Int = 941 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_REGISTER_REGISTERADDRESS: Int = 917 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_REGISTER_REGISTERDATA: Int = 932 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_REGISTER_REGISTERDATA_REG1: Int = 922 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_REGISTER_REGISTERDATA_REG2: Int = 927 /*  */

