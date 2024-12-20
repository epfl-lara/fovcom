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


def TParameterReportStructureType_IsConstraintValid(pVal: TParameterReportStructureType): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = (((pVal == TParameterReportStructureType.ThousekeepingParameterReportStructure_ID)) || ((pVal == TParameterReportStructureType.TdiagnosticParameterReportStructure_ID))) match
        case true =>
            Right(0)
        case false =>
            Left(45)
    ret
}

def TParameterReportStructureType_Initialize(): TParameterReportStructureType = TParameterReportStructureType.ThousekeepingParameterReportStructure_ID

@opaque @inlineOnce 
def TParameterReportStructureType_ACN_Encode(pVal: TParameterReportStructureType, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(5L))
    TParameterReportStructureType_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    val intVal_pVal = pVal match
        case TParameterReportStructureType.ThousekeepingParameterReportStructure_ID => ULong.fromRaw(0L)
        case TParameterReportStructureType.TdiagnosticParameterReportStructure_ID => ULong.fromRaw(1L)

    locally {
        ghostExpr {
            @opaque @inlineOnce
            def bitCountLemma(v: ULong): Unit = {
                require(v <= ULong.fromRaw(1))
            }.ensuring(_ => GetBitCountUnsigned(v) <= 5)
            bitCountLemma(intVal_pVal)
        }
    }
    codec.enc_Int_PositiveInteger_ConstSize(intVal_pVal, 5)
    Right(0)
}.ensuring { (res : Either[ErrorCode, Int]) =>
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 5L
    }
}

@opaque @inlineOnce 
def TParameterReportStructureType_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TParameterReportStructureType] =
{
    require(codec.base.bitStream.validate_offset_bits(5L))

    @ghost val oldCdc = snapshot(codec)
    val intVal_pVal = codec.dec_Int_PositiveInteger_ConstSize(5)

    val pVal = intVal_pVal.toRaw match
        case 0 => TParameterReportStructureType.ThousekeepingParameterReportStructure_ID
        case 1 => TParameterReportStructureType.TdiagnosticParameterReportStructure_ID
        case _ => return LeftMut(ERR_ACN_DECODE_PARAMETERREPORTSTRUCTURETYPE)

    TParameterReportStructureType_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TParameterReportStructureType](l)
        case Right(_) => RightMut[ErrorCode, TParameterReportStructureType](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TParameterReportStructureType]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 5L && TParameterReportStructureType_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TParameterReportStructureType_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TParameterReportStructureType]) =
{
    require(codec.base.bitStream.validate_offset_bits(5L))
    val cpy = snapshot(codec)
    val res = TParameterReportStructureType_ACN_Decode(cpy)
    (cpy, res)
}

def TParameterReportStructure_ID_IsConstraintValid(pVal: TParameterReportStructure_ID): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    pVal match
        case TParameterReportStructure_ID.housekeepingParameterReportStructure_ID_PRESENT(housekeepingParameterReportStructure_ID) =>
            ret = THousekeepingParameterReportStructure_ID_IsConstraintValid(housekeepingParameterReportStructure_ID)
        case TParameterReportStructure_ID.diagnosticParameterReportStructure_ID_PRESENT(diagnosticParameterReportStructure_ID) =>
            ret = TDiagnosticParameterReportStructure_ID_IsConstraintValid(diagnosticParameterReportStructure_ID)
    ret
}

def TParameterReportStructure_ID_Initialize(): TParameterReportStructure_ID = TParameterReportStructure_ID.housekeepingParameterReportStructure_ID_PRESENT(ULong.fromRaw(0L))