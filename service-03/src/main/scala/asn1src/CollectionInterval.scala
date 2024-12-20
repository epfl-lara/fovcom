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


def TCollectionInterval_IsConstraintValid(pVal: TCollectionInterval): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = TPUSC_UINT32_IsConstraintValid(pVal)
    ret
}

def TCollectionInterval_Initialize(): TCollectionInterval = ULong.fromRaw(0L)

@opaque @inlineOnce 
def TCollectionInterval_ACN_Encode(pVal: TCollectionInterval, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(32L))
    TCollectionInterval_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    TPUSC_UINT32_ACN_Encode(pVal, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
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
def TCollectionInterval_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TCollectionInterval] =
{
    require(codec.base.bitStream.validate_offset_bits(32L))

    @ghost val oldCdc = snapshot(codec)
    val pVal = TPUSC_UINT32_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)

    TCollectionInterval_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TCollectionInterval](l)
        case Right(_) => RightMut[ErrorCode, TCollectionInterval](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TCollectionInterval]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 32L && TCollectionInterval_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TCollectionInterval_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TCollectionInterval]) =
{
    require(codec.base.bitStream.validate_offset_bits(32L))
    val cpy = snapshot(codec)
    val res = TCollectionInterval_ACN_Decode(cpy)
    (cpy, res)
}