
  package gen;
  public class W_Gen33 {
  		@com.google.inject.Inject
  		public W_Gen33(W_Gen34 w_gen34){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen34 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  