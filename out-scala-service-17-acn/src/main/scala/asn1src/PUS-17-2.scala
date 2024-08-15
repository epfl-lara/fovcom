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


def TTM_17_2_AreYouAliveConnectionTestReport_Initialize(): TTM_17_2_AreYouAliveConnectionTestReport = 0

@opaque @inlineOnce 
def TTM_17_2_AreYouAliveConnectionTestReport_ACN_Encode(@annotation.unused pVal: TTM_17_2_AreYouAliveConnectionTestReport, @annotation.unused codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(0L))
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
def TTM_17_2_AreYouAliveConnectionTestReport_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TTM_17_2_AreYouAliveConnectionTestReport] =
{
    require(codec.base.bitStream.validate_offset_bits(0L))

    @ghost val oldCdc = snapshot(codec)
    val pVal: NullType = 0

    RightMut[ErrorCode, TTM_17_2_AreYouAliveConnectionTestReport](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TTM_17_2_AreYouAliveConnectionTestReport]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex
    }
}

@ghost @pure 
def TTM_17_2_AreYouAliveConnectionTestReport_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TTM_17_2_AreYouAliveConnectionTestReport]) =
{
    require(codec.base.bitStream.validate_offset_bits(0L))
    val cpy = snapshot(codec)
    val res = TTM_17_2_AreYouAliveConnectionTestReport_ACN_Decode(cpy)
    (cpy, res)
}