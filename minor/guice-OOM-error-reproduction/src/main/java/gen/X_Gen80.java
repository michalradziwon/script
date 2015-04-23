
  package gen;
  public class X_Gen80 {
  		@com.google.inject.Inject
  		public X_Gen80(X_Gen81 x_gen81){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen81 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  