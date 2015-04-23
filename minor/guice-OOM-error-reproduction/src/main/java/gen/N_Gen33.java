
  package gen;
  public class N_Gen33 {
  		@com.google.inject.Inject
  		public N_Gen33(N_Gen34 n_gen34){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + n_gen34 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  