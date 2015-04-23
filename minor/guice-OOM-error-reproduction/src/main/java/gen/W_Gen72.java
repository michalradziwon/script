
  package gen;
  public class W_Gen72 {
  		@com.google.inject.Inject
  		public W_Gen72(W_Gen73 w_gen73){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen73 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  