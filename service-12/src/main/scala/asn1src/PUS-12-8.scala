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


def TTC_12_8_ReportParameterMonitoringDefinitions_IsConstraintValid(pVal: TTC_12_8_ReportParameterMonitoringDefinitions): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = TPMON_ID_IsConstraintValid(pVal.pmon_ID)
    ret
}

def TTC_12_8_ReportParameterMonitoringDefinitions_Initialize(): TTC_12_8_ReportParameterMonitoringDefinitions = TTC_12_8_ReportParameterMonitoringDefinitions(pmon_ID = TPMON_ID.Tparam0)

@opaque @inlineOnce 
def TTC_12_8_ReportParameterMonitoringDefinitions_ACN_Encode(pVal: TTC_12_8_ReportParameterMonitoringDefinitions, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(32L))
    TTC_12_8_ReportParameterMonitoringDefinitions_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Encode pmon_ID */
    TPMON_ID_ACN_Encode(pVal.pmon_ID, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_0 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 32L)
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
def TTC_12_8_ReportParameterMonitoringDefinitions_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TTC_12_8_ReportParameterMonitoringDefinitions] =
{
    require(codec.base.bitStream.validate_offset_bits(32L))

    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Decode pmon_ID */
    val pVal_pmon_ID = TPMON_ID_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_0 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 32L)
    }
    val pVal = TTC_12_8_ReportParameterMonitoringDefinitions(pVal_pmon_ID)
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0)
    }

    TTC_12_8_ReportParameterMonitoringDefinitions_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TTC_12_8_ReportParameterMonitoringDefinitions](l)
        case Right(_) => RightMut[ErrorCode, TTC_12_8_ReportParameterMonitoringDefinitions](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TTC_12_8_ReportParameterMonitoringDefinitions]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTC_12_8_ReportParameterMonitoringDefinitions_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TTC_12_8_ReportParameterMonitoringDefinitions_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TTC_12_8_ReportParameterMonitoringDefinitions]) =
{
    require(codec.base.bitStream.validate_offset_bits(32L))
    val cpy = snapshot(codec)
    val res = TTC_12_8_ReportParameterMonitoringDefinitions_ACN_Decode(cpy)
    (cpy, res)
}