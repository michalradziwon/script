
  package gen;
  public class N_Gen90 {
  		@com.google.inject.Inject
  		public N_Gen90(N_Gen91 n_gen91){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen91 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  