package com.halo.groovy.json

import groovy.json.JsonOutput
import groovy.json.JsonSlurper

/**
 * GroovyJSON
 */
class GroovyJson {
    public static void main(String[] args) {
        def jsonSlurper = new JsonSlurper()
        def object = jsonSlurper.parseText('{ "name": "John", "ID" : "1"}')

        println(object.name);
        println(object.ID);

        def output = JsonOutput.toJson([name: 'John', ID: 1])
        println(output);
    }
}
