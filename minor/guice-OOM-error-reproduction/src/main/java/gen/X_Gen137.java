
  package gen;
  public class X_Gen137 {
  		@com.google.inject.Inject
  		public X_Gen137(X_Gen138 x_gen138){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen138 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  