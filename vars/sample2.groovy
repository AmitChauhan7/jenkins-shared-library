def echo1() {
    echo "Hello World from Shared Library"
}
    def call() {
        pipeline {
            agent any

            stages {
                stage('Sample') {
                    steps {
                        script {
                            echo1()
                        }
                    }
                }
            }
        }
    }
