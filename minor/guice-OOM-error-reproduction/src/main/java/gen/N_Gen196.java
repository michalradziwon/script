
  package gen;
  public class N_Gen196 {
  		@com.google.inject.Inject
  		public N_Gen196(N_Gen197 n_gen197){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen197 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  