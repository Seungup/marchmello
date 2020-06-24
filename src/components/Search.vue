<template>
    <div class="default-margin">
        <v-card-actions class="align-center">
            <v-text-field class="text-center" solo rounded dense clearable placeholder="Search Threads"
                          @keyup.enter="searching"
            />
        </v-card-actions>
    </div>
</template>

<script>
    export default {
        name: "Search"
    }
</script>

<style scoped>
.default-margin{
    margin-left: 24px;
    margin-right: 24px;
}
</style>