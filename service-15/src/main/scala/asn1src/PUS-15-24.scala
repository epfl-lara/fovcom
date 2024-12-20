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


def TTC_15_24_CopyThePacketsContainedInAPacketStoreSelectedByTimeWindow_IsConstraintValid(pVal: TTC_15_24_CopyThePacketsContainedInAPacketStoreSelectedByTimeWindow): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = TTimeWindow_IsConstraintValid(pVal.timeWindow)
    if ret.isRight then
        ret = TPacketStore_ID_IsConstraintValid(pVal.fromPacketStore_ID)
        if ret.isRight then
            ret = TPacketStore_ID_IsConstraintValid(pVal.toPacketStore_ID)
    ret
}

def TTC_15_24_CopyThePacketsContainedInAPacketStoreSelectedByTimeWindow_Initialize(): TTC_15_24_CopyThePacketsContainedInAPacketStoreSelectedByTimeWindow = TTC_15_24_CopyThePacketsContainedInAPacketStoreSelectedByTimeWindow(timeWindow = TTimeWindow_Initialize(), fromPacketStore_ID = Vector.fill[UByte](32.toInt+1)(0x0.toRawUByte), toPacketStore_ID = Vector.fill[UByte](32.toInt+1)(0x0.toRawUByte))

@opaque @inlineOnce 
def TTC_15_24_CopyThePacketsContainedInAPacketStoreSelectedByTimeWindow_ACN_Encode(pVal: TTC_15_24_CopyThePacketsContainedInAPacketStoreSelectedByTimeWindow, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(578L))
    TTC_15_24_CopyThePacketsContainedInAPacketStoreSelectedByTimeWindow_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Encode timeWindow */
    TTimeWindow_ACN_Encode(pVal.timeWindow, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 578L, 130L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 130L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_0 = pVal.timeWindow.size(codec_0_1.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Encode fromPacketStore_ID */
    TPacketStore_ID_ACN_Encode(pVal.fromPacketStore_ID, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_2.base.bitStream, codec.base.bitStream, 448L, 224L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 354L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_1 = 224L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    @ghost val codec_0_3 = snapshot(codec)
    /* Encode toPacketStore_ID */
    TPacketStore_ID_ACN_Encode(pVal.toPacketStore_ID, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 578L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_2 = 224L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 578L)
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
def TTC_15_24_CopyThePacketsContainedInAPacketStoreSelectedByTimeWindow_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TTC_15_24_CopyThePacketsContainedInAPacketStoreSelectedByTimeWindow] =
{
    require(codec.base.bitStream.validate_offset_bits(578L))

    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Decode timeWindow */
    val pVal_timeWindow = TTimeWindow_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 578L, 130L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 130L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_0 = pVal_timeWindow.size(codec_0_1.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Decode fromPacketStore_ID */
    val pVal_fromPacketStore_ID = TPacketStore_ID_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_2.base.bitStream, codec.base.bitStream, 448L, 224L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 354L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_1 = 224L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    @ghost val codec_0_3 = snapshot(codec)
    /* Decode toPacketStore_ID */
    val pVal_toPacketStore_ID = TPacketStore_ID_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 578L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_2 = 224L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 578L)
    }
    val pVal = TTC_15_24_CopyThePacketsContainedInAPacketStoreSelectedByTimeWindow(pVal_timeWindow, pVal_fromPacketStore_ID, pVal_toPacketStore_ID)
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0 + size_1 + size_2)
    }

    TTC_15_24_CopyThePacketsContainedInAPacketStoreSelectedByTimeWindow_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TTC_15_24_CopyThePacketsContainedInAPacketStoreSelectedByTimeWindow](l)
        case Right(_) => RightMut[ErrorCode, TTC_15_24_CopyThePacketsContainedInAPacketStoreSelectedByTimeWindow](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TTC_15_24_CopyThePacketsContainedInAPacketStoreSelectedByTimeWindow]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTC_15_24_CopyThePacketsContainedInAPacketStoreSelectedByTimeWindow_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TTC_15_24_CopyThePacketsContainedInAPacketStoreSelectedByTimeWindow_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TTC_15_24_CopyThePacketsContainedInAPacketStoreSelectedByTimeWindow]) =
{
    require(codec.base.bitStream.validate_offset_bits(578L))
    val cpy = snapshot(codec)
    val res = TTC_15_24_CopyThePacketsContainedInAPacketStoreSelectedByTimeWindow_ACN_Decode(cpy)
    (cpy, res)
}