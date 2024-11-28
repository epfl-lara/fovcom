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

val maxTM_18_18_AbortedOBCPReportsCount: Int = 15 // variables:188

def TTM_18_18_AbortedOBCPReport_obcp_IDs_IsConstraintValid(pVal: TTM_18_18_AbortedOBCPReport_obcp_IDs): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    var i1: Int = 0
    ret = ((1 <= pVal.nCount) && (pVal.nCount <= 15)) match
        case true =>
            Right(0)
        case false =>
            Left(45)
    if ret.isRight then
        i1 = 0
        (while(i1 < pVal.nCount && ret.isRight) {
            decreases(pVal.nCount - i1)
            ret = TOBCP_ID_IsConstraintValid(pVal.arr(i1))
            i1 = i1 + 1
        }).invariant(0 <= i1 && i1 <= pVal.nCount)
    ret
}

def TTM_18_18_AbortedOBCPReport_IsConstraintValid(pVal: TTM_18_18_AbortedOBCPReport): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = TTM_18_18_AbortedOBCPReport_obcp_IDs_IsConstraintValid(pVal.obcp_IDs)
    ret
}

def TTM_18_18_AbortedOBCPReport_obcp_IDs_Initialize(): TTM_18_18_AbortedOBCPReport_obcp_IDs = TTM_18_18_AbortedOBCPReport_obcp_IDs(1, Vector.fill(15)(Vector.fill[UByte](5.toInt+1)(0x0.toRawUByte)))
def TTM_18_18_AbortedOBCPReport_Initialize(): TTM_18_18_AbortedOBCPReport = TTM_18_18_AbortedOBCPReport(obcp_IDs = TTM_18_18_AbortedOBCPReport_obcp_IDs_Initialize())

@opaque @inlineOnce 
def TTM_18_18_AbortedOBCPReport_ACN_Encode(pVal: TTM_18_18_AbortedOBCPReport, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(557L))
    var i1: Int = 0
    TTM_18_18_AbortedOBCPReport_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    val TM_18_18_AbortedOBCPReport_n = ULong.fromRaw(pVal.obcp_IDs.nCount)
    if TM_18_18_AbortedOBCPReport_n < ULong.fromRaw(1) || TM_18_18_AbortedOBCPReport_n > ULong.fromRaw(15) then
        return Left(860)
    /* Encode TM_18_18_AbortedOBCPReport_n */
    locally {
        ghostExpr {
            @opaque @inlineOnce
            def bitCountLemma(v: ULong): Unit = {
                require(v <= ULong.fromRaw(4294967295L))
            }.ensuring(_ => GetBitCountUnsigned(v) <= 4294967295L)
            bitCountLemma(TM_18_18_AbortedOBCPReport_n)
        }
    }
    codec.enc_Int_PositiveInteger_ConstSize_big_endian_32(TM_18_18_AbortedOBCPReport_n)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 557L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_0 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Encode obcp_IDs */
    TM_18_18_AbortedOBCPReport_obcp_IDs_ACN_Encode(codec, pVal, TM_18_18_AbortedOBCPReport_n, pVal.obcp_IDs) match {
        case Left(l) =>
            return Left(l)
        case Right(_) =>
            ()
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 557L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_1 = pVal.obcp_IDs.size(codec_0_2.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 557L)
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
def TM_18_18_AbortedOBCPReport_obcp_IDs_Encode_loop(codec: ACN, obcp_IDs: TTM_18_18_AbortedOBCPReport_obcp_IDs, i1: Int): Either[Int, Int] = {
    require((0 <= i1) && (i1 <= obcp_IDs.nCount))
    require((1 <= obcp_IDs.nCount) && (obcp_IDs.nCount <= obcp_IDs.arr.size) && (obcp_IDs.arr.size <= 15))
    require(codec.base.bitStream.validate_offset_bits((35L * (obcp_IDs.nCount - i1))))
    decreases(obcp_IDs.nCount - i1)
    if (i1 == obcp_IDs.nCount) {
        Right[Int, Int](0)
    } else {
        @ghost val codecSnap1 = snapshot(codec)
        ghostExpr {
            BitStream.validateOffsetBitsWeakeningLemma(codec.base.bitStream, 35L * (obcp_IDs.nCount - i1), 35L)
        }
        TOBCP_ID_ACN_Encode(obcp_IDs.arr(i1), codec, false) match // uper:6
            case Right(_) =>
            case Left(err) => return Left(err)
        @ghost val codecSnap2 = snapshot(codec)
        ghostExpr {
            check(35L * (i1 + 1) == 35L * i1 + 35L)
            BitStream.validateOffsetBitsIneqLemma(codecSnap1.base.bitStream, codec.base.bitStream, 35L * (obcp_IDs.nCount - i1), 35L)
            check(codec.base.bitStream.validate_offset_bits(35L * (obcp_IDs.nCount - (i1 + 1))))
        }
        val res = TM_18_18_AbortedOBCPReport_obcp_IDs_Encode_loop(codec, obcp_IDs, i1 + 1)
        ghostExpr {
            (res match {
                case Left(_) =>
                    ()
                case Right(_) =>
                    assert(codec.base.bitStream.bitIndex == codecSnap2.base.bitStream.bitIndex + TTM_18_18_AbortedOBCPReport_obcp_IDs.sizeRange(obcp_IDs.arr, codecSnap2.base.bitStream.bitIndex, i1 + 1, obcp_IDs.nCount))
                    assert(codecSnap2.base.bitStream.bitIndex == codecSnap1.base.bitStream.bitIndex + 35L)
                    assert(TTM_18_18_AbortedOBCPReport_obcp_IDs.sizeRange(obcp_IDs.arr, codecSnap1.base.bitStream.bitIndex, i1, obcp_IDs.nCount) == TTM_18_18_AbortedOBCPReport_obcp_IDs.sizeRange(obcp_IDs.arr, codecSnap2.base.bitStream.bitIndex, i1 + 1, obcp_IDs.nCount) + 35L)
                    check(codec.base.bitStream.bitIndex == codecSnap1.base.bitStream.bitIndex + TTM_18_18_AbortedOBCPReport_obcp_IDs.sizeRange(obcp_IDs.arr, codecSnap1.base.bitStream.bitIndex, i1, obcp_IDs.nCount))
            })
        }
        res
    }
}.ensuring { (res: Either[Int, Int]) => 
    res match {
        case Left(_) =>
            true
        case Right(res) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + TTM_18_18_AbortedOBCPReport_obcp_IDs.sizeRange(obcp_IDs.arr, old(codec).base.bitStream.bitIndex, i1, obcp_IDs.nCount)
    }
}



@opaque @inlineOnce
def TM_18_18_AbortedOBCPReport_obcp_IDs_ACN_Encode(codec: ACN, pVal: TTM_18_18_AbortedOBCPReport, TM_18_18_AbortedOBCPReport_n: ULong, obcp_IDs: TTM_18_18_AbortedOBCPReport_obcp_IDs): Either[Int, Int] = {
    require(codec.base.bitStream.validate_offset_bits(525L))
    @ghost val oldCdc = snapshot(codec)
    TTM_18_18_AbortedOBCPReport_obcp_IDs_IsConstraintValid(obcp_IDs) match {
        case Left(l) =>
            return Left[Int, Int](l)
        case Right(_) =>
    }
    @ghost val codec_0_1 = snapshot(codec)
    @ghost val codecBeforeLoop_0 = snapshot(codec)
    TM_18_18_AbortedOBCPReport_obcp_IDs_Encode_loop(codec, obcp_IDs, 0) match {
        case Left(l) =>
            return Left[Int, Int](l)
        case Right(_) =>
            ghostExpr {
                obcp_IDs.sizeLemmaAnyOffset(codecBeforeLoop_0.base.bitStream.bitIndex, oldCdc.base.bitStream.bitIndex)
            }
            ()
    }
    Right[Int, Int](0)
}.ensuring { (res: Either[Int, Int]) => 
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + obcp_IDs.size(old(codec).base.bitStream.bitIndex)
    }
}

@opaque @inlineOnce 
def TTM_18_18_AbortedOBCPReport_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TTM_18_18_AbortedOBCPReport] =
{
    require(codec.base.bitStream.validate_offset_bits(557L))
    var i1: Int = 0

    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Decode TM_18_18_AbortedOBCPReport_n */
    val TM_18_18_AbortedOBCPReport_n = codec.dec_Int_PositiveInteger_ConstSize_big_endian_32()

    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 557L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_0 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Decode obcp_IDs */
    val pVal_obcp_IDs = TM_18_18_AbortedOBCPReport_obcp_IDs_ACN_Decode(codec, TM_18_18_AbortedOBCPReport_n) match {
        case LeftMut(l) =>
            return LeftMut(l)
        case RightMut(v) =>
            v
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 557L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_1 = pVal_obcp_IDs.size(codec_0_2.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 557L)
    }
    val pVal = TTM_18_18_AbortedOBCPReport(pVal_obcp_IDs)
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0 + size_1)
    }

    TTM_18_18_AbortedOBCPReport_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TTM_18_18_AbortedOBCPReport](l)
        case Right(_) => RightMut[ErrorCode, TTM_18_18_AbortedOBCPReport](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TTM_18_18_AbortedOBCPReport]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTM_18_18_AbortedOBCPReport_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TTM_18_18_AbortedOBCPReport_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TTM_18_18_AbortedOBCPReport]) =
{
    require(codec.base.bitStream.validate_offset_bits(557L))
    val cpy = snapshot(codec)
    val res = TTM_18_18_AbortedOBCPReport_ACN_Decode(cpy)
    (cpy, res)
}

@opaque @inlineOnce
def TM_18_18_AbortedOBCPReport_obcp_IDs_Decode_loop(codec: ACN, nCount: Int, obcp_IDs: Vector[Vector[UByte]], i1: Int): EitherMut[Int, Vector[Vector[UByte]]] = {
    require((1 <= nCount) && (nCount <= 15))
    require((0 <= i1) && (i1 <= nCount))
    require(obcp_IDs.size == i1)
    require(codec.base.bitStream.validate_offset_bits((35L * (nCount - i1))))
    decreases(nCount - i1)
    @ghost val codecSnap1 = snapshot(codec)
    (if (i1 == nCount) {
        ghostExpr {
            vecRangesEqReflexiveLemma(obcp_IDs)
            vecRangesEqSlicedLemma(obcp_IDs, obcp_IDs, 0, obcp_IDs.size, 0, i1)
        }
        RightMut[Int, Vector[Vector[UByte]]](obcp_IDs)
    } else {
        ghostExpr {
            BitStream.validateOffsetBitsWeakeningLemma(codec.base.bitStream, 35L * (nCount - i1), 35L)
        }
        val obcp_IDs_arr_i1_ = TOBCP_ID_ACN_Decode(codec) match // uper:13
            case RightMut(decData) => decData
            case LeftMut(err) => return LeftMut(err)
        @ghost val codecSnap2 = snapshot(codec)
        ghostExpr {
            check(35L * (i1 + 1) == 35L * i1 + 35L)
            BitStream.validateOffsetBitsIneqLemma(codecSnap1.base.bitStream, codec.base.bitStream, 35L * (nCount - i1), 35L)
            check(codec.base.bitStream.validate_offset_bits(35L * (nCount - (i1 + 1))))
        }
        val res = TM_18_18_AbortedOBCPReport_obcp_IDs_Decode_loop(codec, nCount, obcp_IDs.append(obcp_IDs_arr_i1_), i1 + 1)
        ghostExpr {
            (res match {
                case LeftMut(_) =>
                    ()
                case RightMut(newVec) =>
                    vecRangesAppendDropEq(obcp_IDs, newVec, obcp_IDs_arr_i1_, 0, i1)
                    vecRangesEqImpliesEq(obcp_IDs.append(obcp_IDs_arr_i1_), newVec, 0, i1, i1 + 1)
                    ListSpecs.isnocIndex(obcp_IDs.list, obcp_IDs_arr_i1_, i1)
                    Vector.listApplyEqVecApply(obcp_IDs.append(obcp_IDs_arr_i1_), i1)
                    check(obcp_IDs_arr_i1_ == newVec.apply(i1))
            })
        }
        res
    })
}.ensuring { (res: EitherMut[Int, Vector[Vector[UByte]]]) => 
    res match {
        case LeftMut(_) =>
            true
        case RightMut(newVec) =>
            old(codec).base.buf == codec.base.buf && newVec.size == nCount && vecRangesEq(obcp_IDs, newVec, 0, i1) && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + TTM_18_18_AbortedOBCPReport_obcp_IDs.sizeRange(newVec, old(codec).base.bitStream.bitIndex, i1, nCount)
    }
}



@opaque @inlineOnce
def TM_18_18_AbortedOBCPReport_obcp_IDs_ACN_Decode(codec: ACN, TM_18_18_AbortedOBCPReport_n: ULong): EitherMut[Int, TTM_18_18_AbortedOBCPReport_obcp_IDs] = {
    require(codec.base.bitStream.validate_offset_bits(525L))
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    val obcp_IDs =
        if ((ULong.fromRaw(1) <= TM_18_18_AbortedOBCPReport_n) && (TM_18_18_AbortedOBCPReport_n <= ULong.fromRaw(15))) then
            val obcp_IDs_nCount = TM_18_18_AbortedOBCPReport_n.toRaw.toInt
            @ghost val codecBeforeLoop_0 = snapshot(codec)
            val obcp_IDs = TM_18_18_AbortedOBCPReport_obcp_IDs_Decode_loop(codec, obcp_IDs_nCount, Vector.empty[Vector[UByte]], 0) match {
                case LeftMut(l) =>
                    return LeftMut(l)
                case RightMut(bdg) =>
                    val obcp_IDs = TTM_18_18_AbortedOBCPReport_obcp_IDs(obcp_IDs_nCount, bdg)
                    ghostExpr {
                        obcp_IDs.sizeLemmaAnyOffset(codecBeforeLoop_0.base.bitStream.bitIndex, oldCdc.base.bitStream.bitIndex)
                    }
                    obcp_IDs
            }
            obcp_IDs
        else return LeftMut(ERR_ACN_DECODE_TM_18_18_ABORTEDOBCPREPORT_OBCP_IDS)
    TTM_18_18_AbortedOBCPReport_obcp_IDs_IsConstraintValid(obcp_IDs) match {
        case Left(l) =>
            LeftMut[Int, TTM_18_18_AbortedOBCPReport_obcp_IDs](l)
        case Right(_) =>
            RightMut[Int, TTM_18_18_AbortedOBCPReport_obcp_IDs](obcp_IDs)
    }
}.ensuring { (res: EitherMut[Int, TTM_18_18_AbortedOBCPReport_obcp_IDs]) => 
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTM_18_18_AbortedOBCPReport_obcp_IDs_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure
def TM_18_18_AbortedOBCPReport_obcp_IDs_ACN_Decode_pure(codec: ACN, TM_18_18_AbortedOBCPReport_n: ULong): (ACN, EitherMut[Int, TTM_18_18_AbortedOBCPReport_obcp_IDs]) = {
    require(codec.base.bitStream.validate_offset_bits(525L))
    val cpy = snapshot(codec)
    val res = TM_18_18_AbortedOBCPReport_obcp_IDs_ACN_Decode(cpy, TM_18_18_AbortedOBCPReport_n)
    (cpy, res)
}