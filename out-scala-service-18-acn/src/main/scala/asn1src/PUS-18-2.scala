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


def TTC_18_2_UnloadAnOBCP_IsConstraintValid(pVal: TTC_18_2_UnloadAnOBCP): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = TOBCP_ID_IsConstraintValid(pVal.obcp_ID)
    ret
}

def TTC_18_2_UnloadAnOBCP_Initialize(): TTC_18_2_UnloadAnOBCP = TTC_18_2_UnloadAnOBCP(obcp_ID = Vector.fill[UByte](5.toInt+1)(0x0.toRawUByte))

@opaque @inlineOnce 
def TTC_18_2_UnloadAnOBCP_ACN_Encode(pVal: TTC_18_2_UnloadAnOBCP, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(35L))
    TTC_18_2_UnloadAnOBCP_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Encode obcp_ID */
    TOBCP_ID_ACN_Encode(pVal.obcp_ID, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 35L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_0 = 35L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 35L)
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
def TTC_18_2_UnloadAnOBCP_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TTC_18_2_UnloadAnOBCP] =
{
    require(codec.base.bitStream.validate_offset_bits(35L))

    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Decode obcp_ID */
    val pVal_obcp_ID = TOBCP_ID_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 35L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_0 = 35L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 35L)
    }
    val pVal = TTC_18_2_UnloadAnOBCP(pVal_obcp_ID)
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0)
    }

    TTC_18_2_UnloadAnOBCP_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TTC_18_2_UnloadAnOBCP](l)
        case Right(_) => RightMut[ErrorCode, TTC_18_2_UnloadAnOBCP](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TTC_18_2_UnloadAnOBCP]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTC_18_2_UnloadAnOBCP_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TTC_18_2_UnloadAnOBCP_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TTC_18_2_UnloadAnOBCP]) =
{
    require(codec.base.bitStream.validate_offset_bits(35L))
    val cpy = snapshot(codec)
    val res = TTC_18_2_UnloadAnOBCP_ACN_Decode(cpy)
    (cpy, res)
}