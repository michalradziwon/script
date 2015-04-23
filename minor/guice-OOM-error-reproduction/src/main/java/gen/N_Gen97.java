
  package gen;
  public class N_Gen97 {
  		@com.google.inject.Inject
  		public N_Gen97(N_Gen98 n_gen98){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen98 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  