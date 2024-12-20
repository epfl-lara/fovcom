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

/*-- TTM_5_2_LowSeverityAnomalyReport --------------------------------------------*/

case class TTM_5_2_LowSeverityAnomalyReport (
    eventDefinition_ID: TEventDefinition_ID, 
    auxiliaryData: TDummyType
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775771L))
        val size_0 = 32L
        val size_1 = 4L
        size_0 + size_1
    }.ensuring { (res: Long) => 
        res == 36L
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775771L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775771L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = 4L
        val size_1_otherOffset = 4L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775771L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775771L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = 4L
        val size_1_otherOffset = 4L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775771L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775771L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = 4L
        val size_1_otherOffset = 4L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775771L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775771L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = 4L
        val size_1_otherOffset = 4L
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TM_5_2_LOWSEVERITYANOMALYREPORT: Int = 56 /* */
@inline @cCode.inline val ERR_TM_5_2_LOWSEVERITYANOMALYREPORT_EVENTDEFINITION_ID_2: Int = 36 /* */
@inline @cCode.inline val ERR_TM_5_2_LOWSEVERITYANOMALYREPORT_AUXILIARYDATA_2_2: Int = 51 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_TM_5_2_LOWSEVERITYANOMALYREPORT: Int = 59 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_5_2_LOWSEVERITYANOMALYREPORT_EVENTDEFINITION_ID_2: Int = 39 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_5_2_LOWSEVERITYANOMALYREPORT_AUXILIARYDATA_2_2: Int = 54 /*  */
@inline @cCode.inline val TTM_5_2_LowSeverityAnomalyReport_REQUIRED_BYTES_FOR_ACN_ENCODING = 5
@inline @cCode.inline val TTM_5_2_LowSeverityAnomalyReport_REQUIRED_BITS_FOR_ACN_ENCODING = 36

@inline @cCode.inline val ERR_ACN_DECODE_TM_5_2_LOWSEVERITYANOMALYREPORT: Int = 60 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_5_2_LOWSEVERITYANOMALYREPORT_EVENTDEFINITION_ID_2: Int = 40 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_5_2_LOWSEVERITYANOMALYREPORT_AUXILIARYDATA_2_2: Int = 55 /*  */


