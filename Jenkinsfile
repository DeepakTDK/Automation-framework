pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Run Selenium Tests') {
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
