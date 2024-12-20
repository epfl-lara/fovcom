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


def THousekeepingParameterReportStructure_ID_IsConstraintValid(pVal: THousekeepingParameterReportStructure_ID): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = (pVal <= ULong.fromRaw(4294967295L)) match
        case true =>
            Right(0)
        case false =>
            Left(45)
    ret
}

def THousekeepingParameterReportStructure_ID_Initialize(): THousekeepingParameterReportStructure_ID = ULong.fromRaw(0L)

@opaque @inlineOnce 
def THousekeepingParameterReportStructure_ID_ACN_Encode(pVal: THousekeepingParameterReportStructure_ID, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(32L))
    THousekeepingParameterReportStructure_ID_IsConstraintValid(pVal) match
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
def THousekeepingParameterReportStructure_ID_ACN_Decode(codec: ACN): EitherMut[ErrorCode, THousekeepingParameterReportStructure_ID] =
{
    require(codec.base.bitStream.validate_offset_bits(32L))

    @ghost val oldCdc = snapshot(codec)
    val pVal = codec.dec_Int_PositiveInteger_ConstSize_big_endian_32()


    THousekeepingParameterReportStructure_ID_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, THousekeepingParameterReportStructure_ID](l)
        case Right(_) => RightMut[ErrorCode, THousekeepingParameterReportStructure_ID](pVal)
}.ensuring { (res : EitherMut[ErrorCode, THousekeepingParameterReportStructure_ID]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 32L && THousekeepingParameterReportStructure_ID_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def THousekeepingParameterReportStructure_ID_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, THousekeepingParameterReportStructure_ID]) =
{
    require(codec.base.bitStream.validate_offset_bits(32L))
    val cpy = snapshot(codec)
    val res = THousekeepingParameterReportStructure_ID_ACN_Decode(cpy)
    (cpy, res)
}

def THousekeepingParameterValues_struct1_IsConstraintValid(pVal: THousekeepingParameterValues_struct1): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = (pVal <= ULong.fromRaw(255L)) match
        case true =>
            Right(0)
        case false =>
            Left(45)
    ret
}

def THousekeepingParameterValues_IsConstraintValid(pVal: THousekeepingParameterValues): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    pVal match
        case THousekeepingParameterValues.HousekeepingParameterValues_struct1_PRESENT(struct1) =>
            ret = THousekeepingParameterValues_struct1_IsConstraintValid(struct1)
    ret
}

def THousekeepingParameterValues_struct1_Initialize(): THousekeepingParameterValues_struct1 = ULong.fromRaw(0L)
def THousekeepingParameterValues_Initialize(): THousekeepingParameterValues = THousekeepingParameterValues.HousekeepingParameterValues_struct1_PRESENT(ULong.fromRaw(0L))