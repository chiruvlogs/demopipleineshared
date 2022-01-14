#!/usr/bin/env groovy

def call(string gitrep) {
    checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: ${gitrep}]]])
}