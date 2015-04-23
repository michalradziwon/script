
  package gen;
  public class X_Gen188 {
  		@com.google.inject.Inject
  		public X_Gen188(X_Gen189 x_gen189){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen189 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  