// Serve como um modelo
interface IProduct {
    id: number,
    value: number,
    name: string,
    quantity: number,
    isPromotion: boolean
    promotion?: number
}

function newProduct(product: IProduct) {
    console.log(product.isPromotion)
}

newProduct({ id: 1, value: 500, name: "Product x", quantity: 10, isPromotion: false })
newProduct({ id: 2, value: 500 - 150, name: "Product y", quantity: 53, isPromotion: true, promotion: 150 })
newProduct({ id: 3, value: 20, name: "Product z", quantity: 10, isPromotion: false })
