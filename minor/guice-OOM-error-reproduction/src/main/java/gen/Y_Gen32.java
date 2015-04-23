
  package gen;
  public class Y_Gen32 {
  		@com.google.inject.Inject
  		public Y_Gen32(Y_Gen33 y_gen33){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen33 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  