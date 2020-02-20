pipeline{
    agent any
    trigger{
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
    }
}
