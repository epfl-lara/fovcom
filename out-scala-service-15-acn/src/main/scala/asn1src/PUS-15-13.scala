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

val maxReportsContentsSize: Int = 32 // variables:188

def TTM_15_13_ReportContent_IsConstraintValid(pVal: TTM_15_13_ReportContent): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = TCDS_AbsoluteTime_PFC_2_IsConstraintValid(pVal.oldestStoredPacketTime)
    if ret.isRight then
        ret = TCDS_AbsoluteTime_PFC_2_IsConstraintValid(pVal.newestStoredPacketTime)
        if ret.isRight then
            ret = TCDS_AbsoluteTime_PFC_2_IsConstraintValid(pVal.currentOpenRetrievalStartTimeTag)
            if ret.isRight then
                ret = TPUSC_UINT32_IsConstraintValid(pVal.percentageFilled)
                if ret.isRight then
                    ret = TPUSC_UINT32_IsConstraintValid(pVal.fromOpenRetrievalStartTimeTagPercentageFilled)
    ret
}

def TTM_15_13_ReportContent_Initialize(): TTM_15_13_ReportContent = TTM_15_13_ReportContent(oldestStoredPacketTime = TCDS_AbsoluteTime_PFC_2_Initialize(), newestStoredPacketTime = TCDS_AbsoluteTime_PFC_2_Initialize(), currentOpenRetrievalStartTimeTag = TCDS_AbsoluteTime_PFC_2_Initialize(), percentageFilled = ULong.fromRaw(0L), fromOpenRetrievalStartTimeTagPercentageFilled = ULong.fromRaw(0L))

@opaque @inlineOnce 
def TTM_15_13_ReportContent_ACN_Encode(pVal: TTM_15_13_ReportContent, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(256L))
    TTM_15_13_ReportContent_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Encode oldestStoredPacketTime */
    TCDS_AbsoluteTime_PFC_2_ACN_Encode(pVal.oldestStoredPacketTime, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 256L, 64L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 64L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_0 = pVal.oldestStoredPacketTime.size(codec_0_1.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Encode newestStoredPacketTime */
    TCDS_AbsoluteTime_PFC_2_ACN_Encode(pVal.newestStoredPacketTime, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_2.base.bitStream, codec.base.bitStream, 192L, 64L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 128L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_1 = pVal.newestStoredPacketTime.size(codec_0_2.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    @ghost val codec_0_3 = snapshot(codec)
    /* Encode currentOpenRetrievalStartTimeTag */
    TCDS_AbsoluteTime_PFC_2_ACN_Encode(pVal.currentOpenRetrievalStartTimeTag, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_3.base.bitStream, codec.base.bitStream, 128L, 64L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 192L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_2 = pVal.currentOpenRetrievalStartTimeTag.size(codec_0_3.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2)
    }
    @ghost val codec_0_4 = snapshot(codec)
    /* Encode percentageFilled */
    TPUSC_UINT32_ACN_Encode(pVal.percentageFilled, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_4.base.bitStream, codec.base.bitStream, 64L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 224L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_3 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2 + size_3)
    }
    @ghost val codec_0_5 = snapshot(codec)
    /* Encode fromOpenRetrievalStartTimeTagPercentageFilled */
    TPUSC_UINT32_ACN_Encode(pVal.fromOpenRetrievalStartTimeTagPercentageFilled, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 256L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_4 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2 + size_3 + size_4)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 256L)
    }
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0 + size_1 + size_2 + size_3 + size_4)
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
def TTM_15_13_ReportContent_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TTM_15_13_ReportContent] =
{
    require(codec.base.bitStream.validate_offset_bits(256L))

    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Decode oldestStoredPacketTime */
    val pVal_oldestStoredPacketTime = TCDS_AbsoluteTime_PFC_2_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 256L, 64L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 64L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_0 = pVal_oldestStoredPacketTime.size(codec_0_1.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Decode newestStoredPacketTime */
    val pVal_newestStoredPacketTime = TCDS_AbsoluteTime_PFC_2_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_2.base.bitStream, codec.base.bitStream, 192L, 64L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 128L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_1 = pVal_newestStoredPacketTime.size(codec_0_2.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    @ghost val codec_0_3 = snapshot(codec)
    /* Decode currentOpenRetrievalStartTimeTag */
    val pVal_currentOpenRetrievalStartTimeTag = TCDS_AbsoluteTime_PFC_2_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_3.base.bitStream, codec.base.bitStream, 128L, 64L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 192L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_2 = pVal_currentOpenRetrievalStartTimeTag.size(codec_0_3.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2)
    }
    @ghost val codec_0_4 = snapshot(codec)
    /* Decode percentageFilled */
    val pVal_percentageFilled = TPUSC_UINT32_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_4.base.bitStream, codec.base.bitStream, 64L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 224L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_3 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2 + size_3)
    }
    @ghost val codec_0_5 = snapshot(codec)
    /* Decode fromOpenRetrievalStartTimeTagPercentageFilled */
    val pVal_fromOpenRetrievalStartTimeTagPercentageFilled = TPUSC_UINT32_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 256L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_4 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2 + size_3 + size_4)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 256L)
    }
    val pVal = TTM_15_13_ReportContent(pVal_oldestStoredPacketTime, pVal_newestStoredPacketTime, pVal_currentOpenRetrievalStartTimeTag, pVal_percentageFilled, pVal_fromOpenRetrievalStartTimeTagPercentageFilled)
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0 + size_1 + size_2 + size_3 + size_4)
    }

    TTM_15_13_ReportContent_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TTM_15_13_ReportContent](l)
        case Right(_) => RightMut[ErrorCode, TTM_15_13_ReportContent](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TTM_15_13_ReportContent]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTM_15_13_ReportContent_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TTM_15_13_ReportContent_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TTM_15_13_ReportContent]) =
{
    require(codec.base.bitStream.validate_offset_bits(256L))
    val cpy = snapshot(codec)
    val res = TTM_15_13_ReportContent_ACN_Decode(cpy)
    (cpy, res)
}

def TTM_15_13_PacketStoreContentSummaryReport_reportContents_IsConstraintValid(pVal: TTM_15_13_PacketStoreContentSummaryReport_reportContents): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    var i1: Int = 0
    ret = ((1 <= pVal.nCount) && (pVal.nCount <= 32)) match
        case true =>
            Right(0)
        case false =>
            Left(45)
    if ret.isRight then
        i1 = 0
        (while(i1 < pVal.nCount && ret.isRight) {
            decreases(pVal.nCount - i1)
            ret = TTM_15_13_ReportContent_IsConstraintValid(pVal.arr(i1))
            i1 = i1 + 1
        }).invariant(0 <= i1 && i1 <= pVal.nCount)
    ret
}

def TTM_15_13_PacketStoreContentSummaryReport_IsConstraintValid(pVal: TTM_15_13_PacketStoreContentSummaryReport): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = TPacketStore_ID_IsConstraintValid(pVal.packetStore_ID)
    if ret.isRight then
        ret = TTM_15_13_PacketStoreContentSummaryReport_reportContents_IsConstraintValid(pVal.reportContents)
    ret
}

def TTM_15_13_PacketStoreContentSummaryReport_reportContents_Initialize(): TTM_15_13_PacketStoreContentSummaryReport_reportContents = TTM_15_13_PacketStoreContentSummaryReport_reportContents(1, Vector.fill(32)(TTM_15_13_ReportContent_Initialize()))
def TTM_15_13_PacketStoreContentSummaryReport_Initialize(): TTM_15_13_PacketStoreContentSummaryReport = TTM_15_13_PacketStoreContentSummaryReport(packetStore_ID = Vector.fill[UByte](32.toInt+1)(0x0.toRawUByte), reportContents = TTM_15_13_PacketStoreContentSummaryReport_reportContents_Initialize())

@opaque @inlineOnce 
def TTM_15_13_PacketStoreContentSummaryReport_ACN_Encode(pVal: TTM_15_13_PacketStoreContentSummaryReport, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(8448L))
    var i1: Int = 0
    TTM_15_13_PacketStoreContentSummaryReport_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    val TM_15_13_PacketStoreContentSummaryReport_n = ULong.fromRaw(pVal.reportContents.nCount)
    if TM_15_13_PacketStoreContentSummaryReport_n < ULong.fromRaw(1) || TM_15_13_PacketStoreContentSummaryReport_n > ULong.fromRaw(32) then
        return Left(860)
    /* Encode TM_15_13_PacketStoreContentSummaryReport_n */
    locally {
        ghostExpr {
            @opaque @inlineOnce
            def bitCountLemma(v: ULong): Unit = {
                require(v <= ULong.fromRaw(4294967295L))
            }.ensuring(_ => GetBitCountUnsigned(v) <= 4294967295L)
            bitCountLemma(TM_15_13_PacketStoreContentSummaryReport_n)
        }
    }
    codec.enc_Int_PositiveInteger_ConstSize_big_endian_32(TM_15_13_PacketStoreContentSummaryReport_n)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 8448L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_0 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Encode packetStore_ID */
    TPacketStore_ID_ACN_Encode(pVal.packetStore_ID, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_2.base.bitStream, codec.base.bitStream, 8416L, 224L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 256L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_1 = 224L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    @ghost val codec_0_3 = snapshot(codec)
    /* Encode reportContents */
    TM_15_13_PacketStoreContentSummaryReport_reportContents_ACN_Encode(codec, pVal, TM_15_13_PacketStoreContentSummaryReport_n, pVal.reportContents) match {
        case Left(l) =>
            return Left(l)
        case Right(_) =>
            ()
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 8448L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_2 = pVal.reportContents.size(codec_0_3.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 8448L)
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
def PUS_15_13_TTM_15_13_PacketStoreContentSummaryReport_reportContents_pVal_reportContents_reportContents_Encode_loop(codec: ACN, reportContents: TTM_15_13_PacketStoreContentSummaryReport_reportContents, i1: Int): Either[Int, Int] = {
    require((0 <= i1) && (i1 <= reportContents.nCount))
    require((1 <= reportContents.nCount) && (reportContents.nCount <= reportContents.arr.size) && (reportContents.arr.size <= 32))
    require(codec.base.bitStream.validate_offset_bits((256L * (reportContents.nCount - i1))))
    decreases(reportContents.nCount - i1)
    if (i1 == reportContents.nCount) {
        Right[Int, Int](0)
    } else {
        @ghost val codecSnap1 = snapshot(codec)
        ghostExpr {
            BitStream.validateOffsetBitsWeakeningLemma(codec.base.bitStream, 256L * (reportContents.nCount - i1), 256L)
        }
        TTM_15_13_ReportContent_ACN_Encode(reportContents.arr(i1), codec, false) match // uper:6
            case Right(_) =>
            case Left(err) => return Left(err)
        @ghost val codecSnap2 = snapshot(codec)
        ghostExpr {
            check(256L * (i1 + 1) == 256L * i1 + 256L)
            BitStream.validateOffsetBitsIneqLemma(codecSnap1.base.bitStream, codec.base.bitStream, 256L * (reportContents.nCount - i1), 256L)
            check(codec.base.bitStream.validate_offset_bits(256L * (reportContents.nCount - (i1 + 1))))
        }
        val res = PUS_15_13_TTM_15_13_PacketStoreContentSummaryReport_reportContents_pVal_reportContents_reportContents_Encode_loop(codec, reportContents, i1 + 1)
        ghostExpr {
            (res match {
                case Left(_) =>
                    ()
                case Right(_) =>
                    assert(codec.base.bitStream.bitIndex == codecSnap2.base.bitStream.bitIndex + TTM_15_13_PacketStoreContentSummaryReport_reportContents.sizeRange(reportContents.arr, codecSnap2.base.bitStream.bitIndex, i1 + 1, reportContents.nCount))
                    assert(codecSnap2.base.bitStream.bitIndex == codecSnap1.base.bitStream.bitIndex + reportContents.arr.apply(i1).size(codecSnap1.base.bitStream.bitIndex))
                    assert(TTM_15_13_PacketStoreContentSummaryReport_reportContents.sizeRange(reportContents.arr, codecSnap1.base.bitStream.bitIndex, i1, reportContents.nCount) == reportContents.arr.apply(i1).size(codecSnap1.base.bitStream.bitIndex) + TTM_15_13_PacketStoreContentSummaryReport_reportContents.sizeRange(reportContents.arr, codecSnap2.base.bitStream.bitIndex, i1 + 1, reportContents.nCount))
                    check(codec.base.bitStream.bitIndex == codecSnap1.base.bitStream.bitIndex + TTM_15_13_PacketStoreContentSummaryReport_reportContents.sizeRange(reportContents.arr, codecSnap1.base.bitStream.bitIndex, i1, reportContents.nCount))
            })
        }
        res
    }
}.ensuring { (res: Either[Int, Int]) => 
    res match {
        case Left(_) =>
            true
        case Right(res) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + TTM_15_13_PacketStoreContentSummaryReport_reportContents.sizeRange(reportContents.arr, old(codec).base.bitStream.bitIndex, i1, reportContents.nCount)
    }
}



@opaque @inlineOnce
def TM_15_13_PacketStoreContentSummaryReport_reportContents_ACN_Encode(codec: ACN, pVal: TTM_15_13_PacketStoreContentSummaryReport, TM_15_13_PacketStoreContentSummaryReport_n: ULong, reportContents: TTM_15_13_PacketStoreContentSummaryReport_reportContents): Either[Int, Int] = {
    require(codec.base.bitStream.validate_offset_bits(8192L))
    @ghost val oldCdc = snapshot(codec)
    TTM_15_13_PacketStoreContentSummaryReport_reportContents_IsConstraintValid(reportContents) match {
        case Left(l) =>
            return Left[Int, Int](l)
        case Right(_) =>
    }
    @ghost val codec_0_1 = snapshot(codec)
    @ghost val codecBeforeLoop_0 = snapshot(codec)
    PUS_15_13_TTM_15_13_PacketStoreContentSummaryReport_reportContents_pVal_reportContents_reportContents_Encode_loop(codec, reportContents, 0) match {
        case Left(l) =>
            return Left[Int, Int](l)
        case Right(_) =>
            ghostExpr {
                reportContents.sizeLemmaAnyOffset(codecBeforeLoop_0.base.bitStream.bitIndex, oldCdc.base.bitStream.bitIndex)
            }
    }
    Right[Int, Int](0)
}.ensuring { (res: Either[Int, Int]) => 
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + reportContents.size(old(codec).base.bitStream.bitIndex)
    }
}

@opaque @inlineOnce 
def TTM_15_13_PacketStoreContentSummaryReport_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TTM_15_13_PacketStoreContentSummaryReport] =
{
    require(codec.base.bitStream.validate_offset_bits(8448L))
    var i1: Int = 0

    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Decode TM_15_13_PacketStoreContentSummaryReport_n */
    val TM_15_13_PacketStoreContentSummaryReport_n = codec.dec_Int_PositiveInteger_ConstSize_big_endian_32()

    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 8448L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_0 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Decode packetStore_ID */
    val pVal_packetStore_ID = TPacketStore_ID_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_2.base.bitStream, codec.base.bitStream, 8416L, 224L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 256L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_1 = 224L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    @ghost val codec_0_3 = snapshot(codec)
    /* Decode reportContents */
    val pVal_reportContents = TM_15_13_PacketStoreContentSummaryReport_reportContents_ACN_Decode(codec, TM_15_13_PacketStoreContentSummaryReport_n) match {
        case LeftMut(l) =>
            return LeftMut(l)
        case RightMut(v) =>
            v
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 8448L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_2 = pVal_reportContents.size(codec_0_3.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 8448L)
    }
    val pVal = TTM_15_13_PacketStoreContentSummaryReport(pVal_packetStore_ID, pVal_reportContents)
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0 + size_1 + size_2)
    }

    TTM_15_13_PacketStoreContentSummaryReport_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TTM_15_13_PacketStoreContentSummaryReport](l)
        case Right(_) => RightMut[ErrorCode, TTM_15_13_PacketStoreContentSummaryReport](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TTM_15_13_PacketStoreContentSummaryReport]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTM_15_13_PacketStoreContentSummaryReport_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TTM_15_13_PacketStoreContentSummaryReport_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TTM_15_13_PacketStoreContentSummaryReport]) =
{
    require(codec.base.bitStream.validate_offset_bits(8448L))
    val cpy = snapshot(codec)
    val res = TTM_15_13_PacketStoreContentSummaryReport_ACN_Decode(cpy)
    (cpy, res)
}

@opaque @inlineOnce
def PUS_15_13_TTM_15_13_PacketStoreContentSummaryReport_reportContents_pVal_reportContents_reportContents_Decode_loop(codec: ACN, nCount: Int, reportContents: Vector[TTM_15_13_ReportContent], i1: Int): EitherMut[Int, Vector[TTM_15_13_ReportContent]] = {
    require((1 <= nCount) && (nCount <= 32))
    require((0 <= i1) && (i1 <= nCount))
    require(reportContents.size == i1)
    require(codec.base.bitStream.validate_offset_bits((256L * (nCount - i1))))
    decreases(nCount - i1)
    @ghost val codecSnap1 = snapshot(codec)
    (if (i1 == nCount) {
        ghostExpr {
            vecRangesEqReflexiveLemma(reportContents)
            vecRangesEqSlicedLemma(reportContents, reportContents, 0, reportContents.size, 0, i1)
        }
        RightMut[Int, Vector[TTM_15_13_ReportContent]](reportContents)
    } else {
        ghostExpr {
            BitStream.validateOffsetBitsWeakeningLemma(codec.base.bitStream, 256L * (nCount - i1), 256L)
        }
        val reportContents_arr_i1_ = TTM_15_13_ReportContent_ACN_Decode(codec) match // uper:13
            case RightMut(decData) => decData
            case LeftMut(err) => return LeftMut(err)
        @ghost val codecSnap2 = snapshot(codec)
        ghostExpr {
            check(256L * (i1 + 1) == 256L * i1 + 256L)
            BitStream.validateOffsetBitsIneqLemma(codecSnap1.base.bitStream, codec.base.bitStream, 256L * (nCount - i1), 256L)
            check(codec.base.bitStream.validate_offset_bits(256L * (nCount - (i1 + 1))))
        }
        val res = PUS_15_13_TTM_15_13_PacketStoreContentSummaryReport_reportContents_pVal_reportContents_reportContents_Decode_loop(codec, nCount, reportContents.append(reportContents_arr_i1_), i1 + 1)
        ghostExpr {
            (res match {
                case LeftMut(_) =>
                    ()
                case RightMut(newVec) =>
                    vecRangesAppendDropEq(reportContents, newVec, reportContents_arr_i1_, 0, i1)
                    vecRangesEqImpliesEq(reportContents.append(reportContents_arr_i1_), newVec, 0, i1, i1 + 1)
                    ListSpecs.isnocIndex(reportContents.list, reportContents_arr_i1_, i1)
                    Vector.listApplyEqVecApply(reportContents.append(reportContents_arr_i1_), i1)
                    check(reportContents_arr_i1_ == newVec.apply(i1))
            })
        }
        res
    })
}.ensuring { (res: EitherMut[Int, Vector[TTM_15_13_ReportContent]]) => 
    res match {
        case LeftMut(_) =>
            true
        case RightMut(newVec) =>
            old(codec).base.buf == codec.base.buf && newVec.size == nCount && vecRangesEq(reportContents, newVec, 0, i1) && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + TTM_15_13_PacketStoreContentSummaryReport_reportContents.sizeRange(newVec, old(codec).base.bitStream.bitIndex, i1, nCount)
    }
}



@opaque @inlineOnce
def TM_15_13_PacketStoreContentSummaryReport_reportContents_ACN_Decode(codec: ACN, TM_15_13_PacketStoreContentSummaryReport_n: ULong): EitherMut[Int, TTM_15_13_PacketStoreContentSummaryReport_reportContents] = {
    require(codec.base.bitStream.validate_offset_bits(8192L))
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    val reportContents =
        if ((ULong.fromRaw(1) <= TM_15_13_PacketStoreContentSummaryReport_n) && (TM_15_13_PacketStoreContentSummaryReport_n <= ULong.fromRaw(32))) then
            val reportContents_nCount = TM_15_13_PacketStoreContentSummaryReport_n.toRaw.toInt
            @ghost val codecBeforeLoop_0 = snapshot(codec)
            val reportContents = PUS_15_13_TTM_15_13_PacketStoreContentSummaryReport_reportContents_pVal_reportContents_reportContents_Decode_loop(codec, reportContents_nCount, Vector.empty[TTM_15_13_ReportContent], 0) match {
                case LeftMut(l) =>
                    return LeftMut(l)
                case RightMut(bdg) =>
                    val reportContents = TTM_15_13_PacketStoreContentSummaryReport_reportContents(reportContents_nCount, bdg)
                    ghostExpr {
                        reportContents.sizeLemmaAnyOffset(codecBeforeLoop_0.base.bitStream.bitIndex, oldCdc.base.bitStream.bitIndex)
                    }
                    reportContents
            }
            reportContents
        else return LeftMut(ERR_ACN_DECODE_TM_15_13_PACKETSTORECONTENTSUMMARYREPORT_REPORTCONTENTS)
    TTM_15_13_PacketStoreContentSummaryReport_reportContents_IsConstraintValid(reportContents) match {
        case Left(l) =>
            LeftMut[Int, TTM_15_13_PacketStoreContentSummaryReport_reportContents](l)
        case Right(_) =>
            RightMut[Int, TTM_15_13_PacketStoreContentSummaryReport_reportContents](reportContents)
    }
}.ensuring { (res: EitherMut[Int, TTM_15_13_PacketStoreContentSummaryReport_reportContents]) => 
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTM_15_13_PacketStoreContentSummaryReport_reportContents_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure
def TM_15_13_PacketStoreContentSummaryReport_reportContents_ACN_Decode_pure(codec: ACN, TM_15_13_PacketStoreContentSummaryReport_n: ULong): (ACN, EitherMut[Int, TTM_15_13_PacketStoreContentSummaryReport_reportContents]) = {
    require(codec.base.bitStream.validate_offset_bits(8192L))
    val cpy = snapshot(codec)
    val res = TM_15_13_PacketStoreContentSummaryReport_reportContents_ACN_Decode(cpy, TM_15_13_PacketStoreContentSummaryReport_n)
    (cpy, res)
}