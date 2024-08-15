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

type THousekeepingParameterReportStructure_ID = ULong


@inline @cCode.inline val ERR_HOUSEKEEPINGPARAMETERREPORTSTRUCTURE_ID: Int = 3533 /*(0 .. 4294967295) */

 

@inline @cCode.inline val ERR_ACN_ENCODE_HOUSEKEEPINGPARAMETERREPORTSTRUCTURE_ID: Int = 3536 /*  */
@inline @cCode.inline val THousekeepingParameterReportStructure_ID_REQUIRED_BYTES_FOR_ACN_ENCODING = 4
@inline @cCode.inline val THousekeepingParameterReportStructure_ID_REQUIRED_BITS_FOR_ACN_ENCODING = 32

@inline @cCode.inline val ERR_ACN_DECODE_HOUSEKEEPINGPARAMETERREPORTSTRUCTURE_ID: Int = 3537 /*  */
/*-- THousekeepingParameterValues --------------------------------------------*/
type THousekeepingParameterValues_struct1 = ULong


enum THousekeepingParameterValues:
    case HousekeepingParameterValues_struct1_PRESENT(struct1: THousekeepingParameterValues_struct1)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775799L))
        this match {
            case THousekeepingParameterValues.HousekeepingParameterValues_struct1_PRESENT(struct1) =>
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
            case THousekeepingParameterValues.HousekeepingParameterValues_struct1_PRESENT(struct1) =>
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
            case THousekeepingParameterValues.HousekeepingParameterValues_struct1_PRESENT(struct1) =>
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
            case THousekeepingParameterValues.HousekeepingParameterValues_struct1_PRESENT(struct1) =>
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
            case THousekeepingParameterValues.HousekeepingParameterValues_struct1_PRESENT(struct1) =>
                ()
        }
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

@inline @cCode.inline val ERR_HOUSEKEEPINGPARAMETERVALUES_STRUCT1: Int = 3538 /*(0 .. 255) */

@inline @cCode.inline val ERR_HOUSEKEEPINGPARAMETERVALUES: Int = 3543 /* */

 
 


