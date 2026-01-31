
pipeline {
  agent any

  tools {
    maven 'Maven3'
  }

  stages {
    stage('Checkout') {
      steps {
        checkout scm
      }
    }

    stage('Build & Test') {
      steps {
        sh 'mvn clean test'
      }
    }

    stage('Publish Allure Report') {
      steps {
        allure results: [[path: 'target/allure-results']]
      }
    }
  }

  post {
    always {
      archiveArtifacts artifacts: 'target/**', allowEmptyArchive: true
    }
  }
}
