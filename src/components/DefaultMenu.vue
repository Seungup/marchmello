<template>
    <v-app>
        <h1>My Threads</h1>
        <v-card-actions>
            <v-btn style="margin-right: 50px" color="#b4dfea" x-large width="180" height="84" rounded
                   v-on:click="$store.commit('setDocState', 'login')">Login</v-btn>
            <v-btn color="#b4dfea" x-large width="50" height="84" rounded
                   v-on:click="$store.commit('setDocState', 'singin')">Sing in</v-btn>
        </v-card-actions>
        <div class="ma-4">
            <v-divider></v-divider>
        </div>
    </v-app>
</template>

<script>
    export default {
        name: "DefaultMenu",
    }
</script>

<style scoped>

</style>