
  package gen;
  public class X_Gen124 {
  		@com.google.inject.Inject
  		public X_Gen124(X_Gen125 x_gen125){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen125 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  