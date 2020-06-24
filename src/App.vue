<template>
  <v-app>

    <!-- Search Bar -->
    <Search/>

    <!-- Condition bar -->
    <v-card-actions>
      <transition>
        <div v-if="this.$store.state.docState === 'default'" class="btn-margin">
          <default-menu />
        </div>
        <div v-if="this.$store.state.docState === 'login'" class="btn-margin">
          <login />
        </div>
      </transition>
    </v-card-actions>

    <!-- My Threads -->


    <!-- All Threads -->


    <!-- FOOTER -->
    <v-footer
            absolute
            class="font-weight-medium"
    >
      <v-col
              class="text-center"
              cols="12"
      >
        <h5>
          <strong>Copyrightⓒ{{ new Date().getFullYear() }} Seungup Noh All rights reserved.</strong>
        </h5>
      </v-col>
    </v-footer>
  </v-app>
</template>

<script>
  import Login from "./components/Login";
  import DefaultMenu from "./components/DefaultMenu";
  import Search from "./components/Search";

export default {
  name: 'App',
  components: {
    Search,
    DefaultMenu,
    Login
  },
  data: () => ({
    docState: 'default'
  }),


};
</script>

<style>
  .btn-margin{
    margin-right: auto;
    margin-left: auto;
  }
</style>