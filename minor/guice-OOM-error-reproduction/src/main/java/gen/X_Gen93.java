
  package gen;
  public class X_Gen93 {
  		@com.google.inject.Inject
  		public X_Gen93(X_Gen94 x_gen94){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen94 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  