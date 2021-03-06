object AppModule {
    const val domain = ":domain"

    val core = Core
    object Core {
        private const val path = ":core"

        const val ui = "$path:ui"
        const val network = "$path:network"
        const val network_contract = "$path:network_contract"
        const val database = "$path:database"
        const val database_contract = "$path:database_contract"
        const val navigation_contract = "$path:navigation_contract"
    }

    object Component {
        private const val path = ":component"

        const val preferences = "$path:preferences"
        const val preferences_contract = "$path:preferences_contract"
    }

    object Feature {
        private const val path = ":feature"

        const val splash = "$path:splash"
        const val main = "$path:main"
        const val home = "$path:home"
        const val home_contract = "$path:home_contract"
        const val latest_deals = "$path:latest_deals"
        const val latest_deals_contract = "$path:latest_deals_contract"
        const val latest_deals_games = "$path:latest_deals_games"
        const val latest_deals_games_contract = "$path:latest_deals_games_contract"
        const val latest_deals_products = "$path:latest_deals_products"
        const val latest_deals_products_contract = "$path:latest_deals_products_contract"
        const val saved_deals = "$path:saved_deals"
        const val saved_deals_contract = "$path:saved_deals_contract"
    }
}
