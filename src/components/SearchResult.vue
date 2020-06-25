<template>
    <v-card
            max-width="400"
            class="mx-auto"
    >
        <h1 class="ed-title">'{{$store.state.searchKeyword}}' Search Result</h1>

        <div>
                <h1 class="ed-title">No Result.</h1>
        </div>
    </v-card>
</template>

<script>
    export default {
        name: "SearchResult",
    }
</script>

<style scoped>
    .ed-title{
        color: #707070;
        margin-left: 5%;
    }
</style>