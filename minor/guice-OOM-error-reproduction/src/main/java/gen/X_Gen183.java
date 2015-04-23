
  package gen;
  public class X_Gen183 {
  		@com.google.inject.Inject
  		public X_Gen183(X_Gen184 x_gen184){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen184 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  