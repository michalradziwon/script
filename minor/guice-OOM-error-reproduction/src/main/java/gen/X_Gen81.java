
  package gen;
  public class X_Gen81 {
  		@com.google.inject.Inject
  		public X_Gen81(X_Gen82 x_gen82){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen82 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  