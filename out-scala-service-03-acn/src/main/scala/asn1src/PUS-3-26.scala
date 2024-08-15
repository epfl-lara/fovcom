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


def TTM_3_26_DiagnosticParameterReport_IsConstraintValid(pVal: TTM_3_26_DiagnosticParameterReport): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = TDiagnosticParameterValues_IsConstraintValid(pVal.parameterValue)
    ret
}

def TTM_3_26_DiagnosticParameterReport_Initialize(): TTM_3_26_DiagnosticParameterReport = TTM_3_26_DiagnosticParameterReport(parameterValue = TDiagnosticParameterValues_Initialize())

@opaque @inlineOnce 
def TTM_3_26_DiagnosticParameterReport_ACN_Encode(pVal: TTM_3_26_DiagnosticParameterReport, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(40L))
    TTM_3_26_DiagnosticParameterReport_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    val TM_3_26_DiagnosticParameterReport_diagnosticParameterReportStructure_ID = pVal.parameterValue match
        case _: TDiagnosticParameterValues.DiagnosticParameterValues_struct1_PRESENT =>
            ULong.fromRaw(1)
    /* Encode TM_3_26_DiagnosticParameterReport_diagnosticParameterReportStructure_ID */
    locally {
        ghostExpr {
            @opaque @inlineOnce
            def bitCountLemma(v: ULong): Unit = {
                require(v <= ULong.fromRaw(4294967295L))
            }.ensuring(_ => GetBitCountUnsigned(v) <= 4294967295L)
            bitCountLemma(TM_3_26_DiagnosticParameterReport_diagnosticParameterReportStructure_ID)
        }
    }
    codec.enc_Int_PositiveInteger_ConstSize_big_endian_32(TM_3_26_DiagnosticParameterReport_diagnosticParameterReportStructure_ID)
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
    /* Encode parameterValue */
    TM_3_26_DiagnosticParameterReport_parameterValue_ACN_Encode(codec, pVal, TM_3_26_DiagnosticParameterReport_diagnosticParameterReportStructure_ID, pVal.parameterValue) match {
        case Left(l) =>
            return Left(l)
        case Right(_) =>
            ()
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 40L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_1 = pVal.parameterValue match {
        case TDiagnosticParameterValues.DiagnosticParameterValues_struct1_PRESENT(struct1) =>
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
def TM_3_26_DiagnosticParameterReport_parameterValue_ACN_Encode(codec: ACN, pVal: TTM_3_26_DiagnosticParameterReport, TM_3_26_DiagnosticParameterReport_diagnosticParameterReportStructure_ID: ULong, parameterValue: TDiagnosticParameterValues): Either[Int, Int] = {
    require(codec.base.bitStream.validate_offset_bits(8L))
    @ghost val oldCdc = snapshot(codec)
    TDiagnosticParameterValues_IsConstraintValid(parameterValue) match {
        case Left(l) =>
            return Left[Int, Int](l)
        case Right(_) =>
    }
    parameterValue match
        case TDiagnosticParameterValues.DiagnosticParameterValues_struct1_PRESENT(struct1) =>
            codec.enc_Int_PositiveInteger_ConstSize_8(struct1)
    Right[Int, Int](0)
}.ensuring { (res: Either[Int, Int]) => 
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + parameterValue.size(old(codec).base.bitStream.bitIndex)
    }
}

@opaque @inlineOnce 
def TTM_3_26_DiagnosticParameterReport_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TTM_3_26_DiagnosticParameterReport] =
{
    require(codec.base.bitStream.validate_offset_bits(40L))

    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Decode TM_3_26_DiagnosticParameterReport_diagnosticParameterReportStructure_ID */
    val TM_3_26_DiagnosticParameterReport_diagnosticParameterReportStructure_ID = codec.dec_Int_PositiveInteger_ConstSize_big_endian_32()

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
    /* Decode parameterValue */
    val pVal_parameterValue = TM_3_26_DiagnosticParameterReport_parameterValue_ACN_Decode(codec, TM_3_26_DiagnosticParameterReport_diagnosticParameterReportStructure_ID) match {
        case LeftMut(l) =>
            return LeftMut(l)
        case RightMut(v) =>
            v
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 40L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_1 = pVal_parameterValue match {
        case TDiagnosticParameterValues.DiagnosticParameterValues_struct1_PRESENT(struct1) =>
            8L
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 40L)
    }
    val pVal = TTM_3_26_DiagnosticParameterReport(pVal_parameterValue)
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0 + size_1)
    }

    TTM_3_26_DiagnosticParameterReport_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TTM_3_26_DiagnosticParameterReport](l)
        case Right(_) => RightMut[ErrorCode, TTM_3_26_DiagnosticParameterReport](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TTM_3_26_DiagnosticParameterReport]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTM_3_26_DiagnosticParameterReport_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TTM_3_26_DiagnosticParameterReport_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TTM_3_26_DiagnosticParameterReport]) =
{
    require(codec.base.bitStream.validate_offset_bits(40L))
    val cpy = snapshot(codec)
    val res = TTM_3_26_DiagnosticParameterReport_ACN_Decode(cpy)
    (cpy, res)
}

@opaque @inlineOnce
def TM_3_26_DiagnosticParameterReport_parameterValue_ACN_Decode(codec: ACN, TM_3_26_DiagnosticParameterReport_diagnosticParameterReportStructure_ID: ULong): EitherMut[Int, TDiagnosticParameterValues] = {
    require(codec.base.bitStream.validate_offset_bits(8L))
    @ghost val oldCdc = snapshot(codec)
    val parameterValue = if ((TM_3_26_DiagnosticParameterReport_diagnosticParameterReportStructure_ID == ULong.fromRaw(1))) {
        val struct1 = codec.dec_Int_PositiveInteger_ConstSize_8()
    
        TDiagnosticParameterValues.DiagnosticParameterValues_struct1_PRESENT(struct1)
    }
    else return LeftMut(ERR_ACN_DECODE_TM_3_26_DIAGNOSTICPARAMETERREPORT_PARAMETERVALUE)
    TDiagnosticParameterValues_IsConstraintValid(parameterValue) match {
        case Left(l) =>
            LeftMut[Int, TDiagnosticParameterValues](l)
        case Right(_) =>
            RightMut[Int, TDiagnosticParameterValues](parameterValue)
    }
}.ensuring { (res: EitherMut[Int, TDiagnosticParameterValues]) => 
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TDiagnosticParameterValues_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure
def TM_3_26_DiagnosticParameterReport_parameterValue_ACN_Decode_pure(codec: ACN, TM_3_26_DiagnosticParameterReport_diagnosticParameterReportStructure_ID: ULong): (ACN, EitherMut[Int, TDiagnosticParameterValues]) = {
    require(codec.base.bitStream.validate_offset_bits(8L))
    val cpy = snapshot(codec)
    val res = TM_3_26_DiagnosticParameterReport_parameterValue_ACN_Decode(cpy, TM_3_26_DiagnosticParameterReport_diagnosticParameterReportStructure_ID)
    (cpy, res)
}