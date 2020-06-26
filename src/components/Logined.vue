<template>
    <div class="default-margin">
        <h1 class="ed-title">My Profile</h1>
        <v-card-actions>
            <v-btn style="margin-right: 25px" color="#b4dfea" x-large width="180" height="84" rounded
                   v-on:click="$store.commit('setDocState', 'default')">Logout</v-btn>
            <v-btn color="#b4dfea" x-large width="50" height="84" rounded
                   v-on:click="$store.commit('setDocState', 'add')">Add</v-btn>
        </v-card-actions>
        <div class="ma-4">
        </div>
    </div>
</template>

<script>
    export default {
        name: "Logined"
    }
</script>

<style scoped>
.ed-title{
    color: #707070;
    margin-left: 5%;
}
.default-margin{
    margin-left: 24px;
    margin-right: 24px;
}
</style>