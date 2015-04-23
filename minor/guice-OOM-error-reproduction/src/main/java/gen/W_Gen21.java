
  package gen;
  public class W_Gen21 {
  		@com.google.inject.Inject
  		public W_Gen21(W_Gen22 w_gen22){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen22 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  