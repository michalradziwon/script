
  package gen;
  public class X_Gen118 {
  		@com.google.inject.Inject
  		public X_Gen118(X_Gen119 x_gen119){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen119 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  