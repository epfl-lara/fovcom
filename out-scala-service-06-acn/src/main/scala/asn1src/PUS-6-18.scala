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


def TTM_6_18_CheckedObjectMemoryObjectReport_checksum_IsConstraintValid(@annotation.unused pVal: TTM_6_18_CheckedObjectMemoryObjectReport_checksum): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = Right(0)
    ret
}

def TTM_6_18_CheckedObjectMemoryObjectReport_IsConstraintValid(pVal: TTM_6_18_CheckedObjectMemoryObjectReport): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = TBase_IsConstraintValid(pVal.base_ID)
    if ret.isRight then
        ret = TPUSC_UINT32_IsConstraintValid(pVal.length)
        if ret.isRight then
            ret = TTM_6_18_CheckedObjectMemoryObjectReport_checksum_IsConstraintValid(pVal.checksum)
    ret
}

def TTM_6_18_CheckedObjectMemoryObjectReport_checksum_Initialize(): TTM_6_18_CheckedObjectMemoryObjectReport_checksum = TTM_6_18_CheckedObjectMemoryObjectReport_checksum(Vector.fill(2)(0.toRawUByte))
def TTM_6_18_CheckedObjectMemoryObjectReport_Initialize(): TTM_6_18_CheckedObjectMemoryObjectReport = TTM_6_18_CheckedObjectMemoryObjectReport(base_ID = ULong.fromRaw(0L), length = ULong.fromRaw(0L), checksum = TTM_6_18_CheckedObjectMemoryObjectReport_checksum(Vector.fill(2)(0.toRawUByte)))

@opaque @inlineOnce 
def TTM_6_18_CheckedObjectMemoryObjectReport_ACN_Encode(pVal: TTM_6_18_CheckedObjectMemoryObjectReport, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(56L))
    TTM_6_18_CheckedObjectMemoryObjectReport_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Encode base_ID */
    TBase_ACN_Encode(pVal.base_ID, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 56L, 8L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 8L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_0 = 8L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Encode length */
    TPUSC_UINT32_ACN_Encode(pVal.length, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_2.base.bitStream, codec.base.bitStream, 48L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 40L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_1 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    @ghost val codec_0_3 = snapshot(codec)
    /* Encode checksum */
    assert(16.toInt >= 0) // overflow may happen during cast
    codec.base.bitStream.appendBitsMSBFirstVec(pVal.checksum.arr, 16.toInt)

    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 56L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_2 = 16L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 56L)
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
def TTM_6_18_CheckedObjectMemoryObjectReport_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TTM_6_18_CheckedObjectMemoryObjectReport] =
{
    require(codec.base.bitStream.validate_offset_bits(56L))

    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Decode base_ID */
    val pVal_base_ID = TBase_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 56L, 8L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 8L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_0 = 8L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Decode length */
    val pVal_length = TPUSC_UINT32_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_2.base.bitStream, codec.base.bitStream, 48L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 40L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_1 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    @ghost val codec_0_3 = snapshot(codec)
    /* Decode checksum */
    val pVal_checksum = TTM_6_18_CheckedObjectMemoryObjectReport_checksum(codec.base.bitStream.readBitsVec(16.toInt))
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 56L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_2 = 16L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 56L)
    }
    val pVal = TTM_6_18_CheckedObjectMemoryObjectReport(pVal_base_ID, pVal_length, pVal_checksum)
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0 + size_1 + size_2)
    }

    TTM_6_18_CheckedObjectMemoryObjectReport_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TTM_6_18_CheckedObjectMemoryObjectReport](l)
        case Right(_) => RightMut[ErrorCode, TTM_6_18_CheckedObjectMemoryObjectReport](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TTM_6_18_CheckedObjectMemoryObjectReport]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTM_6_18_CheckedObjectMemoryObjectReport_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TTM_6_18_CheckedObjectMemoryObjectReport_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TTM_6_18_CheckedObjectMemoryObjectReport]) =
{
    require(codec.base.bitStream.validate_offset_bits(56L))
    val cpy = snapshot(codec)
    val res = TTM_6_18_CheckedObjectMemoryObjectReport_ACN_Decode(cpy)
    (cpy, res)
}

def TTM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_checksum_IsConstraintValid(@annotation.unused pVal: TTM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_checksum): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = Right(0)
    ret
}

def TTM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_IsConstraintValid(pVal: TTM_6_18_CheckedObjectMemoryObjectReportMultipleMemid): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = TBaseMultipleMemid_IsConstraintValid(pVal.base_ID)
    if ret.isRight then
        ret = TPUSC_UINT32_IsConstraintValid(pVal.length)
        if ret.isRight then
            ret = TTM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_checksum_IsConstraintValid(pVal.checksum)
    ret
}

def TTM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_checksum_Initialize(): TTM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_checksum = TTM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_checksum(Vector.fill(2)(0.toRawUByte))
def TTM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_Initialize(): TTM_6_18_CheckedObjectMemoryObjectReportMultipleMemid = TTM_6_18_CheckedObjectMemoryObjectReportMultipleMemid(base_ID = TBaseMultipleMemid_Initialize(), length = ULong.fromRaw(0L), checksum = TTM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_checksum(Vector.fill(2)(0.toRawUByte)))

@opaque @inlineOnce 
def TTM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_ACN_Encode(pVal: TTM_6_18_CheckedObjectMemoryObjectReportMultipleMemid, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(88L))
    TTM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    val TM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_memory_ID = pVal.base_ID match
        case TBaseMultipleMemid.BaseMultipleMemid_memId1_PRESENT(_) =>TMemory_ID.TmemId1

    /* Encode TM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_memory_ID */
    val intVal_TM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_memory_ID = TM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_memory_ID match
        case TMemory_ID.TmemId1 => ULong.fromRaw(0L)

    locally {
        ghostExpr {
            @opaque @inlineOnce
            def bitCountLemma(v: ULong): Unit = {
                require(v <= ULong.fromRaw(0))
            }.ensuring(_ => GetBitCountUnsigned(v) <= 4294967295L)
            bitCountLemma(intVal_TM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_memory_ID)
        }
    }
    codec.enc_Int_PositiveInteger_ConstSize_big_endian_32(intVal_TM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_memory_ID)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 88L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_0 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Encode base_ID */
    TM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_base_ID_ACN_Encode(codec, pVal, TM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_memory_ID, pVal.base_ID) match {
        case Left(l) =>
            return Left(l)
        case Right(_) =>
            ()
    }
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_2.base.bitStream, codec.base.bitStream, 56L, 8L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 40L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_1 = pVal.base_ID match {
        case TBaseMultipleMemid.BaseMultipleMemid_memId1_PRESENT(memId1) =>
            8L
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    @ghost val codec_0_3 = snapshot(codec)
    /* Encode length */
    TPUSC_UINT32_ACN_Encode(pVal.length, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_3.base.bitStream, codec.base.bitStream, 48L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 72L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_2 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2)
    }
    @ghost val codec_0_4 = snapshot(codec)
    /* Encode checksum */
    assert(16.toInt >= 0) // overflow may happen during cast
    codec.base.bitStream.appendBitsMSBFirstVec(pVal.checksum.arr, 16.toInt)

    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 88L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_3 = 16L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2 + size_3)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 88L)
    }
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0 + size_1 + size_2 + size_3)
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
def TM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_base_ID_ACN_Encode(codec: ACN, pVal: TTM_6_18_CheckedObjectMemoryObjectReportMultipleMemid, TM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_memory_ID: TMemory_ID, base_ID: TBaseMultipleMemid): Either[Int, Int] = {
    require(codec.base.bitStream.validate_offset_bits(8L))
    @ghost val oldCdc = snapshot(codec)
    TBaseMultipleMemid_IsConstraintValid(base_ID) match {
        case Left(l) =>
            return Left[Int, Int](l)
        case Right(_) =>
    }
    base_ID match
        case TBaseMultipleMemid.BaseMultipleMemid_memId1_PRESENT(memId1) =>
            locally {
                ghostExpr {
                    @opaque @inlineOnce
                    def bitCountLemma(): Unit = ().ensuring(_ => GetBitCountUnsigned(ULong.fromRaw(255) - ULong.fromRaw(0)) == 8)
                    bitCountLemma()
                }
            }
            codec.base.encodeConstrainedPosWholeNumber(memId1, 0.toRawULong, 255.toRawULong)
    Right[Int, Int](0)
}.ensuring { (res: Either[Int, Int]) => 
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + base_ID.size(old(codec).base.bitStream.bitIndex)
    }
}

@opaque @inlineOnce 
def TTM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TTM_6_18_CheckedObjectMemoryObjectReportMultipleMemid] =
{
    require(codec.base.bitStream.validate_offset_bits(88L))

    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Decode TM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_memory_ID */
    val intVal_TM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_memory_ID = codec.dec_Int_PositiveInteger_ConstSize_big_endian_32()

    val TM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_memory_ID = intVal_TM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_memory_ID.toRaw match
        case 0 => TMemory_ID.TmemId1
        case _ => return LeftMut(ERR_ACN_DECODE_TM_6_18_CHECKEDOBJECTMEMORYOBJECTREPORTMULTIPLEMEMID_MEMORY_ID)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 88L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_0 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Decode base_ID */
    val pVal_base_ID = TM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_base_ID_ACN_Decode(codec, TM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_memory_ID) match {
        case LeftMut(l) =>
            return LeftMut(l)
        case RightMut(v) =>
            v
    }
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_2.base.bitStream, codec.base.bitStream, 56L, 8L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 40L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_1 = pVal_base_ID match {
        case TBaseMultipleMemid.BaseMultipleMemid_memId1_PRESENT(memId1) =>
            8L
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    @ghost val codec_0_3 = snapshot(codec)
    /* Decode length */
    val pVal_length = TPUSC_UINT32_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_3.base.bitStream, codec.base.bitStream, 48L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 72L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_2 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2)
    }
    @ghost val codec_0_4 = snapshot(codec)
    /* Decode checksum */
    val pVal_checksum = TTM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_checksum(codec.base.bitStream.readBitsVec(16.toInt))
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 88L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_3 = 16L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2 + size_3)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 88L)
    }
    val pVal = TTM_6_18_CheckedObjectMemoryObjectReportMultipleMemid(pVal_base_ID, pVal_length, pVal_checksum)
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0 + size_1 + size_2 + size_3)
    }

    TTM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TTM_6_18_CheckedObjectMemoryObjectReportMultipleMemid](l)
        case Right(_) => RightMut[ErrorCode, TTM_6_18_CheckedObjectMemoryObjectReportMultipleMemid](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TTM_6_18_CheckedObjectMemoryObjectReportMultipleMemid]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TTM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TTM_6_18_CheckedObjectMemoryObjectReportMultipleMemid]) =
{
    require(codec.base.bitStream.validate_offset_bits(88L))
    val cpy = snapshot(codec)
    val res = TTM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_ACN_Decode(cpy)
    (cpy, res)
}

@opaque @inlineOnce
def TM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_base_ID_ACN_Decode(codec: ACN, TM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_memory_ID: TMemory_ID): EitherMut[Int, TBaseMultipleMemid] = {
    require(codec.base.bitStream.validate_offset_bits(8L))
    @ghost val oldCdc = snapshot(codec)
    val base_ID = TM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_memory_ID match
        case TMemory_ID.TmemId1 =>
            locally {
                ghostExpr {
                    @opaque @inlineOnce
                    def bitCountLemma(): Unit = ().ensuring(_ => GetBitCountUnsigned(ULong.fromRaw(255) - ULong.fromRaw(0)) == 8)
                    bitCountLemma()
                }
            }
            val memId1 = codec.base.decodeConstrainedPosWholeNumber(ULong.fromRaw(0), ULong.fromRaw(255)) // uper:135
            TBaseMultipleMemid.BaseMultipleMemid_memId1_PRESENT(memId1)
    TBaseMultipleMemid_IsConstraintValid(base_ID) match {
        case Left(l) =>
            LeftMut[Int, TBaseMultipleMemid](l)
        case Right(_) =>
            RightMut[Int, TBaseMultipleMemid](base_ID)
    }
}.ensuring { (res: EitherMut[Int, TBaseMultipleMemid]) => 
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TBaseMultipleMemid_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure
def TM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_base_ID_ACN_Decode_pure(codec: ACN, TM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_memory_ID: TMemory_ID): (ACN, EitherMut[Int, TBaseMultipleMemid]) = {
    require(codec.base.bitStream.validate_offset_bits(8L))
    val cpy = snapshot(codec)
    val res = TM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_base_ID_ACN_Decode(cpy, TM_6_18_CheckedObjectMemoryObjectReportMultipleMemid_memory_ID)
    (cpy, res)
}