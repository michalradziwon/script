
  package gen;
  public class X_Gen63 {
  		@com.google.inject.Inject
  		public X_Gen63(X_Gen64 x_gen64){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen64 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  