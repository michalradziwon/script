
  package gen;
  public class X_Gen140 {
  		@com.google.inject.Inject
  		public X_Gen140(X_Gen141 x_gen141){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen141 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  