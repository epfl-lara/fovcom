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


def TTC_13_11_UplinkTheLastPart_IsConstraintValid(pVal: TTC_13_11_UplinkTheLastPart): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = TUplinkMessagePart_IsConstraintValid(pVal.messagePart)
    ret
}

def TTC_13_11_UplinkTheLastPart_Initialize(): TTC_13_11_UplinkTheLastPart = TTC_13_11_UplinkTheLastPart(messagePart = TUplinkMessagePart_Initialize())

@opaque @inlineOnce 
def TTC_13_11_UplinkTheLastPart_ACN_Encode(pVal: TTC_13_11_UplinkTheLastPart, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(8256L))
    TTC_13_11_UplinkTheLastPart_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Encode messagePart */
    TUplinkMessagePart_ACN_Encode(pVal.messagePart, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 8256L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_0 = pVal.messagePart.size(codec_0_1.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 8256L)
    }
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0)
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
def TTC_13_11_UplinkTheLastPart_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TTC_13_11_UplinkTheLastPart] =
{
    require(codec.base.bitStream.validate_offset_bits(8256L))

    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Decode messagePart */
    val pVal_messagePart = TUplinkMessagePart_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 8256L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_0 = pVal_messagePart.size(codec_0_1.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 8256L)
    }
    val pVal = TTC_13_11_UplinkTheLastPart(pVal_messagePart)
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0)
    }

    TTC_13_11_UplinkTheLastPart_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TTC_13_11_UplinkTheLastPart](l)
        case Right(_) => RightMut[ErrorCode, TTC_13_11_UplinkTheLastPart](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TTC_13_11_UplinkTheLastPart]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTC_13_11_UplinkTheLastPart_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TTC_13_11_UplinkTheLastPart_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TTC_13_11_UplinkTheLastPart]) =
{
    require(codec.base.bitStream.validate_offset_bits(8256L))
    val cpy = snapshot(codec)
    val res = TTC_13_11_UplinkTheLastPart_ACN_Decode(cpy)
    (cpy, res)
}