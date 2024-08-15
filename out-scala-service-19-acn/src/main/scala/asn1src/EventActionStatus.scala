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


def TEventActionStatus_IsConstraintValid(pVal: TEventActionStatus): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = (((pVal == TEventActionStatus.Tdisabled)) || ((pVal == TEventActionStatus.Tenabled))) match
        case true =>
            Right(0)
        case false =>
            Left(45)
    ret
}

def TEventActionStatus_Initialize(): TEventActionStatus = TEventActionStatus.Tdisabled

@opaque @inlineOnce 
def TEventActionStatus_ACN_Encode(pVal: TEventActionStatus, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(1L))
    TEventActionStatus_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    val intVal_pVal = pVal match
        case TEventActionStatus.Tdisabled => ULong.fromRaw(0L)
        case TEventActionStatus.Tenabled => ULong.fromRaw(1L)

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
def TEventActionStatus_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TEventActionStatus] =
{
    require(codec.base.bitStream.validate_offset_bits(1L))

    @ghost val oldCdc = snapshot(codec)
    val intVal_pVal = codec.dec_Int_PositiveInteger_ConstSize(1)

    val pVal = intVal_pVal.toRaw match
        case 0 => TEventActionStatus.Tdisabled
        case 1 => TEventActionStatus.Tenabled
        case _ => return LeftMut(ERR_ACN_DECODE_EVENTACTIONSTATUS)

    TEventActionStatus_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TEventActionStatus](l)
        case Right(_) => RightMut[ErrorCode, TEventActionStatus](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TEventActionStatus]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 1L && TEventActionStatus_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TEventActionStatus_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TEventActionStatus]) =
{
    require(codec.base.bitStream.validate_offset_bits(1L))
    val cpy = snapshot(codec)
    val res = TEventActionStatus_ACN_Decode(cpy)
    (cpy, res)
}