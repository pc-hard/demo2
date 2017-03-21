scp /var/lib/jenkins/jobs/Demo/jobs/deploy/workspace/hello.py user@172.31.119.21:/var/www/demoapp
ssh -i /var/lib/jenkins/.ssh/id_rsa user@172.31.119.21 'sudo service uwsgi restart'
