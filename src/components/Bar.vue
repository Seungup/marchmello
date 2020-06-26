<template>
    <div>
    <v-btn icon v-on:click="$store.commit('chageSearchState')">
        <v-icon>mdi-magnify</v-icon>
    </v-btn>

    <v-btn icon v-on:click="getData">
        <v-icon>mdi-refresh</v-icon>
    </v-btn>
    </div>
</template>

<script>
    export default {
        name: "Bar",
        methods: {
            getData: function () {
                this.$http.get(
                    this.$store.state.baseUrl + 'threads/'
                ).then( (response) => {
                    console.log("data =", response.data);
                    this.$store.commit('setThreads', response.data);
                }).catch(function (error) {
                    console.log(error);
                })
            },
        }
    }
</script>

<style scoped>

</style>