
  package gen;
  public class N_Gen42 {
  		@com.google.inject.Inject
  		public N_Gen42(N_Gen43 n_gen43){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen43 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  