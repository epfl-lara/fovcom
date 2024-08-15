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


def TSpacecraftTimeReferenceStatus_IsConstraintValid(pVal: TSpacecraftTimeReferenceStatus): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = (pVal <= ULong.fromRaw(15L)) match
        case true =>
            Right(0)
        case false =>
            Left(45)
    ret
}

def TSpacecraftTimeReferenceStatus_Initialize(): TSpacecraftTimeReferenceStatus = ULong.fromRaw(0L)

@opaque @inlineOnce 
def TSpacecraftTimeReferenceStatus_ACN_Encode(pVal: TSpacecraftTimeReferenceStatus, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(4L))
    TSpacecraftTimeReferenceStatus_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    locally {
        ghostExpr {
            @opaque @inlineOnce
            def bitCountLemma(v: ULong): Unit = {
                require(v <= ULong.fromRaw(15))
            }.ensuring(_ => GetBitCountUnsigned(v) <= 4)
            bitCountLemma(pVal)
        }
    }
    codec.enc_Int_PositiveInteger_ConstSize(pVal, 4)
    Right(0)
}.ensuring { (res : Either[ErrorCode, Int]) =>
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 4L
    }
}

@opaque @inlineOnce 
def TSpacecraftTimeReferenceStatus_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TSpacecraftTimeReferenceStatus] =
{
    require(codec.base.bitStream.validate_offset_bits(4L))

    @ghost val oldCdc = snapshot(codec)
    val pVal = codec.dec_Int_PositiveInteger_ConstSize(4)


    TSpacecraftTimeReferenceStatus_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TSpacecraftTimeReferenceStatus](l)
        case Right(_) => RightMut[ErrorCode, TSpacecraftTimeReferenceStatus](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TSpacecraftTimeReferenceStatus]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 4L && TSpacecraftTimeReferenceStatus_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TSpacecraftTimeReferenceStatus_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TSpacecraftTimeReferenceStatus]) =
{
    require(codec.base.bitStream.validate_offset_bits(4L))
    val cpy = snapshot(codec)
    val res = TSpacecraftTimeReferenceStatus_ACN_Decode(cpy)
    (cpy, res)
}