
  package gen;
  public class W_Gen70 {
  		@com.google.inject.Inject
  		public W_Gen70(W_Gen71 w_gen71){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen71 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  