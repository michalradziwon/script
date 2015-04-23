
  package gen;
  public class W_Gen192 {
  		@com.google.inject.Inject
  		public W_Gen192(W_Gen193 w_gen193){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen193 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  