
  package gen;
  public class X_Gen17 {
  		@com.google.inject.Inject
  		public X_Gen17(X_Gen18 x_gen18){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen18 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  