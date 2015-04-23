
  package gen;
  public class X_Gen2 {
  		@com.google.inject.Inject
  		public X_Gen2(X_Gen3 x_gen3){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen3 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  