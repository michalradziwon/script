
  package gen;
  public class N_Gen57 {
  		@com.google.inject.Inject
  		public N_Gen57(N_Gen58 n_gen58){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen58 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  