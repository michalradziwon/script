
  package gen;
  public class N_Gen165 {
  		@com.google.inject.Inject
  		public N_Gen165(N_Gen166 n_gen166){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen166 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  