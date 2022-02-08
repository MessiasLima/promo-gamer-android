object Module {
    const val domain = ":domain"

    object Core {
        private const val path = ":core"

        const val ui = "$path:ui"
        const val network = "$path:network"
        const val network_contract = "$path:network_contract"
        const val database = "$path:database"
        const val database_contract = "$path:database_contract"
    }

    object Feature {
        private const val path = ":feature"

        const val splash = "$path:splash"
    }
}
