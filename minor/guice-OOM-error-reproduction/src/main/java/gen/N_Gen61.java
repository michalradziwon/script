
  package gen;
  public class N_Gen61 {
  		@com.google.inject.Inject
  		public N_Gen61(N_Gen62 n_gen62){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen62 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  