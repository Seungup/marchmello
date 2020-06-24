<template>
    <v-app>
        <h1>Login</h1>
        <v-card
                width="324"
                height="272"
                color="#b4dfea"
                class="mx-auto mt-5 rounded-xl"
        >
            <v-card-text>
                <v-form>
                    <v-text-field solo rounded dense placeholder="ID" />
                    <v-text-field
                            placeholder="PW"
                            solo
                            rounded
                            dense
                    />
                </v-form>
                <v-col>
                    <v-row justify="center">
                        <a
                                href="https://community.vuetifyjs.com"
                                target="_blank"
                                class="find-my-account"
                        >I lost my ID or Password</a>
                    </v-row>
                </v-col>
            </v-card-text>
            <v-card-actions>
                <v-btn color="#ffc980" width="100" class="rounded-card login-btn-1"
                       v-on:click="$store.commit('setDocState', 'enter')">Enter</v-btn>
                <v-spacer></v-spacer>
                <v-btn color="#ffc980" class="rounded-card login-btn-2"
                       v-on:click="$store.commit('setDocState', 'default')">Cancle</v-btn>
            </v-card-actions>
        </v-card>
        <div class="ma-4">
            <v-divider></v-divider>
        </div>
    </v-app>
</template>

<style scoped>
    .find-my-account {
        margin: auto;
    }
    .rounded-card {
        border-radius: 50px;
        color: #b4dfea;
    }
    .login-btn-1 {
        width: 94px;
        height: 31px;
        text-align: center;
    }
    .login-btn-2 {
        width: 94px;
        height: 31px;
        text-align: center;
    }
</style>

<script>
    export default {
        name: "login"
    }
</script>