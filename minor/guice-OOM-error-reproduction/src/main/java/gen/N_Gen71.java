
  package gen;
  public class N_Gen71 {
  		@com.google.inject.Inject
  		public N_Gen71(N_Gen72 n_gen72){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen72 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  