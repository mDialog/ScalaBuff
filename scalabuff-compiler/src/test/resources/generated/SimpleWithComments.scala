// Generated by ScalaBuff, the Scala Protocol Buffers compiler. DO NOT EDIT!
// source: simpleWithComments.proto

package resources.generated

final case class SimpleRequest (
	`query`: String = "",
	`pageNumber`: Option[Int] = None,
	`resultsPerPage`: Option[Int] = None
) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[SimpleRequest] {

	def setPageNumber(_f: Int) = copy(`pageNumber` = Some(_f))
	def setResultsPerPage(_f: Int) = copy(`resultsPerPage` = Some(_f))

	def clearPageNumber = copy(`pageNumber` = None)
	def clearResultsPerPage = copy(`resultsPerPage` = None)

	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeString(1, `query`)
		if (`pageNumber`.isDefined) output.writeInt32(2, `pageNumber`.get)
		if (`resultsPerPage`.isDefined) output.writeInt32(3, `resultsPerPage`.get)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var size = 0
		size += computeStringSize(1, `query`)
		if (`pageNumber`.isDefined) size += computeInt32Size(2, `pageNumber`.get)
		if (`resultsPerPage`.isDefined) size += computeInt32Size(3, `resultsPerPage`.get)

		size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): SimpleRequest = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __query: String = ""
		var __pageNumber: Option[Int] = `pageNumber`
		var __resultsPerPage: Option[Int] = `resultsPerPage`

		def __newMerged = SimpleRequest(
			__query,
			__pageNumber,
			__resultsPerPage
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __query = in.readString()
			case 16 => __pageNumber = Some(in.readInt32())
			case 24 => __resultsPerPage = Some(in.readInt32())
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: SimpleRequest) = {
		SimpleRequest(
			m.`query`,
			m.`pageNumber`.orElse(`pageNumber`),
			m.`resultsPerPage`.orElse(`resultsPerPage`)
		)
	}

	def getDefaultInstanceForType = SimpleRequest.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
}

object SimpleRequest {
	@reflect.BeanProperty val defaultInstance = new SimpleRequest()

	def parseFrom(data: Array[Byte]): SimpleRequest = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): SimpleRequest = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf.ByteString): SimpleRequest = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): SimpleRequest = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[SimpleRequest] = defaultInstance.mergeDelimitedFromStream(stream)

	val QUERY_FIELD_NUMBER = 1
	val PAGE_NUMBER_FIELD_NUMBER = 2
	val RESULTS_PER_PAGE_FIELD_NUMBER = 3

	def parse(message: Array[Byte]): SimpleRequest = defaultInstance.mergeFrom(message)
	def parse(message: com.google.protobuf.ByteString): SimpleRequest = defaultInstance.mergeFrom(message)

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: SimpleRequest) = defaultInstance.mergeFrom(prototype)

}

