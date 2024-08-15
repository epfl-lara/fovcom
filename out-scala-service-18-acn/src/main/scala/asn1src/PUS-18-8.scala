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


def TTC_18_8_ReportTheExecutionStatusOfEachOBCP_Initialize(): TTC_18_8_ReportTheExecutionStatusOfEachOBCP = 0

@opaque @inlineOnce 
def TTC_18_8_ReportTheExecutionStatusOfEachOBCP_ACN_Encode(@annotation.unused pVal: TTC_18_8_ReportTheExecutionStatusOfEachOBCP, @annotation.unused codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
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
def TTC_18_8_ReportTheExecutionStatusOfEachOBCP_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TTC_18_8_ReportTheExecutionStatusOfEachOBCP] =
{
    require(codec.base.bitStream.validate_offset_bits(0L))

    @ghost val oldCdc = snapshot(codec)
    val pVal: NullType = 0

    RightMut[ErrorCode, TTC_18_8_ReportTheExecutionStatusOfEachOBCP](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TTC_18_8_ReportTheExecutionStatusOfEachOBCP]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex
    }
}

@ghost @pure 
def TTC_18_8_ReportTheExecutionStatusOfEachOBCP_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TTC_18_8_ReportTheExecutionStatusOfEachOBCP]) =
{
    require(codec.base.bitStream.validate_offset_bits(0L))
    val cpy = snapshot(codec)
    val res = TTC_18_8_ReportTheExecutionStatusOfEachOBCP_ACN_Decode(cpy)
    (cpy, res)
}