
  package gen;
  public class X_Gen112 {
  		@com.google.inject.Inject
  		public X_Gen112(X_Gen113 x_gen113){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen113 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  