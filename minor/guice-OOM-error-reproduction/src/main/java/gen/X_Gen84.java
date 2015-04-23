
  package gen;
  public class X_Gen84 {
  		@com.google.inject.Inject
  		public X_Gen84(X_Gen85 x_gen85){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen85 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  