
  package gen;
  public class X_Gen101 {
  		@com.google.inject.Inject
  		public X_Gen101(X_Gen102 x_gen102){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen102 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  