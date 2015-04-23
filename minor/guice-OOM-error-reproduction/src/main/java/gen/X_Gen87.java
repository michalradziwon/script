
  package gen;
  public class X_Gen87 {
  		@com.google.inject.Inject
  		public X_Gen87(X_Gen88 x_gen88){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen88 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  