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


def TTC_6_17_CheckAnObjectMemoryObject_IsConstraintValid(pVal: TTC_6_17_CheckAnObjectMemoryObject): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = TBase_IsConstraintValid(pVal.base_ID)
    ret
}

def TTC_6_17_CheckAnObjectMemoryObject_Initialize(): TTC_6_17_CheckAnObjectMemoryObject = TTC_6_17_CheckAnObjectMemoryObject(base_ID = ULong.fromRaw(0L))

@opaque @inlineOnce 
def TTC_6_17_CheckAnObjectMemoryObject_ACN_Encode(pVal: TTC_6_17_CheckAnObjectMemoryObject, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(8L))
    TTC_6_17_CheckAnObjectMemoryObject_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Encode base_ID */
    TBase_ACN_Encode(pVal.base_ID, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 8L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_0 = 8L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 8L)
    }
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0)
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
def TTC_6_17_CheckAnObjectMemoryObject_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TTC_6_17_CheckAnObjectMemoryObject] =
{
    require(codec.base.bitStream.validate_offset_bits(8L))

    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Decode base_ID */
    val pVal_base_ID = TBase_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 8L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_0 = 8L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 8L)
    }
    val pVal = TTC_6_17_CheckAnObjectMemoryObject(pVal_base_ID)
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0)
    }

    TTC_6_17_CheckAnObjectMemoryObject_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TTC_6_17_CheckAnObjectMemoryObject](l)
        case Right(_) => RightMut[ErrorCode, TTC_6_17_CheckAnObjectMemoryObject](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TTC_6_17_CheckAnObjectMemoryObject]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTC_6_17_CheckAnObjectMemoryObject_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TTC_6_17_CheckAnObjectMemoryObject_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TTC_6_17_CheckAnObjectMemoryObject]) =
{
    require(codec.base.bitStream.validate_offset_bits(8L))
    val cpy = snapshot(codec)
    val res = TTC_6_17_CheckAnObjectMemoryObject_ACN_Decode(cpy)
    (cpy, res)
}

def TTC_6_17_CheckAnObjectMemoryObjectMultipleMemid_IsConstraintValid(pVal: TTC_6_17_CheckAnObjectMemoryObjectMultipleMemid): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = TBaseMultipleMemid_IsConstraintValid(pVal.base_ID)
    ret
}

def TTC_6_17_CheckAnObjectMemoryObjectMultipleMemid_Initialize(): TTC_6_17_CheckAnObjectMemoryObjectMultipleMemid = TTC_6_17_CheckAnObjectMemoryObjectMultipleMemid(base_ID = TBaseMultipleMemid_Initialize())

@opaque @inlineOnce 
def TTC_6_17_CheckAnObjectMemoryObjectMultipleMemid_ACN_Encode(pVal: TTC_6_17_CheckAnObjectMemoryObjectMultipleMemid, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(40L))
    TTC_6_17_CheckAnObjectMemoryObjectMultipleMemid_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    val TC_6_17_CheckAnObjectMemoryObjectMultipleMemid_memory_ID = pVal.base_ID match
        case TBaseMultipleMemid.BaseMultipleMemid_memId1_PRESENT(_) =>TMemory_ID.TmemId1

    /* Encode TC_6_17_CheckAnObjectMemoryObjectMultipleMemid_memory_ID */
    val intVal_TC_6_17_CheckAnObjectMemoryObjectMultipleMemid_memory_ID = TC_6_17_CheckAnObjectMemoryObjectMultipleMemid_memory_ID match
        case TMemory_ID.TmemId1 => ULong.fromRaw(0L)

    locally {
        ghostExpr {
            @opaque @inlineOnce
            def bitCountLemma(v: ULong): Unit = {
                require(v <= ULong.fromRaw(0))
            }.ensuring(_ => GetBitCountUnsigned(v) <= 4294967295L)
            bitCountLemma(intVal_TC_6_17_CheckAnObjectMemoryObjectMultipleMemid_memory_ID)
        }
    }
    codec.enc_Int_PositiveInteger_ConstSize_big_endian_32(intVal_TC_6_17_CheckAnObjectMemoryObjectMultipleMemid_memory_ID)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 40L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_0 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Encode base_ID */
    TC_6_17_CheckAnObjectMemoryObjectMultipleMemid_base_ID_ACN_Encode(codec, pVal, TC_6_17_CheckAnObjectMemoryObjectMultipleMemid_memory_ID, pVal.base_ID) match {
        case Left(l) =>
            return Left(l)
        case Right(_) =>
            ()
    }
    ghostExpr {
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
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 40L)
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
def TC_6_17_CheckAnObjectMemoryObjectMultipleMemid_base_ID_ACN_Encode(codec: ACN, pVal: TTC_6_17_CheckAnObjectMemoryObjectMultipleMemid, TC_6_17_CheckAnObjectMemoryObjectMultipleMemid_memory_ID: TMemory_ID, base_ID: TBaseMultipleMemid): Either[Int, Int] = {
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
def TTC_6_17_CheckAnObjectMemoryObjectMultipleMemid_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TTC_6_17_CheckAnObjectMemoryObjectMultipleMemid] =
{
    require(codec.base.bitStream.validate_offset_bits(40L))

    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Decode TC_6_17_CheckAnObjectMemoryObjectMultipleMemid_memory_ID */
    val intVal_TC_6_17_CheckAnObjectMemoryObjectMultipleMemid_memory_ID = codec.dec_Int_PositiveInteger_ConstSize_big_endian_32()

    val TC_6_17_CheckAnObjectMemoryObjectMultipleMemid_memory_ID = intVal_TC_6_17_CheckAnObjectMemoryObjectMultipleMemid_memory_ID.toRaw match
        case 0 => TMemory_ID.TmemId1
        case _ => return LeftMut(ERR_ACN_DECODE_TC_6_17_CHECKANOBJECTMEMORYOBJECTMULTIPLEMEMID_MEMORY_ID)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 40L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_0 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Decode base_ID */
    val pVal_base_ID = TC_6_17_CheckAnObjectMemoryObjectMultipleMemid_base_ID_ACN_Decode(codec, TC_6_17_CheckAnObjectMemoryObjectMultipleMemid_memory_ID) match {
        case LeftMut(l) =>
            return LeftMut(l)
        case RightMut(v) =>
            v
    }
    ghostExpr {
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
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 40L)
    }
    val pVal = TTC_6_17_CheckAnObjectMemoryObjectMultipleMemid(pVal_base_ID)
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0 + size_1)
    }

    TTC_6_17_CheckAnObjectMemoryObjectMultipleMemid_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TTC_6_17_CheckAnObjectMemoryObjectMultipleMemid](l)
        case Right(_) => RightMut[ErrorCode, TTC_6_17_CheckAnObjectMemoryObjectMultipleMemid](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TTC_6_17_CheckAnObjectMemoryObjectMultipleMemid]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTC_6_17_CheckAnObjectMemoryObjectMultipleMemid_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TTC_6_17_CheckAnObjectMemoryObjectMultipleMemid_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TTC_6_17_CheckAnObjectMemoryObjectMultipleMemid]) =
{
    require(codec.base.bitStream.validate_offset_bits(40L))
    val cpy = snapshot(codec)
    val res = TTC_6_17_CheckAnObjectMemoryObjectMultipleMemid_ACN_Decode(cpy)
    (cpy, res)
}

@opaque @inlineOnce
def TC_6_17_CheckAnObjectMemoryObjectMultipleMemid_base_ID_ACN_Decode(codec: ACN, TC_6_17_CheckAnObjectMemoryObjectMultipleMemid_memory_ID: TMemory_ID): EitherMut[Int, TBaseMultipleMemid] = {
    require(codec.base.bitStream.validate_offset_bits(8L))
    @ghost val oldCdc = snapshot(codec)
    val base_ID = TC_6_17_CheckAnObjectMemoryObjectMultipleMemid_memory_ID match
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
def TC_6_17_CheckAnObjectMemoryObjectMultipleMemid_base_ID_ACN_Decode_pure(codec: ACN, TC_6_17_CheckAnObjectMemoryObjectMultipleMemid_memory_ID: TMemory_ID): (ACN, EitherMut[Int, TBaseMultipleMemid]) = {
    require(codec.base.bitStream.validate_offset_bits(8L))
    val cpy = snapshot(codec)
    val res = TC_6_17_CheckAnObjectMemoryObjectMultipleMemid_base_ID_ACN_Decode(cpy, TC_6_17_CheckAnObjectMemoryObjectMultipleMemid_memory_ID)
    (cpy, res)
}