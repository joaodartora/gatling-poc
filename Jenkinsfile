node {
        stage('clean workspace') {
            cleanWs()
        }
        stage('git preparation') {
            git url: 'https://github.com/joaodartora/gatling-test.git'
        }
        stage('getting gorilla/mux') {
            sh 'go get -u github.com/gorilla/mux'
        }
        stage('running go calculator') {
            sh 'go run microservice.go &'
        }
	stage('running stress test') {
            sh 'sbt gatling:test'
        }
}

