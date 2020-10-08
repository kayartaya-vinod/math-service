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
        
        stage("build") {
            when {
                branch "master"
            }
            steps {
                sh "mvn package -DskipTests"
            }


        }


    }


    
}
