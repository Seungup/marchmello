<template>
  <v-app>
    <!-- App bar-->
    <bar/>

    <!-- Search Bar -->
    <Search/>

    <!-- Condition bar -->
    <transition>
      <div v-if="this.$store.state.docState === 'default'" class="btn-margin">
        <default-menu />
      </div>
      <div v-if="this.$store.state.docState === 'login'" class="btn-margin">
        <login />
      </div>
      <div v-if="this.$store.state.docState === 'singin'" class="btn-margin">
        <JoinMember />
      </div>
      <div v-if="this.$store.state.docState === 'logined'" class="btn-margin">
        <Logined />
      </div>
      <div v-if="this.$store.state.docState === 'add'" class="btn-margin">
        <AddThread/>
      </div>
    </transition>

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
  import Bar from "./components/Bar";
  import JoinMember from "./components/JoinMember";
  import Logined from "./components/Logined";
  import AddThread from "./components/AddThread";

export default {
  name: 'App',
  components: {
    AddThread,
    Logined,
    JoinMember,
    Bar,
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