
  package gen;
  public class X_Gen111 {
  		@com.google.inject.Inject
  		public X_Gen111(X_Gen112 x_gen112){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen112 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  