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


def TTM_2_9_PhysicalDeviceDataReport_IsConstraintValid(pVal: TTM_2_9_PhysicalDeviceDataReport): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = TPUSC_UINT32_IsConstraintValid(pVal.transaction_ID)
    if ret.isRight then
        ret = TTransactionExecutionStatus_IsConstraintValid(pVal.transactionExecutionStatus)
        if ret.isRight then
            ret = TDummyType_IsConstraintValid(pVal.dataBlock)
    ret
}

def TTM_2_9_PhysicalDeviceDataReport_Initialize(): TTM_2_9_PhysicalDeviceDataReport = TTM_2_9_PhysicalDeviceDataReport(transaction_ID = ULong.fromRaw(0L), transactionExecutionStatus = TTransactionExecutionStatus_Initialize(), dataBlock = ULong.fromRaw(15L))

@opaque @inlineOnce 
def TTM_2_9_PhysicalDeviceDataReport_ACN_Encode(pVal: TTM_2_9_PhysicalDeviceDataReport, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(68L))
    TTM_2_9_PhysicalDeviceDataReport_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Encode transaction_ID */
    TPUSC_UINT32_ACN_Encode(pVal.transaction_ID, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 68L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_0 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Encode transactionExecutionStatus */
    TTransactionExecutionStatus_ACN_Encode(pVal.transactionExecutionStatus, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_2.base.bitStream, codec.base.bitStream, 36L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 64L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_1 = pVal.transactionExecutionStatus.size(codec_0_2.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    @ghost val codec_0_3 = snapshot(codec)
    /* Encode dataBlock */
    TDummyType_ACN_Encode(pVal.dataBlock, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 68L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_2 = 4L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 68L)
    }
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0 + size_1 + size_2)
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
def TTM_2_9_PhysicalDeviceDataReport_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TTM_2_9_PhysicalDeviceDataReport] =
{
    require(codec.base.bitStream.validate_offset_bits(68L))

    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Decode transaction_ID */
    val pVal_transaction_ID = TPUSC_UINT32_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 68L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_0 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Decode transactionExecutionStatus */
    val pVal_transactionExecutionStatus = TTransactionExecutionStatus_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_2.base.bitStream, codec.base.bitStream, 36L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 64L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_1 = pVal_transactionExecutionStatus.size(codec_0_2.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    @ghost val codec_0_3 = snapshot(codec)
    /* Decode dataBlock */
    val pVal_dataBlock = TDummyType_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 68L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_2 = 4L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 68L)
    }
    val pVal = TTM_2_9_PhysicalDeviceDataReport(pVal_transaction_ID, pVal_transactionExecutionStatus, pVal_dataBlock)
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0 + size_1 + size_2)
    }

    TTM_2_9_PhysicalDeviceDataReport_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TTM_2_9_PhysicalDeviceDataReport](l)
        case Right(_) => RightMut[ErrorCode, TTM_2_9_PhysicalDeviceDataReport](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TTM_2_9_PhysicalDeviceDataReport]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTM_2_9_PhysicalDeviceDataReport_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TTM_2_9_PhysicalDeviceDataReport_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TTM_2_9_PhysicalDeviceDataReport]) =
{
    require(codec.base.bitStream.validate_offset_bits(68L))
    val cpy = snapshot(codec)
    val res = TTM_2_9_PhysicalDeviceDataReport_ACN_Decode(cpy)
    (cpy, res)
}