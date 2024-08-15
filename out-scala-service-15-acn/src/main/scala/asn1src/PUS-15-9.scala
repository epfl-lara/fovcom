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

val maxPacketRetrievalTimeRangeSettingsSize: Int = 32 // variables:188

def TTC_15_9_PacketRetrievalTimeRangeSetting_IsConstraintValid(pVal: TTC_15_9_PacketRetrievalTimeRangeSetting): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = TPacketStore_ID_IsConstraintValid(pVal.packetStore_ID)
    if ret.isRight then
        pVal.retrievalPriority match
            case SomeMut(retrievalPriority) =>
                ret = TPacketStoreRetrievalPriority_IsConstraintValid(retrievalPriority)
            case NoneMut() =>
        if ret.isRight then
            ret = TCDS_AbsoluteTime_PFC_2_IsConstraintValid(pVal.fromTime)
            if ret.isRight then
                ret = TCDS_AbsoluteTime_PFC_2_IsConstraintValid(pVal.toTime)
    ret
}

def TTC_15_9_PacketRetrievalTimeRangeSetting_Initialize(): TTC_15_9_PacketRetrievalTimeRangeSetting = TTC_15_9_PacketRetrievalTimeRangeSetting(packetStore_ID = Vector.fill[UByte](32.toInt+1)(0x0.toRawUByte), retrievalPriority = SomeMut(TPacketStoreRetrievalPriority.TPacketStoreRetrievalPriority_val0), fromTime = TCDS_AbsoluteTime_PFC_2_Initialize(), toTime = TCDS_AbsoluteTime_PFC_2_Initialize())

@opaque @inlineOnce 
def TTC_15_9_PacketRetrievalTimeRangeSetting_ACN_Encode(pVal: TTC_15_9_PacketRetrievalTimeRangeSetting, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(354L))
    TTC_15_9_PacketRetrievalTimeRangeSetting_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    codec.base.bitStream.appendBit(pVal.retrievalPriority.isDefined)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 354L, 1L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 1L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_0 = 1L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Encode packetStore_ID */
    TPacketStore_ID_ACN_Encode(pVal.packetStore_ID, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_2.base.bitStream, codec.base.bitStream, 353L, 224L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 225L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_1 = 224L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    @ghost val codec_0_3 = snapshot(codec)
    TC_15_9_PacketRetrievalTimeRangeSetting_retrievalPriority_Optional_ACN_Encode(codec, pVal, pVal.retrievalPriority) match {
        case Left(l) =>
            return Left(l)
        case Right(_) =>
            ()
    }
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_3.base.bitStream, codec.base.bitStream, 129L, 1L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 226L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_2 = pVal.retrievalPriority match {
        case SomeMut(v) =>
            1L
        case NoneMut() =>
            0L
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2)
    }
    @ghost val codec_0_4 = snapshot(codec)
    /* Encode fromTime */
    TCDS_AbsoluteTime_PFC_2_ACN_Encode(pVal.fromTime, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_4.base.bitStream, codec.base.bitStream, 128L, 64L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 290L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_3 = pVal.fromTime.size(codec_0_4.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2 + size_3)
    }
    @ghost val codec_0_5 = snapshot(codec)
    /* Encode toTime */
    TCDS_AbsoluteTime_PFC_2_ACN_Encode(pVal.toTime, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 354L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_4 = pVal.toTime.size(codec_0_5.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2 + size_3 + size_4)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 354L)
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
def TC_15_9_PacketRetrievalTimeRangeSetting_retrievalPriority_Optional_ACN_Encode(codec: ACN, pVal: TTC_15_9_PacketRetrievalTimeRangeSetting, retrievalPriority: OptionMut[TPacketStoreRetrievalPriority]): Either[Int, Int] = {
    require(codec.base.bitStream.validate_offset_bits(1L))
    @ghost val oldCdc = snapshot(codec)
    /* Encode retrievalPriority */
    retrievalPriority match
        case SomeMut(retrievalPriority) =>
            TPacketStoreRetrievalPriority_ACN_Encode(retrievalPriority, codec, false) match // uper:6
                case Right(_) =>
                case Left(err) => return Left(err)
        case NoneMut() =>
    Right[Int, Int](0)
}.ensuring { (res: Either[Int, Int]) => 
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + (if (retrievalPriority.isDefined) {
                1L
            } else {
                0L
            })
    }
}



@opaque @inlineOnce 
def TTC_15_9_PacketRetrievalTimeRangeSetting_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TTC_15_9_PacketRetrievalTimeRangeSetting] =
{
    require(codec.base.bitStream.validate_offset_bits(354L))
    var retrievalPriority_exist: Boolean = false

    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    retrievalPriority_exist = codec.base.bitStream.readBit()
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 354L, 1L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 1L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_0 = 1L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Decode packetStore_ID */
    val pVal_packetStore_ID = TPacketStore_ID_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_2.base.bitStream, codec.base.bitStream, 353L, 224L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 225L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_1 = 224L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    @ghost val codec_0_3 = snapshot(codec)
    val pVal_retrievalPriority = TC_15_9_PacketRetrievalTimeRangeSetting_retrievalPriority_Optional_ACN_Decode(codec, retrievalPriority_exist) match {
        case LeftMut(l) =>
            return LeftMut(l)
        case RightMut(v) =>
            v
    }
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_3.base.bitStream, codec.base.bitStream, 129L, 1L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 226L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_2 = pVal_retrievalPriority match {
        case SomeMut(v) =>
            1L
        case NoneMut() =>
            0L
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2)
    }
    @ghost val codec_0_4 = snapshot(codec)
    /* Decode fromTime */
    val pVal_fromTime = TCDS_AbsoluteTime_PFC_2_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_4.base.bitStream, codec.base.bitStream, 128L, 64L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 290L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_3 = pVal_fromTime.size(codec_0_4.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2 + size_3)
    }
    @ghost val codec_0_5 = snapshot(codec)
    /* Decode toTime */
    val pVal_toTime = TCDS_AbsoluteTime_PFC_2_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 354L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_4 = pVal_toTime.size(codec_0_5.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2 + size_3 + size_4)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 354L)
    }
    val pVal = TTC_15_9_PacketRetrievalTimeRangeSetting(pVal_packetStore_ID, pVal_retrievalPriority, pVal_fromTime, pVal_toTime)
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0 + size_1 + size_2 + size_3 + size_4)
    }

    TTC_15_9_PacketRetrievalTimeRangeSetting_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TTC_15_9_PacketRetrievalTimeRangeSetting](l)
        case Right(_) => RightMut[ErrorCode, TTC_15_9_PacketRetrievalTimeRangeSetting](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TTC_15_9_PacketRetrievalTimeRangeSetting]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTC_15_9_PacketRetrievalTimeRangeSetting_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TTC_15_9_PacketRetrievalTimeRangeSetting_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TTC_15_9_PacketRetrievalTimeRangeSetting]) =
{
    require(codec.base.bitStream.validate_offset_bits(354L))
    val cpy = snapshot(codec)
    val res = TTC_15_9_PacketRetrievalTimeRangeSetting_ACN_Decode(cpy)
    (cpy, res)
}

@opaque @inlineOnce
def TC_15_9_PacketRetrievalTimeRangeSetting_retrievalPriority_Optional_ACN_Decode(codec: ACN, retrievalPriority_exist: Boolean): EitherMut[Int, OptionMut[TPacketStoreRetrievalPriority]] = {
    require(codec.base.bitStream.validate_offset_bits(1L))
    @ghost val oldCdc = snapshot(codec)
    /* Decode retrievalPriority */
    val retrievalPriority: OptionMut[TPacketStoreRetrievalPriority] =
        if retrievalPriority_exist then
            val pVal_retrievalPriority = TPacketStoreRetrievalPriority_ACN_Decode(codec) match // uper:13
                case RightMut(decData) => decData
                case LeftMut(err) => return LeftMut(err)
            SomeMut(pVal_retrievalPriority)
        else NoneMut[TPacketStoreRetrievalPriority]()
    RightMut[Int, OptionMut[TPacketStoreRetrievalPriority]](retrievalPriority)
}.ensuring { (res: EitherMut[Int, OptionMut[TPacketStoreRetrievalPriority]]) => 
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + (if (resVal.isDefined) {
                1L
            } else {
                0L
            })
    }
}



@ghost @pure
def TC_15_9_PacketRetrievalTimeRangeSetting_retrievalPriority_Optional_ACN_Decode_pure(codec: ACN, retrievalPriority_exist: Boolean): (ACN, EitherMut[Int, OptionMut[TPacketStoreRetrievalPriority]]) = {
    require(codec.base.bitStream.validate_offset_bits(1L))
    val cpy = snapshot(codec)
    val res = TC_15_9_PacketRetrievalTimeRangeSetting_retrievalPriority_Optional_ACN_Decode(cpy, retrievalPriority_exist)
    (cpy, res)
}



def TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings_IsConstraintValid(pVal: TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings): Either[ErrorCode, Int] =
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
            ret = TTC_15_9_PacketRetrievalTimeRangeSetting_IsConstraintValid(pVal.arr(i1))
            i1 = i1 + 1
        }).invariant(0 <= i1 && i1 <= pVal.nCount)
    ret
}

def TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_IsConstraintValid(pVal: TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings_IsConstraintValid(pVal.packetRetrievalTimeRangeSettings)
    ret
}

def TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings_Initialize(): TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings = TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings(1, Vector.fill(32)(TTC_15_9_PacketRetrievalTimeRangeSetting_Initialize()))
def TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_Initialize(): TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores = TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores(packetRetrievalTimeRangeSettings = TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings_Initialize())

@opaque @inlineOnce 
def TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_ACN_Encode(pVal: TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(11360L))
    var i1: Int = 0
    TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    val TC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_n = ULong.fromRaw(pVal.packetRetrievalTimeRangeSettings.nCount)
    if TC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_n < ULong.fromRaw(1) || TC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_n > ULong.fromRaw(32) then
        return Left(860)
    /* Encode TC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_n */
    locally {
        ghostExpr {
            @opaque @inlineOnce
            def bitCountLemma(v: ULong): Unit = {
                require(v <= ULong.fromRaw(4294967295L))
            }.ensuring(_ => GetBitCountUnsigned(v) <= 4294967295L)
            bitCountLemma(TC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_n)
        }
    }
    codec.enc_Int_PositiveInteger_ConstSize_big_endian_32(TC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_n)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 11360L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_0 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Encode packetRetrievalTimeRangeSettings */
    TC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings_ACN_Encode(codec, pVal, TC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_n, pVal.packetRetrievalTimeRangeSettings) match {
        case Left(l) =>
            return Left(l)
        case Right(_) =>
            ()
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 11360L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_1 = pVal.packetRetrievalTimeRangeSettings.size(codec_0_2.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 11360L)
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
def PUS_15_9_TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings_pVal_packetRetrievalTimeRangeSettings_packetRetrievalTimeRangeSettings_Encode_loop(codec: ACN, packetRetrievalTimeRangeSettings: TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings, i1: Int): Either[Int, Int] = {
    require((0 <= i1) && (i1 <= packetRetrievalTimeRangeSettings.nCount))
    require((1 <= packetRetrievalTimeRangeSettings.nCount) && (packetRetrievalTimeRangeSettings.nCount <= packetRetrievalTimeRangeSettings.arr.size) && (packetRetrievalTimeRangeSettings.arr.size <= 32))
    require(codec.base.bitStream.validate_offset_bits((354L * (packetRetrievalTimeRangeSettings.nCount - i1))))
    decreases(packetRetrievalTimeRangeSettings.nCount - i1)
    if (i1 == packetRetrievalTimeRangeSettings.nCount) {
        Right[Int, Int](0)
    } else {
        @ghost val codecSnap1 = snapshot(codec)
        ghostExpr {
            BitStream.validateOffsetBitsWeakeningLemma(codec.base.bitStream, 354L * (packetRetrievalTimeRangeSettings.nCount - i1), 354L)
        }
        TTC_15_9_PacketRetrievalTimeRangeSetting_ACN_Encode(packetRetrievalTimeRangeSettings.arr(i1), codec, false) match // uper:6
            case Right(_) =>
            case Left(err) => return Left(err)
        @ghost val codecSnap2 = snapshot(codec)
        ghostExpr {
            check(354L * (i1 + 1) == 354L * i1 + 354L)
            BitStream.validateOffsetBitsIneqLemma(codecSnap1.base.bitStream, codec.base.bitStream, 354L * (packetRetrievalTimeRangeSettings.nCount - i1), 354L)
            check(codec.base.bitStream.validate_offset_bits(354L * (packetRetrievalTimeRangeSettings.nCount - (i1 + 1))))
        }
        val res = PUS_15_9_TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings_pVal_packetRetrievalTimeRangeSettings_packetRetrievalTimeRangeSettings_Encode_loop(codec, packetRetrievalTimeRangeSettings, i1 + 1)
        ghostExpr {
            (res match {
                case Left(_) =>
                    ()
                case Right(_) =>
                    assert(codec.base.bitStream.bitIndex == codecSnap2.base.bitStream.bitIndex + TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings.sizeRange(packetRetrievalTimeRangeSettings.arr, codecSnap2.base.bitStream.bitIndex, i1 + 1, packetRetrievalTimeRangeSettings.nCount))
                    assert(codecSnap2.base.bitStream.bitIndex == codecSnap1.base.bitStream.bitIndex + packetRetrievalTimeRangeSettings.arr.apply(i1).size(codecSnap1.base.bitStream.bitIndex))
                    assert(TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings.sizeRange(packetRetrievalTimeRangeSettings.arr, codecSnap1.base.bitStream.bitIndex, i1, packetRetrievalTimeRangeSettings.nCount) == packetRetrievalTimeRangeSettings.arr.apply(i1).size(codecSnap1.base.bitStream.bitIndex) + TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings.sizeRange(packetRetrievalTimeRangeSettings.arr, codecSnap2.base.bitStream.bitIndex, i1 + 1, packetRetrievalTimeRangeSettings.nCount))
                    check(codec.base.bitStream.bitIndex == codecSnap1.base.bitStream.bitIndex + TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings.sizeRange(packetRetrievalTimeRangeSettings.arr, codecSnap1.base.bitStream.bitIndex, i1, packetRetrievalTimeRangeSettings.nCount))
            })
        }
        res
    }
}.ensuring { (res: Either[Int, Int]) => 
    res match {
        case Left(_) =>
            true
        case Right(res) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings.sizeRange(packetRetrievalTimeRangeSettings.arr, old(codec).base.bitStream.bitIndex, i1, packetRetrievalTimeRangeSettings.nCount)
    }
}



@opaque @inlineOnce
def TC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings_ACN_Encode(codec: ACN, pVal: TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores, TC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_n: ULong, packetRetrievalTimeRangeSettings: TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings): Either[Int, Int] = {
    require(codec.base.bitStream.validate_offset_bits(11328L))
    @ghost val oldCdc = snapshot(codec)
    TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings_IsConstraintValid(packetRetrievalTimeRangeSettings) match {
        case Left(l) =>
            return Left[Int, Int](l)
        case Right(_) =>
    }
    @ghost val codec_0_1 = snapshot(codec)
    @ghost val codecBeforeLoop_0 = snapshot(codec)
    PUS_15_9_TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings_pVal_packetRetrievalTimeRangeSettings_packetRetrievalTimeRangeSettings_Encode_loop(codec, packetRetrievalTimeRangeSettings, 0) match {
        case Left(l) =>
            return Left[Int, Int](l)
        case Right(_) =>
            ghostExpr {
                packetRetrievalTimeRangeSettings.sizeLemmaAnyOffset(codecBeforeLoop_0.base.bitStream.bitIndex, oldCdc.base.bitStream.bitIndex)
            }
    }
    Right[Int, Int](0)
}.ensuring { (res: Either[Int, Int]) => 
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + packetRetrievalTimeRangeSettings.size(old(codec).base.bitStream.bitIndex)
    }
}

@opaque @inlineOnce 
def TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores] =
{
    require(codec.base.bitStream.validate_offset_bits(11360L))
    var i1: Int = 0

    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Decode TC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_n */
    val TC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_n = codec.dec_Int_PositiveInteger_ConstSize_big_endian_32()

    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 11360L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_0 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Decode packetRetrievalTimeRangeSettings */
    val pVal_packetRetrievalTimeRangeSettings = TC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings_ACN_Decode(codec, TC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_n) match {
        case LeftMut(l) =>
            return LeftMut(l)
        case RightMut(v) =>
            v
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 11360L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_1 = pVal_packetRetrievalTimeRangeSettings.size(codec_0_2.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 11360L)
    }
    val pVal = TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores(pVal_packetRetrievalTimeRangeSettings)
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0 + size_1)
    }

    TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores](l)
        case Right(_) => RightMut[ErrorCode, TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores]) =
{
    require(codec.base.bitStream.validate_offset_bits(11360L))
    val cpy = snapshot(codec)
    val res = TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_ACN_Decode(cpy)
    (cpy, res)
}

@opaque @inlineOnce
def PUS_15_9_TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings_pVal_packetRetrievalTimeRangeSettings_packetRetrievalTimeRangeSettings_Decode_loop(codec: ACN, nCount: Int, packetRetrievalTimeRangeSettings: Vector[TTC_15_9_PacketRetrievalTimeRangeSetting], i1: Int): EitherMut[Int, Vector[TTC_15_9_PacketRetrievalTimeRangeSetting]] = {
    require((1 <= nCount) && (nCount <= 32))
    require((0 <= i1) && (i1 <= nCount))
    require(packetRetrievalTimeRangeSettings.size == i1)
    require(codec.base.bitStream.validate_offset_bits((354L * (nCount - i1))))
    decreases(nCount - i1)
    @ghost val codecSnap1 = snapshot(codec)
    (if (i1 == nCount) {
        ghostExpr {
            vecRangesEqReflexiveLemma(packetRetrievalTimeRangeSettings)
            vecRangesEqSlicedLemma(packetRetrievalTimeRangeSettings, packetRetrievalTimeRangeSettings, 0, packetRetrievalTimeRangeSettings.size, 0, i1)
        }
        RightMut[Int, Vector[TTC_15_9_PacketRetrievalTimeRangeSetting]](packetRetrievalTimeRangeSettings)
    } else {
        ghostExpr {
            BitStream.validateOffsetBitsWeakeningLemma(codec.base.bitStream, 354L * (nCount - i1), 354L)
        }
        val packetRetrievalTimeRangeSettings_arr_i1_ = TTC_15_9_PacketRetrievalTimeRangeSetting_ACN_Decode(codec) match // uper:13
            case RightMut(decData) => decData
            case LeftMut(err) => return LeftMut(err)
        @ghost val codecSnap2 = snapshot(codec)
        ghostExpr {
            check(354L * (i1 + 1) == 354L * i1 + 354L)
            BitStream.validateOffsetBitsIneqLemma(codecSnap1.base.bitStream, codec.base.bitStream, 354L * (nCount - i1), 354L)
            check(codec.base.bitStream.validate_offset_bits(354L * (nCount - (i1 + 1))))
        }
        val res = PUS_15_9_TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings_pVal_packetRetrievalTimeRangeSettings_packetRetrievalTimeRangeSettings_Decode_loop(codec, nCount, packetRetrievalTimeRangeSettings.append(packetRetrievalTimeRangeSettings_arr_i1_), i1 + 1)
        ghostExpr {
            (res match {
                case LeftMut(_) =>
                    ()
                case RightMut(newVec) =>
                    vecRangesAppendDropEq(packetRetrievalTimeRangeSettings, newVec, packetRetrievalTimeRangeSettings_arr_i1_, 0, i1)
                    vecRangesEqImpliesEq(packetRetrievalTimeRangeSettings.append(packetRetrievalTimeRangeSettings_arr_i1_), newVec, 0, i1, i1 + 1)
                    ListSpecs.isnocIndex(packetRetrievalTimeRangeSettings.list, packetRetrievalTimeRangeSettings_arr_i1_, i1)
                    Vector.listApplyEqVecApply(packetRetrievalTimeRangeSettings.append(packetRetrievalTimeRangeSettings_arr_i1_), i1)
                    check(packetRetrievalTimeRangeSettings_arr_i1_ == newVec.apply(i1))
            })
        }
        res
    })
}.ensuring { (res: EitherMut[Int, Vector[TTC_15_9_PacketRetrievalTimeRangeSetting]]) => 
    res match {
        case LeftMut(_) =>
            true
        case RightMut(newVec) =>
            old(codec).base.buf == codec.base.buf && newVec.size == nCount && vecRangesEq(packetRetrievalTimeRangeSettings, newVec, 0, i1) && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings.sizeRange(newVec, old(codec).base.bitStream.bitIndex, i1, nCount)
    }
}



@opaque @inlineOnce
def TC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings_ACN_Decode(codec: ACN, TC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_n: ULong): EitherMut[Int, TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings] = {
    require(codec.base.bitStream.validate_offset_bits(11328L))
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    val packetRetrievalTimeRangeSettings =
        if ((ULong.fromRaw(1) <= TC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_n) && (TC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_n <= ULong.fromRaw(32))) then
            val packetRetrievalTimeRangeSettings_nCount = TC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_n.toRaw.toInt
            @ghost val codecBeforeLoop_0 = snapshot(codec)
            val packetRetrievalTimeRangeSettings = PUS_15_9_TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings_pVal_packetRetrievalTimeRangeSettings_packetRetrievalTimeRangeSettings_Decode_loop(codec, packetRetrievalTimeRangeSettings_nCount, Vector.empty[TTC_15_9_PacketRetrievalTimeRangeSetting], 0) match {
                case LeftMut(l) =>
                    return LeftMut(l)
                case RightMut(bdg) =>
                    val packetRetrievalTimeRangeSettings = TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings(packetRetrievalTimeRangeSettings_nCount, bdg)
                    ghostExpr {
                        packetRetrievalTimeRangeSettings.sizeLemmaAnyOffset(codecBeforeLoop_0.base.bitStream.bitIndex, oldCdc.base.bitStream.bitIndex)
                    }
                    packetRetrievalTimeRangeSettings
            }
            packetRetrievalTimeRangeSettings
        else return LeftMut(ERR_ACN_DECODE_TC_15_9_STARTTHEBY_TIME_RANGERETRIEVALOFPACKETSTORES_PACKETRETRIEVALTIMERANGESETTINGS)
    TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings_IsConstraintValid(packetRetrievalTimeRangeSettings) match {
        case Left(l) =>
            LeftMut[Int, TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings](l)
        case Right(_) =>
            RightMut[Int, TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings](packetRetrievalTimeRangeSettings)
    }
}.ensuring { (res: EitherMut[Int, TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings]) => 
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure
def TC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings_ACN_Decode_pure(codec: ACN, TC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_n: ULong): (ACN, EitherMut[Int, TTC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings]) = {
    require(codec.base.bitStream.validate_offset_bits(11328L))
    val cpy = snapshot(codec)
    val res = TC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_packetRetrievalTimeRangeSettings_ACN_Decode(cpy, TC_15_9_StartTheBy_Time_RangeRetrievalOfPacketStores_n)
    (cpy, res)
}