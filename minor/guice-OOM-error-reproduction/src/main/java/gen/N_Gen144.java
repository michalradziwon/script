
  package gen;
  public class N_Gen144 {
  		@com.google.inject.Inject
  		public N_Gen144(N_Gen145 n_gen145){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen145 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  