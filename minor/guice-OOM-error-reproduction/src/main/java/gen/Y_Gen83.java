
  package gen;
  public class Y_Gen83 {
  		@com.google.inject.Inject
  		public Y_Gen83(Y_Gen84 y_gen84){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen84 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  