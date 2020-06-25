<template>
    <div>
        <h1 class="ed-title">Join</h1>
        <v-card
                width="324"
                height="354"
                color="#b4dfea"
                class="mx-auto mt-5 rounded-xl"
        >
            <v-card-text>
                <v-form>
                    <!-- ID -->
                    <v-text-field solo rounded dense placeholder="ID" />

                    <!-- PW -->
                    <v-text-field
                            placeholder="Password"
                            solo
                            rounded
                            dense
                            :type="value ? 'password' : 'text'"
                            v-model="password"
                    >

                    </v-text-field>


                    <!-- Re PW -->
                    <transition>
                        <v-text-field
                                v-if="password !== repass"
                                placeholder="Check Password"
                                solo
                                rounded
                                dense
                                error-messages="Not Mathced"
                                v-model="repass"
                                :type="value ? 'password' : 'text'"
                        />
                        <v-text-field
                                v-if="password === repass"
                                placeholder="Check Password"
                                solo
                                rounded
                                dense
                                v-model="repass"
                                :type="value ? 'password' : 'text'"
                        />
                    </transition>



                    <!-- Email -->
                    <v-text-field solo rounded dense placeholder="Email" />


                </v-form>

            </v-card-text>
            <v-card-actions>
                <v-btn color="#ffc980" width="100" class="rounded-card login-btn-1" rounded
                       v-on:click="$store.commit('setDocState', 'default')">Enter</v-btn>

                <v-spacer></v-spacer>
                <v-btn color="#ffc980" class="rounded-card login-btn-2" rounded
                       v-on:click="$store.commit('setDocState', 'default')">Cancle</v-btn>
            </v-card-actions>
        </v-card>
        <div class="ma-4">
            <v-divider></v-divider>
        </div>
    </div>
</template>

<script>
    export default {
        name: "JoinMember",
        data() {
            return {
                value: String,
                password: "",
                repass: "",
            }
        }
    }
</script>

<style scoped>
.ed-title{
    color: #707070;
    margin-left: 5%;
}
</style>