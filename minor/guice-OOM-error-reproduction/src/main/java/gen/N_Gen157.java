
  package gen;
  public class N_Gen157 {
  		@com.google.inject.Inject
  		public N_Gen157(N_Gen158 n_gen158){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen158 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  