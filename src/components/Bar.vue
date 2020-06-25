<template>
    <div>
    <v-btn icon v-on:click="$store.commit('chageSearchState')">
        <v-icon>mdi-magnify</v-icon>
    </v-btn>

    </div>
</template>

<script>
    export default {
        name: "Bar"
    }
</script>

<style scoped>

</style>