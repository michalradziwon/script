
  package gen;
  public class X_Gen1 {
  		@com.google.inject.Inject
  		public X_Gen1(X_Gen2 x_gen2){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen2 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  