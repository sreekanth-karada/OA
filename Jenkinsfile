pipeline {
    agent any
    
    triggers {
        cron('H 4 * * 1-5')  // Every weekday at 4:00 AM
    }
     
    stages {
         stage('Build') {
            steps {
                echo "building the project"
                bat "mvn clean"
            }
        }
         stage('Test') {
            steps {
                echo "Testing the project"
                bat "mvn test"
            }
        }
        stage('compile') {
            steps {
                echo "compiling the project"
                bat "mvn compile"
            }
        stage('Deploy') {
            steps {
                echo "Deploy the project"
                
            }
        }
        
        
        }
    }
}
