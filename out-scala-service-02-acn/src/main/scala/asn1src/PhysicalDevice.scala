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


def TPhysicalDevice_ID_IsConstraintValid(pVal: TPhysicalDevice_ID): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = (pVal == TPhysicalDevice_ID.Tdev1) match
        case true =>
            Right(0)
        case false =>
            Left(45)
    ret
}

def TPhysicalDevice_ID_Initialize(): TPhysicalDevice_ID = TPhysicalDevice_ID.Tdev1

@opaque @inlineOnce 
def TPhysicalDevice_ID_ACN_Encode(pVal: TPhysicalDevice_ID, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(32L))
    TPhysicalDevice_ID_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    val intVal_pVal = pVal match
        case TPhysicalDevice_ID.Tdev1 => ULong.fromRaw(1L)

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
def TPhysicalDevice_ID_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TPhysicalDevice_ID] =
{
    require(codec.base.bitStream.validate_offset_bits(32L))

    @ghost val oldCdc = snapshot(codec)
    val intVal_pVal = codec.dec_Int_PositiveInteger_ConstSize_big_endian_32()

    val pVal = intVal_pVal.toRaw match
        case 1 => TPhysicalDevice_ID.Tdev1
        case _ => return LeftMut(ERR_ACN_DECODE_PHYSICALDEVICE_ID)

    TPhysicalDevice_ID_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TPhysicalDevice_ID](l)
        case Right(_) => RightMut[ErrorCode, TPhysicalDevice_ID](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TPhysicalDevice_ID]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 32L && TPhysicalDevice_ID_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TPhysicalDevice_ID_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TPhysicalDevice_ID]) =
{
    require(codec.base.bitStream.validate_offset_bits(32L))
    val cpy = snapshot(codec)
    val res = TPhysicalDevice_ID_ACN_Decode(cpy)
    (cpy, res)
}

def TProtocolSpecificData_dev1_IsConstraintValid(pVal: TProtocolSpecificData_dev1): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = (pVal <= ULong.fromRaw(255L)) match
        case true =>
            Right(0)
        case false =>
            Left(45)
    ret
}

def TProtocolSpecificData_IsConstraintValid(pVal: TProtocolSpecificData): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    pVal match
        case TProtocolSpecificData.ProtocolSpecificData_dev1_PRESENT(dev1) =>
            ret = TProtocolSpecificData_dev1_IsConstraintValid(dev1)
    ret
}

def TProtocolSpecificData_dev1_Initialize(): TProtocolSpecificData_dev1 = ULong.fromRaw(0L)
def TProtocolSpecificData_Initialize(): TProtocolSpecificData = TProtocolSpecificData.ProtocolSpecificData_dev1_PRESENT(ULong.fromRaw(0L))