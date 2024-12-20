/*
Code automatically generated by asn1scc tool
*/
package asn1src

import asn1scala._
import stainless.lang.{ghost => ghostExpr, _}
import stainless.annotation._
import stainless.collection._
import stainless.proof._
import StaticChecks._

val maxTC_2_7_PhysicalDeviceCommandCount: Int = 63 // variables:188

def TCommandData_dev1_IsConstraintValid(pVal: TCommandData_dev1): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = (pVal <= ULong.fromRaw(255L)) match
        case true =>
            Right(0)
        case false =>
            Left(45)
    ret
}

def TCommandData_IsConstraintValid(pVal: TCommandData): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    pVal match
        case TCommandData.CommandData_dev1_PRESENT(dev1) =>
            ret = TCommandData_dev1_IsConstraintValid(dev1)
    ret
}

def TCommandData_dev1_Initialize(): TCommandData_dev1 = ULong.fromRaw(0L)
def TCommandData_Initialize(): TCommandData = TCommandData.CommandData_dev1_PRESENT(ULong.fromRaw(0L))

def TPhysicalDeviceCommand_IsConstraintValid(pVal: TPhysicalDeviceCommand): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = TProtocolSpecificData_IsConstraintValid(pVal.protocolSpecificData)
    if ret.isRight then
        ret = TCommandData_IsConstraintValid(pVal.commandData)
    ret
}

def TPhysicalDeviceCommand_Initialize(): TPhysicalDeviceCommand = TPhysicalDeviceCommand(protocolSpecificData = TProtocolSpecificData_Initialize(), commandData = TCommandData_Initialize())

@opaque @inlineOnce 
def TPhysicalDeviceCommand_ACN_Encode(pVal: TPhysicalDeviceCommand, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(48L))
    TPhysicalDeviceCommand_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    val PhysicalDeviceCommand_physicalDevice_ID = {

        val PhysicalDeviceCommand_physicalDevice_ID00 = pVal.commandData match
            case TCommandData.CommandData_dev1_PRESENT(_) =>TPhysicalDevice_ID.Tdev1

        val PhysicalDeviceCommand_physicalDevice_ID01 = pVal.protocolSpecificData match
            case TProtocolSpecificData.ProtocolSpecificData_dev1_PRESENT(_) =>TPhysicalDevice_ID.Tdev1


        val PhysicalDeviceCommand_physicalDevice_ID = PhysicalDeviceCommand_physicalDevice_ID00


        if !((PhysicalDeviceCommand_physicalDevice_ID == PhysicalDeviceCommand_physicalDevice_ID00) && (PhysicalDeviceCommand_physicalDevice_ID == PhysicalDeviceCommand_physicalDevice_ID01)) then
            return Left(998)
        PhysicalDeviceCommand_physicalDevice_ID
    }
    /* Encode PhysicalDeviceCommand_physicalDevice_ID */
    val intVal_PhysicalDeviceCommand_physicalDevice_ID = PhysicalDeviceCommand_physicalDevice_ID match
        case TPhysicalDevice_ID.Tdev1 => ULong.fromRaw(1L)

    locally {
        ghostExpr {
            @opaque @inlineOnce
            def bitCountLemma(v: ULong): Unit = {
                require(v <= ULong.fromRaw(1))
            }.ensuring(_ => GetBitCountUnsigned(v) <= 4294967295L)
            bitCountLemma(intVal_PhysicalDeviceCommand_physicalDevice_ID)
        }
    }
    codec.enc_Int_PositiveInteger_ConstSize_big_endian_32(intVal_PhysicalDeviceCommand_physicalDevice_ID)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 48L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_0 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Encode protocolSpecificData */
    PhysicalDeviceCommand_protocolSpecificData_ACN_Encode(codec, pVal, PhysicalDeviceCommand_physicalDevice_ID, pVal.protocolSpecificData) match {
        case Left(l) =>
            return Left(l)
        case Right(_) =>
            ()
    }
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_2.base.bitStream, codec.base.bitStream, 16L, 8L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 40L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_1 = pVal.protocolSpecificData match {
        case TProtocolSpecificData.ProtocolSpecificData_dev1_PRESENT(dev1) =>
            8L
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    @ghost val codec_0_3 = snapshot(codec)
    /* Encode commandData */
    PhysicalDeviceCommand_commandData_ACN_Encode(codec, pVal, PhysicalDeviceCommand_physicalDevice_ID, pVal.commandData) match {
        case Left(l) =>
            return Left(l)
        case Right(_) =>
            ()
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 48L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_2 = pVal.commandData match {
        case TCommandData.CommandData_dev1_PRESENT(dev1) =>
            8L
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 48L)
    }
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0 + size_1 + size_2)
    }
    Right(0)
}.ensuring { (res : Either[ErrorCode, Int]) =>
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + pVal.size(old(codec).base.bitStream.bitIndex)
    }
}

@opaque @inlineOnce
def PhysicalDeviceCommand_protocolSpecificData_ACN_Encode(codec: ACN, pVal: TPhysicalDeviceCommand, PhysicalDeviceCommand_physicalDevice_ID: TPhysicalDevice_ID, protocolSpecificData: TProtocolSpecificData): Either[Int, Int] = {
    require(codec.base.bitStream.validate_offset_bits(8L))
    @ghost val oldCdc = snapshot(codec)
    TProtocolSpecificData_IsConstraintValid(protocolSpecificData) match {
        case Left(l) =>
            return Left[Int, Int](l)
        case Right(_) =>
    }
    protocolSpecificData match
        case TProtocolSpecificData.ProtocolSpecificData_dev1_PRESENT(dev1) =>
            codec.enc_Int_PositiveInteger_ConstSize_8(dev1)
    Right[Int, Int](0)
}.ensuring { (res: Either[Int, Int]) => 
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + protocolSpecificData.size(old(codec).base.bitStream.bitIndex)
    }
}

@opaque @inlineOnce
def PhysicalDeviceCommand_commandData_ACN_Encode(codec: ACN, pVal: TPhysicalDeviceCommand, PhysicalDeviceCommand_physicalDevice_ID: TPhysicalDevice_ID, commandData: TCommandData): Either[Int, Int] = {
    require(codec.base.bitStream.validate_offset_bits(8L))
    @ghost val oldCdc = snapshot(codec)
    TCommandData_IsConstraintValid(commandData) match {
        case Left(l) =>
            return Left[Int, Int](l)
        case Right(_) =>
    }
    commandData match
        case TCommandData.CommandData_dev1_PRESENT(dev1) =>
            codec.enc_Int_PositiveInteger_ConstSize_8(dev1)
    Right[Int, Int](0)
}.ensuring { (res: Either[Int, Int]) => 
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + commandData.size(old(codec).base.bitStream.bitIndex)
    }
}

@opaque @inlineOnce 
def TPhysicalDeviceCommand_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TPhysicalDeviceCommand] =
{
    require(codec.base.bitStream.validate_offset_bits(48L))

    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Decode PhysicalDeviceCommand_physicalDevice_ID */
    val intVal_PhysicalDeviceCommand_physicalDevice_ID = codec.dec_Int_PositiveInteger_ConstSize_big_endian_32()

    val PhysicalDeviceCommand_physicalDevice_ID = intVal_PhysicalDeviceCommand_physicalDevice_ID.toRaw match
        case 1 => TPhysicalDevice_ID.Tdev1
        case _ => return LeftMut(ERR_ACN_DECODE_PHYSICALDEVICECOMMAND_PHYSICALDEVICE_ID)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 48L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_0 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Decode protocolSpecificData */
    val pVal_protocolSpecificData = PhysicalDeviceCommand_protocolSpecificData_ACN_Decode(codec, PhysicalDeviceCommand_physicalDevice_ID) match {
        case LeftMut(l) =>
            return LeftMut(l)
        case RightMut(v) =>
            v
    }
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_2.base.bitStream, codec.base.bitStream, 16L, 8L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 40L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_1 = pVal_protocolSpecificData match {
        case TProtocolSpecificData.ProtocolSpecificData_dev1_PRESENT(dev1) =>
            8L
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    @ghost val codec_0_3 = snapshot(codec)
    /* Decode commandData */
    val pVal_commandData = PhysicalDeviceCommand_commandData_ACN_Decode(codec, PhysicalDeviceCommand_physicalDevice_ID) match {
        case LeftMut(l) =>
            return LeftMut(l)
        case RightMut(v) =>
            v
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 48L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_2 = pVal_commandData match {
        case TCommandData.CommandData_dev1_PRESENT(dev1) =>
            8L
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1 + size_2)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 48L)
    }
    val pVal = TPhysicalDeviceCommand(pVal_protocolSpecificData, pVal_commandData)
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0 + size_1 + size_2)
    }

    TPhysicalDeviceCommand_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TPhysicalDeviceCommand](l)
        case Right(_) => RightMut[ErrorCode, TPhysicalDeviceCommand](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TPhysicalDeviceCommand]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TPhysicalDeviceCommand_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TPhysicalDeviceCommand_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TPhysicalDeviceCommand]) =
{
    require(codec.base.bitStream.validate_offset_bits(48L))
    val cpy = snapshot(codec)
    val res = TPhysicalDeviceCommand_ACN_Decode(cpy)
    (cpy, res)
}

@opaque @inlineOnce
def PhysicalDeviceCommand_protocolSpecificData_ACN_Decode(codec: ACN, PhysicalDeviceCommand_physicalDevice_ID: TPhysicalDevice_ID): EitherMut[Int, TProtocolSpecificData] = {
    require(codec.base.bitStream.validate_offset_bits(8L))
    @ghost val oldCdc = snapshot(codec)
    val protocolSpecificData = PhysicalDeviceCommand_physicalDevice_ID match
        case TPhysicalDevice_ID.Tdev1 =>
            val dev1 = codec.dec_Int_PositiveInteger_ConstSize_8()
    
            TProtocolSpecificData.ProtocolSpecificData_dev1_PRESENT(dev1)
    TProtocolSpecificData_IsConstraintValid(protocolSpecificData) match {
        case Left(l) =>
            LeftMut[Int, TProtocolSpecificData](l)
        case Right(_) =>
            RightMut[Int, TProtocolSpecificData](protocolSpecificData)
    }
}.ensuring { (res: EitherMut[Int, TProtocolSpecificData]) => 
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TProtocolSpecificData_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure
def PhysicalDeviceCommand_protocolSpecificData_ACN_Decode_pure(codec: ACN, PhysicalDeviceCommand_physicalDevice_ID: TPhysicalDevice_ID): (ACN, EitherMut[Int, TProtocolSpecificData]) = {
    require(codec.base.bitStream.validate_offset_bits(8L))
    val cpy = snapshot(codec)
    val res = PhysicalDeviceCommand_protocolSpecificData_ACN_Decode(cpy, PhysicalDeviceCommand_physicalDevice_ID)
    (cpy, res)
}

@opaque @inlineOnce
def PhysicalDeviceCommand_commandData_ACN_Decode(codec: ACN, PhysicalDeviceCommand_physicalDevice_ID: TPhysicalDevice_ID): EitherMut[Int, TCommandData] = {
    require(codec.base.bitStream.validate_offset_bits(8L))
    @ghost val oldCdc = snapshot(codec)
    val commandData = PhysicalDeviceCommand_physicalDevice_ID match
        case TPhysicalDevice_ID.Tdev1 =>
            val dev1 = codec.dec_Int_PositiveInteger_ConstSize_8()
    
            TCommandData.CommandData_dev1_PRESENT(dev1)
    TCommandData_IsConstraintValid(commandData) match {
        case Left(l) =>
            LeftMut[Int, TCommandData](l)
        case Right(_) =>
            RightMut[Int, TCommandData](commandData)
    }
}.ensuring { (res: EitherMut[Int, TCommandData]) => 
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TCommandData_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure
def PhysicalDeviceCommand_commandData_ACN_Decode_pure(codec: ACN, PhysicalDeviceCommand_physicalDevice_ID: TPhysicalDevice_ID): (ACN, EitherMut[Int, TCommandData]) = {
    require(codec.base.bitStream.validate_offset_bits(8L))
    val cpy = snapshot(codec)
    val res = PhysicalDeviceCommand_commandData_ACN_Decode(cpy, PhysicalDeviceCommand_physicalDevice_ID)
    (cpy, res)
}

def TTC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands_IsConstraintValid(pVal: TTC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    var i1: Int = 0
    ret = ((1 <= pVal.nCount) && (pVal.nCount <= 63)) match
        case true =>
            Right(0)
        case false =>
            Left(45)
    if ret.isRight then
        i1 = 0
        (while(i1 < pVal.nCount && ret.isRight) {
            decreases(pVal.nCount - i1)
            ret = TPhysicalDeviceCommand_IsConstraintValid(pVal.arr(i1))
            i1 = i1 + 1
        }).invariant(0 <= i1 && i1 <= pVal.nCount)
    ret
}

def TTC_2_7_DistributePhysicalDeviceCommands_IsConstraintValid(pVal: TTC_2_7_DistributePhysicalDeviceCommands): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = TTC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands_IsConstraintValid(pVal.physicalDeviceCommands)
    ret
}

def TTC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands_Initialize(): TTC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands = TTC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands(1, Vector.fill(63)(TPhysicalDeviceCommand_Initialize()))
def TTC_2_7_DistributePhysicalDeviceCommands_Initialize(): TTC_2_7_DistributePhysicalDeviceCommands = TTC_2_7_DistributePhysicalDeviceCommands(physicalDeviceCommands = TTC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands_Initialize())

@opaque @inlineOnce 
def TTC_2_7_DistributePhysicalDeviceCommands_ACN_Encode(pVal: TTC_2_7_DistributePhysicalDeviceCommands, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(3056L))
    var i1: Int = 0
    TTC_2_7_DistributePhysicalDeviceCommands_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    val TC_2_7_DistributePhysicalDeviceCommands_n = ULong.fromRaw(pVal.physicalDeviceCommands.nCount)
    if TC_2_7_DistributePhysicalDeviceCommands_n < ULong.fromRaw(1) || TC_2_7_DistributePhysicalDeviceCommands_n > ULong.fromRaw(63) then
        return Left(860)
    /* Encode TC_2_7_DistributePhysicalDeviceCommands_n */
    locally {
        ghostExpr {
            @opaque @inlineOnce
            def bitCountLemma(v: ULong): Unit = {
                require(v <= ULong.fromRaw(4294967295L))
            }.ensuring(_ => GetBitCountUnsigned(v) <= 4294967295L)
            bitCountLemma(TC_2_7_DistributePhysicalDeviceCommands_n)
        }
    }
    codec.enc_Int_PositiveInteger_ConstSize_big_endian_32(TC_2_7_DistributePhysicalDeviceCommands_n)
    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 3056L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_0 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Encode physicalDeviceCommands */
    TC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands_ACN_Encode(codec, pVal, TC_2_7_DistributePhysicalDeviceCommands_n, pVal.physicalDeviceCommands) match {
        case Left(l) =>
            return Left(l)
        case Right(_) =>
            ()
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 3056L)
        check(codec.base.buf.length == oldCdc.base.buf.length)
    }
    @ghost val size_1 = pVal.physicalDeviceCommands.size(codec_0_2.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 3056L)
    }
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0 + size_1)
    }
    Right(0)
}.ensuring { (res : Either[ErrorCode, Int]) =>
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + pVal.size(old(codec).base.bitStream.bitIndex)
    }
}

@opaque @inlineOnce
def TC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands_Encode_loop(codec: ACN, physicalDeviceCommands: TTC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands, i1: Int): Either[Int, Int] = {
    require((0 <= i1) && (i1 <= physicalDeviceCommands.nCount))
    require((1 <= physicalDeviceCommands.nCount) && (physicalDeviceCommands.nCount <= physicalDeviceCommands.arr.size) && (physicalDeviceCommands.arr.size <= 63))
    require(codec.base.bitStream.validate_offset_bits((48L * (physicalDeviceCommands.nCount - i1))))
    decreases(physicalDeviceCommands.nCount - i1)
    if (i1 == physicalDeviceCommands.nCount) {
        Right[Int, Int](0)
    } else {
        @ghost val codecSnap1 = snapshot(codec)
        ghostExpr {
            BitStream.validateOffsetBitsWeakeningLemma(codec.base.bitStream, 48L * (physicalDeviceCommands.nCount - i1), 48L)
        }
        TPhysicalDeviceCommand_ACN_Encode(physicalDeviceCommands.arr(i1), codec, false) match // uper:6
            case Right(_) =>
            case Left(err) => return Left(err)
        @ghost val codecSnap2 = snapshot(codec)
        ghostExpr {
            check(48L * (i1 + 1) == 48L * i1 + 48L)
            BitStream.validateOffsetBitsIneqLemma(codecSnap1.base.bitStream, codec.base.bitStream, 48L * (physicalDeviceCommands.nCount - i1), 48L)
            check(codec.base.bitStream.validate_offset_bits(48L * (physicalDeviceCommands.nCount - (i1 + 1))))
        }
        val res = TC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands_Encode_loop(codec, physicalDeviceCommands, i1 + 1)
        ghostExpr {
            (res match {
                case Left(_) =>
                    ()
                case Right(_) =>
                    assert(codec.base.bitStream.bitIndex == codecSnap2.base.bitStream.bitIndex + TTC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands.sizeRange(physicalDeviceCommands.arr, codecSnap2.base.bitStream.bitIndex, i1 + 1, physicalDeviceCommands.nCount))
                    assert(codecSnap2.base.bitStream.bitIndex == codecSnap1.base.bitStream.bitIndex + physicalDeviceCommands.arr.apply(i1).size(codecSnap1.base.bitStream.bitIndex))
                    assert(TTC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands.sizeRange(physicalDeviceCommands.arr, codecSnap1.base.bitStream.bitIndex, i1, physicalDeviceCommands.nCount) == physicalDeviceCommands.arr.apply(i1).size(codecSnap1.base.bitStream.bitIndex) + TTC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands.sizeRange(physicalDeviceCommands.arr, codecSnap2.base.bitStream.bitIndex, i1 + 1, physicalDeviceCommands.nCount))
                    check(codec.base.bitStream.bitIndex == codecSnap1.base.bitStream.bitIndex + TTC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands.sizeRange(physicalDeviceCommands.arr, codecSnap1.base.bitStream.bitIndex, i1, physicalDeviceCommands.nCount))
            })
        }
        res
    }
}.ensuring { (res: Either[Int, Int]) => 
    res match {
        case Left(_) =>
            true
        case Right(res) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + TTC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands.sizeRange(physicalDeviceCommands.arr, old(codec).base.bitStream.bitIndex, i1, physicalDeviceCommands.nCount)
    }
}



@opaque @inlineOnce
def TC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands_ACN_Encode(codec: ACN, pVal: TTC_2_7_DistributePhysicalDeviceCommands, TC_2_7_DistributePhysicalDeviceCommands_n: ULong, physicalDeviceCommands: TTC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands): Either[Int, Int] = {
    require(codec.base.bitStream.validate_offset_bits(3024L))
    @ghost val oldCdc = snapshot(codec)
    TTC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands_IsConstraintValid(physicalDeviceCommands) match {
        case Left(l) =>
            return Left[Int, Int](l)
        case Right(_) =>
    }
    @ghost val codec_0_1 = snapshot(codec)
    @ghost val codecBeforeLoop_0 = snapshot(codec)
    TC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands_Encode_loop(codec, physicalDeviceCommands, 0) match {
        case Left(l) =>
            return Left[Int, Int](l)
        case Right(_) =>
            ghostExpr {
                physicalDeviceCommands.sizeLemmaAnyOffset(codecBeforeLoop_0.base.bitStream.bitIndex, oldCdc.base.bitStream.bitIndex)
            }
            ()
    }
    Right[Int, Int](0)
}.ensuring { (res: Either[Int, Int]) => 
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + physicalDeviceCommands.size(old(codec).base.bitStream.bitIndex)
    }
}

@opaque @inlineOnce 
def TTC_2_7_DistributePhysicalDeviceCommands_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TTC_2_7_DistributePhysicalDeviceCommands] =
{
    require(codec.base.bitStream.validate_offset_bits(3056L))
    var i1: Int = 0

    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    /* Decode TC_2_7_DistributePhysicalDeviceCommands_n */
    val TC_2_7_DistributePhysicalDeviceCommands_n = codec.dec_Int_PositiveInteger_ConstSize_big_endian_32()

    ghostExpr {
        BitStream.validateOffsetBitsIneqLemma(codec_0_1.base.bitStream, codec.base.bitStream, 3056L, 32L)
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 32L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_0 = 32L
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0)
    }
    @ghost val codec_0_2 = snapshot(codec)
    /* Decode physicalDeviceCommands */
    val pVal_physicalDeviceCommands = TC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands_ACN_Decode(codec, TC_2_7_DistributePhysicalDeviceCommands_n) match {
        case LeftMut(l) =>
            return LeftMut(l)
        case RightMut(v) =>
            v
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= oldCdc.base.bitStream.bitIndex + 3056L)
        check(codec.base.buf == oldCdc.base.buf)
    }
    @ghost val size_1 = pVal_physicalDeviceCommands.size(codec_0_2.base.bitStream.bitIndex)
    ghostExpr {
        check(codec.base.bitStream.bitIndex == oldCdc.base.bitStream.bitIndex + size_0 + size_1)
    }
    ghostExpr {
        check(codec.base.bitStream.bitIndex <= codec_0_1.base.bitStream.bitIndex + 3056L)
    }
    val pVal = TTC_2_7_DistributePhysicalDeviceCommands(pVal_physicalDeviceCommands)
    ghostExpr {
        check(pVal.size(oldCdc.base.bitStream.bitIndex) == size_0 + size_1)
    }

    TTC_2_7_DistributePhysicalDeviceCommands_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TTC_2_7_DistributePhysicalDeviceCommands](l)
        case Right(_) => RightMut[ErrorCode, TTC_2_7_DistributePhysicalDeviceCommands](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TTC_2_7_DistributePhysicalDeviceCommands]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTC_2_7_DistributePhysicalDeviceCommands_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TTC_2_7_DistributePhysicalDeviceCommands_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TTC_2_7_DistributePhysicalDeviceCommands]) =
{
    require(codec.base.bitStream.validate_offset_bits(3056L))
    val cpy = snapshot(codec)
    val res = TTC_2_7_DistributePhysicalDeviceCommands_ACN_Decode(cpy)
    (cpy, res)
}

@opaque @inlineOnce
def TC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands_Decode_loop(codec: ACN, nCount: Int, physicalDeviceCommands: Vector[TPhysicalDeviceCommand], i1: Int): EitherMut[Int, Vector[TPhysicalDeviceCommand]] = {
    require((1 <= nCount) && (nCount <= 63))
    require((0 <= i1) && (i1 <= nCount))
    require(physicalDeviceCommands.size == i1)
    require(codec.base.bitStream.validate_offset_bits((48L * (nCount - i1))))
    decreases(nCount - i1)
    @ghost val codecSnap1 = snapshot(codec)
    (if (i1 == nCount) {
        ghostExpr {
            vecRangesEqReflexiveLemma(physicalDeviceCommands)
            vecRangesEqSlicedLemma(physicalDeviceCommands, physicalDeviceCommands, 0, physicalDeviceCommands.size, 0, i1)
        }
        RightMut[Int, Vector[TPhysicalDeviceCommand]](physicalDeviceCommands)
    } else {
        ghostExpr {
            BitStream.validateOffsetBitsWeakeningLemma(codec.base.bitStream, 48L * (nCount - i1), 48L)
        }
        val physicalDeviceCommands_arr_i1_ = TPhysicalDeviceCommand_ACN_Decode(codec) match // uper:13
            case RightMut(decData) => decData
            case LeftMut(err) => return LeftMut(err)
        @ghost val codecSnap2 = snapshot(codec)
        ghostExpr {
            check(48L * (i1 + 1) == 48L * i1 + 48L)
            BitStream.validateOffsetBitsIneqLemma(codecSnap1.base.bitStream, codec.base.bitStream, 48L * (nCount - i1), 48L)
            check(codec.base.bitStream.validate_offset_bits(48L * (nCount - (i1 + 1))))
        }
        val res = TC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands_Decode_loop(codec, nCount, physicalDeviceCommands.append(physicalDeviceCommands_arr_i1_), i1 + 1)
        ghostExpr {
            (res match {
                case LeftMut(_) =>
                    ()
                case RightMut(newVec) =>
                    vecRangesAppendDropEq(physicalDeviceCommands, newVec, physicalDeviceCommands_arr_i1_, 0, i1)
                    vecRangesEqImpliesEq(physicalDeviceCommands.append(physicalDeviceCommands_arr_i1_), newVec, 0, i1, i1 + 1)
                    ListSpecs.isnocIndex(physicalDeviceCommands.list, physicalDeviceCommands_arr_i1_, i1)
                    Vector.listApplyEqVecApply(physicalDeviceCommands.append(physicalDeviceCommands_arr_i1_), i1)
                    check(physicalDeviceCommands_arr_i1_ == newVec.apply(i1))
            })
        }
        res
    })
}.ensuring { (res: EitherMut[Int, Vector[TPhysicalDeviceCommand]]) => 
    res match {
        case LeftMut(_) =>
            true
        case RightMut(newVec) =>
            old(codec).base.buf == codec.base.buf && newVec.size == nCount && vecRangesEq(physicalDeviceCommands, newVec, 0, i1) && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + TTC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands.sizeRange(newVec, old(codec).base.bitStream.bitIndex, i1, nCount)
    }
}



@opaque @inlineOnce
def TC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands_ACN_Decode(codec: ACN, TC_2_7_DistributePhysicalDeviceCommands_n: ULong): EitherMut[Int, TTC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands] = {
    require(codec.base.bitStream.validate_offset_bits(3024L))
    @ghost val oldCdc = snapshot(codec)
    @ghost val codec_0_1 = snapshot(codec)
    val physicalDeviceCommands =
        if ((ULong.fromRaw(1) <= TC_2_7_DistributePhysicalDeviceCommands_n) && (TC_2_7_DistributePhysicalDeviceCommands_n <= ULong.fromRaw(63))) then
            val physicalDeviceCommands_nCount = TC_2_7_DistributePhysicalDeviceCommands_n.toRaw.toInt
            @ghost val codecBeforeLoop_0 = snapshot(codec)
            val physicalDeviceCommands = TC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands_Decode_loop(codec, physicalDeviceCommands_nCount, Vector.empty[TPhysicalDeviceCommand], 0) match {
                case LeftMut(l) =>
                    return LeftMut(l)
                case RightMut(bdg) =>
                    val physicalDeviceCommands = TTC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands(physicalDeviceCommands_nCount, bdg)
                    ghostExpr {
                        physicalDeviceCommands.sizeLemmaAnyOffset(codecBeforeLoop_0.base.bitStream.bitIndex, oldCdc.base.bitStream.bitIndex)
                    }
                    physicalDeviceCommands
            }
            physicalDeviceCommands
        else return LeftMut(ERR_ACN_DECODE_TC_2_7_DISTRIBUTEPHYSICALDEVICECOMMANDS_PHYSICALDEVICECOMMANDS)
    TTC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands_IsConstraintValid(physicalDeviceCommands) match {
        case Left(l) =>
            LeftMut[Int, TTC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands](l)
        case Right(_) =>
            RightMut[Int, TTC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands](physicalDeviceCommands)
    }
}.ensuring { (res: EitherMut[Int, TTC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands]) => 
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + resVal.size(old(codec).base.bitStream.bitIndex) && TTC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure
def TC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands_ACN_Decode_pure(codec: ACN, TC_2_7_DistributePhysicalDeviceCommands_n: ULong): (ACN, EitherMut[Int, TTC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands]) = {
    require(codec.base.bitStream.validate_offset_bits(3024L))
    val cpy = snapshot(codec)
    val res = TC_2_7_DistributePhysicalDeviceCommands_physicalDeviceCommands_ACN_Decode(cpy, TC_2_7_DistributePhysicalDeviceCommands_n)
    (cpy, res)
}