
  package gen;
  public class N_Gen73 {
  		@com.google.inject.Inject
  		public N_Gen73(N_Gen74 n_gen74){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen74 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  