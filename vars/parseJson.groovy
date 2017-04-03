#!/usr/bin/env groovy
import groovy.json.JsonSlurperClassic 

def call(def json) {
    new groovy.json.JsonSlurperClassic().parseText(json)
}