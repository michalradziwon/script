
  package gen;
  public class N_Gen8 {
  		@com.google.inject.Inject
  		public N_Gen8(N_Gen9 n_gen9){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen9 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  