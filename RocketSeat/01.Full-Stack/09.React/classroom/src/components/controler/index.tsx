import styles from "./styles.module.css"

import { Button } from "../button";

export function Controller(){
    return(
        <div className={styles.container}>
            <Button text="Adicionar" />
            <span>0</span>
            <Button text="remover" />
        </div>
    )
}
