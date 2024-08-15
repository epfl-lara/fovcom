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

type TDiagnosticParameterReportStructure_ID = ULong


@inline @cCode.inline val ERR_DIAGNOSTICPARAMETERREPORTSTRUCTURE_ID: Int = 858 /*(0 .. 4294967295) */

 

@inline @cCode.inline val ERR_ACN_ENCODE_DIAGNOSTICPARAMETERREPORTSTRUCTURE_ID: Int = 861 /*  */
@inline @cCode.inline val TDiagnosticParameterReportStructure_ID_REQUIRED_BYTES_FOR_ACN_ENCODING = 4
@inline @cCode.inline val TDiagnosticParameterReportStructure_ID_REQUIRED_BITS_FOR_ACN_ENCODING = 32

@inline @cCode.inline val ERR_ACN_DECODE_DIAGNOSTICPARAMETERREPORTSTRUCTURE_ID: Int = 862 /*  */
/*-- TDiagnosticParameterValues --------------------------------------------*/
type TDiagnosticParameterValues_struct1 = ULong


enum TDiagnosticParameterValues:
    case DiagnosticParameterValues_struct1_PRESENT(struct1: TDiagnosticParameterValues_struct1)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775799L))
        this match {
            case TDiagnosticParameterValues.DiagnosticParameterValues_struct1_PRESENT(struct1) =>
                8L
        }
    }.ensuring { (res: Long) => 
        res == 8L
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775799L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775799L))
        this match {
            case TDiagnosticParameterValues.DiagnosticParameterValues_struct1_PRESENT(struct1) =>
                ()
        }
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775799L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775799L))
        require((offset % 8L) == (otherOffset % 8L))
        this match {
            case TDiagnosticParameterValues.DiagnosticParameterValues_struct1_PRESENT(struct1) =>
                ()
        }
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775799L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775799L))
        require((offset % 16L) == (otherOffset % 16L))
        this match {
            case TDiagnosticParameterValues.DiagnosticParameterValues_struct1_PRESENT(struct1) =>
                ()
        }
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775799L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775799L))
        require((offset % 32L) == (otherOffset % 32L))
        this match {
            case TDiagnosticParameterValues.DiagnosticParameterValues_struct1_PRESENT(struct1) =>
                ()
        }
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

@inline @cCode.inline val ERR_DIAGNOSTICPARAMETERVALUES_STRUCT1: Int = 863 /*(0 .. 255) */

@inline @cCode.inline val ERR_DIAGNOSTICPARAMETERVALUES: Int = 868 /* */

 
 


