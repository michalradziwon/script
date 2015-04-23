
  package gen;
  public class X_Gen10 {
  		@com.google.inject.Inject
  		public X_Gen10(X_Gen11 x_gen11){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen11 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  