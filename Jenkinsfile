pipeline {
    agent any
    
    triggers {
        cron('H 4 * * 1-5')  // Every weekday at 4:00 AM
    }
     
    stages {
         stage('Build') {
            steps {
                echo "building the project"
            }
        }
         stage('Test') {
            steps {
                sh "Testing the project"
            }
        }
        stage('Deploy') {
            steps {
                echo "Deploy the project"
            }
        }
        
        stage('compile') {
            steps {
                sh "mvn compile"
            }
        }
    }
}
