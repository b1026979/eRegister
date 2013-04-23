package uk.ac.shu.webarch.eregister

import grails.converters.*


  class ClassesController {

    def index() {

      def result=[
        classList:'one',
        b:'two'
      ]

      withFormat {
         html result
         xml { render result as XML }
         json { render result as JSON }
      }


  }
}
