
  package gen;
  public class X_Gen42 {
  		@com.google.inject.Inject
  		public X_Gen42(X_Gen43 x_gen43){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen43 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  