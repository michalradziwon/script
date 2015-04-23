
  package gen;
  public class X_Gen52 {
  		@com.google.inject.Inject
  		public X_Gen52(X_Gen53 x_gen53){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen53 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  