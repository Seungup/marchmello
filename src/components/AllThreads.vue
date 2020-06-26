<template>
    <div class="default-margin">
        {{$store.commit('getThrads')}}
        <h1 class="ed-title">All Threads</h1>
        <transition>
            <div v-if="$store.state.items[0]._embedded.threads.length > 0">
                <v-container>
                    <v-row dense>
                <v-col
                        v-for="(item, i) in $store.state.items[0]._embedded.threads"
                        :key="i"
                        cols="12"
                >
                    <v-card
                            color="#DBEDDE"
                            dark
                            rounded

                    >
                        <div class="d-flex flex-no-wrap justify-space-between">
                            <div>

                                <transition>
                                    <v-card-title
                                            v-if="item.title.length > 15"
                                            class="headline"
                                            v-text="item.title.substring(0, 15) + '...'"
                                            style="color: #707070"
                                    ></v-card-title>

                                    <v-card-title
                                            v-if="item.title.length < 15"
                                            class="headline"
                                            v-text="item.title"
                                            style="color: #707070"
                                    ></v-card-title>
                                </transition>


                                <div >

                                </div>
                                <transition>
                                    <v-card-subtitle v-if="item.description.length > 25" v-text="item.description.substring(0, 25) + '...'" style="color: #707070"></v-card-subtitle>
                                    <v-card-subtitle v-if="item.description.length < 25" v-text="item.description" style="color: #707070"></v-card-subtitle>
                                </transition>


                            </div>

                            <v-card-actions>
                                <v-btn text color="#FFC980">Visit Now</v-btn>
                            </v-card-actions>

                        </div>
                    </v-card>
                </v-col>
                    </v-row>
                </v-container>
            </div>
            <div v-else>
                <v-container>
                    <v-row dense>
                        <h1 style="color: #707070;">Sorry..</h1>
                        <h2 style="color: #707070"> Can't find any thread &#128549; </h2>
                    </v-row>
                </v-container>
            </div>
        </transition>
    </div>
</template>

<script>
    export default {
        name: "AllThreads"
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