
  package gen;
  public class N_Gen190 {
  		@com.google.inject.Inject
  		public N_Gen190(N_Gen191 n_gen191){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen191 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  