
properties([
        buildDiscarder(logRotator(numToKeepStr: '10')),
        disableConcurrentBuilds(),
        parameters([
                string(defaultValue: 'WEBSHOPS', description: 'Apache config to compare ( , sep)', name: 'ServerGroups'),
                string(defaultValue: 'master', description: '', name: 'BranchTagName'),
        ])
])

node {
    //checkout scm
    def file = load 'jobs/file.groovy'
    file.fct(BranchTagName)
}

//checkout scm //