import styles from "./styles.module.css"

// Passamos os tipos de cada propriedade utilizada no component
interface Props extends React.ComponentProps<"button"> {
    text: string

    // Function, definimos somente o tipo do retorno
    // onClick?: () => void
}

export function Button({ text, ...rest }: Props) {
    return <button className={styles.button}><span>{text}</span></button>
}