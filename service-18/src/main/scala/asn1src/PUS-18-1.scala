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


def TTC_18_1_Direct_LoadAnOBCP_checksum_IsConstraintValid(@annotation.unused pVal: TTC_18_1_Direct_LoadAnOBCP_checksum): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = Right(0)
    ret
}

def TTC_18_1_Direct_LoadAnOBCP_IsConstraintValid(pVal: TTC_18_1_Direct_LoadAnOBCP): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = TOBCP_ID_IsConstraintValid(pVal.obcp_ID)
    if ret.isRight then
        ret = TPUSC_OCTSTR_VARIABLE_LEN_IsConstraintValid(pVal.obcpCode)
        if ret.isRight then
            pVal.checksum match
                case SomeMut(checksum) =>
                    ret = TTC_18_1_Direct_LoadAnOBCP_checksum_IsConstraintValid(checksum)
                case NoneMut() =>
    if ret.isRight then
        ret = (pVal.checksum.isDefined == true) match
            case true =>
                Right(0)
            case false =>
                Left(45)
    ret
}

def TTC_18_1_Direct_LoadAnOBCP_checksum_Initialize(): TTC_18_1_Direct_LoadAnOBCP_checksum = TTC_18_1_Direct_LoadAnOBCP_checksum(Vector.fill(2)(0.toRawUByte))
def TTC_18_1_Direct_LoadAnOBCP_Initialize(): TTC_18_1_Direct_LoadAnOBCP = TTC_18_1_Direct_LoadAnOBCP(obcp_ID = Vector.fill[UByte](5.toInt+1)(0x0.toRawUByte), obcpCode = TPUSC_OCTSTR_VARIABLE_LEN(0, Vector.fill(4095)(0.toRawUByte)), checksum = SomeMut(TTC_18_1_Direct_LoadAnOBCP_checksum(Vector.fill(2)(0.toRawUByte))))

@opaque @inlineOnce 
def TTC_18_1_Direct_LoadAnOBCP_ACN_Encode(pVal: TTC_18_1_Direct_LoadAnOBCP, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(32843L))
    TTC_18_1_Direct_LoadAnOBCP_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Encode obcp_ID */
    TOBCP_ID_ACN_Encode(pVal.obcp_ID, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 32843L, 35L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 35L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_0 = 35L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    val TC_18_1_Direct_LoadAnOBCP_obcpCodeLength = ULong.fromRaw(pVal.obcpCode.nCount)
    if TC_18_1_Direct_LoadAnOBCP_obcpCodeLength < ULong.fromRaw(0) || TC_18_1_Direct_LoadAnOBCP_obcpCodeLength > ULong.fromRaw(4095) then
        return Left(860)
    /* Encode TC_18_1_Direct_LoadAnOBCP_obcpCodeLength */
    locally {
        ghostExpr {
            @opaque @inlineOnce
            def bitCountLemma(v: ULong): Unit = {
                require(v <= ULong.fromRaw(4294967295L))
            }.ensuring(_ => GetBitCountUnsigned(v) <= 4294967295L)
            bitCountLemma(TC_18_1_Direct_LoadAnOBCP_obcpCodeLength)
        }
    }
    codec.enc_Int_PositiveInteger_ConstSize_big_endian_32(TC_18_1_Direct_LoadAnOBCP_obcpCodeLength)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_2.base.bitStream, codec.base.bitStream, 32808L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 67L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_1 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    @ghost val codec_0_3 = snapshot(codec)
    /* Encode obcpCode */
    codec.base.encodeOctetString_no_length_vec(pVal.obcpCode.arr, pVal.obcpCode.nCount.toInt)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_3.base.bitStream, codec.base.bitStream, 32776L, 32760L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32827L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_2 = 8L * pVal.obcpCode.nCount
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2)
    }
    @ghost val codec_0_4 = snapshot(codec)
    TC_18_1_Direct_LoadAnOBCP_checksum_Optional_ACN_Encode(codec, pVal, pVal.checksum) match {
        case Left(l) =>
            return Left(l)
        case Right(_) =>
            ()
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32843L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_3 = pVal.checksum match {
        case SomeMut(v) =>
            16L
        case NoneMut() =>
            0L
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2 + size_3)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 32843L)
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
def TC_18_1_Direct_LoadAnOBCP_checksum_Optional_ACN_Encode(codec: ACN, pVal: TTC_18_1_Direct_LoadAnOBCP, checksum: OptionMut[TTC_18_1_Direct_LoadAnOBCP_checksum]): Either[Int, Int] = {
    require(codec.base.bitStream.validate_offset_bits(16L))
    @ghost val oldCdc = snapshot(codec)
    checksum match {
        case SomeMut(v) =>
            TTC_18_1_Direct_LoadAnOBCP_checksum_IsConstraintValid(v) match {
                case Left(l) =>
                    return Left[Int, Int](l)
                case Right(_) =>
            }
        case NoneMut() =>
            ()
    }
    /* Encode checksum */
    /* marked as ALWAYS PRESENT, so it must be Some */
    checksum match
        case SomeMut(checksum) =>
            assert(16.toInt >= 0) // overflow may happen during cast
            codec.base.bitStream.appendBitsMSBFirstVec(checksum.arr, 16.toInt)
    
        case NoneMut() => return Left(628)
    Right[Int, Int](0)
}.ensuring { (res: Either[Int, Int]) => 
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 16L
    }
}



@opaque @inlineOnce 
def TTC_18_1_Direct_LoadAnOBCP_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TTC_18_1_Direct_LoadAnOBCP] =
{
    require(codec.base.bitStream.validate_offset_bits(32843L))

    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Decode obcp_ID */
    val pVal_obcp_ID = TOBCP_ID_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 32843L, 35L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 35L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_0 = 35L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Decode TC_18_1_Direct_LoadAnOBCP_obcpCodeLength */
    val TC_18_1_Direct_LoadAnOBCP_obcpCodeLength = codec.dec_Int_PositiveInteger_ConstSize_big_endian_32()

    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_2.base.bitStream, codec.base.bitStream, 32808L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 67L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_1 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    @ghost val codec_0_3 = snapshot(codec)
    /* Decode obcpCode */
    val pVal_obcpCode =
        if ((TC_18_1_Direct_LoadAnOBCP_obcpCodeLength <= ULong.fromRaw(4095))) then
            TPUSC_OCTSTR_VARIABLE_LEN(TC_18_1_Direct_LoadAnOBCP_obcpCodeLength.toRaw.toInt, codec.base.decodeOctetString_no_length_vec(TC_18_1_Direct_LoadAnOBCP_obcpCodeLength.toRaw.toInt))
        else return LeftMut(ERR_ACN_DECODE_TC_18_1_DIRECT_LOADANOBCP_OBCPCODE)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_3.base.bitStream, codec.base.bitStream, 32776L, 32760L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32827L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_2 = 8L * pVal_obcpCode.nCount
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2)
    }
    @ghost val codec_0_4 = snapshot(codec)
    val pVal_checksum = TC_18_1_Direct_LoadAnOBCP_checksum_Optional_ACN_Decode(codec) match {
        case LeftMut(l) =>
            return LeftMut(l)
        case RightMut(v) =>
            v
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32843L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_3 = pVal_checksum match {
        case SomeMut(v) =>
            16L
        case NoneMut() =>
            0L
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2 + size_3)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 32843L)
    }
    val pVal = TTC_18_1_Direct_LoadAnOBCP(pVal_obcp_ID, pVal_obcpCode, pVal_checksum)
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0 + size_1 + size_2 + size_3)
    }

    TTC_18_1_Direct_LoadAnOBCP_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TTC_18_1_Direct_LoadAnOBCP](l)
        case Right(_) => RightMut[ErrorCode, TTC_18_1_Direct_LoadAnOBCP](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TTC_18_1_Direct_LoadAnOBCP]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTC_18_1_Direct_LoadAnOBCP_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TTC_18_1_Direct_LoadAnOBCP_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TTC_18_1_Direct_LoadAnOBCP]) =
{
    require(codec.base.bitStream.validate_offset_bits(32843L))
    val cpy = snapshot(codec)
    val res = TTC_18_1_Direct_LoadAnOBCP_ACN_Decode(cpy)
    (cpy, res)
}

@opaque @inlineOnce
def TC_18_1_Direct_LoadAnOBCP_checksum_Optional_ACN_Decode(codec: ACN): EitherMut[Int, OptionMut[TTC_18_1_Direct_LoadAnOBCP_checksum]] = {
    require(codec.base.bitStream.validate_offset_bits(16L))
    @ghost val oldCdc = snapshot(codec)
    /* Decode checksum */
    /* marked as ALWAYS PRESENT */
    val checksum: OptionMut[TTC_18_1_Direct_LoadAnOBCP_checksum] =
        val pVal_checksum = TTC_18_1_Direct_LoadAnOBCP_checksum(codec.base.bitStream.readBitsVec(16.toInt))
        SomeMut(pVal_checksum)
    checksum match {
        case SomeMut(v) =>
            TTC_18_1_Direct_LoadAnOBCP_checksum_IsConstraintValid(v) match {
                case Left(l) =>
                    LeftMut[Int, OptionMut[TTC_18_1_Direct_LoadAnOBCP_checksum]](l)
                case Right(_) =>
                    RightMut[Int, OptionMut[TTC_18_1_Direct_LoadAnOBCP_checksum]](checksum)
            }
        case NoneMut() =>
            RightMut[Int, OptionMut[TTC_18_1_Direct_LoadAnOBCP_checksum]](checksum)
    }
}.ensuring { (res: EitherMut[Int, OptionMut[TTC_18_1_Direct_LoadAnOBCP_checksum]]) => 
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            resVal.isDefined && old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 16L && (resVal match {
                case SomeMut(v) =>
                    TTC_18_1_Direct_LoadAnOBCP_checksum_IsConstraintValid(v).isRight
                case NoneMut() =>
                    true
            })
    }
}



@ghost @pure
def TC_18_1_Direct_LoadAnOBCP_checksum_Optional_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[Int, OptionMut[TTC_18_1_Direct_LoadAnOBCP_checksum]]) = {
    require(codec.base.bitStream.validate_offset_bits(16L))
    val cpy = snapshot(codec)
    val res = TC_18_1_Direct_LoadAnOBCP_checksum_Optional_ACN_Decode(cpy)
    (cpy, res)
}

