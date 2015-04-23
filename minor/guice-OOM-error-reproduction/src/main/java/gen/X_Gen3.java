
  package gen;
  public class X_Gen3 {
  		@com.google.inject.Inject
  		public X_Gen3(X_Gen4 x_gen4){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen4 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  