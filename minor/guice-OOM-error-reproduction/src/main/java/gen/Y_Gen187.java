
  package gen;
  public class Y_Gen187 {
  		@com.google.inject.Inject
  		public Y_Gen187(Y_Gen188 y_gen188){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen188 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  