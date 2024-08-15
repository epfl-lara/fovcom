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


def TTM_15_40_EventReportBlockingStorage_ControlConfigurationContentReport_IsConstraintValid(pVal: TTM_15_40_EventReportBlockingStorage_ControlConfigurationContentReport): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = TStorage_ControlEventReportBlocking_IsConstraintValid(pVal.storage_ControlEventReportBlocking)
    ret
}

def TTM_15_40_EventReportBlockingStorage_ControlConfigurationContentReport_Initialize(): TTM_15_40_EventReportBlockingStorage_ControlConfigurationContentReport = TTM_15_40_EventReportBlockingStorage_ControlConfigurationContentReport(storage_ControlEventReportBlocking = TStorage_ControlEventReportBlocking_Initialize())

@opaque @inlineOnce 
def TTM_15_40_EventReportBlockingStorage_ControlConfigurationContentReport_ACN_Encode(pVal: TTM_15_40_EventReportBlockingStorage_ControlConfigurationContentReport, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(32372L))
    TTM_15_40_EventReportBlockingStorage_ControlConfigurationContentReport_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Encode storage_ControlEventReportBlocking */
    TStorage_ControlEventReportBlocking_ACN_Encode(pVal.storage_ControlEventReportBlocking, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32372L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_0 = pVal.storage_ControlEventReportBlocking.size(codec_0_1.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 32372L)
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
def TTM_15_40_EventReportBlockingStorage_ControlConfigurationContentReport_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TTM_15_40_EventReportBlockingStorage_ControlConfigurationContentReport] =
{
    require(codec.base.bitStream.validate_offset_bits(32372L))

    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Decode storage_ControlEventReportBlocking */
    val pVal_storage_ControlEventReportBlocking = TStorage_ControlEventReportBlocking_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32372L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_0 = pVal_storage_ControlEventReportBlocking.size(codec_0_1.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 32372L)
    }
    val pVal = TTM_15_40_EventReportBlockingStorage_ControlConfigurationContentReport(pVal_storage_ControlEventReportBlocking)
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0)
    }

    TTM_15_40_EventReportBlockingStorage_ControlConfigurationContentReport_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TTM_15_40_EventReportBlockingStorage_ControlConfigurationContentReport](l)
        case Right(_) => RightMut[ErrorCode, TTM_15_40_EventReportBlockingStorage_ControlConfigurationContentReport](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TTM_15_40_EventReportBlockingStorage_ControlConfigurationContentReport]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTM_15_40_EventReportBlockingStorage_ControlConfigurationContentReport_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TTM_15_40_EventReportBlockingStorage_ControlConfigurationContentReport_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TTM_15_40_EventReportBlockingStorage_ControlConfigurationContentReport]) =
{
    require(codec.base.bitStream.validate_offset_bits(32372L))
    val cpy = snapshot(codec)
    val res = TTM_15_40_EventReportBlockingStorage_ControlConfigurationContentReport_ACN_Decode(cpy)
    (cpy, res)
}