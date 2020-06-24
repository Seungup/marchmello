<template>
    <v-app-bar
    color="white"
    elevate-on-scroll>
        <v-btn icon v-on:click="$store.commit('chageSearchState')">
            <v-icon>mdi-magnify</v-icon>
        </v-btn>
    </v-app-bar>

</template>

<script>
    export default {
        name: "Bar"
    }
</script>

<style scoped>

</style>