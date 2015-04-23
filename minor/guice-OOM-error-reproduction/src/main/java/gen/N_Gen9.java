
  package gen;
  public class N_Gen9 {
  		@com.google.inject.Inject
  		public N_Gen9(N_Gen10 n_gen10){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen10 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  