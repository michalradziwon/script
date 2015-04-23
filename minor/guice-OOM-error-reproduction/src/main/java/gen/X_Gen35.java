
  package gen;
  public class X_Gen35 {
  		@com.google.inject.Inject
  		public X_Gen35(X_Gen36 x_gen36){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen36 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  