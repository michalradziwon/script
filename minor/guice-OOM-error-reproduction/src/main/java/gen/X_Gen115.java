
  package gen;
  public class X_Gen115 {
  		@com.google.inject.Inject
  		public X_Gen115(X_Gen116 x_gen116){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen116 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  