<template>
    <v-app>
        <h1 class="ed-title">Add Thread</h1>
        <v-card
                width="324"
                height="384"
                color="#b4dfea"
                class="mx-auto mt-5 rounded-xl"
        >
            <v-card-text>
                <v-form>
                        <!-- Title -->
                        <v-text-field solo rounded dense placeholder="Title"/>


                        <!-- Description -->
                        <v-textarea
                                solo
                                name="input-7-4"
                                placeholder="Description"
                                rounded
                                rows="7"
                        ></v-textarea>
                </v-form>
                <v-card-actions>
                    <v-btn color="#ffc980" width="100" class="rounded-card login-btn-1" rounded
                           v-on:click="$store.commit('setDocState', 'logined')">Cancle</v-btn>

                    <v-spacer></v-spacer>
                    <v-btn color="#ffc980" width="100" class="rounded-card login-btn-2" rounded
                           v-on:click="$store.commit('setDocState', 'logined')">Post</v-btn>
                </v-card-actions>
            </v-card-text>
        </v-card>
        <div class="ma-4">
            <v-divider></v-divider>
        </div>
    </v-app>
</template>

<script>
    export default {
        name: "AddThread"
    }
</script>

<style scoped>
    .ed-title{
        margin-left: 5%;
    }
</style>