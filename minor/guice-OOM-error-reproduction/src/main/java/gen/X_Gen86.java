
  package gen;
  public class X_Gen86 {
  		@com.google.inject.Inject
  		public X_Gen86(X_Gen87 x_gen87){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen87 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  