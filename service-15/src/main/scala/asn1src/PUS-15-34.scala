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


def TTC_15_34_AddEventDefinitionIdentifiersToTheEventReportBlockingStorage_ControlConfiguration_IsConstraintValid(pVal: TTC_15_34_AddEventDefinitionIdentifiersToTheEventReportBlockingStorage_ControlConfiguration): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = TStorage_ControlEventReportBlocking_IsConstraintValid(pVal.storage_ControlEventReportBlocking)
    ret
}

def TTC_15_34_AddEventDefinitionIdentifiersToTheEventReportBlockingStorage_ControlConfiguration_Initialize(): TTC_15_34_AddEventDefinitionIdentifiersToTheEventReportBlockingStorage_ControlConfiguration = TTC_15_34_AddEventDefinitionIdentifiersToTheEventReportBlockingStorage_ControlConfiguration(storage_ControlEventReportBlocking = TStorage_ControlEventReportBlocking_Initialize())

@opaque @inlineOnce 
def TTC_15_34_AddEventDefinitionIdentifiersToTheEventReportBlockingStorage_ControlConfiguration_ACN_Encode(pVal: TTC_15_34_AddEventDefinitionIdentifiersToTheEventReportBlockingStorage_ControlConfiguration, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(32372L))
    TTC_15_34_AddEventDefinitionIdentifiersToTheEventReportBlockingStorage_ControlConfiguration_IsConstraintValid(pVal) match
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
def TTC_15_34_AddEventDefinitionIdentifiersToTheEventReportBlockingStorage_ControlConfiguration_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TTC_15_34_AddEventDefinitionIdentifiersToTheEventReportBlockingStorage_ControlConfiguration] =
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
    val pVal = TTC_15_34_AddEventDefinitionIdentifiersToTheEventReportBlockingStorage_ControlConfiguration(pVal_storage_ControlEventReportBlocking)
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0)
    }

    TTC_15_34_AddEventDefinitionIdentifiersToTheEventReportBlockingStorage_ControlConfiguration_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TTC_15_34_AddEventDefinitionIdentifiersToTheEventReportBlockingStorage_ControlConfiguration](l)
        case Right(_) => RightMut[ErrorCode, TTC_15_34_AddEventDefinitionIdentifiersToTheEventReportBlockingStorage_ControlConfiguration](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TTC_15_34_AddEventDefinitionIdentifiersToTheEventReportBlockingStorage_ControlConfiguration]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTC_15_34_AddEventDefinitionIdentifiersToTheEventReportBlockingStorage_ControlConfiguration_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TTC_15_34_AddEventDefinitionIdentifiersToTheEventReportBlockingStorage_ControlConfiguration_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TTC_15_34_AddEventDefinitionIdentifiersToTheEventReportBlockingStorage_ControlConfiguration]) =
{
    require(codec.base.bitStream.validate_offset_bits(32372L))
    val cpy = snapshot(codec)
    val res = TTC_15_34_AddEventDefinitionIdentifiersToTheEventReportBlockingStorage_ControlConfiguration_ACN_Decode(cpy)
    (cpy, res)
}