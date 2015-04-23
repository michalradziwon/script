
  package gen;
  public class N_Gen17 {
  		@com.google.inject.Inject
  		public N_Gen17(N_Gen18 n_gen18){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen18 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  