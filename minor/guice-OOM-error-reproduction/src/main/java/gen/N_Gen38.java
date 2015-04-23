
  package gen;
  public class N_Gen38 {
  		@com.google.inject.Inject
  		public N_Gen38(N_Gen39 n_gen39){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen39 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  