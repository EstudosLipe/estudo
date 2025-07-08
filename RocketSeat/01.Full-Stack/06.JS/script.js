function taskRun(taskName, callBack){
    console.log(`Executando a tarefa ${taskName}`)

    callBack("Tarefa finalizada")
}

function taskFinished(status){
    console.log(status)
}

taskRun("comer", taskFinished)