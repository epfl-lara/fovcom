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

/*-- TTM_9_3_CdsTimeReport --------------------------------------------*/

case class TTM_9_3_CdsTimeReport (
    rateExponentialValue: OptionMut[TPUSC_UINT32], 
    spacecraftTime: TCDS_AbsoluteTime_PFC_2, 
    spacecraftTimeReferenceStatus: OptionMut[TSpacecraftTimeReferenceStatus]
) {
    require(this.rateExponentialValue.isDefined && this.spacecraftTimeReferenceStatus.isDefined)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775707L))
        val size_0 = (this.rateExponentialValue match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        })
        val size_1 = this.spacecraftTime.size(offset + size_0)
        val size_2 = this.spacecraftTimeReferenceStatus match {
            case SomeMut(v) =>
                4L
            case NoneMut() =>
                0L
        }
        size_0 + size_1 + size_2
    }.ensuring { (res: Long) => 
        res == 100L
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775707L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775707L))
        val size_0_offset = (this.rateExponentialValue match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        })
        val size_0_otherOffset = this.rateExponentialValue match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_1_offset = this.spacecraftTime.size(offset + size_0_offset)
        val size_1_otherOffset = this.spacecraftTime.size(otherOffset + size_0_otherOffset)
        this.spacecraftTime.sizeLemmaAnyOffset(offset + size_0_offset, otherOffset + size_0_otherOffset)
        val size_2_offset = this.spacecraftTimeReferenceStatus match {
            case SomeMut(v) =>
                4L
            case NoneMut() =>
                0L
        }
        val size_2_otherOffset = this.spacecraftTimeReferenceStatus match {
            case SomeMut(v) =>
                4L
            case NoneMut() =>
                0L
        }
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775707L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775707L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = (this.rateExponentialValue match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        })
        val size_0_otherOffset = this.rateExponentialValue match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_1_offset = this.spacecraftTime.size(offset + size_0_offset)
        val size_1_otherOffset = this.spacecraftTime.size(otherOffset + size_0_otherOffset)
        this.spacecraftTime.sizeLemmaNextByte(offset + size_0_offset, otherOffset + size_0_otherOffset)
        val size_2_offset = this.spacecraftTimeReferenceStatus match {
            case SomeMut(v) =>
                4L
            case NoneMut() =>
                0L
        }
        val size_2_otherOffset = this.spacecraftTimeReferenceStatus match {
            case SomeMut(v) =>
                4L
            case NoneMut() =>
                0L
        }
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775707L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775707L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = (this.rateExponentialValue match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        })
        val size_0_otherOffset = this.rateExponentialValue match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_1_offset = this.spacecraftTime.size(offset + size_0_offset)
        val size_1_otherOffset = this.spacecraftTime.size(otherOffset + size_0_otherOffset)
        this.spacecraftTime.sizeLemmaNextWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        val size_2_offset = this.spacecraftTimeReferenceStatus match {
            case SomeMut(v) =>
                4L
            case NoneMut() =>
                0L
        }
        val size_2_otherOffset = this.spacecraftTimeReferenceStatus match {
            case SomeMut(v) =>
                4L
            case NoneMut() =>
                0L
        }
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775707L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775707L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = (this.rateExponentialValue match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        })
        val size_0_otherOffset = this.rateExponentialValue match {
            case SomeMut(v) =>
                32L
            case NoneMut() =>
                0L
        }
        val size_1_offset = this.spacecraftTime.size(offset + size_0_offset)
        val size_1_otherOffset = this.spacecraftTime.size(otherOffset + size_0_otherOffset)
        this.spacecraftTime.sizeLemmaNextDWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        val size_2_offset = this.spacecraftTimeReferenceStatus match {
            case SomeMut(v) =>
                4L
            case NoneMut() =>
                0L
        }
        val size_2_otherOffset = this.spacecraftTimeReferenceStatus match {
            case SomeMut(v) =>
                4L
            case NoneMut() =>
                0L
        }
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TM_9_3_CDSTIMEREPORT: Int = 136 /*(WITH COMPONENTS
        {
            rateExponentialValue PRESENT,
            spacecraftTimeReferenceStatus PRESENT
        }) */
@inline @cCode.inline val ERR_TM_9_3_CDSTIMEREPORT_RATEEXPONENTIALVALUE_2_2: Int = 91 /* */
@inline @cCode.inline val ERR_TM_9_3_CDSTIMEREPORT_SPACECRAFTTIME_2_2: Int = 121 /* */
@inline @cCode.inline val ERR_TM_9_3_CDSTIMEREPORT_SPACECRAFTTIMEREFERENCESTATUS_2: Int = 131 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_TM_9_3_CDSTIMEREPORT: Int = 139 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_9_3_CDSTIMEREPORT_RATEEXPONENTIALVALUE_2_2: Int = 94 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_9_3_CDSTIMEREPORT_SPACECRAFTTIME_2_2: Int = 124 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TM_9_3_CDSTIMEREPORT_SPACECRAFTTIMEREFERENCESTATUS_2: Int = 134 /*  */
@inline @cCode.inline val TTM_9_3_CdsTimeReport_REQUIRED_BYTES_FOR_ACN_ENCODING = 13
@inline @cCode.inline val TTM_9_3_CdsTimeReport_REQUIRED_BITS_FOR_ACN_ENCODING = 100

@inline @cCode.inline val ERR_ACN_DECODE_TM_9_3_CDSTIMEREPORT: Int = 140 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_9_3_CDSTIMEREPORT_RATEEXPONENTIALVALUE_2_2: Int = 95 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_9_3_CDSTIMEREPORT_SPACECRAFTTIME_2_2: Int = 125 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TM_9_3_CDSTIMEREPORT_SPACECRAFTTIMEREFERENCESTATUS_2: Int = 135 /*  */


