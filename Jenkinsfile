pipeline{
    agent any
    triggers{
    pollSCM('10 * * * *')
    }
    stages{
        stage("Checkout"){
            steps{
                git url:'https://github.com/dimpal21101/calculator.git'
            }
        }
        stage("compile"){
            steps{
                sh "./gradlew compileJava"
            }
        }
        stage("unit test"){
            steps{
                sh "./gradlew test"
            }
        }
        stage("Package"){
            steps{
            sh "./gradlew build"
            }
        }
        stage ("Docker build"){
            steps{
            sh "docker build -t dimpal2110/dimpal:calculator" .
            }
        }
        stage ("Docker Push"){
            steps{
            sh "docker push dimpal2110/dimpal:calculator"
            }
        }
    }
}
