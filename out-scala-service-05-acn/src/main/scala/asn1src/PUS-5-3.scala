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


def TTM_5_3_MediumSeverityAnomalyReport_IsConstraintValid(pVal: TTM_5_3_MediumSeverityAnomalyReport): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = TEventDefinition_ID_IsConstraintValid(pVal.eventDefinition_ID)
    if ret.isRight then
        ret = TDummyType_IsConstraintValid(pVal.auxiliaryData)
    ret
}

def TTM_5_3_MediumSeverityAnomalyReport_Initialize(): TTM_5_3_MediumSeverityAnomalyReport = TTM_5_3_MediumSeverityAnomalyReport(eventDefinition_ID = ULong.fromRaw(0L), auxiliaryData = ULong.fromRaw(15L))

@opaque @inlineOnce 
def TTM_5_3_MediumSeverityAnomalyReport_ACN_Encode(pVal: TTM_5_3_MediumSeverityAnomalyReport, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(36L))
    TTM_5_3_MediumSeverityAnomalyReport_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Encode eventDefinition_ID */
    TEventDefinition_ID_ACN_Encode(pVal.eventDefinition_ID, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 36L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_0 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Encode auxiliaryData */
    TDummyType_ACN_Encode(pVal.auxiliaryData, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 36L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_1 = 4L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 36L)
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
def TTM_5_3_MediumSeverityAnomalyReport_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TTM_5_3_MediumSeverityAnomalyReport] =
{
    require(codec.base.bitStream.validate_offset_bits(36L))

    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Decode eventDefinition_ID */
    val pVal_eventDefinition_ID = TEventDefinition_ID_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 36L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_0 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Decode auxiliaryData */
    val pVal_auxiliaryData = TDummyType_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 36L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_1 = 4L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 36L)
    }
    val pVal = TTM_5_3_MediumSeverityAnomalyReport(pVal_eventDefinition_ID, pVal_auxiliaryData)
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0 + size_1)
    }

    TTM_5_3_MediumSeverityAnomalyReport_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TTM_5_3_MediumSeverityAnomalyReport](l)
        case Right(_) => RightMut[ErrorCode, TTM_5_3_MediumSeverityAnomalyReport](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TTM_5_3_MediumSeverityAnomalyReport]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTM_5_3_MediumSeverityAnomalyReport_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TTM_5_3_MediumSeverityAnomalyReport_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TTM_5_3_MediumSeverityAnomalyReport]) =
{
    require(codec.base.bitStream.validate_offset_bits(36L))
    val cpy = snapshot(codec)
    val res = TTM_5_3_MediumSeverityAnomalyReport_ACN_Decode(cpy)
    (cpy, res)
}