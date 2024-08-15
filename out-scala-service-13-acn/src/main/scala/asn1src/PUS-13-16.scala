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


def TLargePacketFailureReason_IsConstraintValid(pVal: TLargePacketFailureReason): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = (pVal == TLargePacketFailureReason.TfailureReason) match
        case true =>
            Right(0)
        case false =>
            Left(45)
    ret
}

def TLargePacketFailureReason_Initialize(): TLargePacketFailureReason = TLargePacketFailureReason.TfailureReason

@opaque @inlineOnce 
def TLargePacketFailureReason_ACN_Encode(pVal: TLargePacketFailureReason, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(32L))
    TLargePacketFailureReason_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    val intVal_pVal = pVal match
        case TLargePacketFailureReason.TfailureReason => ULong.fromRaw(0L)

    locally {
        ghostExpr {
            @opaque @inlineOnce
            def bitCountLemma(v: ULong): Unit = {
                require(v <= ULong.fromRaw(0))
            }.ensuring(_ => GetBitCountUnsigned(v) <= 4294967295L)
            bitCountLemma(intVal_pVal)
        }
    }
    codec.enc_Int_PositiveInteger_ConstSize_big_endian_32(intVal_pVal)
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
def TLargePacketFailureReason_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TLargePacketFailureReason] =
{
    require(codec.base.bitStream.validate_offset_bits(32L))

    @ghost val oldCdc = snapshot(codec)
    val intVal_pVal = codec.dec_Int_PositiveInteger_ConstSize_big_endian_32()

    val pVal = intVal_pVal.toRaw match
        case 0 => TLargePacketFailureReason.TfailureReason
        case _ => return LeftMut(ERR_ACN_DECODE_LARGEPACKETFAILUREREASON)

    TLargePacketFailureReason_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TLargePacketFailureReason](l)
        case Right(_) => RightMut[ErrorCode, TLargePacketFailureReason](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TLargePacketFailureReason]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 32L && TLargePacketFailureReason_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TLargePacketFailureReason_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TLargePacketFailureReason]) =
{
    require(codec.base.bitStream.validate_offset_bits(32L))
    val cpy = snapshot(codec)
    val res = TLargePacketFailureReason_ACN_Decode(cpy)
    (cpy, res)
}

def TTM_13_16_LargePacketUplinkAbortionReport_IsConstraintValid(pVal: TTM_13_16_LargePacketUplinkAbortionReport): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = TPUSC_UINT32_IsConstraintValid(pVal.largeMessageTransactionIdentifier)
    if ret.isRight then
        ret = TLargePacketFailureReason_IsConstraintValid(pVal.largePacketFailureReason)
    ret
}

def TTM_13_16_LargePacketUplinkAbortionReport_Initialize(): TTM_13_16_LargePacketUplinkAbortionReport = TTM_13_16_LargePacketUplinkAbortionReport(largeMessageTransactionIdentifier = ULong.fromRaw(0L), largePacketFailureReason = TLargePacketFailureReason.TfailureReason)

@opaque @inlineOnce 
def TTM_13_16_LargePacketUplinkAbortionReport_ACN_Encode(pVal: TTM_13_16_LargePacketUplinkAbortionReport, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(64L))
    TTM_13_16_LargePacketUplinkAbortionReport_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Encode largeMessageTransactionIdentifier */
    TPUSC_UINT32_ACN_Encode(pVal.largeMessageTransactionIdentifier, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 64L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_0 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Encode largePacketFailureReason */
    TLargePacketFailureReason_ACN_Encode(pVal.largePacketFailureReason, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 64L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_1 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 64L)
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
def TTM_13_16_LargePacketUplinkAbortionReport_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TTM_13_16_LargePacketUplinkAbortionReport] =
{
    require(codec.base.bitStream.validate_offset_bits(64L))

    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Decode largeMessageTransactionIdentifier */
    val pVal_largeMessageTransactionIdentifier = TPUSC_UINT32_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 64L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_0 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Decode largePacketFailureReason */
    val pVal_largePacketFailureReason = TLargePacketFailureReason_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 64L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_1 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 64L)
    }
    val pVal = TTM_13_16_LargePacketUplinkAbortionReport(pVal_largeMessageTransactionIdentifier, pVal_largePacketFailureReason)
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0 + size_1)
    }

    TTM_13_16_LargePacketUplinkAbortionReport_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TTM_13_16_LargePacketUplinkAbortionReport](l)
        case Right(_) => RightMut[ErrorCode, TTM_13_16_LargePacketUplinkAbortionReport](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TTM_13_16_LargePacketUplinkAbortionReport]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTM_13_16_LargePacketUplinkAbortionReport_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TTM_13_16_LargePacketUplinkAbortionReport_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TTM_13_16_LargePacketUplinkAbortionReport]) =
{
    require(codec.base.bitStream.validate_offset_bits(64L))
    val cpy = snapshot(codec)
    val res = TTM_13_16_LargePacketUplinkAbortionReport_ACN_Decode(cpy)
    (cpy, res)
}