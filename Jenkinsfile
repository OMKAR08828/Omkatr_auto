pipeline {
    agent any
    
    tools {
        // These names must match your 'Global Tool Configuration'
        maven 'maven' 
        jdk 'jdk11'
    }

    stages {
        stage('Checkout') {
            steps {
                // Pulls code from the repo configured in the Jenkins Job
                checkout scm 
            }
        }
        stage('Build') {
            steps {
                // Runs build without tests first to ensure compilation works
                sh 'mvn clean install -DskipTests'
            }
        }
        stage('Test') {
            steps {
                // Runs your tests
                sh 'mvn test'
            }
            post {
                always {
                    // Archives test results even if tests fail
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }
    }
}
