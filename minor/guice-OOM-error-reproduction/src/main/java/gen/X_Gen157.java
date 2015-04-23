
  package gen;
  public class X_Gen157 {
  		@com.google.inject.Inject
  		public X_Gen157(X_Gen158 x_gen158){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen158 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  