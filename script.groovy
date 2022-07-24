def buildApp() {
    echo 'building the application..'
    echo "build version is ${params.VERSION}"
}

def testApp() {
    echo 'testing the application..'
}

def deployApp() {
	echo 'deploying the application..'
    echo "deploying version ${params.VERSION}"
}

return this
