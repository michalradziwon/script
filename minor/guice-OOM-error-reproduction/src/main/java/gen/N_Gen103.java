
  package gen;
  public class N_Gen103 {
  		@com.google.inject.Inject
  		public N_Gen103(N_Gen104 n_gen104){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen104 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  