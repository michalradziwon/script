
  package gen;
  public class W_Gen174 {
  		@com.google.inject.Inject
  		public W_Gen174(W_Gen175 w_gen175){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen175 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  