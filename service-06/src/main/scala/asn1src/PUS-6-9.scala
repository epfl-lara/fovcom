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

val maxTC_6_9_DataAreaCount: Int = 63 // variables:188

def TTC_6_9_DataArea_IsConstraintValid(pVal: TTC_6_9_DataArea): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = TPUSC_UINT32_IsConstraintValid(pVal.startAddress)
    if ret.isRight then
        ret = TPUSC_UINT32_IsConstraintValid(pVal.length)
    ret
}

def TTC_6_9_DataArea_Initialize(): TTC_6_9_DataArea = TTC_6_9_DataArea(startAddress = ULong.fromRaw(0L), length = ULong.fromRaw(0L))

@opaque @inlineOnce 
def TTC_6_9_DataArea_ACN_Encode(pVal: TTC_6_9_DataArea, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(64L))
    TTC_6_9_DataArea_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Encode startAddress */
    TPUSC_UINT32_ACN_Encode(pVal.startAddress, codec, false) match // uper:6
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
    /* Encode length */
    TPUSC_UINT32_ACN_Encode(pVal.length, codec, false) match // uper:6
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
def TTC_6_9_DataArea_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TTC_6_9_DataArea] =
{
    require(codec.base.bitStream.validate_offset_bits(64L))

    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Decode startAddress */
    val pVal_startAddress = TPUSC_UINT32_ACN_Decode(codec) match // uper:13
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
    /* Decode length */
    val pVal_length = TPUSC_UINT32_ACN_Decode(codec) match // uper:13
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
    val pVal = TTC_6_9_DataArea(pVal_startAddress, pVal_length)
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0 + size_1)
    }

    TTC_6_9_DataArea_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TTC_6_9_DataArea](l)
        case Right(_) => RightMut[ErrorCode, TTC_6_9_DataArea](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TTC_6_9_DataArea]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTC_6_9_DataArea_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TTC_6_9_DataArea_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TTC_6_9_DataArea]) =
{
    require(codec.base.bitStream.validate_offset_bits(64L))
    val cpy = snapshot(codec)
    val res = TTC_6_9_DataArea_ACN_Decode(cpy)
    (cpy, res)
}

def TTC_6_9_CheckRawMemoryData_dataAreas_IsConstraintValid(pVal: TTC_6_9_CheckRawMemoryData_dataAreas): Either[ErrorCode, Int] =
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
            ret = TTC_6_9_DataArea_IsConstraintValid(pVal.arr(i1))
            i1 = i1 + 1
        }).invariant(0 <= i1 && i1 <= pVal.nCount)
    ret
}

def TTC_6_9_CheckRawMemoryData_IsConstraintValid(pVal: TTC_6_9_CheckRawMemoryData): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    pVal.memory_ID match
        case SomeMut(memory_ID) =>
            ret = TMemory_ID_IsConstraintValid(memory_ID)
        case NoneMut() =>
    if ret.isRight then
        ret = TTC_6_9_CheckRawMemoryData_dataAreas_IsConstraintValid(pVal.dataAreas)
    if ret.isRight then
        ret = (pVal.memory_ID.isDefined == true) match
            case true =>
                Right(0)
            case false =>
                Left(45)
    ret
}

def TTC_6_9_CheckRawMemoryData_dataAreas_Initialize(): TTC_6_9_CheckRawMemoryData_dataAreas = TTC_6_9_CheckRawMemoryData_dataAreas(1, Vector.fill(63)(TTC_6_9_DataArea_Initialize()))
def TTC_6_9_CheckRawMemoryData_Initialize(): TTC_6_9_CheckRawMemoryData = TTC_6_9_CheckRawMemoryData(memory_ID = SomeMut(TMemory_ID.TmemId1), dataAreas = TTC_6_9_CheckRawMemoryData_dataAreas_Initialize())

@opaque @inlineOnce 
def TTC_6_9_CheckRawMemoryData_ACN_Encode(pVal: TTC_6_9_CheckRawMemoryData, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(4096L))
    var i1: Int = 0
    TTC_6_9_CheckRawMemoryData_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    TC_6_9_CheckRawMemoryData_memory_ID_Optional_ACN_Encode(codec, pVal, pVal.memory_ID) match {
        case Left(l) =>
            return Left(l)
        case Right(_) =>
            ()
    }
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 4096L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_0 = pVal.memory_ID match {
        case SomeMut(v) =>
            32L
        case NoneMut() =>
            0L
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    val TC_6_9_CheckRawMemoryData_n = ULong.fromRaw(pVal.dataAreas.nCount)
    if TC_6_9_CheckRawMemoryData_n < ULong.fromRaw(1) || TC_6_9_CheckRawMemoryData_n > ULong.fromRaw(63) then
        return Left(860)
    /* Encode TC_6_9_CheckRawMemoryData_n */
    locally {
        ghostExpr {
            @opaque @inlineOnce
            def bitCountLemma(v: ULong): Unit = {
                require(v <= ULong.fromRaw(4294967295L))
            }.ensuring(_ => GetBitCountUnsigned(v) <= 4294967295L)
            bitCountLemma(TC_6_9_CheckRawMemoryData_n)
        }
    }
    codec.enc_Int_PositiveInteger_ConstSize_big_endian_32(TC_6_9_CheckRawMemoryData_n)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_2.base.bitStream, codec.base.bitStream, 4064L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 64L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_1 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    @ghost val codec_0_3 = snapshot(codec)
    /* Encode dataAreas */
    TC_6_9_CheckRawMemoryData_dataAreas_ACN_Encode(codec, pVal, TC_6_9_CheckRawMemoryData_n, pVal.dataAreas) match {
        case Left(l) =>
            return Left(l)
        case Right(_) =>
            ()
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 4096L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_2 = pVal.dataAreas.size(codec_0_3.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 4096L)
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
def TC_6_9_CheckRawMemoryData_memory_ID_Optional_ACN_Encode(codec: ACN, pVal: TTC_6_9_CheckRawMemoryData, memory_ID: OptionMut[TMemory_ID]): Either[Int, Int] = {
    require(codec.base.bitStream.validate_offset_bits(32L))
    @ghost val oldCdc = snapshot(codec)
    /* Encode memory_ID */
    /* marked as ALWAYS PRESENT, so it must be Some */
    memory_ID match
        case SomeMut(memory_ID) =>
            TMemory_ID_ACN_Encode(memory_ID, codec, false) match // uper:6
                case Right(_) =>
                case Left(err) => return Left(err)
        case NoneMut() => return Left(628)
    Right[Int, Int](0)
}.ensuring { (res: Either[Int, Int]) => 
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 32L
    }
}



@opaque @inlineOnce
def TC_6_9_CheckRawMemoryData_dataAreas_Encode_loop(codec: ACN, dataAreas: TTC_6_9_CheckRawMemoryData_dataAreas, i1: Int): Either[Int, Int] = {
    require((0 <= i1) && (i1 <= dataAreas.nCount))
    require((1 <= dataAreas.nCount) && (dataAreas.nCount <= dataAreas.arr.size) && (dataAreas.arr.size <= 63))
    require(codec.base.bitStream.validate_offset_bits((64L * (dataAreas.nCount - i1))))
    decreases(dataAreas.nCount - i1)
    if (i1 == dataAreas.nCount) {
        Right[Int, Int](0)
    } else {
        @ghost val codecSnap1 = snapshot(codec)
        ghostExpr {
            BitStream.validateOffsetBitsWeakeningLemma(codec.base.bitStream, 64L * (dataAreas.nCount - i1), 64L)
        }
        TTC_6_9_DataArea_ACN_Encode(dataAreas.arr(i1), codec, false) match // uper:6
            case Right(_) =>
            case Left(err) => return Left(err)
        @ghost val codecSnap2 = snapshot(codec)
        ghostExpr {
            check(64L * (i1 + 1) == 64L * i1 + 64L)
            BitStream.validateOffsetBitsIneqLemma(codecSnap1.base.bitStream, codec.base.bitStream, 64L * (dataAreas.nCount - i1), 64L)
            check(codec.base.bitStream.validate_offset_bits(64L * (dataAreas.nCount - (i1 + 1))))
        }
        val res = TC_6_9_CheckRawMemoryData_dataAreas_Encode_loop(codec, dataAreas, i1 + 1)
        ghostExpr {
            (res match {
                case Left(_) =>
                    ()
                case Right(_) =>
                    assert(codec.base.bitStream.bitIndex == codecSnap2.base.bitStream.bitIndex + TTC_6_9_CheckRawMemoryData_dataAreas.sizeRange(dataAreas.arr, codecSnap2.base.bitStream.bitIndex, i1 + 1, dataAreas.nCount))
                    assert(codecSnap2.base.bitStream.bitIndex == codecSnap1.base.bitStream.bitIndex + dataAreas.arr.apply(i1).size(codecSnap1.base.bitStream.bitIndex))
                    assert(TTC_6_9_CheckRawMemoryData_dataAreas.sizeRange(dataAreas.arr, codecSnap1.base.bitStream.bitIndex, i1, dataAreas.nCount) == dataAreas.arr.apply(i1).size(codecSnap1.base.bitStream.bitIndex) + TTC_6_9_CheckRawMemoryData_dataAreas.sizeRange(dataAreas.arr, codecSnap2.base.bitStream.bitIndex, i1 + 1, dataAreas.nCount))
                    check(codec.base.bitStream.bitIndex == codecSnap1.base.bitStream.bitIndex + TTC_6_9_CheckRawMemoryData_dataAreas.sizeRange(dataAreas.arr, codecSnap1.base.bitStream.bitIndex, i1, dataAreas.nCount))
            })
        }
        res
    }
}.ensuring { (res: Either[Int, Int]) => 
    res match {
        case Left(_) =>
            true
        case Right(res) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + TTC_6_9_CheckRawMemoryData_dataAreas.sizeRange(dataAreas.arr, old(codec).base.bitStream.bitIndex, i1, dataAreas.nCount)
    }
}



@opaque @inlineOnce
def TC_6_9_CheckRawMemoryData_dataAreas_ACN_Encode(codec: ACN, pVal: TTC_6_9_CheckRawMemoryData, TC_6_9_CheckRawMemoryData_n: ULong, dataAreas: TTC_6_9_CheckRawMemoryData_dataAreas): Either[Int, Int] = {
    require(codec.base.bitStream.validate_offset_bits(4032L))
    @ghost val oldCdc = snapshot(codec)
    TTC_6_9_CheckRawMemoryData_dataAreas_IsConstraintValid(dataAreas) match {
        case Left(l) =>
            return Left[Int, Int](l)
        case Right(_) =>
    }
    @ghost val codec_0_1 = snapshot(codec)
    @ghost val codecBeforeLoop_0 = snapshot(codec)
    TC_6_9_CheckRawMemoryData_dataAreas_Encode_loop(codec, dataAreas, 0) match {
        case Left(l) =>
            return Left[Int, Int](l)
        case Right(_) =>
            ghostExpr {
                dataAreas.sizeLemmaAnyOffset(codecBeforeLoop_0.base.bitStream.bitIndex, oldCdc.base.bitStream.bitIndex)
            }
            ()
    }
    Right[Int, Int](0)
}.ensuring { (res: Either[Int, Int]) => 
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + dataAreas.size(old(codec).base.bitStream.bitIndex)
    }
}

@opaque @inlineOnce 
def TTC_6_9_CheckRawMemoryData_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TTC_6_9_CheckRawMemoryData] =
{
    require(codec.base.bitStream.validate_offset_bits(4096L))
    var i1: Int = 0

    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    val pVal_memory_ID = TC_6_9_CheckRawMemoryData_memory_ID_Optional_ACN_Decode(codec) match {
        case LeftMut(l) =>
            return LeftMut(l)
        case RightMut(v) =>
            v
    }
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 4096L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_0 = pVal_memory_ID match {
        case SomeMut(v) =>
            32L
        case NoneMut() =>
            0L
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Decode TC_6_9_CheckRawMemoryData_n */
    val TC_6_9_CheckRawMemoryData_n = codec.dec_Int_PositiveInteger_ConstSize_big_endian_32()

    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_2.base.bitStream, codec.base.bitStream, 4064L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 64L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_1 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    @ghost val codec_0_3 = snapshot(codec)
    /* Decode dataAreas */
    val pVal_dataAreas = TC_6_9_CheckRawMemoryData_dataAreas_ACN_Decode(codec, TC_6_9_CheckRawMemoryData_n) match {
        case LeftMut(l) =>
            return LeftMut(l)
        case RightMut(v) =>
            v
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 4096L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_2 = pVal_dataAreas.size(codec_0_3.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 4096L)
    }
    val pVal = TTC_6_9_CheckRawMemoryData(pVal_memory_ID, pVal_dataAreas)
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0 + size_1 + size_2)
    }

    TTC_6_9_CheckRawMemoryData_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TTC_6_9_CheckRawMemoryData](l)
        case Right(_) => RightMut[ErrorCode, TTC_6_9_CheckRawMemoryData](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TTC_6_9_CheckRawMemoryData]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTC_6_9_CheckRawMemoryData_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TTC_6_9_CheckRawMemoryData_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TTC_6_9_CheckRawMemoryData]) =
{
    require(codec.base.bitStream.validate_offset_bits(4096L))
    val cpy = snapshot(codec)
    val res = TTC_6_9_CheckRawMemoryData_ACN_Decode(cpy)
    (cpy, res)
}

@opaque @inlineOnce
def TC_6_9_CheckRawMemoryData_memory_ID_Optional_ACN_Decode(codec: ACN): EitherMut[Int, OptionMut[TMemory_ID]] = {
    require(codec.base.bitStream.validate_offset_bits(32L))
    @ghost val oldCdc = snapshot(codec)
    /* Decode memory_ID */
    /* marked as ALWAYS PRESENT */
    val memory_ID: OptionMut[TMemory_ID] =
        val pVal_memory_ID = TMemory_ID_ACN_Decode(codec) match // uper:13
            case RightMut(decData) => decData
            case LeftMut(err) => return LeftMut(err)
        SomeMut(pVal_memory_ID)
    RightMut[Int, OptionMut[TMemory_ID]](memory_ID)
}.ensuring { (res: EitherMut[Int, OptionMut[TMemory_ID]]) => 
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            resVal.isDefined && old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 32L
    }
}



@ghost @pure
def TC_6_9_CheckRawMemoryData_memory_ID_Optional_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[Int, OptionMut[TMemory_ID]]) = {
    require(codec.base.bitStream.validate_offset_bits(32L))
    val cpy = snapshot(codec)
    val res = TC_6_9_CheckRawMemoryData_memory_ID_Optional_ACN_Decode(cpy)
    (cpy, res)
}



@opaque @inlineOnce
def TC_6_9_CheckRawMemoryData_dataAreas_Decode_loop(codec: ACN, nCount: Int, dataAreas: Vector[TTC_6_9_DataArea], i1: Int): EitherMut[Int, Vector[TTC_6_9_DataArea]] = {
    require((1 <= nCount) && (nCount <= 63))
    require((0 <= i1) && (i1 <= nCount))
    require(dataAreas.size == i1)
    require(codec.base.bitStream.validate_offset_bits((64L * (nCount - i1))))
    decreases(nCount - i1)
    @ghost val codecSnap1 = snapshot(codec)
    (if (i1 == nCount) {
        ghostExpr {
            vecRangesEqReflexiveLemma(dataAreas)
            vecRangesEqSlicedLemma(dataAreas, dataAreas, 0, dataAreas.size, 0, i1)
        }
        RightMut[Int, Vector[TTC_6_9_DataArea]](dataAreas)
    } else {
        ghostExpr {
            BitStream.validateOffsetBitsWeakeningLemma(codec.base.bitStream, 64L * (nCount - i1), 64L)
        }
        val dataAreas_arr_i1_ = TTC_6_9_DataArea_ACN_Decode(codec) match // uper:13
            case RightMut(decData) => decData
            case LeftMut(err) => return LeftMut(err)
        @ghost val codecSnap2 = snapshot(codec)
        ghostExpr {
            check(64L * (i1 + 1) == 64L * i1 + 64L)
            BitStream.validateOffsetBitsIneqLemma(codecSnap1.base.bitStream, codec.base.bitStream, 64L * (nCount - i1), 64L)
            check(codec.base.bitStream.validate_offset_bits(64L * (nCount - (i1 + 1))))
        }
        val res = TC_6_9_CheckRawMemoryData_dataAreas_Decode_loop(codec, nCount, dataAreas.append(dataAreas_arr_i1_), i1 + 1)
        ghostExpr {
            (res match {
                case LeftMut(_) =>
                    ()
                case RightMut(newVec) =>
                    vecRangesAppendDropEq(dataAreas, newVec, dataAreas_arr_i1_, 0, i1)
                    vecRangesEqImpliesEq(dataAreas.append(dataAreas_arr_i1_), newVec, 0, i1, i1 + 1)
                    ListSpecs.isnocIndex(dataAreas.list, dataAreas_arr_i1_, i1)
                    Vector.listApplyEqVecApply(dataAreas.append(dataAreas_arr_i1_), i1)
                    check(dataAreas_arr_i1_ == newVec.apply(i1))
            })
        }
        res
    })
}.ensuring { (res: EitherMut[Int, Vector[TTC_6_9_DataArea]]) => 
    res match {
        case LeftMut(_) =>
            true
        case RightMut(newVec) =>
            old(codec).base.buf == codec.base.buf && newVec.size == nCount && vecRangesEq(dataAreas, newVec, 0, i1) && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + TTC_6_9_CheckRawMemoryData_dataAreas.sizeRange(newVec, old(codec).base.bitStream.bitIndex, i1, nCount)
    }
}



@opaque @inlineOnce
def TC_6_9_CheckRawMemoryData_dataAreas_ACN_Decode(codec: ACN, TC_6_9_CheckRawMemoryData_n: ULong): EitherMut[Int, TTC_6_9_CheckRawMemoryData_dataAreas] = {
    require(codec.base.bitStream.validate_offset_bits(4032L))
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    val dataAreas =
        if ((ULong.fromRaw(1) <= TC_6_9_CheckRawMemoryData_n) && (TC_6_9_CheckRawMemoryData_n <= ULong.fromRaw(63))) then
            val dataAreas_nCount = TC_6_9_CheckRawMemoryData_n.toRaw.toInt
            @ghost val codecBeforeLoop_0 = snapshot(codec)
            val dataAreas = TC_6_9_CheckRawMemoryData_dataAreas_Decode_loop(codec, dataAreas_nCount, Vector.empty[TTC_6_9_DataArea], 0) match {
                case LeftMut(l) =>
                    return LeftMut(l)
                case RightMut(bdg) =>
                    val dataAreas = TTC_6_9_CheckRawMemoryData_dataAreas(dataAreas_nCount, bdg)
                    ghostExpr {
                        dataAreas.sizeLemmaAnyOffset(codecBeforeLoop_0.base.bitStream.bitIndex, oldCdc.base.bitStream.bitIndex)
                    }
                    dataAreas
            }
            dataAreas
        else return LeftMut(ERR_ACN_DECODE_TC_6_9_CHECKRAWMEMORYDATA_DATAAREAS)
    TTC_6_9_CheckRawMemoryData_dataAreas_IsConstraintValid(dataAreas) match {
        case Left(l) =>
            LeftMut[Int, TTC_6_9_CheckRawMemoryData_dataAreas](l)
        case Right(_) =>
            RightMut[Int, TTC_6_9_CheckRawMemoryData_dataAreas](dataAreas)
    }
}.ensuring { (res: EitherMut[Int, TTC_6_9_CheckRawMemoryData_dataAreas]) => 
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTC_6_9_CheckRawMemoryData_dataAreas_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure
def TC_6_9_CheckRawMemoryData_dataAreas_ACN_Decode_pure(codec: ACN, TC_6_9_CheckRawMemoryData_n: ULong): (ACN, EitherMut[Int, TTC_6_9_CheckRawMemoryData_dataAreas]) = {
    require(codec.base.bitStream.validate_offset_bits(4032L))
    val cpy = snapshot(codec)
    val res = TC_6_9_CheckRawMemoryData_dataAreas_ACN_Decode(cpy, TC_6_9_CheckRawMemoryData_n)
    (cpy, res)
}