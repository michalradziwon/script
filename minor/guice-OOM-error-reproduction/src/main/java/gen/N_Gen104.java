
  package gen;
  public class N_Gen104 {
  		@com.google.inject.Inject
  		public N_Gen104(N_Gen105 n_gen105){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen105 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  