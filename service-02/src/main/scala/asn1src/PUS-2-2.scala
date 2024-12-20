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

val maxTC_2_2_RegisterCommandCount: Int = 63 // variables:188

def TTC_2_2_DistributeRegisterCommands_registerCommands_IsConstraintValid(pVal: TTC_2_2_DistributeRegisterCommands_registerCommands): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    var i1: Int = 0
    ret = ((1 <= pVal.nCount) && (pVal.nCount <= 63)) match
        case true =>
            Right(0)
        case false =>
            Left(45)
    if ret.isRight then
        i1 = 0
        (while(i1 < pVal.nCount && ret.isRight) {
            decreases(pVal.nCount - i1)
            ret = TRegister_IsConstraintValid(pVal.arr(i1))
            i1 = i1 + 1
        }).invariant(0 <= i1 && i1 <= pVal.nCount)
    ret
}

def TTC_2_2_DistributeRegisterCommands_IsConstraintValid(pVal: TTC_2_2_DistributeRegisterCommands): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = TTC_2_2_DistributeRegisterCommands_registerCommands_IsConstraintValid(pVal.registerCommands)
    ret
}

def TTC_2_2_DistributeRegisterCommands_registerCommands_Initialize(): TTC_2_2_DistributeRegisterCommands_registerCommands = TTC_2_2_DistributeRegisterCommands_registerCommands(1, Vector.fill(63)(TRegister_Initialize()))
def TTC_2_2_DistributeRegisterCommands_Initialize(): TTC_2_2_DistributeRegisterCommands = TTC_2_2_DistributeRegisterCommands(registerCommands = TTC_2_2_DistributeRegisterCommands_registerCommands_Initialize())

@opaque @inlineOnce 
def TTC_2_2_DistributeRegisterCommands_ACN_Encode(pVal: TTC_2_2_DistributeRegisterCommands, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(2552L))
    var i1: Int = 0
    TTC_2_2_DistributeRegisterCommands_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    val TC_2_2_DistributeRegisterCommands_n = ULong.fromRaw(pVal.registerCommands.nCount)
    if TC_2_2_DistributeRegisterCommands_n < ULong.fromRaw(1) || TC_2_2_DistributeRegisterCommands_n > ULong.fromRaw(63) then
        return Left(860)
    /* Encode TC_2_2_DistributeRegisterCommands_n */
    locally {
        ghostExpr {
            @opaque @inlineOnce
            def bitCountLemma(v: ULong): Unit = {
                require(v <= ULong.fromRaw(4294967295L))
            }.ensuring(_ => GetBitCountUnsigned(v) <= 4294967295L)
            bitCountLemma(TC_2_2_DistributeRegisterCommands_n)
        }
    }
    codec.enc_Int_PositiveInteger_ConstSize_big_endian_32(TC_2_2_DistributeRegisterCommands_n)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 2552L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_0 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Encode registerCommands */
    TC_2_2_DistributeRegisterCommands_registerCommands_ACN_Encode(codec, pVal, TC_2_2_DistributeRegisterCommands_n, pVal.registerCommands) match {
        case Left(l) =>
            return Left(l)
        case Right(_) =>
            ()
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 2552L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_1 = pVal.registerCommands.size(codec_0_2.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 2552L)
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
def TC_2_2_DistributeRegisterCommands_registerCommands_Encode_loop(codec: ACN, registerCommands: TTC_2_2_DistributeRegisterCommands_registerCommands, i1: Int): Either[Int, Int] = {
    require((0 <= i1) && (i1 <= registerCommands.nCount))
    require((1 <= registerCommands.nCount) && (registerCommands.nCount <= registerCommands.arr.size) && (registerCommands.arr.size <= 63))
    require(codec.base.bitStream.validate_offset_bits((40L * (registerCommands.nCount - i1))))
    decreases(registerCommands.nCount - i1)
    if (i1 == registerCommands.nCount) {
        Right[Int, Int](0)
    } else {
        @ghost val codecSnap1 = snapshot(codec)
        ghostExpr {
            BitStream.validateOffsetBitsWeakeningLemma(codec.base.bitStream, 40L * (registerCommands.nCount - i1), 40L)
        }
        TRegister_ACN_Encode(registerCommands.arr(i1), codec, false) match // uper:6
            case Right(_) =>
            case Left(err) => return Left(err)
        @ghost val codecSnap2 = snapshot(codec)
        ghostExpr {
            check(40L * (i1 + 1) == 40L * i1 + 40L)
            BitStream.validateOffsetBitsIneqLemma(codecSnap1.base.bitStream, codec.base.bitStream, 40L * (registerCommands.nCount - i1), 40L)
            check(codec.base.bitStream.validate_offset_bits(40L * (registerCommands.nCount - (i1 + 1))))
        }
        val res = TC_2_2_DistributeRegisterCommands_registerCommands_Encode_loop(codec, registerCommands, i1 + 1)
        ghostExpr {
            (res match {
                case Left(_) =>
                    ()
                case Right(_) =>
                    assert(codec.base.bitStream.bitIndex == codecSnap2.base.bitStream.bitIndex + TTC_2_2_DistributeRegisterCommands_registerCommands.sizeRange(registerCommands.arr, codecSnap2.base.bitStream.bitIndex, i1 + 1, registerCommands.nCount))
                    assert(codecSnap2.base.bitStream.bitIndex == codecSnap1.base.bitStream.bitIndex + registerCommands.arr.apply(i1).size(codecSnap1.base.bitStream.bitIndex))
                    assert(TTC_2_2_DistributeRegisterCommands_registerCommands.sizeRange(registerCommands.arr, codecSnap1.base.bitStream.bitIndex, i1, registerCommands.nCount) == registerCommands.arr.apply(i1).size(codecSnap1.base.bitStream.bitIndex) + TTC_2_2_DistributeRegisterCommands_registerCommands.sizeRange(registerCommands.arr, codecSnap2.base.bitStream.bitIndex, i1 + 1, registerCommands.nCount))
                    check(codec.base.bitStream.bitIndex == codecSnap1.base.bitStream.bitIndex + TTC_2_2_DistributeRegisterCommands_registerCommands.sizeRange(registerCommands.arr, codecSnap1.base.bitStream.bitIndex, i1, registerCommands.nCount))
            })
        }
        res
    }
}.ensuring { (res: Either[Int, Int]) => 
    res match {
        case Left(_) =>
            true
        case Right(res) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + TTC_2_2_DistributeRegisterCommands_registerCommands.sizeRange(registerCommands.arr, old(codec).base.bitStream.bitIndex, i1, registerCommands.nCount)
    }
}



@opaque @inlineOnce
def TC_2_2_DistributeRegisterCommands_registerCommands_ACN_Encode(codec: ACN, pVal: TTC_2_2_DistributeRegisterCommands, TC_2_2_DistributeRegisterCommands_n: ULong, registerCommands: TTC_2_2_DistributeRegisterCommands_registerCommands): Either[Int, Int] = {
    require(codec.base.bitStream.validate_offset_bits(2520L))
    @ghost val oldCdc = snapshot(codec)
    TTC_2_2_DistributeRegisterCommands_registerCommands_IsConstraintValid(registerCommands) match {
        case Left(l) =>
            return Left[Int, Int](l)
        case Right(_) =>
    }
    @ghost val codec_0_1 = snapshot(codec)
    @ghost val codecBeforeLoop_0 = snapshot(codec)
    TC_2_2_DistributeRegisterCommands_registerCommands_Encode_loop(codec, registerCommands, 0) match {
        case Left(l) =>
            return Left[Int, Int](l)
        case Right(_) =>
            ghostExpr {
                registerCommands.sizeLemmaAnyOffset(codecBeforeLoop_0.base.bitStream.bitIndex, oldCdc.base.bitStream.bitIndex)
            }
            ()
    }
    Right[Int, Int](0)
}.ensuring { (res: Either[Int, Int]) => 
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + registerCommands.size(old(codec).base.bitStream.bitIndex)
    }
}

@opaque @inlineOnce 
def TTC_2_2_DistributeRegisterCommands_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TTC_2_2_DistributeRegisterCommands] =
{
    require(codec.base.bitStream.validate_offset_bits(2552L))
    var i1: Int = 0

    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Decode TC_2_2_DistributeRegisterCommands_n */
    val TC_2_2_DistributeRegisterCommands_n = codec.dec_Int_PositiveInteger_ConstSize_big_endian_32()

    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 2552L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_0 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Decode registerCommands */
    val pVal_registerCommands = TC_2_2_DistributeRegisterCommands_registerCommands_ACN_Decode(codec, TC_2_2_DistributeRegisterCommands_n) match {
        case LeftMut(l) =>
            return LeftMut(l)
        case RightMut(v) =>
            v
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 2552L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_1 = pVal_registerCommands.size(codec_0_2.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 2552L)
    }
    val pVal = TTC_2_2_DistributeRegisterCommands(pVal_registerCommands)
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0 + size_1)
    }

    TTC_2_2_DistributeRegisterCommands_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TTC_2_2_DistributeRegisterCommands](l)
        case Right(_) => RightMut[ErrorCode, TTC_2_2_DistributeRegisterCommands](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TTC_2_2_DistributeRegisterCommands]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTC_2_2_DistributeRegisterCommands_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TTC_2_2_DistributeRegisterCommands_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TTC_2_2_DistributeRegisterCommands]) =
{
    require(codec.base.bitStream.validate_offset_bits(2552L))
    val cpy = snapshot(codec)
    val res = TTC_2_2_DistributeRegisterCommands_ACN_Decode(cpy)
    (cpy, res)
}

@opaque @inlineOnce
def TC_2_2_DistributeRegisterCommands_registerCommands_Decode_loop(codec: ACN, nCount: Int, registerCommands: Vector[TRegister], i1: Int): EitherMut[Int, Vector[TRegister]] = {
    require((1 <= nCount) && (nCount <= 63))
    require((0 <= i1) && (i1 <= nCount))
    require(registerCommands.size == i1)
    require(codec.base.bitStream.validate_offset_bits((40L * (nCount - i1))))
    decreases(nCount - i1)
    @ghost val codecSnap1 = snapshot(codec)
    (if (i1 == nCount) {
        ghostExpr {
            vecRangesEqReflexiveLemma(registerCommands)
            vecRangesEqSlicedLemma(registerCommands, registerCommands, 0, registerCommands.size, 0, i1)
        }
        RightMut[Int, Vector[TRegister]](registerCommands)
    } else {
        ghostExpr {
            BitStream.validateOffsetBitsWeakeningLemma(codec.base.bitStream, 40L * (nCount - i1), 40L)
        }
        val registerCommands_arr_i1_ = TRegister_ACN_Decode(codec) match // uper:13
            case RightMut(decData) => decData
            case LeftMut(err) => return LeftMut(err)
        @ghost val codecSnap2 = snapshot(codec)
        ghostExpr {
            check(40L * (i1 + 1) == 40L * i1 + 40L)
            BitStream.validateOffsetBitsIneqLemma(codecSnap1.base.bitStream, codec.base.bitStream, 40L * (nCount - i1), 40L)
            check(codec.base.bitStream.validate_offset_bits(40L * (nCount - (i1 + 1))))
        }
        val res = TC_2_2_DistributeRegisterCommands_registerCommands_Decode_loop(codec, nCount, registerCommands.append(registerCommands_arr_i1_), i1 + 1)
        ghostExpr {
            (res match {
                case LeftMut(_) =>
                    ()
                case RightMut(newVec) =>
                    vecRangesAppendDropEq(registerCommands, newVec, registerCommands_arr_i1_, 0, i1)
                    vecRangesEqImpliesEq(registerCommands.append(registerCommands_arr_i1_), newVec, 0, i1, i1 + 1)
                    ListSpecs.isnocIndex(registerCommands.list, registerCommands_arr_i1_, i1)
                    Vector.listApplyEqVecApply(registerCommands.append(registerCommands_arr_i1_), i1)
                    check(registerCommands_arr_i1_ == newVec.apply(i1))
            })
        }
        res
    })
}.ensuring { (res: EitherMut[Int, Vector[TRegister]]) => 
    res match {
        case LeftMut(_) =>
            true
        case RightMut(newVec) =>
            old(codec).base.buf == codec.base.buf && newVec.size == nCount && vecRangesEq(registerCommands, newVec, 0, i1) && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + TTC_2_2_DistributeRegisterCommands_registerCommands.sizeRange(newVec, old(codec).base.bitStream.bitIndex, i1, nCount)
    }
}



@opaque @inlineOnce
def TC_2_2_DistributeRegisterCommands_registerCommands_ACN_Decode(codec: ACN, TC_2_2_DistributeRegisterCommands_n: ULong): EitherMut[Int, TTC_2_2_DistributeRegisterCommands_registerCommands] = {
    require(codec.base.bitStream.validate_offset_bits(2520L))
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    val registerCommands =
        if ((ULong.fromRaw(1) <= TC_2_2_DistributeRegisterCommands_n) && (TC_2_2_DistributeRegisterCommands_n <= ULong.fromRaw(63))) then
            val registerCommands_nCount = TC_2_2_DistributeRegisterCommands_n.toRaw.toInt
            @ghost val codecBeforeLoop_0 = snapshot(codec)
            val registerCommands = TC_2_2_DistributeRegisterCommands_registerCommands_Decode_loop(codec, registerCommands_nCount, Vector.empty[TRegister], 0) match {
                case LeftMut(l) =>
                    return LeftMut(l)
                case RightMut(bdg) =>
                    val registerCommands = TTC_2_2_DistributeRegisterCommands_registerCommands(registerCommands_nCount, bdg)
                    ghostExpr {
                        registerCommands.sizeLemmaAnyOffset(codecBeforeLoop_0.base.bitStream.bitIndex, oldCdc.base.bitStream.bitIndex)
                    }
                    registerCommands
            }
            registerCommands
        else return LeftMut(ERR_ACN_DECODE_TC_2_2_DISTRIBUTEREGISTERCOMMANDS_REGISTERCOMMANDS)
    TTC_2_2_DistributeRegisterCommands_registerCommands_IsConstraintValid(registerCommands) match {
        case Left(l) =>
            LeftMut[Int, TTC_2_2_DistributeRegisterCommands_registerCommands](l)
        case Right(_) =>
            RightMut[Int, TTC_2_2_DistributeRegisterCommands_registerCommands](registerCommands)
    }
}.ensuring { (res: EitherMut[Int, TTC_2_2_DistributeRegisterCommands_registerCommands]) => 
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTC_2_2_DistributeRegisterCommands_registerCommands_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure
def TC_2_2_DistributeRegisterCommands_registerCommands_ACN_Decode_pure(codec: ACN, TC_2_2_DistributeRegisterCommands_n: ULong): (ACN, EitherMut[Int, TTC_2_2_DistributeRegisterCommands_registerCommands]) = {
    require(codec.base.bitStream.validate_offset_bits(2520L))
    val cpy = snapshot(codec)
    val res = TC_2_2_DistributeRegisterCommands_registerCommands_ACN_Decode(cpy, TC_2_2_DistributeRegisterCommands_n)
    (cpy, res)
}