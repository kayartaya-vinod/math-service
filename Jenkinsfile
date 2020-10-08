pipeline{
    
    agent any
    
    tools {
        
        maven 'Maven'
    }
    
    stages {
        
        stage("test") {
            
            steps {
                sh "mvn clean test"
            }

        }

    }


    
}
