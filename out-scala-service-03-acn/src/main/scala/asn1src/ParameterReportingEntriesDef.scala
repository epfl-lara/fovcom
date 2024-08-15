/*
Code automatically generated by asn1scc tool
*/
package asn1src

import asn1scala._
import stainless.lang._
import stainless.annotation._
import stainless.collection._
import stainless.proof._
import StaticChecks._

/*-- TParameterReportingEntries --------------------------------------------*/

case class TParameterReportingEntries (
    parameterReportStructure_ID: TParameterReportStructure_ID, 
    periodicGenerationActionStatus: TPeriodicGenerationActionStatus, 
    collectionInterval: TPUSC_UINT32
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775737L))
        val size_0 = 5L
        val size_1 = this.parameterReportStructure_ID match {
            case TParameterReportStructure_ID.housekeepingParameterReportStructure_ID_PRESENT(housekeepingParameterReportStructure_ID) =>
                32L
            case TParameterReportStructure_ID.diagnosticParameterReportStructure_ID_PRESENT(diagnosticParameterReportStructure_ID) =>
                32L
        }
        val size_2 = 1L
        val size_3 = 32L
        size_0 + size_1 + size_2 + size_3
    }.ensuring { (res: Long) => 
        res == 70L
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775737L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775737L))
        val size_0_offset = 5L
        val size_0_otherOffset = 5L
        val size_1_offset = this.parameterReportStructure_ID match {
            case TParameterReportStructure_ID.housekeepingParameterReportStructure_ID_PRESENT(housekeepingParameterReportStructure_ID) =>
                32L
            case TParameterReportStructure_ID.diagnosticParameterReportStructure_ID_PRESENT(diagnosticParameterReportStructure_ID) =>
                32L
        }
        val size_1_otherOffset = this.parameterReportStructure_ID match {
            case TParameterReportStructure_ID.housekeepingParameterReportStructure_ID_PRESENT(housekeepingParameterReportStructure_ID) =>
                32L
            case TParameterReportStructure_ID.diagnosticParameterReportStructure_ID_PRESENT(diagnosticParameterReportStructure_ID) =>
                32L
        }
        this.parameterReportStructure_ID.sizeLemmaAnyOffset(offset + size_0_offset, otherOffset + size_0_otherOffset)
        val size_2_offset = 1L
        val size_2_otherOffset = 1L
        val size_3_offset = 32L
        val size_3_otherOffset = 32L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775737L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775737L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 5L
        val size_0_otherOffset = 5L
        val size_1_offset = this.parameterReportStructure_ID match {
            case TParameterReportStructure_ID.housekeepingParameterReportStructure_ID_PRESENT(housekeepingParameterReportStructure_ID) =>
                32L
            case TParameterReportStructure_ID.diagnosticParameterReportStructure_ID_PRESENT(diagnosticParameterReportStructure_ID) =>
                32L
        }
        val size_1_otherOffset = this.parameterReportStructure_ID match {
            case TParameterReportStructure_ID.housekeepingParameterReportStructure_ID_PRESENT(housekeepingParameterReportStructure_ID) =>
                32L
            case TParameterReportStructure_ID.diagnosticParameterReportStructure_ID_PRESENT(diagnosticParameterReportStructure_ID) =>
                32L
        }
        this.parameterReportStructure_ID.sizeLemmaNextByte(offset + size_0_offset, otherOffset + size_0_otherOffset)
        val size_2_offset = 1L
        val size_2_otherOffset = 1L
        val size_3_offset = 32L
        val size_3_otherOffset = 32L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775737L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775737L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 5L
        val size_0_otherOffset = 5L
        val size_1_offset = this.parameterReportStructure_ID match {
            case TParameterReportStructure_ID.housekeepingParameterReportStructure_ID_PRESENT(housekeepingParameterReportStructure_ID) =>
                32L
            case TParameterReportStructure_ID.diagnosticParameterReportStructure_ID_PRESENT(diagnosticParameterReportStructure_ID) =>
                32L
        }
        val size_1_otherOffset = this.parameterReportStructure_ID match {
            case TParameterReportStructure_ID.housekeepingParameterReportStructure_ID_PRESENT(housekeepingParameterReportStructure_ID) =>
                32L
            case TParameterReportStructure_ID.diagnosticParameterReportStructure_ID_PRESENT(diagnosticParameterReportStructure_ID) =>
                32L
        }
        this.parameterReportStructure_ID.sizeLemmaNextWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        val size_2_offset = 1L
        val size_2_otherOffset = 1L
        val size_3_offset = 32L
        val size_3_otherOffset = 32L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775737L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775737L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 5L
        val size_0_otherOffset = 5L
        val size_1_offset = this.parameterReportStructure_ID match {
            case TParameterReportStructure_ID.housekeepingParameterReportStructure_ID_PRESENT(housekeepingParameterReportStructure_ID) =>
                32L
            case TParameterReportStructure_ID.diagnosticParameterReportStructure_ID_PRESENT(diagnosticParameterReportStructure_ID) =>
                32L
        }
        val size_1_otherOffset = this.parameterReportStructure_ID match {
            case TParameterReportStructure_ID.housekeepingParameterReportStructure_ID_PRESENT(housekeepingParameterReportStructure_ID) =>
                32L
            case TParameterReportStructure_ID.diagnosticParameterReportStructure_ID_PRESENT(diagnosticParameterReportStructure_ID) =>
                32L
        }
        this.parameterReportStructure_ID.sizeLemmaNextDWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        val size_2_offset = 1L
        val size_2_otherOffset = 1L
        val size_3_offset = 32L
        val size_3_otherOffset = 32L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_PARAMETERREPORTINGENTRIES: Int = 71 /* */
@inline @cCode.inline val ERR_PARAMETERREPORTINGENTRIES_PARAMETERREPORTSTRUCTURE_ID_2: Int = 43 /* */
@inline @cCode.inline val ERR_PARAMETERREPORTINGENTRIES_PERIODICGENERATIONACTIONSTATUS_2: Int = 51 /* */
@inline @cCode.inline val ERR_PARAMETERREPORTINGENTRIES_COLLECTIONINTERVAL_2_2: Int = 66 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_PARAMETERREPORTINGENTRIES: Int = 74 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_PARAMETERREPORTINGENTRIES_PARAMETERREPORTSTRUCTURETYPE_UNINITIALIZED: Int = 75 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_PARAMETERREPORTINGENTRIES_PARAMETERREPORTSTRUCTURETYPE: Int = 16 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_PARAMETERREPORTINGENTRIES_PARAMETERREPORTSTRUCTURE_ID: Int = 41 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_PARAMETERREPORTINGENTRIES_PARAMETERREPORTSTRUCTURE_ID_HOUSEKEEPINGPARAMETERREPORTSTRUCTURE_ID_2: Int = 26 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_PARAMETERREPORTINGENTRIES_PARAMETERREPORTSTRUCTURE_ID_DIAGNOSTICPARAMETERREPORTSTRUCTURE_ID_2: Int = 36 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_PARAMETERREPORTINGENTRIES_PERIODICGENERATIONACTIONSTATUS_2: Int = 54 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_PARAMETERREPORTINGENTRIES_COLLECTIONINTERVAL_2_2: Int = 69 /*  */
@inline @cCode.inline val TParameterReportingEntries_REQUIRED_BYTES_FOR_ACN_ENCODING = 9
@inline @cCode.inline val TParameterReportingEntries_REQUIRED_BITS_FOR_ACN_ENCODING = 70

@inline @cCode.inline val ERR_ACN_DECODE_PARAMETERREPORTINGENTRIES: Int = 76 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_PARAMETERREPORTINGENTRIES_PARAMETERREPORTSTRUCTURETYPE: Int = 17 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_PARAMETERREPORTINGENTRIES_PARAMETERREPORTSTRUCTURE_ID: Int = 42 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_PARAMETERREPORTINGENTRIES_PARAMETERREPORTSTRUCTURE_ID_HOUSEKEEPINGPARAMETERREPORTSTRUCTURE_ID_2: Int = 27 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_PARAMETERREPORTINGENTRIES_PARAMETERREPORTSTRUCTURE_ID_DIAGNOSTICPARAMETERREPORTSTRUCTURE_ID_2: Int = 37 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_PARAMETERREPORTINGENTRIES_PERIODICGENERATIONACTIONSTATUS_2: Int = 55 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_PARAMETERREPORTINGENTRIES_COLLECTIONINTERVAL_2_2: Int = 70 /*  */


