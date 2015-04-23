
  package gen;
  public class X_Gen9 {
  		@com.google.inject.Inject
  		public X_Gen9(X_Gen10 x_gen10){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen10 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  