
  package gen;
  public class N_Gen101 {
  		@com.google.inject.Inject
  		public N_Gen101(N_Gen102 n_gen102){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen102 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  