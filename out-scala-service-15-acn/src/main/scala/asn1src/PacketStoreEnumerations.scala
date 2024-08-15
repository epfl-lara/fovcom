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


def TPacketStoreType_IsConstraintValid(pVal: TPacketStoreType): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = (((pVal == TPacketStoreType.TcircuralType)) || ((pVal == TPacketStoreType.TboundedType))) match
        case true =>
            Right(0)
        case false =>
            Left(45)
    ret
}

def TPacketStoreType_Initialize(): TPacketStoreType = TPacketStoreType.TcircuralType

@opaque @inlineOnce 
def TPacketStoreType_ACN_Encode(pVal: TPacketStoreType, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(1L))
    TPacketStoreType_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    val intVal_pVal = pVal match
        case TPacketStoreType.TcircuralType => ULong.fromRaw(0L)
        case TPacketStoreType.TboundedType => ULong.fromRaw(1L)

    locally {
        ghostExpr {
            @opaque @inlineOnce
            def bitCountLemma(v: ULong): Unit = {
                require(v <= ULong.fromRaw(1))
            }.ensuring(_ => GetBitCountUnsigned(v) <= 1)
            bitCountLemma(intVal_pVal)
        }
    }
    codec.enc_Int_PositiveInteger_ConstSize(intVal_pVal, 1)
    Right(0)
}.ensuring { (res : Either[ErrorCode, Int]) =>
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 1L
    }
}

@opaque @inlineOnce 
def TPacketStoreType_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TPacketStoreType] =
{
    require(codec.base.bitStream.validate_offset_bits(1L))

    @ghost val oldCdc = snapshot(codec)
    val intVal_pVal = codec.dec_Int_PositiveInteger_ConstSize(1)

    val pVal = intVal_pVal.toRaw match
        case 0 => TPacketStoreType.TcircuralType
        case 1 => TPacketStoreType.TboundedType
        case _ => return LeftMut(ERR_ACN_DECODE_PACKETSTORETYPE)

    TPacketStoreType_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TPacketStoreType](l)
        case Right(_) => RightMut[ErrorCode, TPacketStoreType](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TPacketStoreType]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 1L && TPacketStoreType_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TPacketStoreType_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TPacketStoreType]) =
{
    require(codec.base.bitStream.validate_offset_bits(1L))
    val cpy = snapshot(codec)
    val res = TPacketStoreType_ACN_Decode(cpy)
    (cpy, res)
}

def TPacketStoreStatus_IsConstraintValid(pVal: TPacketStoreStatus): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = (((pVal == TPacketStoreStatus.TPacketStoreStatus_val0)) || ((pVal == TPacketStoreStatus.TPacketStoreStatus_val1))) match
        case true =>
            Right(0)
        case false =>
            Left(45)
    ret
}

def TPacketStoreStatus_Initialize(): TPacketStoreStatus = TPacketStoreStatus.TPacketStoreStatus_val0

@opaque @inlineOnce 
def TPacketStoreStatus_ACN_Encode(pVal: TPacketStoreStatus, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(1L))
    TPacketStoreStatus_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    val intVal_pVal = pVal match
        case TPacketStoreStatus.TPacketStoreStatus_val0 => ULong.fromRaw(0L)
        case TPacketStoreStatus.TPacketStoreStatus_val1 => ULong.fromRaw(1L)

    locally {
        ghostExpr {
            @opaque @inlineOnce
            def bitCountLemma(v: ULong): Unit = {
                require(v <= ULong.fromRaw(1))
            }.ensuring(_ => GetBitCountUnsigned(v) <= 1)
            bitCountLemma(intVal_pVal)
        }
    }
    codec.enc_Int_PositiveInteger_ConstSize(intVal_pVal, 1)
    Right(0)
}.ensuring { (res : Either[ErrorCode, Int]) =>
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 1L
    }
}

@opaque @inlineOnce 
def TPacketStoreStatus_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TPacketStoreStatus] =
{
    require(codec.base.bitStream.validate_offset_bits(1L))

    @ghost val oldCdc = snapshot(codec)
    val intVal_pVal = codec.dec_Int_PositiveInteger_ConstSize(1)

    val pVal = intVal_pVal.toRaw match
        case 0 => TPacketStoreStatus.TPacketStoreStatus_val0
        case 1 => TPacketStoreStatus.TPacketStoreStatus_val1
        case _ => return LeftMut(ERR_ACN_DECODE_PACKETSTORESTATUS)

    TPacketStoreStatus_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TPacketStoreStatus](l)
        case Right(_) => RightMut[ErrorCode, TPacketStoreStatus](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TPacketStoreStatus]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 1L && TPacketStoreStatus_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TPacketStoreStatus_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TPacketStoreStatus]) =
{
    require(codec.base.bitStream.validate_offset_bits(1L))
    val cpy = snapshot(codec)
    val res = TPacketStoreStatus_ACN_Decode(cpy)
    (cpy, res)
}

def TPacketStoreTimeRangeRetrievalStatus_IsConstraintValid(pVal: TPacketStoreTimeRangeRetrievalStatus): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = (((pVal == TPacketStoreTimeRangeRetrievalStatus.Tdisabled)) || ((pVal == TPacketStoreTimeRangeRetrievalStatus.Tenabled))) match
        case true =>
            Right(0)
        case false =>
            Left(45)
    ret
}

def TPacketStoreTimeRangeRetrievalStatus_Initialize(): TPacketStoreTimeRangeRetrievalStatus = TPacketStoreTimeRangeRetrievalStatus.Tdisabled

@opaque @inlineOnce 
def TPacketStoreTimeRangeRetrievalStatus_ACN_Encode(pVal: TPacketStoreTimeRangeRetrievalStatus, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(1L))
    TPacketStoreTimeRangeRetrievalStatus_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    val intVal_pVal = pVal match
        case TPacketStoreTimeRangeRetrievalStatus.Tdisabled => ULong.fromRaw(0L)
        case TPacketStoreTimeRangeRetrievalStatus.Tenabled => ULong.fromRaw(1L)

    locally {
        ghostExpr {
            @opaque @inlineOnce
            def bitCountLemma(v: ULong): Unit = {
                require(v <= ULong.fromRaw(1))
            }.ensuring(_ => GetBitCountUnsigned(v) <= 1)
            bitCountLemma(intVal_pVal)
        }
    }
    codec.enc_Int_PositiveInteger_ConstSize(intVal_pVal, 1)
    Right(0)
}.ensuring { (res : Either[ErrorCode, Int]) =>
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 1L
    }
}

@opaque @inlineOnce 
def TPacketStoreTimeRangeRetrievalStatus_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TPacketStoreTimeRangeRetrievalStatus] =
{
    require(codec.base.bitStream.validate_offset_bits(1L))

    @ghost val oldCdc = snapshot(codec)
    val intVal_pVal = codec.dec_Int_PositiveInteger_ConstSize(1)

    val pVal = intVal_pVal.toRaw match
        case 0 => TPacketStoreTimeRangeRetrievalStatus.Tdisabled
        case 1 => TPacketStoreTimeRangeRetrievalStatus.Tenabled
        case _ => return LeftMut(ERR_ACN_DECODE_PACKETSTORETIMERANGERETRIEVALSTATUS)

    TPacketStoreTimeRangeRetrievalStatus_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TPacketStoreTimeRangeRetrievalStatus](l)
        case Right(_) => RightMut[ErrorCode, TPacketStoreTimeRangeRetrievalStatus](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TPacketStoreTimeRangeRetrievalStatus]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 1L && TPacketStoreTimeRangeRetrievalStatus_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TPacketStoreTimeRangeRetrievalStatus_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TPacketStoreTimeRangeRetrievalStatus]) =
{
    require(codec.base.bitStream.validate_offset_bits(1L))
    val cpy = snapshot(codec)
    val res = TPacketStoreTimeRangeRetrievalStatus_ACN_Decode(cpy)
    (cpy, res)
}

def TPacketStoreOpenRetrievalStatus_IsConstraintValid(pVal: TPacketStoreOpenRetrievalStatus): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = (((pVal == TPacketStoreOpenRetrievalStatus.Tsuspended)) || ((pVal == TPacketStoreOpenRetrievalStatus.TinProgress))) match
        case true =>
            Right(0)
        case false =>
            Left(45)
    ret
}

def TPacketStoreOpenRetrievalStatus_Initialize(): TPacketStoreOpenRetrievalStatus = TPacketStoreOpenRetrievalStatus.Tsuspended

@opaque @inlineOnce 
def TPacketStoreOpenRetrievalStatus_ACN_Encode(pVal: TPacketStoreOpenRetrievalStatus, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(1L))
    TPacketStoreOpenRetrievalStatus_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    val intVal_pVal = pVal match
        case TPacketStoreOpenRetrievalStatus.Tsuspended => ULong.fromRaw(0L)
        case TPacketStoreOpenRetrievalStatus.TinProgress => ULong.fromRaw(1L)

    locally {
        ghostExpr {
            @opaque @inlineOnce
            def bitCountLemma(v: ULong): Unit = {
                require(v <= ULong.fromRaw(1))
            }.ensuring(_ => GetBitCountUnsigned(v) <= 1)
            bitCountLemma(intVal_pVal)
        }
    }
    codec.enc_Int_PositiveInteger_ConstSize(intVal_pVal, 1)
    Right(0)
}.ensuring { (res : Either[ErrorCode, Int]) =>
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 1L
    }
}

@opaque @inlineOnce 
def TPacketStoreOpenRetrievalStatus_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TPacketStoreOpenRetrievalStatus] =
{
    require(codec.base.bitStream.validate_offset_bits(1L))

    @ghost val oldCdc = snapshot(codec)
    val intVal_pVal = codec.dec_Int_PositiveInteger_ConstSize(1)

    val pVal = intVal_pVal.toRaw match
        case 0 => TPacketStoreOpenRetrievalStatus.Tsuspended
        case 1 => TPacketStoreOpenRetrievalStatus.TinProgress
        case _ => return LeftMut(ERR_ACN_DECODE_PACKETSTOREOPENRETRIEVALSTATUS)

    TPacketStoreOpenRetrievalStatus_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TPacketStoreOpenRetrievalStatus](l)
        case Right(_) => RightMut[ErrorCode, TPacketStoreOpenRetrievalStatus](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TPacketStoreOpenRetrievalStatus]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 1L && TPacketStoreOpenRetrievalStatus_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TPacketStoreOpenRetrievalStatus_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TPacketStoreOpenRetrievalStatus]) =
{
    require(codec.base.bitStream.validate_offset_bits(1L))
    val cpy = snapshot(codec)
    val res = TPacketStoreOpenRetrievalStatus_ACN_Decode(cpy)
    (cpy, res)
}

def TPacketStoreRetrievalPriority_IsConstraintValid(pVal: TPacketStoreRetrievalPriority): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = (((pVal == TPacketStoreRetrievalPriority.TPacketStoreRetrievalPriority_val0)) || ((pVal == TPacketStoreRetrievalPriority.TPacketStoreRetrievalPriority_val1))) match
        case true =>
            Right(0)
        case false =>
            Left(45)
    ret
}

def TPacketStoreRetrievalPriority_Initialize(): TPacketStoreRetrievalPriority = TPacketStoreRetrievalPriority.TPacketStoreRetrievalPriority_val0

@opaque @inlineOnce 
def TPacketStoreRetrievalPriority_ACN_Encode(pVal: TPacketStoreRetrievalPriority, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(1L))
    TPacketStoreRetrievalPriority_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    val intVal_pVal = pVal match
        case TPacketStoreRetrievalPriority.TPacketStoreRetrievalPriority_val0 => ULong.fromRaw(0L)
        case TPacketStoreRetrievalPriority.TPacketStoreRetrievalPriority_val1 => ULong.fromRaw(1L)

    locally {
        ghostExpr {
            @opaque @inlineOnce
            def bitCountLemma(v: ULong): Unit = {
                require(v <= ULong.fromRaw(1))
            }.ensuring(_ => GetBitCountUnsigned(v) <= 1)
            bitCountLemma(intVal_pVal)
        }
    }
    codec.enc_Int_PositiveInteger_ConstSize(intVal_pVal, 1)
    Right(0)
}.ensuring { (res : Either[ErrorCode, Int]) =>
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 1L
    }
}

@opaque @inlineOnce 
def TPacketStoreRetrievalPriority_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TPacketStoreRetrievalPriority] =
{
    require(codec.base.bitStream.validate_offset_bits(1L))

    @ghost val oldCdc = snapshot(codec)
    val intVal_pVal = codec.dec_Int_PositiveInteger_ConstSize(1)

    val pVal = intVal_pVal.toRaw match
        case 0 => TPacketStoreRetrievalPriority.TPacketStoreRetrievalPriority_val0
        case 1 => TPacketStoreRetrievalPriority.TPacketStoreRetrievalPriority_val1
        case _ => return LeftMut(ERR_ACN_DECODE_PACKETSTORERETRIEVALPRIORITY)

    TPacketStoreRetrievalPriority_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TPacketStoreRetrievalPriority](l)
        case Right(_) => RightMut[ErrorCode, TPacketStoreRetrievalPriority](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TPacketStoreRetrievalPriority]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 1L && TPacketStoreRetrievalPriority_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TPacketStoreRetrievalPriority_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TPacketStoreRetrievalPriority]) =
{
    require(codec.base.bitStream.validate_offset_bits(1L))
    val cpy = snapshot(codec)
    val res = TPacketStoreRetrievalPriority_ACN_Decode(cpy)
    (cpy, res)
}

def TPacketStoreVirtualChannel_IsConstraintValid(pVal: TPacketStoreVirtualChannel): Either[ErrorCode, Int] =
{
    var ret: Either[ErrorCode, Int] = Right(0)
    ret = (((pVal == TPacketStoreVirtualChannel.TPacketStoreVirtualChannel_val0)) || ((pVal == TPacketStoreVirtualChannel.TPacketStoreVirtualChannel_val1))) match
        case true =>
            Right(0)
        case false =>
            Left(45)
    ret
}

def TPacketStoreVirtualChannel_Initialize(): TPacketStoreVirtualChannel = TPacketStoreVirtualChannel.TPacketStoreVirtualChannel_val0

@opaque @inlineOnce 
def TPacketStoreVirtualChannel_ACN_Encode(pVal: TPacketStoreVirtualChannel, codec: ACN, bCheckConstraints: Boolean): Either[ErrorCode, Int] =  // acn:21
{
    require(codec.base.bitStream.validate_offset_bits(1L))
    TPacketStoreVirtualChannel_IsConstraintValid(pVal) match
        case Left(l) => return Left(l)
        case Right(_) =>
    @ghost val oldCdc = snapshot(codec)
    val intVal_pVal = pVal match
        case TPacketStoreVirtualChannel.TPacketStoreVirtualChannel_val0 => ULong.fromRaw(0L)
        case TPacketStoreVirtualChannel.TPacketStoreVirtualChannel_val1 => ULong.fromRaw(1L)

    locally {
        ghostExpr {
            @opaque @inlineOnce
            def bitCountLemma(v: ULong): Unit = {
                require(v <= ULong.fromRaw(1))
            }.ensuring(_ => GetBitCountUnsigned(v) <= 1)
            bitCountLemma(intVal_pVal)
        }
    }
    codec.enc_Int_PositiveInteger_ConstSize(intVal_pVal, 1)
    Right(0)
}.ensuring { (res : Either[ErrorCode, Int]) =>
    res match {
        case Left(_) =>
            true
        case Right(_) =>
            old(codec).base.buf.length == codec.base.buf.length && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 1L
    }
}

@opaque @inlineOnce 
def TPacketStoreVirtualChannel_ACN_Decode(codec: ACN): EitherMut[ErrorCode, TPacketStoreVirtualChannel] =
{
    require(codec.base.bitStream.validate_offset_bits(1L))

    @ghost val oldCdc = snapshot(codec)
    val intVal_pVal = codec.dec_Int_PositiveInteger_ConstSize(1)

    val pVal = intVal_pVal.toRaw match
        case 0 => TPacketStoreVirtualChannel.TPacketStoreVirtualChannel_val0
        case 1 => TPacketStoreVirtualChannel.TPacketStoreVirtualChannel_val1
        case _ => return LeftMut(ERR_ACN_DECODE_PACKETSTOREVIRTUALCHANNEL)

    TPacketStoreVirtualChannel_IsConstraintValid(pVal) match
        case Left(l) => LeftMut[ErrorCode, TPacketStoreVirtualChannel](l)
        case Right(_) => RightMut[ErrorCode, TPacketStoreVirtualChannel](pVal)
}.ensuring { (res : EitherMut[ErrorCode, TPacketStoreVirtualChannel]) =>
    res match {
        case LeftMut(_) =>
            true
        case RightMut(resVal) =>
            old(codec).base.buf == codec.base.buf && codec.base.bitStream.bitIndex == old(codec).base.bitStream.bitIndex + 1L && TPacketStoreVirtualChannel_IsConstraintValid(resVal).isRight
    }
}

@ghost @pure 
def TPacketStoreVirtualChannel_ACN_Decode_pure(codec: ACN): (ACN, EitherMut[ErrorCode, TPacketStoreVirtualChannel]) =
{
    require(codec.base.bitStream.validate_offset_bits(1L))
    val cpy = snapshot(codec)
    val res = TPacketStoreVirtualChannel_ACN_Decode(cpy)
    (cpy, res)
}