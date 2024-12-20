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


def TTM_1_8_FailedCompletionOfExecutionVerificationReport_IsConstraintValid(pVal: TTM_1_8_FailedCompletionOfExecutionVerificationReport): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = TVerificationRequest_ID_IsConstraintValid(pVal.request_ID)
    if ret.isRight then
        ret = TExecutionCompletionFailureNotice_IsConstraintValid(pVal.failureNotice)
    ret
}

def TTM_1_8_FailedCompletionOfExecutionVerificationReport_Initialize(): TTM_1_8_FailedCompletionOfExecutionVerificationReport = TTM_1_8_FailedCompletionOfExecutionVerificationReport(request_ID = TVerificationRequest_ID_Initialize(), failureNotice = TExecutionCompletionFailureNotice_Initialize())

@opaque @inlineOnce 
def TTM_1_8_FailedCompletionOfExecutionVerificationReport_ACN_Encode(pVal: TTM_1_8_FailedCompletionOfExecutionVerificationReport, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(33L))
    TTM_1_8_FailedCompletionOfExecutionVerificationReport_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Encode request_ID */
    TVerificationRequest_ID_ACN_Encode(pVal.request_ID, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 33L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_0 = pVal.request_ID.size(codec_0_1.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Encode failureNotice */
    TExecutionCompletionFailureNotice_ACN_Encode(pVal.failureNotice, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 33L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_1 = pVal.failureNotice.size(codec_0_2.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 33L)
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
def TTM_1_8_FailedCompletionOfExecutionVerificationReport_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TTM_1_8_FailedCompletionOfExecutionVerificationReport] =
{
    require(codec.base.bitStream.validate_offset_bits(33L))

    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Decode request_ID */
    val pVal_request_ID = TVerificationRequest_ID_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 33L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_0 = pVal_request_ID.size(codec_0_1.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Decode failureNotice */
    val pVal_failureNotice = TExecutionCompletionFailureNotice_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 33L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_1 = pVal_failureNotice.size(codec_0_2.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 33L)
    }
    val pVal = TTM_1_8_FailedCompletionOfExecutionVerificationReport(pVal_request_ID, pVal_failureNotice)
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0 + size_1)
    }

    TTM_1_8_FailedCompletionOfExecutionVerificationReport_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TTM_1_8_FailedCompletionOfExecutionVerificationReport](l)
        case Right(_) => RightMut[ErrorCode, TTM_1_8_FailedCompletionOfExecutionVerificationReport](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TTM_1_8_FailedCompletionOfExecutionVerificationReport]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTM_1_8_FailedCompletionOfExecutionVerificationReport_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TTM_1_8_FailedCompletionOfExecutionVerificationReport_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TTM_1_8_FailedCompletionOfExecutionVerificationReport]) =
{
    require(codec.base.bitStream.validate_offset_bits(33L))
    val cpy = snapshot(codec)
    val res = TTM_1_8_FailedCompletionOfExecutionVerificationReport_ACN_Decode(cpy)
    (cpy, res)
}