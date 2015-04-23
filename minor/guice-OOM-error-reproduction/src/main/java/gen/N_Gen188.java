
  package gen;
  public class N_Gen188 {
  		@com.google.inject.Inject
  		public N_Gen188(N_Gen189 n_gen189){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen189 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  