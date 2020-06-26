<template>
    <div class="default-margin" id="search">
        <v-card-actions class="align-center">
            <v-text-field class="text-center" solo rounded dense clearable placeholder="Search Threads" v-model="text"
                          v-on:keyup.enter="$store.commit('setSearchKeyword', text)"
            />
            <div v-if="text == ''"> {{$store.commit('setSearchKeywordNull')}} </div>

        </v-card-actions>
    </div>
</template>

<script>
    export default {
        name: "Search",
        data: function () {
            return {
                text: ''
            }
        }
    }
</script>

<style scoped>
.default-margin{
    margin-left: 24px;
    margin-right: 24px;
}
</style>