// Import CSSs
import styles from "./styles.module.css"

// Import componentes
import { Button } from "../button";
import { Logo } from "../logo";

export function Menu() {
    return (
        //Elemento Pai (Fateher)
        <div className={styles.menu} >

            <Logo />
            {/* Passamos uma function dentro de onClick */}
            <Button text="Clique Aqui" onClick={() => alert("Criado Chefe")} /> {/*Elemento Filho (Children)*/}
            <Button text="Editar Aqui" onClick={() => alert("Editado Chefe")} /> {/*Elemento Filho (Children)*/}
            <Button text="Remover Aqui" onClick={() => alert("Removido Chefe")} /> {/*Elemento Filho (Children)*/}
        </div>
    )
}