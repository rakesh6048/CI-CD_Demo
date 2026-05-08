pipeline
{
   agent any 
   stages
   {
        stage('Build App')
       {
            steps
           {
            echo 'Build App'
            }
        }
        stage('Test')
       {
             steps
            {
             echo 'Test App'
            }
       }
        stage('Deploy')
       {
              steps
             {
               echo 'Deploy App'
             }
        }
    }
     post
     {
         always
         {
               emailext body: 'Summary', subject: 'Pipeline Status', to: 'rakesh.s6048@gmail.com'
          }
     } 
}
