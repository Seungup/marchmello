<template>
    <div id="app">
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
                        <v-text-field solo rounded dense placeholder="Title" v-model="title"/>


                        <!-- Description -->
                        <v-textarea
                                solo
                                name="input-7-4"
                                placeholder="Description"
                                rounded
                                rows="7"
                                v-model="description"
                        ></v-textarea>
                </v-form>
                <v-card-actions>
                    <v-btn color="#ffc980" width="100" class="rounded-card login-btn-1" rounded
                           v-on:click="$store.commit('setDocState', 'logined')">Cancle</v-btn>

                    <v-spacer></v-spacer>

                    <v-btn color="#ffc980" width="100" class="rounded-card login-btn-2" rounded
                           v-on:click="
                           $store.commit('setTitle', title);
                           $store.commit('setDescription', description);
                           $store.commit('setDocState', 'logined');
                           fetchData();
                           ">Post</v-btn>
                </v-card-actions>
            </v-card-text>
        </v-card>
        <div />
    </div>
</template>

<script>
    export default {
        name: "AddThread",
        data() {
            return{
                title: '',
                description: ''
            }
        },
        methods: {
            // post하고 get을 바로하는게 아니라,
            fetchData: function() {
                this.$http.post(
                    this.$store.state.baseUrl + 'threads/',

                    {
                        title : this.$store.state.title,
                        description : this.$store.state.description
                    }
                    )
                    .catch(function(error) {
                        console.log(error);
                    }).then(this.$store.commit('addThread', {})); // <- 여기 나중에 수정
            },
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
    .ed-title{
        color: #707070;
        margin-left: 5%;
    }
</style>