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


def TSubSchedule_ID_IsConstraintValid(pVal: TSubSchedule_ID): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = (pVal <= ULong.fromRaw(4294967295L)) match
        case true =>
            Right(0)
        case false =>
            Left(45)
    ret
}

def TSubSchedule_ID_Initialize(): TSubSchedule_ID = ULong.fromRaw(0L)

@opaque @inlineOnce 
def TSubSchedule_ID_ACN_Encode(pVal: TSubSchedule_ID, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(32L))
    TSubSchedule_ID_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    locally {
        ghostExpr {
            @opaque @inlineOnce
            def bitCountLemma(v: ULong): Unit = {
                require(v <= ULong.fromRaw(4294967295L))
            }.ensuring(_ => GetBitCountUnsigned(v) <= 4294967295L)
            bitCountLemma(pVal)
        }
    }
    codec.enc_Int_PositiveInteger_ConstSize_big_endian_32(pVal)
    Right(0)
}.ensuring { (res : Either[ErrorCode, Int]) =>
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 32L
    }
}

@opaque @inlineOnce 
def TSubSchedule_ID_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TSubSchedule_ID] =
{
    require(codec.base.bitStream.validate_offset_bits(32L))

    @ghost val oldCdc = snapshot(codec)
    val pVal = codec.dec_Int_PositiveInteger_ConstSize_big_endian_32()


    TSubSchedule_ID_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TSubSchedule_ID](l)
        case Right(_) => RightMut[ErrorCode, TSubSchedule_ID](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TSubSchedule_ID]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 32L && TSubSchedule_ID_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TSubSchedule_ID_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TSubSchedule_ID]) =
{
    require(codec.base.bitStream.validate_offset_bits(32L))
    val cpy = snapshot(codec)
    val res = TSubSchedule_ID_ACN_Decode(cpy)
    (cpy, res)
}

def TSubScheduleStatus_IsConstraintValid(pVal: TSubScheduleStatus): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = (((pVal == TSubScheduleStatus.TSubScheduleStatus_disabled)) || ((pVal == TSubScheduleStatus.TSubScheduleStatus_enabled))) match
        case true =>
            Right(0)
        case false =>
            Left(45)
    ret
}

def TSubScheduleStatus_Initialize(): TSubScheduleStatus = TSubScheduleStatus.TSubScheduleStatus_disabled

@opaque @inlineOnce 
def TSubScheduleStatus_ACN_Encode(pVal: TSubScheduleStatus, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(1L))
    TSubScheduleStatus_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    val intVal_pVal = pVal match
        case TSubScheduleStatus.TSubScheduleStatus_disabled => ULong.fromRaw(0L)
        case TSubScheduleStatus.TSubScheduleStatus_enabled => ULong.fromRaw(1L)

    locally {
        ghostExpr {
            @opaque @inlineOnce
            def bitCountLemma(v: ULong): Unit = {
                require(v <= ULong.fromRaw(1))
            }.ensuring(_ => GetBitCountUnsigned(v) <= 1)
            bitCountLemma(intVal_pVal)
        }
    }
    codec.enc_Int_PositiveInteger_ConstSize(intVal_pVal, 1)
    Right(0)
}.ensuring { (res : Either[ErrorCode, Int]) =>
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 1L
    }
}

@opaque @inlineOnce 
def TSubScheduleStatus_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TSubScheduleStatus] =
{
    require(codec.base.bitStream.validate_offset_bits(1L))

    @ghost val oldCdc = snapshot(codec)
    val intVal_pVal = codec.dec_Int_PositiveInteger_ConstSize(1)

    val pVal = intVal_pVal.toRaw match
        case 0 => TSubScheduleStatus.TSubScheduleStatus_disabled
        case 1 => TSubScheduleStatus.TSubScheduleStatus_enabled
        case _ => return LeftMut(ERR_ACN_DECODE_SUBSCHEDULESTATUS)

    TSubScheduleStatus_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TSubScheduleStatus](l)
        case Right(_) => RightMut[ErrorCode, TSubScheduleStatus](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TSubScheduleStatus]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 1L && TSubScheduleStatus_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TSubScheduleStatus_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TSubScheduleStatus]) =
{
    require(codec.base.bitStream.validate_offset_bits(1L))
    val cpy = snapshot(codec)
    val res = TSubScheduleStatus_ACN_Decode(cpy)
    (cpy, res)
}