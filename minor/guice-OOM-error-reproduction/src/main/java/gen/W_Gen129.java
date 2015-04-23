
  package gen;
  public class W_Gen129 {
  		@com.google.inject.Inject
  		public W_Gen129(W_Gen130 w_gen130){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen130 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  