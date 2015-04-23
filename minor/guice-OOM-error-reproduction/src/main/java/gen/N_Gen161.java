
  package gen;
  public class N_Gen161 {
  		@com.google.inject.Inject
  		public N_Gen161(N_Gen162 n_gen162){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen162 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  