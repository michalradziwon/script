
  package gen;
  public class N_Gen195 {
  		@com.google.inject.Inject
  		public N_Gen195(N_Gen196 n_gen196){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen196 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  