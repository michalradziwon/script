
  package gen;
  public class N_Gen168 {
  		@com.google.inject.Inject
  		public N_Gen168(N_Gen169 n_gen169){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen169 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  