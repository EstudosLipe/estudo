// Import de CSSs
import "./global.css" // CSS de reset
import styles from "./app.module.css" // CSS principal

// Import de componentes
// import { Menu } from "./components/menu"
import {Controller} from "./components/controler/";

// Nome do arquivo, nome do componente
export function App() {
    return (
        <div className={styles.container}>
            {/* <Menu /> */}
            <Controller />
        </div>
    )
}