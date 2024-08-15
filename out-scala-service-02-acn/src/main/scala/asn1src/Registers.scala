/*
Code automatically generated by asn1scc tool
*/
package asn1src

import asn1scala._
import stainless.lang.{ghost => ghostExpr, _}
import stainless.annotation._
import stainless.collection._
import stainless.proof._
import StaticChecks._


def TRegisterAddress_IsConstraintValid(pVal: TRegisterAddress): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = (((pVal == TRegisterAddress.Treg1)) || ((pVal == TRegisterAddress.Treg2))) match
        case true =>
            Right(0)
        case false =>
            Left(45)
    ret
}

def TRegisterAddress_Initialize(): TRegisterAddress = TRegisterAddress.Treg1

@opaque @inlineOnce 
def TRegisterAddress_ACN_Encode(pVal: TRegisterAddress, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(32L))
    TRegisterAddress_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    val intVal_pVal = pVal match
        case TRegisterAddress.Treg1 => ULong.fromRaw(0L)
        case TRegisterAddress.Treg2 => ULong.fromRaw(1L)

    locally {
        ghostExpr {
            @opaque @inlineOnce
            def bitCountLemma(v: ULong): Unit = {
                require(v <= ULong.fromRaw(1))
            }.ensuring(_ => GetBitCountUnsigned(v) <= 4294967295L)
            bitCountLemma(intVal_pVal)
        }
    }
    codec.enc_Int_PositiveInteger_ConstSize_big_endian_32(intVal_pVal)
    Right(0)
}.ensuring { (res : Either[ErrorCode, Int]) =>
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 32L
    }
}

@opaque @inlineOnce 
def TRegisterAddress_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TRegisterAddress] =
{
    require(codec.base.bitStream.validate_offset_bits(32L))

    @ghost val oldCdc = snapshot(codec)
    val intVal_pVal = codec.dec_Int_PositiveInteger_ConstSize_big_endian_32()

    val pVal = intVal_pVal.toRaw match
        case 0 => TRegisterAddress.Treg1
        case 1 => TRegisterAddress.Treg2
        case _ => return LeftMut(ERR_ACN_DECODE_REGISTERADDRESS)

    TRegisterAddress_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TRegisterAddress](l)
        case Right(_) => RightMut[ErrorCode, TRegisterAddress](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TRegisterAddress]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 32L && TRegisterAddress_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TRegisterAddress_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TRegisterAddress]) =
{
    require(codec.base.bitStream.validate_offset_bits(32L))
    val cpy = snapshot(codec)
    val res = TRegisterAddress_ACN_Decode(cpy)
    (cpy, res)
}

def TRegisterData_reg1_IsConstraintValid(pVal: TRegisterData_reg1): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = (pVal <= ULong.fromRaw(255L)) match
        case true =>
            Right(0)
        case false =>
            Left(45)
    ret
}

def TRegisterData_reg2_IsConstraintValid(pVal: TRegisterData_reg2): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = (pVal <= ULong.fromRaw(63L)) match
        case true =>
            Right(0)
        case false =>
            Left(45)
    ret
}

def TRegisterData_IsConstraintValid(pVal: TRegisterData): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    pVal match
        case TRegisterData.reg1_PRESENT(reg1) =>
            ret = TRegisterData_reg1_IsConstraintValid(reg1)
        case TRegisterData.reg2_PRESENT(reg2) =>
            ret = TRegisterData_reg2_IsConstraintValid(reg2)
    ret
}

def TRegisterData_reg1_Initialize(): TRegisterData_reg1 = ULong.fromRaw(0L)
def TRegisterData_reg2_Initialize(): TRegisterData_reg2 = ULong.fromRaw(0L)
def TRegisterData_Initialize(): TRegisterData = TRegisterData.reg1_PRESENT(ULong.fromRaw(0L))

def TRegister_IsConstraintValid(pVal: TRegister): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = TRegisterData_IsConstraintValid(pVal.registerData)
    ret
}

def TRegister_Initialize(): TRegister = TRegister(registerData = TRegisterData_Initialize())

@opaque @inlineOnce 
def TRegister_ACN_Encode(pVal: TRegister, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(40L))
    TRegister_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    val Register_registerAddress = pVal.registerData match
        case TRegisterData.reg1_PRESENT(_) =>TRegisterAddress.Treg1
        case TRegisterData.reg2_PRESENT(_) =>TRegisterAddress.Treg2

    /* Encode Register_registerAddress */
    val intVal_Register_registerAddress = Register_registerAddress match
        case TRegisterAddress.Treg1 => ULong.fromRaw(0L)
        case TRegisterAddress.Treg2 => ULong.fromRaw(1L)

    locally {
        ghostExpr {
            @opaque @inlineOnce
            def bitCountLemma(v: ULong): Unit = {
                require(v <= ULong.fromRaw(1))
            }.ensuring(_ => GetBitCountUnsigned(v) <= 4294967295L)
            bitCountLemma(intVal_Register_registerAddress)
        }
    }
    codec.enc_Int_PositiveInteger_ConstSize_big_endian_32(intVal_Register_registerAddress)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 40L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_0 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Encode registerData */
    Register_registerData_ACN_Encode(codec, pVal, Register_registerAddress, pVal.registerData) match {
        case Left(l) =>
            return Left(l)
        case Right(_) =>
            ()
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 40L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_1 = pVal.registerData match {
        case TRegisterData.reg1_PRESENT(reg1) =>
            8L
        case TRegisterData.reg2_PRESENT(reg2) =>
            6L
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 40L)
    }
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0 + size_1)
    }
    Right(0)
}.ensuring { (res : Either[ErrorCode, Int]) =>
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + pVal.size(old(codec).base.bitStream.bitIndex)
    }
}

@opaque @inlineOnce
def Register_registerData_ACN_Encode(codec: ACN, pVal: TRegister, Register_registerAddress: TRegisterAddress, registerData: TRegisterData): Either[Int, Int] = {
    require(codec.base.bitStream.validate_offset_bits(8L))
    @ghost val oldCdc = snapshot(codec)
    TRegisterData_IsConstraintValid(registerData) match {
        case Left(l) =>
            return Left[Int, Int](l)
        case Right(_) =>
    }
    registerData match
        case TRegisterData.reg1_PRESENT(reg1) =>
            locally {
                ghostExpr {
                    @opaque @inlineOnce
                    def bitCountLemma(): Unit = ().ensuring(_ => GetBitCountUnsigned(ULong.fromRaw(255) - ULong.fromRaw(0)) == 8)
                    bitCountLemma()
                }
            }
            codec.base.encodeConstrainedPosWholeNumber(reg1, 0.toRawULong, 255.toRawULong)
        case TRegisterData.reg2_PRESENT(reg2) =>
            locally {
                ghostExpr {
                    @opaque @inlineOnce
                    def bitCountLemma(): Unit = ().ensuring(_ => GetBitCountUnsigned(ULong.fromRaw(63) - ULong.fromRaw(0)) == 6)
                    bitCountLemma()
                }
            }
            codec.base.encodeConstrainedPosWholeNumber(reg2, 0.toRawULong, 63.toRawULong)
    Right[Int, Int](0)
}.ensuring { (res: Either[Int, Int]) => 
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + registerData.size(old(codec).base.bitStream.bitIndex)
    }
}

@opaque @inlineOnce 
def TRegister_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TRegister] =
{
    require(codec.base.bitStream.validate_offset_bits(40L))

    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Decode Register_registerAddress */
    val intVal_Register_registerAddress = codec.dec_Int_PositiveInteger_ConstSize_big_endian_32()

    val Register_registerAddress = intVal_Register_registerAddress.toRaw match
        case 0 => TRegisterAddress.Treg1
        case 1 => TRegisterAddress.Treg2
        case _ => return LeftMut(ERR_ACN_DECODE_REGISTER_REGISTERADDRESS)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 40L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_0 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Decode registerData */
    val pVal_registerData = Register_registerData_ACN_Decode(codec, Register_registerAddress) match {
        case LeftMut(l) =>
            return LeftMut(l)
        case RightMut(v) =>
            v
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 40L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_1 = pVal_registerData match {
        case TRegisterData.reg1_PRESENT(reg1) =>
            8L
        case TRegisterData.reg2_PRESENT(reg2) =>
            6L
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 40L)
    }
    val pVal = TRegister(pVal_registerData)
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0 + size_1)
    }

    TRegister_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TRegister](l)
        case Right(_) => RightMut[ErrorCode, TRegister](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TRegister]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TRegister_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TRegister_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TRegister]) =
{
    require(codec.base.bitStream.validate_offset_bits(40L))
    val cpy = snapshot(codec)
    val res = TRegister_ACN_Decode(cpy)
    (cpy, res)
}

@opaque @inlineOnce
def Register_registerData_ACN_Decode(codec: ACN, Register_registerAddress: TRegisterAddress): EitherMut[Int, TRegisterData] = {
    require(codec.base.bitStream.validate_offset_bits(8L))
    @ghost val oldCdc = snapshot(codec)
    val registerData = Register_registerAddress match
        case TRegisterAddress.Treg1 =>
            locally {
                ghostExpr {
                    @opaque @inlineOnce
                    def bitCountLemma(): Unit = ().ensuring(_ => GetBitCountUnsigned(ULong.fromRaw(255) - ULong.fromRaw(0)) == 8)
                    bitCountLemma()
                }
            }
            val reg1 = codec.base.decodeConstrainedPosWholeNumber(ULong.fromRaw(0), ULong.fromRaw(255)) // uper:135
            TRegisterData.reg1_PRESENT(reg1)
        case TRegisterAddress.Treg2 =>
            locally {
                ghostExpr {
                    @opaque @inlineOnce
                    def bitCountLemma(): Unit = ().ensuring(_ => GetBitCountUnsigned(ULong.fromRaw(63) - ULong.fromRaw(0)) == 6)
                    bitCountLemma()
                }
            }
            val reg2 = codec.base.decodeConstrainedPosWholeNumber(ULong.fromRaw(0), ULong.fromRaw(63)) // uper:135
            TRegisterData.reg2_PRESENT(reg2)
    TRegisterData_IsConstraintValid(registerData) match {
        case Left(l) =>
            LeftMut[Int, TRegisterData](l)
        case Right(_) =>
            RightMut[Int, TRegisterData](registerData)
    }
}.ensuring { (res: EitherMut[Int, TRegisterData]) => 
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TRegisterData_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure
def Register_registerData_ACN_Decode_pure(codec: ACN, Register_registerAddress: TRegisterAddress): (ACN, EitherMut[Int, TRegisterData]) = {
    require(codec.base.bitStream.validate_offset_bits(8L))
    val cpy = snapshot(codec)
    val res = Register_registerData_ACN_Decode(cpy, Register_registerAddress)
    (cpy, res)
}