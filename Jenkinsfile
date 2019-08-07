node {
        stage('clean workspace') {
            cleanWs()
        }
        stage('git preparation') {
            git url: 'https://github.com/joaodartora/gatling-test.git'
        }
        stage('running go calculator') {
            sh 'go run microservice.go'
        }
	stage('running stress test') {
            sh 'sbt gatling:test'
        }
}

