
  package gen;
  public class X_Gen47 {
  		@com.google.inject.Inject
  		public X_Gen47(X_Gen48 x_gen48){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen48 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  