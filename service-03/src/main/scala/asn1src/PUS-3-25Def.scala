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

/*-- TTM_3_25_HousekeepingParameterReport --------------------------------------------*/

case class TTM_3_25_HousekeepingParameterReport (
    parameterValue: THousekeepingParameterValues
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775767L))
        val size_0 = 32L
        val size_1 = this.parameterValue match {
            case THousekeepingParameterValues.HousekeepingParameterValues_struct1_PRESENT(struct1) =>
                8L
        }
        size_0 + size_1
    }.ensuring { (res: Long) => 
        res == 40L
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775767L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775767L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.parameterValue match {
            case THousekeepingParameterValues.HousekeepingParameterValues_struct1_PRESENT(struct1) =>
                8L
        }
        val size_1_otherOffset = this.parameterValue match {
            case THousekeepingParameterValues.HousekeepingParameterValues_struct1_PRESENT(struct1) =>
                8L
        }
        this.parameterValue.sizeLemmaAnyOffset(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775767L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775767L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.parameterValue match {
            case THousekeepingParameterValues.HousekeepingParameterValues_struct1_PRESENT(struct1) =>
                8L
        }
        val size_1_otherOffset = this.parameterValue match {
            case THousekeepingParameterValues.HousekeepingParameterValues_struct1_PRESENT(struct1) =>
                8L
        }
        this.parameterValue.sizeLemmaNextByte(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775767L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775767L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.parameterValue match {
            case THousekeepingParameterValues.HousekeepingParameterValues_struct1_PRESENT(struct1) =>
                8L
        }
        val size_1_otherOffset = this.parameterValue match {
            case THousekeepingParameterValues.HousekeepingParameterValues_struct1_PRESENT(struct1) =>
                8L
        }
        this.parameterValue.sizeLemmaNextWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775767L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775767L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.parameterValue match {
            case THousekeepingParameterValues.HousekeepingParameterValues_struct1_PRESENT(struct1) =>
                8L
        }
        val size_1_otherOffset = this.parameterValue match {
            case THousekeepingParameterValues.HousekeepingParameterValues_struct1_PRESENT(struct1) =>
                8L
        }
        this.parameterValue.sizeLemmaNextDWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TM_3_25_HOUSEKEEPINGPARAMETERREPORT: Int = 548 /* */
@inline @cCode.inline val ERR_TM_3_25_HOUSEKEEPINGPARAMETERREPORT_PARAMETERVALUE_2: Int = 545 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_TM_3_25_HOUSEKEEPINGPARAMETERREPORT: Int = 551 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_3_25_HOUSEKEEPINGPARAMETERREPORT_HOUSEKEEPINGPARAMETERREPORTSTRUCTURE_ID_UNINITIALIZED: Int = 552 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_3_25_HOUSEKEEPINGPARAMETERREPORT_HOUSEKEEPINGPARAMETERREPORTSTRUCTURE_ID: Int = 533 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_3_25_HOUSEKEEPINGPARAMETERREPORT_PARAMETERVALUE: Int = 543 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_3_25_HOUSEKEEPINGPARAMETERREPORT_PARAMETERVALUE_STRUCT1: Int = 538 /*  */
@inline @cCode.inline val TTM_3_25_HousekeepingParameterReport_REQUIRED_BYTES_FOR_ACN_ENCODING = 5
@inline @cCode.inline val TTM_3_25_HousekeepingParameterReport_REQUIRED_BITS_FOR_ACN_ENCODING = 40

@inline @cCode.inline val ERR_ACN_DECODE_TM_3_25_HOUSEKEEPINGPARAMETERREPORT: Int = 553 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_3_25_HOUSEKEEPINGPARAMETERREPORT_HOUSEKEEPINGPARAMETERREPORTSTRUCTURE_ID: Int = 534 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_3_25_HOUSEKEEPINGPARAMETERREPORT_PARAMETERVALUE: Int = 544 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_3_25_HOUSEKEEPINGPARAMETERREPORT_PARAMETERVALUE_STRUCT1: Int = 539 /*  */

