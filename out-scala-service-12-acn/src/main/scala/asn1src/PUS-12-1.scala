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

val maxTC_12_1_PMON_ID_Count: Int = 4095 // variables:188

def TTC_12_1_EnableParameterReportingDefinitions_pmon_IsConstraintValid(pVal: TTC_12_1_EnableParameterReportingDefinitions_pmon): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    var i1: Int = 0
    ret = ((1 <= pVal.nCount) && (pVal.nCount <= 4095)) match
        case true =>
            Right(0)
        case false =>
            Left(45)
    if ret.isRight then
        i1 = 0
        (while(i1 < pVal.nCount && ret.isRight) {
            decreases(pVal.nCount - i1)
            ret = TPMON_ID_IsConstraintValid(pVal.arr(i1))
            i1 = i1 + 1
        }).invariant(0 <= i1 && i1 <= pVal.nCount)
    ret
}

def TTC_12_1_EnableParameterReportingDefinitions_IsConstraintValid(pVal: TTC_12_1_EnableParameterReportingDefinitions): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = TTC_12_1_EnableParameterReportingDefinitions_pmon_IsConstraintValid(pVal.pmon)
    ret
}

def TTC_12_1_EnableParameterReportingDefinitions_pmon_Initialize(): TTC_12_1_EnableParameterReportingDefinitions_pmon = TTC_12_1_EnableParameterReportingDefinitions_pmon(1, Vector.fill(4095)(TPMON_ID.Tparam0))
def TTC_12_1_EnableParameterReportingDefinitions_Initialize(): TTC_12_1_EnableParameterReportingDefinitions = TTC_12_1_EnableParameterReportingDefinitions(pmon = TTC_12_1_EnableParameterReportingDefinitions_pmon_Initialize())

@opaque @inlineOnce 
def TTC_12_1_EnableParameterReportingDefinitions_ACN_Encode(pVal: TTC_12_1_EnableParameterReportingDefinitions, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(131072L))
    var i1: Int = 0
    TTC_12_1_EnableParameterReportingDefinitions_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    val TC_12_1_EnableParameterReportingDefinitions_n = ULong.fromRaw(pVal.pmon.nCount)
    if TC_12_1_EnableParameterReportingDefinitions_n < ULong.fromRaw(1) || TC_12_1_EnableParameterReportingDefinitions_n > ULong.fromRaw(4095) then
        return Left(860)
    /* Encode TC_12_1_EnableParameterReportingDefinitions_n */
    locally {
        ghostExpr {
            @opaque @inlineOnce
            def bitCountLemma(v: ULong): Unit = {
                require(v <= ULong.fromRaw(4294967295L))
            }.ensuring(_ => GetBitCountUnsigned(v) <= 4294967295L)
            bitCountLemma(TC_12_1_EnableParameterReportingDefinitions_n)
        }
    }
    codec.enc_Int_PositiveInteger_ConstSize_big_endian_32(TC_12_1_EnableParameterReportingDefinitions_n)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 131072L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_0 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Encode pmon */
    TC_12_1_EnableParameterReportingDefinitions_pmon_ACN_Encode(codec, pVal, TC_12_1_EnableParameterReportingDefinitions_n, pVal.pmon) match {
        case Left(l) =>
            return Left(l)
        case Right(_) =>
            ()
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 131072L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_1 = pVal.pmon.size(codec_0_2.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 131072L)
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
def PUS_12_1_TTC_12_1_EnableParameterReportingDefinitions_pmon_pVal_pmon_pmon_Encode_loop(codec: ACN, pmon: TTC_12_1_EnableParameterReportingDefinitions_pmon, i1: Int): Either[Int, Int] = {
    require((0 <= i1) && (i1 <= pmon.nCount))
    require((1 <= pmon.nCount) && (pmon.nCount <= pmon.arr.size) && (pmon.arr.size <= 4095))
    require(codec.base.bitStream.validate_offset_bits((32L * (pmon.nCount - i1))))
    decreases(pmon.nCount - i1)
    if (i1 == pmon.nCount) {
        Right[Int, Int](0)
    } else {
        @ghost val codecSnap1 = snapshot(codec)
        ghostExpr {
            BitStream.validateOffsetBitsWeakeningLemma(codec.base.bitStream, 32L * (pmon.nCount - i1), 32L)
        }
        TPMON_ID_ACN_Encode(pmon.arr(i1), codec, false) match // uper:6
            case Right(_) =>
            case Left(err) => return Left(err)
        @ghost val codecSnap2 = snapshot(codec)
        ghostExpr {
            check(32L * (i1 + 1) == 32L * i1 + 32L)
            BitStream.validateOffsetBitsIneqLemma(codecSnap1.base.bitStream, codec.base.bitStream, 32L * (pmon.nCount - i1), 32L)
            check(codec.base.bitStream.validate_offset_bits(32L * (pmon.nCount - (i1 + 1))))
        }
        val res = PUS_12_1_TTC_12_1_EnableParameterReportingDefinitions_pmon_pVal_pmon_pmon_Encode_loop(codec, pmon, i1 + 1)
        ghostExpr {
            (res match {
                case Left(_) =>
                    ()
                case Right(_) =>
                    assert(codec.base.bitStream.bitIndex == codecSnap2.base.bitStream.bitIndex + TTC_12_1_EnableParameterReportingDefinitions_pmon.sizeRange(pmon.arr, codecSnap2.base.bitStream.bitIndex, i1 + 1, pmon.nCount))
                    assert(codecSnap2.base.bitStream.bitIndex == codecSnap1.base.bitStream.bitIndex + 32L)
                    assert(TTC_12_1_EnableParameterReportingDefinitions_pmon.sizeRange(pmon.arr, codecSnap1.base.bitStream.bitIndex, i1, pmon.nCount) == TTC_12_1_EnableParameterReportingDefinitions_pmon.sizeRange(pmon.arr, codecSnap2.base.bitStream.bitIndex, i1 + 1, pmon.nCount) + 32L)
                    check(codec.base.bitStream.bitIndex == codecSnap1.base.bitStream.bitIndex + TTC_12_1_EnableParameterReportingDefinitions_pmon.sizeRange(pmon.arr, codecSnap1.base.bitStream.bitIndex, i1, pmon.nCount))
            })
        }
        res
    }
}.ensuring { (res: Either[Int, Int]) => 
    res match {
        case Left(_) =>
            true
        case Right(res) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + TTC_12_1_EnableParameterReportingDefinitions_pmon.sizeRange(pmon.arr, old(codec).base.bitStream.bitIndex, i1, pmon.nCount)
    }
}



@opaque @inlineOnce
def TC_12_1_EnableParameterReportingDefinitions_pmon_ACN_Encode(codec: ACN, pVal: TTC_12_1_EnableParameterReportingDefinitions, TC_12_1_EnableParameterReportingDefinitions_n: ULong, pmon: TTC_12_1_EnableParameterReportingDefinitions_pmon): Either[Int, Int] = {
    require(codec.base.bitStream.validate_offset_bits(131040L))
    @ghost val oldCdc = snapshot(codec)
    TTC_12_1_EnableParameterReportingDefinitions_pmon_IsConstraintValid(pmon) match {
        case Left(l) =>
            return Left[Int, Int](l)
        case Right(_) =>
    }
    @ghost val codec_0_1 = snapshot(codec)
    @ghost val codecBeforeLoop_0 = snapshot(codec)
    PUS_12_1_TTC_12_1_EnableParameterReportingDefinitions_pmon_pVal_pmon_pmon_Encode_loop(codec, pmon, 0) match {
        case Left(l) =>
            return Left[Int, Int](l)
        case Right(_) =>
            ghostExpr {
                pmon.sizeLemmaAnyOffset(codecBeforeLoop_0.base.bitStream.bitIndex, oldCdc.base.bitStream.bitIndex)
            }
    }
    Right[Int, Int](0)
}.ensuring { (res: Either[Int, Int]) => 
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + pmon.size(old(codec).base.bitStream.bitIndex)
    }
}

@opaque @inlineOnce 
def TTC_12_1_EnableParameterReportingDefinitions_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TTC_12_1_EnableParameterReportingDefinitions] =
{
    require(codec.base.bitStream.validate_offset_bits(131072L))
    var i1: Int = 0

    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Decode TC_12_1_EnableParameterReportingDefinitions_n */
    val TC_12_1_EnableParameterReportingDefinitions_n = codec.dec_Int_PositiveInteger_ConstSize_big_endian_32()

    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 131072L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_0 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Decode pmon */
    val pVal_pmon = TC_12_1_EnableParameterReportingDefinitions_pmon_ACN_Decode(codec, TC_12_1_EnableParameterReportingDefinitions_n) match {
        case LeftMut(l) =>
            return LeftMut(l)
        case RightMut(v) =>
            v
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 131072L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_1 = pVal_pmon.size(codec_0_2.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 131072L)
    }
    val pVal = TTC_12_1_EnableParameterReportingDefinitions(pVal_pmon)
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0 + size_1)
    }

    TTC_12_1_EnableParameterReportingDefinitions_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TTC_12_1_EnableParameterReportingDefinitions](l)
        case Right(_) => RightMut[ErrorCode, TTC_12_1_EnableParameterReportingDefinitions](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TTC_12_1_EnableParameterReportingDefinitions]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTC_12_1_EnableParameterReportingDefinitions_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TTC_12_1_EnableParameterReportingDefinitions_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TTC_12_1_EnableParameterReportingDefinitions]) =
{
    require(codec.base.bitStream.validate_offset_bits(131072L))
    val cpy = snapshot(codec)
    val res = TTC_12_1_EnableParameterReportingDefinitions_ACN_Decode(cpy)
    (cpy, res)
}

@opaque @inlineOnce
def PUS_12_1_TTC_12_1_EnableParameterReportingDefinitions_pmon_pVal_pmon_pmon_Decode_loop(codec: ACN, nCount: Int, pmon: Vector[TPMON_ID], i1: Int): EitherMut[Int, Vector[TPMON_ID]] = {
    require((1 <= nCount) && (nCount <= 4095))
    require((0 <= i1) && (i1 <= nCount))
    require(pmon.size == i1)
    require(codec.base.bitStream.validate_offset_bits((32L * (nCount - i1))))
    decreases(nCount - i1)
    @ghost val codecSnap1 = snapshot(codec)
    (if (i1 == nCount) {
        ghostExpr {
            vecRangesEqReflexiveLemma(pmon)
            vecRangesEqSlicedLemma(pmon, pmon, 0, pmon.size, 0, i1)
        }
        RightMut[Int, Vector[TPMON_ID]](pmon)
    } else {
        ghostExpr {
            BitStream.validateOffsetBitsWeakeningLemma(codec.base.bitStream, 32L * (nCount - i1), 32L)
        }
        val pmon_arr_i1_ = TPMON_ID_ACN_Decode(codec) match // uper:13
            case RightMut(decData) => decData
            case LeftMut(err) => return LeftMut(err)
        @ghost val codecSnap2 = snapshot(codec)
        ghostExpr {
            check(32L * (i1 + 1) == 32L * i1 + 32L)
            BitStream.validateOffsetBitsIneqLemma(codecSnap1.base.bitStream, codec.base.bitStream, 32L * (nCount - i1), 32L)
            check(codec.base.bitStream.validate_offset_bits(32L * (nCount - (i1 + 1))))
        }
        val res = PUS_12_1_TTC_12_1_EnableParameterReportingDefinitions_pmon_pVal_pmon_pmon_Decode_loop(codec, nCount, pmon.append(pmon_arr_i1_), i1 + 1)
        ghostExpr {
            (res match {
                case LeftMut(_) =>
                    ()
                case RightMut(newVec) =>
                    vecRangesAppendDropEq(pmon, newVec, pmon_arr_i1_, 0, i1)
                    vecRangesEqImpliesEq(pmon.append(pmon_arr_i1_), newVec, 0, i1, i1 + 1)
                    ListSpecs.isnocIndex(pmon.list, pmon_arr_i1_, i1)
                    Vector.listApplyEqVecApply(pmon.append(pmon_arr_i1_), i1)
                    check(pmon_arr_i1_ == newVec.apply(i1))
            })
        }
        res
    })
}.ensuring { (res: EitherMut[Int, Vector[TPMON_ID]]) => 
    res match {
        case LeftMut(_) =>
            true
        case RightMut(newVec) =>
            old(codec).base.buf == codec.base.buf && newVec.size == nCount && vecRangesEq(pmon, newVec, 0, i1) && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + TTC_12_1_EnableParameterReportingDefinitions_pmon.sizeRange(newVec, old(codec).base.bitStream.bitIndex, i1, nCount)
    }
}



@opaque @inlineOnce
def TC_12_1_EnableParameterReportingDefinitions_pmon_ACN_Decode(codec: ACN, TC_12_1_EnableParameterReportingDefinitions_n: ULong): EitherMut[Int, TTC_12_1_EnableParameterReportingDefinitions_pmon] = {
    require(codec.base.bitStream.validate_offset_bits(131040L))
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    val pmon =
        if ((ULong.fromRaw(1) <= TC_12_1_EnableParameterReportingDefinitions_n) && (TC_12_1_EnableParameterReportingDefinitions_n <= ULong.fromRaw(4095))) then
            val pmon_nCount = TC_12_1_EnableParameterReportingDefinitions_n.toRaw.toInt
            @ghost val codecBeforeLoop_0 = snapshot(codec)
            val pmon = PUS_12_1_TTC_12_1_EnableParameterReportingDefinitions_pmon_pVal_pmon_pmon_Decode_loop(codec, pmon_nCount, Vector.empty[TPMON_ID], 0) match {
                case LeftMut(l) =>
                    return LeftMut(l)
                case RightMut(bdg) =>
                    val pmon = TTC_12_1_EnableParameterReportingDefinitions_pmon(pmon_nCount, bdg)
                    ghostExpr {
                        pmon.sizeLemmaAnyOffset(codecBeforeLoop_0.base.bitStream.bitIndex, oldCdc.base.bitStream.bitIndex)
                    }
                    pmon
            }
            pmon
        else return LeftMut(ERR_ACN_DECODE_TC_12_1_ENABLEPARAMETERREPORTINGDEFINITIONS_PMON)
    TTC_12_1_EnableParameterReportingDefinitions_pmon_IsConstraintValid(pmon) match {
        case Left(l) =>
            LeftMut[Int, TTC_12_1_EnableParameterReportingDefinitions_pmon](l)
        case Right(_) =>
            RightMut[Int, TTC_12_1_EnableParameterReportingDefinitions_pmon](pmon)
    }
}.ensuring { (res: EitherMut[Int, TTC_12_1_EnableParameterReportingDefinitions_pmon]) => 
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTC_12_1_EnableParameterReportingDefinitions_pmon_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure
def TC_12_1_EnableParameterReportingDefinitions_pmon_ACN_Decode_pure(codec: ACN, TC_12_1_EnableParameterReportingDefinitions_n: ULong): (ACN, EitherMut[Int, TTC_12_1_EnableParameterReportingDefinitions_pmon]) = {
    require(codec.base.bitStream.validate_offset_bits(131040L))
    val cpy = snapshot(codec)
    val res = TC_12_1_EnableParameterReportingDefinitions_pmon_ACN_Decode(cpy, TC_12_1_EnableParameterReportingDefinitions_n)
    (cpy, res)
}