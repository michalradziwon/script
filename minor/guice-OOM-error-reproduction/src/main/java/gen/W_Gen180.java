
  package gen;
  public class W_Gen180 {
  		@com.google.inject.Inject
  		public W_Gen180(W_Gen181 w_gen181){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen181 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  