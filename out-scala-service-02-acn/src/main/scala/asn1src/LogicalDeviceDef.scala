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

sealed trait TLogicalDevice_ID:
    def i: Int
object TLogicalDevice_ID:
    case object Tldev1 extends TLogicalDevice_ID:
        override def i: Int = 0

// please use the following macros to avoid breaking code.
// type Tldev1 = TLogicalDevice_ID.ldev1

@inline @cCode.inline val ERR_LOGICALDEVICE_ID: Int = 1 /*ldev1 */

 

@inline @cCode.inline val ERR_ACN_ENCODE_LOGICALDEVICE_ID: Int = 4 /*  */
@inline @cCode.inline val TLogicalDevice_ID_REQUIRED_BYTES_FOR_ACN_ENCODING = 4
@inline @cCode.inline val TLogicalDevice_ID_REQUIRED_BITS_FOR_ACN_ENCODING = 32

@inline @cCode.inline val ERR_ACN_DECODE_LOGICALDEVICE_ID: Int = 5 /*  */


