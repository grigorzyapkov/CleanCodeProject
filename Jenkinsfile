#!/usr/bin/env groovy

pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'echo "Hello World"'
            }
        }
        stage('BuildMore'){
            steps{
                sh '''
                echo "Multiline shell steps works too"
                ls -lah
            '''
            }
        }
    }
}