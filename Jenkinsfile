pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn package'
      }
    }
    stage('Deliver') {
      steps {
        sh 'mvn deploy'
      }
    }
  }
}