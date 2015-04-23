
  package gen;
  public class X_Gen8 {
  		@com.google.inject.Inject
  		public X_Gen8(X_Gen9 x_gen9){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen9 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  