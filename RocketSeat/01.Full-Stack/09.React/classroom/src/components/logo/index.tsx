import styles from "./styles.module.css"

interface props extends React.ComponentProps<"img">{

}

export function Logo(){
    return <img src="/src/assets/logo.ico" alt="logo" className={styles.logo}/>
}