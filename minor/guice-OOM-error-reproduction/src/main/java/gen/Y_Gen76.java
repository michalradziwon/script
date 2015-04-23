
  package gen;
  public class Y_Gen76 {
  		@com.google.inject.Inject
  		public Y_Gen76(Y_Gen77 y_gen77){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen77 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  