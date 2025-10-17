// Generics - ele atribui o tipo da variavel no momento de declaração dela

function useState<T>() {
    let state: T

    function get() {
        return state
    }
    function set(newValue: T) {
        state = newValue
    }

    return {get, set}
}

let newState = useState<string>()
newState.set("Caralho")
newState.get()

let newState2 = useState<number>()
newState2.get()
newState2.set(100)