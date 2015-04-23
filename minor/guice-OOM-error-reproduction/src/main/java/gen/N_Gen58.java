
  package gen;
  public class N_Gen58 {
  		@com.google.inject.Inject
  		public N_Gen58(N_Gen59 n_gen59){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen59 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  