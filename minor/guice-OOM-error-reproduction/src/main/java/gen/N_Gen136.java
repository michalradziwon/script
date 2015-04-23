
  package gen;
  public class N_Gen136 {
  		@com.google.inject.Inject
  		public N_Gen136(N_Gen137 n_gen137){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen137 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  