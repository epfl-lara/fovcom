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

/*-- TTC_15_29_AddStructureIdentifiersToTheHousekeepingParameterReportStorage_ControlConfiguration --------------------------------------------*/

case class TTC_15_29_AddStructureIdentifiersToTheHousekeepingParameterReportStorage_ControlConfiguration (
    storage_ControlHousekeepingParameterReport: TStorage_ControlHousekeepingParameterReport
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854711722L))
        val size_0 = this.storage_ControlHousekeepingParameterReport.size(offset)
        (size_0)
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 64085L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854711722L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854711722L))
        val size_0_offset = this.storage_ControlHousekeepingParameterReport.size(offset)
        val size_0_otherOffset = this.storage_ControlHousekeepingParameterReport.size(otherOffset)
        this.storage_ControlHousekeepingParameterReport.sizeLemmaAnyOffset(offset, otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854711722L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854711722L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = this.storage_ControlHousekeepingParameterReport.size(offset)
        val size_0_otherOffset = this.storage_ControlHousekeepingParameterReport.size(otherOffset)
        this.storage_ControlHousekeepingParameterReport.sizeLemmaNextByte(offset, otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854711722L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854711722L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = this.storage_ControlHousekeepingParameterReport.size(offset)
        val size_0_otherOffset = this.storage_ControlHousekeepingParameterReport.size(otherOffset)
        this.storage_ControlHousekeepingParameterReport.sizeLemmaNextWord(offset, otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854711722L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854711722L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = this.storage_ControlHousekeepingParameterReport.size(offset)
        val size_0_otherOffset = this.storage_ControlHousekeepingParameterReport.size(otherOffset)
        this.storage_ControlHousekeepingParameterReport.sizeLemmaNextDWord(offset, otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TC_15_29_ADDSTRUCTUREIDENTIFIERSTOTHEHOUSEKEEPINGPARAMETERREPORTSTORAGE_CONTROLCONFIGURATION: Int = 1418 /* */
@inline @cCode.inline val ERR_TC_15_29_ADDSTRUCTUREIDENTIFIERSTOTHEHOUSEKEEPINGPARAMETERREPORTSTORAGE_CONTROLCONFIGURATION_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORT_2: Int = 1413 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_TC_15_29_ADDSTRUCTUREIDENTIFIERSTOTHEHOUSEKEEPINGPARAMETERREPORTSTORAGE_CONTROLCONFIGURATION: Int = 1421 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_15_29_ADDSTRUCTUREIDENTIFIERSTOTHEHOUSEKEEPINGPARAMETERREPORTSTORAGE_CONTROLCONFIGURATION_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORT_2: Int = 1416 /*  */
@inline @cCode.inline val TTC_15_29_AddStructureIdentifiersToTheHousekeepingParameterReportStorage_ControlConfiguration_REQUIRED_BYTES_FOR_ACN_ENCODING = 8011
@inline @cCode.inline val TTC_15_29_AddStructureIdentifiersToTheHousekeepingParameterReportStorage_ControlConfiguration_REQUIRED_BITS_FOR_ACN_ENCODING = 64085

@inline @cCode.inline val ERR_ACN_DECODE_TC_15_29_ADDSTRUCTUREIDENTIFIERSTOTHEHOUSEKEEPINGPARAMETERREPORTSTORAGE_CONTROLCONFIGURATION: Int = 1422 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_15_29_ADDSTRUCTUREIDENTIFIERSTOTHEHOUSEKEEPINGPARAMETERREPORTSTORAGE_CONTROLCONFIGURATION_STORAGE_CONTROLHOUSEKEEPINGPARAMETERREPORT_2: Int = 1417 /*  */

