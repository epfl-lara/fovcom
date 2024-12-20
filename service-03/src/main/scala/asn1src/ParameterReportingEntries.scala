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


def TParameterReportingEntries_IsConstraintValid(pVal: TParameterReportingEntries): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = TParameterReportStructure_ID_IsConstraintValid(pVal.parameterReportStructure_ID)
    if ret.isRight then
        ret = TPeriodicGenerationActionStatus_IsConstraintValid(pVal.periodicGenerationActionStatus)
        if ret.isRight then
            ret = TPUSC_UINT32_IsConstraintValid(pVal.collectionInterval)
    ret
}

def TParameterReportingEntries_Initialize(): TParameterReportingEntries = TParameterReportingEntries(parameterReportStructure_ID = TParameterReportStructure_ID_Initialize(), periodicGenerationActionStatus = TPeriodicGenerationActionStatus.Tenabled, collectionInterval = ULong.fromRaw(0L))

@opaque @inlineOnce 
def TParameterReportingEntries_ACN_Encode(pVal: TParameterReportingEntries, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(70L))
    TParameterReportingEntries_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    val ParameterReportingEntries_parameterReportStructureType = pVal.parameterReportStructure_ID match
        case TParameterReportStructure_ID.housekeepingParameterReportStructure_ID_PRESENT(_) =>TParameterReportStructureType.ThousekeepingParameterReportStructure_ID
        case TParameterReportStructure_ID.diagnosticParameterReportStructure_ID_PRESENT(_) =>TParameterReportStructureType.TdiagnosticParameterReportStructure_ID

    /* Encode ParameterReportingEntries_parameterReportStructureType */
    val intVal_ParameterReportingEntries_parameterReportStructureType = ParameterReportingEntries_parameterReportStructureType match
        case TParameterReportStructureType.ThousekeepingParameterReportStructure_ID => ULong.fromRaw(0L)
        case TParameterReportStructureType.TdiagnosticParameterReportStructure_ID => ULong.fromRaw(1L)

    locally {
        ghostExpr {
            @opaque @inlineOnce
            def bitCountLemma(v: ULong): Unit = {
                require(v <= ULong.fromRaw(1))
            }.ensuring(_ => GetBitCountUnsigned(v) <= 5)
            bitCountLemma(intVal_ParameterReportingEntries_parameterReportStructureType)
        }
    }
    codec.enc_Int_PositiveInteger_ConstSize(intVal_ParameterReportingEntries_parameterReportStructureType, 5)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 70L, 5L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 5L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_0 = 5L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Encode parameterReportStructure_ID */
    ParameterReportingEntries_parameterReportStructure_ID_ACN_Encode(codec, pVal, ParameterReportingEntries_parameterReportStructureType, pVal.parameterReportStructure_ID) match {
        case Left(l) =>
            return Left(l)
        case Right(_) =>
            ()
    }
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_2.base.bitStream, codec.base.bitStream, 65L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 37L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_1 = pVal.parameterReportStructure_ID match {
        case TParameterReportStructure_ID.housekeepingParameterReportStructure_ID_PRESENT(housekeepingParameterReportStructure_ID) =>
            32L
        case TParameterReportStructure_ID.diagnosticParameterReportStructure_ID_PRESENT(diagnosticParameterReportStructure_ID) =>
            32L
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    @ghost val codec_0_3 = snapshot(codec)
    /* Encode periodicGenerationActionStatus */
    TPeriodicGenerationActionStatus_ACN_Encode(pVal.periodicGenerationActionStatus, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_3.base.bitStream, codec.base.bitStream, 33L, 1L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 38L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_2 = 1L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2)
    }
    @ghost val codec_0_4 = snapshot(codec)
    /* Encode collectionInterval */
    TPUSC_UINT32_ACN_Encode(pVal.collectionInterval, codec, false) match // uper:6
        case Right(_) =>
        case Left(err) => return Left(err)
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 70L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_3 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2 + size_3)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 70L)
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
def ParameterReportingEntries_parameterReportStructure_ID_ACN_Encode(codec: ACN, pVal: TParameterReportingEntries, ParameterReportingEntries_parameterReportStructureType: TParameterReportStructureType, parameterReportStructure_ID: TParameterReportStructure_ID): Either[Int, Int] = {
    require(codec.base.bitStream.validate_offset_bits(32L))
    @ghost val oldCdc = snapshot(codec)
    TParameterReportStructure_ID_IsConstraintValid(parameterReportStructure_ID) match {
        case Left(l) =>
            return Left[Int, Int](l)
        case Right(_) =>
    }
    parameterReportStructure_ID match
        case TParameterReportStructure_ID.housekeepingParameterReportStructure_ID_PRESENT(housekeepingParameterReportStructure_ID) =>
            THousekeepingParameterReportStructure_ID_ACN_Encode(housekeepingParameterReportStructure_ID, codec, false) match // uper:6
                case Right(_) =>
                case Left(err) => return Left(err)
        case TParameterReportStructure_ID.diagnosticParameterReportStructure_ID_PRESENT(diagnosticParameterReportStructure_ID) =>
            TDiagnosticParameterReportStructure_ID_ACN_Encode(diagnosticParameterReportStructure_ID, codec, false) match // uper:6
                case Right(_) =>
                case Left(err) => return Left(err)
    Right[Int, Int](0)
}.ensuring { (res: Either[Int, Int]) => 
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + parameterReportStructure_ID.size(old(codec).base.bitStream.bitIndex)
    }
}

@opaque @inlineOnce 
def TParameterReportingEntries_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TParameterReportingEntries] =
{
    require(codec.base.bitStream.validate_offset_bits(70L))

    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Decode ParameterReportingEntries_parameterReportStructureType */
    val intVal_ParameterReportingEntries_parameterReportStructureType = codec.dec_Int_PositiveInteger_ConstSize(5)

    val ParameterReportingEntries_parameterReportStructureType = intVal_ParameterReportingEntries_parameterReportStructureType.toRaw match
        case 0 => TParameterReportStructureType.ThousekeepingParameterReportStructure_ID
        case 1 => TParameterReportStructureType.TdiagnosticParameterReportStructure_ID
        case _ => return LeftMut(ERR_ACN_DECODE_PARAMETERREPORTINGENTRIES_PARAMETERREPORTSTRUCTURETYPE)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 70L, 5L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 5L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_0 = 5L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Decode parameterReportStructure_ID */
    val pVal_parameterReportStructure_ID = ParameterReportingEntries_parameterReportStructure_ID_ACN_Decode(codec, ParameterReportingEntries_parameterReportStructureType) match {
        case LeftMut(l) =>
            return LeftMut(l)
        case RightMut(v) =>
            v
    }
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_2.base.bitStream, codec.base.bitStream, 65L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 37L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_1 = pVal_parameterReportStructure_ID match {
        case TParameterReportStructure_ID.housekeepingParameterReportStructure_ID_PRESENT(housekeepingParameterReportStructure_ID) =>
            32L
        case TParameterReportStructure_ID.diagnosticParameterReportStructure_ID_PRESENT(diagnosticParameterReportStructure_ID) =>
            32L
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    @ghost val codec_0_3 = snapshot(codec)
    /* Decode periodicGenerationActionStatus */
    val pVal_periodicGenerationActionStatus = TPeriodicGenerationActionStatus_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_3.base.bitStream, codec.base.bitStream, 33L, 1L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 38L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_2 = 1L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2)
    }
    @ghost val codec_0_4 = snapshot(codec)
    /* Decode collectionInterval */
    val pVal_collectionInterval = TPUSC_UINT32_ACN_Decode(codec) match // uper:13
        case RightMut(decData) => decData
        case LeftMut(err) => return LeftMut(err)
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 70L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_3 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2 + size_3)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 70L)
    }
    val pVal = TParameterReportingEntries(pVal_parameterReportStructure_ID, pVal_periodicGenerationActionStatus, pVal_collectionInterval)
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0 + size_1 + size_2 + size_3)
    }

    TParameterReportingEntries_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TParameterReportingEntries](l)
        case Right(_) => RightMut[ErrorCode, TParameterReportingEntries](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TParameterReportingEntries]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TParameterReportingEntries_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TParameterReportingEntries_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TParameterReportingEntries]) =
{
    require(codec.base.bitStream.validate_offset_bits(70L))
    val cpy = snapshot(codec)
    val res = TParameterReportingEntries_ACN_Decode(cpy)
    (cpy, res)
}

@opaque @inlineOnce
def ParameterReportingEntries_parameterReportStructure_ID_ACN_Decode(codec: ACN, ParameterReportingEntries_parameterReportStructureType: TParameterReportStructureType): EitherMut[Int, TParameterReportStructure_ID] = {
    require(codec.base.bitStream.validate_offset_bits(32L))
    @ghost val oldCdc = snapshot(codec)
    val parameterReportStructure_ID = ParameterReportingEntries_parameterReportStructureType match
        case TParameterReportStructureType.ThousekeepingParameterReportStructure_ID =>
            val housekeepingParameterReportStructure_ID = THousekeepingParameterReportStructure_ID_ACN_Decode(codec) match // uper:13
                case RightMut(decData) => decData
                case LeftMut(err) => return LeftMut(err)
            TParameterReportStructure_ID.housekeepingParameterReportStructure_ID_PRESENT(housekeepingParameterReportStructure_ID)
        case TParameterReportStructureType.TdiagnosticParameterReportStructure_ID =>
            val diagnosticParameterReportStructure_ID = TDiagnosticParameterReportStructure_ID_ACN_Decode(codec) match // uper:13
                case RightMut(decData) => decData
                case LeftMut(err) => return LeftMut(err)
            TParameterReportStructure_ID.diagnosticParameterReportStructure_ID_PRESENT(diagnosticParameterReportStructure_ID)
    TParameterReportStructure_ID_IsConstraintValid(parameterReportStructure_ID) match {
        case Left(l) =>
            LeftMut[Int, TParameterReportStructure_ID](l)
        case Right(_) =>
            RightMut[Int, TParameterReportStructure_ID](parameterReportStructure_ID)
    }
}.ensuring { (res: EitherMut[Int, TParameterReportStructure_ID]) => 
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TParameterReportStructure_ID_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure
def ParameterReportingEntries_parameterReportStructure_ID_ACN_Decode_pure(codec: ACN, ParameterReportingEntries_parameterReportStructureType: TParameterReportStructureType): (ACN, EitherMut[Int, TParameterReportStructure_ID]) = {
    require(codec.base.bitStream.validate_offset_bits(32L))
    val cpy = snapshot(codec)
    val res = ParameterReportingEntries_parameterReportStructure_ID_ACN_Decode(cpy, ParameterReportingEntries_parameterReportStructureType)
    (cpy, res)
}