package screen

class ShoppingCategory {

    fun showCategories() {
        val categories: Array<String> = arrayOf("패션", "전자기기", "반려동물용품")
        for (category in categories) println(category)
        println("=> 장바구니로 이동하시려면 #을 입력해주세요")

        var selectedCategory = readlnOrNull()
        while (selectedCategory.isNullOrBlank()) {
            println("값을 입력해주세요.")
            selectedCategory = readlnOrNull()
        }

        if (selectedCategory == "#") {
            // TODO 1. 장바구니 이동
        } else {
            if (categories.contains(selectedCategory)) {
                val shoppingProductList = ShoppingProductList()
                shoppingProductList.showProducts(selectedCategory)
            } else {
                showErrorMessage(selectedCategory)
            }
        }
    }

    private fun showErrorMessage(selectedCategory: String?) {
        println("[$selectedCategory]: 존재하지 않는 카테고리입니다. 다시 입력해주세요.")
        showCategories()
    }
}