#!/usr/bin/env groovy

def call(String name = 'verify') {
  sh "mvn clean ${name}"
}
