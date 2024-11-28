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

sealed trait TLdev1_Commands:
    def i: Int
object TLdev1_Commands:
    case object Tcommand1 extends TLdev1_Commands:
        override def i: Int = 0

// please use the following macros to avoid breaking code.
// type Tcommand1 = TLdev1_Commands.command1

@inline @cCode.inline val ERR_LDEV1_COMMANDS: Int = 171 /*command1 */

 

@inline @cCode.inline val ERR_ACN_ENCODE_LDEV1_COMMANDS: Int = 174 /*  */
@inline @cCode.inline val TLdev1_Commands_REQUIRED_BYTES_FOR_ACN_ENCODING = 4
@inline @cCode.inline val TLdev1_Commands_REQUIRED_BITS_FOR_ACN_ENCODING = 32

@inline @cCode.inline val ERR_ACN_DECODE_LDEV1_COMMANDS: Int = 175 /*  */
/*-- TLdev1_Arguments --------------------------------------------*/
type TLdev1_Arguments_command1 = ULong


enum TLdev1_Arguments:
    case command1_PRESENT(command1: TLdev1_Arguments_command1)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775799L))
        this match {
            case TLdev1_Arguments.command1_PRESENT(command1) =>
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
            case TLdev1_Arguments.command1_PRESENT(command1) =>
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
            case TLdev1_Arguments.command1_PRESENT(command1) =>
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
            case TLdev1_Arguments.command1_PRESENT(command1) =>
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
            case TLdev1_Arguments.command1_PRESENT(command1) =>
                ()
        }
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

@inline @cCode.inline val ERR_LDEV1_ARGUMENTS_COMMAND1: Int = 176 /*(0 .. 255) */

@inline @cCode.inline val ERR_LDEV1_ARGUMENTS: Int = 181 /* */

 
 
/*-- TLdev1 --------------------------------------------*/

case class TLdev1 (
    commandArguments: TLdev1_Arguments
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775767L))
        val size_0 = 32L
        val size_1 = this.commandArguments match {
            case TLdev1_Arguments.command1_PRESENT(command1) =>
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
        val size_1_offset = this.commandArguments match {
            case TLdev1_Arguments.command1_PRESENT(command1) =>
                8L
        }
        val size_1_otherOffset = this.commandArguments match {
            case TLdev1_Arguments.command1_PRESENT(command1) =>
                8L
        }
        this.commandArguments.sizeLemmaAnyOffset(offset + size_0_offset, otherOffset + size_0_otherOffset)
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
        val size_1_offset = this.commandArguments match {
            case TLdev1_Arguments.command1_PRESENT(command1) =>
                8L
        }
        val size_1_otherOffset = this.commandArguments match {
            case TLdev1_Arguments.command1_PRESENT(command1) =>
                8L
        }
        this.commandArguments.sizeLemmaNextByte(offset + size_0_offset, otherOffset + size_0_otherOffset)
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
        val size_1_offset = this.commandArguments match {
            case TLdev1_Arguments.command1_PRESENT(command1) =>
                8L
        }
        val size_1_otherOffset = this.commandArguments match {
            case TLdev1_Arguments.command1_PRESENT(command1) =>
                8L
        }
        this.commandArguments.sizeLemmaNextWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
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
        val size_1_offset = this.commandArguments match {
            case TLdev1_Arguments.command1_PRESENT(command1) =>
                8L
        }
        val size_1_otherOffset = this.commandArguments match {
            case TLdev1_Arguments.command1_PRESENT(command1) =>
                8L
        }
        this.commandArguments.sizeLemmaNextDWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_LDEV1: Int = 165 /* */
@inline @cCode.inline val ERR_LDEV1_COMMANDARGUMENTS_2: Int = 162 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_LDEV1: Int = 168 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_LDEV1_COMMAND_ID_UNINITIALIZED: Int = 169 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_LDEV1_COMMAND_ID: Int = 150 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_LDEV1_COMMANDARGUMENTS: Int = 160 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_LDEV1_COMMANDARGUMENTS_COMMAND1: Int = 155 /*  */
@inline @cCode.inline val TLdev1_REQUIRED_BYTES_FOR_ACN_ENCODING = 5
@inline @cCode.inline val TLdev1_REQUIRED_BITS_FOR_ACN_ENCODING = 40

@inline @cCode.inline val ERR_ACN_DECODE_LDEV1: Int = 170 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_LDEV1_COMMAND_ID: Int = 151 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_LDEV1_COMMANDARGUMENTS: Int = 161 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_LDEV1_COMMANDARGUMENTS_COMMAND1: Int = 156 /*  */
/*-- TCommand --------------------------------------------*/

enum TCommand:
    case ldev1_PRESENT(ldev1: TLdev1)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775767L))
        this match {
            case TCommand.ldev1_PRESENT(ldev1) =>
                ldev1.size(offset)
        }
    }.ensuring { (res: Long) => 
        res == 40L
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775767L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775767L))
        this match {
            case TCommand.ldev1_PRESENT(ldev1) =>
                ldev1.sizeLemmaAnyOffset(offset, otherOffset)
        }
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775767L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775767L))
        require((offset % 8L) == (otherOffset % 8L))
        this match {
            case TCommand.ldev1_PRESENT(ldev1) =>
                ldev1.sizeLemmaNextByte(offset, otherOffset)
        }
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775767L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775767L))
        require((offset % 16L) == (otherOffset % 16L))
        this match {
            case TCommand.ldev1_PRESENT(ldev1) =>
                ldev1.sizeLemmaNextWord(offset, otherOffset)
        }
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775767L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775767L))
        require((offset % 32L) == (otherOffset % 32L))
        this match {
            case TCommand.ldev1_PRESENT(ldev1) =>
                ldev1.sizeLemmaNextDWord(offset, otherOffset)
        }
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

@inline @cCode.inline val ERR_COMMAND: Int = 145 /* */
@inline @cCode.inline val ERR_COMMAND_LDEV1_2: Int = 140 /* */

 
/*-- TLogicalDeviceCommand --------------------------------------------*/

case class TLogicalDeviceCommand (
    command: TCommand
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854775735L))
        val size_0 = 32L
        val size_1 = this.command match {
            case TCommand.ldev1_PRESENT(ldev1) =>
                ldev1.size(offset + size_0)
        }
        size_0 + size_1
    }.ensuring { (res: Long) => 
        res == 72L
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775735L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775735L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.command match {
            case TCommand.ldev1_PRESENT(ldev1) =>
                ldev1.size(offset + size_0_offset)
        }
        val size_1_otherOffset = this.command match {
            case TCommand.ldev1_PRESENT(ldev1) =>
                ldev1.size(otherOffset + size_0_otherOffset)
        }
        this.command.sizeLemmaAnyOffset(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775735L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775735L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.command match {
            case TCommand.ldev1_PRESENT(ldev1) =>
                ldev1.size(offset + size_0_offset)
        }
        val size_1_otherOffset = this.command match {
            case TCommand.ldev1_PRESENT(ldev1) =>
                ldev1.size(otherOffset + size_0_otherOffset)
        }
        this.command.sizeLemmaNextByte(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775735L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775735L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.command match {
            case TCommand.ldev1_PRESENT(ldev1) =>
                ldev1.size(offset + size_0_offset)
        }
        val size_1_otherOffset = this.command match {
            case TCommand.ldev1_PRESENT(ldev1) =>
                ldev1.size(otherOffset + size_0_otherOffset)
        }
        this.command.sizeLemmaNextWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854775735L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775735L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.command match {
            case TCommand.ldev1_PRESENT(ldev1) =>
                ldev1.size(offset + size_0_offset)
        }
        val size_1_otherOffset = this.command match {
            case TCommand.ldev1_PRESENT(ldev1) =>
                ldev1.size(otherOffset + size_0_otherOffset)
        }
        this.command.sizeLemmaNextDWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_LOGICALDEVICECOMMAND: Int = 114 /* */
@inline @cCode.inline val ERR_LOGICALDEVICECOMMAND_COMMAND_2: Int = 111 /* */

 

@inline @cCode.inline val ERR_ACN_ENCODE_LOGICALDEVICECOMMAND: Int = 117 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_LOGICALDEVICECOMMAND_LOGICALDEVICE_ID_UNINITIALIZED: Int = 118 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_LOGICALDEVICECOMMAND_LOGICALDEVICE_ID: Int = 79 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_LOGICALDEVICECOMMAND_COMMAND: Int = 109 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_LOGICALDEVICECOMMAND_COMMAND_LDEV1_2: Int = 104 /*  */
@inline @cCode.inline val TLogicalDeviceCommand_REQUIRED_BYTES_FOR_ACN_ENCODING = 9
@inline @cCode.inline val TLogicalDeviceCommand_REQUIRED_BITS_FOR_ACN_ENCODING = 72

@inline @cCode.inline val ERR_ACN_DECODE_LOGICALDEVICECOMMAND: Int = 119 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_LOGICALDEVICECOMMAND_LOGICALDEVICE_ID: Int = 80 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_LOGICALDEVICECOMMAND_COMMAND: Int = 110 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_LOGICALDEVICECOMMAND_COMMAND_LDEV1_2: Int = 105 /*  */
/*-- TTC_2_10_DistributeLogicalDeviceCommands --------------------------------------------*/


case class TTC_2_10_DistributeLogicalDeviceCommands_logicalDeviceCommands (nCount: Int, arr: Vector[TLogicalDeviceCommand])
{
    require(this.arr.size <= 63 && 1 <= this.nCount && this.nCount <= this.arr.size)

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854771271L))
        TTC_2_10_DistributeLogicalDeviceCommands_logicalDeviceCommands.sizeRange(this.arr, offset, 0, this.nCount)
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 4536L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771271L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771271L))
        TTC_2_10_DistributeLogicalDeviceCommands_logicalDeviceCommands.sizeLemmaAnyOffset(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771271L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771271L))
        require((offset % 8L) == (otherOffset % 8L))
        TTC_2_10_DistributeLogicalDeviceCommands_logicalDeviceCommands.sizeLemmaNextByte(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771271L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771271L))
        require((offset % 16L) == (otherOffset % 16L))
        TTC_2_10_DistributeLogicalDeviceCommands_logicalDeviceCommands.sizeLemmaNextWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771271L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771271L))
        require((offset % 32L) == (otherOffset % 32L))
        TTC_2_10_DistributeLogicalDeviceCommands_logicalDeviceCommands.sizeLemmaNextDWord(this.arr, offset, otherOffset, 0, this.nCount)
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}
object TTC_2_10_DistributeLogicalDeviceCommands_logicalDeviceCommands {
    def sizeRange(ls: Vector[TLogicalDeviceCommand], offset: Long, from: Int, to: Int): Long = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 72L * (to - from)))
        decreases(to - from)
        if (from == to) {
            0L
        } else {
            val elemSize = ls.apply(from).size(offset)
            assert(elemSize == 72L)
            elemSize + TTC_2_10_DistributeLogicalDeviceCommands_logicalDeviceCommands.sizeRange(ls, offset + elemSize, from + 1, to)
        }
    }.ensuring { (res: Long) => 
        val nbElems = (to - from)
        (0L <= res && res <= 72L * nbElems)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(ls: Vector[TLogicalDeviceCommand], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 72L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 72L * (to - from)))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 72L)
            assert(elemSizeOtherOff == 72L)
            ls.apply(from).sizeLemmaAnyOffset(offset, otherOffset)
            TTC_2_10_DistributeLogicalDeviceCommands_logicalDeviceCommands.sizeLemmaAnyOffset(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_2_10_DistributeLogicalDeviceCommands_logicalDeviceCommands.sizeRange(ls, offset, from, to) == TTC_2_10_DistributeLogicalDeviceCommands_logicalDeviceCommands.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(ls: Vector[TLogicalDeviceCommand], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 72L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 72L * (to - from)))
        require((offset % 8L) == (otherOffset % 8L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 72L)
            assert(elemSizeOtherOff == 72L)
            ls.apply(from).sizeLemmaNextByte(offset, otherOffset)
            TTC_2_10_DistributeLogicalDeviceCommands_logicalDeviceCommands.sizeLemmaNextByte(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_2_10_DistributeLogicalDeviceCommands_logicalDeviceCommands.sizeRange(ls, offset, from, to) == TTC_2_10_DistributeLogicalDeviceCommands_logicalDeviceCommands.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(ls: Vector[TLogicalDeviceCommand], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 72L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 72L * (to - from)))
        require((offset % 16L) == (otherOffset % 16L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 72L)
            assert(elemSizeOtherOff == 72L)
            ls.apply(from).sizeLemmaNextWord(offset, otherOffset)
            TTC_2_10_DistributeLogicalDeviceCommands_logicalDeviceCommands.sizeLemmaNextWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_2_10_DistributeLogicalDeviceCommands_logicalDeviceCommands.sizeRange(ls, offset, from, to) == TTC_2_10_DistributeLogicalDeviceCommands_logicalDeviceCommands.sizeRange(ls, otherOffset, from, to)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(ls: Vector[TLogicalDeviceCommand], offset: Long, otherOffset: Long, from: Int, to: Int): Unit = {
        require((0 <= from) && (from <= to) && (to <= ls.size) && (ls.size <= 63))
        require((0L <= offset) && (offset <= 9223372036854775807L - 72L * (to - from)))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854775807L - 72L * (to - from)))
        require((offset % 32L) == (otherOffset % 32L))
        decreases(to - from)
        if (from == to) {
            ()
        } else {
            val elemSizeOff = ls.apply(from).size(offset)
            val elemSizeOtherOff = ls.apply(from).size(otherOffset)
            assert(elemSizeOff == 72L)
            assert(elemSizeOtherOff == 72L)
            ls.apply(from).sizeLemmaNextDWord(offset, otherOffset)
            TTC_2_10_DistributeLogicalDeviceCommands_logicalDeviceCommands.sizeLemmaNextDWord(ls, offset + elemSizeOff, otherOffset + elemSizeOtherOff, from + 1, to)
        }
    }.ensuring { (_: Unit) => 
        TTC_2_10_DistributeLogicalDeviceCommands_logicalDeviceCommands.sizeRange(ls, offset, from, to) == TTC_2_10_DistributeLogicalDeviceCommands_logicalDeviceCommands.sizeRange(ls, otherOffset, from, to)
    }
}

case class TTC_2_10_DistributeLogicalDeviceCommands (
    logicalDeviceCommands: TTC_2_10_DistributeLogicalDeviceCommands_logicalDeviceCommands
) {

    def size(offset: Long): Long = {
        require((0L <= offset) && (offset <= 9223372036854771239L))
        val size_0 = 32L
        val size_1 = this.logicalDeviceCommands.size(offset + size_0)
        size_0 + size_1
    }.ensuring { (res: Long) => 
        (0L <= res) && (res <= 4568L)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaAnyOffset(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771239L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771239L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.logicalDeviceCommands.size(offset + size_0_offset)
        val size_1_otherOffset = this.logicalDeviceCommands.size(otherOffset + size_0_otherOffset)
        this.logicalDeviceCommands.sizeLemmaAnyOffset(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextByte(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771239L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771239L))
        require((offset % 8L) == (otherOffset % 8L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.logicalDeviceCommands.size(offset + size_0_offset)
        val size_1_otherOffset = this.logicalDeviceCommands.size(otherOffset + size_0_otherOffset)
        this.logicalDeviceCommands.sizeLemmaNextByte(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771239L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771239L))
        require((offset % 16L) == (otherOffset % 16L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.logicalDeviceCommands.size(offset + size_0_offset)
        val size_1_otherOffset = this.logicalDeviceCommands.size(otherOffset + size_0_otherOffset)
        this.logicalDeviceCommands.sizeLemmaNextWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }

    @ghost @opaque @inlineOnce
    def sizeLemmaNextDWord(offset: Long, otherOffset: Long): Unit = {
        require((0L <= offset) && (offset <= 9223372036854771239L))
        require((0L <= otherOffset) && (otherOffset <= 9223372036854771239L))
        require((offset % 32L) == (otherOffset % 32L))
        val size_0_offset = 32L
        val size_0_otherOffset = 32L
        val size_1_offset = this.logicalDeviceCommands.size(offset + size_0_offset)
        val size_1_otherOffset = this.logicalDeviceCommands.size(otherOffset + size_0_otherOffset)
        this.logicalDeviceCommands.sizeLemmaNextDWord(offset + size_0_offset, otherOffset + size_0_otherOffset)
        ()
    }.ensuring { (res: Unit) => 
        this.size(offset) == this.size(otherOffset)
    }
}


@inline @cCode.inline val ERR_TC_2_10_DISTRIBUTELOGICALDEVICECOMMANDS_LOGICALDEVICECOMMANDS: Int = 68 /*(SIZE(1 .. maxTC-2-10-LogicalDeviceCommandCount)) */
@inline @cCode.inline val ERR_TC_2_10_DISTRIBUTELOGICALDEVICECOMMANDS_LOGICALDEVICECOMMANDS_ELM_2: Int = 63 /* */

@inline @cCode.inline val ERR_TC_2_10_DISTRIBUTELOGICALDEVICECOMMANDS: Int = 73 /* */

 
 

@inline @cCode.inline val ERR_ACN_ENCODE_TC_2_10_DISTRIBUTELOGICALDEVICECOMMANDS: Int = 76 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_2_10_DISTRIBUTELOGICALDEVICECOMMANDS_N_UNINITIALIZED: Int = 77 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_2_10_DISTRIBUTELOGICALDEVICECOMMANDS_N: Int = 21 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_2_10_DISTRIBUTELOGICALDEVICECOMMANDS_LOGICALDEVICECOMMANDS: Int = 71 /*  */
@inline @cCode.inline val ERR_ACN_ENCODE_TC_2_10_DISTRIBUTELOGICALDEVICECOMMANDS_LOGICALDEVICECOMMANDS_ELM_2: Int = 66 /*  */
@inline @cCode.inline val TTC_2_10_DistributeLogicalDeviceCommands_REQUIRED_BYTES_FOR_ACN_ENCODING = 571
@inline @cCode.inline val TTC_2_10_DistributeLogicalDeviceCommands_REQUIRED_BITS_FOR_ACN_ENCODING = 4568

@inline @cCode.inline val ERR_ACN_DECODE_TC_2_10_DISTRIBUTELOGICALDEVICECOMMANDS: Int = 78 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_2_10_DISTRIBUTELOGICALDEVICECOMMANDS_N: Int = 22 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_2_10_DISTRIBUTELOGICALDEVICECOMMANDS_LOGICALDEVICECOMMANDS: Int = 72 /*  */
@inline @cCode.inline val ERR_ACN_DECODE_TC_2_10_DISTRIBUTELOGICALDEVICECOMMANDS_LOGICALDEVICECOMMANDS_ELM_2: Int = 67 /*  */

// @inline @cCode.inline val maxTC_2_10_LogicalDeviceCommandCount: Int = 63 // defined in body
