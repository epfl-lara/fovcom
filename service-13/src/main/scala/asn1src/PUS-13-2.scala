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


def TTM_13_2_IntermediateDownlinkPartReport_IsConstraintValid(pVal: TTM_13_2_IntermediateDownlinkPartReport): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = TDownlinkMessagePart_IsConstraintValid(pVal.messagePart)
    ret
}

def TTM_13_2_IntermediateDownlinkPartReport_Initialize(): TTM_13_2_IntermediateDownlinkPartReport = TTM_13_2_IntermediateDownlinkPartReport(messagePart = TDownlinkMessagePart_Initialize())

@opaque @inlineOnce 
def TTM_13_2_IntermediateDownlinkPartReport_ACN_Encode(pVal: TTM_13_2_IntermediateDownlinkPartReport, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(8256L))
    TTM_13_2_IntermediateDownlinkPartReport_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Encode messagePart */
    TDownlinkMessagePart_ACN_Encode(pVal.messagePart, codec, false) match // uper:6
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
def TTM_13_2_IntermediateDownlinkPartReport_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TTM_13_2_IntermediateDownlinkPartReport] =
{
    require(codec.base.bitStream.validate_offset_bits(8256L))

    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Decode messagePart */
    val pVal_messagePart = TDownlinkMessagePart_ACN_Decode(codec) match // uper:13
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
    val pVal = TTM_13_2_IntermediateDownlinkPartReport(pVal_messagePart)
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0)
    }

    TTM_13_2_IntermediateDownlinkPartReport_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TTM_13_2_IntermediateDownlinkPartReport](l)
        case Right(_) => RightMut[ErrorCode, TTM_13_2_IntermediateDownlinkPartReport](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TTM_13_2_IntermediateDownlinkPartReport]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTM_13_2_IntermediateDownlinkPartReport_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TTM_13_2_IntermediateDownlinkPartReport_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TTM_13_2_IntermediateDownlinkPartReport]) =
{
    require(codec.base.bitStream.validate_offset_bits(8256L))
    val cpy = snapshot(codec)
    val res = TTM_13_2_IntermediateDownlinkPartReport_ACN_Decode(cpy)
    (cpy, res)
}