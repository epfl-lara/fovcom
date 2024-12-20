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

/*-- TFilePath --------------------------------------------*/

case class TFilePath (
    repositoryPath: TPUSC_CHARSTR_VARIABLE_LEN, 
    fileName: TPUSC_CHARSTR_VARIABLE_LEN
) {
    require((4096 == this.repositoryPath.length && this.repositoryPath.indexOfOrLength(UByte.fromRaw(0.toByte)) <= 4095) && (4096 == this.fileName.length && this.fileName.indexOfOrLength(UByte.fromRaw(0.toByte)) <= 4095))

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854718453L))
        val size_0 = 12L
        val size_1 = 7L * this.repositoryPath.indexOfOrLength(UByte.fromRaw(0.toByte))
        val size_2 = 12L
        val size_3 = 7L * this.fileName.indexOfOrLength(UByte.fromRaw(0.toByte))
        size_0 + size_1 + size_2 + size_3
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 57354L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854718453L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854718453L))
        val size_0_offset = 12L
        val size_0_otherOffset = 12L
        val size_1_offset = 7L * this.repositoryPath.indexOfOrLength(UByte.fromRaw(0.toByte))
        val size_1_otherOffset = 7L * this.repositoryPath.indexOfOrLength(UByte.fromRaw(0.toByte))
        val size_2_offset = 12L
        val size_2_otherOffset = 12L
        val size_3_offset = 7L * this.fileName.indexOfOrLength(UByte.fromRaw(0.toByte))
        val size_3_otherOffset = 7L * this.fileName.indexOfOrLength(UByte.fromRaw(0.toByte))
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854718453L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854718453L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 12L
        val size_0_otherOffset = 12L
        val size_1_offset = 7L * this.repositoryPath.indexOfOrLength(UByte.fromRaw(0.toByte))
        val size_1_otherOffset = 7L * this.repositoryPath.indexOfOrLength(UByte.fromRaw(0.toByte))
        val size_2_offset = 12L
        val size_2_otherOffset = 12L
        val size_3_offset = 7L * this.fileName.indexOfOrLength(UByte.fromRaw(0.toByte))
        val size_3_otherOffset = 7L * this.fileName.indexOfOrLength(UByte.fromRaw(0.toByte))
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854718453L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854718453L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 12L
        val size_0_otherOffset = 12L
        val size_1_offset = 7L * this.repositoryPath.indexOfOrLength(UByte.fromRaw(0.toByte))
        val size_1_otherOffset = 7L * this.repositoryPath.indexOfOrLength(UByte.fromRaw(0.toByte))
        val size_2_offset = 12L
        val size_2_otherOffset = 12L
        val size_3_offset = 7L * this.fileName.indexOfOrLength(UByte.fromRaw(0.toByte))
        val size_3_otherOffset = 7L * this.fileName.indexOfOrLength(UByte.fromRaw(0.toByte))
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854718453L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854718453L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 12L
        val size_0_otherOffset = 12L
        val size_1_offset = 7L * this.repositoryPath.indexOfOrLength(UByte.fromRaw(0.toByte))
        val size_1_otherOffset = 7L * this.repositoryPath.indexOfOrLength(UByte.fromRaw(0.toByte))
        val size_2_offset = 12L
        val size_2_otherOffset = 12L
        val size_3_offset = 7L * this.fileName.indexOfOrLength(UByte.fromRaw(0.toByte))
        val size_3_otherOffset = 7L * this.fileName.indexOfOrLength(UByte.fromRaw(0.toByte))
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_FILEPATH: Int = 1549 /* */
@inline @cCode.inline val ERR_FILEPATH_REPOSITORYPATH_2: Int = 1536 /* */
@inline @cCode.inline val ERR_FILEPATH_FILENAME_2: Int = 1546 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_FILEPATH: Int = 1552 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_FILEPATH_REPOSITORYPATHLENGTH_UNINITIALIZED: Int = 1553 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_FILEPATH_REPOSITORYPATHLENGTH: Int = 1529 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_FILEPATH_REPOSITORYPATH: Int = 1534 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_FILEPATH_FILENAMELENGTH_UNINITIALIZED: Int = 1554 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_FILEPATH_FILENAMELENGTH: Int = 1539 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_FILEPATH_FILENAME: Int = 1544 /*  */
@inline @cCode.inline val TFilePath_REQUIRED_BYTES_FOR_ACN_ENCODING = 7170
@inline @cCode.inline val TFilePath_REQUIRED_BITS_FOR_ACN_ENCODING = 57354

@inline @cCode.inline val ERR_ACN_DECODE_FILEPATH: Int = 1555 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_FILEPATH_REPOSITORYPATHLENGTH: Int = 1530 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_FILEPATH_REPOSITORYPATH: Int = 1535 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_FILEPATH_FILENAMELENGTH: Int = 1540 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_FILEPATH_FILENAME: Int = 1545 /*  */


