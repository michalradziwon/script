
  package gen;
  public class N_Gen191 {
  		@com.google.inject.Inject
  		public N_Gen191(N_Gen192 n_gen192){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen192 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  