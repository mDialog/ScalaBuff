// Generated by ScalaBuff, the Scala protocol buffer compiler. DO NOT EDIT!
// source: packages.proto

package proto

object Packages {
	final case class Packages (

	) extends com.google.protobuf.GeneratedMessageLite
		with hr.sandrogrzicic.scalabuff.runtime.Message[Packages] {



		def writeTo(output: com.google.protobuf.CodedOutputStream) {
		}
		def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): Packages = {

			while (true) (in.readTag: @annotation.switch) match {
			case 0 => return Packages(

			)
			case default => if (!in.skipField(default)) return Packages(

			)
			}
			null // unreachable code
		}

		def mergeFrom(m: Packages) = {
			Packages(

			)
		}

		lazy val getSerializedSize = {
			import com.google.protobuf.CodedOutputStream._
			import com.google.protobuf.ByteString.copyFromUtf8
			var size = 0

			size
		}

		def getDefaultInstanceForType = Packages.defaultInstance
		def clear = getDefaultInstanceForType
		def isInitialized = true
		def build = this
		def buildPartial = this
		def newBuilderForType = this
		def toBuilder = this
	}

	object Packages {
		@reflect.BeanProperty val defaultInstance = new Packages()


	}

	def registerAllExtensions(registry: com.google.protobuf.ExtensionRegistryLite) {
	}

}