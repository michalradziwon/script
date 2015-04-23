
  package gen;
  public class X_Gen79 {
  		@com.google.inject.Inject
  		public X_Gen79(X_Gen80 x_gen80){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen80 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  