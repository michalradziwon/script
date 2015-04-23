
  package gen;
  public class X_Gen32 {
  		@com.google.inject.Inject
  		public X_Gen32(X_Gen33 x_gen33){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen33 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  