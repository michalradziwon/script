
  package gen;
  public class W_Gen179 {
  		@com.google.inject.Inject
  		public W_Gen179(W_Gen180 w_gen180){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen180 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  