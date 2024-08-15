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

val maxTC_11_24_GroupCount: Int = 4095 // variables:188

def TTC_11_24_EnableTimeBasedSchedulingGroups_groups_IsConstraintValid(pVal: TTC_11_24_EnableTimeBasedSchedulingGroups_groups): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    var i1: Int = 0
    ret = (pVal.nCount <= 4095) match
        case true =>
            Right(0)
        case false =>
            Left(45)
    if ret.isRight then
        i1 = 0
        (while(i1 < pVal.nCount && ret.isRight) {
            decreases(pVal.nCount - i1)
            ret = TGroup_ID_IsConstraintValid(pVal.arr(i1))
            i1 = i1 + 1
        }).invariant(0 <= i1 && i1 <= pVal.nCount)
    ret
}

def TTC_11_24_EnableTimeBasedSchedulingGroups_IsConstraintValid(pVal: TTC_11_24_EnableTimeBasedSchedulingGroups): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = TTC_11_24_EnableTimeBasedSchedulingGroups_groups_IsConstraintValid(pVal.groups)
    ret
}

def TTC_11_24_EnableTimeBasedSchedulingGroups_groups_Initialize(): TTC_11_24_EnableTimeBasedSchedulingGroups_groups = TTC_11_24_EnableTimeBasedSchedulingGroups_groups(0, Vector.fill(4095)(ULong.fromRaw(0L)))
def TTC_11_24_EnableTimeBasedSchedulingGroups_Initialize(): TTC_11_24_EnableTimeBasedSchedulingGroups = TTC_11_24_EnableTimeBasedSchedulingGroups(groups = TTC_11_24_EnableTimeBasedSchedulingGroups_groups_Initialize())

@opaque @inlineOnce 
def TTC_11_24_EnableTimeBasedSchedulingGroups_ACN_Encode(pVal: TTC_11_24_EnableTimeBasedSchedulingGroups, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(131072L))
    var i1: Int = 0
    TTC_11_24_EnableTimeBasedSchedulingGroups_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    val TC_11_24_EnableTimeBasedSchedulingGroups_n = ULong.fromRaw(pVal.groups.nCount)
    if TC_11_24_EnableTimeBasedSchedulingGroups_n < ULong.fromRaw(0) || TC_11_24_EnableTimeBasedSchedulingGroups_n > ULong.fromRaw(4095) then
        return Left(860)
    /* Encode TC_11_24_EnableTimeBasedSchedulingGroups_n */
    locally {
        ghostExpr {
            @opaque @inlineOnce
            def bitCountLemma(v: ULong): Unit = {
                require(v <= ULong.fromRaw(4294967295L))
            }.ensuring(_ => GetBitCountUnsigned(v) <= 4294967295L)
            bitCountLemma(TC_11_24_EnableTimeBasedSchedulingGroups_n)
        }
    }
    codec.enc_Int_PositiveInteger_ConstSize_big_endian_32(TC_11_24_EnableTimeBasedSchedulingGroups_n)
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
    /* Encode groups */
    TC_11_24_EnableTimeBasedSchedulingGroups_groups_ACN_Encode(codec, pVal, TC_11_24_EnableTimeBasedSchedulingGroups_n, pVal.groups) match {
        case Left(l) =>
            return Left(l)
        case Right(_) =>
            ()
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 131072L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_1 = pVal.groups.size(codec_0_2.base.bitStream.bitIndex)
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
def PUS_11_24_TTC_11_24_EnableTimeBasedSchedulingGroups_groups_pVal_groups_groups_Encode_loop(codec: ACN, groups: TTC_11_24_EnableTimeBasedSchedulingGroups_groups, i1: Int): Either[Int, Int] = {
    require((0 <= i1) && (i1 <= groups.nCount))
    require((0 <= groups.nCount) && (groups.nCount <= groups.arr.size) && (groups.arr.size <= 4095))
    require(codec.base.bitStream.validate_offset_bits((32L * (groups.nCount - i1))))
    decreases(groups.nCount - i1)
    if (i1 == groups.nCount) {
        Right[Int, Int](0)
    } else {
        @ghost val codecSnap1 = snapshot(codec)
        ghostExpr {
            BitStream.validateOffsetBitsWeakeningLemma(codec.base.bitStream, 32L * (groups.nCount - i1), 32L)
        }
        TGroup_ID_ACN_Encode(groups.arr(i1), codec, false) match // uper:6
            case Right(_) =>
            case Left(err) => return Left(err)
        @ghost val codecSnap2 = snapshot(codec)
        ghostExpr {
            check(32L * (i1 + 1) == 32L * i1 + 32L)
            BitStream.validateOffsetBitsIneqLemma(codecSnap1.base.bitStream, codec.base.bitStream, 32L * (groups.nCount - i1), 32L)
            check(codec.base.bitStream.validate_offset_bits(32L * (groups.nCount - (i1 + 1))))
        }
        val res = PUS_11_24_TTC_11_24_EnableTimeBasedSchedulingGroups_groups_pVal_groups_groups_Encode_loop(codec, groups, i1 + 1)
        ghostExpr {
            (res match {
                case Left(_) =>
                    ()
                case Right(_) =>
                    assert(codec.base.bitStream.bitIndex == codecSnap2.base.bitStream.bitIndex + TTC_11_24_EnableTimeBasedSchedulingGroups_groups.sizeRange(groups.arr, codecSnap2.base.bitStream.bitIndex, i1 + 1, groups.nCount))
                    assert(codecSnap2.base.bitStream.bitIndex == codecSnap1.base.bitStream.bitIndex + 32L)
                    assert(TTC_11_24_EnableTimeBasedSchedulingGroups_groups.sizeRange(groups.arr, codecSnap1.base.bitStream.bitIndex, i1, groups.nCount) == TTC_11_24_EnableTimeBasedSchedulingGroups_groups.sizeRange(groups.arr, codecSnap2.base.bitStream.bitIndex, i1 + 1, groups.nCount) + 32L)
                    check(codec.base.bitStream.bitIndex == codecSnap1.base.bitStream.bitIndex + TTC_11_24_EnableTimeBasedSchedulingGroups_groups.sizeRange(groups.arr, codecSnap1.base.bitStream.bitIndex, i1, groups.nCount))
            })
        }
        res
    }
}.ensuring { (res: Either[Int, Int]) => 
    res match {
        case Left(_) =>
            true
        case Right(res) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + TTC_11_24_EnableTimeBasedSchedulingGroups_groups.sizeRange(groups.arr, old(codec).base.bitStream.bitIndex, i1, groups.nCount)
    }
}



@opaque @inlineOnce
def TC_11_24_EnableTimeBasedSchedulingGroups_groups_ACN_Encode(codec: ACN, pVal: TTC_11_24_EnableTimeBasedSchedulingGroups, TC_11_24_EnableTimeBasedSchedulingGroups_n: ULong, groups: TTC_11_24_EnableTimeBasedSchedulingGroups_groups): Either[Int, Int] = {
    require(codec.base.bitStream.validate_offset_bits(131040L))
    @ghost val oldCdc = snapshot(codec)
    TTC_11_24_EnableTimeBasedSchedulingGroups_groups_IsConstraintValid(groups) match {
        case Left(l) =>
            return Left[Int, Int](l)
        case Right(_) =>
    }
    @ghost val codec_0_1 = snapshot(codec)
    @ghost val codecBeforeLoop_0 = snapshot(codec)
    PUS_11_24_TTC_11_24_EnableTimeBasedSchedulingGroups_groups_pVal_groups_groups_Encode_loop(codec, groups, 0) match {
        case Left(l) =>
            return Left[Int, Int](l)
        case Right(_) =>
            ghostExpr {
                groups.sizeLemmaAnyOffset(codecBeforeLoop_0.base.bitStream.bitIndex, oldCdc.base.bitStream.bitIndex)
            }
    }
    Right[Int, Int](0)
}.ensuring { (res: Either[Int, Int]) => 
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + groups.size(old(codec).base.bitStream.bitIndex)
    }
}

@opaque @inlineOnce 
def TTC_11_24_EnableTimeBasedSchedulingGroups_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TTC_11_24_EnableTimeBasedSchedulingGroups] =
{
    require(codec.base.bitStream.validate_offset_bits(131072L))
    var i1: Int = 0

    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Decode TC_11_24_EnableTimeBasedSchedulingGroups_n */
    val TC_11_24_EnableTimeBasedSchedulingGroups_n = codec.dec_Int_PositiveInteger_ConstSize_big_endian_32()

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
    /* Decode groups */
    val pVal_groups = TC_11_24_EnableTimeBasedSchedulingGroups_groups_ACN_Decode(codec, TC_11_24_EnableTimeBasedSchedulingGroups_n) match {
        case LeftMut(l) =>
            return LeftMut(l)
        case RightMut(v) =>
            v
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 131072L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_1 = pVal_groups.size(codec_0_2.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 131072L)
    }
    val pVal = TTC_11_24_EnableTimeBasedSchedulingGroups(pVal_groups)
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0 + size_1)
    }

    TTC_11_24_EnableTimeBasedSchedulingGroups_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TTC_11_24_EnableTimeBasedSchedulingGroups](l)
        case Right(_) => RightMut[ErrorCode, TTC_11_24_EnableTimeBasedSchedulingGroups](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TTC_11_24_EnableTimeBasedSchedulingGroups]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTC_11_24_EnableTimeBasedSchedulingGroups_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TTC_11_24_EnableTimeBasedSchedulingGroups_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TTC_11_24_EnableTimeBasedSchedulingGroups]) =
{
    require(codec.base.bitStream.validate_offset_bits(131072L))
    val cpy = snapshot(codec)
    val res = TTC_11_24_EnableTimeBasedSchedulingGroups_ACN_Decode(cpy)
    (cpy, res)
}

@opaque @inlineOnce
def PUS_11_24_TTC_11_24_EnableTimeBasedSchedulingGroups_groups_pVal_groups_groups_Decode_loop(codec: ACN, nCount: Int, groups: Vector[ULong], i1: Int): EitherMut[Int, Vector[ULong]] = {
    require((0 <= nCount) && (nCount <= 4095))
    require((0 <= i1) && (i1 <= nCount))
    require(groups.size == i1)
    require(codec.base.bitStream.validate_offset_bits((32L * (nCount - i1))))
    decreases(nCount - i1)
    @ghost val codecSnap1 = snapshot(codec)
    (if (i1 == nCount) {
        ghostExpr {
            vecRangesEqReflexiveLemma(groups)
            vecRangesEqSlicedLemma(groups, groups, 0, groups.size, 0, i1)
        }
        RightMut[Int, Vector[ULong]](groups)
    } else {
        ghostExpr {
            BitStream.validateOffsetBitsWeakeningLemma(codec.base.bitStream, 32L * (nCount - i1), 32L)
        }
        val groups_arr_i1_ = TGroup_ID_ACN_Decode(codec) match // uper:13
            case RightMut(decData) => decData
            case LeftMut(err) => return LeftMut(err)
        @ghost val codecSnap2 = snapshot(codec)
        ghostExpr {
            check(32L * (i1 + 1) == 32L * i1 + 32L)
            BitStream.validateOffsetBitsIneqLemma(codecSnap1.base.bitStream, codec.base.bitStream, 32L * (nCount - i1), 32L)
            check(codec.base.bitStream.validate_offset_bits(32L * (nCount - (i1 + 1))))
        }
        val res = PUS_11_24_TTC_11_24_EnableTimeBasedSchedulingGroups_groups_pVal_groups_groups_Decode_loop(codec, nCount, groups.append(groups_arr_i1_), i1 + 1)
        ghostExpr {
            (res match {
                case LeftMut(_) =>
                    ()
                case RightMut(newVec) =>
                    vecRangesAppendDropEq(groups, newVec, groups_arr_i1_, 0, i1)
                    vecRangesEqImpliesEq(groups.append(groups_arr_i1_), newVec, 0, i1, i1 + 1)
                    ListSpecs.isnocIndex(groups.list, groups_arr_i1_, i1)
                    Vector.listApplyEqVecApply(groups.append(groups_arr_i1_), i1)
                    check(groups_arr_i1_ == newVec.apply(i1))
            })
        }
        res
    })
}.ensuring { (res: EitherMut[Int, Vector[ULong]]) => 
    res match {
        case LeftMut(_) =>
            true
        case RightMut(newVec) =>
            old(codec).base.buf == codec.base.buf && newVec.size == nCount && vecRangesEq(groups, newVec, 0, i1) && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + TTC_11_24_EnableTimeBasedSchedulingGroups_groups.sizeRange(newVec, old(codec).base.bitStream.bitIndex, i1, nCount)
    }
}



@opaque @inlineOnce
def TC_11_24_EnableTimeBasedSchedulingGroups_groups_ACN_Decode(codec: ACN, TC_11_24_EnableTimeBasedSchedulingGroups_n: ULong): EitherMut[Int, TTC_11_24_EnableTimeBasedSchedulingGroups_groups] = {
    require(codec.base.bitStream.validate_offset_bits(131040L))
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    val groups =
        if ((TC_11_24_EnableTimeBasedSchedulingGroups_n <= ULong.fromRaw(4095))) then
            val groups_nCount = TC_11_24_EnableTimeBasedSchedulingGroups_n.toRaw.toInt
            @ghost val codecBeforeLoop_0 = snapshot(codec)
            val groups = PUS_11_24_TTC_11_24_EnableTimeBasedSchedulingGroups_groups_pVal_groups_groups_Decode_loop(codec, groups_nCount, Vector.empty[ULong], 0) match {
                case LeftMut(l) =>
                    return LeftMut(l)
                case RightMut(bdg) =>
                    val groups = TTC_11_24_EnableTimeBasedSchedulingGroups_groups(groups_nCount, bdg)
                    ghostExpr {
                        groups.sizeLemmaAnyOffset(codecBeforeLoop_0.base.bitStream.bitIndex, oldCdc.base.bitStream.bitIndex)
                    }
                    groups
            }
            groups
        else return LeftMut(ERR_ACN_DECODE_TC_11_24_ENABLETIMEBASEDSCHEDULINGGROUPS_GROUPS)
    TTC_11_24_EnableTimeBasedSchedulingGroups_groups_IsConstraintValid(groups) match {
        case Left(l) =>
            LeftMut[Int, TTC_11_24_EnableTimeBasedSchedulingGroups_groups](l)
        case Right(_) =>
            RightMut[Int, TTC_11_24_EnableTimeBasedSchedulingGroups_groups](groups)
    }
}.ensuring { (res: EitherMut[Int, TTC_11_24_EnableTimeBasedSchedulingGroups_groups]) => 
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTC_11_24_EnableTimeBasedSchedulingGroups_groups_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure
def TC_11_24_EnableTimeBasedSchedulingGroups_groups_ACN_Decode_pure(codec: ACN, TC_11_24_EnableTimeBasedSchedulingGroups_n: ULong): (ACN, EitherMut[Int, TTC_11_24_EnableTimeBasedSchedulingGroups_groups]) = {
    require(codec.base.bitStream.validate_offset_bits(131040L))
    val cpy = snapshot(codec)
    val res = TC_11_24_EnableTimeBasedSchedulingGroups_groups_ACN_Decode(cpy, TC_11_24_EnableTimeBasedSchedulingGroups_n)
    (cpy, res)
}