
  package gen;
  public class W_Gen155 {
  		@com.google.inject.Inject
  		public W_Gen155(W_Gen156 w_gen156){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen156 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  