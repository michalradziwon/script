
  package gen;
  public class W_Gen73 {
  		@com.google.inject.Inject
  		public W_Gen73(W_Gen74 w_gen74){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen74 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  