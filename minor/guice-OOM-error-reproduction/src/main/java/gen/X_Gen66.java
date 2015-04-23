
  package gen;
  public class X_Gen66 {
  		@com.google.inject.Inject
  		public X_Gen66(X_Gen67 x_gen67){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen67 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  