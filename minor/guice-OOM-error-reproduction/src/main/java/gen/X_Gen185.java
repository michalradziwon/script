
  package gen;
  public class X_Gen185 {
  		@com.google.inject.Inject
  		public X_Gen185(X_Gen186 x_gen186){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen186 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  