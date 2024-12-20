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


def TServiceType_ID_IsConstraintValid(pVal: TServiceType_ID): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = ((ULong.fromRaw(1L) <= pVal) && (pVal <= ULong.fromRaw(255L))) match
        case true =>
            Right(0)
        case false =>
            Left(45)
    ret
}

def TServiceType_ID_Initialize(): TServiceType_ID = ULong.fromRaw(1L)

@opaque @inlineOnce 
def TServiceType_ID_ACN_Encode(pVal: TServiceType_ID, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(8L))
    TServiceType_ID_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    codec.enc_Int_PositiveInteger_ConstSize_8(pVal)
    Right(0)
}.ensuring { (res : Either[ErrorCode, Int]) =>
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 8L
    }
}

@opaque @inlineOnce 
def TServiceType_ID_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TServiceType_ID] =
{
    require(codec.base.bitStream.validate_offset_bits(8L))

    @ghost val oldCdc = snapshot(codec)
    val pVal = codec.dec_Int_PositiveInteger_ConstSize_8()


    TServiceType_ID_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TServiceType_ID](l)
        case Right(_) => RightMut[ErrorCode, TServiceType_ID](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TServiceType_ID]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 8L && TServiceType_ID_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TServiceType_ID_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TServiceType_ID]) =
{
    require(codec.base.bitStream.validate_offset_bits(8L))
    val cpy = snapshot(codec)
    val res = TServiceType_ID_ACN_Decode(cpy)
    (cpy, res)
}

def TMessageSubtype_ID_IsConstraintValid(pVal: TMessageSubtype_ID): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = ((ULong.fromRaw(1L) <= pVal) && (pVal <= ULong.fromRaw(255L))) match
        case true =>
            Right(0)
        case false =>
            Left(45)
    ret
}

def TMessageSubtype_ID_Initialize(): TMessageSubtype_ID = ULong.fromRaw(1L)

@opaque @inlineOnce 
def TMessageSubtype_ID_ACN_Encode(pVal: TMessageSubtype_ID, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(8L))
    TMessageSubtype_ID_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    codec.enc_Int_PositiveInteger_ConstSize_8(pVal)
    Right(0)
}.ensuring { (res : Either[ErrorCode, Int]) =>
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 8L
    }
}

@opaque @inlineOnce 
def TMessageSubtype_ID_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TMessageSubtype_ID] =
{
    require(codec.base.bitStream.validate_offset_bits(8L))

    @ghost val oldCdc = snapshot(codec)
    val pVal = codec.dec_Int_PositiveInteger_ConstSize_8()


    TMessageSubtype_ID_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TMessageSubtype_ID](l)
        case Right(_) => RightMut[ErrorCode, TMessageSubtype_ID](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TMessageSubtype_ID]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 8L && TMessageSubtype_ID_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TMessageSubtype_ID_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TMessageSubtype_ID]) =
{
    require(codec.base.bitStream.validate_offset_bits(8L))
    val cpy = snapshot(codec)
    val res = TMessageSubtype_ID_ACN_Decode(cpy)
    (cpy, res)
}