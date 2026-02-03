pipeline {
    agent any
    
    tools {
        // These names must match your 'Global Tool Configuration'
        maven 'Maven 3.8.8' 
        jdk 'JDK 17'
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
                bat 'mvn clean install -DskipTests'
            }
        }
        stage('Test') {
            steps {
                // Runs your tests
                bat 'mvn test'
            }
            
            }
        }
    }
}
