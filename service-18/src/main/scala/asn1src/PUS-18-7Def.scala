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

/*-- TTC_18_7_CommunicateParametersToOBCP --------------------------------------------*/

case class TTC_18_7_CommunicateParametersToOBCP (
    argumentValues: TOBCPArgumentValues
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775764L))
        val size_0 = 35L
        val size_1 = this.argumentValues match {
            case TOBCPArgumentValues.arg0_PRESENT(arg0) =>
                8L
        }
        size_0 + size_1
    }.ensuring { (res: Long) => 
        res == 43L
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775764L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775764L))
        val size_0_offset = 35L
        val size_0_otherOffset = 35L
        val size_1_offset = this.argumentValues match {
            case TOBCPArgumentValues.arg0_PRESENT(arg0) =>
                8L
        }
        val size_1_otherOffset = this.argumentValues match {
            case TOBCPArgumentValues.arg0_PRESENT(arg0) =>
                8L
        }
        this.argumentValues.sizeLemmaAnyOffset(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775764L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775764L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 35L
        val size_0_otherOffset = 35L
        val size_1_offset = this.argumentValues match {
            case TOBCPArgumentValues.arg0_PRESENT(arg0) =>
                8L
        }
        val size_1_otherOffset = this.argumentValues match {
            case TOBCPArgumentValues.arg0_PRESENT(arg0) =>
                8L
        }
        this.argumentValues.sizeLemmaNextByte(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775764L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775764L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 35L
        val size_0_otherOffset = 35L
        val size_1_offset = this.argumentValues match {
            case TOBCPArgumentValues.arg0_PRESENT(arg0) =>
                8L
        }
        val size_1_otherOffset = this.argumentValues match {
            case TOBCPArgumentValues.arg0_PRESENT(arg0) =>
                8L
        }
        this.argumentValues.sizeLemmaNextWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775764L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775764L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 35L
        val size_0_otherOffset = 35L
        val size_1_offset = this.argumentValues match {
            case TOBCPArgumentValues.arg0_PRESENT(arg0) =>
                8L
        }
        val size_1_otherOffset = this.argumentValues match {
            case TOBCPArgumentValues.arg0_PRESENT(arg0) =>
                8L
        }
        this.argumentValues.sizeLemmaNextDWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TC_18_7_COMMUNICATEPARAMETERSTOOBCP: Int = 596 /* */
@inline @cCode.inline val ERR_TC_18_7_COMMUNICATEPARAMETERSTOOBCP_ARGUMENTVALUES_2: Int = 593 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_TC_18_7_COMMUNICATEPARAMETERSTOOBCP: Int = 599 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_18_7_COMMUNICATEPARAMETERSTOOBCP_OBCP_ID_UNINITIALIZED: Int = 600 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_18_7_COMMUNICATEPARAMETERSTOOBCP_OBCP_ID: Int = 581 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_18_7_COMMUNICATEPARAMETERSTOOBCP_ARGUMENTVALUES: Int = 591 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_18_7_COMMUNICATEPARAMETERSTOOBCP_ARGUMENTVALUES_ARG0: Int = 586 /*  */
@inline @cCode.inline val TTC_18_7_CommunicateParametersToOBCP_REQUIRED_BYTES_FOR_ACN_ENCODING = 6
@inline @cCode.inline val TTC_18_7_CommunicateParametersToOBCP_REQUIRED_BITS_FOR_ACN_ENCODING = 43

@inline @cCode.inline val ERR_ACN_DECODE_TC_18_7_COMMUNICATEPARAMETERSTOOBCP: Int = 601 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_18_7_COMMUNICATEPARAMETERSTOOBCP_OBCP_ID: Int = 582 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_18_7_COMMUNICATEPARAMETERSTOOBCP_ARGUMENTVALUES: Int = 592 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_18_7_COMMUNICATEPARAMETERSTOOBCP_ARGUMENTVALUES_ARG0: Int = 587 /*  */

