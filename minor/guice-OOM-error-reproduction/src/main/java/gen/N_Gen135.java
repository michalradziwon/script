
  package gen;
  public class N_Gen135 {
  		@com.google.inject.Inject
  		public N_Gen135(N_Gen136 n_gen136){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen136 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  