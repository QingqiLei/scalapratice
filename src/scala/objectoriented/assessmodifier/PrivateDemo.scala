package objectoriented.assessmodifier

class PrivateDemo {

}
package society {

  package professional {

    class Executive {
      private[professional] var workDetails = null
      private[society] var friends = null
      private[this] var secret = null

      def help(another: Executive) {
        println(another.workDetails)
        println(this.secret)
        println(another.secret) // Exception, inaccessible from this place
      }
    }

  }

  package social {

    class Acquaintance {
      def socialize(person: professional.Executive) {
        println(person.friends)
        println(person.workDetails) //会报错
      }
    }

  }
}