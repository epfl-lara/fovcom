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


def TExecutionStep_ID_IsConstraintValid(pVal: TExecutionStep_ID): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = (pVal == ULong.fromRaw(1L)) match
        case true =>
            Right(0)
        case false =>
            Left(45)
    ret
}

def TExecutionStep_ID_Initialize(): TExecutionStep_ID = ULong.fromRaw(1L)

@opaque @inlineOnce 
def TExecutionStep_ID_ACN_Encode(pVal: TExecutionStep_ID, @annotation.unused codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(0L))
    TExecutionStep_ID_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    /* No need to encode the val pVal, it will always be ULong.fromRaw(1L) */
    ; // NOP
    Right(0)
}.ensuring { (res : Either[ErrorCode, Int]) =>
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex
    }
}

@opaque @inlineOnce 
def TExecutionStep_ID_ACN_Decode(@annotation.unused codec: ACN): EitherMut[ErrorCode, TExecutionStep_ID] =
{
    require(codec.base.bitStream.validate_offset_bits(0L))

    @ghost val oldCdc = snapshot(codec)
    val pVal = ULong.fromRaw(1L)

    TExecutionStep_ID_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TExecutionStep_ID](l)
        case Right(_) => RightMut[ErrorCode, TExecutionStep_ID](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TExecutionStep_ID]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex && TExecutionStep_ID_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TExecutionStep_ID_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TExecutionStep_ID]) =
{
    require(codec.base.bitStream.validate_offset_bits(0L))
    val cpy = snapshot(codec)
    val res = TExecutionStep_ID_ACN_Decode(cpy)
    (cpy, res)
}