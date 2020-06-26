<template>
    <div class="default-margin">
    <v-card
            max-width="400"
            class="mx-auto"
    >
        <h1 class="ed-title">My Threads</h1>
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
                                            v-if="item.title.toString().length > 15"
                                            class="headline"
                                            v-text="item.title.toString().substring(0, 15) + '...'"
                                            style="color: #707070"
                                    ></v-card-title>

                                    <v-card-title
                                            v-if="item.title.toString().length < 15"
                                            class="headline"
                                            v-text="item.title"
                                            style="color: #707070"
                                    ></v-card-title>
                                </transition>


                                <div >

                                </div>
                                <transition>
                                    <v-card-subtitle v-if="item.description.toString().length > 40" v-text="item.description.toString().substring(0, 40) + '...'" style="color: #707070"></v-card-subtitle>
                                    <v-card-subtitle v-if="item.description.toString().length < 40" v-text="item.description" style="color: #707070"></v-card-subtitle>
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
    </v-card>
    </div>
</template>

<script>
    export default {

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