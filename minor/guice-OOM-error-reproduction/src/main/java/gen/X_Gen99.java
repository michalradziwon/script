
  package gen;
  public class X_Gen99 {
  		@com.google.inject.Inject
  		public X_Gen99(X_Gen100 x_gen100){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen100 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  