
  package gen;
  public class X_Gen33 {
  		@com.google.inject.Inject
  		public X_Gen33(X_Gen34 x_gen34){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen34 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  