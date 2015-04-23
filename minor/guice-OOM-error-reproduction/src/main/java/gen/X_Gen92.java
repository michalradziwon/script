
  package gen;
  public class X_Gen92 {
  		@com.google.inject.Inject
  		public X_Gen92(X_Gen93 x_gen93){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen93 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  