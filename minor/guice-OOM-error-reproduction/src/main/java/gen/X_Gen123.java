
  package gen;
  public class X_Gen123 {
  		@com.google.inject.Inject
  		public X_Gen123(X_Gen124 x_gen124){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen124 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  