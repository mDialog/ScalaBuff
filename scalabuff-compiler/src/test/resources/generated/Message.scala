// Generated by ScalaBuff, the Scala Protocol Buffers compiler. DO NOT EDIT!
// source: message.proto

package resources.generated

final case class EmptyMessage (

) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[EmptyMessage] {



	def writeTo(output: com.google.protobuf.CodedOutputStream) {
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var size = 0

		size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): EmptyMessage = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}

		def __newMerged = EmptyMessage(

		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: EmptyMessage) = {
		EmptyMessage(

		)
	}

	def getDefaultInstanceForType = EmptyMessage.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
}

object EmptyMessage {
	@reflect.BeanProperty val defaultInstance = new EmptyMessage()


	def apply(message: Array[Byte]): EmptyMessage = defaultInstance.mergeFrom(message)
	def apply(message: com.google.protobuf.ByteString): EmptyMessage = defaultInstance.mergeFrom(message)

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: EmptyMessage) = defaultInstance.mergeFrom(prototype)

}

object ScalaBuffMessageTest {
	def registerAllExtensions(registry: com.google.protobuf.ExtensionRegistryLite) {
	}

}
