
  package gen;
  public class W_Gen97 {
  		@com.google.inject.Inject
  		public W_Gen97(W_Gen98 w_gen98){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen98 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  